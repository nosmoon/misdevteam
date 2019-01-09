<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1015_s.jsp
* 기능 : 지국지원-신문지원물품-등록-상세
* 작성일자 : 2004-01-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_NWSPITEMDataSet ds = (SS_S_NWSPITEMDataSet)request.getAttribute("ds");
%>
<%--
상세화면에서 물품코드와 코드명은 변경할 수 업다. MIS에서 변경가능
--%>
<form name="nwspitem_detail_form" method="post" action="">
	<select name="itemcd" class="sel_all">
		<option value="<%= ds.getItemcd()%>" selected><%= ds.getItemnm() %></option>
	</select>
    <textarea name="remk"><%=ds.getRemk()%></textarea>
</form>

<script language="javascript">
	// 화면 항목 처리
	parent.nwspitem_detail_form.itemclsf.value 			= 	'<%= ds.getItemclsf()%>';				// 물품구분
	parent.nwspitem_detail_form.itemcd.outerHTML		= 	nwspitem_detail_form.itemcd.outerHTML;	// 물품명
	parent.nwspitem_detail_form.sendclsf.value 			= 	'<%= ds.getSendclsf()%>';				// 발송구분
	parent.nwspitem_detail_form.costclsf.value 			= 	'<%= ds.getCostclsf()%>';				// 비용청구구분
	parent.nwspitem_detail_form.rcpmchrgpersclsf.value 	= 	'<%= ds.getRcpmchrgpersclsf()%>';		// 입금담당자
	parent.nwspitem_detail_form.clamchrgpersclsf.value 	= 	'<%= ds.getClamchrgpersclsf()%>';		// 청구담당자
	parent.nwspitem_detail_form.remk.value 				= 	nwspitem_detail_form.remk.value;		// 설명
	parent.nwspitem_detail_form.uprc.value 				= 	'<%= ds.getUprc()%>';					// 단가
	parent.nwspitem_detail_form.qunt.value 				= 	'<%= ds.getQunt()%>';					// 수량
	parent.nwspitem_detail_form.aplcfrdt.value 			= 	'<%= ds.getAplcfrdt()%>';				// 신청시작일자
	parent.nwspitem_detail_form.aplctodt.value 			= 	'<%= ds.getAplctodt()%>';				// 신청종료일자
	parent.nwspitem_detail_form.aplcclostm.value 		= 	'<%= ds.getAplcclostm()%>';				// 신청마감시간
	parent.nwspitem_detail_form.item.value        		= 	'<%= ds.getItemcd()%>';				// 신청마감시간
	//parent.nwspitem_detail_form.thumbnailimg.src        =   '/html/img/No_Image.GIF'	
	parent.nwspitem_detail_form.thumbnailimg.src        =   '/ss/brsup/1016?itemcd=<%= ds.getItemcd()%>'
	
	// 썸네일, 팝업 값 초기화
	parent.nwspitem_detail_form.thumbnail.select(); 				// 썸네일
	parent.document.selection.clear();
	
	parent.nwspitem_detail_form.popup.select(); 				// 팝업
	parent.document.selection.clear();


	
	// 상세폼의 accflag 변경
	parent.nwspitem_detail_form.accflag.value = 'U';

	// 입력항목 처리
	parent.jsInit();

</script>