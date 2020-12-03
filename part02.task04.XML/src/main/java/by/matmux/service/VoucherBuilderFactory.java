package by.matmux.service;

import by.matmux.service.sax.VoucherSAXBuilder;
import by.matmux.service.stax.VoucherStAXBuilder;

public final class VoucherBuilderFactory {
	private static final VoucherBuilderFactory instance = new VoucherBuilderFactory();
	private VoucherBuilderFactory() {
	}
	
	public static VoucherBuilderFactory getInstance() {
		return instance;
	}

	private enum TypeParser {
		SAX, STAX, DOM
	}

	public AbstractVouchersBuilder createVouchersBuilder(String typeParser) {
		TypeParser type = TypeParser.valueOf(typeParser.toUpperCase());
		switch (type) {
		case DOM:
			return new VoucherDOMParser();
		case STAX:
			return new VoucherStAXBuilder();
		case SAX:
			return new VoucherSAXBuilder();
		default:
			throw new EnumConstantNotPresentException(type.getDeclaringClass(), type.name());
		}
	}
}
