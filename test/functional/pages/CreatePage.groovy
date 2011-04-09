package pages

import pages.modules.*

class CreatePage extends ScaffoldPage {

	static at = {
		heading.text() ==~ /Create.+/
	}
	
	static content = {
		createButton(to: ShowPage) { create() }
	}

}