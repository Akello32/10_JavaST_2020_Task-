package by.matmux.view;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.matmux.service.VoucherDOMParser;
import by.matmux.service.sax.VoucherSAXBuilder;

public class Runner {
	private static final Logger log = LogManager.getLogger(Runner.class);
	
	public static void main(String[] args) {
		VoucherDOMParser voucherDOMParser = new VoucherDOMParser();
		File file = new File("src/main/resources/tourism.xml");
		String pathString = file.getAbsolutePath();
		/*
		 * voucherDOMParser.buildSetVouchers(pathString);
		 * 
		 * voucherDOMParser.getVouchers().forEach(log::debug);
		 */
		VoucherSAXBuilder vBuilder = new VoucherSAXBuilder();
		vBuilder.buildSetVouchers(pathString);
		vBuilder.getVouchers().forEach(log::debug);
	}
}
