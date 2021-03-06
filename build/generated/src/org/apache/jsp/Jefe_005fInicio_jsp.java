package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.*;

public final class Jefe_005fInicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    HttpSession sesion = request.getSession();

    Usuario user;
    Usuario nulo = new Usuario();
    String clave;

    try {
        user = (Usuario) sesion.getAttribute("seguimiento");
    } catch (Exception e) {
        user = nulo;
    }

    try {
        clave = user.getClave();
        if (clave == null) {
            clave = "";
        }
    } catch (Exception e) {
        clave = "";
    }
    if (clave.equals("")) {

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/usuario.css\">\n");
      out.write("        <link rel=\"icon\" href=\"img/logo.ico\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"general\">\n");
      out.write("            <nav>\n");
      out.write("                <br>\n");
      out.write("                <table width=\"90%\" align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"left\"><h1 class=\"titulo\">Jefe de Area</h1></td>\n");
      out.write("                        <td align=\"right\"><img width=\"55\" src=\"img/Gráficas.png\" alt=\"\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </nav>\n");
      out.write("                    <nav id=\"menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <a href=\"Jefe_Inicio.jsp\" class=\"a1\">Inicio</a>\n");
      out.write("                        <a href=\"Alumnos_Grupos.jsp\" class=\"a1\">Listado Alumnos</a>\n");
      out.write("                        <a href=\"Informacion_Grupo.jsp\" class=\"a1\">Rendimiento de los Grupos</a>\n");
      out.write("                        <a href=\"Editar_Grupos.jsp\" class=\"a1\">Editar Grupos</a>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            <br><br>\n");
      out.write("            <section>\n");
      out.write("                <p>Necesita iniciar sesion para hacer uso de esta pagina</p>\n");
      out.write("                <a href=\"login.jsp\">Inicio Sesion</a>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
} else {
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title></title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/usuario.css\">\n");
      out.write("        <link rel=\"icon\" href=\"img/logo.ico\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"general\">\n");
      out.write("            <nav>\n");
      out.write("                <br>\n");
      out.write("                <table width=\"90%\" align=\"center\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td align=\"left\"><h1 class=\"titulo\">Jefe de Area</h1></td>\n");
      out.write("                        <td align=\"right\"><img width=\"55\" src=\"img/Gráficas.png\" alt=\"\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </nav>\n");
      out.write("            <nav id=\"menu\">\n");
      out.write("                <ul>\n");
      out.write("                    <a href=\"Jefe_Inicio.jsp\" class=\"a1\">Inicio</a>\n");
      out.write("                    <a href=\"Alumnos_Grupos.jsp\" class=\"a1\">Listado Alumnos</a>\n");
      out.write("                    <a href=\"Informacion_Grupo.jsp\" class=\"a1\">Rendimiento de los Grupos</a>\n");
      out.write("                    <a href=\"Editar_Grupos.jsp\" class=\"a1\">Editar Grupos</a>\n");
      out.write("            </nav><br>\n");
      out.write("            <div class=\"mensaje\">Bienvenido ");
      out.print(user.getClave());
      out.write("<br></div>\n");
      out.write("\n");
      out.write("            <div class=\"navegador\">\n");
      out.write("                <div class=\"Regresar\"><br><a href=\"index.html\"><input type=\"button\" name=\"return\" value=\"Cerrar Sesion\" class=\"btn1\"></a></div>\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
}
      out.write('\n');
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
