<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_rdr_1806_l.jsp
* ��� : ����-������ȸ ����Ʈ
* �ۼ����� : 2004-02-25
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    // ȭ�鿡 ������ ���μ�
    String records_per_page =   request.getParameter("records_per_page");
    // dataset �ν��Ͻ� ����κ�
    PS_L_RDR_PUBL_ETCDataSet ds = (PS_L_RDR_PUBL_ETCDataSet)request.getAttribute("ds");  // request dataset

	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.rdr_publcur.size();

%>
<script language="javascript">
    parent.setEventHandler();
</script>

<table width="830" border="0" align="center" cellpadding="1" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="list_info">
     <tr align="center" bgcolor="#dddddd">
        <td class="gray" width="100">���ڸ�/�����</td>
	<td class="gray" width="90">��ȭ��ȣ</td>
        <td class="gray" width="320">�ּ�</td>
        <td class="gray" width="80">������ü</td>
        <td class="gray" width="90">�����Ⱓ</td>
        <td class="gray" width="100">����</td>
	<td class="gray" width="90">�ű�/����</td>
<!--        <td class="gray" width="90">�̸���</td> -->
      </tr>
    <%
    // �ڵ帮��Ʈ ���� ���� �κ�
	for(int i=0; i<ds.rdr_publcur.size(); i++){
		PS_L_RDR_PUBL_ETCRDR_PUBLCURRecord rdr_publcurRec = (PS_L_RDR_PUBL_ETCRDR_PUBLCURRecord)ds.rdr_publcur.get(i);

		if(rdr_publcurRec.sendyncdflag.equals("Y")) {
%>
      <tr  onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''"
			style="cursor:hand" onclick="jsRdrDtls('<%= rdr_publcurRec.rdr_no%>','<%= rdr_publcurRec.medicd%>','<%= rdr_publcurRec.termsubsno%>');">
<% 		} else {   	%>
      <tr bgcolor="#EEEEEE"  onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor='#EEEEEE'"
			style="cursor:hand" onclick="jsRdrDtls('<%= rdr_publcurRec.rdr_no%>','<%= rdr_publcurRec.medicd%>','<%= rdr_publcurRec.termsubsno%>');">
<% 		} 			%>

        <td class="gray" width="100" align="left" >&nbsp;<%= rdr_publcurRec.rdrnm%></td>
        <td class="gray" width="90" align="center" ><%= rdr_publcurRec.rdrtel_no.equals("") ? "&nbsp;" : rdr_publcurRec.rdrtel_no %></td>
        <td class="gray" width="320"><%= rdr_publcurRec.dlvzip%>&nbsp;<%= rdr_publcurRec.dlvaddr%>&nbsp;<%= rdr_publcurRec.dlvdtlsaddr%></td>
        <td class="gray" width="80" align="center"><%= rdr_publcurRec.medinm%></td>
        <td class="gray" width="90" align="center"><%= rdr_publcurRec.subsfrser_no%></td>
        <td class="gray" width="100" align="center"><%= rdr_publcurRec.bonm%></td>
		<td class="gray" width="90" align="center"><%=rdr_publcurRec.acpntypenm%></td>
<!--        <td class="gray" width="90" ><%//=(rdr_publcurRec.email).equals("")? "&nbsp;" : rdr_publcurRec.email %></td> -->
      </tr>

    <%
     }
	for(int i=0; i < no_data_page; i++) {
    %>
      <tr>
        <td class="gray" width="100">&nbsp;</td>
        <td class="gray" width="90" >&nbsp;</td>
        <td class="gray" width="320">&nbsp;</td>
        <td class="gray" width="80" >&nbsp;</td>
        <td class="gray" width="90" align="center">&nbsp;</td>
        <td class="gray" width="100" align="center">&nbsp;</td>
        <td class="gray" width="60" >&nbsp;</td>
      </tr>
<%
	}
%>
</table>
    </td>
  </tr>
</table>

<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="navi">
  <tr>
    <td align="center" height="2">
      <!--����-->
    </td>
  </tr>
  <tr>
        <td colspan=5 align="center" bgcolor="#E8E8E8">
          <!--JSP PAGE START---------------------------------------------------------------------------------->
          <%
          String curr_page_no = request.getParameter("curr_page_no");
          String total_records = String.valueOf(ds.getTotalcnt());
          String js_fn_nm = request.getParameter("js_fn_nm");
          %>
          <jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
          <jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
          <jsp:param name = "total_records" 	value="<%=total_records%>"/>
          <jsp:param name = "js_fn_nm" 			value="<%=js_fn_nm%>"/>
          <jsp:param name = "records_per_page" 	value="<%=records_per_page%>"/>
          <jsp:param name = "page_set_gubun" 	value="0"/>
          </jsp:include>

          <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
  </tr>
</table>

<script>
    parent.document.all.list_info.outerHTML = list_info.outerHTML;
    parent.document.all.navi.outerHTML = navi.outerHTML;
    parent.setEventHandler();
</script>