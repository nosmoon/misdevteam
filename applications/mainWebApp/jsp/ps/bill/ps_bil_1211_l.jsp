<%@ page language="java" contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1203_l.jsp
* ��� : ���ົ����  �߼� �ʱ�ȭ��
* �ۼ����� : 2003-11-25
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
    PS_L_BILL_TACOD_GRRCPCMDataSet ds=(PS_L_BILL_TACOD_GRRCPCMDataSet)request.getAttribute("ds"); //request dataset

    int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) -ds.curcommlist.size();
%>

<!--�˻� -->

<table width="830" border="0" cellspacing="0" cellpadding="0" id="acqdt_detl_list">
	<tr><td>

		<table width="830" border="0" cellspacing="0" cellpadding="2">
			<tr>
				<td bgcolor="#EBE9DC" class="title">�󼼸��</td>
				<td bgcolor="#EBE9DC" class="title" width="60" align="right"> <img src="/html/comm_img/bu_print.gif" width="39" height="19" border="0" align="absmiddle" onClick="print_list()" style="cursor:hand;" >
				</td>
			</tr>
			<tr>
				<td height="3" colspan="2">
				<!--����-->
				</td>
			</tr>
		</table>
	</td></tr>
	<tr><td>
	<!--����Ʈ -->
		<table  cellspacing="0" width="830" class="gray" cellpadding="1" border="0" bgcolor="#FFFFFF">
			<tr bgcolor="#dddddd" align="center">
                <td width="110" class="gray" > ó������</td>
				<td width="130" class="gray" > ���ڹ�ȣ</td>
				<td width="100" class="gray" > ����</td>
				<td width="100" class="gray" > ������ü</td>
				<td width="60" class="gray" > �Աݱݾ�</td>
				<td width="60" class="gray" > ������</td>
				<td width="80" class="gray" > ��������</td>
				<td width="80" class="gray" > �Աݹݿ����� </td>
				<td width="100" class="gray" > ���</td>
			</tr>
			<%
			//���� �����͸� �˻� ���
			for(int i=0; i<ds.curcommlist.size();i++) {
			PS_L_BILL_TACOD_GRRCPCMCURCOMMLISTRecord rec=(PS_L_BILL_TACOD_GRRCPCMCURCOMMLISTRecord)ds.curcommlist.get(i);

			%>
			<tr onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''" >
				<td   class="gray" > <%=rec.getBonm() %> </td>
                <td   class="gray" > <%=rec.getRdr_no() %> </td>
				<td   class="gray" > <%=rec.getRdrnm()%> </td>
				<td   class="gray" > <%=rec.getMedinm()%> </td>
				<td   class="gray" align="right" > <%=Util.comma(rec.getAmt())%></td>
				<td   class="gray" align="right" > <%=rec.getRecpbrchcd()%></td>
				<td   class="gray" align="center" ><%=Util.convertS(Util.checkString(rec.getRecpdt()))%> </td>
				<td   class="gray" > <%=rec.getRcpmrflyn()%></td>
				<td   class="gray" > <%=rec.getRecpclsf()%> -- <%=rec.getTbstprocclsf()%> --<%=rec.getRcpmrflclsf()%></td>
			</tr>
			<%
			}
			for(int i=0; i< no_data_page; i++) {
			%>
			<tr>
				<td   class="gray" > &nbsp; </td>
                <td   class="gray" > &nbsp; </td>
				<td   class="gray" > &nbsp; </td>
				<td   class="gray" >&nbsp; </td>
				<td   class="gray" align="right" >&nbsp;</td>
				<td   class="gray" align="right" > &nbsp;</td>
				<td   class="gray" align="center" > &nbsp; </td>
				<td   class="gray" > &nbsp;</td>
				<td   class="gray" >&nbsp;</td>
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
		<tr>
			<td align="center" height="24" bgcolor="#E8E8E8">
			<!--JSP PAGE START---------------------------------------------------------------------------------->
			<%
			String curr_page_no = request.getParameter("curr_page_no");
			String total_records = String.valueOf(ds.getTotalcnt());
			String js_fn_nm = request.getParameter("js_fn_nm");
			%>
			<!--JSP PAGE START---------------------------------------------------------------------------------->
			<jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
			<jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
			<jsp:param name = "total_records" 	value="<%=total_records%>"/>
			<jsp:param name = "js_fn_nm" 			value="page_move_detl"/>
			<jsp:param name = "records_per_page" 	value="10"/>
			<jsp:param name = "page_set_gubun" 	value="0"/>
			</jsp:include>

			<!--JSP PAGE END------------------------------------------------------------------------------------>
			</td>
		</tr>
		</table>
	</td></tr>
</table>
<!-- parent.document.all.navi.outerHTML = navi.outerHTML; -->
<script>
parent.document.all.acqdt_detl_list.outerHTML = acqdt_detl_list.outerHTML;
parent.setEventHandler();
</script>