<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_alon_1311_l.jsp
* ��� : �������� ��ȸ
* �ۼ����� : 2003-12-08
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page =   request.getParameter("records_per_page");
    // dataset �ν��Ͻ� ����κ�
    PS_L_ALON_RSLT_BASEDataSet ds = (PS_L_ALON_RSLT_BASEDataSet)request.getAttribute("ds");
    // �������� ȭ���� ������ Row��
    int records_non_page = Integer.parseInt(records_per_page) - ds.curcommlist.size();
%>
      <!--����Ʈ -->
      <table width="830"  cellspacing="0" cellpadding="1" border="0" bgcolor="#FFFFFF" class="gray" id="code_list" >
        <tr align="center">
          <td width="30" align="center" bgcolor="#dddddd" class="gray">
            <input type="checkbox" name="checkall"  onClick="chkboxAll()">
          </td>
          <td width="200" bgcolor="#dddddd" class="gray" > �Ҽ����� </td>
          <td width="200" bgcolor="#dddddd" class="gray" > �����ȣ </td>
          <td width="200" bgcolor="#dddddd" class="gray" > ����� </td>
          <td width="200" bgcolor="#dddddd" class="gray" > �μ��� </td>
          <td width="200" bgcolor="#dddddd" class="gray" > ����(%) </td>
        </tr>
<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		PS_L_ALON_RSLT_BASECURCOMMLISTRecord curcommlistRec = (PS_L_ALON_RSLT_BASECURCOMMLISTRecord)ds.curcommlist.get(i);
%>
        <input type="hidden" name="boemp_no" value="<%= curcommlistRec.boemp_no%>">
        <tr>
          <td  width="30" align="center" class="gray" onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''">
            <input type="checkbox" name="insChk" value="">
          </td>
          <td  width="200" class="gray" align="center"><%= curcommlistRec.bonm%></td>
          <td  width="200" class="gray" align="center"><%= curcommlistRec.boemp_no%></td>
          <td  width="200" class="gray" align="center"><%= curcommlistRec.flnm%></td>
          <td  width="200" class="gray" align="center"><%= curcommlistRec.boemp_nm%></td>
          <td width="200" align="center" class="gray" >
            <input name="ratio" type="text" size="10" style='text-align:right;' caption="����"  comma dataType="float" comma maxlength="5"  class="text_box" value="<%= curcommlistRec.ratio%>">
          </td>
        </tr>
<%
	}
	for ( int i= 0 ; i <records_non_page ; i++ ) {
%>
        <tr>
          <td  width="30" align="center" class="gray">&nbsp;</td>
          <td  width="200" class="gray">&nbsp;</td>
          <td  width="200" class="gray">&nbsp;</td>
          <td  width="200" class="gray">&nbsp;</td>
          <td  width="200" class="gray">&nbsp;</td>
          <td width="200" align="center" class="gray" >
          &nbsp;
          </td>
        </tr>
<%
	}
%>
      </table>
      <!---button-->
      <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="list_page" >
        <tr>
          <td align="center" height="2">
            <!--����-->
          </td>
        </tr>
        <tr>
          <td align="center" height="24" bgcolor="#E8E8E8">
            <div align="center">
            <!--JSP PAGE START---------------------------------------------------------------------------------->
            <%
                String curr_page_no = request.getParameter("curr_page_no");
                String total_records = String.valueOf(ds.getTotalcnt());
                String js_fn_nm = request.getParameter("js_fn_nm"); // �������̵� Script
            %>
            <jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
            <jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
            <jsp:param name = "total_records" 		value="<%=total_records%>"/>
            <jsp:param name = "js_fn_nm" 		    value="<%=js_fn_nm%>"/>
            <jsp:param name = "records_per_page" 	value="<%=records_per_page%>"/>
            <jsp:param name = "page_set_gubun" 		value="0"/>
            </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
            </div>
          </td>
        </tr>
      </table>
<script>
    parent.document.all.code_list.outerHTML = code_list.outerHTML;
    parent.document.all.list_page.outerHTML = list_page.outerHTML;
    parent.jsInit();
</script>
