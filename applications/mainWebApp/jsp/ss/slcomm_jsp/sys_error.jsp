<%@ page import="somo.framework.expt.*, chosun.ciis.ss.com.crm.xi.RwXmlWrapper" isErrorPage="true"%>
<%@ page contentType="text/xml; charset=KSC5601" %>

<%---------------------------------------------------------------------------------------------------
 * ���ϸ� : sys_error.jsp
 * ��� : SysException�� ó���Ѵ�. SysException�� ȭ�鿡 ������������ ����Ѵ�.
 * �ۼ����� : 2003-11-03
 * �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
 * �������� : JSP���� �߻��ϴ� ����ó�� �ڵ� �߰�
 * ������ : ��뼷
 * �������� : 2003-11-27
 * ��� : �����ϴ�
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
 * �������� : ������ ĳ�̹��� �ڵ� �߰�
 * ������ : ���
 * �������� : 2003-12-27
 * ��� : �����ϴ�
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
 * �������� : Exception ���� ��ȭ
 * ������ : ���
 * �������� : 2004-01-06
 * ��� : �����ϴ�
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
 * �������� : �����޽��� ��½� Ư������ ó��
 * ������ : ���
 * �������� : 2004-01-07
 * ��� : �����ϴ�
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-01
* ������ϸ�: �����ϴ�
---------------------------------------------------------------------------------------------------%>

<%
    response.setHeader("cache-Control","no-store"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0);

    StringBuffer errorMessage = new StringBuffer("[ ���� �޼��� - �⺻ ] \n");
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
        errorMessage.append("\n[ ���� �޼��� - ÷�� ] \n");
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
	
	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	rxw.setErrorMessage(errorCode, tempStr);
	
	rxw.flush(out);
%>

<%----------------------------------------------------------------------------------------------------
 ������ : ��뼷

 ������ �ڵ�
<%
    StringBuffer errorMessage = new StringBuffer(new String("<h1>�ý��� ���������� �Դϴ�..</h1>"));
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
 ������ : ��뼷

 ������ �ڵ�
<%
    StringBuffer errorMessage = new StringBuffer(new String("<h1>�ý��� ���������� �Դϴ�..</h1>"));
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
 ������ : ���

 ������ �ڵ�
<%
    response.setHeader("cache-Control","no-store"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0);

    StringBuffer errorMessage = new StringBuffer(new String("<h1>�ý��� ���������� �Դϴ�..</h1>"));
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
 ������ : ���

 ������ �ڵ�
<%
    response.setHeader("cache-Control","no-store"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0);

    StringBuffer errorMessage = new StringBuffer(new String("<h1>�ý��� ���������� �Դϴ�..</h1>"));
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
 ������ : Ȳ����

 ������ �ڵ�
<%@ page import="somo.framework.expt.*" isErrorPage="true"%>
<%@ page contentType="text/html; charset=KSC5601" %>
<%

    response.setHeader("cache-Control","no-store"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0);

    StringBuffer errorMessage = new StringBuffer(new String("<h1>�ý��� ���������� �Դϴ�..</h1>"));
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