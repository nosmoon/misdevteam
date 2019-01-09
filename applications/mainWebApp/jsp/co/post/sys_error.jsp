<%@ page import="somo.framework.expt.*, chosun.ciis.co.lib.xi.RwXmlWrapper" isErrorPage="true"%>
<%@ page contentType="text/xml; charset=KSC5601" %>

<%---------------------------------------------------------------------------------------------------
 * 파일명 : sys_error.jsp
 * 기능 : SysException을 처리한다. SysException은 화면에 에러페이지를 출력한다.
 * 작성일자 : 2003-11-03
 * 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-25
* 백업파일명: 
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
 변경자 : 황성진

 수정전 코드
<%
    response.setHeader("cache-Control","no-store"); //HTTP 1.1
    response.setHeader("Pragma","no-cache"); //HTTP 1.0
    response.setDateHeader ("Expires", 0);

    StringBuffer errorMessage = new StringBuffer("[ 에러 메세지 - 기본 ] \n");
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