<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1615_p.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-��� ����Ʈ
* �ۼ����� : 2004-08-28
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_PROMSTAF_CYEXTN_PRINTDataSet ds = (SS_L_PROMSTAF_CYEXTN_PRINTDataSet)request.getAttribute("ds");
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
	font-size:9.0pt;
	font-family:����ü, monospace;
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
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	border:.5pt solid windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl26
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl27
	{mso-style-parent:style0;
	font-size:16.0pt;
	font-weight:700;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:center;
	vertical-align:middle;}
.xl28
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:left;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl29
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:left;
	border:.5pt solid windowtext;}
.xl30
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:����ü, monospace;
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
	font-family:����, monospace;
	mso-font-charset:129;
	mso-char-type:none;
	display:none;}
-->
</style>

</head>

<body link=blue vlink=purple>

<table x:str border=0 cellpadding=0 cellspacing=0 width=1846 style='border-collapse:
 collapse;table-layout:fixed;width:1388pt'>
 <col width=88 style='mso-width-source:userset;mso-width-alt:2503;width:66pt'>
 <col width=114 span=2 style='mso-width-source:userset;mso-width-alt:3242;width:86pt'>
 <col width=94 style='mso-width-source:userset;mso-width-alt:2673;width:71pt'>
 <col width=80 style='width:60pt'>
 <col width=322 style='mso-width-source:userset;mso-width-alt:9159;width:242pt'>
 <col width=104 span=2 style='mso-width-source:userset;mso-width-alt:2958;width:78pt'>
 <col width=138 style='mso-width-source:userset;mso-width-alt:3925;width:104pt'>
 <col width=96 style='mso-width-source:userset;mso-width-alt:2730;width:72pt'>
 <col width=148 style='mso-width-source:userset;mso-width-alt:4209;width:111pt'>
 <col width=102 style='mso-width-source:userset;mso-width-alt:2901;width:77pt'>
 <col width=74 style='mso-width-source:userset;mso-width-alt:2104;width:56pt'>
 <col width=88 span=2 style='mso-width-source:userset;mso-width-alt:2503;width:66pt'>
 <col width=92 style='mso-width-source:userset;mso-width-alt:2616;width:69pt'>
<%--
 <tr height=27 style='height:20.25pt'>
  <td colspan=10 height=27 class=xl27 width=1254 style='height:20.25pt;
  width:943pt'>���̹���� ���</td>
  <td class=xl27 width=148 style='width:111pt'></td>
  <td class=xl27 width=102 style='width:77pt'></td>
  <td class=xl27 width=74 style='width:56pt'></td>
  <td width=88 style='width:66pt'></td>
  <td width=88 style='width:66pt'></td>
  <td width=92 style='width:69pt'></td>
 </tr>
 <tr height=18 style='height:13.5pt'>
  <td height=18 class=xl24 style='height:13.5pt'>��������ڵ�</td>
  <td height=18 class=xl24 style='height:13.5pt'>������и�</td>
  <td height=18 class=xl24 style='height:13.5pt'>�����ȣ</td>
  <td class=xl24 style='border-left:none'>�ֹι�ȣ</td>
  <td class=xl24 style='border-left:none'>����ڹ�ȣ</td>
  <td class=xl24 style='border-left:none'>�����</td>
  <td class=xl24 style='border-left:none'>�����ȣ</td>
  <td class=xl24 style='border-left:none'>�ּ�</td>
  <td class=xl24 style='border-left:none'>��ȭ��ȣ</td>
  <td class=xl25 style='border-left:none'>�޴�����ȣ</td>
  <td class=xl25 style='border-left:none'>�̸���</td>
  <td class=xl24 style='border-left:none'>��������</td>
  <td class=xl24 style='border-left:none'>���¹�ȣ</td>
  <td class=xl24 style='border-left:none'>������</td>
  <td class=xl24 style='border-left:none'>������</td>
  <td class=xl24 style='border-left:none'>���������ȣ</td>
  <td class=xl24 style='border-left:none'>�������</td>
 </tr>
--%>
<%for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAF_CYEXTN_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%>

 <tr height=18 style='height:13.5pt'>
  <td height=18 class=xl28 style='height:13.5pt;border-top:none'><%= curcommlistRec.stafclsfcd%></td>
  <td height=18 class=xl28 style='height:13.5pt;border-top:none'><%= curcommlistRec.stafclsfnm%></td>
  <td height=18 class=xl28 style='height:13.5pt;border-top:none'><%= curcommlistRec.stafno%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.FormatJumin(curcommlistRec.prn)%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.FormatBiz(curcommlistRec.ernno)%></td>
  <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.stafnm%></td>
  <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.blngteamnm%></td>
  <td class=xl28 style='border-top:none;border-left:none'><%= curcommlistRec.stafclsfcd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.FormatZip(curcommlistRec.zip)%></td>
  <td class=xl29 style='border-top:none;border-left:none'><%= curcommlistRec.addr%></td>
  <td class=xl29 style='border-top:none;border-left:none'><%= curcommlistRec.dtlsaddr%></td>
  <td class=xl29 style='border-top:none;border-left:none'><%= Util.getChainStr(curcommlistRec.tel_no1, curcommlistRec.tel_no2, curcommlistRec.tel_no3, "-")%></td>
  <td class=xl29 style='border-top:none;border-left:none'><%= Util.getChainStr(curcommlistRec.ptph_no1, curcommlistRec.ptph_no2, curcommlistRec.ptph_no3, "-")%></td>
  <td class=xl29 style='border-top:none;border-left:none'><%= curcommlistRec.email%></td>
  <td class=xl30 style='border-top:none;border-left:none'><%= curcommlistRec.acctbank%></td>
  <td class=xl30 style='border-top:none;border-left:none'><%= curcommlistRec.acctno%></td>
  <td class=xl30 style='border-top:none;border-left:none'><%= curcommlistRec.acctdeps_pers%></td>
  <td class=xl30 style='border-top:none;border-left:none'><%= curcommlistRec.in_cmpydt%></td>
  <td class=xl31 style='border-top:none;border-left:none'><%= curcommlistRec.cnvsstafno%></td>
  <td class=xl31 style='border-top:none;border-left:none'><%= curcommlistRec.cnvsstafnm%></td>
 </tr>
<%}%>

</table>

</body>

</html>
