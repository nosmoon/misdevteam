<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1202_l.jsp
* ��� : ���ົ����  �߼� ����Ʈ
* �ۼ����� : 2004-03-25
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset �ν��Ͻ� ���� �κ�
    PS_L_BILL_TACOM_GRRCPCMDataSet ds = (PS_L_BILL_TACOM_GRRCPCMDataSet)request.getAttribute("ds");
    int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) -ds.curcommlist.size();
%>


<!--����Ʈ -->
<table  cellspacing="0" width="830" cellpadding="0" border="0" id="acqdt_list">
	<tr><td>
		<table  cellspacing="0" width="830" cellpadding="1" border="0" class="gray" bgcolor="#ffffff">
			<tr align="center" bgcolor="#dddddd">
				<td width="90" class="gray" > �������� </td>
				<td width="90" class="gray" > �����Ǽ� </td>
				<td width="160" class="gray" > �����ݾ� </td>
				<td width="90" class="gray" > ����Ǽ� </td>
				<td width="90" class="gray" > �����Ǽ� </td>
				<td width="130" class="gray" > �����ݾ� </td>
				<!--          <td width="80" class="gray" > ������ </td> -->
				<td width="90" class="gray" > �Ա�ó������ </td>
				<td width="90" class="gray" > �Ա����� </td>
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
				<!--����-->
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