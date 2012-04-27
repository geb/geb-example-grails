package pages

import geb.Module

class ListPage extends ScaffoldPage {
	static url = "person/list"
	
	static at = {
		title ==~ /Person List/
	}
	
	static content = {
		newPersonButton(to: CreatePage) { $("a", text: "New Person") }
		peopleTable { $("div.content table", 0) }
		personRow { module PersonRow, personRows[it] }
		personRows(required: false) { peopleTable.find("tbody").find("tr") }
	}
}

class PersonRow extends Module {
	static content = {
		cell { $("td", it) }
		cellText { cell(it).text() }
        cellHrefText{ cell(it).find('a').text() }
		enabled { Boolean.valueOf(cellHrefText(0)) }
		firstName { cellText(1) }
		lastName { cellText(2) }
		showLink(to: ShowPage) { cell(0).find("a") }
	}
}