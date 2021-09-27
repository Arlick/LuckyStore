<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<%@include file="includes/head.jsp"%>
</head>
<body>
	<%@include file="includes/navbar.jsp"%>
	<div class="container">
		<div class="card w-50 mx-auto my-5">
			<div class="card-header text-center">User Login</div>
			<div class="card-body">
				<form action="user-login" method="post">
					<div class="form-group">
						<label>Email address</label> <input type="email"
							class="form-control" name="login-email" required>
					</div>

					<div class="form-group">
						<label>Password</label> <input type="password"
							class="form-control" name="login-password" required> <span
							class="text-danger"><%=(request.getAttribute("errMessage") == null) ? "" : request.getAttribute("errMessage")%></span>
					</div>

					<div class="text-center">
						<button class="btn btn-primary mr-4">Sing in</button>
						<a class="btn btn-outline-info" href="registration.jsp"
							role="button">Sing up</a>
					</div>

				</form>
			</div>
		</div>
	</div>


	<%@include file="includes/jslinks.jsp"%>
</body>
</html>
