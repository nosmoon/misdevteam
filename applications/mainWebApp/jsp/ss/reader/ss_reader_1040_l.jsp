<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1040_l.jsp
* ��� : ������Ȳ-��������-�����̷� �̻��̷� ���
* �ۼ����� : 2003-12-30
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SL_L_MOVM_RDRPTCRDataSet ds = (SL_L_MOVM_RDRPTCRDataSet)request.getAttribute("ds");
    int movmHstyListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
%>
<table width="100%" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="hsty_list_id">
	<tr bgcolor="#dddddd" align="center">
		<td width="200" class="gray" height="23"> �̻�����</td>
		<td width="175" class="gray" height="23"> �̻��� ���� </td>
		<td width="175" class="gray" height="23"> �̻��� ���� </td>
	</tr>

	<!--�����̷� ��� ����-->
	<%
	for(int i=0; i<ds.movm_rdrcur.size(); i++){
	    SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord movm_rdrcurRec = (SL_L_MOVM_RDRPTCRMOVM_RDRCURRecord)ds.movm_rdrcur.get(i);%>
	<tr>
		<td width="200" class="gray" align="center"><%=Util.convertS(movm_rdrcurRec.movmdt)%></td>
		<td width="175" class="gray" align="center"> <%=movm_rdrcurRec.trsfbonm %> </td>
		<td width="175" class="gray" align="center"> <%=movm_rdrcurRec.acptbonm %> </td>
	</tr>
	<%}%>
	<!--�����̷� ��� ��-->

    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
	<%for(int j=0; j<movmHstyListCount - ds.movm_rdrcur.size(); j++){%>
	<tr>
		<td width="200" align="center" class="gray">&nbsp;</td>
		<td width="175" class="gray"> &nbsp; </td>
		<td width="175" class="gray" > &nbsp; </td>
	</tr>
	<%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>

	<tr bgcolor="#E8E8E8" align="right">
	    <td  height="25" class="gray" colspan="3">
	        <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�ѰǼ� <b><%= ds.getTotalcnt()%> ��</b>
	    </td>
	</tr>
</table>

<!-- ������ �̵� -->
<table width="100%" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="page_move_hsty">
  <tr>
    <td align="center" height="25" bgcolor="#E8E8E8">
            <!--JSP PAGE START---------------------------------------------------------------------------------->
            <%
                String pageno = request.getParameter("pageno");
                String totalcnt = String.valueOf(ds.getTotalcnt());
            %>
                <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                <jsp:param name = "pageno" 		value="<%=pageno%>"/>
                <jsp:param name = "totalcnt" 	value="<%=totalcnt%>"/>
                <jsp:param name = "js_fn_nm" 	value="page_move_movm_hsty"/>
                <jsp:param name = "pagesize" 	value="<%= movmHstyListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
    </td>
  </tr>
</table>
<!-- ������ �̵� -->

<script language="javascript">
	parent.document.all.hsty_list_id.outerHTML = hsty_list_id.outerHTML;
  	parent.document.all.page_move_hsty.outerHTML = page_move_hsty.outerHTML;
  	
    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
    
<%if(ds.movm_rdrcur.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>  	
</script>