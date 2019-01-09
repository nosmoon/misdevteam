<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1150_l.jsp
* ��� : ������-�۾�-���̱׷��̼�-����DB���ε� �۾�����
* �ۼ����� : 2004-03-12
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_MIGRWORKPTCRDataSet ds = (SS_L_MIGRWORKPTCRDataSet)request.getAttribute("ds");
    int migListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
%>
<table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="mig_ptcr_id">
	<tr bgcolor="#dddddd" align="center" height="23">
		<td width="120" class="gray">�ð�(����/����)</td>
		<td width="140" class="gray">���̺�(�ҽ�/Ÿ��)</td>
		<td width="110" class="gray">������(����/��ȯ)</td>
		<td class="gray">����([�ڵ�]/�޼���)</td>
	</tr>
	
	<%-- �۾��̷� ��� ���� --%>	
	<%for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MIGRWORKPTCRCURCOMMLISTRecord curcommlistRec = (SS_L_MIGRWORKPTCRCURCOMMLISTRecord)ds.curcommlist.get(i);%>
	<tr>
		<td width="120" class="gray" align="center"><%= Util.Timestamp2Str(curcommlistRec.workfrdt,"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp;</td>
		<td width="140" class="gray" align="left">&nbsp;<%= curcommlistRec.srctbl%></td>
		<td width="110" class="gray" align="right"><%= Util.comma(curcommlistRec.abstrnoit)%>&nbsp;</td>
		<td rowspan="2" class="gray" align="left">
			<%if(!"".equals(curcommlistRec.errcd)){%>
				[<b><%= curcommlistRec.errcd%></b>]
			<%}%>				
			&nbsp;&nbsp; <font color="red"><%= curcommlistRec.errmsg%></font>
		</td>
	</tr>
	<tr>
		<td width="120" class="gray" align="center"><%= Util.Timestamp2Str(curcommlistRec.worktodt,"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp;</td>
		<td width="140" class="gray" align="left">&nbsp;<%= curcommlistRec.targtbl%></td>
		<td width="110" class="gray" align="right"><%= Util.comma(curcommlistRec.switnoit)%>&nbsp;</td>
	</tr>
    <%}%>
    <%-- �۾��̷� ��� �� --%>

    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(migListCount-ds.curcommlist.size()); i++){%>
	<tr align="center">
		<td width="120" class="gray">&nbsp;</td>
		<td width="140" class="gray">&nbsp;</td>
		<td width="110" class="gray">&nbsp;</td>
		<td rowspan="2" class="gray">&nbsp;</td>
	</tr>
	<tr align="center">
		<td width="120" class="gray">&nbsp;</td>
		<td width="140" class="gray">&nbsp;</td>
		<td width="110" class="gray">&nbsp;</td>
	</tr>
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>

	<tr bgcolor="#dddddd" height="23">
		<td colspan="4" class="gray" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.getTotalcnt())%> �� </b>
		</td>
	</tr>    
</table>    
    
<!-- ������ �̵� -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move_ptcr">
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
            <jsp:param name = "pagesize" 	value="<%= migListCount%>"/>
            <jsp:param name = "page_set_gubun" 	value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->

<script>
    parent.document.all.mig_ptcr_id.outerHTML = mig_ptcr_id.outerHTML;
    parent.document.all.page_move_ptcr.outerHTML = page_move_ptcr.outerHTML;

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();    

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>    
</script>  