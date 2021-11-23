

package com.te.javaloggers.implementation;

import java.util.logging.*;

public class FileHandler1 {

	final static Logger LOGGER = Logger.getLogger(FileHandler.class.getName());

	public static void main(String[] args) {
		try {
			FileHandler fileHandler = new FileHandler("myLogs.logs", false);
			fileHandler.setLevel(Level.CONFIG);
			fileHandler.setFormatter(new CustomFormatter());

			fileHandler.setFilter(new MyFilter());
			LOGGER.addHandler(fileHandler);
			LOGGER.setLevel(Level.CONFIG);

			//LOGGER.setUseParentHandlers(false);
			
			  LOGGER.severe("from severe"); LOGGER.warning("warning");
			  LOGGER.info("from info"); LOGGER.finer("from fine");
			  LOGGER.finest("from finest");
			 
			 
			 LOGGER.finer("from finer");
			 
			LOGGER.config("from config");

		} catch (Exception e) {

		}

	}
}
