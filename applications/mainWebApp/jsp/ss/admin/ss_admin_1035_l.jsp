<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_admin_1035_l.jsp
* ��� : ������-�����ȣ-���
* �ۼ����� : 2004-03-09
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_PSTCDDataSet ds = (SS_L_PSTCDDataSet)request.getAttribute("ds");
    int zipListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
%>
<table width="830" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="zip_list_id">
<form name="zip_list_form" method="post" action="">
    <input name="zip1" type="hidden" value ="">			<!--�����ȣ1-->
    <input name="zip2" type="hidden" value ="">     	<!--�����ȣ2-->
    <input name="zip3" type="hidden" value ="">     	<!--�����ȣ3-->
    <input name="addr1" type="hidden" value ="">		<!--�ּ�1-->
    <input name="addr2" type="hidden" value ="">     	<!--�ּ�2-->
    <input name="addr3" type="hidden" value ="">     	<!--�ּ�3-->
    <input name="largedlvplac" type="hidden" value ="">	<!--���ּ�-->
    
	<tr bgcolor="#dddddd" align="center" height="23"> 
		<td width="65" class="gray">�����ȣ1</td>
		<td width="65" class="gray">�����ȣ2</td>
		<td width="65" class="gray">�����ȣ3</td>
		<td width="70" class="gray">��/��</td>
		<td width="70" class="gray">��/��</td>
		<td width="140" class="gray">��/��/��</td>
		<td class="gray">���ּ�</td>
		<td width="60" class="gray">���۹���</td>
		<td width="60" class="gray">������</td>
	</tr>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_PSTCDCURCOMMLISTRecord curcommlistRec = (SS_L_PSTCDCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- �� ��ũ -->
    <tr bgcolor="" onclick="detail_view('<%= curcommlistRec.zip1%>','<%= curcommlistRec.zip2%>','<%= curcommlistRec.zip3%>','<%= curcommlistRec.addr1%>','<%= curcommlistRec.addr2%>','<%= curcommlistRec.addr3%>','<%= curcommlistRec.largedlvplac%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td width="65" class="gray" align="center"><%= curcommlistRec.zip1%>&nbsp;</td>
		<td width="65" class="gray" align="center"><%= curcommlistRec.zip2%>&nbsp;</td>
		<td width="65" class="gray" align="center"><%= curcommlistRec.zip3%>&nbsp;</td>
		<td width="70" class="gray" align="left">&nbsp;<%= curcommlistRec.addr1%></td>
		<td width="70" class="gray" align="left">&nbsp;<%= curcommlistRec.addr2%></td>
		<td width="140" class="gray" align="left">&nbsp;<%= curcommlistRec.addr3%></td>
		<td class="gray" align="left">&nbsp;<%= curcommlistRec.largedlvplac%></td>
		<td width="60" class="gray" align="left">&nbsp;<%= curcommlistRec.bgnn%></td>
		<td width="60" class="gray" align="left">&nbsp;<%= curcommlistRec.endn%></td>
	</tr> 
<%}%>	
<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<zipListCount; i++){%>
	<tr align="center""> 
		<td width="65" class="gray">&nbsp;</td>
		<td width="65" class="gray">&nbsp;</td>
		<td width="65" class="gray">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
		<td width="70" class="gray">&nbsp;</td>
		<td width="140" class="gray">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
		<td width="60" class="gray">&nbsp;</td>
	</tr>
	<%}%>
<%}%>
	<tr bgcolor="#dddddd" height="23">
		<td colspan="9" class="gray" align="right">
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
                <jsp:param name = "pagesize" 	value="<%= zipListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->

<!--�󼼸�� �ʱ�ȭ�� ���� table-->
<table border="0" cellspacing="0" cellpadding="0" id="zip_detail_id">
</table>

<script>
    parent.document.all.zip_list_id.outerHTML = zip_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    
    //�󼼸�� �ʱ�ȭ
    parent.document.all.zip_detail_id.outerHTML = zip_detail_id.outerHTML;
    
    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();

	// �����ȣ �ʱ�ȭ
	// parent.zip_search_form.zip1.value='';			<!--�����ȣ1-->
	// parent.zip_search_form.zip2.value='';			<!--�����ȣ2-->
	
<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>    
</script>