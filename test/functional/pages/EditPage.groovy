package pages

class EditPage extends ScaffoldPage {

	static at = {
		heading.text() ==~ /Edit.+/
	}
	
	static content = {
		updateButton(to: ShowPage) { $("input", value: "Update") }
		deleteButton(to: ListPage) { $("input", value: "Delete") }
	}

}