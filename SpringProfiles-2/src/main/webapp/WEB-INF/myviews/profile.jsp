<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REST</title>
 <link rel="stylesheet" href="login.css">
 
 <style>
body {
    background-color: "brown";
}
</style>
</head>
<body>
    <h3>Welcome ${uName}, fine day were having isn't it?</h3>
<br><br>
<hr><h4>A gentle reminder that you are a proud book club member!</h4>
<h7> What would you like to do today?</h7><br><br>
<form method="GET" action= "welcome">
<button>Check out Books</button>
</form>
<br>
<form method ="post">
<button>View Profile Page</button>
</form>
    </body>
    </html>