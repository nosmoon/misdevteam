<%@ page import="somo.framework.expt.*, chosun.ciis.co.lib.xi.RwXmlWrapper" isErrorPage="true"%>
<%@ page contentType="text/xml; charset=KSC5601" %>

<%---------------------------------------------------------------------------------------------------
 * ���ϸ� : sys_error.jsp
 * ��� : SysException�� ó���Ѵ�. SysException�� ȭ�鿡 ������������ ����Ѵ�.
 * �ۼ����� : 2003-11-03
 * �ۼ��� : ���
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
 ������ : Ȳ����

 ������ �ڵ�
<%
    response.setHeader("cache-Control","no-store"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0);

    StringBuffer errorMessage = new StringBuffer("[ ���� �޼��� - �⺻ ] \n");
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
    }else{
        errorMessage.append(exception.toString()+"\n");
        StackTraceElement[] ste = exception.getStackTrace();
        for(int i=0; i<ste.length; i++) {
            errorMessage.append(ste[i].toString() + "\n");
        }
    }
	
	String tempStr = errorMessage.toString();
%>

<html>
<body>

<table align="center" id="tab_id">
	<tr>
		<td align="center">
			<br><br>
			<img src="/html/comm_img/sys_error.gif">
		</td>
	</tr>
	<tr>
		<td align="center">
			<textarea name="textarea" rows="20" cols="75" class="scroll1" wrap="off" readOnly><%=tempStr%></textarea>
		</td>
	<tr>
</table>


<script language="javascript">
	var tempStr = document.all.tab_id.outerHTML;
    if(parent.jsHideProgress) parent.jsHideProgress();
    top.document.write(tempStr);
</script>

</body>
</html>
----------------------------------------------------------------------------------------------------%>