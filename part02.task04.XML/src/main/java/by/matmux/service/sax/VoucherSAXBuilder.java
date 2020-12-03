package by.matmux.service.sax;

import java.io.IOException;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import by.matmux.bean.Voucher;
import by.matmux.service.AbstractVouchersBuilder;

public class VoucherSAXBuilder extends AbstractVouchersBuilder {
	private static final Logger log = LogManager.getLogger(VoucherSAXBuilder.class);
	private Set<Voucher> voucher;
	private VoucherHandler vh;
	private XMLReader reader;

	public VoucherSAXBuilder() {
		vh = new VoucherHandler();
		try {
			reader = XMLReaderFactory.createXMLReader();
			reader.setContentHandler(vh);
		} catch (SAXException e) {
	 		log.debug("ошибка SAX парсера");
		}
	}

	@Override
	public void buildSetVouchers(String fileName) {
		try {
			reader.parse(fileName);
		} catch (SAXException e) {
			log.debug("ошибка SAX парсера");
		} catch (IOException e) {
			log.debug("ошибка I/О потока");
		}

		voucher = vh.getVouchers();
	}
}
