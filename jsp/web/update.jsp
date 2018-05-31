<%-- 
    Document   : update
    Created on : 17 Nov, 2017, 11:16:54 AM
    Author     : asus
--%>

<%@page import="employeeManegement.Employee_manegement"%>
<jsp:useBean id="e1" class="employee.dao.EmplyeeDAO"/>
<%   int id=Integer.parseInt(request.getParameter("id"));%>
<%Employee_manegement e=e1.findBId(id);%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <form action="updateAction.jsp" method="post">
          <input type='hidden' name="id"  value="<%=e.getEmpid()%>"/> 
          <input type='text' name="name" value="<%=e.getEmpName()%>"/>
          <input type='text' name="phone number" value="<%=e.getEmpphno()%>"/>
                 <input type='text' name="email" value="<%=e.getEmail()%>"/>
          <input type='text' name="username" value="<%=e.getUsername()%>"/>
          <input type='text' name="password" value="<%=e.getPassword()%>"/>
          <input type='submit' value='Update'/>
    </body>
</html>
