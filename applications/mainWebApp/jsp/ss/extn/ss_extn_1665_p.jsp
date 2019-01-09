<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
        response.reset();
        response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
        response.setHeader("Content-Disposition", "attachment; filename=CRMDATA.xls;");
        response.setHeader("Content-Transfer-Encoding", "binary;");
        response.setHeader("Pragma", "no-cache;");
        response.setHeader("Expires", "-1;");
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1665_p.jsp
* 기능 : 확장현황-사이버확장-수당-인쇄
* 작성일자 : 2004-09-14
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_PROMSTAF_CYEXPAYDataSet ds = (SS_L_PROMSTAF_CYEXPAYDataSet)request.getAttribute("ds");
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
 <tr>
  <td class=xl26 style='border-top:none;border-left:none'>확장일자</td>
  <td class=xl26 style='border-top:none;border-left:none'>확장번호</td>
  <td class=xl26 style='border-top:none;border-left:none'>요원구분코드</td>
  <td class=xl26 style='border-top:none;border-left:none'>요원구분코드명</td>
  <td class=xl26 style='border-top:none;border-left:none'>요원번호</td>
  <td class=xl26 style='border-top:none;border-left:none'>요원명</td>
  <td class=xl26 style='border-top:none;border-left:none'>주민등록번호</td>
  <td class=xl26 style='border-top:none;border-left:none'>우편번호</td>
  <td class=xl26 style='border-top:none;border-left:none'>주소</td>
  <td class=xl26 style='border-top:none;border-left:none'>상세주소</td>
  <td class=xl26 style='border-top:none;border-left:none'>전화번호</td>
  <td class=xl26 style='border-top:none;border-left:none'>휴대폰번호</td>
  <td class=xl26 style='border-top:none;border-left:none'>이메일</td>
  <td class=xl26 style='border-top:none;border-left:none'>계좌번호</td>
  <td class=xl26 style='border-top:none;border-left:none'>계좌은행</td>
  <td class=xl26 style='border-top:none;border-left:none'>계좌예금주</td>
  <td class=xl26 style='border-top:none;border-left:none'>권유요원번호</td>
  <td class=xl26 style='border-top:none;border-left:none'>권유요원명</td>
  <td class=xl26 style='border-top:none;border-left:none'>독자명</td>
  <td class=xl26 style='border-top:none;border-left:none'>매체코드</td>
  <td class=xl26 style='border-top:none;border-left:none'>매체명</td>
  <td class=xl26 style='border-top:none;border-left:none'>부수</td>
  <td class=xl26 style='border-top:none;border-left:none'>관계구분코드</td>
  <td class=xl26 style='border-top:none;border-left:none'>관계구분명</td>
  <td class=xl26 style='border-top:none;border-left:none'>주거형태코드</td>
  <td class=xl26 style='border-top:none;border-left:none'>주거형태명</td>
  <td class=xl26 style='border-top:none;border-left:none'>주거구분코드</td>
  <td class=xl26 style='border-top:none;border-left:none'>주거구분명</td>
  <td class=xl26 style='border-top:none;border-left:none'>배달희망일자</td>
  <td class=xl26 style='border-top:none;border-left:none'>부서코드</td>
  <td class=xl26 style='border-top:none;border-left:none'>부서명</td>
  <td class=xl26 style='border-top:none;border-left:none'>지역코드</td>
  <td class=xl26 style='border-top:none;border-left:none'>지역명</td>
  <td class=xl26 style='border-top:none;border-left:none'>지국지사코드</td>
  <td class=xl26 style='border-top:none;border-left:none'>지국명</td>
  <td class=xl26 style='border-top:none;border-left:none'>지국장확인여부</td>
  <td class=xl26 style='border-top:none;border-left:none'>지국장확인일자</td>
  <td class=xl26 style='border-top:none;border-left:none'>구독확인상태코드</td>
  <td class=xl26 style='border-top:none;border-left:none'>구독확인상태명</td>
  <td class=xl26 style='border-top:none;border-left:none'>사이버확장수당</td>
  <td class=xl26 style='border-top:none;border-left:none'>수당정산여부</td>
  <td class=xl26 style='border-top:none;border-left:none'>수당정산일자</td>
 </tr>
 
<%	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord)ds.curcommlist.get(i);%> 
 <tr>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.convertS(curcommlistRec.rdr_extndt)%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnno%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.stafclsfcd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.stafclsfnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.stafno%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.stafnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.FormatJumin(curcommlistRec.prn)%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.zip%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.addr%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.dtlsaddr%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.getChainStr(curcommlistRec.tel_no1, curcommlistRec.tel_no2, curcommlistRec.tel_no3, "-")%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.getChainStr(curcommlistRec.ptph_no1, curcommlistRec.ptph_no2, curcommlistRec.ptph_no3, "-")%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.email%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.acctno%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.acctbank%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.acctdeps_pers%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.cnvsstafno%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.cnvsstafnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdrnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.medicd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.medinm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.qty%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rshpclsfcd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rshpclsfnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.resiclsfcd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.resiclsfnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.resitypecd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.resitypenm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.convertS(curcommlistRec.dlvhopedt)%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.deptcd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.deptnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.areacd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.areanm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.corrbocd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.bonm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.bo_headcnfmyn%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.convertS(curcommlistRec.bo_headcnfmdt)%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.subscnfmstatcd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.subscnfmstatnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.comma(curcommlistRec.cyextnalon)%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.alonadjmyn%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.alonadjmdt%></td>
 </tr>
<%}%> 
</table>

</body>

</html>
