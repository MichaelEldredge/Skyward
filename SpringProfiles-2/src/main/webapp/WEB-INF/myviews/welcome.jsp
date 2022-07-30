<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>Welcome to our ever-growing library! Please Stay Awhile</h1>
<br>
 <input type="text" id="txt" name="checkoutlist">
        <br><br><br>
        <input id="sub-btn" type= "button" value="submission" onclick="subFunction()"/>
        <br><br><br>

        <input id="reset" type="button" value="Removal" onclick="removalFunction()"/>
    <button id="mybtn">Click for action</button>
    <script>
    const itemList = document.querySelector(".userList");
        function subFunction(){
            var txt= document.getElementById("txt").value; /*grabs value inserted into text field*/
            var inscanner = document.createElement("li"); /*creates list element*/
            inscanner.innerHTML = txt; /*within each list element, it will be populated by the value in the input field*/
            document.body.append(inscanner); /*this adds value of list element into the body of the file*/
        }
        function removalFunction(){
            var txt = document.getElementById("txt").value;
            /*below are two lines needed to remove an element for a child node*/
            var outscanner = document.querySelector("li");
            outscanner.parentNode.removeChild(outscanner);/*this line effectively removes first element of my list, rather than the chosen one*/
        }
        const itemsList = document.querySelectorAll("li");
        var mybtn= document.getElementById("mybtn");
        mybtn.addEventListener("click", mybtnFunction);
        function mybtnFunction(){

            alert("It Works")
            var myHead2 = document.createElement("h2");
            myHead2.innerHTML="This is created on button click";
            myHead2.style.color="red";
            document.body.append(myHead2);
        }
    </script>
</body>
</html>