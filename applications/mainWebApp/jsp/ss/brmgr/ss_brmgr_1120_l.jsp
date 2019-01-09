<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1120_l.jsp
* 기능 : 지국경영-마일리지현황-상세
* 작성일자 : 2004-03-17
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	SS_L_MILGPAYDataSet ds = (SS_L_MILGPAYDataSet)request.getAttribute("ds");
    int listCount = 10;			// 한 화면당 리스트 항목 수
%>

<table width="830" border="0" cellspacing="0"  cellpadding="1" class="gray" bgcolor="#FFFFFF" id="milgpay_detail_id">
	<tr align="center" bgcolor="#dddddd" height="23"> 
		<td width="70" class="gray"> 지급일자 </td>
		<td class="gray"> 독자명 </td>
		<td width="70" class="gray">매체</td>
		<td width="50" class="gray">포인트</td>
		<td width="100" class="gray">지급구분</td>
		<td width="100" class="gray">지급기준</td>
		<td width="50" class="gray">환율</td>
		<td width="65" class="gray">정산금</td>
		<td width="65" class="gray">본사분담</td>
		<td width="65" class="gray">지국분담</td>
	</tr>
	<%-- 리스트 가져 오는 부분--%>
	<%
	for(int i=0; i<ds.curcommlist.size(); i++){
	SS_L_MILGPAYCURCOMMLISTRecord curcommlistRec = (SS_L_MILGPAYCURCOMMLISTRecord)ds.curcommlist.get(i);
	%>       
	<tr> 
		<td class="gray" width="70" align="center"><%= Util.convertS(curcommlistRec.milgpaydt)%>&nbsp;</td>
		<td class="gray" ><%= curcommlistRec.rdrnm%>&nbsp;</td>
		<td class="gray" width="70"><%= curcommlistRec.medicdnm%>&nbsp;</td>
		<td class="gray" width="50" align="right"><%= Util.comma(curcommlistRec.pont)%>&nbsp;</td>
		<td class="gray" width="100"><%= curcommlistRec.payclsfcdnm%>&nbsp;</td>
		<td class="gray" width="100"><%= curcommlistRec.paybasinm%>&nbsp;</td>
		<td class="gray" width="50" align="right"><%= curcommlistRec.adjmexchrate%>&nbsp;</td>
		<td class="gray" width="65" align="right"><%= Util.comma(curcommlistRec.adjmamt)%>&nbsp;</td>
		<td class="gray" width="65" align="right"><%= Util.comma(curcommlistRec.hdqtallmamt)%>&nbsp;</td>
		<td class="gray" width="65" align="right"><%= Util.comma(curcommlistRec.boallmamt)%>&nbsp;</td>
	</tr>
	<%}%>  
	<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
	<%for(int i=0; i<(listCount-ds.curcommlist.size()); i++){%>
	<tr> 
		<td class="gray" width="70" align="center">&nbsp;</td>
		<td class="gray">&nbsp;</td>
		<td class="gray" width="70">&nbsp;</td>
		<td class="gray" width="50" align="right">&nbsp;</td>
		<td class="gray" width="100">&nbsp;</td>
		<td class="gray" width="100">&nbsp;</td>
		<td class="gray" width="50" align="right">&nbsp;</td>
		<td class="gray" width="65" align="right">&nbsp;</td>
		<td class="gray" width="65" align="right">&nbsp;</td>
		<td class="gray" width="65" align="right">&nbsp;</td>
	</tr>	    
	<%}%> 
	<%-- 초기화면 목록 반복 끝 --%>		           
	<tr bgcolor="#dddddd" align="right"> 
		<td colspan="10" class="gray" height="23">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"><b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>
		</td>
	</tr>
</table>

<!-- 페이지 이동 -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move2">
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
	        <jsp:param name = "pagesize" 	value="<%=listCount%>"/>
	        <jsp:param name = "page_set_gubun" 	value="0"/>
	    </jsp:include>
	    <!--JSP PAGE END------------------------------------------------------------------------------------>
    </td>
  </tr>
</table>
<!-- 페이지 이동 -->


<script>

    parent.document.all.milgpay_detail_id.outerHTML = milgpay_detail_id.outerHTML;
    parent.document.all.page_move2.outerHTML = page_move2.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();
    
<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>    
</script>
