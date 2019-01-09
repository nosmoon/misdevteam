<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
        String closyymm = (String)request.getParameter("closyymm");

        response.reset();
        response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
        response.setHeader("Content-Disposition", "attachment; filename=CRMDATA.xls");
        response.setHeader("Content-Transfer-Encoding", "binary;");
        response.setHeader("Pragma", "no-cache;");
        response.setHeader("Expires", "-1;");
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2430_p.jsp
* 기능 :
* 작성일자 : 2007-05-16
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_P_VACT_STATDataSet ds = (SS_P_VACT_STATDataSet)request.getAttribute("ds");
%>
<html>

<head>
<style>
table
	{mso-displayed-decimal-separator:"\.";
	mso-displayed-thousand-separator:"\,";}
@page
	{margin:1.0in .75in 1.0in .75in;
	mso-header-margin:.5in;
	mso-footer-margin:.5in;}
tr
	{mso-height-source:auto;
	mso-ruby-visibility:none;}
col
	{mso-width-source:auto;
	mso-ruby-visibility:none;}
br
	{mso-data-placement:same-cell;}
.style0
	{mso-number-format:General;
	text-align:general;
	vertical-align:bottom;
	white-space:nowrap;
	mso-rotate:0;
	mso-background-source:auto;
	mso-pattern:auto;
	color:windowtext;
	font-size:11.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:굴림체;
	mso-generic-font-family:auto;
	mso-font-charset:129;
	border:none;
	mso-protection:locked visible;
	mso-style-name:표준;
	mso-style-id:0;}
td
	{mso-style-parent:style0;
	padding-top:1px;
	padding-right:1px;
	padding-left:1px;
	mso-ignore:padding;
	color:windowtext;
	font-size:9.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:굴림체;
	mso-generic-font-family:auto;
	mso-font-charset:129;
	mso-number-format:General;
	text-align:general;
	vertical-align:bottom;
	border:.5pt solid windowtext;
	mso-background-source:auto;
	mso-pattern:auto;
	mso-protection:locked visible;
	white-space:nowrap;
	mso-rotate:0;}
.xl24
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl25
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	border:.5pt solid windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl26
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl27
	{mso-style-parent:style0;
	font-size:16.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:center;
	vertical-align:middle;}
.xl28
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:left;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl29
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:left;
	border:.5pt solid windowtext;}
.xl30
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:left;
	border:.5pt solid windowtext;}
.xl31
	{mso-style-parent:style0;
	text-align:left;
	mso-number-format:"\@";
	border:.5pt solid windowtext;}
ruby
	{ruby-align:left;}
rt
	{color:windowtext;
	font-size:8.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-char-type:none;
	display:none;}
</style>
</head>

<body link=blue vlink=purple>
<table x:str border=0 cellpadding=0 cellspacing=0 width=1440 style='border-collapse:collapse;table-layout:fixed;width:1388pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:100pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:100pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:3000;width:200pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:100pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:60pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:100pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:100pt'>
 <tr height=18 style='height:13.5pt'>
		<td class=xl24 style='border-left:none'>일자</td>
		<td class=xl24 style='border-left:none'>센터코드</td>
        <td class=xl24 style='border-left:none'>센터명</td>
		<td class=xl24 style='border-left:none'>은행코드</td>
        <td class="xl24" style='border-left:none'>은행명</td>
		<td class=xl24 style='border-left:none'>수량</td>
		<td class=xl24 style='border-left:none'>수납금액</td>		
 </tr>
<%
for(int i=0; i<ds.curprintlist.size(); i++){
	SS_P_VACT_STATCURPRINTLISTRecord curprintlistRec = (SS_P_VACT_STATCURPRINTLISTRecord)ds.curprintlist.get(i);
%>
 <tr style='height:13.5pt'>
   <td class=xl26 style='border-top:none;border-left:none' height='18'><%= curprintlistRec.subsmappli%></td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curprintlistRec.bocd%></td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curprintlistRec.bonm%></td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curprintlistRec.bank_cd%></td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curprintlistRec.bank_nm%></td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curprintlistRec.totcnt%></td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curprintlistRec.totamt%></td>
 </tr>
<%}%>
</table>
</body>
</html>
