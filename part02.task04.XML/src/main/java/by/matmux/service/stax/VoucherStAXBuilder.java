package by.matmux.service.stax;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.matmux.bean.Countries;
import by.matmux.bean.Train;
import by.matmux.bean.Voucher;
import by.matmux.bean.VoucherEnum;
import by.matmux.service.AbstractVouchersBuilder;
import by.matmux.service.sax.VoucherHandler;

public class VoucherStAXBuilder extends AbstractVouchersBuilder {
	private static final Logger log = LogManager.getLogger(VoucherStAXBuilder.class);
	private HashSet<Voucher> vouchers = new HashSet<>();
	private XMLInputFactory inputFactory;

	public VoucherStAXBuilder() {
		inputFactory = XMLInputFactory.newInstance();
	}

	public Set<Voucher> getVouchers() {
		return vouchers;
	}

	public void buildSetVouchers(String fileName) {
		FileInputStream inputStream = null;
		XMLStreamReader reader = null;
		String name;
		try {
			inputStream = new FileInputStream(new File(fileName));
			reader = inputFactory.createXMLStreamReader(inputStream);
			while (reader.hasNext()) {
			int type = reader.next();
				if (type == XMLStreamConstants.START_ELEMENT) {
					name = reader.getLocalName();
					if (VoucherEnum.valueOf(name.toUpperCase()) == VoucherEnum.TOURISTVOUCHER) {
						Voucher st = buildVoucher(reader);
						vouchers.add(st);
					}
				}
			}
		} catch (XMLStreamException ex) {
			log.debug("StAX parsing error!");
		} catch (FileNotFoundException ex) {
			log.debug("File " + fileName + " not found! ");
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				log.debug("Impossible close file " + fileName);
			}
		}
	}

	private Voucher buildVoucher(XMLStreamReader reader) throws XMLStreamException {
		Voucher vch = new Voucher();
		vch.setName(reader.getAttributeValue(null, VoucherEnum.NAME.getValue()));
		if (reader.getAttributeValue(null, VoucherEnum.COUNTRY.getValue()) != null) {
			Countries countries = Countries.valueOf(reader.getAttributeValue(null, VoucherEnum.COUNTRY.getValue()));
			vch.setCountry(countries);
		}
		
		String name;
		while (reader.hasNext()) {
			int type = reader.next();
			switch (type) {
			case XMLStreamConstants.START_ELEMENT:
				name = reader.getLocalName();
				switch (VoucherEnum.valueOf(name.toUpperCase())) {
				case DATE:
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
					try {
						vch.setDate(format.parse(getXMLText(reader)));
					} catch (ParseException e) {
						log.debug("Error when entering data");
					}
					break;
				case DAYS:
					name = getXMLText(reader);
					vch.setDays(Integer.parseInt(name));
					break;
				case COST:
					name = getXMLText(reader);
					vch.setCost(Integer.parseInt(name));
					break;
				case AIRPLANE:
					vch.setTransport(AirplaneGetXML.getXMLTransport(reader));
					break;
				case TRAIN:
					vch.setTransport(TrainGetXML.getXMLTransport(reader));
					break;
				case HOTEL:
					vch.setHotel(HotelGetXML.getXMLHotel(reader));
					break;
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				name = reader.getLocalName();
				if (VoucherEnum.valueOf(name.toUpperCase()) == VoucherEnum.TOURISTVOUCHER) {
				return vch;
				}
				break;
			}
		}
		throw new XMLStreamException("Unknown element in tag Voucher");
	}
	private String getXMLText(XMLStreamReader reader) throws XMLStreamException {
		String text = null;
		if (reader.hasNext()) {
			reader.next();
			text = reader.getText();
		}
		return text;
	}
}
