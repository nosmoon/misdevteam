<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1105_l.jsp
* 기능 : 관리자-작업-마이그레이션 목록
* 작성일자 : 2004-03-12
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%--
지국지사코드, 지국지사명은 request로 부터 얻는다.
--%>
<%
	SS_S_MIGRWORKINFODataSet ds = (SS_S_MIGRWORKINFODataSet)request.getAttribute("ds");
	String bocd = request.getParameter("bocd");
	String bonm = Util.Uni2Ksc(request.getParameter("bonm"));
%>
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="mig_list_id">
<form name="mig_list_form" method="post" action="" >
	<input name="bocd" type="hidden" value ="<%= bocd%>">                    	<!-- 지국코드 -->
	<input name="bonm" type="hidden" value ="<%= bonm%>">                    	<!-- 지국명 -->
	<input name="accflag" type="hidden" value ="">                    			<!--accflag 설정('BU':지국 DB 업로드, 'LU':빌링 DB 업로드, 'BC':지국 DB 전환, 'LC':빌링 DB 전환)-->

	<tr bgcolor="#dddddd" align="center" height="23">
		<td class="gray" align="center"> 구분 </td>
		<td width="165" class="gray" align="center"> 시작일시 </td>
		<td width="165" class="gray" align="center"> 종료일시 </td>
		<td width="150" class="gray" align="center"> 작업상태 </td>
		<td width="200" class="gray" align="center"> 처리 </td>
	</tr>
	<tr height="23">
		<td class="gray" align="left"> &nbsp;지국DB업로드 </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBodbupfrdt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBodbuptodt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="150" class="gray" align="center"> <%= ds.getBodbupstat()%>&nbsp; </td>
		<td width="200" class="gray" align="left">&nbsp;&nbsp;
			<input type="image" src="/html/comm_img/bu_bodbup.gif" width="96" height="19" align="absmiddle" onclick="javascript:bo_db_upload();window.event.returnValue=false;" border="0">
<%--지국DB업로드 오류시 에러확인 버튼을 보여준다--%>
<%if("3".equals(ds.getBodbupstatcd())){%>
			&nbsp;<input type="image" src="/html/comm_img/bu_ok.gif" width="36" height="19" align="absmiddle" onclick="javascript:showError();window.event.returnValue=false;" border="0">
<%}%>
		</td>
	</tr>
<%--	
	<tr height="23">
		<td class="gray" align="left"> &nbsp;빌링DB업로드 </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBilldbupfrdt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBilldbuptodt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="150" class="gray" align="center"> <%= ds.getBilldbupstat()%>&nbsp; </td>
		<td width="200" class="gray" align="left">&nbsp;&nbsp;
			<input type="image" src="/html/comm_img/bu_billdbup.gif" width="96" height="19" align="absmiddle" onclick="javascript:bill_db_upload();window.event.returnValue=false;" border="0">
		</td>
	</tr>
--%>	
	<tr height="23">
		<td class="gray" align="left"> &nbsp;지국DB전환 </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBoswitfrdt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBoswittodt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="150" class="gray" align="center"> <%= ds.getBoswitstat()%>&nbsp; </td>
		<td width="200" class="gray" align="left">&nbsp;&nbsp;
			<input type="image" src="/html/comm_img/bu_bodbch.gif" width="84" height="19" align="absmiddle" onclick="javascript:bo_db_convert();window.event.returnValue=false;" border="0">
		</td>
	</tr>
<%--	
	<tr height="23">
		<td class="gray" align="left"> &nbsp;빌링DB전환 </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBillswitfrdt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="165" class="gray" align="center"> <%= Util.Timestamp2Str(ds.getBillswittodt(),"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
		<td width="150" class="gray" align="center"> <%= ds.getBillswitstat()%>&nbsp; </td>
		<td width="200" class="gray" align="left">&nbsp;&nbsp;
			<input type="image" src="/html/comm_img/bu_billdbch.gif" width="84" height="19" align="absmiddle" onclick="javascript:bill_db_convert();window.event.returnValue=false;" border="0">
		</td>
	</tr>
--%>	
</form>
</table>
<script>
    parent.document.all.mig_list_id.outerHTML = mig_list_id.outerHTML;

    // 이벤트 핸들러 호출
    parent.jsInit();
    
<%if("".equals(ds.bocd)){%>
    alert("검색결과가 없습니다.");
<%}%>    
</script>
