<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_alon_1711_l.jsp
* ���     : ķ���ΰ��� �˻�
* �ۼ����� : 2004-01-15
* �ۼ���   : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    //����� ��������
    String cmpycd      = Util.getSessionParameterValue(request, "cmpycd", true);          //���������ڵ�
    // dataset �ν��Ͻ� ����κ�
	PS_L_CAMP_SEARCHDataSet ds = (PS_L_CAMP_SEARCHDataSet)request.getAttribute("ds");

	// �˻� ����Ʈ ī��Ʈ
	int recCount  =  ds.camplistcur.size();
	// ���������� ������ ���ڵ� ��
	int pagesize = Integer.parseInt(request.getParameter("pagesize"));
%>

        <!--����Ʈ -->
        <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="list_zone">
          <tr align="center" bgcolor="#dddddd">
            <td class="gray" width="30">
              <input type="checkbox" name="camp_check" onClick="checkAll();">
            </td>
            <td class="gray" width="180">ķ���θ�</td>
            <td class="gray" width="150">ķ���αⰣ</td>
            <td class="gray" width="70">�Ҽ�����</td>
            <td class="gray" width="*">����</td>
          </tr>
<%
	int  j = 0;  //checkbox �Ǽ�
	for(int i=0; i<recCount; i++){
		PS_L_CAMP_SEARCHCAMPLISTCURRecord camplistcurRec = (PS_L_CAMP_SEARCHCAMPLISTCURRecord)ds.camplistcur.get(i);
%>
          <tr onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''"   style="cursor:hand" onclick="pop_emp_camp('<%= camplistcurRec.bocd%>','<%= camplistcurRec.campseq%>');window.event.returnValue=false;">
            <td class="gray" width="30"  align="center">
<%
		//checkbox check �ڽ��� ����� ķ���θ� ������� �Ѵ�
		if ((camplistcurRec.cmpycd).equals(cmpycd)) {
%>
              <input type="checkbox" name="camp_check<%=j%>" value="<%= camplistcurRec.campseq%>">
              <input type="hidden" name="camp_bocd<%=j%>" value="<%= camplistcurRec.bocd%>">
<%
			j++;
		}
		else {
%>
              &nbsp;&nbsp;
<%
		}
%>
            </td>

            <td class="gray"  align="left"   style="cursor:hand" onclick="pop_emp_camp('<%= camplistcurRec.bocd%>','<%= camplistcurRec.campseq%>');window.event.returnValue=false;">
              &nbsp;<%= camplistcurRec.campnm%>&nbsp;
            </td>

            <td class="gray"  align="center"><%= camplistcurRec.bgncampdt%> - <%= camplistcurRec.endcampdt%></td>
            <td class="gray"  align="center">&nbsp;<%= camplistcurRec.bonm%>&nbsp;</td>
            <td class="gray"  align="left"  >&nbsp;<%= camplistcurRec.cont%>&nbsp;</td>
          </tr>
<%
	}

	for(int i=0; i < (pagesize-recCount) ; i++) {
%>
          <tr>
            <td class="gray"  align="center">&nbsp;&nbsp;</td>
            <td class="gray"  align="left"  >&nbsp;&nbsp;</td>
            <td class="gray"  align="center">&nbsp;&nbsp;</td>
            <td class="gray"  align="center">&nbsp;&nbsp;</td>
            <td class="gray"  align="left"  >&nbsp;&nbsp;</td>
          </tr>
<%
	}
%>
        </table>

      <!---button-->
      <table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" align="center" id="page_zone" >
        <tr>
          <td align="center" height="2">
            <!--����-->
          </td>
        </tr>
        <tr>
          <td align="center" height="24" bgcolor="#E8E8E8">
            <div align="center">
            <%
                String pageno        = request.getParameter("pageno");
                String total_records = String.valueOf(ds.getTotalcnt());
                String js_fn_nm      = request.getParameter("js_fn_nm");
            %>
            <!--JSP PAGE START---------------------------------------------------------------------------------->
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
		var lo_form1  =  parent.document.search_form;
		parent.document.all.list_zone.outerHTML = list_zone.outerHTML;
		parent.document.all.page_zone.outerHTML = page_zone.outerHTML;
        parent.setEventHandler();
		lo_form1.checkcnt.value  =  "<%=j%>";
		lo_form1.sh_bgncampdt.focus();
</script>
