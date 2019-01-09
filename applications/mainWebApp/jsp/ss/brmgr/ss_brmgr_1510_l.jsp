<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1510_l.jsp
* 기능 : 지국경영-공정위위약금-목록
* 작성일자 : 2004-05-19
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_FCT_FRFT_LISTDataSet ds = (SS_L_FCT_FRFT_LISTDataSet)request.getAttribute("ds");
    int fctListCount = 10;	// 한 화면당 리스트 항목 수
%>
<table width="830" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="fct_frft_list">
	<tr bgcolor="#dddddd" align="center">
		<td rowspan="2" class="gray" width="65"> 부과일자 </td>
		<td rowspan="2" class="gray" width="50"> 지국 </td>
		<td rowspan="2" class="gray" width="85"> 위약사유 </td>
		<td rowspan="2" class="gray" width="60"> 독자명 </td>
		<td rowspan="2" class="gray" width="60"> 심의 </td>
		<td rowspan="2" class="gray" width="60"> 위약금액 </td>
		<td height="17" colspan="3" class="gray"> 본사 </td>
		<td colspan="3" class="gray"> 지국 </td>
		<td rowspan="2" class="gray" width="60"> 보류금액&nbsp; </td>
	</tr>
	<tr align="center">
		<td bgcolor="#dddddd" class="gray" width="65"> 입금액 </td>
		<td bgcolor="#dddddd" class="gray" width="65"> 입금일자 </td>
		<td bgcolor="#dddddd" class="gray" width="65"> 미납금액 </td>
		<td bgcolor="#dddddd" class="gray" width="65"> 입금액 </td>
		<td bgcolor="#dddddd" class="gray" width="65"> 입금일자 </td>
		<td bgcolor="#dddddd" class="gray" width="65"> 미납금액 </td>
	</tr>
<%
for(int i=0; i<ds.curcommlist.size(); i++){
	SS_L_FCT_FRFT_LISTCURCOMMLISTRecord curcommlistRec = (SS_L_FCT_FRFT_LISTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- 상세 링크 -->
	<tr onclick="detail_view('<%=curcommlistRec.getImpndt()%>','<%=curcommlistRec.getDeptcd() %>','<%=curcommlistRec.getAreacd() %>','<%=curcommlistRec.getBocd() %>','<%=curcommlistRec.getViltresn() %>');change_sel_row(this);" style="cursor:hand" onmouseover="mouse_in(this);" onmouseout="mouse_out(this);">
		<td class="gray" align="center" width="65"><%=Util.convertS(curcommlistRec.getImpndt())%>&nbsp;</td>
		<td class="gray" width="50"><%=curcommlistRec.getBonm()%> &nbsp;</td>
		<td class="gray" width="85"><%=curcommlistRec.getViltresnnm()%>&nbsp;</td>
		<td class="gray" width="60"><%=curcommlistRec.getRdrnm()%>&nbsp;</td>
		<td class="gray" align="left" width="60"><%=curcommlistRec.getDelbocomnm()%>&nbsp;</td>
		<td class="gray" align="right" width="60"><%=Util.formatNumber(curcommlistRec.getFrftimpnamt())%>&nbsp;</td>
		<td class="gray" align="right" width="65"><%=Util.formatNumber(curcommlistRec.getHdqtrcpmamt())%>&nbsp;</td>
		<td class="gray" align="center" width="65"><%=Util.convertS(curcommlistRec.getHdqtrcpmdt())%>&nbsp;</td>
		<td class="gray" align="right" width="65"><%=Util.formatNumber(curcommlistRec.getHdqtun_pymtamt())%>&nbsp;</td>
		<td class="gray" align="right" width="65"><%=Util.formatNumber(curcommlistRec.getBorcpmamt())%>&nbsp; </td>
		<td class="gray" align="center" width="65"><%=Util.convertS(curcommlistRec.getBorcpmdt())%>&nbsp;</td>
		<td class="gray" align="right" width="65"><%=Util.formatNumber(curcommlistRec.getBoun_pymtamt())%>&nbsp;</td>
		<td class="gray" align="right" width="60"><%=Util.formatNumber(curcommlistRec.getResamt())%>&nbsp; </td>
	</tr>
    <%}%>

    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(fctListCount-ds.curcommlist.size()); i++){%>
	<tr>
		<td class="gray" align="center" width="65">&nbsp;</td>
		<td class="gray" width="50">&nbsp;</td>
		<td class="gray" width="85">&nbsp;</td>
		<td class="gray" width="60">&nbsp;</td>
		<td class="gray" align="center" width="60">&nbsp;</td>
		<td class="gray" align="right" width="60">&nbsp;</td>
		<td class="gray" align="right" width="65">&nbsp;</td>
		<td class="gray" align="center" width="65">&nbsp;</td>
		<td class="gray" align="right" width="65">&nbsp;</td>
		<td class="gray" align="right" width="65">&nbsp;</td>
		<td class="gray" align="center" width="65">&nbsp;</td>
		<td class="gray" align="right" width="65">&nbsp;</td>
		<td class="gray" align="right" width="60">&nbsp;</td>
	</tr>
    <%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>

	<tr bgcolor="#dddddd" height="23">
		<td colspan="5" align="center" class="gray"> 계 </td>
		<td class="gray" align="right" width="60">&nbsp;<%=Util.formatNumber(ds.getFrftimpnamt_total())%> </td>
		<td class="gray" align="right" width="60">&nbsp;<%=Util.formatNumber(ds.getHdqtrcpmamt_total())%> </td>
		<td class="gray" align="center" width="60"> - </td>
		<td class="gray" align="right" width="60">&nbsp;<%=Util.formatNumber(ds.getHdqtun_pymtamt_total())%> </td>
		<td class="gray" align="right" width="60">&nbsp;<%=Util.formatNumber(ds.getBorcpmamt_total())%> </td>
		<td class="gray" align="center" width="60"> - </td>
		<td class="gray" align="right" width="60">&nbsp;<%=Util.formatNumber(ds.getBoun_pymtamt_total())%> </td>
		<td class="gray" align="right" width="60">&nbsp;<%=Util.formatNumber(ds.getResamt_total())%> </td>
	</tr>
	<tr bgcolor="#dddddd" align="right">
	  	<td colspan="13" class="gray" height="23">
	  		<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b>총건수 <%=Util.comma(ds.getTotalcnt())%> 건</b>
	   </td>
	</tr>
</table>

<!-- 페이지 이동 -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move">
    <tr>
        <td align="center" height="2">
        <!--여백-->
        </td>
    </tr>
    <tr>
        <td align="center" height="24" bgcolor="#E8E8E8">
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
                <jsp:param name = "pagesize" 	value="<%= fctListCount%>"/>
                <jsp:param name = "page_set_gubun" 	value="0"/>
                </jsp:include>
            <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->


<script>
    parent.document.all.fct_frft_list.outerHTML = fct_frft_list.outerHTML;
    parent.document.all.page_move.outerHTML = page_move.outerHTML;
    
    // 이벤트 핸들러 호출
    parent.jsInit();
    
	// 화면 초기화
    parent.fct_frft_aceess('I');
    
<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>        
</script>
