<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1360_p.jsp
* 기능 : 확장현황-사원확장-송금-목록 프린트
* 작성일자 : 2004-04-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_RDR_EXTN_EMPRMTT_PRINTDataSet ds = (SS_L_RDR_EXTN_EMPRMTT_PRINTDataSet)request.getAttribute("ds");
    String campnm = "";
    if(ds.curcommlist.size() > 0){
    	campnm = ((SS_L_RDR_EXTN_EMPRMTT_PRINTCURCOMMLISTRecord)ds.curcommlist.get(0)).campnm;
    }
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
	font-size:13.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;}
.xl32
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
.xl33
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
.xl34
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
.xl35
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
.xl36
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:center;
	border:.5pt solid windowtext;}
.xl37
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0_ ";
	text-align:left;
	vertical-align:middle;
	border:.5pt solid windowtext;
	padding-left:18px;
	mso-char-indent-count:1;}
.xl38
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0_ ";
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl39
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	text-align:left;
	border:.5pt solid windowtext;
	padding-left:18px;
	mso-char-indent-count:1;}
.xl40
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0_ ";
	text-align:right;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl41
	{mso-style-parent:style0;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	border:.5pt solid windowtext;}
.xl42
	{mso-style-parent:style17;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"_-* \#\,\#\#0_-\;\\-* \#\,\#\#0_-\;_-* \0022-\0022_-\;_-\@_-";
	border:.5pt solid windowtext;
	background:yellow;
	mso-pattern:auto none;}
.xl43
	{mso-style-parent:style0;
	font-size:14.0pt;
	font-weight:700;
	font-family:굴림체, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0_ ";
	text-align:right;
	vertical-align:middle;
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
       <x:ActiveRow>15</x:ActiveRow>
       <x:ActiveCol>3</x:ActiveCol>
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
</xml><![endif]--></head>

<body link=blue vlink=purple>

<table x:str border=0 cellpadding=0 cellspacing=0 width=1026 style='border-collapse:
 collapse;table-layout:fixed;width:771pt'>
 <col class=xl25 width=60 style='mso-width-source:userset;mso-width-alt:1706;
 width:45pt'>
 <col class=xl25 width=169 style='mso-width-source:userset;mso-width-alt:4807;
 width:127pt'>
 <col class=xl29 width=90 style='mso-width-source:userset;mso-width-alt:2560;
 width:68pt'>
 <col class=xl29 width=94 style='mso-width-source:userset;mso-width-alt:2673;
 width:71pt'>
 <col class=xl25 width=177 style='mso-width-source:userset;mso-width-alt:5034;
 width:133pt'>
 <col class=xl25 width=132 style='mso-width-source:userset;mso-width-alt:3754;
 width:99pt'>
 <col class=xl25 width=144 style='mso-width-source:userset;mso-width-alt:4096;
 width:108pt'>
 <col class=xl25 width=80 span=2 style='width:60pt'>
 <tr height=30 style='height:22.5pt'>
  <td colspan=7 height=30 class=xl24 width=866 style='height:22.5pt;width:651pt'>송금  의뢰서</td>
  <td class=xl24 width=80 style='width:60pt'></td>
  <td class=xl24 width=80 style='width:60pt'></td>
 </tr>
 <tr height=19 style='height:14.25pt'>
  <td height=19 colspan=9 class=xl26 style='height:14.25pt;mso-ignore:colspan'></td>
 </tr>
 <tr height=23 style='height:17.25pt'>
  <td colspan=4 height=23 class=xl27 style='height:17.25pt'>금액 :<span style="mso-spacerun: yes">&nbsp;&nbsp;&nbsp; </span><%= Util.comma(ds.getTotalalonamt())%></td>
  <td colspan=2 class=xl25 style='mso-ignore:colspan'></td>
  <td class=xl28></td>
  <td class=xl29></td>
  <td class=xl25></td>
 </tr>
 <tr height=18 style='height:13.5pt'>
  <td height=18 colspan=2 class=xl25 style='height:13.5pt;mso-ignore:colspan'></td>
  <td colspan=2 class=xl29 style='mso-ignore:colspan'></td>
  <td colspan=2 class=xl25 style='mso-ignore:colspan'></td>
  <td class=xl28></td>
  <td class=xl29></td>
  <td class=xl25></td>
 </tr>
 <tr height=22 style='height:16.5pt'>
  <td colspan=7 height=22 class=xl30 style='height:16.5pt'><span
  style="mso-spacerun: yes">&nbsp; </span>내용 : <%= campnm %> 월분송금(사원확장)</td>
  <td class=xl29></td>
  <td class=xl25></td>
 </tr>
 <tr height=22 style='height:16.5pt'>
  <td height=22 colspan=2 class=xl30 style='height:16.5pt;mso-ignore:colspan'></td>
  <td colspan=2 class=xl31 style='mso-ignore:colspan'></td>
  <td colspan=2 class=xl30 style='mso-ignore:colspan'></td>
  <td class=xl28></td>
  <td class=xl29></td>
  <td class=xl25></td>
 </tr>
 <tr height=26 style='mso-height-source:userset;height:20.1pt'>
  <td height=26 class=xl32 style='height:20.1pt'>번호</td>
  <td class=xl33 style='border-left:none'>부서명</td>
  <td class=xl32 style='border-left:none'>이름</td>
  <td class=xl34 style='border-left:none'>은행명</td>
  <td class=xl32 style='border-left:none'>계좌번호</td>
  <td class=xl35 style='border-left:none' x:str="금액"><span style="mso-spacerun:yes">&nbsp;</span>금액 </td>
  <td class=xl32 style='border-left:none'>비고</td>
  <td colspan=2 class=xl25 style='mso-ignore:colspan'></td>
 </tr>
 
<!--사원확장 수당 출력 시작 ---------------------------------------------------------------------------->      
<%for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_RDR_EXTN_EMPRMTT_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_EMPRMTT_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%> 
 <tr height=26 style='mso-height-source:userset;height:20.1pt'>
  <td height=26 class=xl36 style='height:20.1pt;border-top:none'><%= i+1%></td>
  <td class=xl37 style='border-top:none;border-left:none'><%= curcommlistRec.empdeptnm%>&nbsp;</td>
  <td class=xl38 style='border-top:none;border-left:none'><%= curcommlistRec.empnm%>&nbsp;</td>
  <td class=xl36 style='border-top:none;border-left:none'><%= curcommlistRec.banknm%>&nbsp;</td>
  <td class=xl39 style='border-top:none;border-left:none'><%= curcommlistRec.acctno%>&nbsp;<span style="mso-spacerun:yes">&nbsp;&nbsp;</span></td>
  <td class=xl40 align=right style='border-top:none;border-left:none'><%= Util.comma(curcommlistRec.alonamt)%>&nbsp;</td>
  <td class=xl41 style='border-top:none;border-left:none'>　</td>
  <td colspan=2 class=xl25 style='mso-ignore:colspan'></td>
 </tr>
<%}%>
<!--사원확장 수당 출력 끝 ---------------------------------------------------------------------------->   

 <tr height=26 style='mso-height-source:userset;height:20.1pt'>
  <td height=26 class=xl36 style='height:20.1pt;border-top:none'>합계</td>
  <td class=xl41 style='border-top:none;border-left:none'>　</td>
  <td class=xl36 style='border-top:none;border-left:none'>　</td>
  <td class=xl36 style='border-top:none;border-left:none'>　</td>
  <td class=xl39 style='border-top:none;border-left:none'>　</td>
  <td class=xl43 align=right style='border-top:none;border-left:none'><%= Util.comma(ds.getTotalalonamt())%>&nbsp;</td>
  <td class=xl41 style='border-top:none;border-left:none'>　</td>
  <td colspan=2 class=xl25 style='mso-ignore:colspan'></td>
</tr>

   
 <tr height=35 style='mso-height-source:userset;height:26.25pt'>
  <td height=35 colspan=2 class=xl25 style='height:26.25pt;mso-ignore:colspan'></td>
  <td colspan=2 class=xl29 style='mso-ignore:colspan'></td>
  <td colspan=5 class=xl25 style='mso-ignore:colspan'></td>
 </tr>
 <![if supportMisalignedColumns]>
 <tr height=0 style='display:none'>
  <td width=60 style='width:45pt'></td>
  <td width=169 style='width:127pt'></td>
  <td width=90 style='width:68pt'></td>
  <td width=94 style='width:71pt'></td>
  <td width=177 style='width:133pt'></td>
  <td width=132 style='width:99pt'></td>
  <td width=144 style='width:108pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
 </tr>
 <![endif]>
</table>

</body>

</html>

