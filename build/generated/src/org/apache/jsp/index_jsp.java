package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import clases.UsuarioDatos;
import java.sql.ResultSet;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      clases.UsuarioDatos usrDatos = null;
      synchronized (request) {
        usrDatos = (clases.UsuarioDatos) _jspx_page_context.getAttribute("usrDatos", PageContext.REQUEST_SCOPE);
        if (usrDatos == null){
          usrDatos = new clases.UsuarioDatos();
          _jspx_page_context.setAttribute("usrDatos", usrDatos, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Aplicacion de Ventas</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/main.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"LoginForm\">\n");
      out.write("        ");

            HttpSession sesion = request.getSession();
            
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            ResultSet res = usrDatos.login(username, password);            

        
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 if(username==null && password==null){ 
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div style=\"padding:40px;\">\n");
      out.write("                <center><h1 class=\"form-heading\">Aplicación de ventas</h1></center>\n");
      out.write("            </div>\n");
      out.write("        <div class=\"login-form\">\n");
      out.write("        <div class=\"main-div\">\n");
      out.write("            <div class=\"panel\">\n");
      out.write("           <h2>Iniciar sesion</h2>\n");
      out.write("           <p>Por favor ingrese sus credenciales de usuario</p>\n");
      out.write("           </div>\n");
      out.write("            <form id=\"Login\" action=\"index.jsp\" method=\"post\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Username\" name=\"username\" required=\"\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"inputPassword\" placeholder=\"Password\" name=\"password\" required=\"\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"forgot\">\n");
      out.write("                <a href=\"reset.html\">¿Olvidaste tu contraseña?</a>\n");
      out.write("                </div>\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Entrar</button>\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("      \n");
      out.write("        ");
 if (res.next()) { 
            
            sesion.setAttribute("username", username);
            
        
      out.write("\n");
      out.write("            \n");
      out.write("            ");
      if (true) {
        _jspx_page_context.forward("dashboard.jsp");
        return;
      }
      out.write("\n");
      out.write("            \n");
      out.write("        ");
 }
      out.write("\n");
      out.write("    <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
