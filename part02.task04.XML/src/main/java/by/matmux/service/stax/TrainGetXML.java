package by.matmux.service.stax;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import by.matmux.bean.Train;
import by.matmux.bean.Transport;
import by.matmux.bean.VoucherEnum;

public final class TrainGetXML {

	private TrainGetXML( ) {
	}
	
	public static Transport getXMLTransport(final XMLStreamReader reader) throws XMLStreamException {
		Train train = new Train();
		train.setRailwayCar(reader.getAttributeValue(null, VoucherEnum.RAILWAYCAR.getValue()));
		int type;
		String name;
		while (reader.hasNext()) {
			type = reader.next();
			switch (type) {
			case XMLStreamConstants.START_ELEMENT:
				name = reader.getLocalName();
				switch (VoucherEnum.valueOf(name.toUpperCase())) {
				case BRAND:
					train.setBrand(getXMLText(reader));
					break;
				case YEAROFMANUFACTURE:
					train.setYearOfManufacture(Integer.parseInt(getXMLText(reader)));
					break;
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				name = reader.getLocalName();
				if (VoucherEnum.valueOf(name.toUpperCase()) == VoucherEnum.TRAIN) {
					return train;
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
