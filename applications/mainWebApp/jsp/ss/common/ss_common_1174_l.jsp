<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : ss_common_1174_ljsp
* ���       : ���ڰ˻��˾�(�⺻��)(�����ȸ)
* �ۼ�����   : 2004-01-15
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%--DataSet �� Request�� ó�� �Ѵ�. --%>
<%
	//request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	long records_per_page = 10;

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    //getting dataset
    SS_L_READER_01DataSet ds = (SS_L_READER_01DataSet)request.getAttribute("ds");  // request dataset

    //application exception ó��
    if(ds.readercur.size() < 1){
        request.setAttribute("appException", new AppException("ss_common_1174_l.jsp(1)","�˻������ �������� �ʽ��ϴ�."));
        pageContext.forward("/jsp/ss/comm_jsp/app_error.jsp");
    }
%>
<%-- Util�� leftKscStrB �� Ȯ����� ���ڿ��� �ִ� Byte���� �ʰ� �ߴٸ�, ���ڿ��� �ִ����Ʈ ����ŭ �ڸ��� ".."�� �ڿ� �ٿ� �����ϵ����Ͽ���. --%>
<%!
    /**
     * ���ڿ��� Byte ���� �Է¹޾� ���ڿ��� ������ �������� �ش� ����Ʈ ����ŭ ���ڿ��� �����ϰ� ".."�� ���δ�.
     * @param str
     * @param maxBytes
     * @return
     */
    private static String leftKscStrB(String str, int maxBytes){
        if(str == null && "".equals(str) || maxBytes <= 1) return "";
        String strTemp = "";

    	if(str.getBytes().length <= maxBytes)
            strTemp = str;
        else
            strTemp = Util.leftKscStrB(str, maxBytes) + "..";
        return strTemp;
    }
%>

<!----------------------- ���ڸ�� ���� --------------------------->
      <table width="670"  cellpadding="2" cellspacing="0" class="gray" id="reader_list_id">
        <tr bgcolor="#DDDDDD">
          <td width="64" height="22" align="center" class="gray">����+���</td>
          <td width="59" align="center" class="gray"> ���ڹ�ȣ </td>
          <td width="87" height="22" align="center" class="gray" >���ڸ�</td>
          <td width="88" height="22" align="center" class="gray">��ȭ��ȣ</td>
          <td width="86" height="22" align="center" class="gray">���ϸ���</td>
          <td width="194" height="22" align="center" class="gray">�ּ�</td>
          <td width="62" height="22" align="center" class="gray"><span title="���ڰ� �������� ��ü�� �Ǳ�����(����μ�X��ü�ܰ�-���ξ�)�� ��� ���� �ݾ�">�ѱ�����</span></td>
        </tr>
<%--���ڸ�� ����--%>
<%
		SS_L_READER_01READERCURRecord rec = null;
		for(int i=0; i<ds.readercur.size(); i++){
			rec = (SS_L_READER_01READERCURRecord)ds.readercur.get(i);
%>
        <tr bgcolor="#FFFFFF" onclick='set_reader_info(  "<%= rec.rdr_no         %>"
                                                        ,"<%= rec.paty_clsfcd    %>"
                                                        ,"<%= rec.natnclsfcd     %>"
                                                        ,"<%= rec.onlmembid      %>"
                                                        ,"<%= rec.rdrnm          %>"
                                                        ,"<%= rec.prn            %>"
                                                        ,"<%= rec.ernno          %>"
                                                        ,"<%= rec.email          %>"
                                                        ,"<%= rec.dlvzip         %>"
                                                        ,"<%= rec.dlvcd          %>"
                                                        ,"<%= rec.dlvaddr        %>"
                                                        ,"<%= rec.dlvdtlsaddr    %>"
                                                        ,"<%= rec.dlvdong        %>"
                                                        ,"<%= rec.dlvser_no      %>"
                                                        ,"<%= rec.dlvbnji        %>"
                                                        ,"<%= rec.dlvteamcd      %>"
                                                        ,"<%= rec.dlvdstccd      %>"
                                                        ,"<%= rec.dlvno          %>"
                                                        ,"<%= rec.dlvintvno      %>"
                                                        ,"<%= rec.dlvmthdcd      %>"
                                                        ,"<%= rec.dlvqty         %>"
                                                        ,"<%= rec.rdrtel_no1     %>"
                                                        ,"<%= rec.rdrtel_no2     %>"
                                                        ,"<%= rec.rdrtel_no3     %>"
                                                        ,"<%= rec.rdrptph_no1    %>"
                                                        ,"<%= rec.rdrptph_no2    %>"
                                                        ,"<%= rec.rdrptph_no3    %>"
                                                        ,"<%= rec.realsubsamt    %>"
                                                        ,"<%= rec.subsamt        %>"
                                                        ,"<%= rec.dscnamt        %>"
                                                        ,"<%= rec.rptvsubsdt     %>"
                                                        ,"<%= rec.rptvrdr_extndt %>"
                                                        ,"<%= rec.addrnm         %>"
                                                        ,"<%= rec.mil            %>"
                                                        );' style="cursor:hand" onmouseover='this.className="over";' onmouseout='this.className="out";'>
          <td height="17" class="gray"><%= Util.getChainStr(rec.dlvdstccd, rec.dlvno, rec.dlvintvno, "-") %></td>
          <td class="gray"><%= rec.rdr_no %></td>
          <td class="gray"><span title="<%= rec.rdrnm %>"><%= leftKscStrB(rec.rdrnm,4*2) %></span>&nbsp;</td>
          <td class="gray"><%= rec.rdrtel_no2 + "-" + rec.rdrtel_no3 %></td>
          <td class="gray"><%= rec.mil %></td>
          <td class="gray"><span title="<%= rec.addrnm + " " + rec.dlvdtlsaddr + " " + rec.dlvdong + " " + rec.dlvser_no + " " + rec.dlvbnji %>"><%= leftKscStrB(rec.addrnm + " " + rec.dlvdtlsaddr + " " + rec.dlvdong + " " + rec.dlvser_no + " " + rec.dlvbnji , 20)%></span></td>
          <td align="right" class="gray"><%= Util.comma(rec.realsubsamt)%></td>
        </tr>
<%
		}
		for(int j=0; j<records_per_page - ds.readercur.size(); j++){
%>
<%--���ڸ�� ����--%>
        <tr bgcolor="#FFFFFF">
          <td height="17" class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td class="gray">&nbsp;</td>
          <td align="right" class="gray">&nbsp;</td>
        </tr>
<%
		}
%>
      </table>
      <table width="670" border="0" cellspacing="0" cellpadding="0"  class="title2" align="center" id="page_navigator_id">
        <tr>
          <td align="center" height="25" bgcolor="#E8E8E8">
            <!--JSP PAGE START---------------------------------------------------------------------------------->
                    <jsp:include page="/jsp/ss/comm_jsp/page_navigator.jsp">
                    <jsp:param name = "pageno"			value="<%=curr_page_no%>"/>
                    <jsp:param name = "totalcnt"		value="<%=ds.totalcnt%>"/>
                    <jsp:param name = "js_fn_nm"		value="reader_list_search"/>
                    <jsp:param name = "pagesize"		value="<%=records_per_page%>"/>
                    <jsp:param name = "page_set_gubun"	value="0"/>
                    </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
          </td>
        </tr>
      </table>
<!----------------------- ���ڸ�� �� --------------------------->
<script>
	parent.document.all.reader_list_id.outerHTML = reader_list_id.outerHTML;
    parent.document.all.page_navigator_id.outerHTML = page_navigator_id.outerHTML;
</script>