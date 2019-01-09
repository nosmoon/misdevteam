<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1250_s.jsp
* 기능 : 지국Info-지국장정보-지국장소견-상세
* 작성일자 : 2004-05-19
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_BO_HEADIDEADataSet ds = (SS_S_BO_HEADIDEADataSet)request.getAttribute("ds");
%>
<form name="detail_form" method="post">
    <textarea name="idea1"><%= ds.idea1 %></textarea>
</form>

<script>
    // 지국장 소견 검색 폼의 소견을 설정한다.
	parent.bo_head_idea_detail_form.idea1.value = detail_form.idea1.value;
    
    // 이벤트 핸들러 호출
    parent.jsInit();

	// 취소버튼 활성화
	parent.document.all.cancel_id.disabled = false;
	
	// 폼의 accflag 를 'U'로 변경한다.
    parent.document.bo_head_idea_detail_form.accflag.value = 'U'
    
</script>