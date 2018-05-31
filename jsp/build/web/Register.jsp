<%-- 
    Document   : Register
    Created on : 16 Nov, 2017, 4:06:46 PM
    Author     : asus
--%>
<jsp:useBean id="e1" class="employee.dao.EmplyeeDAO"/>
<jsp:useBean id="e" class="employeeManegement.Employee_manegement"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             e.setEmpid(Integer.parseInt(request.getParameter("id")));
            e.setEmpName(request.getParameter("name"));
            e.setEmpphno(request.getParameter("phone number"));
            e.setEmail(request.getParameter("email"));
            e.setUsername(request.getParameter("username"));
            e.setPassword(request.getParameter("password"));
            e1.insertemployee_manegement(e);
            response.sendRedirect("list.jsp");
            %>
    </body>
</html>
