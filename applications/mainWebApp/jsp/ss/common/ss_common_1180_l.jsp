<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_common_1178_l.jsp
* ��� : ���� �˻� �˾� ���
* �ۼ����� : 2003-04-13
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	CO_L_RDR_SRCHDataSet ds = (CO_L_RDR_SRCHDataSet)request.getAttribute("ds");
    int listCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
%>
      <table width="670"  cellpadding="2" cellspacing="0" class="gray" id="reader_list_id">
        <tr bgcolor="#DDDDDD">
		  <td width="59" align="center" class="gray"> ���ڹ�ȣ </td>
          <td width="59" height="22" align="center" class="gray" >���ڸ�</td>
		  <td width="59" align="center" class="gray"> ����ID </td>
          <td width="194" height="22" align="center" class="gray">�ּ�</td>
          <td width="88" height="22" align="center" class="gray">��ȭ��ȣ</td>
          <td width="88" height="22" align="center" class="gray">�޴�����ȣ</td>                    		            		          
          <td width="100" height="22" align="center" class="gray">Email</td>
        </tr>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		CO_L_RDR_SRCHCURCOMMLISTRecord curcommlistRec = (CO_L_RDR_SRCHCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- �� ��ũ -->
        <tr bgcolor="#FFFFFF">
        <tr bgcolor="#FFFFFF" onclick='set_reader_info(  "<%= curcommlistRec.rdr_no         %>"
                                                        ,"<%= curcommlistRec.rdrnm          %>"
                                                        ,"<%= curcommlistRec.onlmembid      %>"
                                                        ,"<%= curcommlistRec.dlvzip         %>"
                                                        ,"<%= curcommlistRec.dlvaddr        %>"
                                                        ,"<%= curcommlistRec.dlvdtlsaddr    %>"
                                                        ,"<%= curcommlistRec.rdrtel_no1     %>"
                                                        ,"<%= curcommlistRec.rdrtel_no2     %>"
                                                        ,"<%= curcommlistRec.rdrtel_no3     %>"
                                                        ,"<%= curcommlistRec.rdrptph_no1    %>"
                                                        ,"<%= curcommlistRec.rdrptph_no2    %>"
                                                        ,"<%= curcommlistRec.rdrptph_no3    %>"
                                                        ,"<%= curcommlistRec.email          %>"
                                                        ,"<%= curcommlistRec.prn            %>"
                                                        ,"<%= curcommlistRec.onlmembseq     %>"
                                                        );' style="cursor:hand" onmouseover='this.className="over";' onmouseout='this.className="out";'>
        
          <td class="gray">&nbsp;<%= curcommlistRec.rdr_no%></td>
          <td class="gray">&nbsp;<%= curcommlistRec.rdrnm%></td>
          <td class="gray">&nbsp;<%= curcommlistRec.onlmembid%></td>
          <td class="gray">&nbsp;<%= curcommlistRec.dlvaddr%> <%= curcommlistRec.dlvdtlsaddr%></td>          
          <td class="gray">&nbsp;<%= Util.getChainStr(curcommlistRec.rdrtel_no1, curcommlistRec.rdrtel_no2, curcommlistRec.rdrtel_no3, "-")%></td>
          <td class="gray">&nbsp;<%= Util.getChainStr(curcommlistRec.rdrptph_no1, curcommlistRec.rdrptph_no2, curcommlistRec.rdrptph_no3, "-")%></td>
          <td class="gray">&nbsp;<%= curcommlistRec.email%></td>
        </tr>
    <%}%>

    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� ���� --%>
    <%for(int i=0; i<(listCount-ds.curcommlist.size()); i++){%>
        <tr bgcolor="#FFFFFF">
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>          
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
        </tr>    
    <%}%>
    <%-- ȭ��� ������ �׸��� ���� ��� �� �׸� ��� �� --%>    
      </table>


<!-- ������ �̵� -->

      <table width="670" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="page_move">
        <tr>
          <td align="center" height="25" bgcolor="#E8E8E8">
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
                <jsp:param name = "pagesize" 	value="<%= listCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
          </td>
        </tr>
      </table>
<!-- ������ �̵� -->
<script>
    parent.document.all.reader_list_id.outerHTML = reader_list_id.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
</script>