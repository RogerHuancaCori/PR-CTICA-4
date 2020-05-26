package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.emergentes.modelo.Blog;
import java.util.List;

public final class blog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write(" \n");
      out.write("  \n");
      out.write("  \n");
      out.write(" ");
 
     if (session.getAttribute("logeado") != "OK") { 
             response.sendRedirect("login.jsp"); 
         } 
 
      out.write(" \n");
      out.write(" ");
 
     List<Blog> lista = (List<Blog>) request.getAttribute("lista"); 
 
      out.write(" \n");
      out.write("  \n");
      out.write(" <!DOCTYPE html> \n");
      out.write(" <html> \n");
      out.write("     <head> \n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("          <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.css\"> \n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\"> \n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/icomoon.css\"> \n");
      out.write("         <script languaje=\"JavaScript\" type=\"text/javascript\" src=\"js/bootstrap.js\"></script> \n");
      out.write("         <title>JSP Page</title> \n");
      out.write("     </head> \n");
      out.write("     <body> \n");
      out.write("         <div class=\"container\"> \n");
      out.write("             <nav style=\"float:right;padding: 5px;\"  > \n");
      out.write("                  \n");
      out.write("                 <h6 ><span class=\"icon-user\">  </span>ADMINISTRADOR : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("   <a   href=\"LoginControlador?action=logout\"> <span class=\"icon-sign-out\"></span>  Salir</a></h6> \n");
      out.write("             </nav> \n");
      out.write("             <br> \n");
      out.write("              \n");
      out.write("             <div > \n");
      out.write("                    <h1 style=\"text-align: center\">Blog de Salud</h1> \n");
      out.write("                  <p><a href=\"MainControlador?op=nuevo&autor=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Nueva Entrada</a></p> \n");
      out.write("                 <table border=\"0\"> \n");
      out.write("  \n");
      out.write("                     ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                 </table> \n");
      out.write("             </div> \n");
      out.write("           \n");
      out.write("         </div> \n");
      out.write("          \n");
      out.write("          \n");
      out.write("     </body> \n");
      out.write(" </html> \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("item");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("            \n");
          out.write("                     <tr> \n");
          out.write("  \n");
          out.write("                     </tr> \n");
          out.write("                     <tr> \n");
          out.write("                         <td><i>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.fecha}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</i></td> \n");
          out.write("                     </tr> \n");
          out.write("                     <tr> \n");
          out.write("                         <td><h1><b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.titulo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b></h1></td> \n");
          out.write("                     </tr> \n");
          out.write("                     <tr> \n");
          out.write("                           <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.contenido}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \n");
          out.write("                     </tr> \n");
          out.write("                     <tr> \n");
          out.write("                         <td><b>Autor : ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.autor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</b> \n");
          out.write("  \n");
          out.write("                           <a style=\"float: right\"href=\"MainControlador?op=eliminar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" onclick=\" return confirm('Esta Seguro')\">Eliminar</a>  \n");
          out.write("                            <a style=\"float: right\"href=\"MainControlador?op=editar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Editar</a> \n");
          out.write("  \n");
          out.write("                         <br><hr style=\"border-color:red;\"> \n");
          out.write("                         </td> \n");
          out.write("  \n");
          out.write("                     </tr> \n");
          out.write("  \n");
          out.write("                     ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
