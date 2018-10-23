package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Register</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            body {margin:0;}\n");
      out.write("\n");
      out.write("#main {\n");
      out.write("    font-style: oblique;\n");
      out.write("    color: lightsalmon;\n");
      out.write("    background-color: aqua;\n");
      out.write("  padding: 16px;\n");
      out.write("  margin-top: 130px;\n");
      out.write("  height: 450px;\n");
      out.write("  width: 300px;/* Used in this example to enable scrolling */\n");
      out.write("}</style>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("<form action=\"process.jsp\">\n");
      out.write("     Name: <input type=\"text\" name=\"uname\" value=\"Name...\" onclick=\"this.value=''\"/></br>\n");
      out.write("     Email Id:<input type=\"text\" name=\"uemail\" value=\"Email Id...\" onclick=\"this.value=''\"/></br>\n");
      out.write("     Password: <input type=\"password\" name=\"upass\" value=\"Password...\" onclick=\"this.value=''\"/></br>\n");
      out.write("     Confirm Password:<input type=\"password\" name=\"ucpass\" value=\"Confirm Password...\" onclick=\"this.value=''\"/></br>\n");
      out.write("     Phone No.: <input type=\"text\" name=\"uphone\"  value=\"Phone No...\" onclick=\"this.value=''\"/></br>\n");
      out.write("     Address:<input type=\"text\" name=\"uadd\" value=\"Address...\" onclick=\"this.value=''\"/></br>\n");
      out.write("            <input type=\"submit\"  value=\"Register\"/>\n");
      out.write("            <input type=\"reset\" value=\"Clear\"/>\n");
      out.write(" </form>\n");
      out.write("</body>\n");
      out.write("</Html>");
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
