<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%
        //String yymm = (String)request.getParameter("yymm");
        String yymm = (String)Util.getYyyyMm();
        response.reset();
        response.setHeader("Content-Type", "application/vnd.ms-excel; charset=KSC5601");
        response.setHeader("Content-Disposition", "attachment; filename=CRMDATA.xls;");
        response.setHeader("Content-Transfer-Encoding", "binary;");
        response.setHeader("Pragma", "no-cache;");
        response.setHeader("Expires", "-1;");
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_3030_p.jsp
* ��� : ����������-����
* �ۼ����� : 2015-03-03
* �ۼ��� : 
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_P_SUSP_DEFDataSet ds = (SS_P_SUSP_DEFDataSet)request.getAttribute("ds");
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

<body>
<table>
 <tr height=18>
  <td class=xl26 style='border-top:none;border-left:none'>��</td>
  <td class=xl26 style='border-top:none;border-left:none'>���ڵ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>��Ʈ</td>
  <td class=xl26 style='border-top:none;border-left:none'>��Ʈ�ڵ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>����</td>
  <td class=xl26 style='border-top:none;border-left:none'>�����ڵ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>����</td>
  <td class=xl26 style='border-top:none;border-left:none'>�����ڵ�</td>      
  <td class=xl26 style='border-top:none;border-left:none'>�����������</td>
  <td class=xl26 style='border-top:none;border-left:none'>��û����</td>
  <td class=xl26 style='border-top:none;border-left:none'>���ڹ�ȣ</td>
  <td class=xl26 style='border-top:none;border-left:none'>���ڸ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>��ü��</td>
  <td class=xl26 style='border-top:none;border-left:none'>�μ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>������</td>
  <td class=xl26 style='border-top:none;border-left:none'>Ȯ������</td>
  <td class=xl26 style='border-top:none;border-left:none'>����������</td>
  <td class=xl26 style='border-top:none;border-left:none'>��û���</td>
  <td class=xl26 style='border-top:none;border-left:none'>��������̵�</td>
  <td class=xl26 style='border-top:none;border-left:none'>������</td>
  <td class=xl26 style='border-top:none;border-left:none'>����ó������</td>
  <td class=xl26 style='border-top:none;border-left:none'>����ó������</td>
  <td class=xl26 style='border-top:none;border-left:none'>����ó������</td>
  <td class=xl26 style='border-top:none;border-left:none'>����ó������</td>
  <td class=xl26 style='border-top:none;border-left:none'>���</td>
  <td class=xl26 style='border-top:none;border-left:none'>���˹�</td>
  <td class=xl26 style='border-top:none;border-left:none'>���񽺰�����</td>
  <td class=xl26 style='border-top:none;border-left:none'>��ǰ��</td>
  <td class=xl26 style='border-top:none;border-left:none'>��Ʈ��</td>
 </tr>


<%--��� ����--%>
<%for(int i=0; i<ds.suspdefcur.size(); i++){
	SS_P_SUSP_DEFSUSPDEFCURRecord suspdefcurRec = (SS_P_SUSP_DEFSUSPDEFCURRecord)ds.suspdefcur.get(i);%>
<tr>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.deptnm%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.deptcd%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.partnm%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.partcd%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.areanm%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.areacd%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.bonm%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.bocd%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.def_type%></td>
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.aplcdt%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.rdr_no%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.rdrnm%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.medinm%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.subsqty%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.valmm%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.rdr_extndt%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.subsfr_dt%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.aplcpathnm%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.onlmembid%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.agentnm%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.cns_stat%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.cns_cnfmdt%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.bo_stat%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.bo_cnfmdt%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.remk%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.svccd%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.svcmm%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.giftcard%></td>	
	<td class=xl26 style='border-top:none;border-left:none'><%= suspdefcurRec.set_medicd%></td>	
</tr>
<%}%>

</table>
</body>
</html>
