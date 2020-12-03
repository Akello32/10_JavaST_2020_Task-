package by.matmux.service;

import by.matmux.bean.Airplane;
import by.matmux.bean.Countries;
import by.matmux.bean.Hotel;
import by.matmux.bean.Room;
import by.matmux.bean.Train;
import by.matmux.bean.Voucher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class VoucherDOMParser extends AbstractVouchersBuilder{
	private static final Logger log = LogManager.getLogger(VoucherDOMParser.class);
	private Set<Voucher> vouchers;
	private DocumentBuilder docBuilder;

	public VoucherDOMParser() {
		this.vouchers = new HashSet<>();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			docBuilder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			log.debug("Ошибка конфигурации парсера:");
		}
	}

	public void buildSetVouchers(String fileName) {
		Document doc = null;
		try {
			doc = docBuilder.parse(fileName);
			Element root = doc.getDocumentElement();
			NodeList vouchersList = root.getElementsByTagName("touristVoucher");
			for (int i = 0; i < vouchersList.getLength(); i++) {
				Element voucherElement = (Element) vouchersList.item(i);
				Voucher voucher = buildVoucher(voucherElement);
				vouchers.add(voucher);
			}
		} catch (IOException e) {
			log.debug("File error or I/O error: ");
		} catch (SAXException e) {
			log.debug("Parsing failure: ");
		}
	}

	private Voucher buildVoucher(Element voucherElement) {
		Voucher voucher = new Voucher();
		voucher.setCountry(Countries.valueOf(voucherElement.getAttribute("country")));
		voucher.setName(voucherElement.getAttribute("nameVoucher"));
		voucher.setDays(Integer.parseInt(getElementTextContent(voucherElement, "days")));
		voucher.setCost(Integer.parseInt(getElementTextContent(voucherElement, "cost")));
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
		try {
			voucher.setDate(format.parse(getElementTextContent(voucherElement, "date")));
		} catch (ParseException e) {
			log.debug("Error when entering data");
		}

		Airplane airplane = new Airplane();
		Element airplaneElement = (Element) voucherElement.getElementsByTagName("airplane").item(0);
		if (airplaneElement != null) {
			airplane.setAirlines(getElementTextContent(airplaneElement, "airlines"));
			airplane.setBrand(getElementTextContent(airplaneElement, "brand"));
			airplane.setSeat(Integer.parseInt(getElementTextContent(airplaneElement, "seat")));
			airplane.setYearOfManufacture(Integer.parseInt(getElementTextContent(airplaneElement, "yearOfManufacture")));
			voucher.setTransport(airplane);
		}

		Train train = new Train();
		Element trainElement = (Element) voucherElement.getElementsByTagName("train").item(0);
		if (trainElement != null) {
			train.setRailwayCar(trainElement.getAttribute("railwayCar"));
			train.setBrand(getElementTextContent(trainElement, "brand"));
			train.setYearOfManufacture(Integer.parseInt(getElementTextContent(trainElement, "yearOfManufacture")));
			voucher.setTransport(train);
		}

		Hotel hotel = new Hotel();
		Element hotelElement = (Element) voucherElement.getElementsByTagName("hotel").item(0);
		hotel.setRating(Integer.parseInt(getElementTextContent(hotelElement, "rating")));
		hotel.setMeals(getElementTextContent(hotelElement, "meals"));

		Room room = new Room();
		Element roomElement = (Element) voucherElement.getElementsByTagName("room").item(0);
		room.setTypeRoom(roomElement.getAttribute("typeRoom"));
		room.setPersons(Integer.parseInt(roomElement.getAttribute("persons")));
		room.setConditioner(Boolean.parseBoolean(getElementTextContent(roomElement, "conditioner")));
		room.setTv(Boolean.parseBoolean(getElementTextContent(roomElement, "TV")));
		hotel.setRoom(room);
		voucher.setHotel(hotel);

		return voucher;
	}

	private static String getElementTextContent(Element element, String elementName) {
		NodeList nList = element.getElementsByTagName(elementName);
		Node node = nList.item(0);
		return node.getTextContent();
	}
}
