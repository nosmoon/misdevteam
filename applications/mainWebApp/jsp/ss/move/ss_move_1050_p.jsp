<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
        String yymm = (String)request.getParameter("yymm");
        response.reset();
        response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
        response.setHeader("Content-Disposition", "attachment; filename=MoveRDR_List.xls;");
        response.setHeader("Content-Transfer-Encoding", "binary;");
        response.setHeader("Pragma", "no-cache;");
        response.setHeader("Expires", "-1;");
%> 
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_move_1050_p.jsp
* ��� : �̻絶�� - ��û��Ȳ - �����ٿ�
* �ۼ����� : 2009-05-13
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%--------------------------------------------------------------------------------------------------- 
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<html>
<% 
	SS_L_MOVM_RDRDataSet ds = (SS_L_MOVM_RDRDataSet)request.getAttribute("ds"); 
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

<table x:str border=0 cellpadding=0 cellspacing=0 width=1440 style='border-collapse: collapse;table-layout:fixed;width:1388pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2000;width:66pt'>
 <col width=80 style='mso-width-source:userset;mso-width-alt:2000;width:86pt'>
 <tr height=27 style='height:20.25pt'>
       <td colspan=19 height=27 class=xl27 width=1254 style='height:20.25pt;width:943pt'>�̻絶�� ��û��Ȳ</td>
<%--&nbsp;(<%=request.getParameter("fromdt")%>~<%=request.getParameter("todt")%>)--%>
       <td class=xl27 width=148 style='width:111pt'></td>
       <td class=xl27 width=102 style='width:77pt'></td>
       <td class=xl27 width=74 style='width:56pt'></td>
       <td width=88 style='width:66pt'></td>
       <td width=88 style='width:66pt'></td>
       <td width=92 style='width:69pt'></td>
 </tr>
 <tr height=18 style='height:13.5pt'>
		<td rowspan="2" class=xl24 style='border-left:none'>����</td>
		<td rowspan="2" class=xl24 style='border-left:none'>���ڹ�ȣ</td>
		<td class=xl24 style='border-left:none'>�ΰ���</td>
		<td class=xl24 style='border-left:none'>�ΰ���Ʈ</td>
		<td class=xl24 style='border-left:none'>�ΰ�����</td>
		<td class=xl24 style='border-left:none'>�ΰ�����</td>
		<td class=xl24 style='border-left:none'>�ΰ������ڵ�</td>
		<td class=xl24 style='border-left:none'>�ΰ�Ȯ����</td>
		<td rowspan="2" class=xl24 style='border-left:none'>���þ��̵�</td>
		<td rowspan="2" class=xl24 style='border-left:none'>��ü</td>
		<td class=xl24 style='border-left:none'>��������</td>
		<td rowspan="2" class=xl24 style='border-left:none'>�μ�</td>
		<td rowspan="2" class=xl24 style='border-left:none'>�̻�����</td>
		<td rowspan="2" class=xl24 style='border-left:none'>��������</td>
		<td rowspan="2" class=xl24 style='border-left:none'>�ܿ�����������</td>
		<td rowspan="2" class=xl24 style='border-left:none'>���</td>
		<td rowspan="2" class=xl24 style='border-left:none'>�ǸŸ�����</td>
		<td rowspan="2" class=xl24 style='border-left:none'>�߼ۺμ�</td>
		<td rowspan="2" class=xl24 style='border-left:none'>��������</td>
		<td rowspan="2" class=xl24 style='border-left:none'>��û���</td>
		<td rowspan="2" class=xl24 style='border-left:none'>��������</td>
		<td class=xl24 style='border-left:none'>�ΰ�����ȣ</td>
		<td class=xl24 style='border-left:none'>�ΰ��ּ�</td>
		<td class=xl24 style='border-left:none'>�ΰ���ּ�</td>
		<td class=xl24 style='border-left:none'>�ΰ��������</td>
		<td class=xl24 style='border-left:none'>�̻翬����系��</td>
 </tr>
<tr height=18 style='height:13.5pt'>
        <td class=xl24 style='border-left:none'>�μ���</td>
        <td class=xl24 style='border-left:none'>�μ���Ʈ</td>
		<td class=xl24 style='border-left:none'>�μ�����</td>
		<td class=xl24 style='border-left:none'>�μ�����</td>
		<td class=xl24 style='border-left:none'>�μ������ڵ�</td>
		<td class=xl24 style='border-left:none'>�μ�Ȯ����</td>
		<td class=xl24 style='border-left:none'>Ȯ������</td>
		<td class=xl24 style='border-left:none'>�μ������ȣ</td>
		<td class=xl24 style='border-left:none'>�μ��μ��ּ�</td>
		<td class=xl24 style='border-left:none'>�μ����ּ�</td>
		<td class=xl24 style='border-left:none'>�μ��������</td>
		<td class=xl24 style='border-left:none'>Ȯ�����系��</td>
 </tr>

<%
for(int i=0; i<ds.curcommlist.size(); i++){
	SS_L_MOVM_RDRCURCOMMLISTRecord curcommlistRec = (SS_L_MOVM_RDRCURCOMMLISTRecord)ds.curcommlist.get(i);%>

 <tr height=18 style='height:13.5pt'>
		<td rowspan="2" class=x124 ><%= curcommlistRec.rdrnm%></td>
		<td rowspan="2" class=x124 ><%= curcommlistRec.rdr_no%><</td>
		<td class=x124 ><%= curcommlistRec.trsfdeptnm%></td>
		<td class=x124 ><%= curcommlistRec.trsfdeptnm%></td>
		<td class=x126 ><%= curcommlistRec.trsfareanm%></td>
		<td class=x126 ><%= curcommlistRec.trsfbonm%></td>
		<td class=x126 ><%= curcommlistRec.trsfbocd%></td>
		<td class=x126 ><%= curcommlistRec.trsfbocnfmdt_tm%></td>
		<td rowspan="2" class=x126 ><%= curcommlistRec.onlmembid%></td>
		<td rowspan="2" class=x126 ><%= curcommlistRec.medinm%></td>
		<td class=x126 ><%= curcommlistRec.movmlinkalon_plan%></td>
		<td rowspan="2" class=x126 ><%= curcommlistRec.chrgqty%></td>
		<td rowspan="2" class=x126 ><%= curcommlistRec.movmdt%></td>
		<td rowspan="2" class=x126 ><%= curcommlistRec.movmrdrtype%></td>
		<td rowspan="2" class=x126 ><%= curcommlistRec.rstsubsmonths%></td>
		<td rowspan="2" class=x126 ><%= curcommlistRec.post_dlvyn%></td>
		<td rowspan="2" class=x126 ><%= curcommlistRec.sellnetclsf%></td>
		<td rowspan="2" class=x126 ><%= curcommlistRec.thmmsendqty%></td>
		<td rowspan="2" class=x126 ><%= curcommlistRec.cns_empacpndtm%></td>
		<td rowspan="2" class=x126 ><%= curcommlistRec.aplcpathnm%></td>
		<td rowspan="2" class=x126 ><%= curcommlistRec.suspdt%></td>
		<td class=x126 ><%= curcommlistRec.zip%></td>
		<td class=x126 ><%= curcommlistRec.addr%></td>
		<td class=x126 ><%= curcommlistRec.dtlsaddr%></td>
		<td class=x126 ><%= curcommlistRec.trsfboremk%></td>
		<td class=x126 ><%= curcommlistRec.movmlinkalon_ptcr%></td>
 </tr>
 <tr height=18 style='height:13.5pt'>
        <td class=x126 ><%= curcommlistRec.acptdeptnm%></td>
        <td class=x126 ><%= curcommlistRec.acptdeptnm%></td>
		<td class=x126 ><%= curcommlistRec.acptareanm%></td>
		<td class=x126 ><%= curcommlistRec.acptbonm%></td>
		<td class=x126 ><%= curcommlistRec.acptbocd%></td>
		<td class=x126 ><%= curcommlistRec.acptbocnfmdt_tm%></td>
		<td class=x126 ><%= curcommlistRec.movmlinkalon_fix%></td>
		<td class=x126 ><%= curcommlistRec.movmzip%></td>
		<td class=x126 ><%= curcommlistRec.movmaddr%></td>
		<td class=x126 ><%= curcommlistRec.movmdtlsaddr%></td>
		<td class=x126 ><%= curcommlistRec.acptboremk%></td>
		<td class=x126 ></td>   
 </tr>
<%}%>

</table>

</body>

</html>

