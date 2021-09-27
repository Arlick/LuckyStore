<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Registration</title>
<%@include file="includes/head.jsp"%>
</head>
<body>
	<%@include file="includes/navbar.jsp"%>
	<div class="container">
		<div class="card w-50 mx-auto my-5">
			<div class="card-header text-center">Registration</div>
			<div class="card-body">
				<form action="registration" method="post">

					<div class="form-group">
						<label>Email</label> <input type="email"
							class="form-control" name="registr-email" required>
					</div>
					
					<div class="form-group">
						<label>Name</label> <input type="text"
							class="form-control" name="registr-name" required>
					</div>
					
					<div class="form-group">
						<label>Surname</label> <input type="text"
							class="form-control" name="registr-surname" required>
					</div>
					<div class="form-group">
						<label>Password</label> <input type="password"
							class="form-control" name="registr-password" required>
					</div>

					<div class="text-center">
						<button class="btn btn-primary mr-4">Registration</button>						
					</div>

				</form>
			</div>
		</div>
	</div>
</body>
</html>