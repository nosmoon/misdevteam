<%@ page contentType="text/html; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_alon_1726_l.jsp
* ���     : ķ���ΰ��� ���ķ���� �˻�
* �ۼ����� : 2004-03-10
* �ۼ���   : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������   :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%
    // dataset �ν��Ͻ� ����κ�
	PS_L_EMPCAMP_SEARCHDataSet ds = (PS_L_EMPCAMP_SEARCHDataSet)request.getAttribute("ds");

	// �˻� ����Ʈ ī��Ʈ
	int recCount  =  ds.empcampcur.size();

	// ���������� ������ ���ڵ� ��
	int pagesize = Integer.parseInt(request.getParameter("pagesize"));
%>

            <!--����Ʈ -->
            <table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="list_zone">
              <tr align="center" bgcolor="#dddddd">
                <td class="gray" width="200">�����ȣ</td>
                <td class="gray" width="200">�����</td>
                <td class="gray" width="200">�μ���</td>
                <td class="gray" width="230">�Ǵ�ݾ�</td>
              </tr>
<%--����� ķ���μ��� �˻� ����Ʈ Display--%>
<%
	for(int i=0; i<recCount; i++){
		PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord empcampcurRec = (PS_L_EMPCAMP_SEARCHEMPCAMPCURRecord)ds.empcampcur.get(i);
%>
              <tr onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''">
                <td class="gray" width="200" align="center">&nbsp;<%= empcampcurRec.boemp_no%>&nbsp;</td>
                <td class="gray" width="200" align="center">&nbsp;<%= empcampcurRec.boemp_nm%>&nbsp;</td>
                <td class="gray" width="200" align="center">&nbsp;<%= empcampcurRec.dept_nm%>&nbsp;</td>
                <td class="gray" width="230" align="center">
                  <input type="text"   name="amt<%=i%>"         value="<%= empcampcurRec.amt%>" class="numb_box" size="7" maxlength="7" caption="�Ǵ�ݾ�" dataType="number" comma >
                  <input type="hidden" name="keyboemp_no<%=i%>" value="<%= empcampcurRec.boemp_no%>">
                  <input type="hidden" name="keybocd_no<%=i%>" value="<%= empcampcurRec.bocd%>">
                </td>
              </tr>
<%--�˻��� ����� ķ���μ��� ����Ʈ �̿ܿ� �� ���ڵ带 ���信 �°� Display--%>
<%
    }

	for(int i=0; i < (pagesize-recCount) ; i++) {
%>
              <tr>
                <td class="gray" width="200" height="23" align="center">&nbsp;</td>
                <td class="gray" width="200" height="23" align="center">&nbsp;</td>
                <td class="gray" width="200" height="23" align="center">&nbsp;</td>
                <td class="gray" width="230" height="23" align="center">&nbsp;</td>
              </tr>
<%
    }
%>
            </table>
            <!---button-->
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
                            <!--JSP PAGE START---------------------------------------------------------------------------------->
<%
    String pageno        = request.getParameter("pageno");
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
		var lo_form1  =  parent.document.search_form;
		var lo_form2  =  parent.document.campalon_form;
		parent.document.all.list_zone.outerHTML = list_zone.outerHTML;
		parent.document.all.page_zone.outerHTML = page_zone.outerHTML;
        parent.setEventHandler();
        lo_form2.checkcnt.value = "<%= recCount%>";
		lo_form1.sh_boemp_no1.focus();
	</script>
