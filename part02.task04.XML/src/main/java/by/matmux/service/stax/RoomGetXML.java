package by.matmux.service.stax;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import by.matmux.bean.Room;
import by.matmux.bean.VoucherEnum;

public final class RoomGetXML {
	
	private RoomGetXML() {
	}
	
	public static Room getXMLRoom(final XMLStreamReader reader) throws XMLStreamException {
		Room room = new Room();
		room.setTypeRoom(reader.getAttributeValue(null, VoucherEnum.TYPEROOM.getValue()));
		int persons = Integer.parseInt(reader.getAttributeValue(null, VoucherEnum.PERSONS.getValue()));
		room.setPersons(persons);
		int type;
		String name;
		while (reader.hasNext()) {
			type = reader.next();
			switch (type) {
			case XMLStreamConstants.START_ELEMENT:
				name = reader.getLocalName();
				switch (VoucherEnum.valueOf(name.toUpperCase())) {
				case TV:
					room.setTv(Boolean.parseBoolean(getXMLText(reader)));
					break;
				case CONDITIONER:
					room.setConditioner(Boolean.parseBoolean(getXMLText(reader)));
					break;
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				name = reader.getLocalName();
				if (VoucherEnum.valueOf(name.toUpperCase()) == VoucherEnum.ROOM) {
					return room;
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
