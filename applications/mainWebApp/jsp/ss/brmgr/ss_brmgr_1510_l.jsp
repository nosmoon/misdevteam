<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1510_l.jsp
* ��� : �����濵-�����������-���
* �ۼ����� : 2004-05-19
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_FCT_FRFT_LISTDataSet ds = (SS_L_FCT_FRFT_LISTDataSet)request.getAttribute("ds");
    int fctListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
%>
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="fct_frft_list">
	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray" width="65"> �ΰ����� </td>
		<td rowspan="2" class="gray" width="50"> ���� </td>
		<td rowspan="2" class="gray" width="85"> ������� </td>
		<td rowspan="2" class="gray" width="60"> ���ڸ� </td>
		<td rowspan="2" class="gray" width="60"> ���� </td>
		<td rowspan="2" class="gray" width="60"> ����ݾ� </td>
		<td height="17" colspan="3" class="gray"> ���� </td>
		<td colspan="3" class="gray"> ���� </td>
		<td rowspan="2" class="gray" width="60"> �����ݾ�&nbsp; </td>
	</tr>
	<tr align="center">
		<td bgcolor="#dddddd" class="gray" width="65"> �Աݾ� </td>
		<td bgcolor="#dddddd" class="gray" width="65"> �Ա����� </td>
		<td bgcolor="#dddddd" class="gray" width="65"> �̳��ݾ� </td>
		<td bgcolor="#dddddd" class="gray" width="65"> �Աݾ� </td>
		<td bgcolor="#dddddd" class="gray" width="65"> �Ա����� </td>
		<td bgcolor="#dddddd" class="gray" width="65"> �̳��ݾ� </td>
	</tr>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
	SS_L_FCT_FRFT_LISTCURCOMMLISTRecord curcommlistRec = (SS_L_FCT_FRFT_LISTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- �� ��ũ -->
	<tr onclick="detail_view('<%=curcommlistRec.getImpndt()%>','<%=curcommlistRec.getDeptcd() %>','<%=curcommlistRec.getAreacd() %>','<%=curcommlistRec.getBocd() %>','<%=curcommlistRec.getViltresn() %>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" align="center" width="65"><%=Util.convertS(curcommlistRec.getImpndt())%>&nbsp;</td>
		<td class="gray" width="50"><%=curcommlistRec.getBonm()%> &nbsp;</td>
		<td class="gray" width="85"><%=curcommlistRec.getViltresnnm()%>&nbsp;</td>
		<td class="gray" width="60"><%=curcommlistRec.getRdrnm()%>&nbsp;</td>
		<td class="gray" align="left" width="60"><%=curcommlistRec.getDelbocomnm()%>&nbsp;</td>
		<td class="gray" align="right" width="60"><%=Util.formatNumber(curcommlistRec.getFrftimpnamt())%>&nbsp;</td>
		<td class="gray" align="right" width="65"><%=Util.formatNumber(curcommlistRec.getHdqtrcpmamt())%>&nbsp;</td>
		<td class="gray" align="center" width="65"><%=Util.convertS(curcommlistRec.getHdqtrcpmdt())%>&nbsp;</td>
		<td class="gray" align="right" width="65"><%=Util.formatNumber(curcommlistRec.getHdqtun_pymtamt())%>&nbsp;</td>
		<td class="gray" align="right" width="65"><%=Util.formatNumber(curcommlistRec.getBorcpmamt())%>&nbsp; </td>
		<td class="gray" align="center" width="65"><%=Util.convertS(curcommlistRec.getBorcpmdt())%>&nbsp;</td>
		<td class="gray" align="right" width="65"><%=Util.formatNumber(curcommlistRec.getBoun_pymtamt())%>&nbsp;</td>
		<td class="gray" align="right" width="60"><%=Util.formatNumber(curcommlistRec.getResamt())%>&nbsp; </td>
	</tr>
    <%}%>

    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(fctListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" align="center" width="65">&nbsp;</td>
		<td class="gray" width="50">&nbsp;</td>
		<td class="gray" width="85">&nbsp;</td>
		<td class="gray" width="60">&nbsp;</td>
		<td class="gray" align="center" width="60">&nbsp;</td>
		<td class="gray" align="right" width="60">&nbsp;</td>
		<td class="gray" align="right" width="65">&nbsp;</td>
		<td class="gray" align="center" width="65">&nbsp;</td>
		<td class="gray" align="right" width="65">&nbsp;</td>
		<td class="gray" align="right" width="65">&nbsp;</td>
		<td class="gray" align="center" width="65">&nbsp;</td>
		<td class="gray" align="right" width="65">&nbsp;</td>
		<td class="gray" align="right" width="60">&nbsp;</td>
	</tr>
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>

	<tr bgcolor="#dddddd" height="23">
		<td colspan="5" align="center" class="gray"> �� </td>
		<td class="gray" align="right" width="60">&nbsp;<%=Util.formatNumber(ds.getFrftimpnamt_total())%> </td>
		<td class="gray" align="right" width="60">&nbsp;<%=Util.formatNumber(ds.getHdqtrcpmamt_total())%> </td>
		<td class="gray" align="center" width="60"> - </td>
		<td class="gray" align="right" width="60">&nbsp;<%=Util.formatNumber(ds.getHdqtun_pymtamt_total())%> </td>
		<td class="gray" align="right" width="60">&nbsp;<%=Util.formatNumber(ds.getBorcpmamt_total())%> </td>
		<td class="gray" align="center" width="60"> - </td>
		<td class="gray" align="right" width="60">&nbsp;<%=Util.formatNumber(ds.getBoun_pymtamt_total())%> </td>
		<td class="gray" align="right" width="60">&nbsp;<%=Util.formatNumber(ds.getResamt_total())%> </td>
	</tr>
	<tr bgcolor="#dddddd" align="right">
	  	<td colspan="13" class="gray" height="23">
	  		<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>�ѰǼ� <%=Util.comma(ds.getTotalcnt())%> ��</b>
	   </td>
	</tr>
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
                <jsp:param name = "pagesize" 	value="<%= fctListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- ������ �̵� -->


<script>
    parent.document.all.fct_frft_list.outerHTML = fct_frft_list.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    
    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
    
	// ȭ�� �ʱ�ȭ
    parent.fct_frft_aceess('I');
    
<%if(ds.curcommlist.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>        
</script>
