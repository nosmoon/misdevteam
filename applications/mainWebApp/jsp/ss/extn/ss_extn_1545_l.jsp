<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1545_l.jsp
* ��� : Ȯ����Ȳ-Ȯ��뿪���-(Ȯ����)-���
* �ۼ����� : 2003-12-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_SERVCLOSDataSet ds = (SS_L_RDR_EXTN_SERVCLOSDataSet)request.getAttribute("ds");
	int servListCount = 20;
    int mediListCount = 13;
%>
<table width="400"  cellpadding="0" cellspacing="0" class="gray" bgcolor="#ffffff" id="serv_list_id">
<form name="serv_list_form" method="post" action="">
    <input name="basidt" type="hidden" value ="">
    <tr>
        <td height="25" class="gray"  align="center" bgcolor="#DDDDDD"> ��������(���)</td>
        <td height="25" class="gray"  align="center" width="90" bgcolor="#DDDDDD">��������</td>
        <td height="25" class="gray"  align="center" width="90" bgcolor="#DDDDDD">��������</td>
        <td height="25" class="gray"  align="center" width="90" bgcolor="#DDDDDD">��������</td>
    </tr>
<%-- Ȯ��뿪��븶�� ��� ���--%>
<%  for(int i=0; i<ds.curcommlist.size(); i++){
        SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_SERVCLOSCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- Ȯ��뿪��븶�� �� ��ũ -->
    <tr bgcolor="" onclick="serv_detail_view('<%= curcommlistRec.basidt%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
        <td  height="25" class="gray" align="center"><%= Util.convertMonthS(curcommlistRec.basidt)%>&nbsp;</td>
        <td  class="gray" align="center" height="25" width="90"><%= Util.convertS(curcommlistRec.frdt) %>&nbsp;</td>
        <td  class="gray" align="center" height="25" width="90"><%= Util.convertS(curcommlistRec.todt) %>&nbsp;</td>
        <td class="gray" align="center" height="25" width="90"><%= Util.convertS(curcommlistRec.closdt) %>&nbsp;</td>
    </tr>
<%}%>
<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
<%for(int i=0; i<(servListCount-ds.curcommlist.size()); i++){%>
    <tr>
        <td  height="25" class="gray" align="center">&nbsp;</td>
        <td  class="gray" align="center" height="25" width="90">&nbsp;</td>
        <td  class="gray" align="center" height="25" width="90">&nbsp;</td>
        <td class="gray" align="center" height="25" width="90">&nbsp;</td>
    </tr>
<%}%>
<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>
    <tr bgcolor="#E8E8E8" align="right">
        <td  height="25" class="gray" colspan="4"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�ѰǼ�
        <b><%= ds.totalcnt %> ��</b></td>
    </tr>
</form>
</table>

<!-- ������ �̵� -->
<table width="400" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
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


<!-- �� �ʱ�ȭ�� ���� table ����-->
<table id="serv_detail_id" width="430" border="0" cellspacing="0" cellpadding="2" bgcolor="#ffffff" class="gray">
<form name="serv_detail_form" method="post" action="">
    <input type="hidden" name="accflag" value="">          	<!-- ����,������� �����ʵ� -->
    <input type="hidden" name="splychrgclosyn" value="">    <!-- Ȯ��뿪��븶�� ������� �������� -->
    <tr>
        <td bgcolor="#dddddd"  class="gray" height="25">��������</td>
        <td colspan="4" class="gray" height="25">
            <input name="basidt" type="text" size="20" class="text_box" value="" caption="��������"  dataType="month" notEmpty>
        </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" class="gray" height="25">��������</td>
        <td colspan="4" class="gray" height="25">
            <input name="frdt" type="text" size="10" class="text_box" value=""  caption="��������" dataType="date" notEmpty>
        </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" class="gray" height="25">��������</td>
        <td colspan="4" class="gray" height="25">
            <input name="todt" type="text" size="10" class="text_box" value="" caption="��������" dataType="date" notEmpty>
        </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" class="gray" height="25">��������</td>
        <td colspan="4" class="gray" height="25">
            <input name="closdt" type="text" size="10" class="text_box" value="" caption="��������" dataType="date" notEmpty>
        </td>
    </tr>
    <tr>
        <td  bgcolor="#dddddd" class="gray" height="25">����IS ��������</td>
        <td colspan="4" class="gray" height="25"> N </td>
    </tr>
    <tr>
        <td  bgcolor="#dddddd" class="gray" height="25">������ ��������</td>
        <td colspan="4" class="gray" height="25"> N </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" class="gray" height="25">û������</td>
        <td colspan="4" class="gray" height="25">
            <input name="clamdt" type="text" size="10" class="text_box" value="" caption="û������" dataType="date" notEmpty>
        </td>
    </tr>
    <tr>
        <td bgcolor="#dddddd" class="gray" height="25">���</td>
        <td colspan="4" class="gray" height="25">
            <input name="remk" type="text" size="35" class="text_box" value="">
        </td>
    </tr>
    <tr align="center" bgcolor="#EBE9DC">
        <td width="100" class="gray" height="25" align="center">��ü</td>
        <td width="100" class="gray" height="25" align="center">�μ�</td>
        <td width="75" class="gray" height="25" align="center">����Ʈ</td>
        <td width="75" class="gray" height="25" align="center">����</td>
        <td class="gray" height="25" align="center">��</td>
    </tr>
<%-- ��ü ��� �ݺ� ���� --%>
<%for(int i=0; i<mediListCount; i++){%>
    <tr>
        <td class="gray" height="25" align="center">&nbsp;</td>
        <td class="gray" height="25" align="center">&nbsp;</td>
        <td class="gray" height="25" align="center">&nbsp;</td>
        <td class="gray" height="25" align="center">&nbsp;</td>
        <td class="gray" height="25" align="center">&nbsp;</td>
    </tr>
<%}%>
<%-- ��ü ��� �ݺ� �� --%>
</form>
</table>
<!-- �� �ʱ�ȭ�� ���� table ��-->


<script>
    parent.document.all.serv_list_id.outerHTML = serv_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    
    // �� �ʱ�ȭ
    parent.document.all.serv_detail_id.outerHTML = serv_detail_id.outerHTML;
    
    // ȭ�� �ʱ�ȭ
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>     
</script>
