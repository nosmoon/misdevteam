<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1045_l.jsp
* ��� : ������Ȳ-��������-�����̷� �޵��̷� ���
* �ۼ����� : 2003-12-30
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SL_L_VSPTCRDataSet ds = (SL_L_VSPTCRDataSet)request.getAttribute("ds");
    int stopHstyListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
%>
<table width="100%" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="hsty_list_id">
	<tr bgcolor="#dddddd" align="center">
		<td width="238" height="23" class="gray"> ������</td>
		<td width="428" class="gray" height="23"> ��ü </td>
		<td width="372" class="gray" height="23"> �޵��Ⱓ </td>
	</tr>

	<!--�޵��̷� ��� ����-->
	<%
	for(int i=0; i<ds.vsptcrcur.size(); i++){
	    SL_L_VSPTCRVSPTCRCURRecord vsptcrcurRec = (SL_L_VSPTCRVSPTCRCURRecord)ds.vsptcrcur.get(i);%>
	<tr>
	    <td class="gray" align="center"> <%=vsptcrcurRec.bonm%> </td>
	    <td width="428" class="gray" align="center"> <%=vsptcrcurRec.medinm%> </td>
	    <td width="372" class="gray" align="center"> <%=Util.convertS(vsptcrcurRec.suspfrdt)%> - <%=Util.convertS(vsptcrcurRec.susptodt)%></td>
	</tr>
	<%}%>
	<!--�޵��̷� ��� ��-->

    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
	<%for(int j=0; j<stopHstyListCount - ds.vsptcrcur.size(); j++){%>
	<tr>
		<td class="gray" > &nbsp; </td>
		<td width="428" class="gray"  >  &nbsp; </td>
		<td width="372" class="gray" > <div align="center"> &nbsp;</div></td>
	</tr>
	<%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>
	<tr bgcolor="#E8E8E8" align="right">
	    <td  height="25" class="gray" colspan="3">
	        <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">�ѰǼ� <b><%= ds.getTotalcnt()%> ��</b>
	    </td>
	</tr>
</table>

<!-- ������ �̵� -->
<table width="100%" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="page_move_hsty">
  <tr>
    <td align="center" height="25" bgcolor="#E8E8E8">
            <!--JSP PAGE START---------------------------------------------------------------------------------->
            <%
                String pageno = request.getParameter("pageno");
                String totalcnt = String.valueOf(ds.getTotalcnt());
            %>
                <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                <jsp:param name = "pageno" 		value="<%=pageno%>"/>
                <jsp:param name = "totalcnt" 	value="<%=totalcnt%>"/>
                <jsp:param name = "js_fn_nm" 	value="page_move_stop_hsty"/>
                <jsp:param name = "pagesize" 	value="<%= stopHstyListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
    </td>
  </tr>
</table>
<!-- ������ �̵� -->

<script language="javascript">
	parent.document.all.hsty_list_id.outerHTML = hsty_list_id.outerHTML;
  	parent.document.all.page_move_hsty.outerHTML = page_move_hsty.outerHTML;
  	
    // �̺�Ʈ �ڵ鷯 ȣ��
    parent.jsInit();
    
<%if(ds.vsptcrcur.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>   	
</script>