<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : ss_common_1174_ljsp
* 기능       : 독자검색팝업(기본형)(목록조회)
* 작성일자   : 2004-01-15
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%--DataSet 및 Request를 처리 한다. --%>
<%
	//request
    long curr_page_no = ((String)request.getParameter("pageno") == null)? 1 : Long.parseLong(request.getParameter("pageno"));
	long records_per_page = 10;

	long start_no = ((curr_page_no - 1) * records_per_page)  + 1;

    //getting dataset
    SS_L_READER_01DataSet ds = (SS_L_READER_01DataSet)request.getAttribute("ds");  // request dataset

    //application exception 처리
    if(ds.readercur.size() < 1){
        request.setAttribute("appException", new AppException("ss_common_1174_l.jsp(1)","검색결과가 존재하지 않습니다."));
        pageContext.forward("/jsp/ss/comm_jsp/app_error.jsp");
    }
%>
<%-- Util의 leftKscStrB 를 확장시켜 문자열이 최대 Byte수를 초과 했다면, 문자열을 최대바이트 수만큼 자른후 ".."을 뒤에 붙여 리턴하도록하였다. --%>
<%!
    /**
     * 문자열과 Byte 수를 입력받아 문자열의 왼쪽을 기준으로 해당 바이트 수만큼 문자열을 리턴하고 ".."을 붙인다.
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

<!----------------------- 독자목록 시작 --------------------------->
      <table width="670"  cellpadding="2" cellspacing="0" class="gray" id="reader_list_id">
        <tr bgcolor="#DDDDDD">
          <td width="64" height="22" align="center" class="gray">구역+배달</td>
          <td width="59" align="center" class="gray"> 독자번호 </td>
          <td width="87" height="22" align="center" class="gray" >독자명</td>
          <td width="88" height="22" align="center" class="gray">전화번호</td>
          <td width="86" height="22" align="center" class="gray">마일리지</td>
          <td width="194" height="22" align="center" class="gray">주소</td>
          <td width="62" height="22" align="center" class="gray"><span title="독자가 구독중인 매체의 실구독액(유료부수X매체단가-할인액)을 모두 합한 금액">총구독액</span></td>
        </tr>
<%--독자목록 루프--%>
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
<%--독자목록 공백--%>
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
<!----------------------- 독자목록 끝 --------------------------->
<script>
	parent.document.all.reader_list_id.outerHTML = reader_list_id.outerHTML;
    parent.document.all.page_navigator_id.outerHTML = page_navigator_id.outerHTML;
</script>