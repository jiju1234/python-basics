<%@page import="employee.dao.EmplyeeDAO"%>
<%@page import="employeeManegement.Employee_manegement"%>
<%-- 
    Document   : updateAction
    Created on : 17 Nov, 2017, 11:34:57 AM
    Author     : asus
--%>
<%-- 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
Employee_manegement e=new Employee_manegement();
            e.setEmpid(Integer.parseInt(request.getParameter("id")));
            e.setEmpName(request.getParameter("name"));
            e.setEmpphno(request.getParameter("phone number"));
            e.setEmail(request.getParameter("email"));
            e.setUsername(request.getParameter("username"));
            e.setPassword(request.getParameter("password"));
            EmplyeeDAO ed=new EmplyeeDAO();
            ed.updateemployee_manegement(e);
            response.sendRedirect("list.jsp");
            

%>