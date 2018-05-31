<%-- 
    Document   : loginAction
    Created on : 17 Nov, 2017, 12:43:15 PM
    Author     : asus
--%>

<%@page import="employeeManegement.Employee_manegement"%>
<%@page import="employee.dao.EmplyeeDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            
        </h1>
    </body>
</html>
<%
     String uname=request.getParameter("username");
            String pass=request.getParameter("password");
            EmplyeeDAO ed=new EmplyeeDAO();
            int i=1000;
            for(Employee_manegement e:ed.listAllEmployee_manegements()){
                if(e.getUsername().equals(uname)&&e.getPassword().equals(pass)){
                   
                   i=e.getEmpid();
                    
                }
            }
            if(i!=1000){
               
                   // HttpSession ses=new HttpSession();
                    HttpSession ses=request.getSession();
                    ses.setAttribute("logid",i);
                    Cookie ck=new Cookie("message", "welcome");
                    response.addCookie(ck);
                      response.sendRedirect("list.jsp");}
                      %>