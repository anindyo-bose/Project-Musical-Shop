package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class viewp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Products List:New Chandan Musicals</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"lightblue\">\n");
      out.write("    <center>\n");
      out.write("        <img src=\"NCM.jpg\"><br>\n");
      out.write("        <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <th><form action=\"home.html\">\n");
      out.write("                            <input type=\"submit\" value=\"Home\" />\n");
      out.write("                        </form></th>\n");
      out.write("                        <th><form action=\"upp.html\">\n");
      out.write("                                <input type=\"submit\" value=\"Update Products\" />\n");
      out.write("                        </form></th>\n");
      out.write("                    <th><form action=\"delp.html\">\n");
      out.write("                            <input type=\"submit\" value=\"Delete Products\" />\n");
      out.write("                        </form></th>\n");
      out.write("                        <th><form action=\"view.html\">\n");
      out.write("                                <input type=\"submit\" value=\"View Products\" />\n");
      out.write("                        </form></th>\n");
      out.write("                        <th><form action=\"search.html\">\n");
      out.write("                                <input type=\"submit\" value=\"Search Products\" />\n");
      out.write("                        </form></th>\n");
      out.write("                </tr>\n");
      out.write("            \n");
      out.write("        </table><br>\n");
      out.write("        <h1><font color=\"orange\"> Products List</font></h1>\n");
      out.write("        <hr hight=\"70%\" width=\"50%\" color=\"red\">\n");
      out.write("        \n");


            String url = "jdbc:derby://localhost:1527/Shop";
            String username="bose";
            String password="bose";
            Connection con = DriverManager.getConnection (url,username,password);
            Statement s1 = con.createStatement();
            ResultSet rs=s1.executeQuery("select * from products");
        
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
      out.write("        </TABLE>\n");
      out.write("            \n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("\n");
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
