<%@ page language="java" contentType="text/html; charset=euc-kr"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_bil_1406_l.jsp
* ��� : �ʰ��Ա�ó�� �ʱ�ȭ��
* �ۼ����� : 2003-11-20
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    // dataset �ν��Ͻ� ����κ�
    PS_L_BILL_EXCSRCPMPROCDataSet ds = (PS_L_BILL_EXCSRCPMPROCDataSet)request.getAttribute("ds");  // request dataset
	int no_data_page = Integer.parseInt(request.getParameter("records_per_page")) - ds.curcommlist.size();
%>

<table  width="830" cellspacing="0" cellpadding="1" border="0" class="gray" bgcolor="#FFFFFF"  id="list_info">
  <tr bgcolor="#dddddd">
    <td width="30" class="gray" align="center" >
      <input type="checkbox" name="chkhead" onClick="checkAll()">
    </td>
    <td width="130" class="gray" align="center" > ���ڹ�ȣ </td>
    <td width="60"  class="gray" align="center" > ���� </td>
    <td width="80"  class="gray" align="center" > ������ü </td>
    <td width="80"  class="gray" align="center" > ó������ </td>
	<td width="60"  class="gray" align="center" > ó������ </td>
    <td width="110" class="gray" align="center" > ���������Ⱓ </td>
    <td width="110" class="gray" align="center" > ���屸���Ⱓ </td>
    <td width="80"  class="gray" align="center" > �Ǹűݾ� </td>
    <td width="80"  class="gray" align="center" > �ݾ� </td>
  </tr>
<%
    // �ڵ帮��Ʈ ���� ���� �κ�

	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord rec = (PS_L_BILL_EXCSRCPMPROCCURCOMMLISTRecord)ds.curcommlist.get(i);
%>

  <tr onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''">
    <td width="30" class="gray" align="center" >
<%
	if("020".equals(rec.procyn)) {
%>
      <input type="checkbox" name="chk" value="<%=rec.rdr_no%>##<%=rec.medicd%>##<%=rec.termsubsno%>##<%=rec.seq%>##<%=rec.procclsf%>" onClick="checkOne()" >
<%
	} else {
%>
      <input type="checkbox" name="chk" disabled>
<%
	}
%>
    </td>
<%
	if(rec.procyn.equals("010")) {
%>
    <td width="130" class="gray" align="center" style="cursor:hand" onClick="detail_view('<%=ds.getBocd()%>','<%=rec.rdr_no%>','<%=rec.rdrnm%>','<%=rec.medinm%>','<%=rec.subsfrser_no%>','<%=rec.substoser_no%>','<%=rec.procdt%>','<%=rec.excsrcpmamt%>','<%=rec.medicd%>','<%=rec.termsubsno%>');" ><font color="blue" ><%=rec.rdr_no%>-<%=rec.medicd%>-<%=rec.termsubsno%></font></td>
<%
	} else {
%>
    <td width="130" class="gray" align="center" ><%=rec.rdr_no%>-<%=rec.medicd%>-<%=rec.termsubsno%></td>
<%
	}
%>
    <td width="60"  class="gray" align="center" ><%=rec.rdrnm%></td>
    <td width="80"  class="gray" align="center" ><%=rec.medinm%></td>
    <td width="80"  class="gray" align="center" ><%=rec.procclsf.equals("")    ? "&nbsp;" : rec.procclsfnm%></td>
    <td width="60"  class="gray" align="center" ><%=rec.procdt.equals("")      ? "&nbsp;" : Util.convertS(rec.procdt)%></td>
    <td width="110" class="gray" align="center" ><%=rec.exstsubssctn%></td>
	<td width="110" class="gray" align="center" ><%=rec.chgsubssctn.equals("") ? "&nbsp;" : rec.chgsubssctn%></td>
    <td width="80"  class="gray" align="right"  ><%=Util.comma(rec.realsellamt)%></td>
    <td width="80"  class="gray" align="right"  ><%=rec.procyn.equals("020")   ? Util.comma(rec.procamt) : Util.comma(rec.excsrcpmamt)%></td>
  </tr>
<%
    }
	for(int i=0; i < no_data_page; i++) {
%>
  <tr>
    <td width="30" class="gray" align="center" >
      <input type="checkbox" name="chk" disabled>
    </td>
    <td width="130" class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="60"  class="gray" align="center" > &nbsp; </td>
    <td width="110" class="gray" align="center" > &nbsp; </td>
	<td width="110" class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
    <td width="80"  class="gray" align="center" > &nbsp; </td>
  </tr>
<%
	}
%>
</table>
<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="navi">
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
              <jsp:param name = "total_records" 		value="<%=total_records%>"/>
              <jsp:param name = "js_fn_nm" 			value="<%=js_fn_nm%>"/>
              <jsp:param name = "records_per_page" 	value="10"/>
              <jsp:param name = "page_set_gubun" 		value="0"/>
              </jsp:include>

              <!--JSP PAGE END------------------------------------------------------------------------------------>
      </td>
  </tr>
</table>

<script>
    var lo_form1  =  parent.document.list_form;
    parent.document.all.list_info.outerHTML = list_info.outerHTML;
    parent.document.all.navi.outerHTML = navi.outerHTML;
    
    lo_form1.subsyy.focus();
</script>
