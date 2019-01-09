<%@ page contentType="text/html; charset=ksc5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_bil_1806_l.jsp
* 기능 : 수금-자동이체청구예정목록
* 작성일자 : 2006-04-17
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    PS_L_SHFT_CLAM_PLANDataSet ds = (PS_L_SHFT_CLAM_PLANDataSet)request.getAttribute("ds");

    // 페이징 관련
    int records_per_page = Integer.parseInt(request.getParameter("records_per_page"));
    String curr_page_no = request.getParameter("curr_page_no");
    String total_records = String.valueOf(ds.getTotalcnt());
    String js_fn_nm = request.getParameter("js_fn_nm");
%>
<table width="830" height="215" border="0" cellpadding="1" cellspacing="0" bgcolor="#ffffff" class="gray" id="plan_list_id">
    <tr align="center">
        <td bgcolor="#dddddd" class="gray" width="130"> 독자번호 </td>
        <td bgcolor="#dddddd" class="gray" width="100"> 수취인 </td>
        <td bgcolor="#dddddd" class="gray" width="100"> 매체 </td>
        <td bgcolor="#dddddd" class="gray" width="80"> 청구액(원) </td>
        <td bgcolor="#dddddd" class="gray" width="100"> 이체구분 </td>
        <td bgcolor="#dddddd" class="gray" width="80"> 청구구분 </td>
        <td bgcolor="#dddddd" class="gray" width="100"> 구독월분 </td>
        <td bgcolor="#dddddd" class="gray" width="100"> 약정일자 </td>
<!--        <td bgcolor="#dddddd" class="gray" width="40"> 취소 </td> -->
    </tr>
    <%--리스트보기 시작--%>
    <%
    int i = 0;
    for(i=0; i<ds.rsltcur.size(); i++){
        PS_L_SHFT_CLAM_PLANRSLTCURRecord rsltcurRec = (PS_L_SHFT_CLAM_PLANRSLTCURRecord)ds.rsltcur.get(i);%>
    <tr onmouseover="this.style.backgroundColor='#EDFFF1'" onmouseout="this.style.backgroundColor=''" >
        <td class="gray" align=center><%=rsltcurRec.rdr_no%>-<%=rsltcurRec.medicd%>-<%=rsltcurRec.termsubsno%></td>
        <td class="gray" align=center><%=rsltcurRec.rdrnm%>&nbsp;</td>
        <td class="gray" align=center><%=rsltcurRec.medinm%>&nbsp;</td>
        <td class="gray" align=right><%=Util.comma(rsltcurRec.agrmntamt)%>&nbsp;</td>
        <td class="gray" align=center><%=rsltcurRec.rcpmmthdnm%>&nbsp;</td>
        <td class="gray" align=center><%=rsltcurRec.rcpmclsfnm%>&nbsp;</td>
        <td class="gray" align=center><%=Util.convertMonthS(rsltcurRec.subsmappli)%>&nbsp;</td>
        <td class="gray" align=center><%=rsltcurRec.agrmnt_dt%>&nbsp;</td>
<!--		<td class="gray" align="center" onclick=auto_cancel('< %=rsltcurRec.rdr_no%>','< %=rsltcurRec.medicd%>','< %=rsltcurRec.termsubsno%>','< %=rsltcurRec.agrmntseq%>') style="cursor:hand;" ><font color="brown" style="TEXT-DECORATION: underline;">취소</font></td> -->
    </tr>
    <%--빈 줄 생성--%>
    <%
        }

    if(i<records_per_page) {
        for(int j=0; j<records_per_page-i; j++) {

    %>
    <tr>
        <td class="gray">&nbsp;</td>
        <td class="gray">&nbsp;</td>
        <td class="gray">&nbsp;</td>
        <td class="gray">&nbsp;</td>
        <td class="gray">&nbsp;</td>
        <td class="gray">&nbsp;</td>
        <td class="gray">&nbsp;</td>
        <td class="gray">&nbsp;</td>
<!--        <td class="gray">&nbsp;</td> -->
    </tr>
   <%
        }
    }
   %>
    <tr align="right" bgcolor="#dddddd">
        <td colspan="9" height="23" class="gray"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">총 건수 <b><%= Util.comma(ds.getTotalcnt())%>건</b> <img src="/html/comm_img/ic_arr06.gif" width="7" height="7">총 청구액 <b><%= Util.comma(ds.getTotalsum())%>원</b></td>
    </tr>
</table>
<!---button-->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="plan_nav_id">
    <tr>
        <td align="center" height="2"> <!--여백--> </td>
    </tr>
    <tr>
        <td align="center" height="24" bgcolor="#E8E8E8">
        <!--JSP PAGE START---------------------------------------------------------------------------------->
        <jsp:include page="/jsp/ps/comm_jsp/page_navigator.jsp">
        <jsp:param name = "curr_page_no" 		value="<%=curr_page_no%>"/>
        <jsp:param name = "total_records" 		value="<%=total_records%>"/>
        <jsp:param name = "js_fn_nm" 			value="<%=js_fn_nm%>"/>
        <jsp:param name = "records_per_page" 	value="<%=records_per_page%>"/>
        <jsp:param name = "page_set_gubun" 		value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<script language="javascript">
    parent.document.all.plan_list_id.outerHTML = document.all.plan_list_id.outerHTML;
    parent.document.all.plan_nav_id.outerHTML = document.all.plan_nav_id.outerHTML;

    <%
        if(ds.rsltcur.size()==0) {
    %>
    alert("검색결과가 없습니다.");
    <%
        }
    %>
</script>
