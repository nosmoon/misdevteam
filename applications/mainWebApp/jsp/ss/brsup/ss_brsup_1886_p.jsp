<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
        String yymm = (String)request.getParameter("yymm");
        String fromdt = request.getParameter("fromdt");
        String todt = request.getParameter("todt");
        String recpbankcd = request.getParameter("recpbankcd");

        response.reset();
        response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
        response.setHeader("Content-Disposition", "attachment; filename=EDI_RECP_" + recpbankcd + "(" + fromdt + "_" + todt + ").xls");
        response.setHeader("Content-Transfer-Encoding", "binary;");
        response.setHeader("Pragma", "no-cache;");
        response.setHeader("Expires", "-1;");
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1815_p.jsp
* 기능 :
* 작성일자 :
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_GIRORECP_PRINTDataSet ds = (SS_L_GIRORECP_PRINTDataSet)request.getAttribute("ds");
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
 <col width=80 style='mso-width-source:userset;mso-width-alt:3000;width:66pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:3000;width:86pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:3000;width:71pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:5000;width:60pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:242pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:78pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:104pt'>
  <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:104pt'>
 <tr height=27 style='height:20.25pt'>
       <td colspan="8" height=27 class=xl27 width=1254 style='height:20.25pt;width:943pt'>지로(편의점)수납현황</td>
 </tr>
 <tr height=18 style='height:13.5pt'>
		<td class=xl24 style='border-left:none'><%=( request.getParameter("selclsf").equals("1") == true ? "수납" : "처리" ) %> 일자</td>
		<td class=xl24 style='border-left:none'>지국</td>
        <td class=xl24 style='border-left:none'>지국코드</td>
		<td class=xl24 style='border-left:none'>지로번호</td>
		<td class=xl24 style='border-left:none'>수납지점(편의점)</td>
		<td class=xl24 style='border-left:none'>수납건수</td>
		<td class=xl24 style='border-left:none'>수납금액</td>
		<td class=xl24 style='border-left:none'>수수료</td>
 </tr>
<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_GIRORECP_PRINTRSLTCURRecord curcommlistRec = (SS_L_GIRORECP_PRINTRSLTCURRecord)ds.rsltcur.get(i);
%>
 <tr style='height:13.5pt'>
   <td class=xl26 style='border-top:none;border-left:none' height='18'><%= curcommlistRec.reqdt%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.bonm%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.bocd%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.girono%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.recpbanknm%>&nbsp;</td>
   <td class=x126 style='border-top:none;border-left:none'><%= curcommlistRec.cnt%></td>
   <td class=x126 style='border-top:none;border-left:none'><%= curcommlistRec.amt%></td>
   <td class=x126 style='border-top:none;border-left:none'><%= curcommlistRec.fee%></td>
 </tr>
<%}%>
</table>
</body>
</html>
