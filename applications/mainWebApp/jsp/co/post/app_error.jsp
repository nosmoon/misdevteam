<%@ page import="somo.framework.expt.*, 
                 chosun.ciis.co.lib.xi.RwXmlWrapper" %>
<%@ page contentType="text/xml; charset=KSC5601" %>

<%---------------------------------------------------------------------------------------------------
 * 파일명 : app_error.jsp
 * 기능 : AppException을 처리한다. AppException은 alert box를 띄운다.
 * 작성일자 : 2003-11-03
 * 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
 * 수정내역 : parent.setEventHandler() 코드 추가
 * 수정자 : 김대섭
 * 수정일자 : 2003-11-27
 * 백업 : 파일하단
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
 * 수정내역 : parent.callAppErrorHandler() 코드 추가
 * 수정자 : 김상열
 * 수정일자 : 2003-12-24
 * 백업 : 파일하단
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
 * 수정내역 : 페이지 캐싱방지 코드 추가
 * 수정자 : 김상열
 * 수정일자 : 2003-12-27
 * 백업 : 파일하단
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
 * 수정내역 : 에러메시지 표시형식 변경
 * 수정자 : 김상열
 * 수정일자 : 2004-01-07
 * 백업 : 파일하단
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

    AppException ae = (AppException)request.getAttribute("appException");

	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	rxw.setErrorMessage(ae.getErrorCode(), ae.getErrorMessage());
	
	rxw.flush(out);

%>

<%----------------------------------------------------------------------------------------------------
 변경자 : 황성진

 수정전 코드
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
 변경자 : 김대섭

 수정전 코드
    <script language="javascript">
        alert("[<%=ae.getErrorCode()%>]"+" : "+"<%=ae.getErrorMessage()%>");
    </script>
----------------------------------------------------------------------------------------------------%>

<%----------------------------------------------------------------------------------------------------
 변경자 : 김상열

 수정전 코드
    <script language="javascript">
    alert("[<%=ae.getErrorCode()%>]"+" : "+"<%=ae.getErrorMessage()%>");
    parent.setEventHandler();
</script>
----------------------------------------------------------------------------------------------------%>

<%----------------------------------------------------------------------------------------------------
 변경자 : 김상열

 수정전 코드
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
 변경자 : 김상열

 수정전 코드
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
