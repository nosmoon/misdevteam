<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1250_l.jsp
* 기능 : 지국지원-신문지원물품-비용(영업담당)-상세목록
* 작성일자 : 2004-02-07
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_NWSPITEMCOSTCLMTDataSet ds = (SS_L_NWSPITEMCOSTCLMTDataSet)request.getAttribute("ds");
%>
<table border="0" cellspacing="0" cellpadding="0" id="cost_detail_id">
	<tr><td>
		<table width="830" border="0"  cellpadding="1" cellspacing="0">
			<tr>
				<td  height="27" bgcolor="#EBE9DC" class="title"> 신문지원물품 비용상세 </td>
			</tr>
			<tr>
				<td height="3" colspan="2">
				<!--여백-->
				</td>
			</tr>
		</table>

		<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray">
			<tr bgcolor="#dddddd" align="center" height="23">
				<td class="gray"> 입금액 </td>
				<td width="230" class="gray"> 입금자 </td>
				<td width="200" class="gray"> 잔액 </td>
				<td width="200" class="gray"> 입금일자 </td>
			</tr>
<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_NWSPITEMCOSTCLMTCURCOMMLISTRecord curcommlistRec = (SS_L_NWSPITEMCOSTCLMTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
			<tr align="center">
				<td class="gray" align="right" > <%= Util.comma(curcommlistRec.clamt)%>&nbsp;</td>
				<td width="230" class="gray" align="left"> <%= curcommlistRec.rcpmpersnm%>&nbsp;</td>
				<td width="200" class="gray" align="right" > <%= Util.comma(curcommlistRec.clamtbal)%>&nbsp;</td>
				<td width="200" class="gray" align="center"> <%= Util.convertS(curcommlistRec.clamtdt)%>&nbsp;</td>
			</tr>
<%}%>

	        <tr bgcolor="#dddddd">
	            <td colspan="8" class="gray" height="23" align="right">
					<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 청구금액 <%= Util.comma(ds.getClamamt())%> </b>&nbsp;&nbsp;&nbsp;
					<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 수금누적금액 <%= Util.comma(ds.getClamtacmlamt())%></b>&nbsp;&nbsp;&nbsp;
					<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 수금잔액 <%= Util.comma(ds.getClamtbal())%></b>&nbsp;&nbsp;&nbsp;
					<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt())%>건</b>
	            </td>
	        </tr>

		</table>
	</td></tr>
</table>

<script>
    parent.document.all.cost_detail_id.outerHTML = cost_detail_id.outerHTML;

    // 이벤트 핸들러 호출
	parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>    
</script>
