<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_reader_1290_l.jsp
* ��� 		 : ������������(���ϸ������޳����˾�-�����ȸ)
* �ۼ����� 	 : 2004-06-03
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� 	 :
* ������ 	 :
* �������� 	 :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	// request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	long records_per_page = ((String)request.getParameter("pagesize") == null)? 10 : Long.parseLong(request.getParameter("pagesize"));

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    // getting datasetgetAttribute
    SL_L_MILGPAYDataSet ds = (SL_L_MILGPAYDataSet)request.getAttribute("ds");  // request dataset
%>
      <table width="670" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray" id="his_list_id">
        <tr align="center" bgcolor="#dddddd">
          <td width="64" class="gray">��������</td>
          <td width="52" class="gray">���޹�ȣ</td>
          <td class="gray" width="81">��ü��</td>
          <td width="93" class="gray">���ޱ���</td>
          <td width="71" class="gray">����Ʈ</td>
          <td width="71" class="gray">����д��</td>
          <td width="70" class="gray">�����д��</td>
          <td width="96" class="gray">����������</td>
          <td class="gray">����</td>
        </tr>
<%--���ϸ������޳��� ��� ���� ����--%>
<%
SL_L_MILGPAYPAYCURRecord paycurRec = null;
for(int i=0; i<ds.paycur.size(); i++){
    paycurRec = (SL_L_MILGPAYPAYCURRecord)ds.paycur.get(i);
%>
        <tr bgcolor="#FFFFFF" onclick="milg_detail('<%=paycurRec.rdr_no%>', '<%=paycurRec.milgpaydt%>', '<%=paycurRec.milgpayno%>');" style="cursor:hand" onmouseover='this.className="over";' onmouseout='this.className="out";'>
          <td class="gray" width="64" align="center"><%=Util.convertS(paycurRec.milgpaydt)%>&nbsp;</td>
          <td class="gray" width="52" align="center"><%=paycurRec.milgpayno%>&nbsp;</td>
          <td class="gray" width="81"><%=paycurRec.medinm%>&nbsp;</td>
          <td class="gray" width="93"><%=paycurRec.paybasinm%>&nbsp;</td>
          <td class="gray" width="71" align="right"><%=Util.comma(paycurRec.pont)%>&nbsp;</td>
          <td class="gray" width="71" align="right"><%=Util.comma(paycurRec.hdqtallmamt)%>&nbsp; </td>
          <td class="gray" align="right"><%=Util.comma(paycurRec.boallmamt)%>&nbsp; </td>
          <td class="gray"><%=paycurRec.bonm%>&nbsp; </td>
          <td class="gray" align="center"><%=paycurRec.margamyn%>&nbsp; </td>
        </tr>
<%
}
%>
<%--���ϸ������޳��� ��� ���� ��--%>
<%--���� ���� ����--%>
<%
for(int j=0; j<records_per_page - ds.paycur.size(); j++){
%>
        <tr>
          <td class="gray" width="64" align="center">&nbsp;</td>
          <td class="gray" width="52" align="center">&nbsp;</td>
          <td class="gray" width="81">&nbsp;</td>
          <td class="gray" width="93">&nbsp;</td>
          <td class="gray" width="71" align="right">&nbsp;</td>
          <td class="gray" width="71" align="right">&nbsp; </td>
          <td class="gray" align="right">&nbsp; </td>
          <td class="gray">&nbsp; </td>
          <td class="gray" align="center">&nbsp; </td>
        </tr>
<%
}
%>
<%--���� ���� ��--%>
      </table>
      <!--��ư-->
      <table width="670" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="navigator_id">
        <tr>
          <td align="center" height="25" bgcolor="#E8E8E8">
          <!--JSP PAGE START---------------------------------------------------------------------------------->
                <jsp:include page="/jsp/ss/slcomm_jsp/page_navigator.jsp">
                <jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
                <jsp:param name = "total_records" 		value="<%=ds.totalcnt%>"/>
                <jsp:param name = "js_fn_nm" 			value="page_move"/>
                <jsp:param name = "records_per_page" 	value="10"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
          <!--JSP PAGE END------------------------------------------------------------------------------------>
          </td>
        </tr>
      </table>
<script language="javascript">
	parent.document.all.his_list_id.outerHTML = document.all.his_list_id.outerHTML;
	parent.document.all.navigator_id.outerHTML = document.all.navigator_id.outerHTML;

    <%
    if(ds.paycur.size()==0) {
        out.print("alert(\"�˻������ �����ϴ�.\");");
    }
    %>

    //�������� ��� ������ ����
    if(parent.document.milg_detail_form.accflag.value == "U"){
        parent.document.milg_detail_view_form.submit();
    }

    //�̺�Ʈ �ڵ鷯 ����
    parent.jsInit();
</script>