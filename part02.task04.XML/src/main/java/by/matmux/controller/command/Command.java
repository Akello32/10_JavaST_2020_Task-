package by.matmux.controller.command;

import java.util.Set;

import by.matmux.bean.Voucher;

public interface Command {
	Set<Voucher> execute(String type, String filePath);
}
