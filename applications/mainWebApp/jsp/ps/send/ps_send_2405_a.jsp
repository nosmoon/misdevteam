<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_send_2405_a.jsp
* 기능     : 주간조선관리-정산마감-마감및취소
* 작성일자 : 2007-11-01
* 작성자   : 김재일
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    String accflag	=	request.getParameter("accflag");
    String pageno	=	request.getParameter("pageno");

    if(pageno=="" || pageno.equals("")) {
        pageno = "1";
    }
%>

<script language="JavaScript">
<!--
<%
	if(accflag.equals("M")){
%>
    alert("정산마감 완료되었습니다.");
<%
	} else if(accflag.equals("C")){
%>
    alert("정산마감 취소되었습니다.");
<%
	}
%>

	//재검색
	parent.closlist_sear("<%=pageno%>");

    // 화면 초기화
    parent.jsInit();

//-->
</script>
