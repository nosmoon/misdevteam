<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1020_u.jsp
* 기능 : 지국지원-신문지원물품-등록-저장
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<script language="javascript">
    alert("저장되었습니다.");

    // 목록화면을 갱신해준다.
    parent.list_search();

    // 상세화면을 초기화시킨다.
    parent.add();
    parent.nwspitem_detail_form.thumbnailimg.src        =   '/html/img/No_Image.GIF';
    parent.nwspitem_detail_form.item.value              =   '0';
    
    parent.nwspitem_detail_form.thumbnail.select(); 				// 썸네일
	parent.document.selection.clear();
	
	parent.nwspitem_detail_form.popup.select(); 				// 팝업
	parent.document.selection.clear();
</script>
