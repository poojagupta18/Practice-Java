/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2019-11-22 06:52:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addToCard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/Users/Allianz/Desktop/java/OnlineShopping/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/OnlineShopping/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153410282000L));
    _jspx_dependants.put("jar:file:/C:/Users/Allianz/Desktop/java/OnlineShopping/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/OnlineShopping/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153410282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1574076716202L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Book Store Template, Free CSS Template, TemplateMo.com</title>\r\n");
      out.write("<meta name=\"keywords\" content=\"Book Store Template, Free CSS Template, CSS Website Layout, CSS, HTML, TemplateMo.com\" />\r\n");
      out.write("<meta name=\"description\" content=\"Book Store Template, Free CSS Template, Download CSS Website from TemplateMo.com\" />\r\n");
      out.write("<link href=\"templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function calculatePrice(product_id)\r\n");
      out.write("{\r\n");
      out.write("\t\r\n");
      out.write("\tvar price = document.getElementById(\"price\"+product_id).value;\r\n");
      out.write("\tvar quantity = document.getElementById(\"quantity\"+product_id).value;\r\n");
      out.write("\tconsole.log(\" \" + product_id);\r\n");
      out.write("\tconsole.log(price + \" \"+document.getElementById(\"quantity\"+product_id).value);\r\n");
      out.write("\tdocument.getElementById(\"total\"+product_id).value = parseFloat(price)*parseFloat(quantity);\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!--  Free CSS Templates from www.templatemo.com -->\r\n");
      out.write("<div id=\"templatemo_container\">\r\n");
      out.write("\t<div id=\"templatemo_menu\">\r\n");
      out.write("    \t<ul>\r\n");
      out.write("            <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("            <li><a href=\"#\" class=\"current\">Search</a></li>\r\n");
      out.write("            <li><a href=\"index.html\">Books</a></li>            \r\n");
      out.write("            <li><a href=\"index.html\">New Releases</a></li>  \r\n");
      out.write("            <li><a href=\"#\">Company</a></li> \r\n");
      out.write("            <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("    \t</ul>\r\n");
      out.write("    </div> <!-- end of menu -->\r\n");
      out.write("    \r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <div id=\"templatemo_content\">\r\n");
      out.write("    \t\r\n");
      out.write("        <div id=\"templatemo_content_left\">\r\n");
      out.write("        \t<div class=\"templatemo_content_left_section\">\r\n");
      out.write("            \t<h1>Categories</h1>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"index.html\">Donec accumsan urna</a></li>\r\n");
      out.write("                    <li><a href=\"index.html\">Proin vulputate justo</a></li>\r\n");
      out.write("                    <li><a href=\"#\">In sed risus ac feli</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Aliquam tristique dolor</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Maece nas metus</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Sed pellentesque placerat</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Suspen disse</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Maece nas metus</a></li>\r\n");
      out.write("                    <li><a href=\"#\">In sed risus ac feli</a></li>\r\n");
      out.write("            \t</ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\t\t\t<div class=\"templatemo_content_left_section\">\r\n");
      out.write("            \t<h1>Bestsellers</h1>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">Vestibulum ullamcorper</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Maece nas metus</a></li>\r\n");
      out.write("                    <li><a href=\"#\">In sed risus ac feli</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Praesent mattis varius</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Maece nas metus</a></li>\r\n");
      out.write("                    <li><a href=\"#\">In sed risus ac feli</a></li>\r\n");
      out.write("                    <li><a href=\"http://www.flashmo.com\" target=\"_parent\">Flash Templates</a></li>\r\n");
      out.write("                    <li><a href=\"http://www.templatemo.com\" target=\"_parent\">CSS Templates</a></li>\r\n");
      out.write("                    <li><a href=\"http://www.webdesignmo.com\" target=\"_parent\">Web Design</a></li>\r\n");
      out.write("                    <li><a href=\"http://www.photovaco.com\" target=\"_parent\">Free Photos</a></li>\r\n");
      out.write("            \t</ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"templatemo_content_left_section\">                \r\n");
      out.write("                <a href=\"http://validator.w3.org/check?uri=referer\"><img style=\"border:0;width:88px;height:31px\" src=\"http://www.w3.org/Icons/valid-xhtml10\" alt=\"Valid XHTML 1.0 Transitional\" width=\"88\" height=\"31\" vspace=\"8\" border=\"0\" /></a>\r\n");
      out.write("<a href=\"http://jigsaw.w3.org/css-validator/check/referer\"><img style=\"border:0;width:88px;height:31px\"  src=\"http://jigsaw.w3.org/css-validator/images/vcss-blue\" alt=\"Valid CSS!\" vspace=\"8\" border=\"0\" /></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("        </div> <!-- end of content left -->\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"templatemo_content_right\">\r\n");
      out.write("        \t<form action=\"CheckOutController\" method=\"post\">\r\n");
      out.write("            <h1>Your WhishList......</h1>\r\n");
      out.write("            <div class=\"image_panel\"><img src=\"images/templatemo_image_02.jpg\" alt=\"CSS Template\" width=\"100\" height=\"150\" /></div>\r\n");
      out.write("          \r\n");
      out.write("           <table border=2>\r\n");
      out.write("          \t \t<tr>\r\n");
      out.write("          \t\t\t <th>ProductId</th>\r\n");
      out.write("          \t\t \t <th>code</th>\r\n");
      out.write("          \t\t\t <th>Description</th>\r\n");
      out.write("          \t\t\t <th>Price</th>\r\n");
      out.write("          \t\t\t <th>Manufacturing Date</th>\r\n");
      out.write("          \t \t\t<th>Quantity</th>\r\n");
      out.write("          \t \t\t<th>Total</th>\r\n");
      out.write("          \t \t\t<th>Action</th>\r\n");
      out.write("          \t \t</tr>\r\n");
      out.write("          ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("           <tr>\r\n");
      out.write("           \r\n");
      out.write("           </tr>\r\n");
      out.write("           </table>\r\n");
      out.write("           <input type=\"submit\"></input>\r\n");
      out.write("            </form>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <br/>\r\n");
      out.write("            <a href=\"ProductDBController\">Back</a>\r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("             <div class=\"cleaner_with_height\">&nbsp;</div>\r\n");
      out.write("            \r\n");
      out.write("            <a href=\"index.html\"><img src=\"images/templatemo_ads.jpg\" alt=\"css template ad\" /></a>\r\n");
      out.write("            \r\n");
      out.write("        </div> <!-- end of content right -->\r\n");
      out.write("    \r\n");
      out.write("    \t<div class=\"cleaner_with_height\">&nbsp;</div>\r\n");
      out.write("    </div> <!-- end of content -->\r\n");
      out.write("    \r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("<!--  Free CSS Template www.templatemo.com -->\r\n");
      out.write("</div> <!-- end of container -->\r\n");
      out.write("<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /addToCard.jsp(100,10) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/addToCard.jsp(100,10) '${productList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${productList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /addToCard.jsp(100,10) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("product");
      // /addToCard.jsp(100,10) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("status");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("          \t\r\n");
            out.write("          \t \t<tr>\r\n");
            out.write("          \t\t\t <td><input type=\"hidden\" name=\"product_id\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('/');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("          \t\t\t <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productCode}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("          \t\t\t <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("          \t\t\t <td>\r\n");
            out.write("          \t\t\t <input type=\"hidden\" name=\"price");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"  id=\"price");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"/> \r\n");
            out.write("          \t\t\t ");
            out.write("\r\n");
            out.write("          \t\t\t </td>\r\n");
            out.write("          \t\t\t <td>\r\n");
            out.write("          \t\t\t ");
            if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("          \t\t\t </td>\r\n");
            out.write("          \t\t\t <td>\r\n");
            out.write("          \t\t\t <input type=\"text\" name=\"quantity");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" id=\"quantity");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" value=1 onblur=\"calculatePrice(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(")\"/>\r\n");
            out.write("          \t\t\t </td>\r\n");
            out.write("          \t\t\t  <td>\r\n");
            out.write("          \t\t\t <input type=\"text\" name=\"total");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" id=\"total");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" onblur=\"calculatePrice(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.productId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(")\"/>\r\n");
            out.write("          \t\t\t </td>\r\n");
            out.write("          \t\t\t <td>\r\n");
            out.write("          \t\t\t <a href=\"ProductDBController?action=deleteFromCart&index=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">Remove</a>\r\n");
            out.write("          \t\t\t </td>\r\n");
            out.write("          \t \t</tr>\r\n");
            out.write("          ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /addToCard.jsp(111,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product.manfDate}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /addToCard.jsp(111,14) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setPattern("dd/MM/yyyy");
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      _jspx_th_fmt_005fformatDate_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f0_reused);
    }
    return false;
  }
}
