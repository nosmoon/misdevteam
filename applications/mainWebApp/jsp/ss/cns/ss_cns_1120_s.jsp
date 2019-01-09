<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_cns_1120_s.jsp
* ��� : ����-�̻�-��
* �ۼ����� : 2004-07-15
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����.
* ������   : ����
* �������� : 2009-04-02
* ������ϸ� : ss_cns_1120_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_MOVM_RDRDataSet ds = (SS_S_MOVM_RDRDataSet)request.getAttribute("ds");
    StringBuffer mediqty = new StringBuffer("");
	for(int i=0; i<ds.curmediqty.size(); i++){
		SS_S_MOVM_RDRCURMEDIQTYRecord curmediqtyRec = (SS_S_MOVM_RDRCURMEDIQTYRecord)ds.curmediqty.get(i);
		mediqty.append(curmediqtyRec.medinm);
		mediqty.append("- [ ");
		mediqty.append(curmediqtyRec.qty);
		mediqty.append(" ] ");
	}
	ArrayList botel = getTokens(ds.getTrfsbo_tel(), "-");
	ArrayList bo2tel = getTokens(ds.getAcptbo_tel(), "-");

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
		telno12 = (String)bo2tel.get(0);
		telno22 = (String)bo2tel.get(1);
		telno32 = (String)bo2tel.get(2);
	}catch(Exception e){
		telno1 = "";
		telno2 = "";
		telno3 = "";
		telno12 = "";
		telno22 = "";
		telno32 = "";	
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "path_id",  ds.getAplcpathnm()); //��û���
	rxw.add(resTemp, "mediqty_id",  mediqty.toString()); //��ü/�μ�
	rxw.add(resTemp, "bocnfm_id",  ds.getTrsfbocnfmyn()); //�ΰ����� Ȯ�ο���
	rxw.add(resTemp, "bocmfmtm_id",  Util.Timestamp2Str(ds.getTrsfbocnfmdt_tm(),"yyyy-MM-dd' 'HH:mm:ss")); //�ΰ����� �Ͻ�
	rxw.add(resTemp, "bo2cnfm_id",  Util.convertNull(ds.getAcptbocnfmyn(),"N")); //�μ����� Ȯ�ο���
	rxw.add(resTemp, "bo2cmfmtm_id",  Util.Timestamp2Str(ds.getAcptbocnfmdt_tm(),"yyyy-MM-dd' 'HH:mm:ss")); //�μ����� �Ͻ�
	rxw.add(resTemp, "cns_empnm_id",  ds.getCns_empnm()); //���� �̸�
	rxw.add(resTemp, "cnscnfmtm_id",  Util.Timestamp2Str(ds.getCns_empcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //���� �Ͻ�
	rxw.add(resTemp, "telno1",  telno1); //������ȭ��ȣ1
	rxw.add(resTemp, "telno2",  telno2); //������ȭ��ȣ2
	rxw.add(resTemp, "telno3",  telno3); //������ȭ��ȣ3
	rxw.add(resTemp, "telno12",  telno12); //�̻��� ���� ������ȭ��ȣ1
	rxw.add(resTemp, "telno22",  telno22); //�̻��� ���� ������ȭ��ȣ2
	rxw.add(resTemp, "telno32",  telno32); //�̻��� ���� ������ȭ��ȣ3	
	rxw.add(resTemp, "cns_empcnfmyn",  ds.getCns_empcnfmyn()); //���� Ȯ�ο������ؼ�.
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>