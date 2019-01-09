<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_cns_1307_s.jsp
* ��� :  ����-VacationStop-�ް���������� ��������
* �ۼ����� : 2004-07-15
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-04-09
* ������ϸ� : ss_cns_1307_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SL_S_VS_AREABODataSet ds = (SL_S_VS_AREABODataSet)request.getAttribute("ds");
	ArrayList bo2tel = getTokens(ds.getVaca_areabotel(), "-");

	String telno12 = "";
	String telno22 = "";
	String telno32 = "";
	try{
		telno12 = (String)bo2tel.get(0);
		telno22 = (String)bo2tel.get(1);
		telno32 = (String)bo2tel.get(2);
	}catch(Exception e){
		telno12 = "";
		telno22 = "";
		telno32 = "";	
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int dataTemp = rxw.add(root, "dataTemp", "");
	
	rxw.add(dataTemp, "bocd2",  ds.vaca_areabocd);  //�ް�����������ڵ�
	rxw.add(dataTemp, "bonm2",  ds.vaca_areabonm); //�ް������������
	rxw.add(dataTemp, "telno12",  telno12); //�ް���������� ��ȭ��ȣ1
	rxw.add(dataTemp, "telno22",  telno22); //�ް���������� ��ȭ��ȣ2
	rxw.add(dataTemp, "telno32",  telno32); //�ް���������� ��ȭ��ȣ3
	
	rxw.flush(out);
%>