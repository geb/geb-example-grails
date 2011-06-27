/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver

// Use htmlunit as the default
driver = { 
	def driver = new HtmlUnitDriver()
	driver.javascriptEnabled = true
	driver
}

environments {
	
	// run as “grails -Dgeb.env=chrome test-app”
	chrome {
		driver = { new ChromeDriver() }
	}
	
	// run as “grails -Dgeb.env=firefox test-app”
	firefox {
		driver = { new FirefoxDriver() }
	}

}