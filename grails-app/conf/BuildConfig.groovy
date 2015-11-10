grails.project.work.dir = 'target'
grails.project.source.level = 1.6

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		mavenLocal()
		mavenCentral()
	}

	dependencies {
		compile 'p6spy:p6spy:1.3'
	}

	plugins {
		compile ':google-visualization:0.6'
		runtime ":jquery:1.11.1"

		build(':release:3.1.1', ':rest-client-builder:2.1.1') {
			export = false
		}
	}
}
