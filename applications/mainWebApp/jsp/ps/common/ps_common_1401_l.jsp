<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_common_1401_l.jsp
* ���     : ���� �������� �˻�
* �ۼ����� : 2004-02-16
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset �ν��Ͻ� ����κ�
	PB_L_EXST_RDR_SEARCHDataSet ds = (PB_L_EXST_RDR_SEARCHDataSet)request.getAttribute("ds");

	// �˻� ����Ʈ ī��Ʈ
	int recCount  =  ds.exstrdrlistcur.size();

	// ���������� ������ ���ڵ� ��
	int pagesize = Integer.parseInt(request.getParameter("pagesize"));
%>

<!--����Ʈ -->
<table  width="813" cellpadding="0" border="0" cellspacing="0" class="gray" bgcolor="#ffffff" id="list_zone">
  <tr>
    <td>
      <table width="812" cellpadding="0" border="0" cellspacing="0" class="gray" >
        <tr bgcolor="#dddddd" align="center">
          <td width="85"  class="gray" height="20" > ���ڹ�ȣ </td>
          <td width="120" class="gray" height="20" > ���� </td>
          <td width="120" class="gray" height="20" > �ֹι�ȣ </td>
          <td width="180" class="gray" height="20" > ��ȭ��ȣ </td>
          <td width="100" class="gray" height="20" > �޴�����ȣ </td>
          <td width="200" class="gray" height="20" > �̸��� </td>
        </tr>
        <tr bgcolor="#dddddd" align="center">
          <td colspan="6" class="gray" height="20" > �ּ� </td>
        </tr>
      </table>
    </td>
  </tr>
<%-- ���� �˻����� --%>
<%
	for(int i=0; i<recCount; i++){
		PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord exstrdrlistcurRec = (PB_L_EXST_RDR_SEARCHEXSTRDRLISTCURRecord)ds.exstrdrlistcur.get(i);
%>
  <tr onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''" style="cursor:hand" onclick="jsSelect_Row('<%= exstrdrlistcurRec.rdr_no%>');">
    <td>
      <table width="812" cellpadding="0" border="0" cellspacing="0" class="gray" >
        <tr>
          <td width="85"  class="gray" height="20" align="center">&nbsp;<%= exstrdrlistcurRec.rdr_no%>&nbsp;</td>
          <td width="120" class="gray" height="20" align="left"  >&nbsp;<%= exstrdrlistcurRec.rdrnm%>&nbsp;</td>
          <td width="120" class="gray" height="20" align="center">&nbsp;<%= exstrdrlistcurRec.prn%>&nbsp;</td>
          <td width="180" class="gray" height="20" align="left"  >&nbsp;<%= exstrdrlistcurRec.rdrtel_no%>&nbsp;</td>
          <td width="100" class="gray" height="20" align="center">&nbsp;<%= exstrdrlistcurRec.rdrptph_no%>&nbsp;</td>
          <td width="200" class="gray" height="20" align="left"  >&nbsp;<%= exstrdrlistcurRec.email%>&nbsp;</td>
        </tr>
        <tr>
          <td colspan="6" class="gray" height="20" align="left"  >&nbsp;<%= exstrdrlistcurRec.dlvaddr%>&nbsp;</td>
        </tr>
      </table>
    </td>
  </tr>
<%-- �˻��� �������ڳ��������� Display�� �⺻ ���ڵ� ���� ��ġ�� ���Ұ�� ���� Display --%>
<%
	}

	for(int i=0; i < (pagesize-recCount) ; i++) {
%>
  <tr onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''" >
    <td>
      <table width="812" cellpadding="0" border="0" cellspacing="0" class="gray" >
        <tr>
          <td width="85"  class="gray" height="20" >&nbsp;</td>
          <td width="120" class="gray" height="20" >&nbsp;</td>
          <td width="120" class="gray" height="20" >&nbsp;</td>
          <td width="180" class="gray" height="20" >&nbsp;</td>
          <td width="100" class="gray" height="20" >&nbsp;</td>
          <td width="200" class="gray" height="20" >&nbsp;</td>
        </tr>
        <tr>
          <td colspan="6" class="gray" height="20" >&nbsp;</td>
        </tr>
      </table>
    </td>
  </tr>
<%
	}
%>
</table>
<%-- page navigator --%>
<table  width="813" cellpadding="0" border="0" cellspacing="0" class="title2" align="center" id="page_zone">
  <tr>
    <td height="20">
      <div align="center">
        <!--JSP PAGE START---------------------------------------------------------------------------------->
    <%
        String pageno  = request.getParameter("pageno");
        String total_records = String.valueOf(ds.getTotalcnt());
        String js_fn_nm      = request.getParameter("js_fn_nm");
    %>
        <jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
        <jsp:param name  ="curr_page_no"        value="<%=pageno%>"/>
        <jsp:param name  ="total_records"       value="<%=total_records%>"/>
        <jsp:param name  ="js_fn_nm"            value="<%=js_fn_nm%>"/>
        <jsp:param name  ="records_per_page"    value="<%=pagesize%>"/>
        <jsp:param name  ="page_set_gubun"      value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
      </div>
    </td>
  </tr>
</table>


	<script>
		var lo_form1  =  parent.document.exstrdrsrc_form;
		parent.document.all.list_zone.outerHTML = list_zone.outerHTML;
		parent.document.all.page_zone.outerHTML = page_zone.outerHTML;
		parent.jsInit();
		lo_form1.sh_rdr_no.focus();
	</script>
