<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sheffield Surgeries' Appointment System</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
    <div class="modal modal-sheet position-static d-block bg-body-secondary p-4 py-md-5" tabindex="-1" role="dialog" id="modalSignin">
		<div class="modal-dialog" role="document">
			<div class="modal-content rounded-4 shadow">
				<div class="modal-header p-5 pb-4 border-bottom-0">
					<h1 class="fw-bold mb-0 fs-2">Sheffield Surgeries' Appointment System</h1>
				</div>

				<div class="modal-body p-5 pt-0">
					<g:form action="validate">
						<g:if test="${flash.message}">
						<small class="text-body-secondary">${flash.message}</small>
						</g:if>
						<div class="form-floating mb-3">
							<input name="username" class="form-control rounded-3" id="floatingInput" >
							<label for="floatingInput">Username</label>
						</div>
						<div class="form-floating mb-3">
							<input name="password" type="password" class="form-control rounded-3" id="floatingPassword" >
							<label for="floatingPassword">Password</label>
						</div>
						<button class="w-100 mb-2 btn btn-lg rounded-3 btn-primary" type="submit">Login</button>
						<hr class="my-4">
						<h2 class="fs-5 fw-bold mb-3">Or return to homepage</h2>
						<a href="${createLink(uri: '/')}" class="w-100 py-2 mb-2 btn btn-outline-secondary rounded-3">Home</a>
					</g:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>