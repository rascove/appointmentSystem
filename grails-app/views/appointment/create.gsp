<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <g:set var="entityName" value="${message(code: 'appointment.label', default: 'Appointment')}" />
        <title><g:message code="default.create.label" args="[entityName]" /></title>
    </head>
    <body>
    <div id="content" role="main">
        <div class="container">
            <section class="row">
                <div class="nav" role="navigation">
                    <ul>
                        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
                        <li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
                    </ul>
                </div>
            </section>
            <section class="row">
                <div id="create-appointment" class="col-12 content scaffold-create" role="main">
                    <h1><g:message code="default.create.label" args="[entityName]" /></h1>
                    <g:if test="${flash.message}">
                    <div class="message" role="status">${flash.message}</div>
                    </g:if>
                    <g:hasErrors bean="${this.appointment}">
                    <ul class="errors" role="alert">
                        <g:eachError bean="${this.appointment}" var="error">
                        <li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
                        </g:eachError>
                    </ul>
                    </g:hasErrors>
                    <g:form resource="${this.appointment}" method="POST">
                        <fieldset class="form">
                            <g:hiddenField name="surgery" value="${this.surgery.id}" />
                            <f:field bean="appointment" property="appDateTime">
                                <g:datePicker name="${property}" />
                            </f:field>
                            <f:field bean="appointment" property="duration" />
                            <f:field bean="appointment" property="roomNumber" />
                            <f:field bean="appointment" property="patient">
                                <g:select name="${property}" from="${this.patientList}" optionKey="id" />
                            </f:field>
                            <f:field bean="appointment" property="doctor">
                                <g:select name="${property}" from="${this.doctorList}" optionKey="id" noSelection="${['null':'']}" />
                            </f:field>
                            <f:field bean="appointment" property="nurses">
                                <g:select name="${property}" from="${this.nurseList}" optionKey="id" multiple="true" />
                            </f:field>
                        </fieldset>
                        <fieldset class="buttons">
                            <g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
                        </fieldset>
                    </g:form>
                </div>
            </section>
        </div>
    </div>
    </body>
</html>
