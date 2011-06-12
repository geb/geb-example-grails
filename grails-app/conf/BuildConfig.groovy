grails.project.work.dir = "target"

grails.project.dependency.resolution = {
	inherits("global")
	log "warn"
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
		test "org.codehaus.geb:geb-spock:0.6-SNAPSHOT"
		test "org.codehaus.geb:geb-junit4:0.6-SNAPSHOT"
	}
	plugins {
		test ":tomcat:$grailsVersion"
		test ":hibernate:$grailsVersion"
		
		test ":geb:0.6-SNAPSHOT"
		test ":spock:0.5-groovy-1.7"
	}
}