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
		test("org.seleniumhq.selenium:selenium-firefox-driver:latest.release")
	}
	plugins {
		test ":tomcat:$grailsVersion"
		test ":hibernate:$grailsVersion"
		
		test ":geb:0.6-SNAPSHOT"
		test ":spock:0.5-groovy-1.7"
	}
}