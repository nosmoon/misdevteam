<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1680_l.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����(������)-���
* �ۼ����� : 2004-04-08
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%

    SS_L_RDR_EXTN_BOCYB_RSLTDataSet ds = (SS_L_RDR_EXTN_BOCYB_RSLTDataSet)request.getAttribute("ds");
    int boListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
%>
<table width="490"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="rslt_list_id">
<form name="bo_list_form" method="post" action="" >
    <input name="frdt" type="hidden" value ="<%=ds.getFrdt()%>">
    <input name="todt" type="hidden" value ="<%=ds.getTodt()%>">
    <input name="bocd" type="hidden" value ="">

	<tr>
		<td height="24" class="gray"  align="center" bgcolor="#DDDDDD" width="77">������</td>
		<td height="24" class="gray"  align="center" width="78" bgcolor="#DDDDDD">Ȯ��</td>
		<td height="24" class="gray"  align="center" width="77" bgcolor="#DDDDDD">Ȯ��</td>
		<td height="24" class="gray"  align="center" width="77" bgcolor="#DDDDDD">��Ȯ��</td>
		<td height="24" class="gray"  align="center" width="76" bgcolor="#DDDDDD">����</td>
		<td height="24" class="gray"  align="center" width="91" bgcolor="#DDDDDD">����</td>
  	</tr>

	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
	    SS_L_RDR_EXTN_BOCYB_RSLTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_BOCYB_RSLTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
	<!-- Ȯ��뿪��� ���̹���� ������ȸ �󼼸�� ��ũ -->
	<tr bgcolor="" onclick="bo_detail_list('<%= curcommlistRec.bocd%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td height="22" class="gray" width="77" align="center"><%= curcommlistRec.bonm%>&nbsp;</td>
		<td class="gray" align="right" height="22" width="78"><%= curcommlistRec.extnqty%>&nbsp;</td>
		<td class="gray" align="right" height="22" width="77"><%= curcommlistRec.cnfmqty%>&nbsp;</td>
		<td class="gray" align="right" height="22" width="77"><%= curcommlistRec.uncnfmqty%>&nbsp;</td>
		<td class="gray" align="right" height="22" width="76"><%= curcommlistRec.errqty%>&nbsp;</td>
		<td class="gray" align="right" height="22" width="91"><%= curcommlistRec.rsltqty%>&nbsp;</td>
	</tr>
	<%}%>

	<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
	<%for(int i=0; i<(boListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td  height="22" class="gray" width="77" align="center"><a href="#">&nbsp;</a></td>
		<td  class="gray" align="right" height="22" width="78">&nbsp;</td>
		<td  class="gray" align="right" height="22" width="77">&nbsp;</td>
		<td class="gray" align="right" height="22" width="77">&nbsp;</td>
		<td class="gray" align="right" height="22" width="76">&nbsp;</td>
		<td class="gray" align="right" height="22" width="91">&nbsp;</td>
	</tr>
	<%}%>
	<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>

	<tr align="right">
		<td  height="22" class="gray" colspan="6" bgcolor="#dddddd"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�ѰǼ�
		<b><%= ds.getTotalcnt()%>��</b></td>
	</tr>
</form>
</table>
<!---button-->

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
                <jsp:param name = "pagesize" 	value="<%= boListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>

<script>
    parent.document.all.rslt_list_id.outerHTML = rslt_list_id.outerHTML;
	
	// �� ��� �ʱ�ȭ
	parent.ifrm_1.location.replace("/html/extn/ss_extn_1675_l.html");
	parent.ifrm_2.location.replace("/html/extn/ss_extn_1685_l.html");

    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
            
<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%> 
</script>
