package by.matmux.controller;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.matmux.controller.command.CommandParser;

public class Runner {
	private static final Logger log = LogManager.getLogger(Runner.class);
	
	public static void main(String args[]) {
		CommandParser commandParser = new CommandParser();
		File file = new File("src/main/resources/tourism.xml");
		String pathString = file.getAbsolutePath();
		commandParser.execute("DOM", pathString).forEach(log::debug);
	}
}
