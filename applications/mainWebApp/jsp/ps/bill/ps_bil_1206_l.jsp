<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1202_l.jsp
* 기능 : 단행본독자  발송 리스트
* 작성일자 : 2004-03-25
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset 인스턴스 선언 부분
    PS_L_BILL_TACOM_GRRCPCMDataSet ds = (PS_L_BILL_TACOM_GRRCPCMDataSet)request.getAttribute("ds");
    int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) -ds.curcommlist.size();
%>


<!--리스트 -->
<table  cellspacing="0" width="830" cellpadding="0" border="0" id="acqdt_list">
	<tr><td>
		<table  cellspacing="0" width="830" cellpadding="1" border="0" class="gray" bgcolor="#ffffff">
			<tr align="center" bgcolor="#dddddd">
				<td width="90" class="gray" > 수취일자 </td>
				<td width="90" class="gray" > 수납건수 </td>
				<td width="160" class="gray" > 수납금액 </td>
				<td width="90" class="gray" > 정상건수 </td>
				<td width="90" class="gray" > 오류건수 </td>
				<td width="130" class="gray" > 오류금액 </td>
				<!--          <td width="80" class="gray" > 수수료 </td> -->
				<td width="90" class="gray" > 입금처리구분 </td>
				<td width="90" class="gray" > 입금일자 </td>
			</tr>
<%
for(int i=0; i<ds.curcommlist.size();i++) {
PS_L_BILL_TACOM_GRRCPCMCURCOMMLISTRecord rec=(PS_L_BILL_TACOM_GRRCPCMCURCOMMLISTRecord)ds.curcommlist.get(i);
int total_noit = rec.getNormnoit() + rec.getRejectnoit() + rec.getIntngironoit();
int total_amt = rec.getNormamt() + rec.getRejectamt() + rec.getIntngiroamt();
%>
			<tr onclick="javascript:acqdt_detl_list(1,'<%=rec.getAcqdt()%>','<%=rec.getAcqno()%>','<%=rec.getGirono()%>')"  onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''" style="cursor:hand;" >
				<td width="90" class="gray" align="center" > <%=Util.convertS(Util.checkString(rec.getAcqdt()))%> </td>
				<td width="90" class="gray" align="right" >  <%=Util.comma(total_noit)%> </td>
				<td width="160" class="gray" align="right" > <%=Util.comma(total_amt)%> </td>
				<td width="90" class="gray" align="right" >  <%=Util.comma(rec.getNormnoit())%> </td>
				<td width="90" class="gray" align="right" > <%=Util.comma(rec.getRejectnoit())%> </td>
				<td width="130" class="gray" align="right" > <%=Util.comma(rec.getRejectamt())%> </td>
				<td width="90" class="gray" > <%=rec.getRcpmrflendyn()%> </td>
				<td width="90" class="gray" align="center" >  <%=rec.getIncmgdt().equals("")? "&nbsp;" : Util.convertS(Util.checkString(rec.getIncmgdt()))%> </td>
			</tr>
<%
}
for(int i=0; i< no_data_page; i++) {
%>
			<tr>
				<td width="90" class="gray" align="center" >  &nbsp; </td>
				<td width="90" class="gray" align="right" >  &nbsp; </td>
				<td width="160" class="gray" align="right" >  &nbsp; </td>
				<td width="90" class="gray" align="right" >  &nbsp; </td>
				<td width="90" class="gray" align="right" >  &nbsp;  </td>
				<td width="130" class="gray" align="right" >  &nbsp; </td>
				<td width="90" class="gray" >  &nbsp;  </td>
				<td width="90" class="gray" align="center" >  &nbsp;  </td>
			</tr>
<%
}
%>
		</table>
	</td></tr>
	<tr><td>
	<!---button-->
		<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2">
			<tr>
				<td align="center" height="2">
				<!--여백-->
				</td>
			</tr>
			<tr height="24">
				<td align="center" height="24" bgcolor="#E8E8E8">
				<!--JSP PAGE START---------------------------------------------------------------------------------->
				<%
				String curr_page_no = request.getParameter("curr_page_no");
				String total_records = String.valueOf(ds.getTotalcnt());

				String js_fn_nm = request.getParameter("js_fn_nm");
				%>
				<jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
				<jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
				<jsp:param name = "total_records" 	value="<%=total_records%>"/>
				<jsp:param name = "js_fn_nm" 			value="<%=js_fn_nm%>"/>
				<jsp:param name = "records_per_page" 	value="5"/>
				<jsp:param name = "page_set_gubun" 	value="0"/>
				</jsp:include>

				<!--JSP PAGE END------------------------------------------------------------------------------------>

				</td>
			</tr>
		</table>
	</td></tr>
</table>

<script>
parent.document.all.acqdt_list.outerHTML = acqdt_list.outerHTML;
parent.acqdt_form.acqdt_1.focus();
parent.setEventHandler();
</script>