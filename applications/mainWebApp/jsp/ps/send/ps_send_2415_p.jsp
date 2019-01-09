<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<%
        String closyymm = (String)request.getParameter("closyymm");

        response.reset();
        response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
        response.setHeader("Content-Disposition", "attachment; filename=WEEKSND_CLOS_" + closyymm + ".xls");
        response.setHeader("Content-Transfer-Encoding", "binary;");
        response.setHeader("Pragma", "no-cache;");
        response.setHeader("Expires", "-1;");
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_2415_p.jsp
* 기능 :
* 작성일자 : 2007-11-01
* 작성자 : 김재일
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	PS_L_WEEKSND_CLOS_PRINTDataSet ds = (PS_L_WEEKSND_CLOS_PRINTDataSet)request.getAttribute("ds");
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
 <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:100pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:100pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:100pt'>
 <tr height=18 style='height:13.5pt'>
		<td class=xl24 style='border-left:none'>은행명</td>
		<td class=xl24 style='border-left:none'>은행코드</td>
        <td class=xl24 style='border-left:none'>계좌번호</td>
		<td class=xl24 style='border-left:none'>받는분</td>
        <td class="xl24" style='border-left:none'>지국코드</td>
		<td class=xl24 style='border-left:none'>지국코드</td>
		<td class=xl24 style='border-left:none'>부서</td>
		<td class=xl24 style='border-left:none'>지역</td>
		<td class=xl24 style='border-left:none'>유료부수</td>
		<td class=xl24 style='border-left:none'>배달금액</td>
 </tr>
<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		PS_L_WEEKSND_CLOS_PRINTRSLTCURRecord curcommlistRec = (PS_L_WEEKSND_CLOS_PRINTRSLTCURRecord)ds.rsltcur.get(i);
%>
 <tr style='height:13.5pt'>
   <td class=xl26 style='border-top:none;border-left:none' height='18'><%= curcommlistRec.banknm%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.bankcd%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.acctno%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.deps_persnm%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.bonm%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.bocd%>&nbsp;</td>
   <td class=x126 style='border-top:none;border-left:none'><%= curcommlistRec.deptnm%></td>
   <td class=x126 style='border-top:none;border-left:none'><%= curcommlistRec.areanm%></td>
   <td class=x126 style='border-top:none;border-left:none'><%= curcommlistRec.totcnt%></td>
   <td class=x126 style='border-top:none;border-left:none'><%= curcommlistRec.dlvamt%></td>
 </tr>
<%}%>
</table>
</body>
</html>
