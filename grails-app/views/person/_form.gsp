<%@ page import="com.test.Person" %>



<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'visible', 'error')} ">
	<label for="visible">
		<g:message code="person.visible.label" default="Visible" />
		
	</label>
	<g:checkBox name="visible" value="${personInstance?.visible}" />
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'firstName', 'error')} ">
	<label for="firstName">
		<g:message code="person.firstName.label" default="First Name" />
		
	</label>
	<g:textField name="firstName" value="${personInstance?.firstName}" />
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'lastName', 'error')} ">
	<label for="lastName">
		<g:message code="person.lastName.label" default="Last Name" />
		
	</label>
	<g:textField name="lastName" value="${personInstance?.lastName}" />
</div>

