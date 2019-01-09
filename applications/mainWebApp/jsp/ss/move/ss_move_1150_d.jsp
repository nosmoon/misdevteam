<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_move_1125_d.jsp
* 기능 : 이사독자-마감-삭제
* 작성일자 : 2004-01-07
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<script language="javascript">
    alert("삭제되었습니다.");

    // 목록화면을 갱신해준다.
    parent.move_list_search();

    var form1 = parent.document.move_detail_form;	// 상세정보 폼

    // 상세정보 폼의 값을 reset 해준다.
    var form1_elements = form1.elements;
    for( var i =0; i< form1_elements.length; i++) {
        form1_elements(i).value = "";
    }

	// 폼의 accflag 를 'I'로 변경한다.
    parent.document.move_detail_form.accflag.value = 'I'

    // 이벤트 핸들러 호출
    parent.jsInit();

    // 취소 버튼을 disable시킨다.
	parent.document.all.cancel_id.disabled = true;


</script>
