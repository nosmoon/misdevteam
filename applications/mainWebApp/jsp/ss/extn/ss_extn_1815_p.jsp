<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
        String yymm = (String)request.getParameter("yymm");
        response.reset();
        response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
        response.setHeader("Content-Disposition", "attachment; filename=CRMDATA_"+yymm+".xls;");
        response.setHeader("Content-Transfer-Encoding", "binary;");
        response.setHeader("Pragma", "no-cache;");
        response.setHeader("Expires", "-1;");
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1915_p.jsp
* 기능 : 지국경영-입주아파트현황-입주팀확장현황-엑셀자장
* 작성일자 : 2006-06-07
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<html>
<%
	SL_L_MOVEIN_EXTN_PRINTDataSet ds = (SL_L_MOVEIN_EXTN_PRINTDataSet)request.getAttribute("ds");
%>
<head>
<title>입주확장팀현황</title>
<meta http-equiv=Content-Type content="text/html;">
<meta name=ProgId content=Excel.Sheet>
<meta name=Generator content="Microsoft Excel 9">
<style id="crm">
<!--[if gte mso 9]><xml>
 <o:DocumentProperties>
  <o:LastAuthor>crm</o:LastAuthor>
  <o:Created>2006-06-14T08:46:50Z</o:Created>
  <o:LastSaved>2006-06-14T08:46:50Z</o:LastSaved>
  <o:Version>9.2812</o:Version>
 </o:DocumentProperties>
 <o:OfficeDocumentSettings>
  <o:DownloadComponents/>
 </o:OfficeDocumentSettings>
</xml><![endif]-->
<style>
<!--table
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
	font-family:돋움;
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
	font-size:11.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:돋움;
	mso-generic-font-family:auto;
	mso-font-charset:129;
	mso-number-format:General;
	text-align:general;
	vertical-align:bottom;
	border:none;
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
	font-family:돋움, monospace;
	mso-font-charset:129;
	mso-char-type:none;
	display:none;}
-->
</style>

</head>

<body link=blue vlink=purple>

<table x:str border=0 cellpadding=0 cellspacing=0 width=1440 style='border-collapse:
 collapse;table-layout:fixed;width:1388pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2000;width:66pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2000;width:86pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2000;width:71pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2000;width:60pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2000;width:242pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2000;width:78pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:104pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2500;width:104pt'>
 <col width=96 style='mso-width-source:userset;mso-width-alt:3000;width:72pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:3500;width:111pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:7000;width:77pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:4000;width:56pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2000;width:66pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2000;width:69pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:3000;width:111pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:3000;width:77pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2000;width:56pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2000;width:66pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:4000;width:69pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:4000;width:69pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:4000;width:69pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:4000;width:69pt'>
 <tr height=27 style='height:20.25pt'>
       <td colspan=19 height=27 class=xl27 width=1254 style='height:20.25pt;width:943pt'>입주팀 확장 명단</td>
<%--&nbsp;(<%=request.getParameter("fromdt")%>~<%=request.getParameter("todt")%>)--%>
       <td class=xl27 width=148 style='width:111pt'></td>
       <td class=xl27 width=102 style='width:77pt'></td>
       <td class=xl27 width=74 style='width:56pt'></td>
       <td width=88 style='width:66pt'></td>
       <td width=88 style='width:66pt'></td>
       <td width=92 style='width:69pt'></td>
 </tr>
 <tr height=18 style='height:13.5pt'>
		<td class=xl24 style='border-left:none'>확장일자</td>
		<td class=xl24 style='border-left:none'>부서명</td>
		<td class=xl24 style='border-left:none'>지역명</td>
		<td class=xl24 style='border-left:none'>지국명</td>
		<td class=xl24 style='border-left:none'>팀명</td>
		<td class=xl24 style='border-left:none'>관할지역명</td>
		<td class=xl24 style='border-left:none'>요원명</td>
		<td class=xl24 style='border-left:none'>확장유형</td>
		<td class=xl24 style='border-left:none'>독자명</td>
		<td class=xl24 style='border-left:none'>독자번호</td>
		<td class=xl24 style='border-left:none'>주소</td>
		<td class=xl25 style='border-left:none'>상세주소</td>
		<td class=xl25 style='border-left:none'>주거구분</td>
		<td class=xl24 style='border-left:none'>유가월</td>
		<td class=xl24 style='border-left:none'>전화번호</td>
		<td class=xl24 style='border-left:none'>핸드폰번호</td>
		<td class=xl24 style='border-left:none'>단가</td>
		<td class=xl24 style='border-left:none'>부수</td>
		<td class=xl24 style='border-left:none'>중지일자</td>
		<td class=xl24 style='border-left:none'>중지여부</td>
		<td class=xl24 style='border-left:none'>입주아파트여부</td>
		<td class=xl24 style='border-left:none'>비고</td>
 </tr>

<%
for(int i=0; i<ds.curextnlist.size(); i++){
	SL_L_MOVEIN_EXTN_PRINTCUREXTNLISTRecord curcommlistRec = (SL_L_MOVEIN_EXTN_PRINTCUREXTNLISTRecord)ds.curextnlist.get(i);%>

 <tr height=18 style='height:13.5pt'>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.extndt%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.deptnm%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.areanm%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.bonm%></td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.teamnm%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.jursareanm%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.stafnm%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extntypenm%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.rdrnm%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_no%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.addr%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.dtlsaddr%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.resitypenm%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.valmm%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.telno%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.ptphno%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.amt%></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.qty%></td>
   <td class=xl28 style='border-top:none;border-left:none'><font color="#ff0000"><%= curcommlistRec.suspdt%></font></td>
   <td class=xl28 style='border-top:none;border-left:none'><font color="#ff0000"><%= curcommlistRec.subspyn.equals("N") ? "Y" : "" %></font></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.mvinaptyn.equals("Y") ? "Y" : "" %></td>
   <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.remk%></td>
 </tr>
<%}%>

</table>

</body>

</html>
