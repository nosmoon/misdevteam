<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1175_l.jsp
* 기능 : 관리자-작업-마이그레이션 현황-목록
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
    SS_L_MIGRWORKINFODataSet ds = (SS_L_MIGRWORKINFODataSet)request.getAttribute("ds");
    int listCount = 10;		// 화면 당 항목수
%>
    <table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" id="mig_list_id">
	<form name="mig_list_form" method="post" action="" >
		<input name="bocdary" type="hidden" value ="">                	<!-- 지국코드 집합문자열-->
        <input name="checkedary" type="hidden" value ="">				<!-- 선택여부 집합문자열-->

		<tr bgcolor="#dddddd" align="center">
			<td width="90" rowspan="2" height="23" class="gray" align="center"> 팀&nbsp; </td>
			<td width="90" rowspan="2" height="23" class="gray" align="center"> 지역 </td>
			<td width="100" rowspan="2" height="23" class="gray" align="center"> 지국 </td>
			<td width="240" colspan="2" height="23" class="gray" align="center"> DB업로드 </td>
			<td width="240" colspan="2" height="23" class="gray" align="center"> DB전환 </td>
			<td rowspan="2" height="23" class="gray" align="center"> 완료 </td>
		</tr>
		<tr bgcolor="#dddddd" align="center">
			<td width="120" height="23" class="gray" align="center"> 시작일자 </td>
			<td width="120" height="23" class="gray" align="center"> 종료일자 </td>
			<td width="120" height="23" class="gray" align="center"> 시작일자 </td>
			<td width="120" height="23" class="gray" align="center"> 종료일자 </td>
		</tr>
<%-- 마이그레이션 현황 목록 시작--%>
<%for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_MIGRWORKINFOCURCOMMLISTRecord curcommlistRec = (SS_L_MIGRWORKINFOCURCOMMLISTRecord)ds.curcommlist.get(i);%>
    <!-- 이사독자비용 상세 링크 -->
		<tr bgcolor="#FFFFFF">
			<td width="90" class="gray" align="left"> <%= curcommlistRec.deptnm%>&nbsp; </td>
			<td width="90" class="gray" align="left"> <%= curcommlistRec.areanm%>&nbsp; </td>
			<td width="100" class="gray" align="left"> <%= curcommlistRec.bonm%>&nbsp; </td>
			<td width="120" class="gray" align="center"> <%= Util.Timestamp2Str(curcommlistRec.billdbuptodt,"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
			<td width="120" class="gray" align="center"> <%= Util.Timestamp2Str(curcommlistRec.bodbuptodt,"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
			<td width="120" class="gray" align="center"> <%= Util.Timestamp2Str(curcommlistRec.billswittodt,"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
			<td width="120" class="gray" align="center"> <%= Util.Timestamp2Str(curcommlistRec.boswittodt,"yyyy/MM/dd' 'HH:mm:ss")%>&nbsp; </td>
			<td class="gray" align="center">
				<input type="checkbox" name="endcnfmyn" <%= Util.convertYn(curcommlistRec.endcnfmyn, "checked disabled ", "")%> >&nbsp;
			</td>
			<input name="bocd" type="hidden" value ="<%= curcommlistRec.bocd%>"> 	<!-- 지국코드 -->
		</tr>
<%}%>
<%-- 마이그레이션 현황 목록 끝--%>
<%if(ds.curcommlist.size() == 0){%>
	<%for(int i=0; i<listCount; i++){%>
		<tr align="center">
			<td width="90" class="gray" align="center">&nbsp; </td>
			<td width="90" class="gray" align="center">&nbsp; </td>
			<td width="100" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td width="120" class="gray" align="center">&nbsp; </td>
			<td class="gray" align="center"><input type="checkbox" name="checkbox">&nbsp;</td>
		</tr>
	<%}%>
<%}%>
		<tr bgcolor="#dddddd" height="23">
			<td colspan="8" class="gray" align="right">
				<img src="/html/comm_img/ic_arr06.gif" width="7" height="7"> <b> 총건수 <%= Util.comma(ds.getTotalcnt())%> 건</b>
			</td>
		</tr>
    </form>
    </table>
<script>
    parent.document.all.mig_list_id.outerHTML = mig_list_id.outerHTML;

<%if(ds.curcommlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}%>
</script>

