<%@ page import="somo.framework.expt.*, 
                 chosun.ciis.co.lib.xi.RwXmlWrapper" %>
<%@ page contentType="text/xml; charset=KSC5601" %>

<%---------------------------------------------------------------------------------------------------
 * ���ϸ� : app_error.jsp
 * ��� : AppException�� ó���Ѵ�. AppException�� alert box�� ����.
 * �ۼ����� : 2003-11-03
 * �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
 * �������� : parent.setEventHandler() �ڵ� �߰�
 * ������ : ��뼷
 * �������� : 2003-11-27
 * ��� : �����ϴ�
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
 * �������� : parent.callAppErrorHandler() �ڵ� �߰�
 * ������ : ���
 * �������� : 2003-12-24
 * ��� : �����ϴ�
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
 * �������� : ������ ĳ�̹��� �ڵ� �߰�
 * ������ : ���
 * �������� : 2003-12-27
 * ��� : �����ϴ�
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
 * �������� : �����޽��� ǥ������ ����
 * ������ : ���
 * �������� : 2004-01-07
 * ��� : �����ϴ�
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-25
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>

<%
    response.setHeader("cache-Control","no-store"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0);

    AppException ae = (AppException)request.getAttribute("appException");

	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	rxw.setErrorMessage(ae.getErrorCode(), ae.getErrorMessage());
	
	rxw.flush(out);

%>

<%----------------------------------------------------------------------------------------------------
 ������ : Ȳ����

 ������ �ڵ�
<%@ page import="somo.framework.expt.*" %>
<%@ page contentType="text/html; charset=KSC5601" %>
<%
    response.setHeader("cache-Control","no-store"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0);

    AppException ae = (AppException)request.getAttribute("appException");

System.out.println("app_error.jsp is called");

%>
<script language="javascript">
    if(parent.jsHideProgress) parent.jsHideProgress();
	var msg = '<%=ae.getErrorMessage()%>';
	var index = msg.indexOf("]");
	var errcode = msg.substring(0, index+1);
	var errmsg = msg.substring(index+1, msg.length);
	alert(errmsg + "\n\n" + errcode);
	
    if(this.name=="conFrame") {
        history.back();
    } else {
        parent.setEventHandler();
        parent.callAppErrorHandler('<%=ae.getErrorCode()%>');
    }
</script>
----------------------------------------------------------------------------------------------------%>

<%----------------------------------------------------------------------------------------------------
 ������ : ��뼷

 ������ �ڵ�
    <script language="javascript">
        alert("[<%=ae.getErrorCode()%>]"+" : "+"<%=ae.getErrorMessage()%>");
    </script>
----------------------------------------------------------------------------------------------------%>

<%----------------------------------------------------------------------------------------------------
 ������ : ���

 ������ �ڵ�
    <script language="javascript">
    alert("[<%=ae.getErrorCode()%>]"+" : "+"<%=ae.getErrorMessage()%>");
    parent.setEventHandler();
</script>
----------------------------------------------------------------------------------------------------%>

<%----------------------------------------------------------------------------------------------------
 ������ : ���

 ������ �ڵ�
<%
    AppException ae = (AppException)request.getAttribute("appException");
%>
<script language="javascript">
    alert("[<%=ae.getErrorCode()%>]"+" : "+"<%=ae.getErrorMessage()%>");
    parent.setEventHandler();
    parent.callAppErrorHandler('<%=ae.getErrorCode()%>');
</script>

----------------------------------------------------------------------------------------------------%>

<%----------------------------------------------------------------------------------------------------
 ������ : ���

 ������ �ڵ�
<%
    response.setHeader("cache-Control","no-store"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0);

    AppException ae = (AppException)request.getAttribute("appException");
%>
<script language="javascript">
    alert("[<%=ae.getErrorCode()%>]"+" : "+"<%=ae.getErrorMessage()%>");
    parent.setEventHandler();
    parent.callAppErrorHandler('<%=ae.getErrorCode()%>');
</script>
----------------------------------------------------------------------------------------------------%>
