<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
        //String yymm = (String)request.getParameter("yymm");
        String yymm = (String)Util.getYyyyMm();
        response.reset();
        response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
        response.setHeader("Content-Disposition", "attachment; filename=CRMDATA_"+yymm+".xls;");
        response.setHeader("Content-Transfer-Encoding", "binary;");
        response.setHeader("Pragma", "no-cache;");
        response.setHeader("Expires", "-1;");
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1575_p.jsp
* ��� : Ȯ����Ȳ-����ISȮ��-����� ����Ʈ
* �ۼ����� : 2014-3-18
* �ۼ��� : 
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_EXTN_BO_RSLT_PRINTDataSet ds = (SS_L_RDR_EXTN_BO_RSLT_PRINTDataSet)request.getAttribute("ds");
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
	font-size:16.0pt;
	font-weight:700;
	font-family:����ü, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border-top:none;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:none;}
.xl25
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;
	background:#CCFFCC;
	mso-pattern:auto none;}
.xl26
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	text-align:left;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl27
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl28
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	text-align:right;
	vertical-align:middle;
	border:.5pt solid windowtext;}
.xl29
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	text-align:right;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:none;
	border-bottom:.5pt solid windowtext;
	border-left:.5pt solid windowtext;
	background:#CCFFFF;
	mso-pattern:auto none;
	mso-protection:unlocked visible;}
.xl30
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	text-align:right;
	vertical-align:middle;
	border-top:.5pt solid windowtext;
	border-right:.5pt solid windowtext;
	border-bottom:.5pt solid windowtext;
	border-left:none;
	background:#CCFFFF;
	mso-pattern:auto none;
	mso-protection:unlocked visible;}
.xl31
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\#\,\#\#0_ ";
	text-align:right;
	vertical-align:middle;
	border:.5pt solid windowtext;
	background:#CCFFFF;
	mso-pattern:auto none;}
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

<table x:str border=0 cellpadding=0 cellspacing=0 width=560 style='border-collapse:
 collapse;table-layout:fixed;width:1200pt'>
 <col width=104 style='mso-width-source:userset;mso-width-alt:2958;width:78pt'>
 <col width=136 style='mso-width-source:userset;mso-width-alt:3868;width:102pt'>
 <col width=80 span=4 style='width:60pt'>
 <tr height=27 style='height:20.25pt'>
  <td colspan=27 height=27 class=xl24 width=820 style='height:20.25pt; width:1200pt'><%= Util.convertMonth(ds.getFrdt(),"��")%>�� ���� Ȯ�� �뿪�� û��</td>
 </tr>
 <tr height=18 style='height:13.5pt'>
  <td height=18 class=xl25 style='height:13.5pt;border-top:none;border-left:none'>Ȱ������</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�����ȣ</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�����</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�ֹι�ȣ</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�����</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>���¹�ȣ</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>������</td>
  
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�������Ʈ(-3)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��������(-3)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�����(-3)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�������Ʈ(4-6)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��������(4-6)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�����(4-6)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�������Ʈ(7-9)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��������(7-9)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�����(7-9)</td>
  
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�������Ʈ(10-11)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��������(10-11)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�����(10-11)</td>
    
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�������Ʈ(12-)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��������(12-)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�����(12-)</td>
  
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ����Ʈ(-3)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ����(-3)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ��(-3)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ����Ʈ(4-6)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ����(4-6)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ��(4-6)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ����Ʈ(7-9)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ����(7-9)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ��(7-9)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ����Ʈ(10-11)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ����(10-11)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ��(10-11)</td>
  
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ����Ʈ(12-)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ����(12-)</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>��Ÿ��(12-)</td>
  
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�����μ�</td>
  <td class=xl25 style='width:80pt;border-top:none;border-left:none'>�Ѻμ�</td>
 </tr>
<%--��� ����--%>
<%
for(int i=0; i<ds.curcommlist.size(); i++){	
	SS_L_RDR_EXTN_BO_RSLT_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_BO_RSLT_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
<tr height=18 style='height:13.5pt'>
	<td height=18 class=xl26 style='height:13.5pt;border-top:none'><%= curcommlistRec.jursareanm%>&nbsp;</td>
	<td class=xl26 style='width:80pt;border-top:none;border-left:none'><%= curcommlistRec.stafno%>&nbsp;</td>
	<td class=xl26 style='width:80pt;border-top:none;border-left:none'><%= curcommlistRec.stafnm%>&nbsp;</td>
	<td class=xl26 style='width:80pt;border-top:none;border-left:none'><%= curcommlistRec.prn%>&nbsp;</td>
	<td class=xl26 style='width:80pt;border-top:none;border-left:none'><%= curcommlistRec.acctbank%>&nbsp;</td>
	<td class=xl26 style='width:80pt;border-top:none;border-left:none'><%= curcommlistRec.acctno%>&nbsp;</td>
	<td class=xl26 style='width:80pt;border-top:none;border-left:none'><%= curcommlistRec.acctdeps_pers%>&nbsp;</td>
	
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.sa1)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.sh1)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.ss1)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.sa2)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.sh2)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.ss2)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.sa3)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.sh3)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.ss3)%></td>
	
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.sa5)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.sh5)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.ss5)%></td>
	
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.sa4)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.sh4)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.ss4)%></td>
	
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.ea1)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.eh1)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.es1)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.ea2)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.eh2)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.es2)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.ea3)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.eh3)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.es3)%></td>
	
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.ea5)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.eh5)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.es5)%></td>
	
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.ea4)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.eh4)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.es4)%></td>
	
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.corr_qty)%></td>
	<td class=xl28 style='width:80pt;border-top:none;border-left:none'><%= Util.comma(curcommlistRec.tot_qty)%></td>
</tr>
<%}%>

 <![if supportMisalignedColumns]>
 <tr height=0 style='display:none'>
  <td width=104 style='width:78pt'></td>
  <td width=136 style='width:102pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
  <td width=80 style='width:60pt'></td>
 </tr>
 <![endif]>
</table>

</body>

</html>
