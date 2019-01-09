<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1180_p.jsp
* 기능 : 확장현황-품앗이확장-송금-목록 프린트
* 작성일자 : 2004-04-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%--
	기준일자(년월)은 request로부터 구한다.
--%>
<%
    SS_L_RDR_EXTN_EXGCOST_PRINTDataSet ds = (SS_L_RDR_EXTN_EXGCOST_PRINTDataSet)request.getAttribute("ds");
    String yyyymm = request.getParameter("basidt");
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
.style17
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
	font-size:18.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;}
.xl25
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;}
.xl26
	{mso-style-parent:style0;
	font-size:12.0pt;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;}
.xl27
	{mso-style-parent:style0;
	font-size:13.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:left;
	border-top:none;
	border-right:none;
	border-bottom:1.0pt solid windowtext;
	border-left:none;
	padding-left:18px;
	mso-char-indent-count:1;}
.xl28
	{mso-style-parent:style17;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"_-* \#\,\#\#0_-\;\\-* \#\,\#\#0_-\;_-* \0022-\0022_-\;_-\@_-";}
.xl29
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;}
.xl30
	{mso-style-parent:style0;
	font-size:13.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:left;}
.xl31
	{mso-style-parent:style0;
	font-size:12.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl32
	{mso-style-parent:style0;
	font-size:12.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0_ ";
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;
	mso-protection:unlocked visible;}
.xl33
	{mso-style-parent:style0;
	font-size:12.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\[ENG\]mmm\/yy";
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl34
	{mso-style-parent:style17;
	font-size:12.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"_-* \#\,\#\#0_-\;\\-* \#\,\#\#0_-\;_-* \0022-\0022_-\;_-\@_-";
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl35
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0_ ";
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl36
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0_ ";
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl37
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	border:.5pt solid windowtext;}
.xl38
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl39
	{mso-style-parent:style0;
	font-size:14.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0_ ";
	border:.5pt solid windowtext;
	background:yellow;
	mso-pattern:auto none;}
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
     <x:Selected/>
     <x:Panes>
      <x:Pane>
       <x:Number>3</x:Number>
       <x:RangeSelection>A1:J1</x:RangeSelection>
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
  <x:WindowHeight>12150</x:WindowHeight>
  <x:WindowWidth>18945</x:WindowWidth>
  <x:WindowTopX>120</x:WindowTopX>
  <x:WindowTopY>15</x:WindowTopY>
  <x:ProtectStructure>False</x:ProtectStructure>
  <x:ProtectWindows>False</x:ProtectWindows>
 </x:ExcelWorkbook>
</xml><![endif]-->
</head>

<body link=blue vlink=purple>

<table x:str border=0 cellpadding=0 cellspacing=0 width=1092 style='border-collapse:
 collapse;table-layout:fixed;width:820pt'>
 <col class=xl25 width=39 style='mso-width-source:userset;mso-width-alt:1109;
 width:29pt'>
 <col class=xl25 width=68 style='mso-width-source:userset;mso-width-alt:1934;
 width:51pt'>
 <col class=xl25 width=48 style='mso-width-source:userset;mso-width-alt:1365;
 width:36pt'>
 <col class=xl25 width=65 style='mso-width-source:userset;mso-width-alt:1848;
 width:49pt'>
 <col class=xl25 width=93 style='mso-width-source:userset;mso-width-alt:2645;
 width:70pt'>
 <col class=xl25 width=161 style='mso-width-source:userset;mso-width-alt:4579;
 width:121pt'>
 <col class=xl25 width=57 style='mso-width-source:userset;mso-width-alt:1621;
 width:43pt'>
 <col class=xl25 width=173 style='mso-width-source:userset;mso-width-alt:4920;
 width:130pt'>
 <col class=xl25 width=148 style='mso-width-source:userset;mso-width-alt:4209;
 width:111pt'>
 <col class=xl25 width=80 span=3 style='width:60pt'>
 <tr height=30 style='height:22.5pt'>
  <td colspan=10 height=30 class=xl24 width=932 style='height:22.5pt;
  width:700pt'>송금 의뢰서</td>
  <td class=xl24 width=80 style='width:60pt'></td>
  <td class=xl24 width=80 style='width:60pt'></td>
 </tr>
 <tr height=19 style='height:14.25pt'>
  <td height=19 colspan=12 class=xl26 style='height:14.25pt;mso-ignore:colspan'></td>
 </tr>
 <tr height=23 style='height:17.25pt'>
  <td colspan=7 height=23 class=xl27 style='height:17.25pt'>금액 :<span style="mso-spacerun: yes">&nbsp;&nbsp;&nbsp; </span><%= Util.comma(ds.getTotalcostamt())%></td>
  <td colspan=2 class=xl25 style='mso-ignore:colspan'></td>
  <td class=xl28></td>
  <td class=xl29></td>
  <td class=xl25></td>
 </tr>
 <tr height=18 style='height:13.5pt'>
  <td height=18 colspan=9 class=xl25 style='height:13.5pt;mso-ignore:colspan'></td>
  <td class=xl28></td>
  <td class=xl29></td>
  <td class=xl25></td>
 </tr>
 <tr height=22 style='height:16.5pt'>
  <td colspan=10 height=22 class=xl30 style='height:16.5pt'><span
  style="mso-spacerun: yes">&nbsp; </span>내용 : <%= Util.convertMonth(yyyymm,"년 ")%> 월분송금(품앗이)</td>
  <td class=xl29></td>
  <td class=xl25></td>
 </tr>
 <tr height=22 style='height:16.5pt'>
  <td height=22 colspan=9 class=xl30 style='height:16.5pt;mso-ignore:colspan'></td>
  <td class=xl28></td>
  <td class=xl29></td>
  <td class=xl25></td>
 </tr>
 <tr height=26 style='mso-height-source:userset;height:20.1pt'>
  <td height=26 class=xl31 style='height:20.1pt'>번호</td>
  <td class=xl31 style='border-left:none'>부서</td>
  <td class=xl31 style='border-left:none'>지역</td>
  <td class=xl32 style='border-left:none'>지국명</td>
  <td class=xl31 style='border-left:none'>지국장</td>
  <td class=xl31 style='border-left:none'>주민등록번호</td>
  <td class=xl33 style='border-left:none'>은행명</td>
  <td class=xl31 style='border-left:none'>계좌번호</td>
  <td class=xl34 style='border-left:none' x:str="금액"><span style="mso-spacerun:
  yes">&nbsp;</span>금액 </td>
  <td class=xl31 style='border-left:none'>비고</td>
  <td colspan=2 class=xl25 style='mso-ignore:colspan'></td>
 </tr>

 <!--품앗이확장 수당 출력 시작 ---------------------------------------------------------------------------->
<%for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_RDR_EXTN_EXGCOST_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EXGCOST_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%> 
 <tr height=26 style='mso-height-source:userset;height:20.1pt'>
  <td height=26 class=xl38 style='height:20.1pt;border-top:none' ><%= i+1%></td>
  <td class=xl38 style='border-top:none;border-left:none'><%= curcommlistRec.deptnm%>&nbsp;</td>
  <td class=xl38 style='border-top:none;border-left:none'><%= curcommlistRec.areanm%>&nbsp;</td>
  <td class=xl35 style='border-top:none;border-left:none'><%= curcommlistRec.bonm%>&nbsp;</td>
  <td class=xl38 style='border-top:none;border-left:none'><%= curcommlistRec.bo_headnm%>&nbsp;</td>
  <td class=xl38 style='border-top:none;border-left:none'><%= Util.FormatJumin(curcommlistRec.prn)%>&nbsp;</td>
  <td class=xl38 style='border-top:none;border-left:none'><%= curcommlistRec.banknm%>&nbsp;</td>
  <td class=xl38 style='border-top:none;border-left:none'><%= curcommlistRec.acctno%>&nbsp;</td>
  <td class=xl36 align=right style='border-top:none;border-left:none'><%= Util.comma(curcommlistRec.costamt)%>&nbsp;</td>
  <td class=xl37 style='border-top:none;border-left:none'>　</td>
  <td colspan=2 class=xl25 style='mso-ignore:colspan'></td>
 </tr>
<%}%>
 <!--품앗이확장 수당 출력 끝 ---------------------------------------------------------------------------->

 <tr height=26 style='mso-height-source:userset;height:20.1pt'>
  <td height=26 class=xl38 style='height:20.1pt;border-top:none'>합계</td>
  <td class=xl38 style='border-top:none;border-left:none'>　</td>
  <td class=xl38 style='border-top:none;border-left:none'>　</td>
  <td class=xl38 style='border-top:none;border-left:none'>　</td>
  <td class=xl38 style='border-top:none;border-left:none'>　</td>
  <td class=xl38 style='border-top:none;border-left:none'>　</td>
  <td class=xl38 style='border-top:none;border-left:none'>　</td>
  <td class=xl38 style='border-top:none;border-left:none'>　</td>
  <td class=xl39 align=right style='border-top:none;border-left:none'><%= Util.comma(ds.getTotalcostamt())%>&nbsp;</td>
  <td class=xl37 style='border-top:none;border-left:none'>　</td>
  <td colspan=2 class=xl25 style='mso-ignore:colspan'></td>
 </tr>
 <![if supportMisalignedColumns]>
 <tr height=0 style='display:none'>
  <td width=60 style='width:45pt'></td>
  <td width=169 style='width:127pt'></td>
  <td width=102 style='width:77pt'></td>
  <td width=100 style='width:75pt'></td>
  <td width=226 style='width:170pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=238 style='width:179pt'></td>
 </tr>
 <![endif]>
</table>

</body>

</html>