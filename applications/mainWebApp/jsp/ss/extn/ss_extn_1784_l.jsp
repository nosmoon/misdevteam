<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1784_l.jsp
* 기능 : 확장현황-사이버확장-비용관리(영업)-상세목록
* 작성일자 : 2004-04-09
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_EXTN_CYBCOSTDDataSet ds = (SS_L_RDR_EXTN_CYBCOSTDDataSet)request.getAttribute("ds");
%>
<table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
	<tr><td>
		<table width="830" border="0"  cellpadding="1" cellspacing="0">
			<tr>
				<td  height="27" bgcolor="#EBE9DC" class="title"> 사이버확장대회 비용상세 </td>
			</tr>
			<tr>
				<td height="3" colspan="2">
				<!--여백-->
				</td>
			</tr>
		</table>

		<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray">
			<tr bgcolor="#dddddd" align="center">
				<td width="230" class="gray" align="center"> 매체 </td>
				<td width="150" class="gray" align="center"> 인수부수 </td>
				<td width="150" class="gray" align="center"> 산정부수 </td>
				<td width="150" class="gray" align="center"> 기준금액 </td>
				<td width="150" class="gray" align="center"> 비용금액 </td>
			</tr>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_CYBCOSTDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
			<tr align="center">
				<td width="230" class="gray" align="center"> <%= curcommlistRec.medicdnm%>&nbsp;</td>
				<td width="150" class="gray" align="right"> <%= curcommlistRec.acptqty%>&nbsp;</td>
				<td width="150" class="gray" align="right"> <%= curcommlistRec.calcqty%>&nbsp;</td>
				<td width="150" class="gray" align="right"> <%= Util.comma(curcommlistRec.basiamt)%>&nbsp;</td>
				<td width="150" class="gray" align="right"> <%= Util.comma(curcommlistRec.costamt)%>&nbsp;</td>
			</tr>
	<%}%>

		</table>
	</td></tr>
</table>

<script>
    parent.document.all.cost_detail_id.outerHTML = cost_detail_id.outerHTML;
    
<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>    
</script>
