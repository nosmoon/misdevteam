<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1705_l.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����-���
* �ۼ����� : 2004-04-06
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_CYBCAMPDataSet ds = (SS_L_RDR_EXTN_CYBCAMPDataSet)request.getAttribute("ds");
	int campListCount = 12;
%>
<table width="490"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="camp_list_id">
<form name="camp_list_form" method="post" action="">
    <input name="rdr_extncampno" type="hidden" value ="">
    <tr>
        <td height="25" class="gray"  align="center" bgcolor="#DDDDDD"> ���ظ�</td>
        <td height="25" class="gray"  align="center" width="135" bgcolor="#DDDDDD">��������</td>
        <td height="25" class="gray"  align="center" width="135" bgcolor="#DDDDDD">��������</td>
<%--            
        <td height="25" class="gray"  align="center" width="90" bgcolor="#DDDDDD"> ��������</td>
--%>            
    </tr>
<%-- ���̹�Ȯ����� ��� ���--%>
<%  for(int i=0; i<ds.curcommlist.size(); i++){
        SS_L_RDR_EXTN_CYBCAMPCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_CYBCAMPCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- ���̹�Ȯ����� �� ��ũ -->
    <tr bgcolor="" onclick="camp_detail_view('<%= curcommlistRec.rdr_extncampno%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
        <td height="25" class="gray" align="center"><%= curcommlistRec.campnm%>&nbsp;</td>
        <td class="gray" align="center" height="25" width="90"><%= Util.convertS(curcommlistRec.frdt) %>&nbsp;</td>
        <td class="gray" align="center" height="25" width="90"><%= Util.convertS(curcommlistRec.todt) %>&nbsp;</td>
<%--        
        <td class="gray" align="center" height="25" width="90"><%= Util.convertS(curcommlistRec.closdt) %>&nbsp;</td>
--%>        
    </tr>
<%}%>
<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
<%for(int i=0; i<(campListCount-ds.curcommlist.size()); i++){%>
    <tr>
        <td height="25" class="gray" align="center">&nbsp;</td>
        <td class="gray" align="center" height="25" width="135">&nbsp;</td>
        <td class="gray" align="center" height="25" width="135">&nbsp;</td>
<%--        
        <td class="gray" align="center" height="25" width="90">&nbsp;</td>
--%>        
    </tr>
<%}%>
<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>
    <tr bgcolor="#DDDDDD" align="right">
        <td  height="25" class="gray" colspan="3"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.totalcnt) %> �� </b></td>
    </tr>
</form>
</table>

<!-- ������ �̵� -->
<table width="490" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
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
                <jsp:param name = "pagesize" 	value="10"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->

<script>
    parent.document.all.camp_list_id.outerHTML = camp_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    
    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
    
    // ȭ�� �ʱ�ȭ
    parent.camp_add();

<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>     
</script>