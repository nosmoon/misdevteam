<%@ page contentType="application/vnd.ms-excel; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1786_l.jsp
* ��� : ������������-Billing�ڵ���ü-��û���-�����ȸ(���� �ٿ�ε�)
* �ۼ����� : 2004-04-26
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-03
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>

<%
	response.setHeader("Content-Disposition", "attachment; filename=SSBRSUP1789.xls");

	SS_L_SHFTAPLC_CNFM_STCSDataSet ds = (SS_L_SHFTAPLC_CNFM_STCSDataSet)request.getAttribute("ds");
%>
<!--list-->
<table id="body_id" width="830" border="0" cellpadding="1" cellspacing="0"  align="center" class="gray" bgcolor="#FFFFFF">
  <tr align="center" bgcolor="#dddddd" >
    <td class="gray" rowspan="2" width="83">����</td>
    <td class="gray" rowspan="2" width="83">����</td>
    <td width="136" class="gray" rowspan="2">��ȭ��ȣ</td>
    <td  colspan="3" class="gray">���� �ڵ���ü</td>
    <td colspan="3" class="gray">DOī�� �ڵ���ü</td>
    <td colspan="3" class="gray">�Ϲ�ī�� �ڵ���ü</td>
  </tr>
  <tr align="center" bgcolor="#dddddd" >
    <td class="gray" width="56" >��ü</td>
    <td class="gray" width="56">Ȯ��</td>
    <td class="gray" width="56">��Ȯ��</td>
    <td class="gray" width="56">��ü</td>
    <td class="gray" width="56" >Ȯ��</td>
    <td class="gray" width="56">��Ȯ��</td>
    <td class="gray" width="56">��ü</td>
    <td class="gray" width="56">Ȯ��</td>
    <td class="gray" width="56" >��Ȯ��</td>
  </tr>
<%
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord rsltcurRec = (SS_L_SHFTAPLC_CNFM_STCSRSLTCURRecord)ds.rsltcur.get(i);%>
  <tr>
    <td class="gray" width="45" ><%= rsltcurRec.areanm%></td>
    <td class="gray" width="45"><%= rsltcurRec.bonm%></td>
    <td class="gray"><%= rsltcurRec.tel_no%></td>
    <td class="gray" align="right" ><%= rsltcurRec.jd_a_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.jd_b_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.jd_c_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.dd_a_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.dd_b_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.dd_c_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.pd_a_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.pd_b_cnt%>&nbsp;</td>
    <td class="gray" align="right" ><%= rsltcurRec.pd_c_cnt%>&nbsp;</td>
  </tr>
<%}%>
</table>