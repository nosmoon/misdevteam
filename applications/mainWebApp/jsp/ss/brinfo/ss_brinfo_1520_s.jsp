<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1520_s.jsp
* 기능 : 지국Info-전세지원자금현황-상세
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
    SS_S_LEASAMTDataSet ds = (SS_S_LEASAMTDataSet)request.getAttribute("ds");
%>

<table width="830" border="0" cellspacing="0" align="center" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="detail_list">
<form name="aset_detail_form" method="post" action="">
	<input name="deptcd" type="hidden" value ="<%= ds.getDeptcd()%>" maxlength="5" >	<!--부서(팀)코드-->
	<input name="areacd" type="hidden" value ="<%= ds.getAreacd()%>" maxlength="5" >    <!--지역코드-->
	<input name="bocd" type="hidden" value ="<%= ds.getBocd()%>" maxlength="5" >        <!--지국지사코드-->
	<input name="seq" type="hidden" value ="<%= ds.getSeq()%>" maxlength="5">        	<!--순번-->

	<tr>
		<td  bgcolor="#dddddd" width="153" class="gray">팀&nbsp;</td>
		<td class="gray" width="250" ><%= ds.getDeptnm()%>&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >지역</td>
		<td class="gray" width="100" ><%= ds.getAreanm()%>&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >지국명</td>
		<td class="gray" width="120" ><%= ds.getBonm()%>&nbsp;</td>
	</tr>
	<tr>
		<td  bgcolor="#dddddd" width="153" class="gray">지국장</td>
		<td class="gray" width="250" ><%= ds.getPresinm()%>&nbsp;</td>
		<td class="gray" bgcolor="#dddddd" width="100" >현담당</td>
		<td class="gray" colspan="3" ><%= ds.getNowchrg()%>&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">채권확보서류</td>
		<td class="gray" width="250">
			등기필증
			<input type="checkbox" name="bondregiconf" value="<%= ds.getBondregiconf()%>" <%= ("Y".equals(ds.getBondregiconf().toUpperCase()))? "checked" : "" %> >
			등기부등본
			<input type="checkbox" name="bondregi" value="<%= ds.getBondregi()%>" <%= ("Y".equals(ds.getBondregi().toUpperCase()))? "checked" : "" %> >
			보증서
			<input type="checkbox" name="bondwarrp" value="<%= ds.getBondwarrp()%>" <%= ("Y".equals(ds.getBondwarrp().toUpperCase()))? "checked" : "" %> >
		</td>
		<td class="gray" bgcolor="#dddddd" width="100">전세서류</td>
		<td class="gray" colspan="3">
			계약서
			<input type="checkbox" name="leascntrp" value="<%= ds.getLeascntrp()%>" <%= ("Y".equals(ds.getLeascntrp().toUpperCase()))? "checked" : "" %> >
			등기부등본
			<input type="checkbox" name="leasregi" value="<%= ds.getLeasregi()%>" <%= ("Y".equals(ds.getLeasregi().toUpperCase()))? "checked" : "" %> >
			각서
			<input type="checkbox" name="leasexch_note" value="<%= ds.getLeasexch_note()%>" <%= ("Y".equals(ds.getLeasexch_note().toUpperCase()))? "checked" : "" %> >
			차용증서
			<input type="checkbox" name="leasloandeed" value="<%= ds.getLeasloandeed()%>" <%= ("Y".equals(ds.getLeasloandeed().toUpperCase()))? "checked" : "" %> >
		</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">국결재서류</td>
		<td class="gray" width="250">
			전임
			<input type="checkbox" name="prvoffideciddocuyn" value="<%= ds.getPrvoffideciddocuyn()%>"<%= ("Y".equals(ds.getPrvoffideciddocuyn().toUpperCase()))? "checked" : "" %> >
			현임
			<input type="checkbox" name="curroffideciddocuyn" value="<%= ds.getCurroffideciddocuyn()%>" <%= ("Y".equals(ds.getCurroffideciddocuyn().toUpperCase()))? "checked" : "" %> >
		</td>
		<td class="gray" bgcolor="#dddddd" width="100">본결재서류</td>
		<td class="gray" colspan="3">
			전임
			<input type="checkbox" name="prvhdqtdeciddocuyn" value="<%= ds.getPrvhdqtdeciddocuyn()%>" <%= ("Y".equals(ds.getPrvhdqtdeciddocuyn().toUpperCase()))? "checked" : "" %> >
			현임
			<input type="checkbox" name="currhdqtdeciddocuyn" value="<%= ds.getCurrhdqtdeciddocuyn()%>" <%= ("Y".equals(ds.getCurrhdqtdeciddocuyn().toUpperCase()))? "checked" : "" %> >
		</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">지국사무실 부동산표시</td>
		<td class="gray" colspan="5"><%= ds.getBooffi_roomrlesindc()%>&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">채권확보물권 부동산표시 </td>
		<td class="gray" colspan="5"><%= ds.getBondprsvobjvolrlesindc()%>&nbsp;</td>
	</tr>
	<tr>
		<td bgcolor="#dddddd" width="153" class="gray">비고</td>
		<td class="gray" colspan="5">
		<textarea name="remk" rows="3" cols="90" ><%= ds.getRemk()%></textarea>
		</td>
	</tr>
	</form>
</table>

<script>
    parent.document.all.detail_list.outerHTML = detail_list.outerHTML;
</script>
