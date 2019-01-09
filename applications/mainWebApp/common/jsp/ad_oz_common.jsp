<%@ page contentType="text/html; charset=EUC-KR" %>
<%@ page errorPage="/common/jsp/sys_error.jsp"%>
<%@	page import="
        java.sql.*,
        java.text.*,
        java.lang.*,
        java.util.*,
        java.io.*,
        somo.framework.db.*,
        somo.framework.expt.*,
        somo.framework.log.*,
        somo.framework.prop.*,
        somo.framework.servlet.*,
        somo.framework.lib.*,
        somo.framework.util.*"
%>
<%
/*
    String _url   = request.getRequestURL().toString();

    String _root  = _url.substring(0, _url.indexOf(":",5));
    String _port  = _url.substring(_url.indexOf(":",5) + 1, _url.indexOf("/",7));

    _root  = ("http://ciis.chosun.com".equalsIgnoreCase(_root))? _root : "http://ciis.chosun.com" ;
    _port  = ("http://ciis.chosun.com".equalsIgnoreCase(_root))? "8081" : "8081";    
    

	String ozClasssID = "CLSID:0DEF32F8-170F-46f8-B1FF-4BF7443F5F25";
	String ozServerIP = _root+":"+_port+"/oz/server" ;	
*/
    String _url   = request.getRequestURL().toString();

    String _root  = "http://ciis.chosun.com";
    String _port  = "8081";    


	String ozClasssID = "CLSID:0DEF32F8-170F-46f8-B1FF-4BF7443F5F25";
	String ozServerIP = _root+":"+_port+"/oz/server" ;	

%>
<%!
    public String getCookieParameterValue(HttpServletRequest req, String param, boolean required){
        String ret = "";
        Cookie[] cookies = req.getCookies();
        if(cookies != null){
            for(int i=0; i<cookies.length; i++){
                if(cookies[i].getName().equals(param)){
                    ret = Util.Uni2Ksc(cookies[i].getValue());
                }
            }
        }
        if("".equals(ret)) ret = Util.getSessionParameterValue(req, "bonm", true);
        return ret;
    }
%>