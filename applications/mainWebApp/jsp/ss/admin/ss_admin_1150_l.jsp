<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1150_l.jsp
* 기능 : 관리자-작업-마이그레이션-지국DB업로드 작업내역
* 작성일자 : 2004-03-12
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_MIGRWORKPTCRDataSet ds = (SS_L_MIGRWORKPTCRDataSet)request.getAttribute("ds");
    int migListCount = 5;	// 한 화면당 리스트 항목 수
%>
<table width="830"  cellpadding="1" cellspacing="0" class="gray" bgcolor="#ffffff" id="mig_ptcr_id">
	<tr bgcolor="#dddddd" align="center" height="23">
		<td width="120" class="gray">시각(시작/종료)</td>
		<td width="140" class="gray">테이블(소스/타깃)</td>
		<td width="110" class="gray">데이터(추출/전환)</td>
		<td class="gray">에러([코드]/메세지)</td>
	</tr>
	
	<%-- 작업이력 목록 시작 --%>	
	<%for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_MIGRWORKPTCRCURCOMMLISTRecord curcommlistRec = (SS_L_MIGRWORKPTCRCURCOMMLISTRecord)ds.curcommlist.get(i);%>
	<tr>
		<td width="120" class="gray" align="center"><%= Util.Timestamp2Str(curcommlistRec.workfrdt,"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp;</td>
		<td width="140" class="gray" align="left">&nbsp;<%= curcommlistRec.srctbl%></td>
		<td width="110" class="gray" align="right"><%= Util.comma(curcommlistRec.abstrnoit)%>&nbsp;</td>
		<td rowspan="2" class="gray" align="left">
			<%if(!"".equals(curcommlistRec.errcd)){%>
				[<b><%= curcommlistRec.errcd%></b>]
			<%}%>				
			&nbsp;&nbsp; <font color="red"><%= curcommlistRec.errmsg%></font>
		</td>
	</tr>
	<tr>
		<td width="120" class="gray" align="center"><%= Util.Timestamp2Str(curcommlistRec.worktodt,"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp;</td>
		<td width="140" class="gray" align="left">&nbsp;<%= curcommlistRec.targtbl%></td>
		<td width="110" class="gray" align="right"><%= Util.comma(curcommlistRec.switnoit)%>&nbsp;</td>
	</tr>
    <%}%>
    <%-- 작업이력 목록 끝 --%>

    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
    <%for(int i=0; i<(migListCount-ds.curcommlist.size()); i++){%>
	<tr align="center">
		<td width="120" class="gray">&nbsp;</td>
		<td width="140" class="gray">&nbsp;</td>
		<td width="110" class="gray">&nbsp;</td>
		<td rowspan="2" class="gray">&nbsp;</td>
	</tr>
	<tr align="center">
		<td width="120" class="gray">&nbsp;</td>
		<td width="140" class="gray">&nbsp;</td>
		<td width="110" class="gray">&nbsp;</td>
	</tr>
    <%}%>
    <%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>

	<tr bgcolor="#dddddd" height="23">
		<td colspan="4" class="gray" align="right">
			<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건 </b>
		</td>
	</tr>    
</table>    
    
<!-- 페이지 이동 -->
<table width="830" border="0" cellspacing="0" cellpadding="0" class="title2" id="page_move_ptcr">
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
            <jsp:param name = "pagesize" 	value="<%= migListCount%>"/>
            <jsp:param name = "page_set_gubun" 	value="0"/>
        </jsp:include>
        <!--JSP PAGE END------------------------------------------------------------------------------------>
        </td>
    </tr>
</table>
<!-- 페이지 이동 -->

<script>
    parent.document.all.mig_ptcr_id.outerHTML = mig_ptcr_id.outerHTML;
    parent.document.all.page_move_ptcr.outerHTML = page_move_ptcr.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();    

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>    
</script>  