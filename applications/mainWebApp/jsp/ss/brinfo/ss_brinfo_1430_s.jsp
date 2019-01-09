<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1430_s.jsp
* 기능 : 지국Info-지국비품현황-상세 상세화면
* 작성일자 : 2004-02-01
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_ASET_DTLDataSet ds = (SS_S_ASET_DTLDataSet)request.getAttribute("ds");
	//구입금액, 본사지원금액을 integer로 변경한다.
	
	int buyamt = 0;
	int hdqtsplyamt = 0;
	
	if( ds.getBuyamt() != null){
		buyamt = Integer.parseInt(ds.getBuyamt());
	}
	
	if( ds.getHdqtsplyamt() != null){
		hdqtsplyamt = Integer.parseInt(ds.getHdqtsplyamt());
	}
%>
	<table width="100%" border="0" cellspacing="0" cellpadding="1" class="gray" bgcolor="#FFFFFF" id="aset_detail_id">
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;번호 </td>
			<td class="gray"> &nbsp;<%= ds.getAsetseq()%> </td>
		</tr>
		<tr height="23"> 
			<td  bgcolor="#dddddd" width="100" class="gray"> &nbsp;비품분류 </td>
			<td class="gray"> &nbsp;<%= ds.getAsetclascdnm()%></td>
		</tr>
		<tr height="23"> 
			<td  bgcolor="#dddddd" width="100" class="gray"> &nbsp;비품명 </td>
			<td class="gray"> &nbsp;<%= ds.getAsetnm()%> </td>
		</tr>
		<tr height="23"> 
			<td  bgcolor="#dddddd" width="100" class="gray"> &nbsp;사양 </td>
			<td class="gray"> &nbsp;<%= ds.getSpec()%></td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;제조원 </td>
			<td class="gray"> &nbsp;<%= ds.getMnftcmpy()%> </td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;구입처 </td>
			<td class="gray"> &nbsp;<%= ds.getBuyplac()%> </td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;구입일자 </td>
			<td class="gray"> &nbsp;<%= Util.convertS(ds.getBuydt())%></td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;구입금액 </td>
			<td class="gray"> &nbsp;<%= Util.comma(buyamt)%></td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;본사지원금 </td>
			<td class="gray"> &nbsp;<%= Util.comma(hdqtsplyamt)%> </td>
		</tr>
		<tr> 
			<td bgcolor="#dddddd" width="100" class="gray" he> &nbsp;유지보수내용 </td>
			<td class="gray"> 
				<textarea cols="27" rows="6" class="scroll1" readOnly><%= ds.getMantcont()%> &nbsp;</textarea>
			</td>
		</tr>
		<tr height="23"> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;폐기일자 </td>
			<td class="gray"> &nbsp;<%= Util.convertS(ds.getWstedt())%> </td>
		</tr>
		<tr> 
			<td bgcolor="#dddddd" width="100" class="gray"> &nbsp;비고 </td>
			<td class="gray">
				<textarea cols="27" rows="5" class="scroll1" readOnly><%= ds.getRemk()%> &nbsp;</textarea>
			</td>
		</tr>
	</table>        

<script>
    parent.document.all.aset_detail_id.outerHTML = aset_detail_id.outerHTML;
</script>
