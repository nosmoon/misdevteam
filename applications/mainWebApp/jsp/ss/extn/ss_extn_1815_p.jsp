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
* ���ϸ� : ss_extn_1915_p.jsp
* ��� : �����濵-���־���Ʈ��Ȳ-������Ȯ����Ȳ-��������
* �ۼ����� : 2006-06-07
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<html>
<%
	SL_L_MOVEIN_EXTN_PRINTDataSet ds = (SL_L_MOVEIN_EXTN_PRINTDataSet)request.getAttribute("ds");
%>
<head>
<title>����Ȯ������Ȳ</title>
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
       <td colspan=19 height=27 class=xl27 width=1254 style='height:20.25pt;width:943pt'>������ Ȯ�� ���</td>
<%--&nbsp;(<%=request.getParameter("fromdt")%>~<%=request.getParameter("todt")%>)--%>
       <td class=xl27 width=148 style='width:111pt'></td>
       <td class=xl27 width=102 style='width:77pt'></td>
       <td class=xl27 width=74 style='width:56pt'></td>
       <td width=88 style='width:66pt'></td>
       <td width=88 style='width:66pt'></td>
       <td width=92 style='width:69pt'></td>
 </tr>
 <tr height=18 style='height:13.5pt'>
		<td class=xl24 style='border-left:none'>Ȯ������</td>
		<td class=xl24 style='border-left:none'>�μ���</td>
		<td class=xl24 style='border-left:none'>������</td>
		<td class=xl24 style='border-left:none'>������</td>
		<td class=xl24 style='border-left:none'>����</td>
		<td class=xl24 style='border-left:none'>����������</td>
		<td class=xl24 style='border-left:none'>�����</td>
		<td class=xl24 style='border-left:none'>Ȯ������</td>
		<td class=xl24 style='border-left:none'>���ڸ�</td>
		<td class=xl24 style='border-left:none'>���ڹ�ȣ</td>
		<td class=xl24 style='border-left:none'>�ּ�</td>
		<td class=xl25 style='border-left:none'>���ּ�</td>
		<td class=xl25 style='border-left:none'>�ְű���</td>
		<td class=xl24 style='border-left:none'>������</td>
		<td class=xl24 style='border-left:none'>��ȭ��ȣ</td>
		<td class=xl24 style='border-left:none'>�ڵ�����ȣ</td>
		<td class=xl24 style='border-left:none'>�ܰ�</td>
		<td class=xl24 style='border-left:none'>�μ�</td>
		<td class=xl24 style='border-left:none'>��������</td>
		<td class=xl24 style='border-left:none'>��������</td>
		<td class=xl24 style='border-left:none'>���־���Ʈ����</td>
		<td class=xl24 style='border-left:none'>���</td>
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
