package pages

class ShowPage extends ScaffoldPage {

	static at = {
		heading.text() ==~ /Show Person/
	}
	
	static content = {
		editButton(to: EditPage) { $("input", value: "Edit") }
		deleteButton(to: ListPage) { $("input", value: "Delete") }
		row { $("td.name", text: it).parent() }
		value { row(it).find("td.value").text() }
		id { value("Id") }
		enabled { Boolean.valueOf(value("Enabled")) }
		firstName { value("First Name") }
		lastName { value("Last Name") }
	}
}
