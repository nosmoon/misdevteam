<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_share_1020_s.jsp
* 기능 : 정보공유 일정 상세정보 보기
* 작성일자 : 2003-10-27
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    CO_S_SCHEDataSet ds = (CO_S_SCHEDataSet)request.getAttribute("ds");  // request dataset

    // 세션으로부터 등록자정보를 얻는다.
	String selldeptnm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "selldeptnm", true)); //판매부서명
	String emp_nm = Util.Uni2Ksc(Util.getSessionParameterValue(request, "emp_nm", true)); //성명

%>
<table width="830" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="sche_detail_id">
<form name="sche_detail_form" method="post" action="">
	<input type="hidden" name="seq" value="<%= ds.getSeq()%>">
	<input type="hidden" name="accflag" value="U"> 		<!--작업구분(I:등록, U:수정, D:삭제)-->

	<tr>
		<td width="100" height="24" bgcolor="#dddddd" class="gray">팀&nbsp; <font color="red">*</font></td>
		<td  class="gray" width="315">&nbsp;<%= ds.getDeptnm()%></td>
		<td width="100" height="24" bgcolor="#dddddd" class="gray">등록자 <font color="red">*</font></td>
		<td  class="gray" width="315">&nbsp;<%= emp_nm%></td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="100">일정항목 <font color="red">*</font><br></td>
		<td class="gray">
			<select name="schemangitemcd" class="sel_all">
				<option value="">선택</option>
				<%=ds.curcommlist3OptHtml(ds.getSchemangitemcd())%>
			</select>
		</td>
		<td bgcolor="#dddddd" class="gray" width="100"> 일정구분 <font color="red">*</font></td>
		<td class="gray" width="315">
			<select name="schemangunitcd" class="sel_all">
				<option value="">선택</option>
				<%=ds.curcommlist2OptHtml(ds.getSchemangunitcd())%>
			</select>
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="100">시작일자 <font color="red">*</font><br>
		</td>
		<td class="gray" width="315">
			<input name="frdt" type="text" value="<%= ds.getFrdt()%>" maxlength="10" size="10" class="text_box" dataType=date> 예) 20040101
		</td>
		<td width="100" bgcolor="#dddddd" class="gray">종료일자 <font color="red">*</font></td>
		<td  class="gray" width="315">
			<input name="todt" type="text" value="<%= ds.getTodt()%>" maxlength="10" size="10" class="text_box" dataType=date> 예) 20040201
		</td>
	</tr>
	<tr>
		<td height="26" bgcolor="#dddddd" class="gray" width="100">설명 </td>
		<td colspan="3" class="gray">
			<input name="remk" type="text" style="ime-mode:active;" value="<%= ds.getRemk()%>" maxlength="100" size="100" class="text_box">
		</td>
	</tr>
</form>
</table>

<script>
<!--
    parent.document.all.sche_detail_id.outerHTML = sche_detail_id.outerHTML;
    parent.jsInit();
-->
</script>
