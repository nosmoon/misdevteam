<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1105_l.jsp
* ��� : Ȯ����Ȳ-ǰ����Ȯ��-��ȸ����-���
* �ۼ����� : 2003-11-24
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_EXGCAMPDataSet ds = (SS_L_RDR_EXTN_EXGCAMPDataSet)request.getAttribute("ds");
	int campListCount = 10;
%>
<table width="490"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="camp_list_id">
<form name="camp_list_form" method="post" action="">
    <input name="rdr_extncampno" type="hidden" value ="">
    <tr height="25">
        <td class="gray"  align="center" bgcolor="#DDDDDD">��ȸ��</td>
        <td class="gray"  align="center" width="90" bgcolor="#DDDDDD">��������</td>
        <td class="gray"  align="center" width="90" bgcolor="#DDDDDD">��������</td>
        <td class="gray"  align="center" width="90" bgcolor="#DDDDDD">�����������</td>
    </tr>
<%-- ǰ����Ȯ���ȸ ��� ���--%>
<%  for(int i=0; i<ds.curcommlist.size(); i++){
        SS_L_RDR_EXTN_EXGCAMPCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EXGCAMPCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- ǰ����Ȯ���ȸ �� ��ũ -->
    <tr height="25" bgcolor="" onclick="camp_detail_view('<%= curcommlistRec.rdr_extncampno%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
        <td class="gray" align="left">&nbsp;<%= curcommlistRec.campnm%></td>
        <td class="gray" align="center" width="90"><%= Util.convertS(curcommlistRec.frdt) %>&nbsp;</td>
        <td class="gray" align="center" width="90"><%= Util.convertS(curcommlistRec.todt) %>&nbsp;</td>
        <td class="gray" align="center" width="90"><%= Util.convertS(curcommlistRec.closdt) %>&nbsp;</td>
    </tr>
<%}%>
<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
<%for(int i=0; i<(campListCount-ds.curcommlist.size()); i++){%>
    <tr height="25">
        <td class="gray" align="left">&nbsp;</td>
        <td class="gray" align="center" width="90">&nbsp;</td>
        <td class="gray" align="center" width="90">&nbsp;</td>
        <td class="gray" align="center" width="90">&nbsp;</td>
    </tr>
<%}%>
<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>
    <tr bgcolor="#E8E8E8" align="right">
        <td  height="25" class="gray" colspan="4">
        	<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> �ѰǼ� <%= Util.comma(ds.totalcnt) %> ��</b>
        </td>
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
    
    // �� �ʱ�ȭ
    parent.camp_add();
    
    // ȭ�� �ʱ�ȭ
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>     
</script>