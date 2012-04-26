grails.project.work.dir = "target"

grails.project.dependency.resolution = {
	inherits("global")
	log "warn"
	
	def gebVersion = "0.7.0"
	def seleniumVersion = "2.21.0"
	
	repositories {
		grailsPlugins()
		grailsHome()
		grailsCentral()
		mavenLocal()
		mavenCentral()
		
		// For Geb snapshot
		mavenRepo "https://nexus.codehaus.org/content/repositories/snapshots"
	}
	dependencies {
		test("org.seleniumhq.selenium:selenium-htmlunit-driver:$seleniumVersion") {
			exclude "xml-apis"
		}
		test("org.seleniumhq.selenium:selenium-chrome-driver:$seleniumVersion")
		test("org.seleniumhq.selenium:selenium-firefox-driver:$seleniumVersion")

		// You usually only need one of these, but this project uses both
		test "org.codehaus.geb:geb-spock:$gebVersion"
		test "org.codehaus.geb:geb-junit4:$gebVersion"
	}
	plugins {
		test ":tomcat:$grailsVersion"
		test ":hibernate:$grailsVersion"
		
		test ":geb:0.6.3"
		test ":spock:0.6"
	}
}