<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'surgery.label', default: 'Surgery')}" />
</head>
<body>
    <div id="content" role="main">
        <div class="container px-4 py-5" id="hanging-icons">
            <h2 class="pb-2 border-bottom">Our Surgeries</h2>
            <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
            </g:if>
            <div class="row g-4 py-5 row-cols-1 row-cols-lg-3">
                <g:each var="surgery" in="${surgeryList}">
                <div class="col d-flex align-items-start">
                    <div>
                        <h3 class="fs-2">${surgery.name}</h3>
                        <p>${surgery.description}</p>
                        <g:link class="btn btn-primary" action="show" id="${surgery.id}">See details</g:link>
                    </div>
                </div>
                </g:each>
            </div>
        </div>
    </div>
</body>
</html>