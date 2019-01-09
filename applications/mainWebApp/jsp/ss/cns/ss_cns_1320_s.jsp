<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1220_s.jsp
* ��� : ������Ȳ-VacationStop ��û ��ȭ��
* �ۼ����� : 2004-01-16
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-04-09
* ������ϸ� : ss_cns_1320_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_VSDataSet ds = (SS_S_VSDataSet)request.getAttribute("ds");
	
	ArrayList botel = getTokens(ds.getBotel(), "-");
	ArrayList bo2tel = getTokens(ds.getVaca_areabotel(), "-");
	String telno1 = "";
	String telno2 = "";
	String telno3 = "";
	String telno12 = "";
	String telno22 = "";
	String telno32 = "";
	try{
		telno1 = (String)botel.get(0);
		telno2 = (String)botel.get(1);
		telno3 = (String)botel.get(2);
	}catch(Exception e){
		telno1 = "";
		telno2 = "";
		telno3 = "";
	}		
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
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "path_id",  ds.getAplcpathnm()); //��û���
	rxw.add(resTemp, "bocnfm_id",  Util.convertNull(ds.getBocnfmyn(),"N")); //�Ҽ�����Ȯ��
	rxw.add(resTemp, "bo2cnfm_id",  Util.convertNull(ds.getVaca_areadlvofficnfmyn(),"N")); //�ް�������Ȯ��
	rxw.add(resTemp, "cns_empnm_id",  ds.getCns_empnm()); //�����̸�
	rxw.add(resTemp, "cns_empcnfmyn",  ds.getCns_empcnfmyn()); //���� Ȯ�ο������ؼ�.
	rxw.add(resTemp, "cnscnfmtm_id",  Util.Timestamp2Str(ds.getCns_empcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //�����Ͻ�
	rxw.add(resTemp, "remk",  ds.getCns_empremk()); //�������
	rxw.add(resTemp, "vaca_areadlvoffiremk",  ds.getVaca_areadlvoffiremk()); //�ް����������
	rxw.add(resTemp, "boremk",  ds.getBoremk()); //�������
	rxw.add(resTemp, "telno1",  telno1); //������ȭ��ȣ1
	rxw.add(resTemp, "telno2",  telno2); //������ȭ��ȣ2
	rxw.add(resTemp, "telno3",  telno3); //������ȭ��ȣ3
	rxw.add(resTemp, "telno12",  telno12); //�ް���������ȭ1
	rxw.add(resTemp, "telno22",  telno22); //�ް���������ȭ2
	rxw.add(resTemp, "telno32",  telno32); //�ް���������ȭ3
	//rxw.add(resTemp, "dlvhopedt",  ds.getSpcfdlvdt()); //Ư�������

	rxw.makeDataToList(ds, "curvaca_areacd", "vaca_areanm", "vaca_areacd", resTemp, "vacaCombo"); // �ް���
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>