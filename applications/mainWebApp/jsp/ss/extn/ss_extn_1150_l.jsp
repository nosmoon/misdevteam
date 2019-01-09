<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1150_l.jsp
* 기능 : 확장현황-품앗이확장-비용관리(담당)-상세목록
* 작성일자 : 2003-12-02
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_EXTN_EXGCOSTDDataSet ds = (SS_L_RDR_EXTN_EXGCOSTDDataSet)request.getAttribute("ds");
%>
<table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
	<tr><td>
		<table width="830" border="0"  cellpadding="1" cellspacing="0">
			<tr>
				<td  height="27" bgcolor="#EBE9DC" class="title"> 품앗이확장대회 비용상세 </td>
			</tr>
			<tr>
				<td height="3" colspan="2">
				<!--여백-->
				</td>
			</tr>
		</table>

		<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray">
			<tr bgcolor="#dddddd">
				<td rowspan="2" class="gray" align="center"> 매체 </td>
				<td width="200" colspan="2" class="gray" align="center"> 인계부수 </td>
				<td width="200" colspan="2" class="gray" align="center"> 인수부수 </td>
				<td width="100" rowspan="2" class="gray" align="center"> 산정부수 </td>
				<td width="100" rowspan="2" class="gray" align="center"> 기준금액 </td>
				<td width="100" rowspan="2" class="gray" align="center"> 비용금액 </td>
			</tr>
			<tr bgcolor="#dddddd" align="center">
				<td width="100" class="gray" align="center"> 산정 </td>
				<td width="100" class="gray" align="center"> 미산정 </td>
				<td width="100" class="gray" align="center"> 산정 </td>
				<td width="100" class="gray" align="center"> 미산정 </td>
			</tr>
<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_EXGCOSTDCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EXGCOSTDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
			<tr align="center">
				<td class="gray" align="left"><%= curcommlistRec.medicdnm%>&nbsp;</td>
				<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.trsfqty)%>&nbsp;</td>
				<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.uncalctrsfqty)%>&nbsp;</td>
				<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.acptqty)%>&nbsp;</td>
				<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.uncalcacptqty)%>&nbsp;</td>
				<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.calcqty)%>&nbsp;</td>
				<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.basiamt)%>&nbsp;</td>
				<td width="100" class="gray" align="right"><%= Util.comma(curcommlistRec.costamt)%>&nbsp;</td>
			</tr>
<%}%>

		</table>
	</td></tr>
</table>

<script>
    parent.document.all.cost_detail_id.outerHTML = cost_detail_id.outerHTML;
</script>
