/*
 * JSP generated by Resin-3.1.9 (built Mon, 13 Apr 2009 11:09:12 PDT)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _index__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = _jsp_application.getJspApplicationContext().allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);
    javax.servlet.jsp.PageContext _jsp_parentContext = pageContext;
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html; charset=euc-kr");
    request.setCharacterEncoding("EUC-KR");
    try {
      
/*
 * -----------------------------------------------------------------------------
 * \u00c6\u00c4\u00c0\u00cf\u00b8\u00ed  : index.jsp
 * \u00bc\u00b3\u00b0\u00e8\u00c0\u00da  : \u00be\u00e7\u00c1\u00a4\u00b3\u00e7
 * \u00c0\u00db\u00bc\u00ba\u00c0\u00da  : \u00be\u00e7\u00c1\u00a4\u00b3\u00e7
 * \u00bc\u00b3\u00b8\u00ed    : \u00b7\u00ce\u00b1\u00d7\u00c0\u00ce \u00c6\u00e4\u00c0\u00cc\u00c1\u00f6\u00b8\u00a6 \u00b1\u00b8\u00bc\u00ba\u00c7\u00d1\u00b4\u00d9.
 * -----------------------------------------------------------------------------
 * \u00bc\u00f6\u00c1\u00a4\u00c0\u00cc\u00b7\u00c2
 * Version   Date         Description		\u00c0\u00db\u00bc\u00ba\u00c0\u00da
 *  1.0.0    2008/10/27   \u00bb\u00f3\u00bc\u00bc\u00bc\u00b3\u00b0\u00e8\u00bf\u00a1 \u00c0\u00c7\u00b0\u00c5.		\u00be\u00e7\u00c1\u00a4\u00b3\u00e7
 * -----------------------------------------------------------------------------
 */

      out.write(_jsp_string0, 0, _jsp_string0.length);
      
	response.setHeader("Pragma","No-cache"); //HTTP 1.0 
	response.setDateHeader ("Expires", 0); 
	response.setHeader ("Cache-Control", "no-cache");

	if (session.getAttribute("user_auth") != null){
		response.sendRedirect("/common/jsp/main.jsp"); 
	}

      out.write(_jsp_string1, 0, _jsp_string1.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_application.getJspApplicationContext().freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.server.util.CauchoSystem.getVersionId() != 5783496155892875126L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.vfs.Dependency depend;
      depend = (com.caucho.vfs.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void init(ServletConfig config)
    throws ServletException
  {
    com.caucho.server.webapp.WebApp webApp
      = (com.caucho.server.webapp.WebApp) config.getServletContext();
    super.init(config);
    com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
    com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.PageContextImpl(webApp, this);
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("index.jsp"), 1488498722221351983L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string1;
  private final static char []_jsp_string0;
  static {
    _jsp_string1 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<title>\uc870\uc120\uc77c\ubcf4\ud1b5\ud569\uc815\ubcf4\uc9c0\uc6d0\uc2dc\uc2a4\ud15c</title>\r\n<link href=\"/css/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n<SCRIPT language=\"JavaScript\">\r\n\r\nwindow.onload = function(){\r\n	document.myform.elements['user_id'].focus();\r\n}\r\n\r\nfunction login_req(){\r\n	var n = document.myform;\r\n	var pUrl = \"\";\r\n	var params = \"\";\r\n\r\n	if (n.elements['user_id'].value == \"\"){\r\n		alert(\"\ud68c\uc6d0 ID\ub97c \uc785\ub825\ud574\uc8fc\uc2ed\uc2dc\uc624.\");\r\n		n.elements['user_id'].focus();\r\n		return;\r\n	}\r\n	if (n.elements['user_passwd'].value == \"\"){\r\n		alert(\"\ud68c\uc6d0 \ube44\ubc00\ubc88\ud638\ub97c \uc785\ub825\ud574\uc8fc\uc2ed\uc2dc\uc624.\");\r\n		n.elements['mb_passwd'].focus();\r\n		return;\r\n	}\r\n\r\n	//\ud2b8\ub7ec\uc2a4\ud2b8\ud3fc \uc124\uce58\ubc0f \uc124\uce58\ud655\uc778\r\n	var obj = document.myform;\r\n	obj.action = \"/common/jsp/install.jsp\";\r\n	//obj.action = \"/common/jsp/login.jsp\";\r\n	obj.submit();\r\n	//\uc8fc\uc11d\ucc98\ub9ac \ub178\ucc3d\uc6a9 - 2009/01/06\r\n	//n.action = \"/common/jsp/login.jsp\";\r\n	//n.submit();\r\n	\r\n//	params += Form.serialize($(n));\r\n//	pUrl = \"/common/jsp/login.jsp\";\r\n	\r\n//	new ajax.xhr.Request(pUrl, params, login_result, 'POST');\r\n}\r\n\r\nfunction login_result(req){\r\n	if (req.readyState == 4) {\r\n		if (req.status == 200) {\r\n			var xmlDoc = req.responseXML;\r\n			var code = xmlDoc.getElementsByTagName('code').item(0).firstChild.nodeValue;\r\n			var msg = xmlDoc.getElementsByTagName('message').item(0).firstChild.nodeValue;\r\n\r\n			if (code == '00') {	\r\n				var fData = eval(\"(\" + xmlDoc.getElementsByTagName('data').item(0).firstChild.nodeValue + \")\");\r\n				document.location.href = fData[0].user_url;\r\n			}\r\n		} else {\r\n			alert(\"error:login_result.\" + req.status);\r\n		}\r\n	}\r\n}\r\n\r\nfunction KeyChk(){\r\n	var temp=parseInt(event.keyCode);\r\n	\r\n	if (temp==13){\r\n		login_req();\r\n	}\r\n}\r\n</script>\r\n<script language=\"javascript\">\r\n//\uc628\ub85c\ub4dc\uc5d0\uc11c \ub85c\uae34\uc2dc\ub85c \ubcc0\uacbd\r\n//function window::onLoad(){\r\n//	//\ud658\uacbd \ubcc0\uc218 \uc124\uc815\r\n//	var obj = document.myform;\r\n//	obj.action = \"install.jsp\";\r\n//	obj.submit();\r\n//}\r\n\r\n//TFBroker \uc124\uce58 (vista\uc5d0\uc11c \ud544\uc694)\r\nvar BROKER_CLSID = \"clsid:0DFA67D7-B78C-40A7-B583-E7090D5F38C6\";\r\nvar BROKER_CODEBASE = \"/install/TFBroker.cab\";\r\nvar BROKER_VERSION = \"version=1,0,0,4\";\r\nvar Str=\"\";\r\n\r\nif( navigator.userAgent.indexOf(\"Windows NT 6.\") != -1 ){\r\n	Str+= ' <object id=\"BROKER\" classid=\"' + BROKER_CLSID + '\"';\r\n	Str+= '\\n\\t codebase=\"' + BROKER_CODEBASE + '#' + BROKER_VERSION + '\"';\r\n	Str+= '\\n\\t height=\"0\" width=\"0\" >';\r\n	Str+= '\\n\\tNo BROKER Plugin';\r\n	Str+= '\\n</object>';\r\n}\r\ndocument.write(Str);\r\n</script>\r\n</head>\r\n<body border=\"0\" leftmargin=\"0\" topmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\" cellpadding=\"0\" cellspacing=\"0\" scroll=\"no\">\r\n<br>\r\n<br>\r\n<br>\r\n<br>\r\n<table width=\"100%\" height=\"100%\">\r\n	<tr>\r\n		<td align=\"center\" valign=\"middle\">\r\n			<table cellSpacing=\"0\" cellPadding=\"0\" border=\"0\">\r\n				<tr>\r\n					<td><img src=\"/images/login_img_01.gif\"></td>\r\n					<td><img src=\"/images/login_img_02.gif\"></td>\r\n				</tr>\r\n				<tr>\r\n					<td><img src=\"/images/login_img_03.gif\"></td>\r\n					<td background=\"/images/login_img_04.gif\" valign=\"bottom\">\r\n						<form name=\"myform\" action=\"#\">\r\n							<table>\r\n								<tr>\r\n									<td><input type=\"text\" value=\"c190053\" name=\"user_id\" size=\"20\" /><br>\r\n										<input type=\"password\" value=\"c190053\" name=\"user_passwd\" size=\"20\" OnKeyPress=\"JavaScript:KeyChk();\" />\r\n									</td>\r\n									<td><img src=\"/images/login_btn_01.gif\" onclick=\"login_req()\"></td>\r\n									<td><img src=\"/images/login_btn_02.gif\"><br>\r\n										<img src=\"/images/login_btn_03.gif\">\r\n									</td>\r\n								</tr>\r\n							</table>\r\n						</form>\r\n					</td>\r\n				</tr>\r\n				<tr>\r\n					<td><img src=\"/images/login_img_05.gif\"></td>\r\n					<td><img src=\"/images/login_img_06.gif\"></td>\r\n				</tr>\r\n			</table>\r\n		</td>\r\n	</tr>\r\n</table>\r\n</body>\r\n</html>".toCharArray();
    _jsp_string0 = "\r\n\r\n".toCharArray();
  }
}
