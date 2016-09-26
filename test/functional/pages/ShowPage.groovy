package pages

class ShowPage extends ScaffoldPage {

	static at = {
		heading.text() ==~ /Show Person/
	}
	
	static content = {
		editButton(to: EditPage) { $("a", text: "Edit") }
		deleteButton { $("input", value: "Delete") }
		row { $("li.fieldcontain span.property-label", text: it).parent() }
		value { row(it).find("span.property-value").text() }
		visible { Boolean.valueOf(value("Visible")) }
		firstName { value("First Name") }
		lastName { value("Last Name") }
	}
}
