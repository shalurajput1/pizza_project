<%-- 
    Document   : newjsindex1
    Created on : Aug 15, 2017, 3:48:05 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Register</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body {margin:0;}
.navbar {
    color: whitesmoke;
    font-style: italic;
    font-size: 23px;
  overflow: hidden;
  background-color: black;
  position: fixed;
  top: 0;
  width: 100%;
}
.main1 {
    height: 470px;
    font-style: oblique;
    color: lightsalmon;
    background-color: black;
  padding: 16px;
  margin-top: 100px;
  
}       footer {
    padding: 1em;
    color: white;
    background-color: black;
    clear: left;
    text-align: center;
}</style>
    </head>
<body>
    <div class="navbar" style="background-color:black">
            
            <h1><center> Pizza Pizza </center></h1>
    <div class="main1">
        <h1><marquee>Register Here..</marquee></h1>
<form action="process.jsp">
    <center>
     <tr><td><font size="5" face="arial"> Name  :</font>
<td><input type="text" maxlength="15" size="15" name="uname"></tr></font></br>


<tr><td><font size="5" face="arial">Email Id :</font>
<td><input type="email" maxlength="15" size="15" name="uemail"></tr></br>

<tr><td><font size="5" face="arial">Password :</font>
<td><input type="password" maxlength="15" size="15" name="upass"></tr></br>

<tr><td><font size="5" face="arial">Confirm Password :</font>
<td><input type="password" maxlength="15" size="15" name="ucpass"></tr></br>


<tr><td><font size="5" face="arial">Phone No. :</font>
<td><input type="text" maxlength="11" size="11" name="uphone"></tr></br>

<tr><td><font size="5" face="arial">Address :</font>
    <td> <input type="text" name="uadd"</tr></br>
            <input type="submit"  value="Register"/>
            <input type="reset" value="Clear"/>
    </center>
</form>
        <footer>Copyright &copy; Pizza.com</footer>
    </div>
    
</body>
</Html>