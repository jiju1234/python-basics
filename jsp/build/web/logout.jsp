<%-- 
    Document   : logout
    Created on : 17 Nov, 2017, 2:40:49 PM
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
    </body>
</html>
<%
    HttpSession ses=request.getSession();
          ses.invalidate();
          response.sendRedirect("login.jsp");

%>