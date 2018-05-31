<%-- 
    Document   : delete
    Created on : 17 Nov, 2017, 12:26:48 PM
    Author     : asus
--%>
 
<%@page import="employee.dao.EmplyeeDAO"%>
<%-- <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
--%>
<%
     int id=Integer.parseInt(request.getParameter("id"));
            EmplyeeDAO ed=new EmplyeeDAO();
           ed.delete(id);
             response.sendRedirect("list.jsp");
             %>