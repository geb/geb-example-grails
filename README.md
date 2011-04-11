A simple app that tests Grails scaffolding with Geb + Spock and JUnit.

See: [PersonCRUDSpec](https://github.com/geb/geb-example-grails/blob/master/test/functional/PersonCRUDSpec.groovy) and [PersonCRUDTests](https://github.com/geb/geb-example-grails/blob/master/test/functional/PersonCRUDTests.groovy) in the test source tree.

The project is currently configured to use FireFox for testing. To use another browser simply change the driver dependency in [BuildConfig](https://github.com/geb/geb-example-grails/blob/master/grails-app/conf/BuildConfig.groovy#L14).


To run the tests, simply run `grails test-app`.