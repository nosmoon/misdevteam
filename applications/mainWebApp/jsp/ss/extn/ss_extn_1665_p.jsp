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
* ���ϸ� : ss_extn_1665_p.jsp
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����-�μ�
* �ۼ����� : 2004-09-14
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ :
* �������� :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_PROMSTAF_CYEXPAYDataSet ds = (SS_L_PROMSTAF_CYEXPAYDataSet)request.getAttribute("ds");
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
 <tr>
  <td class=xl26 style='border-top:none;border-left:none'>Ȯ������</td>
  <td class=xl26 style='border-top:none;border-left:none'>Ȯ���ȣ</td>
  <td class=xl26 style='border-top:none;border-left:none'>��������ڵ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>��������ڵ��</td>
  <td class=xl26 style='border-top:none;border-left:none'>�����ȣ</td>
  <td class=xl26 style='border-top:none;border-left:none'>�����</td>
  <td class=xl26 style='border-top:none;border-left:none'>�ֹε�Ϲ�ȣ</td>
  <td class=xl26 style='border-top:none;border-left:none'>�����ȣ</td>
  <td class=xl26 style='border-top:none;border-left:none'>�ּ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>���ּ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>��ȭ��ȣ</td>
  <td class=xl26 style='border-top:none;border-left:none'>�޴�����ȣ</td>
  <td class=xl26 style='border-top:none;border-left:none'>�̸���</td>
  <td class=xl26 style='border-top:none;border-left:none'>���¹�ȣ</td>
  <td class=xl26 style='border-top:none;border-left:none'>��������</td>
  <td class=xl26 style='border-top:none;border-left:none'>���¿�����</td>
  <td class=xl26 style='border-top:none;border-left:none'>���������ȣ</td>
  <td class=xl26 style='border-top:none;border-left:none'>���������</td>
  <td class=xl26 style='border-top:none;border-left:none'>���ڸ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>��ü�ڵ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>��ü��</td>
  <td class=xl26 style='border-top:none;border-left:none'>�μ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>���豸���ڵ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>���豸�и�</td>
  <td class=xl26 style='border-top:none;border-left:none'>�ְ������ڵ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>�ְ����¸�</td>
  <td class=xl26 style='border-top:none;border-left:none'>�ְű����ڵ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>�ְű��и�</td>
  <td class=xl26 style='border-top:none;border-left:none'>����������</td>
  <td class=xl26 style='border-top:none;border-left:none'>�μ��ڵ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>�μ���</td>
  <td class=xl26 style='border-top:none;border-left:none'>�����ڵ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>������</td>
  <td class=xl26 style='border-top:none;border-left:none'>���������ڵ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>������</td>
  <td class=xl26 style='border-top:none;border-left:none'>������Ȯ�ο���</td>
  <td class=xl26 style='border-top:none;border-left:none'>������Ȯ������</td>
  <td class=xl26 style='border-top:none;border-left:none'>����Ȯ�λ����ڵ�</td>
  <td class=xl26 style='border-top:none;border-left:none'>����Ȯ�λ��¸�</td>
  <td class=xl26 style='border-top:none;border-left:none'>���̹�Ȯ�����</td>
  <td class=xl26 style='border-top:none;border-left:none'>�������꿩��</td>
  <td class=xl26 style='border-top:none;border-left:none'>������������</td>
 </tr>
 
<%	for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord curcommlistRec = (SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord)ds.curcommlist.get(i);%> 
 <tr>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.convertS(curcommlistRec.rdr_extndt)%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdr_extnno%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.stafclsfcd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.stafclsfnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.stafno%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.stafnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.FormatJumin(curcommlistRec.prn)%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.zip%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.addr%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.dtlsaddr%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.getChainStr(curcommlistRec.tel_no1, curcommlistRec.tel_no2, curcommlistRec.tel_no3, "-")%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.getChainStr(curcommlistRec.ptph_no1, curcommlistRec.ptph_no2, curcommlistRec.ptph_no3, "-")%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.email%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.acctno%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.acctbank%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.acctdeps_pers%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.cnvsstafno%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.cnvsstafnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rdrnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.medicd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.medinm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.qty%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rshpclsfcd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.rshpclsfnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.resiclsfcd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.resiclsfnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.resitypecd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.resitypenm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.convertS(curcommlistRec.dlvhopedt)%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.deptcd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.deptnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.areacd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.areanm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.corrbocd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.bonm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.bo_headcnfmyn%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.convertS(curcommlistRec.bo_headcnfmdt)%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.subscnfmstatcd%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.subscnfmstatnm%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= Util.comma(curcommlistRec.cyextnalon)%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.alonadjmyn%></td>
  <td class=xl26 style='border-top:none;border-left:none'><%= curcommlistRec.alonadjmdt%></td>
 </tr>
<%}%> 
</table>

</body>

</html>
