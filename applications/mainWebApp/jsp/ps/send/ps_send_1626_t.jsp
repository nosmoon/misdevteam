<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common.jsp" %>
<!--JSP COMMENT START------------------------------------------------------------------------------->
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_1626_t.jsp
* ��� : ��ü �߰��߼� �������
* �ۼ����� : 2005-12-08
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<!--JSP COMMENT END--------------------------------------------------------------------------------->
<%
    //  dataset �ν��Ͻ� ����κ�
    PS_P_SEND_ADDM_STICKERDataSet ds = (PS_P_SEND_ADDM_STICKERDataSet)request.getAttribute("ds");  // request dataset

    String sysDate = Util.getDate();                // ����ȭ�� ����� �����̸����� ���
    //String filename = "�߰��߼�_"+sysDate+".xls";    // ����ȭ�� ����� �����̸����� ���
    String filename = "CRMDATA_"+sysDate+".xls";    // ����ȭ�� ����� �����̸����� ���
    String filenm = new String(filename.getBytes("KSC5601"),"8859_1");    // ����ȭ�� ����� �����̸����� ���

    response.setHeader("Content-Disposition", "attachment; filename=" + filenm);
    response.setHeader("Content-Description", "JSP Generated Data");
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
	border:.5pt solid windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl26
	{mso-style-parent:style0;
	font-size:16.0pt;
	font-weight:700;
	font-family:����ü, monospace;
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
	font-family:����, monospace;
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
  <td colspan=10 height=27 class=xl26 width=800 style='height:20.25pt; width:600pt'>
	�߼۹�� : <%= ds.getSendmthdnm()%> ���� : <%= ds.getBonm()%>
  </td>
 </tr>
 <tr height=18 style='height:13.5pt'>
  <td height=18 class=xl24 style='height:13.5pt;border-top:none;border-left:none'>�����</td>
  <td class=xl24 style='border-top:none;border-left:none'>��ü��</td>
  <td class=xl24 style='border-top:none;border-left:none'>��üȣ��</td>
  <td class=xl24 style='border-top:none;border-left:none'>���ڹ�ȣ</td>
  <td class=xl25 style='border-top:none;border-left:none'>�����θ�</td>
  <td class=xl25 style='border-top:none;border-left:none'>��ȭ</td>
  <td class=xl24 style='border-top:none;border-left:none'>�ڵ���</td>
  <td class=xl24 style='border-top:none;border-left:none'>�����ȣ</td>
  <td class=xl24 style='border-top:none;border-left:none'>�ּ�</td>
  <td class=xl24 style='border-top:none;border-left:none'>�޸�</td>
 </tr>

<%--��� ����--%>
<%for(int i=0; i<ds.curcommlist.size(); i++){
		PS_P_SEND_ADDM_STICKERCURCOMMLISTRecord curcommlistRec = (PS_P_SEND_ADDM_STICKERCURCOMMLISTRecord)ds.curcommlist.get(i);%>
 <tr height=18 style='height:13.5pt'>
  <td height=18 class=xl27 style='height:13.5pt;border-top:none'><%= curcommlistRec.bonm%></td>
  <td class=xl27 style='border-top:none;border-left:none'><%= curcommlistRec.medinm%></td>
  <td class=xl27 style='border-top:none;border-left:none'><%= curcommlistRec.mediser_no%></td>
  <td class=xl27 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_no%></td>
  <td class=xl27 style='border-top:none;border-left:none'><%= curcommlistRec.rdrnm%></td>
  <td class=xl32 style='border-top:none;border-left:none'><%= curcommlistRec.rdrtel_no%></td>
  <td class=xl32 style='border-top:none;border-left:none'><%= curcommlistRec.rdrptph_no%></td>
  <td class=xl27 style='border-top:none;border-left:none'><%= curcommlistRec.dlvzip%></td>
  <td class=xl27 style='border-top:none;border-left:none'><%= curcommlistRec.dlvaddr%> <%= curcommlistRec.dlvdtlsaddr%></td>
  <td class=xl32 style='border-top:none;border-left:none'><%= curcommlistRec.memo%></td>
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
  <td width=80 style='width:60pt'></td>
 </tr>
 <![endif]>
</table>
</body>
</html>
