package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import db.Connect_File;
import java.sql.*;

public final class pcmCourse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/head.jsp");
    _jspx_dependants.add("/foot.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", true, 8192, true);
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body background=\"book.jpg\">\r\n");
      out.write("    <img src=\"logo.jpg\" width=\"500\" height=\"150\" align=\"middle\" style=\"margin-left:430px;\"><br><br>\r\n");
      out.write("   \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Modify C database</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".container {\n");
      out.write("\twidth: 950px;\n");
      out.write("\theight: 1800px;\n");
      out.write("\tpadding-left:80px;\n");
      out.write("\tpadding-top:40px;\n");
      out.write("\tbackground-color: rgba(52, 73, 94, 0.7);\n");
      out.write("\tborder-radius: 4px;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("\tmargin-top: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".signout {\n");
      out.write("\tcolor: green;\n");
      out.write("\tbackground: #F1F0D1;\n");
      out.write("\tpadding-top: 5px;\n");
      out.write("\tpadding-right: 5px;\n");
      out.write("\tpadding-bottom: 5px;\n");
      out.write("\tpadding-left: 5px;\n");
      out.write("\tborder-radius: 4px;\n");
      out.write("\tborder: none;\n");
      out.write("\tborder-bottom: 4px solid #27aE60;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\theight: 40px;\n");
      out.write("\twidth: 150px;\n");
      out.write("\tmargin-left: 210px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write(".text{\n");
      out.write("\tcolor:#ffff80;\n");
      out.write("\tfont-style:oblique;\n");
      out.write("\tfont-size:1.2em;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<marquee>\n");
      out.write("            <h1>Avilable course for pcm student</h1>\n");
      out.write("</marquee>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("      \n");
      out.write("  ");
 
    Connection conn=Connect_File.getConnection();
   
    String query="select * from courses where Course_type='pcm'";
    PreparedStatement ps=conn.prepareStatement(query);
    ResultSet rs=ps.executeQuery();
    
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("    <h2 style=\"color:#ffff80;text-align: center;\">Courses Database:</h2>\n");
      out.write("    ");

    
    while (rs.next()){
   // String u=request.getParameter("user");
    String Course_name=rs.getString("Course_name");
    String Course_duration=rs.getString("Course_duration");
    String Course_url=rs.getString("Course_url");
 //   String c=rs.getString("opt3");
   // String d=rs.getString("opt4"); 
   // String correct=rs.getString("correct_opt");

      out.write("\n");
      out.write("      \n");
      out.write("      \n");
      out.write("        \n");
      out.write("    <b class=\"text\">Course Name ");
      out.print(Course_name);
      out.write("</b><br>\n");
      out.write("    <b class=\"text\">Duration");
      out.print(Course_duration);
      out.write("</b><br>\n");
      out.write("     <b class=\"text\">");
      out.print(Course_url);
      out.write("</b><br>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write(" \n");
      out.write("    ");

    }
    conn.close();  
    
      out.write("\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>TODO supply a title</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<p style=\"text-align: center; font-size: 20px; margin-top:45px;background-color:silver;\">\n");
      out.write("\t\t<b><i> -------- </i></b>\n");
      out.write("\t</p>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>  \n");
      out.write("\n");
      out.write("\n");
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
