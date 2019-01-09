<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1611_u.jsp
* 기능     : 독자등급관리 독자등급 저장후 리턴되는곳
* 작성일자 : 2004-04-26
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    //dataset 인스턴스 선언부분
	CO_U_RDRCRTS_GRAD_GRNTDataSet ds = (CO_U_RDRCRTS_GRAD_GRNTDataSet)request.getAttribute("ds");
	
	//현재페이지 request
	//String curr_page =   request.getParameter("pageno");
%>

<%
    //정상적으로 처리(저장)되었을 경우
	if("".equals(ds.getChkwantcol()) || ds.getChkwantcol() == null) {
%>

    <script language="javascript">
        alert("저장되었습니다.");

        var lo_form1 = parent.document.search_form;
        
        var ls_pageno = lo_form1.pageno.value;

        parent.list_search(ls_pageno);
    </script>

<%
	//체크사항 발생했을 경우
	} else {
%>

    <script language="javascript">
        alert("<%= ds.getChkmessage()%>");

        var lo_form1 = parent.document.grad_form;

        lo_form1.<%= ds.getChkwantcol()%>.focus();
    </script>

<%
	}
%>
