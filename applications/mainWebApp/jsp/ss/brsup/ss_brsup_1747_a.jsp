<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�	: ss_brsup_1747_a.jsp
* ���		: ������������-Billing�ڵ���ü-��û����-�űԽ�û�ʱ�ȭ��
* �ۼ�����	: 2004-03-31
* �ۼ���	: ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-17
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    String concatDelimiter = "##";
    applySession = false;	// ���� ���� ����

    boolean migryn = false;	// �������̱׷��̼� ����
    if("Y".equals(request.getParameter("migryn"))) {
    	migryn = true;
    }
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "bonm", Util.Uni2Ksc(Util.checkString(request.getParameter("bonm"))));
	rxw.add(resTemp, "botel", Util.checkString(request.getParameter("botel")));
	rxw.add(resTemp, "migryn", request.getParameter("migryn"));
	
	int pymtInfoForm = rxw.add(resTemp, "pymtInfoForm", "");
	rxw.add(pymtInfoForm, "shftclsf", "110");
	rxw.add(pymtInfoForm, "rdr_no", request.getParameter("rdr_no"));
	rxw.add(pymtInfoForm, "bocd", request.getParameter("bocd"));
	rxw.add(pymtInfoForm, "accflag", request.getParameter("accflag"));
	
	rxw.makeEmpytList(resTemp, "recpinsttCombo", "����", "");
	rxw.makeEmpytList(resTemp, "cardcmpycdCombo", "����", "");
	rxw.makeEmpytList(resTemp, "aplyyymmCombo", "����", "");
	
	rxw.flush(out);
%>
