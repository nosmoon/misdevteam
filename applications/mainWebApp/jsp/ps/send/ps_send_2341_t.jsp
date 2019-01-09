<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_1241_t.jsp
* 기능 : 매체 일괄발송 엑셀출력
* 작성일자 : 2005-12-08
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<!--JSP COMMENT END--------------------------------------------------------------------------------->
<%
    //  dataset 인스턴스 선언부분
    PS_P_SEND_PBLMEDISENDBODataSet ds = (PS_P_SEND_PBLMEDISENDBODataSet)request.getAttribute("ds");  // request dataset

    String sendyymmdd = Util.checkString(request.getParameter("sendyymmdd"));
%>
<html>
<head>
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
	border:.5pt solid windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl26
	{mso-style-parent:style0;
	font-size:16.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl27
	{mso-style-parent:style0;
	mso-number-format:"\@";
	border:.5pt solid windowtext;}
.xl28
	{mso-style-parent:style0;
	mso-number-format:"0_ ";
	border:.5pt solid windowtext;
	background:#CCFFFF;
	text-align:right;
	mso-pattern:auto none;
	mso-protection:unlocked visible;}
.xl29
	{mso-style-parent:style0;
	text-align:right;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:.5pt solid windowtext;
	background:#CCFFFF;
	mso-pattern:auto none;}
.xl30
	{mso-style-parent:style0;
	text-align:right;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:none;
	background:#CCFFFF;
	mso-pattern:auto none;}
.xl31
	{mso-style-parent:style0;
	text-align:right;
	border-top:.5pt solid windowtext;
	border-right:.5pt solid windowtext;
	border-bottom:.5pt solid windowtext;
	border-left:none;
	background:#CCFFFF;
	mso-pattern:auto none;}
.xl32
	{mso-style-parent:style0;
	mso-number-format:"0_ ";
	border:.5pt solid windowtext;
	text-align:right;
	mso-pattern:auto none;
	mso-protection:unlocked visible;}

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

<table x:str border=0 cellpadding=0 cellspacing=0 width=800 style='border-collapse:
 collapse;table-layout:fixed;width:600pt'>
 <col width=80 span=10 style='width:60pt'>
 <tr height=27 style='height:20.25pt'>
  <td colspan=9 height=27 class=xl26 width=800 style='height:20.25pt; width:600pt'>
	매체명 : <%= ds.getMedinm()%>
  </td>
 </tr>
 <tr height=18 style='height:13.5pt'>
<!--
  <td height=18 class=xl24 style='height:13.5pt;border-top:none;border-left:none'>인쇄처</td>
  <td class=xl24 style='border-top:none;border-left:none'>노선</td>
-->
  <td class=xl25 style='border-top:none;border-left:none'>발송일자</td>
  <td class=xl25 style='border-top:none;border-left:none'>지종코드</td>
  <td class=xl24 style='border-top:none;border-left:none'>지역코드</td>
  <td class=xl25 style='border-top:none;border-left:none'>지역명</td>
<!--  <td class=xl24 style='border-top:none;border-left:none'>지국순번</td> -->
  <td class=xl24 style='border-top:none;border-left:none'>지국코드</td>
  <td class=xl24 style='border-top:none;border-left:none'>지국명</td>
  <td class=xl24 style='border-top:none;border-left:none'>부서코드</td>
  <td class=xl24 style='border-top:none;border-left:none'>유가부수</td>
  <td class=xl24 style='border-top:none;border-left:none'>예비지</td>
 </tr>

<%--목록 시작--%>
<%for(int i=0; i<ds.curcommlist.size(); i++){
		PS_P_SEND_PBLMEDISENDBOCURCOMMLISTRecord curcommlistRec = (PS_P_SEND_PBLMEDISENDBOCURCOMMLISTRecord)ds.curcommlist.get(i);%>
 <tr height=18 style='height:13.5pt'>
<!--
  <td height=18 class=xl27 style='height:13.5pt;border-top:none'>< %= curcommlistRec.hbiscnm%></td>
  <td class=xl27 style='border-top:none;border-left:none'>< %= curcommlistRec.bhnscd%></td>
-->
  <td class=xl27 style='border-top:none;border-left:none'><%=sendyymmdd%></td>
  <td class=xl32 style='border-top:none;border-left:none'><%= curcommlistRec.medicd%></td>
  <td class=xl32 style='border-top:none;border-left:none'><%= curcommlistRec.areacd%></td>
  <td class=xl32 style='border-top:none;border-left:none'><%= curcommlistRec.areanm%></td>
<!--  <td class=xl32 style='border-top:none;border-left:none'>< %= curcommlistRec.boinsdseq%></td> -->
  <td class=xl27 style='border-top:none;border-left:none'><%= curcommlistRec.bocd%></td>
  <td class=xl27 style='border-top:none;border-left:none'><%= curcommlistRec.bonm%></td>
  <td class=xl27 style='border-top:none;border-left:none'><%= curcommlistRec.deptcd%></td>
  <td class=xl32 style='border-top:none;border-left:none'><%= curcommlistRec.sendqty%></td>
  <td class=xl32 style='border-top:none;border-left:none'><%= curcommlistRec.sendresvqty%></td>
 </tr>

<%}%>

 <![if supportMisalignedColumns]>
 <tr height=0 style='display:none'>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
 </tr>
 <![endif]>
</table>

</body>

</html>
