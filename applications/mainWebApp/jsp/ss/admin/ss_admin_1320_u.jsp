<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1320_u.jsp
* 기능 : 관리자-마일리지-지급기준-저장(수정)
* 작성일자 : 2004-03-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<script language="javascript">
    alert("수정되었습니다.");

	var pageno = parent.paybasi_search_form.pageno.value;
    // 목록화면을 갱신해준다.
    parent.page_move(pageno);

    // 폼의 accflag 를 'U'로 변경한다.
    parent.document.paybasi_detail_form.accflag.value = 'U'

    // 취소 버튼을 disable시킨다.
	parent.document.all.cancel_id.disabled = true;

    // 이벤트 핸들러 호출
    parent.jsInit();

</script>
