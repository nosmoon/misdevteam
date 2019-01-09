<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
        //String yymm = (String)request.getParameter("yymm");
        String yymm = (String)Util.getYyyyMm();
        response.reset();
        response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
        response.setHeader("Content-Disposition", "attachment; filename=CRMDATA.xls;");
        response.setHeader("Content-Transfer-Encoding", "binary;");
        response.setHeader("Pragma", "no-cache;");
        response.setHeader("Expires", "-1;");
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_3030_p.jsp
* 기능 : 중지방어관리-엑셀
* 작성일자 : 2015-03-03
* 작성자 : 
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_P_SUSP_DEFDataSet ds = (SS_P_SUSP_DEFDataSet)request.getAttribute("ds");
%>
<html>
<head>
<style>
<!--

.xl26
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;}

-->
</style>
</head>

<body>
<table>
 <tr height=18>
  <td class=xl26 style='border-top:none;border-left:none'>팀</td>
  <td class=xl26 style='border-top:none;border-left:none'>팀코드</td>
  <td class=xl26 style='border-top:none;border-left:none'>파트</td>
  <td class=xl26 style='border-top:none;border-left:none'>파트코드</td>
  <td class=xl26 style='border-top:none;border-left:none'>지역</td>
  <td class=xl26 style='border-top:none;border-left:none'>지역코드</td>
  <td class=xl26 style='border-top:none;border-left:none'>센터</td>
  <td class=xl26 style='border-top:none;border-left:none'>센터코드</td>      
  <td class=xl26 style='border-top:none;border-left:none'>중지방어유형</td>
  <td class=xl26 style='border-top:none;border-left:none'>신청일자</td>
  <td class=xl26 style='border-top:none;border-left:none'>독자번호</td>
  <td class=xl26 style='border-top:none;border-left:none'>독자명</td>
  <td class=xl26 style='border-top:none;border-left:none'>매체명</td>
  <td class=xl26 style='border-top:none;border-left:none'>부수</td>
  <td class=xl26 style='border-top:none;border-left:none'>유가월</td>
  <td class=xl26 style='border-top:none;border-left:none'>확장일자</td>
  <td class=xl26 style='border-top:none;border-left:none'>구독시작일</td>
  <td class=xl26 style='border-top:none;border-left:none'>신청경로</td>
  <td class=xl26 style='border-top:none;border-left:none'>멤버스아이디</td>
  <td class=xl26 style='border-top:none;border-left:none'>상담원명</td>
  <td class=xl26 style='border-top:none;border-left:none'>상담원처리상태</td>
  <td class=xl26 style='border-top:none;border-left:none'>상담원처리일자</td>
  <td class=xl26 style='border-top:none;border-left:none'>센터처리상태</td>
  <td class=xl26 style='border-top:none;border-left:none'>센터처리일자</td>
  <td class=xl26 style='border-top:none;border-left:none'>비고</td>
  <td class=xl26 style='border-top:none;border-left:none'>판촉물</td>
  <td class=xl26 style='border-top:none;border-left:none'>서비스개월수</td>
  <td class=xl26 style='border-top:none;border-left:none'>상품권</td>
  <td class=xl26 style='border-top:none;border-left:none'>세트지</td>
 </tr>


<%--목록 시작--%>
<%for(int i=0; i<ds.suspdefcur.size(); i++){
	SS_P_SUSP_DEFSUSPDEFCURRecord suspdefcurRec = (SS_P_SUSP_DEFSUSPDEFCURRecord)ds.suspdefcur.get(i);%>
<tr>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.deptnm%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.deptcd%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.partnm%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.partcd%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.areanm%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.areacd%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.bonm%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.bocd%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.def_type%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.aplcdt%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.rdr_no%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.rdrnm%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.medinm%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.subsqty%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.valmm%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.rdr_extndt%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.subsfr_dt%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.aplcpathnm%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.onlmembid%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.agentnm%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.cns_stat%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.cns_cnfmdt%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.bo_stat%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.bo_cnfmdt%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.remk%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.svccd%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.svcmm%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.giftcard%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.set_medicd%></td>	
</tr>
<%}%>

</table>
</body>
</html>
