<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
    <g:set var="entityName" value="${message(code: 'surgery.label', default: 'Surgery')}" />
</head>
<body>
    <div id="content" role="main">
        <div class="container px-4 py-5">
            <h2 class="pb-2 border-bottom">${surgery.name}</h2>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
            <div class="row row-cols-1 row-cols-md-2 align-items-start g-5 py-5">
                <div class="col d-flex flex-column align-items-start gap-2">
                    <h4>${surgery.address} ${surgery.postcode}<br/>
                        Telephone: ${surgery.telephone}<br/>
                        Opening time: ${surgery.openingTime}</h4>
                    <p class="text-body-secondary">${surgery.description}</p>
                </div>

                <div class="col">
                    <div class="row row-cols-1 row-cols-sm-2 g-4">
                        <div class="col d-flex flex-column gap-2">
                            <div class="feature-icon-small d-inline-flex align-items-center justify-content-center text-bg-primary bg-gradient fs-4 rounded-3">
                            </div>
                            <h4 class="fw-semibold mb-0">Our Doctors</h4>
                            <div class="list-group">
                                <g:each var="doctor" in="${surgery.doctors}">
                                <div class="list-group-item list-group-item-action d-flex gap-3 py-3" aria-current="true">
                                    <div class="d-flex gap-2 w-100 justify-content-between">
                                        <div>
                                            <h6 class="mb-0">${doctor.name}</h6>
                                            <p class="mb-0 opacity-75">${doctor.qualifications}</p>
                                        </div>
                                        <small class="opacity-50 text-nowrap">${doctor.position}</small>
                                    </div>
                                </div>
                                </g:each>
                            </div>
                        </div>

                        <div class="col d-flex flex-column gap-2">
                            <div class="feature-icon-small d-inline-flex align-items-center justify-content-center text-bg-primary bg-gradient fs-4 rounded-3">
                            </div>
                            <h4 class="fw-semibold mb-0">Our Nurses</h4>
                            <div class="list-group">
                                <g:each var="nurse" in="${surgery.nurses}">
                                <div class="list-group-item list-group-item-action d-flex gap-3 py-3" aria-current="true">
                                    <div class="d-flex gap-2 w-100 justify-content-between">
                                        <div>
                                            <h6 class="mb-0">${nurse.name}</h6>
                                            <p class="mb-0 opacity-75">${nurse.qualifications}</p>
                                        </div>
                                    </div>
                                </div>
                                </g:each>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>