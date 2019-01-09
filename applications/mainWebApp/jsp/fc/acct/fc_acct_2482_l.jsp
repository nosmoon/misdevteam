<%@ page contentType="application/vnd.ms-excel; charset=EUC-KR" import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,   java.lang.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"%>
<%@ page buffer="none"%>
	
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : fc_acct_2482.jsp
* 기능 : 모금보고-약정명단-엑셀다운로드
* 작성일자 : 2017-01-05
* 작성자 : 봉은정
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-27
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	//TrustForm 대응.
	//content type이 text/html, text/xml이 아닌 경우 자동으로 download 전환이라고 하나 아래와 같이 이름 지정하지 않으면 제대로 동작하지 않음.
	response.setHeader("Content-Disposition","attachment; filename=list.xls");
	response.setHeader("Content-Description", "JSP Generated Data");
    FC_ACCT_2481_LDataSet ds = (FC_ACCT_2481_LDataSet)request.getAttribute("ds");
%>
<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=KSC5601" />
<style>
.text {mso-number-format: "@";}
.number {mso-number-format:"0"}
</style>
</head>
<body>
<table border="1">
<tr> 
<td> 예산코드 </td>
<td> 예산명 </td>
<td> 회계일자 </td>
<td> 전표번호 </td>
<td> 적요 </td>
<td> 차변금액 </td>
<td> 대변금액 </td>
<td> 관리구분 </td>
<td> 관리번호 </td>
<td> 거래처구분 </td>
<td> 거래처코드 </td>
<td> 거래처명 </td>
<td> 부거래처명 </td>
<td> 매체코드 </td>
<td> 상세매체코드 </td>
<td> 영수증구분 </td>
<td> 사용부서 </td>
<td> 행사코드 </td>
<td> 청구부서 </td>
<td> 대상계정 </td>
<td> 대상금액 </td>
<td> 소득구분 </td>
</tr>
<%
for(int j=0; j<ds.curlist.size(); j++){ 
 FC_ACCT_2481_LCURLISTRecord curlistRec = (FC_ACCT_2481_LCURLISTRecord)ds.curlist.get(j);
%>
<tr>
<td class="text"><%= curlistRec.budg_cd%></td>
<td><%= curlistRec.budg_cd_nm%></td>
<td><%= curlistRec.fisc_dt%></td>
<td><%= curlistRec.slip_occr_dt%>-<%= curlistRec.slip_clsf_cd%>-<%= curlistRec.slip_seq%>-<%= curlistRec.slip_sub_seq%>-<%= curlistRec.slip_arow_no%></td>
<td><%= curlistRec.rmks1%></td>
<td class="number"><%= curlistRec.dr_amt%></td>
<td class="number"><%= curlistRec.crdt_amt%></td>
<td><%= curlistRec.mang_clsf_cd_nm%></td>	
<td><%= curlistRec.mang_no%></td>
<td><%= curlistRec.dlco_clsf_cd_nm%></td>
<td><%= curlistRec.dlco_cd%></td>
<td><%= curlistRec.dlco_nm%></td>
<td><%= curlistRec.boks_dlco_nm%></td>
<td><%= curlistRec.medi_cd%> <%= curlistRec.medi_cd_nm%></td>
<td><%= curlistRec.dtls_medi_cd%> <%= curlistRec.dtls_medi_cdnm%></td>
<td><%= curlistRec.prop_equip_cd%></td>
<td><%= curlistRec.use_dept_cd%></td>
<td><%= curlistRec.evnt_cd%></td>
<td><%= curlistRec.clam_dept_cd_nm%></td>
<td><%= curlistRec.obj_acct_cd_nm%></td>
<td class="number"><%= curlistRec.obj_amt%></td>
<td><%= curlistRec.incm_clsf_cd_nm%></td>
</tr>
<%
}
%>
</table>
</body>
</html>