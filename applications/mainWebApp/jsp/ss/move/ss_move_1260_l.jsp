<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_move_1260_l.jsp
* 기능 : 이사독자-비용(지원담당)-상세목록
* 작성일자 : 2004-01-09
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_MOVM_RDRCOSTDDataSet ds = (SS_L_MOVM_RDRCOSTDDataSet)request.getAttribute("ds");
%>
<table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
	<tr><td>
		<table width="830" border="0"  cellpadding="1" cellspacing="0">
			<tr>
				<td  height="27" bgcolor="#EBE9DC" class="title"> 이사독자 비용상세 </td>
			</tr>
			<tr>
				<td height="3" colspan="2">
				<!--여백-->
				</td>
			</tr>
		</table>

		<table width="830" border="0" cellspacing="1" cellpadding="0" class="gray">
			<tr bgcolor="#dddddd" align="center" height="23">
				<td class="gray">매체</td>
				<td class="gray" width="40">구분</td>
				<td class="gray" width="40">부수</td>
				<td class="gray" width="75">비산정부수</td>
				<td class="gray" width="75">산정부수</td>
				<td class="gray" width="70">기준금액</td>
				<td class="gray" width="70">수당</td>
				<td class="gray" width="80">선납금(-)</td>
				<td class="gray" width="80">선납수수료(+)</td>
				<td class="gray" width="110">마일리지분담금(+)</td>
				<td class="gray" width="80">정산금</td>
			</tr>
<%-- 이사독자 비용 상세 목록--%>
<%	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MOVM_RDRCOSTDCURCOMMLISTRecord curcommlistRec = (SS_L_MOVM_RDRCOSTDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
			<tr>
				<td class="gray" rowspan="2" align="left"> <%= curcommlistRec.medicdnm%> </td>
				<td class="gray" width="40" align="center"> 인계 </td>
				<td class="gray" width="40" align="right"><%= Util.comma(curcommlistRec.trsfqty)%>&nbsp;</td>
				<td class="gray" width="75" align="right"><%= Util.comma(curcommlistRec.uncalctrsfqty) %>&nbsp;</td>
				<td class="gray" width="75" align="right"><%= Util.comma(curcommlistRec.calctrsfqty) %>&nbsp;</td>
				<td class="gray" width="70" align="right" rowspan="2"><%= Util.comma(curcommlistRec.basiamt) %>&nbsp;</td>
				<td class="gray" width="70" align="right"><%= Util.comma(curcommlistRec.trsfalonamt) %>&nbsp;</td>
				<td class="gray" width="80" align="right"><%= Util.comma(curcommlistRec.trsfppymtamt) %>&nbsp;</td>
				<td class="gray" width="80" align="right"><%= Util.comma(curcommlistRec.trsfppymtcoms) %>&nbsp;</td>
				<td class="gray" width="110" align="right"><%= Util.comma(curcommlistRec.trsfmilgallmamt) %>&nbsp;</td>
				<td class="gray" width="80" align="right"><%= Util.comma(curcommlistRec.trsfcalcamt) %>&nbsp;</td>
			</tr>
			<tr>
				<td class="gray" width="40" align="center"> 인수 </td>
				<td class="gray" width="40" align="right"><%= Util.comma(curcommlistRec.acptqty) %>&nbsp;</td>
				<td class="gray" width="75" align="right"><%= Util.comma(curcommlistRec.uncalcacptqty) %>&nbsp;</td>
				<td class="gray" width="75" align="right"><%= Util.comma(curcommlistRec.calcacptqty) %>&nbsp;</td>
				<td class="gray" width="70" align="right"><%= Util.comma(curcommlistRec.acptalonamt) %>&nbsp;</td>
				<td class="gray" width="80" align="right"><%= Util.comma(curcommlistRec.acptppymtamt) %>&nbsp;</td>
				<td class="gray" width="80" align="right"><%= Util.comma(curcommlistRec.acptppymtcoms) %>&nbsp;</td>
				<td class="gray" width="110" align="right"><%= Util.comma(curcommlistRec.acptmilgallmamt) %>&nbsp;</td>
				<td class="gray" width="80" align="right"><%= Util.comma(curcommlistRec.acptcalcamt) %>&nbsp;</td>
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
