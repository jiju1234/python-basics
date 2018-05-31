package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import employeeManegement.Employee_manegement;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      employee.dao.EmplyeeDAO e1 = null;
      synchronized (_jspx_page_context) {
        e1 = (employee.dao.EmplyeeDAO) _jspx_page_context.getAttribute("e1", PageContext.PAGE_SCOPE);
        if (e1 == null){
          e1 = new employee.dao.EmplyeeDAO();
          _jspx_page_context.setAttribute("e1", e1, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

session=request.getSession(false);
if( session!=null)
{
      out.write("\n");
      out.write("        <table><tr><th>ID</th>\n");
      out.write("           <th>Name</th> \n");
      out.write("           <th>phone number</th>\n");
      out.write("           <th>email</th>\n");
      out.write("           <th>username</th>\n");
      out.write("           <th>password</th>\n");
      out.write("            <th>update</th>\n");
      out.write("            <th>delete</th>\n");
      out.write("           ");

for(Employee_manegement e:e1.listAllEmployee_manegements()){
           
 
      out.write("\n");
      out.write("            <tr><th>");
      out.print(e.getEmpid());
      out.write("</th>\n");
      out.write("            <<th>");
      out.print(e.getEmpName());
      out.write("</th>\n");
      out.write("            <th>");
      out.print(e.getEmpphno());
      out.write("</th>\n");
      out.write("            <th>");
      out.print(e.getEmail());
      out.write("</th>\n");
      out.write("            <th>");
      out.print(e.getUsername());
      out.write("</th>\n");
      out.write("            <th>");
      out.print(e.getPassword());
      out.write("</th>\n");
      out.write("           <th><a href='update.jsp?id=");
      out.print(e.getEmpid());
      out.write("'>Update</a><th>\n");
      out.write("           <th><a href='delete.jsp?id=");
      out.print(e.getEmpid());
      out.write("'>Delete</a><th>\n");
      out.write("               \n");
      out.write("                </tr>\n");
      out.write("            ");
  
            }
      out.write("\n");
      out.write("        </table>\n");
      out.write("           ");
}else{

      out.write("Login first");

}
      out.write("\n");
      out.write("           </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
