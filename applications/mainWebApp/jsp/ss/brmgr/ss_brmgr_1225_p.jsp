<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1225_p.jsp
* 기능 : 지국지원-부수증감-본지부수증감신청-인쇄
* 작성일자 : 2004-04-24
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<html>
<%
	SS_L_QTYAPLC_MAINNWSP_PRINTDataSet ds = (SS_L_QTYAPLC_MAINNWSP_PRINTDataSet)request.getAttribute("ds");
    int printListCount = 12;	// 한 화면당 리스트 항목 수
%>
<head>
<style>
<!--table
	{mso-displayed-decimal-separator:"\.";
	mso-displayed-thousand-separator:"\,";}
@page
	{margin:.94in 0in .55in 0in;
	mso-header-margin:.51in;
	mso-footer-margin:.24in;
	mso-horizontal-page-align:center;}
tr
	{mso-height-source:auto;
	mso-ruby-visibility:none;}
col
	{mso-width-source:auto;
	mso-ruby-visibility:none;}
br
	{mso-data-placement:same-cell;}
.style18
	{mso-number-format:"_-* \#\,\#\#0_-\;\\-* \#\,\#\#0_-\;_-* \0022-\0022_-\;_-\@_-";
	mso-style-name:"쉼표 \[0\]";
	mso-style-id:6;}
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
	font-size:10.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl25
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;}
.xl26
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	vertical-align:middle;}
.xl27
	{mso-style-parent:style0;
	font-size:18.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	vertical-align:middle;}
.xl28
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl29
	{mso-style-parent:style0;
	font-size:20.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	vertical-align:middle;}
.xl30
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl31
	{mso-style-parent:style18;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"_-* \#\,\#\#0_-\;\\-* \#\,\#\#0_-\;_-* \0022-\0022_-\;_-\@_-";
	text-align:right;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl32
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:none;
	border-left:.5pt solid windowtext;}
.xl33
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:none;
	border-left:none;}
.xl34
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:.5pt solid windowtext;
	border-bottom:none;
	border-left:none;}
.xl35
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	vertical-align:middle;
	border-top:none;
	border-right:none;
	border-bottom:none;
	border-left:.5pt solid windowtext;}
.xl36
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	vertical-align:middle;
	border-top:none;
	border-right:.5pt solid windowtext;
	border-bottom:none;
	border-left:none;}
.xl37
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:none;}
.xl38
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:right;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:none;}
.xl39
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:.5pt solid windowtext;
	border-bottom:.5pt solid windowtext;
	border-left:none;}
.xl40
	{mso-style-parent:style0;
	font-size:12.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;}
.xl41
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:.5pt solid windowtext;}
.xl42
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:.5pt solid windowtext;
	border-bottom:.5pt solid windowtext;
	border-left:none;}
.xl43
	{mso-style-parent:style0;
	font-size:10.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:.5pt solid windowtext;}
.xl44
	{mso-style-parent:style0;
	font-size:10.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:.5pt solid windowtext;
	border-bottom:.5pt solid windowtext;
	border-left:none;}
.xl45
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:none;
	border-left:.5pt solid windowtext;}
.xl46
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:.5pt solid windowtext;
	border-bottom:none;
	border-left:none;}
.xl47
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:none;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:.5pt solid windowtext;}
.xl48
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:none;
	border-right:.5pt solid windowtext;
	border-bottom:.5pt solid windowtext;
	border-left:none;}
.xl49
	{mso-style-parent:style18;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"_-* \#\,\#\#0_-\;\\-* \#\,\#\#0_-\;_-* \0022-\0022_-\;_-\@_-";
	text-align:right;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:.5pt solid windowtext;}
.xl50
	{mso-style-parent:style18;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"_-* \#\,\#\#0_-\;\\-* \#\,\#\#0_-\;_-* \0022-\0022_-\;_-\@_-";
	text-align:center;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:none;}
.xl51
	{mso-style-parent:style18;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"_-* \#\,\#\#0_-\;\\-* \#\,\#\#0_-\;_-* \0022-\0022_-\;_-\@_-";
	text-align:center;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:.5pt solid windowtext;
	border-bottom:.5pt solid windowtext;
	border-left:none;}
.xl52
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	layout-flow:vertical;}
.xl53
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:none;
	border-left:none;}
.xl54
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:none;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:none;}
.xl55
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:none;}
.xl56
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:none;
	border-left:.5pt solid windowtext;
	layout-flow:vertical;}
.xl57
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:.5pt solid windowtext;
	border-bottom:none;
	border-left:none;
	layout-flow:vertical;}
.xl58
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:none;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:.5pt solid windowtext;
	layout-flow:vertical;}
.xl59
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:none;
	border-right:.5pt solid windowtext;
	border-bottom:.5pt solid windowtext;
	border-left:none;
	layout-flow:vertical;}
.xl60
	{mso-style-parent:style0;
	font-size:14.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;}
.xl61
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:none;
	border-right:none;
	border-bottom:none;
	border-left:.5pt solid windowtext;}
.xl62
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:none;
	border-right:.5pt solid windowtext;
	border-bottom:none;
	border-left:none;}
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
<!--[if gte mso 9]><xml>
 <x:ExcelWorkbook>
  <x:ExcelWorksheets>
   <x:ExcelWorksheet>
    <x:Name>Sheet1</x:Name>
    <x:WorksheetOptions>
     <x:DefaultRowHeight>270</x:DefaultRowHeight>
     <x:Print>
      <x:ValidPrinterInfo/>
      <x:PaperSizeIndex>9</x:PaperSizeIndex>
      <x:Scale>92</x:Scale>
      <x:HorizontalResolution>300</x:HorizontalResolution>
      <x:VerticalResolution>300</x:VerticalResolution>
     </x:Print>
     <x:Selected/>
     <x:Panes>
      <x:Pane>
       <x:Number>3</x:Number>
       <x:ActiveRow>25</x:ActiveRow>
       <x:ActiveCol>7</x:ActiveCol>
      </x:Pane>
     </x:Panes>
     <x:ProtectContents>False</x:ProtectContents>
     <x:ProtectObjects>False</x:ProtectObjects>
     <x:ProtectScenarios>False</x:ProtectScenarios>
    </x:WorksheetOptions>
   </x:ExcelWorksheet>
   <x:ExcelWorksheet>
    <x:Name>Sheet2</x:Name>
    <x:WorksheetOptions>
     <x:DefaultRowHeight>270</x:DefaultRowHeight>
     <x:ProtectContents>False</x:ProtectContents>
     <x:ProtectObjects>False</x:ProtectObjects>
     <x:ProtectScenarios>False</x:ProtectScenarios>
    </x:WorksheetOptions>
   </x:ExcelWorksheet>
   <x:ExcelWorksheet>
    <x:Name>Sheet3</x:Name>
    <x:WorksheetOptions>
     <x:DefaultRowHeight>270</x:DefaultRowHeight>
     <x:ProtectContents>False</x:ProtectContents>
     <x:ProtectObjects>False</x:ProtectObjects>
     <x:ProtectScenarios>False</x:ProtectScenarios>
    </x:WorksheetOptions>
   </x:ExcelWorksheet>
  </x:ExcelWorksheets>
  <x:WindowHeight>9000</x:WindowHeight>
  <x:WindowWidth>12120</x:WindowWidth>
  <x:WindowTopX>600</x:WindowTopX>
  <x:WindowTopY>45</x:WindowTopY>
  <x:ProtectStructure>False</x:ProtectStructure>
  <x:ProtectWindows>False</x:ProtectWindows>
 </x:ExcelWorkbook>
</xml><![endif]-->
</head>

<body link=blue vlink=purple class=xl26>

<table x:str border=0 cellpadding=0 cellspacing=0 width=1788 style='border-collapse:
 collapse;table-layout:fixed;width:1343pt'>
 <col class=xl26 width=62 style='mso-width-source:userset;mso-width-alt:1763;
 width:47pt'>
 <col class=xl26 width=14 style='mso-width-source:userset;mso-width-alt:398;
 width:11pt'>
 <col class=xl26 width=50 style='mso-width-source:userset;mso-width-alt:1422;
 width:38pt'>
 <col class=xl26 width=43 style='mso-width-source:userset;mso-width-alt:1223;
 width:32pt'>
 <col class=xl26 width=80 style='width:60pt'>
 <col class=xl26 width=75 style='mso-width-source:userset;mso-width-alt:2133;
 width:56pt'>
 <col class=xl26 width=80 span=3 style='width:60pt'>
 <col class=xl26 width=13 style='mso-width-source:userset;mso-width-alt:369;
 width:10pt'>
 <col class=xl26 width=10 style='mso-width-source:userset;mso-width-alt:284;
 width:8pt'>
 <col class=xl26 width=56 style='mso-width-source:userset;mso-width-alt:1592;
 width:42pt'>
 <col class=xl26 width=4 style='mso-width-source:userset;mso-width-alt:113;
 width:3pt'>
 <col class=xl26 width=15 style='mso-width-source:userset;mso-width-alt:426;
 width:11pt'>
 <col class=xl26 width=45 style='mso-width-source:userset;mso-width-alt:1280;
 width:34pt'>
 <col class=xl26 width=16 style='mso-width-source:userset;mso-width-alt:455;
 width:12pt'>
 <col class=xl26 width=45 style='mso-width-source:userset;mso-width-alt:1280;
 width:34pt'>
 <col class=xl26 width=13 style='mso-width-source:userset;mso-width-alt:369;
 width:10pt'>
 <col class=xl26 width=47 style='mso-width-source:userset;mso-width-alt:1336;
 width:35pt'>
 <col class=xl26 width=80 span=12 style='width:60pt'>
 <tr height=18 style='height:13.5pt'>
  <td height=18 class=xl26 width=62 style='height:13.5pt;width:47pt'></td>
  <td class=xl26 width=14 style='width:11pt'></td>
  <td class=xl26 width=50 style='width:38pt'></td>
  <td class=xl26 width=43 style='width:32pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=75 style='width:56pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=13 style='width:10pt'></td>
  <td class=xl26 width=10 style='width:8pt'></td>
  <td class=xl26 width=56 style='width:42pt'></td>
  <td class=xl26 width=4 style='width:3pt'></td>
  <td class=xl26 width=15 style='width:11pt'></td>
  <td class=xl26 width=45 style='width:34pt'></td>
  <td class=xl26 width=16 style='width:12pt'></td>
  <td class=xl26 width=45 style='width:34pt'></td>
  <td class=xl26 width=13 style='width:10pt'></td>
  <td class=xl26 width=47 style='width:35pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
  <td class=xl26 width=80 style='width:60pt'></td>
 </tr>
 <tr height=18 style='height:13.5pt'>
  <td height=18 colspan=31 class=xl26 style='height:13.5pt;mso-ignore:colspan'></td>
 </tr>
 <tr height=30 style='mso-height-source:userset;height:22.5pt'>
  <td height=30 class=xl24 style='height:22.5pt'>부수담당</td>
  <td colspan=2 class=xl43 style='border-right:.5pt solid black;border-left:
  none'>판지부장</td>
  <td class=xl25></td>
  <td colspan=3 class=xl26 style='mso-ignore:colspan'></td>
  <td rowspan=2 class=xl52></td>
  <td rowspan=2 class=xl25></td>
  <td colspan=2 rowspan=2 class=xl56 style='border-right:.5pt solid black;
  border-bottom:.5pt solid black'>결재</td>
  <td colspan=2 class=xl41 style='border-right:.5pt solid black;border-left:
  none'>담당</td>
  <td colspan=2 class=xl41 style='border-right:.5pt solid black;border-left:
  none'>차장</td>
  <td colspan=2 class=xl41 style='border-right:.5pt solid black;border-left:
  none'>부장</td>
  <td colspan=2 class=xl41 style='border-right:.5pt solid black;border-left:
  none'>국장</td>
  <td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=68 style='mso-height-source:userset;height:51.0pt'>
  <td height=68 class=xl28 style='height:51.0pt;border-top:none'>　</td>
  <td colspan=2 class=xl41 style='border-right:.5pt solid black;border-left:
  none'>　</td>
  <td colspan=4 class=xl26 style='mso-ignore:colspan'></td>
  <td colspan=2 class=xl41 style='border-right:.5pt solid black;border-left:
  none'>　</td>
  <td colspan=2 class=xl41 style='border-right:.5pt solid black;border-left:
  none'>　</td>
  <td colspan=2 class=xl41 style='border-right:.5pt solid black;border-left:
  none'>　</td>
  <td colspan=2 class=xl41 style='border-right:.5pt solid black;border-left:
  none'>　</td>
  <td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=30 style='height:22.5pt'>
  <td height=30 colspan=30 class=xl26 style='height:22.5pt;mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=34 style='height:25.5pt'>
  <td height=34 class=xl29 colspan=7 style='height:25.5pt;mso-ignore:colspan'>[ 부 수 증 감 신 청 서 ]</td>
  <td colspan=23 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=37 style='mso-height-source:userset;height:27.75pt'>
  <td height=37 colspan=30 class=xl26 style='height:27.75pt;mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 
<tr height=30 style='height:22.5pt'>
	<td colspan=2 rowspan=2 height=60 class=xl45 style='border-right:.5pt solid black; border-bottom:.5pt solid black;height:45.0pt'>지역</td>
	<td colspan=2 rowspan=2 class=xl45 style='border-right:.5pt solid black; border-bottom:.5pt solid black'>지국명</td>
	<td colspan=4 class=xl30 style='border-left:none'>지국</td>
	<td colspan=8 class=xl45 style='border-right:.5pt solid black;border-left: none'>본사</td>
	<td colspan=3 class=xl45 style='border-right:.5pt solid black;border-left: none'>부수증감</td>
	<td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
	<td class=xl27></td>
</tr>
<tr height=30 style='height:22.5pt'>
	<td height=30 class=xl30 style='height:22.5pt;border-top:none;border-left: none'>당월유가</td>
	<td class=xl30 style='border-top:none;border-left:none'>준유가</td>
	<td class=xl30 style='border-top:none;border-left:none'>실독자</td>
	<td class=xl30 style='border-top:none;border-left:none'>홍보지</td>
	<td class=xl30 style='border-left:none'>발송부수</td>
	<td colspan=3 class=xl41 style='border-right:.5pt solid black;border-left: none'>유료부수</td>
	<td colspan=4 class=xl41 style='border-right:.5pt solid black;border-left: none'>홍보부수</td>
	<td colspan=3 class=xl47 style='border-right:.5pt solid black;border-left: none'>신청부수</td>
	<td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
	<td class=xl27></td>
</tr>

<!-- 본지부수증감 목록 시작 -------------------------------------------------------------------------->
<%for(int i=0; i<ds.curcommlist.size(); i++){
	SS_L_QTYAPLC_MAINNWSP_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_QTYAPLC_MAINNWSP_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
<tr height=30 style='height:22.5pt'>
	<td colspan=2 height=30 class=xl41 style='border-right:.5pt solid black; height:22.5pt'><%= curcommlistRec.areanm%>&nbsp;</td>
	<td colspan=2 class=xl41 style='border-right:.5pt solid black;border-left: none'><%= curcommlistRec.bonm%>&nbsp;</td>
	<td class=xl31 style='border-top:none;border-left:none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span><%= curcommlistRec.thmmvalqty%>&nbsp;</td>
	<td class=xl31 style='border-top:none;border-left:none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span><%= curcommlistRec.aftcnt_tot%>&nbsp;</td>
	<td class=xl31 style='border-top:none;border-left:none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span><%= curcommlistRec.realtot%>&nbsp;</td>
	<td class=xl31 style='border-top:none;border-left:none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span><%= curcommlistRec.pub_infonwsp%>&nbsp;</td>
	<td class=xl31 style='border-top:none;border-left:none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span><%= curcommlistRec.bsbusu%>&nbsp;</td>
	<td colspan=3 class=xl49 style='border-right:.5pt solid black;border-left: none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span><%= curcommlistRec.iygwygbs%>&nbsp;</td>
	<td colspan=4 class=xl49 style='border-right:.5pt solid black;border-left: none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span><%= curcommlistRec.iygwhbbs%>&nbsp;</td>
	<td colspan=3 class=xl49 style='border-right:.5pt solid black;border-left: none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span><%= curcommlistRec.chrgupdicdcqty%>&nbsp;</td>
	<td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
	<td class=xl27></td>
</tr>
<%}%>
<!-- 본지부수증감 목록 끝 -------------------------------------------------------------------------->
<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 시작 --%>
<%for(int i=0; i<(printListCount-ds.curcommlist.size()); i++){%>
<tr height=30 style='height:22.5pt'>
	<td colspan=2 height=30 class=xl41 style='border-right:.5pt solid black; height:22.5pt'>&nbsp;</td>
	<td colspan=2 class=xl41 style='border-right:.5pt solid black;border-left: none'>&nbsp;</td>
	<td class=xl31 style='border-top:none;border-left:none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span>&nbsp; </td>
	<td class=xl31 style='border-top:none;border-left:none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span>&nbsp; </td>
	<td class=xl31 style='border-top:none;border-left:none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span>&nbsp; </td>
	<td class=xl31 style='border-top:none;border-left:none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span>&nbsp; </td>
	<td class=xl31 style='border-top:none;border-left:none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span>&nbsp; </td>
	<td colspan=3 class=xl49 style='border-right:.5pt solid black;border-left: none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span>&nbsp; </td>
	<td colspan=4 class=xl49 style='border-right:.5pt solid black;border-left: none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span>&nbsp; </td>
	<td colspan=3 class=xl49 style='border-right:.5pt solid black;border-left: none' x:str=""><span style="mso-spacerun: yes">&nbsp;</span>&nbsp; </td>
	<td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
	<td class=xl27></td>
</tr>
<%}%>
<%-- 화면당 보여줄 항목이 적을 경우 빈 항목 출력 끝 --%>
<%-- 합계 행 시작 --%>
<tr height=30 style='height:22.5pt'>
	<td colspan=4 height=30 class=xl41 style='border-right:.5pt solid black; height:22.5pt'>합<span style="mso-spacerun: yes">&nbsp; </span>계</td>
	<td class=xl31 style='border-top:none;border-left:none' x:str="당계"><span style="mso-spacerun: yes">&nbsp;</span><%= Util.comma(ds.getTotalthmmvalqty())%>&nbsp;</td>
	<td class=xl31 style='border-top:none;border-left:none' x:str="준유계"><span style="mso-spacerun: yes">&nbsp;</span><%= Util.comma(ds.getTotalaftcnt_tot())%>&nbsp;</td>
	<td class=xl31 style='border-top:none;border-left:none' x:str="실독계"><span style="mso-spacerun: yes">&nbsp;</span><%= Util.comma(ds.getTotalrealtot())%>&nbsp;</td>
	<td class=xl31 style='border-top:none;border-left:none' x:str="홍보계"><span style="mso-spacerun: yes">&nbsp;</span><%= Util.comma(ds.getTotalpub_infonwsp())%>&nbsp;</td>
	<td class=xl31 style='border-top:none;border-left:none' x:str="발송계"><span style="mso-spacerun: yes">&nbsp;</span><%= Util.comma(ds.getTotalbsbusu())%>&nbsp;</td>
	<td colspan=3 class=xl49 style='border-right:.5pt solid black;border-left: none' x:str="유료계"><span style="mso-spacerun: yes">&nbsp;</span><%= Util.comma(ds.getTotaliygwygbs())%>&nbsp;</td>
	<td colspan=4 class=xl49 style='border-right:.5pt solid black;border-left: none' x:str="본홍보계"><span style="mso-spacerun: yes">&nbsp;</span><%= Util.comma(ds.getTotaliygwhbbs())%>&nbsp;</td>
	<td colspan=3 class=xl49 style='border-right:.5pt solid black;border-left: none' x:str="신청계"><span style="mso-spacerun: yes">&nbsp;</span><%= Util.comma(ds.getTotalchrgupdicdcqty())%>&nbsp;</td>
	<td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
	<td class=xl27></td>
</tr>
<%-- 합계 행 끝 --%>
 <tr height=30 style='height:22.5pt'>
  <td height=30 class=xl32 style='height:22.5pt;border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl34 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl33 style='border-top:none'>　</td>
  <td class=xl34 style='border-top:none'>　</td>
  <td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=30 style='height:22.5pt'>
  <td height=30 class=xl35 style='height:22.5pt'>　</td>
  <td colspan=2 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl36>　</td>
  <td colspan=14 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl36>　</td>
  <td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=30 style='height:22.5pt'>
  <td colspan=4 height=30 class=xl61 style='border-right:.5pt solid black;
  height:22.5pt'>활 용</td>
  <td colspan=14 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl36>　</td>
  <td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=30 style='height:22.5pt'>
  <td colspan=4 height=30 class=xl61 style='border-right:.5pt solid black;
  height:22.5pt'>계<span style="mso-spacerun: yes">&nbsp; </span>획</td>
  <td colspan=14 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl36>　</td>
  <td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=30 style='height:22.5pt'>
  <td colspan=4 height=30 class=xl61 style='border-right:.5pt solid black;
  height:22.5pt'>　</td>
  <td colspan=14 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl36>　</td>
  <td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=30 style='height:22.5pt'>
  <td height=30 class=xl35 style='height:22.5pt'>　</td>
  <td colspan=2 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl36>　</td>
  <td colspan=14 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl36>　</td>
  <td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=30 style='height:22.5pt'>
  <td height=30 class=xl35 style='height:22.5pt'>　</td>
  <td colspan=2 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl36>　</td>
  <td colspan=14 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl36>　</td>
  <td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=30 style='height:22.5pt'>
  <td height=30 class=xl35 style='height:22.5pt'>　</td>
  <td colspan=2 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl36>　</td>
  <td colspan=14 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl36>　</td>
  <td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=30 style='height:22.5pt'>
  <td colspan=4 height=30 class=xl41 style='border-right:.5pt solid black;
  height:22.5pt'>처리일자</td>
  <td class=xl37>　</td>
  <td class=xl37 x:str="2004년 ">2004년<span style="mso-spacerun:
  yes">&nbsp;</span></td>
  <td class=xl38>월</td>
  <td class=xl38>일</td>
  <td class=xl37 colspan=4 style='mso-ignore:colspan'><span
  style="mso-spacerun: yes">&nbsp;</span>(부수담당 기재)</td>
  <td class=xl37>　</td>
  <td class=xl37>　</td>
  <td class=xl37>　</td>
  <td class=xl37>　</td>
  <td class=xl37>　</td>
  <td class=xl37>　</td>
  <td class=xl39>　</td>
  <td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=20 style='mso-height-source:userset;height:15.0pt'>
  <td height=20 colspan=30 class=xl26 style='height:15.0pt;mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=30 style='height:22.5pt'>
  <td height=30 colspan=8 class=xl26 style='height:22.5pt;mso-ignore:colspan'></td>
  <td colspan=11 class=xl40>2004년<span style="mso-spacerun:
  yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  </span>월<span style="mso-spacerun:
  yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </span>일</td>
  <td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=15 style='mso-height-source:userset;height:11.25pt'>
  <td height=15 colspan=8 class=xl26 style='height:11.25pt;mso-ignore:colspan'></td>
  <td colspan=11 class=xl40 style='mso-ignore:colspan'></td>
  <td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=30 style='height:22.5pt'>
  <td height=30 colspan=8 class=xl26 style='height:22.5pt;mso-ignore:colspan'></td>
  <td colspan=11 class=xl60>지 방 판 매 2 부</td>
  <td colspan=11 class=xl26 style='mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <tr height=30 style='height:22.5pt'>
  <td height=30 colspan=30 class=xl26 style='height:22.5pt;mso-ignore:colspan'></td>
  <td class=xl27></td>
 </tr>
 <![if supportMisalignedColumns]>
 <tr height=0 style='display:none'>
  <td width=62 style='width:47pt'></td>
  <td width=14 style='width:11pt'></td>
  <td width=50 style='width:38pt'></td>
  <td width=43 style='width:32pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=75 style='width:56pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=13 style='width:10pt'></td>
  <td width=10 style='width:8pt'></td>
  <td width=56 style='width:42pt'></td>
  <td width=4 style='width:3pt'></td>
  <td width=15 style='width:11pt'></td>
  <td width=45 style='width:34pt'></td>
  <td width=16 style='width:12pt'></td>
  <td width=45 style='width:34pt'></td>
  <td width=13 style='width:10pt'></td>
  <td width=47 style='width:35pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
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
