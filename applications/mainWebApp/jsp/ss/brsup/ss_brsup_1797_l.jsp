<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1797_l.jsp
* ��� : ������������-Billing�ڵ���ü-��û/�������-������ȯ
* �ۼ����� : 2005-01-11
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-24
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>

<%
	//TrustForm ����.
	//content type�� text/html, text/xml�� �ƴ� ��� �ڵ����� download ��ȯ�̶�� �ϳ� �Ʒ��� ���� �̸� �������� ������ ����� �������� ����.
	response.setHeader("Content-Disposition","attachment; filename=SSBRSUP1797.xls");

	SS_L_SHFTEXPYRDRDataSet ds = (SS_L_SHFTEXPYRDRDataSet)request.getAttribute("ds");
%>
<!--list-->
  <table id="body_id" width="1230" border="0" cellpadding="1" cellspacing="0"  align="left" class="gray" bgcolor="#FFFFFF">
	<tr align="center" bgcolor="#dddddd" >
	  <td class="gray" width="58">������</td>
	  <td class="gray" width="58">������</td>
	  <td class="gray" width="67">���ڸ�</td>
	  <td width="63" class="gray">��ü��</td>
	  <td width="66" class="gray">�����ڸ�</td>
	  <td width="96" class="gray">�ֹ�/����ڹ�ȣ</td>
	  <td width="96" class="gray">����/ī���ȣ</td>
	  <td width="84" class="gray">����TEL</td>
	  <td width="84" class="gray">������TEL</td>
	  <td width="256" class="gray">�ּ�</td>
	  <td width="65" class="gray">��û����</td>
	  <td width="65" class="gray">��������</td>
	  <td width="60" class="gray">��������</td>
	  <td class="gray">��ü����</td>
	</tr>
<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFTEXPYRDRRSLTCURRecord rsltcurRec = (SS_L_SHFTEXPYRDRRSLTCURRecord)ds.rsltcur.get(i);%>
    <tr>
      <td class="gray"><%=rsltcurRec.areanm%></td>
      <td class="gray"><%=rsltcurRec.bonm%></td>
      <td class="gray"><%=rsltcurRec.rdrnm%></td>
      <td class="gray"><%=rsltcurRec.medinm%></td>
      <td class="gray"><%=rsltcurRec.pymtnm%></td>
      <td class="gray"><%=rsltcurRec.prn%></td>
      <td class="gray"><%=rsltcurRec.acctno%></td>
      <td class="gray"><%=rsltcurRec.rdrtel_no%></td>
      <td class="gray"><%=rsltcurRec.pymttel_no%></td>
      <td class="gray"><%=rsltcurRec.rdraddr%></td>
      <td class="gray"><%=rsltcurRec.aplcdt%></td>
      <td class="gray"><%=rsltcurRec.expydt%></td>
      <td class="gray"><%=rsltcurRec.expystat%></td>
      <td class="gray"><%=rsltcurRec.shftclsf%></td>
    </tr>
<%}%>
</table>
