<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Pizza Company</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body {margin:0;}

.navbar {
    color: whitesmoke;
    font-style: italic;
    font-size: 30px;
  overflow: hidden;
  background-color: black;
  position: fixed;
  top: 0;
  width: 100%;
}

.navbar a {
  float: right;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.main1 {
    background-color: black;
    float: right;
    width:317px; 
    height:440px;
    font-style: oblique;
    font-size: 20px;
    color: whitesmoke;
  padding: 16px;
  margin-top: 185px;
}
footer {
    padding: 1em;
    color: white;
    background-color: black;
    clear: left;
    text-align: center;
}
a{
    color: blue;
}
        </style>
    </head>
    <body>
        <div class="navbar">
            <img src="images/pizza2.png" style="height:149px" width="230px" align="left"/> 
      <img src="images/pizza1.jpg" style="height:149px" width="230px" align="right"/> 
            <h1><center> Pizza Pizza </center></h1>
            
</div>
        <div class="main1" style="float: right">
            <h2><center>
                 Login 
                </center>  </h2>
         <form  name="login" action="LoginServlet" method="Get">
            <center>  Email:<input type="email" name="Email"/></br><center>
                    <center> Password:<input type="password" name="Password"/></br><center>
                            <center>   <input type="submit" value="Login"/>
                            <input type="reset" value="Clear"/></center>
                     <h2>Not Registered?</h2> 
                     <a href="http://localhost:8080/Project7/index1.jsp">Register</a>      </br>
                     <h2>Order online now</hr></br>
                         <h3>Hurry Up!!</h3>
                      </div>
</form>
            <div class="slide" style="background-color:black">
           
            <img class="mySlides" src="images/pizza1.jpg" style="width:1000px" height="605px">
<img class="mySlides" src="images/pizza6.jpg" style="width:1000px" height="605px">
<img class="mySlides" src="images/pizza5.jpg" style="width:1000px" height="605px">
<img class="mySlides" src="images/pizza7.jpg" style="width:1000px" height="605px">
<script>
var myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
       x[i].style.display = "none";  
    }
    myIndex++;
    if (myIndex > x.length) {myIndex = 1}    
    x[myIndex-1].style.display = "block";  
    setTimeout(carousel, 2000); // Change image every 2 seconds
}
</script>
</div>
             <footer>Copyright &copy; Pizza.com</footer> 
    </body>
</html>
