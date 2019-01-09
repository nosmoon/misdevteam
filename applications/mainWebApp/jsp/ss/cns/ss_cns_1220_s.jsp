<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1120_s.jsp
* ��� : ����-���� ��
* �ۼ����� : 2004-07-15
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-04-07
* ������ϸ� : ss_cns_1220_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_RDR_DSCTDataSet ds = (SS_S_RDR_DSCTDataSet)request.getAttribute("ds");

	ArrayList botel = getTokens(ds.getBotel(), "-");

	String telno1 = "";
	String telno2 = "";
	String telno3 = "";
	try{
		telno1 = (String)botel.get(0);
		telno2 = (String)botel.get(1);
		telno3 = (String)botel.get(2);
	}catch(Exception e){
		telno1 = "";
		telno2 = "";
		telno3 = "";
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "path_id",  ds.getAcpnpathcdnm()); //��û���
	rxw.add(resTemp, "acpndt_id",  Util.Timestamp2Str(ds.getAcpndt(),"yyyy-MM-dd' 'HH:mm:ss")); //�����Ͻ�
	rxw.add(resTemp, "rdremail",  ds.getEmail()); //�̸���
	rxw.add(resTemp, "telno1",  telno1); //������ȭ��ȣ1
	rxw.add(resTemp, "telno2",  telno2); //������ȭ��ȣ2
	rxw.add(resTemp, "telno3",  telno3); //������ȭ��ȣ3
	rxw.add(resTemp, "boprocyn_id",  Util.convertNull(ds.getBocnfmyn(),"N")); //������ ó������
	rxw.add(resTemp, "boprocdt_id",  Util.Timestamp2Str(ds.getBoprocdt(),"yyyy-MM-dd' 'HH:mm:ss")); //������ ó���Ͻ�
	rxw.add(resTemp, "cnscnfmtm_id",  Util.Timestamp2Str(ds.getCns_empcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //���� �Ͻ�
	rxw.add(resTemp, "remk",  ds.getCns_empremk()); //���� ���
	rxw.add(resTemp, "cns_empcnfmyn",  ds.getCns_empcnfmyn()); //���� Ȯ�ο������ؼ�.
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>