package by.matmux.service.stax;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import by.matmux.bean.Airplane;
import by.matmux.bean.Hotel;
import by.matmux.bean.Transport;
import by.matmux.bean.VoucherEnum;

public final class HotelGetXML {
	
	private HotelGetXML() {
	}
	
	public static Hotel getXMLHotel(final XMLStreamReader reader) throws XMLStreamException {
		Hotel hotel = new Hotel();
		int type;
		String name;
		while (reader.hasNext()) {
			type = reader.next();
			switch (type) {
			case XMLStreamConstants.START_ELEMENT:
				name = reader.getLocalName();
				switch (VoucherEnum.valueOf(name.toUpperCase())) {
				case MEALS:
					hotel.setMeals(getXMLText(reader));
					break;
				case RATING:
					hotel.setRating(Integer.parseInt(getXMLText(reader)));
					break;
				case ROOM:
					hotel.setRoom(RoomGetXML.getXMLRoom(reader));
					break;
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				name = reader.getLocalName();
				if (VoucherEnum.valueOf(name.toUpperCase()) == VoucherEnum.HOTEL) {
					return hotel;
				}
				break;
			}
		}
		throw new XMLStreamException("Unknown element in tag Address");

	}

	private static String getXMLText(XMLStreamReader reader) throws XMLStreamException {
		String text = null;
		if (reader.hasNext()) {
			reader.next();
			text = reader.getText();
		}
		return text;
	}
}
