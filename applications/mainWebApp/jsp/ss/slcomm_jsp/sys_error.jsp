<%@ page import="somo.framework.expt.*, chosun.ciis.ss.com.crm.xi.RwXmlWrapper" isErrorPage="true"%>
<%@ page contentType="text/xml; charset=KSC5601" %>

<%---------------------------------------------------------------------------------------------------
 * 파일명 : sys_error.jsp
 * 기능 : SysException을 처리한다. SysException은 화면에 에러페이지를 출력한다.
 * 작성일자 : 2003-11-03
 * 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
 * 수정내역 : JSP에서 발생하는 에러처리 코드 추가
 * 수정자 : 김대섭
 * 수정일자 : 2003-11-27
 * 백업 : 파일하단
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
 * 수정내역 : 페이지 캐싱방지 코드 추가
 * 수정자 : 김상열
 * 수정일자 : 2003-12-27
 * 백업 : 파일하단
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
 * 수정내역 : Exception 내역 상세화
 * 수정자 : 김상열
 * 수정일자 : 2004-01-06
 * 백업 : 파일하단
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
 * 수정내역 : 에러메시지 출력시 특수문자 처리
 * 수정자 : 김상열
 * 수정일자 : 2004-01-07
 * 백업 : 파일하단
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-01
* 백업파일명: 파일하단
---------------------------------------------------------------------------------------------------%>

<%
    response.setHeader("cache-Control","no-store"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0);

    StringBuffer errorMessage = new StringBuffer("[ 에러 메세지 - 기본 ] \n");
    String errorCode = "ERROR";
    SysException se = (SysException)request.getAttribute("sysException");

    if(se!=null) {
        errorMessage.append(se.getException().toString());
        StackTraceElement[] ste = se.getStackTrace();
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString() + "\n");
        }

        // nested exception..
        ste = se.getException().getStackTrace();
        errorMessage.append("\n[ 에러 메세지 - 첨부 ] \n");
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString() + "\n");
        }
        
        errorCode = "system exception";
    }else{
        errorMessage.append(exception.toString()+"\n");
        StackTraceElement[] ste = exception.getStackTrace();
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString() + "\n");
        }
    }
	
	String tempStr = errorMessage.toString();
	
	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	rxw.setErrorMessage(errorCode, tempStr);
	
	rxw.flush(out);
%>

<%----------------------------------------------------------------------------------------------------
 변경자 : 김대섭

 수정전 코드
<%
    StringBuffer errorMessage = new StringBuffer(new String("<h1>시스템 에러페이지 입니다..</h1>"));
    SysException se = (SysException)request.getAttribute("sysException");

    if(se!=null) {
        StackTraceElement[] ste = se.getStackTrace();
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString());
            errorMessage.append("<br>");
        }
    }
%>
<script language="javascript">
  top.document.write("<%=errorMessage%>");
</script>
<%
    }
%>
----------------------------------------------------------------------------------------------------%>

<%----------------------------------------------------------------------------------------------------
 변경자 : 김대섭

 수정전 코드
<%
    StringBuffer errorMessage = new StringBuffer(new String("<h1>시스템 에러페이지 입니다..</h1>"));
    SysException se = (SysException)request.getAttribute("sysException");

    if(se!=null) {
        StackTraceElement[] ste = se.getStackTrace();
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString());
            errorMessage.append("<br>");
        }
    }else{
        StackTraceElement[] ste = exception.getStackTrace();
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString());
            errorMessage.append("<br>");
        }
    }
%>
<script language="javascript">
  top.document.write("<%=errorMessage%>");
</script>
----------------------------------------------------------------------------------------------------%>
<%----------------------------------------------------------------------------------------------------
 변경자 : 김상열

 수정전 코드
<%
    response.setHeader("cache-Control","no-store"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0);

    StringBuffer errorMessage = new StringBuffer(new String("<h1>시스템 에러페이지 입니다..</h1>"));
    SysException se = (SysException)request.getAttribute("sysException");

    if(se!=null) {
        StackTraceElement[] ste = se.getStackTrace();
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString());
            errorMessage.append("<br>");
        }
    }else{
        StackTraceElement[] ste = exception.getStackTrace();
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString());
            errorMessage.append("<br>");
        }
    }
%>
<script language="javascript">
//  top.document.write("<%=errorMessage%>");
    document.write("<%=errorMessage%>");
</script>
----------------------------------------------------------------------------------------------------%>

<%----------------------------------------------------------------------------------------------------
 변경자 : 김상열

 수정전 코드
<%
    response.setHeader("cache-Control","no-store"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0);

    StringBuffer errorMessage = new StringBuffer(new String("<h1>시스템 에러페이지 입니다..</h1>"));
    SysException se = (SysException)request.getAttribute("sysException");

    if(se!=null) {
        errorMessage.append(se.getException().toString() + "<br>");
        StackTraceElement[] ste = se.getStackTrace();
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString());
            errorMessage.append("<br>");
        }

        // nested exception..
        ste = se.getException().getStackTrace();
        errorMessage.append("<br>(nested exception...)<br>");
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString());
            errorMessage.append("<br>");
        }
    }else{
        errorMessage.append(exception.toString() + "<br>");
        StackTraceElement[] ste = exception.getStackTrace();
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString());
            errorMessage.append("<br>");
        }
    }

    String tempStr = errorMessage.toString().replaceAll("\"", "&quot;");
%>
<script language="javascript">
//    top.document.write("<%=tempStr%>");
    document.write('<%=tempStr%>');
</script>
----------------------------------------------------------------------------------------------------%>

<%----------------------------------------------------------------------------------------------------
 변경자 : 황성진

 수정전 코드
<%@ page import="somo.framework.expt.*" isErrorPage="true"%>
<%@ page contentType="text/html; charset=KSC5601" %>
<%

    response.setHeader("cache-Control","no-store"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0);

    StringBuffer errorMessage = new StringBuffer(new String("<h1>시스템 에러페이지 입니다..</h1>"));
    SysException se = (SysException)request.getAttribute("sysException");

    if(se!=null) {
        errorMessage.append(se.getException().toString() + "<br>");
        StackTraceElement[] ste = se.getStackTrace();
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString());
            errorMessage.append("<br>");
        }

        // nested exception..
        ste = se.getException().getStackTrace();
        errorMessage.append("<br>(nested exception...)<br>");
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString());
            errorMessage.append("<br>");
        }
    }else{
        errorMessage.append(exception.toString() + "<br>");
        StackTraceElement[] ste = exception.getStackTrace();
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString());
            errorMessage.append("<br>");
        }
    }

    String tempStr = errorMessage.toString().replaceAll("\"", "&quot;");
    tempStr = tempStr.replaceAll(";", "&#59;");
    tempStr = tempStr.replaceAll("\n", "<br>");
%>
<%=tempStr%>
<script language="javascript">
    if(parent.jsHideProgress) parent.jsHideProgress();
    top.document.write("<%=tempStr%>");
//    document.write("<%=tempStr%>");
</script>
----------------------------------------------------------------------------------------------------%>