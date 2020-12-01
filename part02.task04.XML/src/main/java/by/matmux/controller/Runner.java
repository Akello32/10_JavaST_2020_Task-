package by.matmux.controller;

import by.matmux.service.VoucherDOMParser;

public class Runner {

	public static void main(String[] args) {
		VoucherDOMParser voucherDOMParser = new VoucherDOMParser();
		voucherDOMParser.buildSetVouchers();
	}

}
