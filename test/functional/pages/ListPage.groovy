package pages

import geb.Module

class ListPage extends ScaffoldPage {
	static url = "person/list"
	
	static at = {
		heading.text() ==~ /Person List/
	}
	
	static content = {
		newPersonButton(to: CreatePage) { $("a", text: "New Person") }
		peopleTable { $("div.list table", 0) }
		personRow { module PersonRow, personRows[it] }
		personRows(required: false) { peopleTable.find("tbody").find("tr") }
	}
}

class PersonRow extends Module {
	static content = {
		cell { $("td", it) }
		cellText { cell(it).text() }
		id { cellText(0) }
		enabled { Boolean.valueOf(cellText(1)) }
		firstName { cellText(2) }
		lastName { cellText(3) }
		showLink(to: ShowPage) { cell(0).find("a") }
	}
}