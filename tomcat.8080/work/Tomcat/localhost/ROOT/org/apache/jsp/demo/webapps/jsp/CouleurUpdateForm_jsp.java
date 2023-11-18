/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2023-11-18 16:00:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.demo.webapps.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CouleurUpdateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("    <html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Update Couleur</title>\r\n");
      out.write("        <!-- Inclure les fichiers CSS/JS si nécessaire -->\r\n");
      out.write("        <!-- http://localhost:8080/demo/webapps/jsp/CouleurUpdateForm.jsp -->\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <h2>Update Couleur Form</h2>\r\n");
      out.write("        <form id=\"updateCouleurForm\" action=\"/couleur\" method=\"post\">\r\n");
      out.write("            <label for=\"id\">ID de la Couleur:</label>\r\n");
      out.write("            <select id=\"id\" name=\"id\" required></select><br><br>\r\n");
      out.write("\r\n");
      out.write("            <label for=\"nom\">Nom de la Couleur:</label>\r\n");
      out.write("            <input type=\"text\" id=\"nom\" name=\"nom\" required><br><br>\r\n");
      out.write("\r\n");
      out.write("            <label for=\"hexadecimal_rvb\">Code Hexadecimal RGB:</label>\r\n");
      out.write("            <input type=\"text\" id=\"hexadecimal_rvb\" name=\"hexadecimal_rvb\" required><br><br>\r\n");
      out.write("\r\n");
      out.write("            <input type=\"submit\" value=\"Update\">\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("\r\n");
      out.write("        // Charger les IDs au chargement de la page\r\n");
      out.write("        window.onload = function() {\r\n");
      out.write("            fetch('http://localhost:8080/couleur')\r\n");
      out.write("                .then(response => response.json())\r\n");
      out.write("                .then(data => {\r\n");
      out.write("                    var select = document.getElementById('id');\r\n");
      out.write("                    data.forEach(function(couleur) {\r\n");
      out.write("                        var option = new Option(couleur.id, couleur.id);\r\n");
      out.write("                        select.add(option);\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        // Mettre à jour les champs lors du changement de l'ID sélectionné\r\n");
      out.write("        document.getElementById('id').addEventListener('change', function() {\r\n");
      out.write("                var id = this.value;\r\n");
      out.write("                fetch('http://localhost:8080/couleur?id=' + id)\r\n");
      out.write("                    .then(response => response.json())\r\n");
      out.write("                    .then(data => {\r\n");
      out.write("                        if(data.length > 0) {\r\n");
      out.write("                            var couleur = data[0]; // Supposant que la réponse est un tableau d'objets\r\n");
      out.write("                            document.getElementById('nom').value = couleur.nom;\r\n");
      out.write("                            document.getElementById('hexadecimal_rvb').value = couleur.hexadecimal_rvb;\r\n");
      out.write("                        }\r\n");
      out.write("                    })\r\n");
      out.write("                    .catch(error => console.error('Error:', error));\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            document.getElementById('updateCouleurForm').addEventListener('submit', function (event) {\r\n");
      out.write("                event.preventDefault();\r\n");
      out.write("\r\n");
      out.write("                var formData = new FormData(this);\r\n");
      out.write("                var jsonData = {};\r\n");
      out.write("\r\n");
      out.write("                for (var [key, value] of formData.entries()) {\r\n");
      out.write("                    if (key === 'id') {\r\n");
      out.write("                        jsonData[key] = parseInt(value);\r\n");
      out.write("                    } else {\r\n");
      out.write("                        jsonData[key] = value;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                console.log(jsonData);\r\n");
      out.write("\r\n");
      out.write("                // Remplacer par l'URL et la méthode appropriées pour votre API\r\n");
      out.write("                fetch('http://localhost:8080/couleur', {\r\n");
      out.write("                    method: 'PUT',\r\n");
      out.write("                    headers: {\r\n");
      out.write("                        'Content-Type': 'application/json',\r\n");
      out.write("                    },\r\n");
      out.write("                    body: JSON.stringify(jsonData)\r\n");
      out.write("                })\r\n");
      out.write("                    .then(response => {\r\n");
      out.write("                        if (!response.ok) {\r\n");
      out.write("                            throw new Error('Network response was not ok: ' + response.statusText);\r\n");
      out.write("                        }\r\n");
      out.write("                        return response.json();\r\n");
      out.write("                    })\r\n");
      out.write("                    .then(data => {\r\n");
      out.write("                        // Traiter la réponse (par exemple, afficher un message de succès)\r\n");
      out.write("                        console.log(data);\r\n");
      out.write("                    })\r\n");
      out.write("                    .catch(error => {\r\n");
      out.write("                        // Gérer les erreurs ici\r\n");
      out.write("                        console.error('Error:', error);\r\n");
      out.write("                    });\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    </html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
