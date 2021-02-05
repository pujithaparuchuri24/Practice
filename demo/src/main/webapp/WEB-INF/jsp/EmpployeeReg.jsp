<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script></head>
<body>
<div class="container">
<div class="card">
<div class="card-header card bg-primary text-white">
<h1 class="text-center">EmployeeRegister</h1>
</div><! card-header> 
<div class="card-body">
<form action="save" method="post">
<div class="row form-group">
<div class="col-md-4">
<label for="name">Name:</label>
</div>
<div class="col-md-4">
<input type="text" class="form-control" id="name" name="name">
</div>
<div class="col-md-4">
</div>
</div><!row end>
<div class="row form-group">
<div class="col-md-4">
<label for="email">Email:</label>
</div>
<div class="col-md-4">
<input type="email" class="form-control" id="email" name="email">
</div>
<div class="col-md-4">
</div>
</div><!row end>
<div class="row form-group">
<div class="col-md-4">
<label for="password">PassWord:</label>
</div>
<div class="col-md-4">
<input type="password" class="form-control" id="password" name="pwd">
</div>
<div class="col-md-4">
</div>
</div><!row end>
<div class="row form-group">
<div class="col-md-6">
<input type="submit" value="submit" class="btn btn-success"/>
</div>
<div class="col-md-6">
<input type="reset" value="Reset" class="btn btn-primary"/>
</div>
</div><!row end>
</form><! from tag>
<div><!card -body>
<div class="card-footer">
${msg}
</div>
</div><!card>

</div> <!container>
</body>
</html>