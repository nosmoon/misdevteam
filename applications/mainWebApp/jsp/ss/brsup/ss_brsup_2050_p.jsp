<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
        response.reset();
        response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
        response.setHeader("Content-Disposition", "attachment; filename=CRMDATA.xls;");
        response.setHeader("Content-Transfer-Encoding", "binary;");
        response.setHeader("Pragma", "no-cache;");
        response.setHeader("Expires", "-1;");
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2050_p.jsp
* ��� :
* �ۼ����� :
* �ۼ��� : �輼
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
SS_L_PROMSTAF_PRINTDataSet ds = (SS_L_PROMSTAF_PRINTDataSet)request.getAttribute("ds");

%>
<html>

<head>
<style>
<!--

.xl26
	{mso-style-parent:style0;
	font-size:9.0pt;
	font-family:����ü, monospace;
	mso-font-charset:129;
	mso-number-format:"\@";
	text-align:center;
	vertical-align:middle;
	border:.5pt solid windowtext;}

-->
</style>
</head>

<body >
<table>
 <tr >
		<td class=xl26 style='border-left:none'>��������ڵ�</td>
        <td class=xl26 style='border-left:none'>�������</td>
		<td class=xl26 style='border-left:none'>������</td>
		<td class=xl26 style='border-left:none'>����ڵ�</td>
		<td class=xl26 style='border-left:none'>�����</td>
		<td class=xl26 style='border-left:none'>����������</td>
		<td class=xl26 style='border-left:none'>�ֹι�ȣ</td>
		<td class=xl26 style='border-left:none'>��ȭ��ȣ</td>
		<td class=xl26 style='border-left:none'>�޴�����ȣ</td>
		<td class=xl26 style='border-left:none'>�ּ�</td>
		<td class=xl26 style='border-left:none'>���ּ�</td>
 </tr>
<%
	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_PROMSTAF_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAF_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);
%>
 <tr >
   <td class=xl26 style='border-top:none;border-left:none'><%=curcommlistRec.stafclsfcd%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.stafclsfnm%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.cntrstatnm%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.stafno%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.stafnm%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.jursareanm%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= Util.FormatJumin(curcommlistRec.prn)%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= Util.getChainStr(curcommlistRec.tel_no1, curcommlistRec.tel_no2, curcommlistRec.tel_no3, "-")%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= Util.getChainStr(curcommlistRec.ptph_no1, curcommlistRec.ptph_no2, curcommlistRec.ptph_no3, "-")%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.addr%>&nbsp;</td>
   <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.dtlsaddr%>&nbsp;</td>
 </tr>
<%}%>
</table>
</body>
</html>
