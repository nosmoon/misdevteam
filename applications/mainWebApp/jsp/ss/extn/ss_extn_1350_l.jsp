<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1350_l.jsp
* ��� : Ȯ����Ȳ-���Ȯ��-�۱ݰ���-���
* �ۼ����� : 2003-12-15
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_EXTN_EMPRMTTDataSet ds = (SS_L_RDR_EXTN_EMPRMTTDataSet)request.getAttribute("ds");
	int rmttListCount	= 10;		// �� ȭ��� ����Ʈ �׸� ��
%>
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="rmtt_list_id">
    <form name="rmtt_list_form" method="post" action="" >
        <input name="print" type="hidden" value ="">
        <input name="print" type="hidden" value ="">
		<tr bgcolor="#DDDDDD" height="23">
			<td width="100" class="gray" align="center">��ȸ��</td>
			<td width="90"  class="gray" align="center">�̸�</td>
			<td width="100" class="gray" align="center">ȸ��</td>
			<td width="90"  class="gray" align="center">�μ�</td>
			<td width="100" class="gray" align="center">������</td>
			<td width="100" class="gray" align="center">����</td>
			<td width="150" class="gray" align="center">���¹�ȣ</td>
			<td class="gray" align="center">�ݾ�</td>
		</tr>
<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_EMPRMTTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EMPRMTTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
        <tr>
			<td width="100" class="gray" align="left"><%= curcommlistRec.campnm%>&nbsp;</td>
			<td width="90"  class="gray" align="left"><%= curcommlistRec.empnm%>&nbsp;</td>
			<td width="100" class="gray" align="left"><%= curcommlistRec.empcmpynm%>&nbsp;</td>
			<td width="90"  class="gray" align="left"><%= curcommlistRec.empdeptnm%>&nbsp;</td>
			<td width="100" class="gray" align="left"><%= curcommlistRec.deps_persnm%>&nbsp;</td>
			<td width="100" class="gray" align="left"><%= curcommlistRec.banknm%>&nbsp;</td>
			<td width="150" class="gray" align="left"><%= curcommlistRec.acctno%>&nbsp;</td>
			<td class="gray" align="right"><%= Util.comma(curcommlistRec.alonamt)%>&nbsp;</td>
		</tr>
<%}%>

    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(rmttListCount-ds.curcommlist.size()); i++){%>
	    <tr>
	        <td width="100" class="gray" align="center">&nbsp;</td>
	        <td width="90"  class="gray" align="center">&nbsp;</td>
	        <td width="100" class="gray" align="center">&nbsp;</td>
	        <td width="90"  class="gray" align="center">&nbsp;</td>
	        <td width="100" class="gray" align="center">&nbsp;</td>
	        <td width="100" class="gray" align="center">&nbsp;</td>
	        <td width="150" class="gray" align="right">&nbsp;</td>
	        <td class="gray" align="right">&nbsp;</td>
	    </tr>
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>

		<tr bgcolor="#dddddd">
			<td colspan="8" class="gray" align="right" height="23">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѱݾ� <%= Util.comma(ds.getTotalalonamt())%> �� </b>&nbsp;&nbsp;&nbsp;
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
			</td>
		</tr>
    </form>
    </table>
<!-- ������ �̵� -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
    <tr>
        <td align="center" height="2">
        <!--����-->
        </td>
    </tr>
    <tr>
        <td align="center" height="24" bgcolor="#E8E8E8">
            <!--JSP PAGE START---------------------------------------------------------------------------------->
            <%
                String pageno = request.getParameter("pageno");
                String totalcnt = String.valueOf(ds.getTotalcnt());
                String js_fn_nm = request.getParameter("js_fn_nm");
            %>
                <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                <jsp:param name = "pageno" 		value="<%=pageno%>"/>
                <jsp:param name = "totalcnt" 	value="<%=totalcnt%>"/>
                <jsp:param name = "js_fn_nm" 	value="<%=js_fn_nm%>"/>
                <jsp:param name = "pagesize" 	value="<%= rmttListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->
<script>
    parent.document.all.rmtt_list_id.outerHTML = rmtt_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
        
    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();    
    
<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>    
</script>
