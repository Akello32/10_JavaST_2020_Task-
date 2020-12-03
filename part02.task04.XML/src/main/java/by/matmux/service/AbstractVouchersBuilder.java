package by.matmux.service;

import java.util.HashSet;
import java.util.Set;

import by.matmux.bean.Voucher;

public abstract class AbstractVouchersBuilder {
	protected Set<Voucher> vouchers;

	public AbstractVouchersBuilder() {
		vouchers = new HashSet<Voucher>();
	}

	public AbstractVouchersBuilder(Set<Voucher> vouchers) {
		this.vouchers = vouchers;
	}

	public Set<Voucher> getVouchers() {
		return vouchers;
	}

	abstract public void buildSetVouchers(String fileName);
}
