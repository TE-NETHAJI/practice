package com.te.javaloggers.implementation;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLoggers {

	final static Logger LOGGER = Logger.getLogger(JavaLoggers.class.getName());

	public static void main(String[] args) {
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.CONFIG);
         //deafault format is simple
		//consoleHandler.setFormatter(new XMLFormatter());

		LOGGER.addHandler(consoleHandler);
		LOGGER.setLevel(Level.CONFIG);
		//LOGGER.setUseParentHandlers(false);

		LOGGER.severe("from severe");
		LOGGER.warning("warning");
		LOGGER.info("from info");
		LOGGER.finer("from fine");
		LOGGER.finest("from finest");
		LOGGER.finer("from finer");
		LOGGER.config("from config");

	}

}
