<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1797_l.jsp
* 기능 : 지국업무지원-Billing자동이체-신청/해지통계-엑셀전환
* 작성일자 : 2005-01-11
* 작성자 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-24
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%
	//TrustForm 대응.
	//content type이 text/html, text/xml이 아닌 경우 자동으로 download 전환이라고 하나 아래와 같이 이름 지정하지 않으면 제대로 동작하지 않음.
	response.setHeader("Content-Disposition","attachment; filename=SSBRSUP1797.xls");

	SS_L_SHFTEXPYRDRDataSet ds = (SS_L_SHFTEXPYRDRDataSet)request.getAttribute("ds");
%>
<!--list-->
  <table id="body_id" width="1230" border="0" cellpadding="1" cellspacing="0"  align="left" class="gray" bgcolor="#FFFFFF">
	<tr align="center" bgcolor="#dddddd" >
	  <td class="gray" width="58">지역명</td>
	  <td class="gray" width="58">지국명</td>
	  <td class="gray" width="67">독자명</td>
	  <td width="63" class="gray">매체명</td>
	  <td width="66" class="gray">납부자명</td>
	  <td width="96" class="gray">주민/사업자번호</td>
	  <td width="96" class="gray">계좌/카드번호</td>
	  <td width="84" class="gray">독자TEL</td>
	  <td width="84" class="gray">납부자TEL</td>
	  <td width="256" class="gray">주소</td>
	  <td width="65" class="gray">신청일자</td>
	  <td width="65" class="gray">해지일자</td>
	  <td width="60" class="gray">해지상태</td>
	  <td class="gray">이체구분</td>
	</tr>
<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFTEXPYRDRRSLTCURRecord rsltcurRec = (SS_L_SHFTEXPYRDRRSLTCURRecord)ds.rsltcur.get(i);%>
    <tr>
      <td class="gray"><%=rsltcurRec.areanm%></td>
      <td class="gray"><%=rsltcurRec.bonm%></td>
      <td class="gray"><%=rsltcurRec.rdrnm%></td>
      <td class="gray"><%=rsltcurRec.medinm%></td>
      <td class="gray"><%=rsltcurRec.pymtnm%></td>
      <td class="gray"><%=rsltcurRec.prn%></td>
      <td class="gray"><%=rsltcurRec.acctno%></td>
      <td class="gray"><%=rsltcurRec.rdrtel_no%></td>
      <td class="gray"><%=rsltcurRec.pymttel_no%></td>
      <td class="gray"><%=rsltcurRec.rdraddr%></td>
      <td class="gray"><%=rsltcurRec.aplcdt%></td>
      <td class="gray"><%=rsltcurRec.expydt%></td>
      <td class="gray"><%=rsltcurRec.expystat%></td>
      <td class="gray"><%=rsltcurRec.shftclsf%></td>
    </tr>
<%}%>
</table>
