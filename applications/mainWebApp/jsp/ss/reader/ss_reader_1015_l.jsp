<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1015_l.jsp
* ��� : ������Ȳ-��������-�����̷� ���
* �ۼ����� : 2003-12-27
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_HSTYDataSet ds = (SS_L_RDR_HSTYDataSet)request.getAttribute("ds");
    int rdrhstyListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
	int hstyListCount = 5;		// �� ȭ��� ����Ʈ �׸� ��(�̷� ���)
    int subsHstyListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
%>
<table width="550"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="rdrhsty_list_id">
<form name="rdrhsty_list_form" method="post" action="" >
    <input name="bocd" type="hidden" value ="">									<!--���������ڵ�-->
    <input name="rdr_no" type="hidden" value ="">								<!--���ڹ�ȣ-->
    <input name="medicd" type="hidden" value ="">								<!--��ü�ڵ�-->

	<tr bgcolor="#DDDDDD">
        <td class="gray" align="center" width="50" height="24"> ����</td>
        <td class="gray" align="center" width="70" height="24"> ���ڹ�ȣ</td>
        <td class="gray" align="center" width="60" height="24"> ���ڸ�</td>
        <td class="gray" align="center" width="100" height="24"> ��ȭ��ȣ</td>
        <td class="gray" align="center" width="240" height="24"> �ּ�</td>
        <td class="gray" align="center" width="30" height="24" width="30" > ����</td>
	</tr>

<%-- �����̷¸�� ��� ���� --%>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_HSTYCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_HSTYCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- �����̷»� ��ũ -->
    <tr bgcolor="" onclick="rdrhsty_detail_view('<%= curcommlistRec.bocd%>','<%= curcommlistRec.rdr_no%>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
	    <td class="gray" align="center" height="21"><%= curcommlistRec.bonm%>&nbsp;</td>
	    <td class="gray" align="center" height="21"><%= curcommlistRec.rdr_no%>&nbsp;</td>
	    <td class="gray" align="center" height="21"><%= curcommlistRec.rdrnm%>&nbsp;</td>
	    <td class="gray" align="center" height="21">
	    	<%= Util.getChainStr(curcommlistRec.rdrtel_no1, curcommlistRec.rdrtel_no2, curcommlistRec.rdrtel_no3, "-")%>&nbsp;
	    </td>
	    <td class="gray" align="center" height="21"><%= curcommlistRec.dlvaddr%>&nbsp;<%= curcommlistRec.dlvdtlsaddr%></td>
	    <td class="gray" align="center" height="21" width="30"><%= curcommlistRec.subsyn%>&nbsp;</td>
	</tr>
<%}%>

<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
<%for(int i=0; i<(rdrhstyListCount-ds.curcommlist.size()); i++){%>
	<tr>
	    <td class="gray" align="center" height="21">&nbsp;</td>
	    <td class="gray" align="center" height="21">&nbsp;</td>
	    <td class="gray" align="center" height="21">&nbsp;</td>
	    <td class="gray" align="center" height="21">&nbsp;</td>
	    <td class="gray" align="center" height="21">&nbsp;</td>
	    <td class="gray" align="center" height="21" width="30">&nbsp;</td>
	</tr>
<%}%>
<%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>

<%-- �����̷¸�� ��� �� --%>

    <tr bgcolor="#E8E8E8" align="right">
        <td  height="25" class="gray" colspan="6">
            <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�ѰǼ� <b><%= ds.getTotalcnt()%> ��</b>
        </td>
    </tr>

</form>
</table>

<!-- ������ �̵� -->
<table width="550" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
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
                <jsp:param name = "pagesize" 	value="<%= rdrhstyListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->



<!--���ڻ� �ʱ�ȭ�� ���� table ����-->
<table width="100%" border="0" cellspacing="0" cellpadding="0" class="gray" bgcolor="#FFFFFF"  id="rdr_detail_id">
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray"> ���ڹ�ȣ</td>
        <td class="gray" width="70">&nbsp;</td>
        <td class="gray" width="70" bgcolor="#DDDDDD">���ڸ�</td>
        <td class="gray" width="70">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> ��ȭ��ȣ</td>
        <td class="gray" colspan="3">&nbsp;</td>
    </tr>
    <tr>
        <td class="gray" width="70" bgcolor="#DDDDDD">�޴�����ȣ</td>
        <td class="gray" colspan="3">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> �̸���</td>
        <td class="gray" colspan="3">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> ���ϸ���</td>
        <td class="gray" colspan="3">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> �����ȣ</td>
        <td class="gray" colspan="3">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> �ּ�</td>
        <td class="gray" colspan="3">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> �ְ�����</td>
        <td class="gray" width="70">&nbsp;</td>
        <td class="gray" width="70" bgcolor="#DDDDDD">�ְű���</td>
        <td class="gray" width="70">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70"> ����</td>
        <td class="gray" width="70">&nbsp;</td>
        <td class="gray" width="70" bgcolor="#DDDDDD">�������</td>
        <td class="gray" width="70">&nbsp;</td>
    </tr>
    <tr>
        <td bgcolor="#DDDDDD" class="gray" width="70">�������� </td>
        <td class="gray" colspan="3">&nbsp;</td>
    </tr>
</table>
<!--���ڻ� �ʱ�ȭ�� ���� table ��-->


<!--������ �ʱ�ȭ�� ���� table ����-->
<table width="280" border="0" cellpadding="0" cellspacing="0"  align="top" class="gray" id="subs_detail_id">
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">��ü��</td>
        <td bgcolor="#FFFFFF" class="gray" colspan="3">
            <select name="select" class="sel_all">
            	<option>���ڰ˻��� �����ϼ���.</option>
            </select>
        </td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">�ܰ�</td>
        <td bgcolor="#FFFFFF" class="gray" align="right" colspan="3">&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">����μ�</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right">��</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">�������μ�</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right">��</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">����μ�</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right"> ��</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">���ᱸ��</td>
        <td width="70" bgcolor="#FFFFFF" class="gray" align="right">&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">Ȯ������</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp; </td>
        <td width="70" bgcolor="#DDDDDD" class="gray">Ȯ������</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">Ȯ����</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp; </td>
        <td width="70" bgcolor="#DDDDDD" class="gray">Ȯ����</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">��������</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">���ݹ��</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">������</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">�б�</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
    </tr>
    <tr>
        <td width="70" bgcolor="#DDDDDD" class="gray">��������</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
        <td width="70" bgcolor="#DDDDDD" class="gray">���˹�</td>
        <td width="70" bgcolor="#FFFFFF" class="gray">&nbsp;</td>
    </tr>
</table>
<!--������ �ʱ�ȭ�� ���� table ��-->

<!--�̷���ȸ �˻� �ʱ�ȭ�� ���� table ����-->
<table width="100%" border="0" cellspacing="0" cellpadding="0" bgcolor="#EBE9DC" id="hsty_search_id">
<form name="hsty_search_form" method="post" action="" >
    <input name="pageno" type="hidden" value ="1">			        		<!-- ���� ������ ��ȣ -->
    <input name="pagesize" type="hidden" value ="<%= hstyListCount%>">		<!-- �� ȭ��� ����Ʈ �׸� �� -->
    <input name="bocd" type="hidden" value ="">								<!--���������ڵ�-->
    <input name="rdr_no" type="hidden" value ="">							<!--���ڹ�ȣ-->
	<!-- ���� �̷� hidden �Ķ���� ���� -->
    <input name="basiyymm" type="hidden" value ="">						<!-- ���� ���س�� -->
    <input name="prevyymm" type="hidden" value ="">							<!-- ���� ��� -->
    <input name="nextyymm" type="hidden" value ="">							<!-- ���� ��� -->
	<!-- ���� �̷� hidden �Ķ���� �� -->
	<tr>
		<td height="2"></td>
	</tr>
	<tr>
		<td>
            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">�Ⱓ
            <input name="frdt" type="text" size="10" class="text_box" dataType="date">
			-
			<input name="todt" type="text" size="10" class="text_box" dataType="date">
            &nbsp;&nbsp;
            <img src="/html/comm_img/ic_title.gif" width="11" height="7" align="absmiddle">��ü
            <select name="medicd" class="sel_all" id="hsty_search_medicd_id"><!--��ü�ڵ�-->
                <option>���ڰ˻��� �����ϼ���.</option>
            </select>
		</td>
	</tr>
	<tr>
		<td height="2"></td>
	</tr>
	<tr>
		<td>
            <img src="/html/comm_img/bu_his01.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:subs_hsty_search()"><!--�����̷� ��ȸ-->
            <img src="/html/comm_img/bu_his02.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:clam_hsty_search()"><!--�����̷� ��ȸ, �Ű������� �������� �ʴ´�.-->
            <img src="/html/comm_img/bu_his03.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:movm_hsty_search()"><!--�̻��̷� ��ȸ-->
            <img src="/html/comm_img/bu_his04.gif" width="70" height="19" border="0" align="absmiddle" style="cursor:hand" onclick="javascript:stop_hsty_search()"><!--�޵��̷� ��ȸ-->
        </td>
	</tr>
	<tr>
		<td height="2"></td>
	</tr>
</form>
</table>
<!--�̷���ȸ �˻� �ʱ�ȭ�� ���� table ��-->

<!--�̷���ȸ ��� �ʱ�ȭ�� ���� table ����-->
<table width="550"  cellpadding="0" cellspacing="0" bgcolor="#ffffff" class="gray" id="hsty_list_id">
	<tr bgcolor="#dddddd" align="center">
		<td width="200" class="gray" height="23"> �����Ⱓ </td>
		<td width="100" class="gray" height="23"> ������ </td>
		<td width="150" class="gray" height="23"> ��ü�� </td>
		<td width="100" class="gray" height="23"> Ȯ������ </td>
	</tr>
    
	<%-- �ʱ�ȭ�� ��� �ݺ� ���� --%>
    <%for(int i=0; i<subsHstyListCount; i++){%>
	<tr>
	    <td width="200" align="center" class="gray"> &nbsp; </td>
	    <td Width="100" class="gray"> &nbsp; </td>
	    <td width="150" class="gray"> &nbsp; </td>
	    <td width="100" class="gray"> &nbsp; </td>
	</tr>
	<%}%>
	<%-- �ʱ�ȭ�� ��� �ݺ� �� --%>
</table>
<!--�̷���ȸ ��� �ʱ�ȭ�� ���� table ��-->

<!-- �̷���ȸ ������ �̵� -->
<table width="550" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move_hsty">
    <tr>
        <td align="center" height="2">
        <!--����-->
        </td>
    </tr>
    <tr>
        <td align="center" height="24" bgcolor="#E8E8E8">
        <!--JSP PAGE START---------------------------------------------------------------------------------->
        <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                <jsp:param name = "pageno" 	value="0"/>
                <jsp:param name = "totalcnt" 	value="0"/>
                <jsp:param name = "js_fn_nm" 	value="page_move"/>
                <jsp:param name = "pagesize" 	value="<%= hstyListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- �̷���ȸ ������ �̵� -->

<script>
    parent.document.all.rdrhsty_list_id.outerHTML = rdrhsty_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    
    //���ڻ�,������,�̷���ȸ �ʱ�ȭ
    parent.document.all.rdr_detail_id.outerHTML = rdr_detail_id.outerHTML;
    parent.document.all.subs_detail_id.outerHTML = subs_detail_id.outerHTML;
    parent.document.all.hsty_search_id.outerHTML = hsty_search_id.outerHTML;
    parent.document.all.hsty_list_id.outerHTML = hsty_list_id.outerHTML;
    parent.document.all.page_move_hsty.outerHTML = page_move_hsty.outerHTML;
    
    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>     
    
</script>

