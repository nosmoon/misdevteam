<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : sss_extn_1610_s.jsp
* 기능 : 확장현황-사이버확장-요원관리-상세
* 작성일자 : 2004-04-10
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_PROMSTAF_CYEXTNDataSet ds = (SS_S_PROMSTAF_CYEXTNDataSet)request.getAttribute("ds");
%>
	<table width="830" border="0"  cellpadding="2" cellspacing="0" class="gray" bgcolor="#FFFFFF" id="promstaf_detail_id">
		<tr>
			<td width="80" rowspan="4" bgcolor="#EBE9DC" class="gray">요원정보</td>
			<td width="100" bgcolor="#dddddd" class="gray">성명</td>
			<td width="120" class="gray"><%= ds.getStafnm()%>&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">등록일자</td>
			<td width="120" class="gray"><%= Util.convertS(ds.getIn_cmpydt())%>&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">주민등록번호</td>
			<td class="gray"><%= Util.FormatJumin(ds.getPrn())%>&nbsp;</td>			
		</tr>
        <tr>
			<td width="100" bgcolor="#dddddd" class="gray">전화번호</td>
			<td width="120" class="gray"><%=Util.getChainStr( ds.getTel_no1(), ds.getTel_no2(), ds.getTel_no3(), "-")%>&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">휴대폰번호</td>
			<td width="120" class="gray"><%=Util.getChainStr( ds.getPtph_no1(), ds.getPtph_no2(), ds.getPtph_no3(), "-")%>&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">이메일<font color="red">&nbsp;</font></td>
			<td class="gray"><%= ds.getEmail()%>&nbsp;</td>
        </tr>
        <tr>
			<td width="100" bgcolor="#dddddd" class="gray">주소</td>
			<td colspan="5" class="gray">[<%= Util.FormatZip(ds.getZip())%>]&nbsp;<%= ds.getAddr()%>&nbsp;<%= ds.getDtlsaddr()%></td>
        </tr>
        <tr >
			<td width="100" bgcolor="#dddddd"  class="gray">은행명</td>
			<td width="120" class="gray"><%= ds.getAcctbank()%>&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">예금주</td>
			<td width="120" class="gray"><%= ds.getAcctdeps_pers()%>&nbsp;</td>
			<td width="100" bgcolor="#dddddd"  class="gray">계좌번호</td>
			<td class="gray"><%= ds.getAcctno()%>&nbsp;</td>
        </tr>
		<tr>
			<td width="80" rowspan="2" bgcolor="#EBE9DC" class="gray">권유자정보</td>
			<td width="100" bgcolor="#dddddd" class="gray">성명</td>
			<td width="120" class="gray"><%= ds.getCnvsstafnm()%>&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">등록일자</td>
			<td width="120" class="gray"><%= Util.convertS(ds.getCnvsin_cmpydt())%>&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">주민등록번호</td>
			<td class="gray"><%= Util.FormatJumin(ds.getCnvsprn())%>&nbsp;</td>			
		</tr>
        <tr>
			<td width="100" bgcolor="#dddddd" class="gray">전화번호</td>
			<td width="120" class="gray"><%=Util.getChainStr( ds.getCnvstelno1(), ds.getCnvstelno2(), ds.getCnvstelno3(), "-")%>&nbsp;</td>
			<td width="120" bgcolor="#dddddd" class="gray">휴대폰번호</td>
			<td width="120" class="gray"><%=Util.getChainStr( ds.getCnvsptph_no1(), ds.getCnvsptph_no2(), ds.getCnvsptph_no3(), "-")%>&nbsp;</td>
			<td width="100" bgcolor="#dddddd" class="gray">이메일<font color="red">&nbsp;</font></td>
			<td class="gray"><%= ds.getCnvsemail()%>&nbsp;</td>
        </tr>
	</table>


<script language="javascript">
    parent.document.all.promstaf_detail_id.outerHTML = promstaf_detail_id.outerHTML;

	// 입력항목 처리
	parent.jsInit();
</script>