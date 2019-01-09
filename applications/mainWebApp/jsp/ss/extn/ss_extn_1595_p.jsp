<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
        //String yymm = (String)request.getParameter("yymm");
        String yymm = (String)Util.getYyyyMm();
        response.reset();
        response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
        response.setHeader("Content-Disposition", "attachment; filename=CRMDATA_"+yymm+".xls;");
        response.setHeader("Content-Transfer-Encoding", "binary;");
        response.setHeader("Pragma", "no-cache;");
        response.setHeader("Expires", "-1;");
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1595_p.jsp
* 기능 : 확장현황-조선IS확장-지국별 프린트
* 작성일자 : 2014-3-18
* 작성자 : 
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_EXTN_ISSTAF_PRINTDataSet ds = (SS_L_RDR_EXTN_ISSTAF_PRINTDataSet)request.getAttribute("ds");
%>
<html>
<head>
</head>
<body>
<table>
 <tr>
  <td colspan=21 height=27><%= Util.convertMonth(ds.getFrdt(),"년")%>월 독자 확장 용역비 청구</td>
 </tr>
 <tr height=18>
  <td>부서명</td>
  <td>부서코드</td>
  <td>파트</td>
  <td>파트코드</td>
  <td>지역</td>
  <td>지역코드</td>
  <td>센터</td>
  <td>센터코드</td>
  
  <td>요원번호</td>
  <td>요원명</td>
  <td>주민번호</td>

  <td>아파트(-3)</td>
  <td>아파트(4-6)</td>
  <td>아파트(7-9)</td>
  <td>아파트(10-11)</td>
  <td>아파트(12-)</td>
  <td>주택(-3)</td>
  <td>주택(4-6)</td>
  <td>주택(7-9)</td>
  <td>주택(10-11)</td>
  <td>주택(12-)</td>
  <td>상가(-3)</td>
  <td>상가(4-6)</td>
  <td>상가(7-9)</td>
  <td>상가(10-11)</td>
  <td>상가(12-)</td>
  
  <td>인정부수</td>
  <td>전체부수</td>
 </tr>


<%--목록 시작--%>
<%for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_ISSTAF_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_ISSTAF_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
<tr>
	<td><%= curcommlistRec.deptnm%></td>
	<td><%= curcommlistRec.deptcd%></td>
	<td><%= curcommlistRec.partnm%></td>
	<td><%= curcommlistRec.partcd%></td>
	<td><%= curcommlistRec.areanm%></td>
	<td><%= curcommlistRec.areacd%></td>
	<td><%= curcommlistRec.bonm%></td>
	<td><%= curcommlistRec.bocd%></td>
	<td><%= curcommlistRec.stafno%></td>
	<td><%= curcommlistRec.stafnm%></td>
	<td><%= Util.FormatJumin(curcommlistRec.prn)%></td>
	<td><%= Util.comma(curcommlistRec.a1)%></td>
	<td><%= Util.comma(curcommlistRec.a2)%></td>
	<td><%= Util.comma(curcommlistRec.a3)%></td>
	<td><%= Util.comma(curcommlistRec.a5)%></td>
	<td><%= Util.comma(curcommlistRec.a4)%></td>
	<td><%= Util.comma(curcommlistRec.h1)%></td>
	<td><%= Util.comma(curcommlistRec.h2)%></td>
	<td><%= Util.comma(curcommlistRec.h3)%></td>
	<td><%= Util.comma(curcommlistRec.h5)%></td>	
	<td><%= Util.comma(curcommlistRec.h4)%></td>
	<td><%= Util.comma(curcommlistRec.s1)%></td>
	<td><%= Util.comma(curcommlistRec.s2)%></td>
	<td><%= Util.comma(curcommlistRec.s3)%></td>
	<td><%= Util.comma(curcommlistRec.s5)%></td>
	<td><%= Util.comma(curcommlistRec.s4)%></td>
	<td><%= Util.comma(curcommlistRec.corr_qty)%></td>
	<td><%= Util.comma(curcommlistRec.tot_qty)%></td>
</tr>
<%}%>

</table>
</body>
</html>
