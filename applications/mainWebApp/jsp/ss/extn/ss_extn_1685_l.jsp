<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1685_l.jsp
* 기능 : 확장현황-사이버확장-실적(지국별)-상세목록
* 작성일자 : 2004-04-08
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%

    SS_L_RDR_EXTN_BOCYB_RSLTDDataSet ds = (SS_L_RDR_EXTN_BOCYB_RSLTDDataSet)request.getAttribute("ds");
%>
<!-- 미확인 목록 제목 -->
<table width="340" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="rslt_nocnfm_row_id">
	<tr bgcolor="#dddddd" align="center">
		<td  class="gray" width="120"> 이름 </td>
		<td  class="gray" width="100"> 확장일자 </td>
		<td  class="gray" width="120"> 요원명 </td>
	</tr>
</table>

<!-- 오류 목록 제목 -->	
<table width="340" border="0" cellspacing="0" cellpadding="2" class="gray" bgcolor="#FFFFFF" id="rslt_err_row_id">
	<tr bgcolor="#dddddd" align="center">
		<td  class="gray" width="80"> 이름 </td>
		<td  class="gray" width="80"> 확장일자 </td>
		<td  class="gray" width="80"> 요원명 </td>
		<td  class="gray" width="100">구분</td>
	</tr>
</table>

<table id="rslt_nocnfm_id" width="340" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray" style="border-left-style:none; border-top-style:none;">
	<%
	for(int i=0; i<ds.nocnfmlist.size(); i++){
		SS_L_RDR_EXTN_BOCYB_RSLTDNOCNFMLISTRecord nocnfmlistRec = (SS_L_RDR_EXTN_BOCYB_RSLTDNOCNFMLISTRecord)ds.nocnfmlist.get(i);%>
	<tr align="center">
		<td  class="gray" width="120"><%= nocnfmlistRec.aplcpersnm%></td>
		<td  class="gray" width="100"><%= Util.convertS(nocnfmlistRec.rdr_extndt)%></td>
		<td  class="gray" width="120"><%= nocnfmlistRec.extnflnm%></td>
	</tr>
	<%}%>

	<tr bgcolor="#dddddd" align="right">
		<td colspan="3" class="gray"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">총건수
		  : <b><%= ds.getNocnfmtotalcnt()%> 건</b></td>
	</tr>
</table>

<table id="rslt_err_id" width="340" border="0" cellpadding="1" cellspacing="0"  bgcolor="#FFFFFF" class="gray" style="border-left-style:none; border-top-style:none;">
<%
	for(int i=0; i<ds.errlist.size(); i++){
		SS_L_RDR_EXTN_BOCYB_RSLTDERRLISTRecord errlistRec = (SS_L_RDR_EXTN_BOCYB_RSLTDERRLISTRecord)ds.errlist.get(i);%>
	<tr align="center">
		<td  class="gray" width="80"><%= errlistRec.aplcpersnm%>&nbsp;</td>
		<td  class="gray" width="80"><%= Util.convertS(errlistRec.rdr_extndt)%>&nbsp;</td>
		<td  class="gray" width="80"><%= errlistRec.extnflnm%>&nbsp;</td>
		<td  class="gray" width="100"><%= errlistRec.subscnfmstatnm%>&nbsp;</td>
	</tr>
	<%}%>

	<tr bgcolor="#dddddd" align="right">
		<td colspan="4" class="gray"><img src="/html/comm_img/ic_arr06.gif" width="7" height="7">총건수
		  : <b><%= ds.getErrtotalcnt()%> 건</b></td>
	</tr>
</table>

<script>
<%if(ds.nocnfmlist.size() == 0 || ds.errlist.size() == 0){%>
    alert("검색결과가 없습니다.");
<%}else{%>     
	// 미확인, 오류 상세 제목 설정	
    parent.document.all.rslt_nocnfm_row_id.outerHTML = rslt_nocnfm_row_id.outerHTML;
    parent.document.all.rslt_err_row_id.outerHTML = rslt_err_row_id.outerHTML;

	// 미확인, 오류 상세 목록 설정(iframe)
    parent.ifrm_1.document.all.rslt_nocnfm_id.outerHTML = document.all.rslt_nocnfm_id.outerHTML;
    parent.ifrm_2.document.all.rslt_err_id.outerHTML = document.all.rslt_err_id.outerHTML;
<%}%>
</script>
