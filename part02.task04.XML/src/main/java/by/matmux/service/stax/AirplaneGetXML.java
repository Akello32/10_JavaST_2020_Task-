package by.matmux.service.stax;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import by.matmux.bean.Airplane;
import by.matmux.bean.Transport;
import by.matmux.bean.VoucherEnum;

public final class AirplaneGetXML {
	
	private AirplaneGetXML() {
	}
	
	public static Transport getXMLTransport(final XMLStreamReader reader) throws XMLStreamException {
		Airplane airplane = new Airplane();
		int type;
		String name;
		while (reader.hasNext()) {
			type = reader.next();
			switch (type) {
			case XMLStreamConstants.START_ELEMENT:
				name = reader.getLocalName();
				switch (VoucherEnum.valueOf(name.toUpperCase())) {
				case BRAND:
					airplane.setBrand(getXMLText(reader));
					break;
				case YEAROFMANUFACTURE:
					airplane.setYearOfManufacture(Integer.parseInt(getXMLText(reader)));
					break;
				case SEAT:
					airplane.setSeat(Integer.parseInt(getXMLText(reader)));
					break;
				case AIRLINES:
					airplane.setAirlines(getXMLText(reader));
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				name = reader.getLocalName();
				if (VoucherEnum.valueOf(name.toUpperCase()) == VoucherEnum.AIRPLANE) {
					return airplane;
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
