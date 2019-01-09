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
* 파일명 : ss_brmgr_1020_p.jsp
* 기능 : 지국경영-지국부수현황-조회(엑셀파일)
* 작성일자 : 2006-01-24
* 작성자 : 노상현
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<html>
<%
	SS_P_BOSENDPCONDDataSet ds = (SS_P_BOSENDPCONDDataSet)request.getAttribute("ds");
%>
<head>
<title>지국자체유가부수(CRM200601)</title>
<meta http-equiv=Content-Type content="text/html;">
<meta name=ProgId content=Excel.Sheet>
<meta name=Generator content="Microsoft Excel 9">
<style id="200511월분_17357_Styles">
<!--[if gte mso 9]><xml>
 <o:DocumentProperties>
  <o:LastAuthor>nosmoon</o:LastAuthor>
  <o:Created>2006-01-25T08:46:50Z</o:Created>
  <o:LastSaved>2006-01-25T08:46:50Z</o:LastSaved>
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
	mso-header-margin:0in;
	mso-footer-margin:0in;}
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
	color:black;
	font-size:10.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:Arial, sans-serif;
	mso-font-charset:0;
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
	color:black;
	font-size:10.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:Arial, sans-serif;
	mso-font-charset:0;
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
	mso-number-format:"\#\,\#\#0";
	border:none;
	mso-background-source:auto;
	mso-pattern:auto;}
.xl25
	{mso-style-parent:style0;
	mso-number-format:"mm\/dd\/yyyy\\ hh\:mm\:ss";
	border:none;
	mso-background-source:auto;
	mso-pattern:auto;}
.xl26
	{mso-style-parent:style0;
	border:none;
	mso-background-source:auto;
	mso-pattern:auto;}
.xl27
	{mso-style-parent:style0;
    mso-number-format:00000;
	border:none;
	background:silver;
	mso-pattern:white none;}
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
    <x:Name>Sheet 1</x:Name>
    <x:WorksheetOptions>
     <x:NoSummaryColumnsRightDetail/>
     <x:Print>
      <x:ValidPrinterInfo/>
      <x:HorizontalResolution>600</x:HorizontalResolution>
      <x:VerticalResolution>600</x:VerticalResolution>
     </x:Print>
     <x:PageBreakZoom>100</x:PageBreakZoom>
     <x:Selected/>
     <x:Panes>
      <x:Pane>
       <x:Number>3</x:Number>
       <x:ActiveRow>1</x:ActiveRow>
      </x:Pane>
     </x:Panes>
     <x:ProtectContents>False</x:ProtectContents>
     <x:ProtectObjects>False</x:ProtectObjects>
     <x:ProtectScenarios>False</x:ProtectScenarios>
    </x:WorksheetOptions>
   </x:ExcelWorksheet>
  </x:ExcelWorksheets>
  <x:WindowHeight>7005</x:WindowHeight>
  <x:WindowWidth>10005</x:WindowWidth>
  <x:WindowTopX>105</x:WindowTopX>
  <x:WindowTopY>105</x:WindowTopY>
  <x:ProtectStructure>False</x:ProtectStructure>
  <x:ProtectWindows>False</x:ProtectWindows>
 </x:ExcelWorkbook>
</xml><![endif]-->
</head>

<body link=blue vlink=purple>

<table x:str border=0 cellpadding=0 cellspacing=0 width=8964 style='border-collapse:
 collapse;table-layout:fixed;width:6774pt'>
 <col width=62 style='mso-width-source:userset;mso-width-alt:2267;width:50pt'>
 <col width=62 style='mso-width-source:userset;mso-width-alt:2267;width:50pt'>
 <col width=62 style='mso-width-source:userset;mso-width-alt:2267;width:50pt'>
 <col width=49 style='mso-width-source:userset;mso-width-alt:1792;width:37pt'>
 <col width=54 style='mso-width-source:userset;mso-width-alt:1974;width:41pt'>
 <col width=62 style='mso-width-source:userset;mso-width-alt:2267;width:47pt'>
 <col class=xl24 width=117 style='mso-width-source:userset;mso-width-alt:4278;
 width:88pt'>
 <col class=xl24 width=111 style='mso-width-source:userset;mso-width-alt:4059;
 width:83pt'>
 <col class=xl24 width=116 style='mso-width-source:userset;mso-width-alt:4242;
 width:87pt'>
 <col class=xl24 width=163 style='mso-width-source:userset;mso-width-alt:5961;
 width:122pt'>
 <col class=xl24 width=118 style='mso-width-source:userset;mso-width-alt:4315;
 width:89pt'>
 <col class=xl24 width=108 style='mso-width-source:userset;mso-width-alt:3949;
 width:81pt'>
 <col class=xl24 width=119 style='mso-width-source:userset;mso-width-alt:4352;
 width:89pt'>
 <col class=xl24 width=107 style='mso-width-source:userset;mso-width-alt:3913;
 width:80pt'>
 <col class=xl24 width=117 style='mso-width-source:userset;mso-width-alt:4278;
 width:88pt'>
 <col class=xl24 width=91 style='mso-width-source:userset;mso-width-alt:3328;
 width:68pt'>
 <col class=xl24 width=84 style='mso-width-source:userset;mso-width-alt:3072;
 width:63pt'>
 <col class=xl24 width=119 style='mso-width-source:userset;mso-width-alt:4352;
 width:89pt'>
 <col class=xl24 width=73 style='mso-width-source:userset;mso-width-alt:2669;
 width:55pt'>
 <col class=xl24 width=81 span=4 style='mso-width-source:userset;mso-width-alt:
 2962;width:61pt'>
 <col class=xl24 width=83 span=2 style='mso-width-source:userset;mso-width-alt:
 3035;width:62pt'>
 <col class=xl24 width=78 style='mso-width-source:userset;mso-width-alt:2852;
 width:59pt'>
 <col class=xl24 width=82 style='mso-width-source:userset;mso-width-alt:2998;
 width:62pt'>
 <col class=xl24 width=129 style='mso-width-source:userset;mso-width-alt:4717;
 width:97pt'>
 <col class=xl24 width=84 style='mso-width-source:userset;mso-width-alt:3072;
 width:63pt'>
 <col class=xl24 width=74 style='mso-width-source:userset;mso-width-alt:2706;
 width:56pt'>
 <col class=xl24 width=160 style='mso-width-source:userset;mso-width-alt:5851;
 width:120pt'>
 <col class=xl24 width=147 style='mso-width-source:userset;mso-width-alt:5376;
 width:110pt'>
 <col class=xl24 width=117 style='mso-width-source:userset;mso-width-alt:4278;
 width:88pt'>
 <col class=xl24 width=105 style='mso-width-source:userset;mso-width-alt:3840;
 width:79pt'>
 <col width=68 span=6 style='mso-width-source:userset;mso-width-alt:2486;
 width:51pt'>
 <col class=xl24 width=106 style='mso-width-source:userset;mso-width-alt:3876;
 width:80pt'>
 <col width=63 style='mso-width-source:userset;mso-width-alt:2304;width:47pt'>
 <col class=xl24 width=73 style='mso-width-source:userset;mso-width-alt:2669;
 width:55pt'>
 <col class=xl24 width=75 style='mso-width-source:userset;mso-width-alt:2742;
 width:56pt'>
 <col class=xl24 width=119 style='mso-width-source:userset;mso-width-alt:4352;
 width:89pt'>
 <col class=xl24 width=75 style='mso-width-source:userset;mso-width-alt:2742;
 width:56pt'>
 <col width=63 style='mso-width-source:userset;mso-width-alt:2304;width:47pt'>
 <col class=xl24 width=122 style='mso-width-source:userset;mso-width-alt:4461;
 width:92pt'>
 <col class=xl24 width=125 style='mso-width-source:userset;mso-width-alt:4571;
 width:94pt'>
 <col class=xl24 width=99 style='mso-width-source:userset;mso-width-alt:3620;
 width:74pt'>
 <col class=xl24 width=129 style='mso-width-source:userset;mso-width-alt:4717;
 width:97pt'>
 <col class=xl24 width=117 style='mso-width-source:userset;mso-width-alt:4278;
 width:88pt'>
 <col class=xl24 width=90 style='mso-width-source:userset;mso-width-alt:3291;
 width:68pt'>
 <col width=48 style='mso-width-source:userset;mso-width-alt:1755;width:36pt'>
 <col class=xl24 width=134 style='mso-width-source:userset;mso-width-alt:4900;
 width:101pt'>
 <col class=xl24 width=77 style='mso-width-source:userset;mso-width-alt:2816;
 width:58pt'>
 <col class=xl24 width=138 style='mso-width-source:userset;mso-width-alt:5046;
 width:104pt'>
 <col class=xl24 width=77 style='mso-width-source:userset;mso-width-alt:2816;
 width:58pt'>
 <col class=xl24 width=101 style='mso-width-source:userset;mso-width-alt:3693;
 width:76pt'>
 <col class=xl24 width=73 style='mso-width-source:userset;mso-width-alt:2669;
 width:55pt'>
 <col class=xl24 width=77 style='mso-width-source:userset;mso-width-alt:2816;
 width:58pt'>
 <col class=xl24 width=122 style='mso-width-source:userset;mso-width-alt:4461;
 width:92pt'>
 <col class=xl24 width=155 style='mso-width-source:userset;mso-width-alt:5668;
 width:116pt'>
 <col class=xl24 width=86 style='mso-width-source:userset;mso-width-alt:3145;
 width:65pt'>
 <col class=xl24 width=118 style='mso-width-source:userset;mso-width-alt:4315;
 width:89pt'>
 <col class=xl24 width=152 style='mso-width-source:userset;mso-width-alt:5558;
 width:114pt'>
 <col class=xl24 width=86 style='mso-width-source:userset;mso-width-alt:3145;
 width:65pt'>
 <col class=xl24 width=102 style='mso-width-source:userset;mso-width-alt:3730;
 width:77pt'>
 <col class=xl24 width=74 style='mso-width-source:userset;mso-width-alt:2706;
 width:56pt'>
 <col class=xl24 width=78 style='mso-width-source:userset;mso-width-alt:2852;
 width:59pt'>
 <col class=xl24 width=123 style='mso-width-source:userset;mso-width-alt:4498;
 width:92pt'>
 <col class=xl24 width=89 style='mso-width-source:userset;mso-width-alt:3254;
 width:67pt'>
 <col class=xl24 width=84 style='mso-width-source:userset;mso-width-alt:3072;
 width:63pt'>
 <col class=xl24 width=177 style='mso-width-source:userset;mso-width-alt:6473;
 width:133pt'>
 <col class=xl24 width=163 style='mso-width-source:userset;mso-width-alt:5961;
 width:122pt'>
 <col class=xl24 width=173 style='mso-width-source:userset;mso-width-alt:6326;
 width:130pt'>
 <col class=xl24 width=118 style='mso-width-source:userset;mso-width-alt:4315;
 width:89pt'>
 <col class=xl24 width=81 style='mso-width-source:userset;mso-width-alt:2962;
 width:61pt'>
 <col class=xl24 width=124 style='mso-width-source:userset;mso-width-alt:4534;
 width:93pt'>
 <col class=xl24 width=90 style='mso-width-source:userset;mso-width-alt:3291;
 width:68pt'>
 <col class=xl24 width=86 style='mso-width-source:userset;mso-width-alt:3145;
 width:65pt'>
 <col class=xl24 width=131 style='mso-width-source:userset;mso-width-alt:4790;
 width:98pt'>
 <col class=xl24 width=174 style='mso-width-source:userset;mso-width-alt:6363;
 width:131pt'>
 <col class=xl24 width=92 style='mso-width-source:userset;mso-width-alt:3364;
 width:69pt'>
 <col class=xl24 width=137 style='mso-width-source:userset;mso-width-alt:5010;
 width:103pt'>
 <col class=xl24 width=77 style='mso-width-source:userset;mso-width-alt:2816;
 width:58pt'>
 <col class=xl24 width=137 style='mso-width-source:userset;mso-width-alt:5010;
 width:103pt'>
 <col class=xl24 width=161 span=2 style='mso-width-source:userset;mso-width-alt:
 5888;width:121pt'>
 <tr height=17 style='height:12.75pt'>
  <!--td height=17 class=xl27 width=49 style='height:12.75pt;width:37pt'>BOCD</td>
  <td class=xl27 width=54 style='width:41pt'>YYMM</td>
  <td class=xl27 width=62 style='width:47pt'>MEDICD</td>
  <td class=xl27 width=117 style='width:88pt'>RDR_EXTNAPLC</td>
  <td class=xl27 width=111 style='width:83pt'>RDR_EXTNEMP</td>
  <td class=xl27 width=116 style='width:87pt'>RDR_EXTNSTAF</td>
  <td class=xl27 width=163 style='width:122pt'>RDR_EXTNRDR_MOVM</td>
  <td class=xl27 width=118 style='width:89pt'>RDR_EXTNHDQT</td>
  <td class=xl27 width=108 style='width:81pt'>RDR_EXTNEXG</td>
  <td class=xl27 width=119 style='width:89pt'>RDR_EXTNCNVS</td>
  <td class=xl27 width=107 style='width:80pt'>RDR_EXTNETC</td>
  <td class=xl27 width=117 style='width:88pt'>RDR_EXTNRATE</td>
  <td class=xl27 width=91 style='width:68pt'>SUSPMOVM</td>
  <td class=xl27 width=84 style='width:63pt'>SUSPREFU</td>
  <td class=xl27 width=119 style='width:89pt'>SUSPOTHNWSP</td>
  <td class=xl27 width=73 style='width:55pt'>SUSPETC</td>
  <td class=xl27 width=81 style='width:61pt'>SUSPETC1</td>
  <td class=xl27 width=81 style='width:61pt'>SUSPETC2</td>
  <td class=xl27 width=81 style='width:61pt'>SUSPETC3</td>
  <td class=xl27 width=81 style='width:61pt'>SUSPETC4</td>
  <td class=xl27 width=83 style='width:62pt'>SUSPRATE</td>
  <td class=xl27 width=83 style='width:62pt'>SUSPAPLC</td>
  <td class=xl27 width=78 style='width:59pt'>SUSPEMP</td>
  <td class=xl27 width=82 style='width:62pt'>SUSPSTAF</td>
  <td class=xl27 width=129 style='width:97pt'>SUSPRDR_MOVM</td>
  <td class=xl27 width=84 style='width:63pt'>SUSPHDQT</td>
  <td class=xl27 width=74 style='width:56pt'>SUSPEXG</td>
  <td class=xl27 width=160 style='width:120pt'>SUSPCNVSRDR_EXTN</td>
  <td class=xl27 width=147 style='width:110pt'>SUSPETCRDR_EXTN</td>
  <td class=xl27 width=117 style='width:88pt'>THMMSENDQTY</td>
  <td class=xl27 width=105 style='width:79pt'>THMMVALQTY</td>
  <td class=xl27 width=68 style='width:51pt'>AFTCNT1</td>
  <td class=xl27 width=68 style='width:51pt'>AFTCNT2</td>
  <td class=xl27 width=68 style='width:51pt'>AFTCNT3</td>
  <td class=xl27 width=68 style='width:51pt'>AFTCNT4</td>
  <td class=xl27 width=68 style='width:51pt'>AFTCNT5</td>
  <td class=xl27 width=68 style='width:51pt'>AFTCNT6</td>
  <td class=xl27 width=106 style='width:80pt'>EXCSAFTCNT6</td>
  <td class=xl27 width=63 style='width:47pt'>APTQTY</td>
  <td class=xl27 width=73 style='width:55pt'>VILLAQTY</td>
  <td class=xl27 width=75 style='width:56pt'>HOUSQTY</td>
  <td class=xl27 width=119 style='width:89pt'>OFFI_ROOMQTY</td>
  <td class=xl27 width=75 style='width:56pt'>SHOPQTY</td>
  <td class=xl27 width=63 style='width:47pt'>ETCQTY</td>
  <td class=xl27 width=122 style='width:92pt'>PUB_INFONWSP</td>
  <td class=xl27 width=125 style='width:94pt'>HDQT_DNTNWSP</td>
  <td class=xl27 width=99 style='width:74pt'>BODNTNWSP</td>
  <td class=xl27 width=129 style='width:97pt'>FRC_THRWNWSP</td>
  <td class=xl27 width=117 style='width:88pt'>ETCFREENWSP</td>
  <td class=xl27 width=90 style='width:68pt'>RESVNWSP</td>
  <td class=xl27 width=48 style='width:36pt'>CUPN</td>
  <td class=xl27 width=134 style='width:101pt'>THMMNO_VALQTY</td>
  <td class=xl27 width=77 style='width:58pt'>THMMQTY</td>
  <td class=xl27 width=138 style='width:104pt'>NOWUN_RECPQTY</td>
  <td class=xl27 width=77 style='width:58pt'>MEDAQTY</td>
  <td class=xl27 width=101 style='width:76pt'>RE_FREEQTY</td>
  <td class=xl27 width=73 style='width:55pt'>LOSSQTY</td>
  <td class=xl27 width=77 style='width:58pt'>PPYMQTY</td>
  <td class=xl27 width=122 style='width:92pt'>TEMP_STOPQTY</td>
  <td class=xl27 width=155 style='width:116pt'>NOW_UN_RECP_AMT</td>
  <td class=xl27 width=86 style='width:65pt'>THMM_AMT</td>
  <td class=xl27 width=118 style='width:89pt'>THMMDSCNAMT</td>
  <td class=xl27 width=152 style='width:114pt'>THMMPOST_DLVFEE</td>
  <td class=xl27 width=86 style='width:65pt'>MEDA_AMT</td>
  <td class=xl27 width=102 style='width:77pt'>RE_FREEAMT</td>
  <td class=xl27 width=74 style='width:56pt'>LOSSAMT</td>
  <td class=xl27 width=78 style='width:59pt'>PPYMAMT</td>
  <td class=xl27 width=123 style='width:92pt'>TEMP_STOPAMT</td>
  <td class=xl27 width=89 style='width:67pt'>GIROCLAMT</td>
  <td class=xl27 width=84 style='width:63pt'>VISTCLAMT</td>
  <td class=xl27 width=177 style='width:133pt'>GIROAUTO_SHIFTCLAMT</td>
  <td class=xl27 width=163 style='width:122pt'>DOCARD_SHIFTCLAMT</td>
  <td class=xl27 width=173 style='width:130pt'>GNRCARD_SHIFTCLAMT</td>
  <td class=xl27 width=118 style='width:89pt'>ONLSETLCLAMT</td>
  <td class=xl27 width=81 style='width:61pt'>ETCCLAMT</td>
  <td class=xl27 width=124 style='width:93pt'>UN_RECP_REPM</td>
  <td class=xl27 width=90 style='width:68pt'>NEW_REPM</td>
  <td class=xl27 width=86 style='width:65pt'>PRE_REPM</td>
  <td class=xl27 width=131 style='width:98pt'>AREALEAFCLAMT</td>
  <td class=xl27 width=174 style='width:131pt'>TEAMPREISLEAFCLAMT</td>
  <td class=xl27 width=92 style='width:69pt'>INCMGPERS</td>
  <td class=xl27 width=137 style='width:103pt'>INCMGDT</td>
  <td class=xl27 width=77 style='width:58pt'>CHGPERS</td>
  <td class=xl27 width=137 style='width:103pt'>CHGDT</td>
  <td class=xl27 width=161 style='width:121pt'>THMMVAL_ADSC_QTY</td>
  <td class=xl27 width=161 style='width:121pt'>THMMVAL_NDSC_QTY</td-->
  <td height=17 class=xl27 width=92 style='width:69pt'>부서명</td>
  <td class=xl27 width=92 style='width:69pt'>파트명</td>
  <td class=xl27 width=92 style='width:69pt'>지역명</td>
  <td class=xl27 width=92 style='width:69pt'>지국명</td>
  <td class=xl27 width=92 style='height:12.75pt;width:69pt'>지국지사코드</td>
  <td class=xl27 width=54 style='width:41pt'>년월</td>
  <td class=xl27 width=64 style='width:48pt'>매체코드</td>
  <td class=xl27 width=64 style='width:48pt'>확장신청</td>
  <td class=xl27 width=64 style='width:48pt'>확장직원</td>
  <td class=xl27 width=64 style='width:48pt'>확장요원</td>
  <td class=xl27 width=64 style='width:48pt'>확장이전</td>
  <td class=xl27 width=64 style='width:48pt'>확장본사</td>
  <td class=xl27 width=78 style='width:59pt'>확장품앗이</td>
  <td class=xl27 width=64 style='width:48pt'>확장권유</td>
  <td class=xl27 width=64 style='width:48pt'>확장기타</td>
  <td class=xl27 width=51 style='width:38pt'>확장율</td>
  <td class=xl27 width=64 style='width:48pt'>중지이사</td>
  <td class=xl27 width=64 style='width:48pt'>중지거절</td>
  <td class=xl27 width=64 style='width:48pt'>중지타지</td>
  <td class=xl27 width=64 style='width:48pt'>중지기타</td>
  <td class=xl27 width=71 style='width:53pt'>중지기타1</td>
  <td class=xl27 width=71 style='width:53pt'>중지기타2</td>
  <td class=xl27 width=71 style='width:53pt'>중지기타3</td>
  <td class=xl27 width=71 style='width:53pt'>중지기타4</td>
  <td class=xl27 width=51 style='width:38pt'>중지율</td>
  <td class=xl27 width=64 style='width:48pt'>중지신청</td>
  <td class=xl27 width=64 style='width:48pt'>중지직원</td>
  <td class=xl27 width=64 style='width:48pt'>중지요원</td>
  <td class=xl27 width=64 style='width:48pt'>중지이전</td>
  <td class=xl27 width=64 style='width:48pt'>중지본사</td>
  <td class=xl27 width=78 style='width:59pt'>중지품앗이</td>
  <td class=xl27 width=92 style='width:69pt'>중지권유확장</td>
  <td class=xl27 width=92 style='width:69pt'>중지기타확장</td>
  <td class=xl27 width=92 style='width:69pt'>당월발송부수</td>
  <td class=xl27 width=92 style='width:69pt'>당월유가부수</td>
  <td class=xl27 width=45 style='width:34pt'>후수1</td>
  <td class=xl27 width=45 style='width:34pt'>후수2</td>
  <td class=xl27 width=45 style='width:34pt'>후수3</td>
  <td class=xl27 width=45 style='width:34pt'>후수4</td>
  <td class=xl27 width=45 style='width:34pt'>후수5</td>
  <td class=xl27 width=45 style='width:34pt'>후수6</td>
  <td class=xl27 width=71 style='width:53pt'>후수6초과</td>
  <td class=xl27 width=78 style='width:59pt'>아파트부수</td>
  <td class=xl27 width=64 style='width:48pt'>빌라부수</td>
  <td class=xl27 width=64 style='width:48pt'>주택부수</td>
  <td class=xl27 width=78 style='width:59pt'>사무실부수</td>
  <td class=xl27 width=64 style='width:48pt'>상가부수</td>
  <td class=xl27 width=64 style='width:48pt'>기타부수</td>
  <td class=xl27 width=51 style='width:38pt'>홍보지</td>
  <td class=xl27 width=78 style='width:59pt'>본사기증지</td>
  <td class=xl27 width=78 style='width:59pt'>지국기증지</td>
  <td class=xl27 width=51 style='width:38pt'>강투지</td>
  <td class=xl27 width=78 style='width:59pt'>기타무료지</td>
  <td class=xl27 width=51 style='width:38pt'>예비지</td>
  <td class=xl27 width=38 style='width:29pt'>쿠폰</td>
  <td class=xl27 width=92 style='width:69pt'>당월무가부수</td>
  <td class=xl27 width=64 style='width:48pt'>당월부수</td>
  <td class=xl27 width=78 style='width:59pt'>현미수부수</td>
  <td class=xl27 width=64 style='width:48pt'>조정부수</td>
  <td class=xl27 width=64 style='width:48pt'>재무부수</td>
  <td class=xl27 width=64 style='width:48pt'>결손부수</td>
  <td class=xl27 width=64 style='width:48pt'>선불부수</td>
  <td class=xl27 width=64 style='width:48pt'>휴독부수</td>
  <td class=xl27 width=69 style='width:52pt'>현미수금</td>
  <td class=xl27 width=77 style='width:58pt'>당월금액</td>
  <td class=xl27 width=92 style='width:69pt'>당월할인금액</td>
  <td class=xl27 width=78 style='width:59pt'>당월우송료</td>
  <td class=xl27 width=77 style='width:58pt'>조정액</td>
  <td class=xl27 width=64 style='width:48pt'>재무금액</td>
  <td class=xl27 width=64 style='width:48pt'>결손금액</td>
  <td class=xl27 width=64 style='width:48pt'>선불금액</td>
  <td class=xl27 width=64 style='width:48pt'>휴독금액</td>
  <td class=xl27 width=78 style='width:59pt'>지로수금액</td>
  <td class=xl27 width=78 style='width:59pt'>방문수금액</td>
  <td class=xl27 width=136 style='width:102pt'>지로자동이체수금액</td>
  <td class=xl27 width=136 style='width:102pt'>신한카드이체수금액</td>
  <td class=xl27 width=136 style='width:102pt'>일반카드이체수금액</td>
  <td class=xl27 width=122 style='width:92pt'>온라인결제수금액</td>
  <td class=xl27 width=78 style='width:59pt'>기타수금액</td>
  <td class=xl27 width=69 style='width:52pt'>미수입금</td>
  <td class=xl27 width=77 style='width:58pt'>신수입금</td>
  <td class=xl27 width=58 style='width:44pt'>선입금</td>
  <td class=xl27 width=107 style='width:80pt'>지역전단수금액</td>
  <td class=xl27 width=120 style='width:90pt'>조선IS전단수금액</td>
  <td class=xl27 width=61 style='width:46pt'>입력자</td>
  <td class=xl27 width=137 style='width:103pt'>입력일자</td>
  <td class=xl27 width=61 style='width:46pt'>변경자</td>
  <td class=xl27 width=137 style='width:103pt'>변경일자</td>
  <td class=xl27 width=122 style='width:92pt'>자동이체할인부수</td>
  <td class=xl27 width=92 style='width:69pt'>일반할인부수</td>
 </tr>
<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_P_BOSENDPCONDCURCOMMLISTRecord curcommlistRec = (SS_P_BOSENDPCONDCURCOMMLISTRecord)ds.curcommlist.get(i);
%>
 <tr height=17 style='height:12.75pt'>
  <td height=17 class=xl27 				><%= curcommlistRec.deptnm%>         </td>
  <td height=17 class=xl27 				><%= curcommlistRec.partnm%>         </td>
  <td height=17 class=xl27 				><%= curcommlistRec.areanm%>         </td>
  <td height=17 class=xl27 				><%= curcommlistRec.bonm%>         </td>
  <td height=17 class=xl27 				><%= curcommlistRec.bocd%>         </td>
  <td class=xl26						><%= curcommlistRec.yymm%>         </td>
  <td class=xl26						><%= curcommlistRec.medicd%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.rdr_extnaplc%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.rdr_extnemp%>        </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.rdr_extnstaf%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.rdr_extnrdr_movm%>   </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.rdr_extnhdqt%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.rdr_extnexg%>        </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.rdr_extncnvs%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.rdr_extnetc%>        </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.rdr_extnrate%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.suspmovm%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.susprefu%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.suspothnwsp%>        </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.suspetc%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.suspetc1%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.suspetc2%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.suspetc3%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.suspetc4%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.susprate%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.suspaplc%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.suspemp%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.suspstaf%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.susprdr_movm%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.susphdqt%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.suspexg%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.suspcnvsrdr_extn%>   </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.suspetcrdr_extn%>    </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.thmmsendqty%>        </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.thmmvalqty%>         </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.aftcnt1%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.aftcnt2%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.aftcnt3%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.aftcnt4%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.aftcnt5%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.aftcnt6%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.excsaftcnt6%>        </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.aptqty%>             </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.villaqty%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.housqty%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.offi_roomqty%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.shopqty%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.etcqty%>             </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.pub_infonwsp%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.hdqt_dntnwsp%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.bodntnwsp%>          </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.frc_thrwnwsp%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.etcfreenwsp%>        </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.resvnwsp%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.cupn%>               </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.thmmno_valqty%>      </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.thmmqty%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.nowun_recpqty%>      </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.medaqty%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.re_freeqty%>         </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.lossqty%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.ppymqty%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.temp_stopqty%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.now_un_recp_amt%>    </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.thmm_amt%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.thmmdscnamt%>        </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.thmmpost_dlvfee%>    </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.meda_amt%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.re_freeamt%>         </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.lossamt%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.ppymamt%>            </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.temp_stopamt%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.giroclamt%>          </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.vistclamt%>          </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.giroauto_shiftclamt%></td>
  <td class=xl24 align=right x:num><%= curcommlistRec.docard_shiftclamt%>  </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.gnrcard_shiftclamt%> </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.onlsetlclamt%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.etcclamt%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.un_recp_repm%>       </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.new_repm%>           </td>
  <td class=xl24 align=right x:num><%= curcommlistRec.pre_repm%>           </td>
  <td class=xl26				><%= curcommlistRec.arealeafclamt%>        </td>
  <td class=xl26				><%= curcommlistRec.teampreisleafclamt%>   </td>
  <td class=xl26				><%= curcommlistRec.incmgpers%>            </td>
  <td class=xl25 align=right x:num><%= curcommlistRec.incmgdt%>            </td>
  <td class=xl26				><%= curcommlistRec.chgpers%>              </td>
  <td class=xl25 align=right x:num><%= curcommlistRec.chgdt%>              </td>
  <td class=xl26				><%= curcommlistRec.thmmval_adsc_qty%>     </td>
  <td class=xl26				><%= curcommlistRec.thmmval_ndsc_qty%>     </td>
 </tr>
<%}%>

<![if supportMisalignedColumns]>
 <tr height=0 style='display:none'>
  <td width=62 style='width:47pt'></td>
  <td width=62 style='width:47pt'></td>
  <td width=62 style='width:47pt'></td>
  <td width=49 style='width:37pt'></td>
  <td width=54 style='width:41pt'></td>
  <td width=62 style='width:47pt'></td>
  <td width=117 style='width:88pt'></td>
  <td width=111 style='width:83pt'></td>
  <td width=116 style='width:87pt'></td>
  <td width=163 style='width:122pt'></td>
  <td width=118 style='width:89pt'></td>
  <td width=108 style='width:81pt'></td>
  <td width=119 style='width:89pt'></td>
  <td width=107 style='width:80pt'></td>
  <td width=117 style='width:88pt'></td>
  <td width=91 style='width:68pt'></td>
  <td width=84 style='width:63pt'></td>
  <td width=119 style='width:89pt'></td>
  <td width=73 style='width:55pt'></td>
  <td width=81 style='width:61pt'></td>
  <td width=81 style='width:61pt'></td>
  <td width=81 style='width:61pt'></td>
  <td width=81 style='width:61pt'></td>
  <td width=83 style='width:62pt'></td>
  <td width=83 style='width:62pt'></td>
  <td width=78 style='width:59pt'></td>
  <td width=82 style='width:62pt'></td>
  <td width=129 style='width:97pt'></td>
  <td width=84 style='width:63pt'></td>
  <td width=74 style='width:56pt'></td>
  <td width=160 style='width:120pt'></td>
  <td width=147 style='width:110pt'></td>
  <td width=117 style='width:88pt'></td>
  <td width=105 style='width:79pt'></td>
  <td width=68 style='width:51pt'></td>
  <td width=68 style='width:51pt'></td>
  <td width=68 style='width:51pt'></td>
  <td width=68 style='width:51pt'></td>
  <td width=68 style='width:51pt'></td>
  <td width=68 style='width:51pt'></td>
  <td width=106 style='width:80pt'></td>
  <td width=63 style='width:47pt'></td>
  <td width=73 style='width:55pt'></td>
  <td width=75 style='width:56pt'></td>
  <td width=119 style='width:89pt'></td>
  <td width=75 style='width:56pt'></td>
  <td width=63 style='width:47pt'></td>
  <td width=122 style='width:92pt'></td>
  <td width=125 style='width:94pt'></td>
  <td width=99 style='width:74pt'></td>
  <td width=129 style='width:97pt'></td>
  <td width=117 style='width:88pt'></td>
  <td width=90 style='width:68pt'></td>
  <td width=48 style='width:36pt'></td>
  <td width=134 style='width:101pt'></td>
  <td width=77 style='width:58pt'></td>
  <td width=138 style='width:104pt'></td>
  <td width=77 style='width:58pt'></td>
  <td width=101 style='width:76pt'></td>
  <td width=73 style='width:55pt'></td>
  <td width=77 style='width:58pt'></td>
  <td width=122 style='width:92pt'></td>
  <td width=155 style='width:116pt'></td>
  <td width=86 style='width:65pt'></td>
  <td width=118 style='width:89pt'></td>
  <td width=152 style='width:114pt'></td>
  <td width=86 style='width:65pt'></td>
  <td width=102 style='width:77pt'></td>
  <td width=74 style='width:56pt'></td>
  <td width=78 style='width:59pt'></td>
  <td width=123 style='width:92pt'></td>
  <td width=89 style='width:67pt'></td>
  <td width=84 style='width:63pt'></td>
  <td width=177 style='width:133pt'></td>
  <td width=163 style='width:122pt'></td>
  <td width=173 style='width:130pt'></td>
  <td width=118 style='width:89pt'></td>
  <td width=81 style='width:61pt'></td>
  <td width=124 style='width:93pt'></td>
  <td width=90 style='width:68pt'></td>
  <td width=86 style='width:65pt'></td>
  <td width=131 style='width:98pt'></td>
  <td width=174 style='width:131pt'></td>
  <td width=92 style='width:69pt'></td>
  <td width=137 style='width:103pt'></td>
  <td width=77 style='width:58pt'></td>
  <td width=137 style='width:103pt'></td>
  <td width=161 style='width:121pt'></td>
  <td width=161 style='width:121pt'></td>
 </tr>
 <![endif]>
</table>

</div>


<!----------------------------->
<!--Excel의 웹 페이지 마법사로 게시해서 나온 결과의 끝-->
<!----------------------------->
</body>

</html>
