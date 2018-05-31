<%-- 
    Document   : list
    Created on : 17 Nov, 2017, 10:01:37 AM
    Author     : asus
--%>

<%@page import="employeeManegement.Employee_manegement"%>



<jsp:useBean id="e1" class="employee.dao.EmplyeeDAO"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
session=request.getSession(false);
if( session!=null)
{%>
        <table><tr><th>ID</th>
           <th>Name</th> 
           <th>phone number</th>
           <th>email</th>
           <th>username</th>
           <th>password</th>
            <th>update</th>
            <th>delete</th>
           <%
for(Employee_manegement e:e1.listAllEmployee_manegements()){
           
 %>
            <tr><th><%=e.getEmpid()%></th>
            <<th><%=e.getEmpName()%></th>
            <th><%=e.getEmpphno()%></th>
            <th><%=e.getEmail()%></th>
            <th><%=e.getUsername()%></th>
            <th><%=e.getPassword()%></th>
           <th><a href='update.jsp?id=<%=e.getEmpid()%>'>Update</a><th>
           <th><a href='delete.jsp?id=<%=e.getEmpid()%>'>Delete</a><th>
               
                </tr>
            <%  
            }%>
        </table>
           <%}else{
%>Login first<%
}%>
           </body>
</html>
