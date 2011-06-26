grails.project.work.dir = "target"

grails.project.dependency.resolution = {
	inherits("global")
	log "warn"
	
	def gebVersion = "0.6.0.RC1"
	
	repositories {
		grailsPlugins()
		grailsHome()
		grailsCentral()
		mavenLocal()
		mavenCentral()
	}
	dependencies {
		test("org.seleniumhq.selenium:selenium-htmlunit-driver:latest.release") {
			exclude "xml-apis"
		}
/*      test("org.seleniumhq.selenium:selenium-chrome-driver:latest.release")*/

		// You usually only need one of these, but this project uses both
		test "org.codehaus.geb:geb-spock:$gebVersion"
		test "org.codehaus.geb:geb-junit4:$gebVersion"
	}
	plugins {
		test ":tomcat:$grailsVersion"
		test ":hibernate:$grailsVersion"
		
		test ":geb:$gebVersion"
		test ":spock:0.5-groovy-1.7"
	}
}