package by.matmux.service.sax;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import by.matmux.bean.Airplane;
import by.matmux.bean.Countries;
import by.matmux.bean.Hotel;
import by.matmux.bean.Room;
import by.matmux.bean.Train;
import by.matmux.bean.Voucher;
import by.matmux.bean.VoucherEnum;
import by.matmux.service.VoucherDOMParser;

public class VoucherHandler extends DefaultHandler {
	private static final Logger log = LogManager.getLogger(VoucherHandler.class);
	private Set<Voucher> vouchers;
	private Voucher current = null;
	private VoucherEnum currentEnum = null;
	private EnumSet<VoucherEnum> withText;

	public VoucherHandler() {
		vouchers = new HashSet<>();
		withText = EnumSet.range(VoucherEnum.DATE, VoucherEnum.CONDITIONER);
	}

	public Set<Voucher> getVouchers() {
		return vouchers;
	}

	public void startElement(String uri, String localName, String qName, Attributes attrs) {
		if ("touristVoucher".equals(localName)) {
			current = new Voucher();
			current.setName(attrs.getValue(0));
			current.setCountry(Countries.valueOf(attrs.getValue(1)));
			return;
		} 

		if ("hotel".equals(localName)) {
			current.setHotel(new Hotel());
			return;
		}
		
		if ("room".equals(localName)) {
			Room room = new Room();
			if (attrs.getLength() == 2) {
				room.setTypeRoom(attrs.getValue(0));
				room.setPersons(Integer.parseInt(attrs.getValue(1)));
			} else {
				room.setPersons(Integer.parseInt(attrs.getValue(0)));	
			}
			current.getHotel().setRoom(room);
			return;
		} 
		
		if ("airplane".equals(localName)) {
			current.setTransport(new Airplane());
			return;
		} 
		
		if ("train".equals(localName)) {
			Train train = new Train();
			train.setRailwayCar((attrs.getValue(0)));
			current.setTransport(train);
			return;
		} else {
			VoucherEnum temp = VoucherEnum.valueOf(localName.toUpperCase());
			if (withText.contains(temp)) {
				currentEnum = temp;
			}
		}		
	}
		
	public void endElement(String uri, String localName, String qName) {
		if ("touristVoucher".equals(localName)) {
			vouchers.add(current);
		}
	}

	public void characters(char[] ch, int start, int length) {

		String s = new String(ch, start, length).trim();
		Airplane airplane = new Airplane();
		if (currentEnum != null) {
			switch (currentEnum) {
			case DATE:
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
				try {
					current.setDate(format.parse(s));
				} catch (ParseException e) {
					log.debug("Error when entering data");
				}
				break;
			case DAYS:
				current.setDays(Integer.parseInt(s));
				break;
			case COST:
				current.setCost(Integer.parseInt(s));
				break;
			case BRAND:
				current.getTransport().setBrand(s);
				break;
			case YEAROFMANUFACTURE:
				current.getTransport().setYearOfManufacture(Integer.parseInt(s));
				break;
			case SEAT:
				airplane.setBrand(current.getTransport().getBrand());
				airplane.setYearOfManufacture(current.getTransport().getYearOfManufacture());
				airplane.setSeat(Integer.parseInt(s));
				current.setTransport(airplane);
				break;
			case AIRLINES:
				airplane.setAirlines(s);
				current.setTransport(airplane);
				break;
			case RATING:
				current.getHotel().setRating(Integer.parseInt(s));
				break;
			case MEALS:
				current.getHotel().setMeals(s);
				break;
			case TV:
				current.getHotel().getRoom().setTv(Boolean.parseBoolean(s));
				break;
			case CONDITIONER:
				current.getHotel().getRoom().setConditioner(Boolean.parseBoolean(s));
				break;
			default:
				throw new EnumConstantNotPresentException(currentEnum.getDeclaringClass(), currentEnum.name());
			}
		}
		currentEnum = null;
	}
}
