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
* ���ϸ� : ss_extn_1595_p.jsp
* ��� : Ȯ����Ȳ-����ISȮ��-������ ����Ʈ
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
	SS_L_RDR_EXTN_ISSTAF_PRINTDataSet ds = (SS_L_RDR_EXTN_ISSTAF_PRINTDataSet)request.getAttribute("ds");
%>
<html>
<head>
</head>
<body>
<table>
 <tr>
  <td colspan=21 height=27><%= Util.convertMonth(ds.getFrdt(),"��")%>�� ���� Ȯ�� �뿪�� û��</td>
 </tr>
 <tr height=18>
  <td>�μ���</td>
  <td>�μ��ڵ�</td>
  <td>��Ʈ</td>
  <td>��Ʈ�ڵ�</td>
  <td>����</td>
  <td>�����ڵ�</td>
  <td>����</td>
  <td>�����ڵ�</td>
  
  <td>�����ȣ</td>
  <td>�����</td>
  <td>�ֹι�ȣ</td>

  <td>����Ʈ(-3)</td>
  <td>����Ʈ(4-6)</td>
  <td>����Ʈ(7-9)</td>
  <td>����Ʈ(10-11)</td>
  <td>����Ʈ(12-)</td>
  <td>����(-3)</td>
  <td>����(4-6)</td>
  <td>����(7-9)</td>
  <td>����(10-11)</td>
  <td>����(12-)</td>
  <td>��(-3)</td>
  <td>��(4-6)</td>
  <td>��(7-9)</td>
  <td>��(10-11)</td>
  <td>��(12-)</td>
  
  <td>�����μ�</td>
  <td>��ü�μ�</td>
 </tr>


<%--��� ����--%>
<%for(int i=0; i<ds.curcommlist.size(); i++){
		SS_L_RDR_EXTN_ISSTAF_PRINTCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_EXTN_ISSTAF_PRINTCURCOMMLISTRecord)ds.curcommlist.get(i);%>
<tr>
	<td><%= curcommlistRec.deptnm%></td>
	<td><%= curcommlistRec.deptcd%></td>
	<td><%= curcommlistRec.partnm%></td>
	<td><%= curcommlistRec.partcd%></td>
	<td><%= curcommlistRec.areanm%></td>
	<td><%= curcommlistRec.areacd%></td>
	<td><%= curcommlistRec.bonm%></td>
	<td><%= curcommlistRec.bocd%></td>
	<td><%= curcommlistRec.stafno%></td>
	<td><%= curcommlistRec.stafnm%></td>
	<td><%= Util.FormatJumin(curcommlistRec.prn)%></td>
	<td><%= Util.comma(curcommlistRec.a1)%></td>
	<td><%= Util.comma(curcommlistRec.a2)%></td>
	<td><%= Util.comma(curcommlistRec.a3)%></td>
	<td><%= Util.comma(curcommlistRec.a5)%></td>
	<td><%= Util.comma(curcommlistRec.a4)%></td>
	<td><%= Util.comma(curcommlistRec.h1)%></td>
	<td><%= Util.comma(curcommlistRec.h2)%></td>
	<td><%= Util.comma(curcommlistRec.h3)%></td>
	<td><%= Util.comma(curcommlistRec.h5)%></td>	
	<td><%= Util.comma(curcommlistRec.h4)%></td>
	<td><%= Util.comma(curcommlistRec.s1)%></td>
	<td><%= Util.comma(curcommlistRec.s2)%></td>
	<td><%= Util.comma(curcommlistRec.s3)%></td>
	<td><%= Util.comma(curcommlistRec.s5)%></td>
	<td><%= Util.comma(curcommlistRec.s4)%></td>
	<td><%= Util.comma(curcommlistRec.corr_qty)%></td>
	<td><%= Util.comma(curcommlistRec.tot_qty)%></td>
</tr>
<%}%>

</table>
</body>
</html>
