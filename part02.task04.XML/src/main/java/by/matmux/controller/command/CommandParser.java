package by.matmux.controller.command;

import java.util.Set;

import by.matmux.bean.Voucher;
import by.matmux.service.AbstractVouchersBuilder;
import by.matmux.service.VoucherBuilderFactory;

public class CommandParser implements Command {
	@Override
	public Set<Voucher> execute(String type, String filePath) {
		VoucherBuilderFactory cBuilderFactory = VoucherBuilderFactory.getInstance();
		AbstractVouchersBuilder aBuilder =  cBuilderFactory.createVouchersBuilder(type);
		aBuilder.buildSetVouchers(filePath);
		
		return aBuilder.getVouchers();
	}
}
