/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.firefox.FirefoxDriver

driver = { 
	def driverInstance = new FirefoxDriver() 
	driverInstance.manage().window().maximize() 
	driverInstance
}