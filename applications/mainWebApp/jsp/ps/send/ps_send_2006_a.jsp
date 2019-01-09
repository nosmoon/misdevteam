<%@ page language="java" contentType="text/html; charset=euc-kr"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_2006_a.jsp
* 기능 : 지로추가발송 수정
* 작성일자 : 2004/03/16
* 작성자 : 장수환
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
String accflag =  request.getParameter("accflag");
%>

<script language="javascript">
    var lo_form1 = parent.document.all.detail_form;

    parent.list_search();
   if( '<%=accflag%>' == "U" ){
       alert("수정 하였습니다.");
   }else{
       alert("입력 하였습니다.");
   }

	lo_form1.accflag.value = '';
	parent.detail_reset();
    parent.list_search();
</script>