package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ID:New Chandan Musicals</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"lightblue\"><center></body>\n");
      out.write("        <img src=\"NCM.jpg\"><br>\n");
      out.write("       ");

            ResultSet rs=null;
            int id=0;
            
            
            String url = "jdbc:derby://localhost:1527/Shop";
            String username="bose";
            String password="bose";
            Connection con = DriverManager.getConnection (url,username,password);
            Statement s1 = con.createStatement();
            String a= request.getParameter("id");
            id= Integer.parseInt(a);
                        
            if(id!=0){
            rs=s1.executeQuery("select * from products where id="+id+"");}
                       
        
      out.write("\n");
      out.write("        \n");
      out.write("        <TABLE BORDER=\"1\">\n");
      out.write("            <TR>\n");
      out.write("                <TH>ID</TH>\n");
      out.write("                <TH>Type</TH>\n");
      out.write("                <TH>Name</TH>\n");
      out.write("                <TH>Purchased Price</TH>\n");
      out.write("                <TH>Selling Price</TH>\n");
      out.write("                <TH>Marketed From</TH>\n");
      out.write("                <TH>Product Make</TH>\n");
      out.write("                <TH>Product Quantity</TH>\n");
      out.write("            </TR>\n");
      out.write("         ");
 while(rs.next()){ 
      out.write("\n");
      out.write("            <TR>\n");
      out.write("                <TD> ");
      out.print( rs.getString(1) );
      out.write("</td>\n");
      out.write("                <TD> ");
      out.print( rs.getString(2) );
      out.write("</TD>\n");
      out.write("                <TD> ");
      out.print( rs.getString(3) );
      out.write("</TD>\n");
      out.write("                <TD> ");
      out.print( rs.getString(4) );
      out.write("</TD>\n");
      out.write("                <TD> ");
      out.print( rs.getString(5) );
      out.write("</TD>\n");
      out.write("                <TD> ");
      out.print( rs.getString(6) );
      out.write("</TD>\n");
      out.write("                <TD> ");
      out.print( rs.getString(7) );
      out.write("</TD>\n");
      out.write("                <TD> ");
      out.print( rs.getString(8) );
      out.write("</TD>\n");
      out.write("            </TR>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </TABLE></center>\n");
      out.write("    </body>\n");
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
