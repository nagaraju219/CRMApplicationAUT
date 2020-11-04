package com.crm.utils;

import com.crm.pages.ContactsPage;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.*; 
import org.apache.logging.log4j.Logger;
public class LoggingManager {

		public static Logger log;
	
		public static Logger LoggingManager(String className)
		{
			return log = LogManager.getLogger(className);
		}


}
