<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_move_1320_p.jsp
* ��� : �̻絶��-�۱�-��� �μ�
* �ۼ����� : 2004-04-10
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%--
	��������(���)�� request�κ��� ���Ѵ�.
--%>
<%
    SS_L_MOVM_RDR_RMTT_PRINTDataSet ds = (SS_L_MOVM_RDR_RMTT_PRINTDataSet)request.getAttribute("ds");
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
.font9
	{color:windowtext;
	font-size:9.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:����, monospace;
	mso-font-charset:129;}
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
	mso-style-name:"��ǥ \[0\]";
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
	font-family:����;
	mso-generic-font-family:auto;
	mso-font-charset:129;
	border:none;
	mso-protection:locked visible;
	mso-style-name:ǥ��;
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
	font-family:����;
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
	font-family:����ü, monospace;
	mso-font-charset:129;
	text-align:left;
	vertical-align:middle;}
.xl25
	{mso-style-parent:style0;
	font-weight:700;
	font-family:����ü, monospace;
	mso-font-charset:129;
	text-align:left;
	vertical-align:middle;}
.xl26
	{mso-style-parent:style0;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"0_ ";
	text-align:left;
	vertical-align:middle;}
.xl27
	{mso-style-parent:style0;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0_ ";
	text-align:right;
	vertical-align:middle;}
.xl28
	{mso-style-parent:style0;
	font-size:10.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	text-align:left;
	vertical-align:middle;}
.xl29
	{mso-style-parent:style0;
	font-family:����ü, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border:.5pt hairline windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl30
	{mso-style-parent:style0;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"0_ ";
	text-align:center;
	vertical-align:middle;
	border:.5pt hairline windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl31
	{mso-style-parent:style0;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0_ ";
	text-align:center;
	vertical-align:middle;
	border:.5pt hairline windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl32
	{mso-style-parent:style0;
	font-size:10.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border:.5pt hairline windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl33
	{mso-style-parent:style0;
	font-family:����ü, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border:.5pt hairline windowtext;}
.xl34
	{mso-style-parent:style17;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"0_ ";
	text-align:center;
	vertical-align:middle;
	border:.5pt hairline windowtext;}
.xl35
	{mso-style-parent:style0;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0_ ";
	text-align:right;
	vertical-align:middle;
	border:.5pt hairline windowtext;}
.xl36
	{mso-style-parent:style17;
	font-size:10.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"_-* \#\,\#\#0_-\;\\-* \#\,\#\#0_-\;_-* \0022-\0022_-\;_-\@_-";
	text-align:left;
	vertical-align:middle;
	border:.5pt hairline windowtext;}
.xl37
	{mso-style-parent:style0;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0_ ";
	vertical-align:middle;
	border:.5pt hairline windowtext;}
.xl38
	{mso-style-parent:style0;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"0_ ";
	text-align:center;
	vertical-align:middle;
	border:.5pt hairline windowtext;}
.xl39
	{mso-style-parent:style17;
	font-size:10.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0_ ";
	text-align:left;
	vertical-align:middle;
	border:.5pt hairline windowtext;}
.xl40
	{mso-style-parent:style0;
	font-size:10.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"0\.0%";
	text-align:left;
	vertical-align:middle;
	border:.5pt hairline windowtext;}
.xl41
	{mso-style-parent:style0;
	font-family:����ü, monospace;
	mso-font-charset:129;
	text-align:left;
	vertical-align:middle;
	border:.5pt hairline windowtext;}
.xl42
	{mso-style-parent:style0;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"0\.0%";
	text-align:left;
	vertical-align:middle;
	border:.5pt hairline windowtext;}
.xl43
	{mso-style-parent:style0;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"0_ ";
	text-align:left;
	vertical-align:middle;
	border:.5pt hairline windowtext;}
.xl44
	{mso-style-parent:style0;
	font-size:10.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0";
	text-align:left;
	vertical-align:middle;
	border:.5pt hairline windowtext;}
.xl45
	{mso-style-parent:style0;
	font-size:10.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0";
	text-align:left;
	vertical-align:middle;}
.xl46
	{mso-style-parent:style0;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0";
	text-align:left;
	vertical-align:middle;}
ruby
	{ruby-align:left;}
rt
	{color:windowtext;
	font-size:8.0pt;
	font-weight:400;
	font-style:normal;
	text-decoration:none;
	font-family:����, monospace;
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
     <x:Unsynced/>
     <x:Selected/>
     <x:Panes>
      <x:Pane>
       <x:Number>3</x:Number>
       <x:RangeSelection>1:65536</x:RangeSelection>
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

<body link=blue vlink=purple class=xl28>

<table x:str border=0 cellpadding=0 cellspacing=0 width=604 style='border-collapse:
 collapse;table-layout:fixed;width:453pt'>
 <col class=xl24 width=81 style='mso-width-source:userset;mso-width-alt:2304;
 width:61pt'>
 <col class=xl24 width=79 style='mso-width-source:userset;mso-width-alt:2247;
 width:59pt'>
 <col class=xl24 width=63 style='mso-width-source:userset;mso-width-alt:1792;
 width:47pt'>
 <col class=xl24 width=154 style='mso-width-source:userset;mso-width-alt:4380;
 width:116pt'>
 <col class=xl26 width=63 style='mso-width-source:userset;mso-width-alt:1792;
 width:47pt'>
 <col class=xl27 width=101 style='mso-width-source:userset;mso-width-alt:2872;
 width:76pt'>
 <col class=xl28 width=63 style='mso-width-source:userset;mso-width-alt:1792;
 width:47pt'>
 <tr height=29 style='mso-height-source:userset;height:21.75pt'>
  <td height=29 class=xl24 width=81 style='height:21.75pt;width:61pt'></td>
  <td class=xl25 colspan=5 width=460 style='mso-ignore:colspan;width:345pt'><%= Util.convertMonth(yyyymm,"�� ")%> ���� �̻絶�� ������ ���� �۱ݳ���</td>
  <td class=xl28 width=63 style='width:47pt'></td>
 </tr>
 <tr height=17 style='height:12.75pt'>
  <td height=17 colspan=4 class=xl24 style='height:12.75pt;mso-ignore:colspan'></td>
  <td class=xl26></td>
  <td class=xl27></td>
  <td class=xl28></td>
 </tr>
 <tr height=26 style='mso-height-source:userset;height:20.1pt'>
  <td height=26 class=xl29 style='height:20.1pt'>����</td>
  <td class=xl29 style='border-left:none'>������</td>
  <td class=xl29 style='border-left:none'>����</td>
  <td class=xl29 style='border-left:none'>���¹�ȣ</td>
  <td class=xl30 style='border-left:none'>������<ruby><font class=font9><rt class=font9></rt></font></ruby></td>
  <td class=xl31 style='border-left:none'>���� �۱ݾ�</td>
  <td class=xl32 style='border-left:none'>���<ruby><font class=font9><rt class=font9></rt></font></ruby></td>
 </tr>
 
 <!--�̻絶�� �۱� ��� ���� ---------------------------------------------------------------------------->
<%for(int i=0; i<ds.curcommlist.size(); i++){
    SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_MOVM_RDR_RMTT_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%> 
 <tr height=26 style='mso-height-source:userset;height:20.1pt'>  
  <td height=26 class=xl33 style='height:20.1pt;border-top:none'><%= curcommlistRec.areanm%>&nbsp;</td>
  <td class=xl33 style='border-top:none;border-left:none'><%= curcommlistRec.bonm%>&nbsp;</td>
  <td class=xl33 style='border-top:none;border-left:none'><%= curcommlistRec.banknm%>&nbsp;</td>
  <td class=xl33 style='border-top:none;border-left:none'><%= curcommlistRec.acctno%>&nbsp;</td>
  <td class=xl38 style='border-top:none;border-left:none'><%= curcommlistRec.deps_persnm%>&nbsp;</td>
  <td class=xl35 style='border-top:none;border-left:none'><%= Util.comma(curcommlistRec.costamt)%>&nbsp;</td>
  <td class=xl39 style='border-top:none;border-left:none'>��</td>  
 </tr>
<%}%>
 <!--�̻絶�� �۱� ��� �� ---------------------------------------------------------------------------->
 <tr height=26 style='mso-height-source:userset;height:20.1pt'>
  <td height=26 class=xl41 style='height:20.1pt;border-top:none'>�հ�</td>
  <td class=xl41 style='border-top:none;border-left:none'>��</td>
  <td class=xl42 style='border-top:none;border-left:none'>��</td>
  <td class=xl42 style='border-top:none;border-left:none'>��</td>
  <td class=xl43 style='border-top:none;border-left:none'>��</td>
  <td class=xl35 style='border-top:none;border-left:none'><%= Util.comma(ds.getTotalcostamt())%>&nbsp; </td>
  <td class=xl44 style='border-top:none;border-left:none'>��</td>
 </tr>
 
 <![if supportMisalignedColumns]>
 <tr height=0 style='display:none'>
  <td width=81 style='width:61pt'></td>
  <td width=79 style='width:59pt'></td>
  <td width=63 style='width:47pt'></td>
  <td width=154 style='width:116pt'></td>
  <td width=63 style='width:47pt'></td>
  <td width=101 style='width:76pt'></td>
  <td width=63 style='width:47pt'></td>
 </tr>
 <![endif]>
</table>

</body>

</html>
