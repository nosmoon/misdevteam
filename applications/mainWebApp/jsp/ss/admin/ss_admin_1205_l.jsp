<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1205_l.jsp
* ��� : ������-�۾�-���̱׷��̼�-�������
* �ۼ����� : 2004-03-11
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_MIGRWORKCHKDataSet ds = (SS_L_MIGRWORKCHKDataSet)request.getAttribute("ds");
    int migListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
%>
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="mig_list_id">
		<tr bgcolor="#dddddd" align="center">
			<td width="50" height="23" class="gray" rowspan=2> ������ </td>
			<td width="80" height="23" class="gray" rowspan=2> ���� </td>
			<td width="80" height="23" class="gray" rowspan=2> ������ </td>
			<td width="200" height="23" class="gray" colspan=2> ����DB </td>
			<td width="200" height="23" class="gray" colspan=2> ����DB </td>
			<td width="50" height="23" class="gray" rowspan=2> �Ϸ�Ȯ�� </td>
			<td width="100" height="23" class="gray" rowspan=2> Ȯ������ </td>
		</tr>
		<tr bgcolor="#dddddd" align="center">
			<td width="100" height="23" class="gray"> UPLOAD </td>
			<td width="100" height="23" class="gray"> ��ȯ�Ϸ� </td>
			<td width="100" height="23" class="gray"> UPLOAD </td>
			<td width="100" height="23" class="gray"> ��ȯ�Ϸ� </td>
		</tr>
	<%-- ���̱׷��̼� ó�� ��� --%>
	<%for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MIGRWORKCHKCURCOMMLISTRecord curcommlistRec = (SS_L_MIGRWORKCHKCURCOMMLISTRecord)ds.curcommlist.get(i);%>
        <tr align="left" onClick="mecd_list('<%=curcommlistRec.bocd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
			<td width="50" height="23" class="gray">&nbsp;<%= curcommlistRec.areanm%></td>
			<td width="80" height="23" class="gray">&nbsp;<%= curcommlistRec.deptnm%></td>
			<td width="80" height="23" class="gray">&nbsp;<%= curcommlistRec.bonm%></td>
			<td width="100" height="23" class="gray">&nbsp;<%= curcommlistRec.bodbuptodt%> </td>
			<td width="100" height="23" class="gray">&nbsp;<%= curcommlistRec.boswittodt%></td>
			<td width="100" height="23" class="gray">&nbsp;<%= curcommlistRec.billdbuptodt%></td>
			<td width="100" height="23" class="gray">&nbsp;<%= curcommlistRec.billswittodt%></td>
			<td width="50" height="23" class="gray">&nbsp;<%= curcommlistRec.endcnfmyn%></td>
			<td width="100" height="23" class="gray">&nbsp;<%= curcommlistRec.endcnfmdt%></td>
		</tr>
	<%}%>

    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(migListCount-ds.curcommlist.size()); i++){%>
		<tr>
			<td width="50" height="23" class="gray"> &nbsp; </td>
			<td width="80" height="23" class="gray"> &nbsp; </td>
			<td width="80" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
			<td width="50" height="23" class="gray"> &nbsp; </td>
			<td width="100" height="23" class="gray"> &nbsp; </td>
		</tr>
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>


	<tr bgcolor="#dddddd">
		<td colspan="7" align="center" class="gray">
            <!-- ������ �̵� -->
            <table border="0" cellspacing="0" cellpadding="0" id="page_move">
                <tr>
                    <td align="center" height="2">
                    <!--����-->
                    </td>
                </tr>
                <tr>
                    <td align="center" height="20">
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
                            <jsp:param name = "pagesize" 	value="<%=migListCount%>"/>
                            <jsp:param name = "page_set_gubun" 	value="0"/>
                            </jsp:include>
                        <!--JSP PAGE END------------------------------------------------------------------------------------>
                    </td>
                </tr>
            </table>
            <!-- ������ �̵� -->
        </td>
        <td colspan="2" class="gray">
            <div align="right">
            <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">
            �ѰǼ� : <b><%= ds.getTotalcnt()%>��</b>
            </div>
        </td>
	</tr>
</table>

<script>
    parent.document.all.mig_list_id.outerHTML = mig_list_id.outerHTML;
	parent.jsInit();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>    
</script>

