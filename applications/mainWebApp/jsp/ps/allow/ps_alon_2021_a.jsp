<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* 파일명 : pb_alon_2021_a.jsp
* 기능 : 가지급금 상세 입력/수정
* 작성일자 : 2006-04-07
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%-- 가지급금이 상세 입력/수정되었을 경우 --%>
<script language="javascript">
    var curr_page_no = parent.document.code_search_form.curr_page_no.value;

	alert("입력되었습니다.");

	// 상세정보 폼의 값을 reset 해준다.
	//var form1 = parent.document.emp_detail_form;	// 상세정보 폼
	//var form1_elements = form1.elements;
	//for( var i =0; i< form1_elements.length; i++) {
	//	form1_elements(i).value = "";
	//}
	// 즉 검색 후 추가를 하였다면 다시한번 submit 하여 리스트를 갱신해준다.
    parent.list_search(curr_page_no);
    parent.jsInit();
</script>
