<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1030_l.jsp
* ��� : ������Ȳ-��������-�����̷� �����̷� ���
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
	SL_L_NWSPSUBSCNTRPTCRDataSet ds = (SL_L_NWSPSUBSCNTRPTCRDataSet)request.getAttribute("ds");
    int subsHstyListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
%>
<table width="100%" border="0" cellspacing="0" cellpadding="1" bgcolor="#FFFFFF" class="gray" id="hsty_list_id">
	<tr bgcolor="#dddddd" align="center">
		<td width="200" class="gray" height="23" align="center"> �����Ⱓ </td>
		<td width="100" class="gray" height="23" align="center"> ������ </td>
		<td width="150" class="gray" height="23" align="center"> ��ü�� </td>
		<td width="100" class="gray" height="23" align="center"> Ȯ������ </td>
	</tr>
	<!--�����̷� ��� ����-->
	<%
	for(int i=0; i<ds.nwspsubscntrcur.size(); i++){
	    SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord nwspsubscntrcurRec = (SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get(i);%>
	<tr>
		<td width="200" class="gray" align="center"> <%=Util.convertS(nwspsubscntrcurRec.rdr_extndt)%> - <%=Util.convertS(nwspsubscntrcurRec.suspdt)%>&nbsp;</td>
		<td Width="100" class="gray" align="center"> <%=nwspsubscntrcurRec.bonm%> &nbsp;</td>
		<td width="150" class="gray" align="center"> <%=nwspsubscntrcurRec.medinm%> &nbsp;</td>
		<td width="100" class="gray" align="center"> <%=nwspsubscntrcurRec.rdr_extntypenm%> &nbsp;</td>
	</tr>
	<%}%>
	<!--�����̷� ��� ��-->

    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(subsHstyListCount-ds.nwspsubscntrcur.size()); i++){%>
	<tr>
	    <td width="200" align="center" class="gray" > &nbsp; </td>
	    <td Width="100" class="gray" > &nbsp; </td>
	    <td width="150" class="gray"  > &nbsp; </td>
	    <td width="100" class="gray" > &nbsp; </td>
	</tr>
	<%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>
	<tr bgcolor="#E8E8E8" align="right">
	    <td  height="25" class="gray" colspan="4">
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
                <jsp:param name = "js_fn_nm" 	value="page_move_subs_hsty"/>
                <jsp:param name = "pagesize" 	value="<%= subsHstyListCount%>"/>
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
    
<%if(ds.nwspsubscntrcur.size() == 0){%>
    alert("�˻������ �����ϴ�.");
<%}%>  	
</script>