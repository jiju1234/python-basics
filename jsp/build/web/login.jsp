<%-- 
    Document   : login
    Created on : 17 Nov, 2017, 12:38:38 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="loginAction.jsp" method="post">
       <input name="username" required placeholder="username"/>
        <br>
        <br>
        <input name="password" required placeholder="password"/>
        <br>
        <br>
        <input type="submit" value="submit">
        </form>
    </body>
</html>
