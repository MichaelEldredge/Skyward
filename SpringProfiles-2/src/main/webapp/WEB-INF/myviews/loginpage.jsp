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
    <p>Welcome to <span th:text="${appName}">Our App</span></p>

<div class="main">
    <center><em><h1 style="background: white">Welcome Book Enthusiast!</h1></em></center>
    
                    
    <div class="form-box">
        <div class="logreg-border">
            <div id="btn"></div>
            <button type="button" class="toggle-btn" onclick="login()">Log In</button>
            <button type="button" class="toggle-btn"onclick="register()">Register</button>  
        </div>
        <h2>${errorMsg}</h2>
        <form id="login" class="input-box" method= "post">
                <label for="username">Enter Username: </label>
                <input type="text" class="inputs"  name="username" placeholder="Username" required>
                <br><br>
                <label for="password">Enter Password: </label>
                <input type="password" class="inputs"  name="password" placeholder="password" required>

                <input type="submit" class="sub-btn" value="Login"/>
        </form>
        <form id="register" class="input-box" method= "post" action="loginpage">
            <label for="first-name">Enter First Name: </label>
            <input type="text" class="inputs"  name="first-name" placeholder="First Name" required>
            <br>
            <label for="last-name">Enter Last Name: </label>
            <input type="text" class="inputs"  name="last-name" placeholder="Last Name" required>
            <br>
            <label for="email">Enter Email: </label>
            <input type="text" class="inputs"  name="email" placeholder="Enter Email" required>
            <br>
            <label for="username">Enter Username: </label>
            <input type="text" class="inputs"  name="username" placeholder="Username" required>
            <br>
            <label for="password">Enter Password: </label>
            <input type="password" class="inputs"  name="password" placeholder="Enter Password" required>
            <br><br>            
            <input type="submit" class="sub-btn" value="Register"/>
        </form>
    </div>
    
</div>
    <script>
       x = document.getElementById("login");
       y = document.getElementById("register");
       z = document.getElementById("btn");



       function register(){
        x.style.left = "-400px";
        y.style.left = "40px";
        z.style.left = "100px";
       }

       function login(){
        x.style.left = "50px";
        y.style.left = "-600px";
        z.style.left = "0px";


       }
      

    </script>


    </body>
    </html>