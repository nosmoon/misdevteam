<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2280_a.jsp
* ��� : Ȯ����Ȳ-�ϰ�Ȯ�� ���
* �ۼ����� : 2011-03-30
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	:
* ������	: 
* ��������	:
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_A_BATCH_EXTNDataSet ds = (SS_A_BATCH_EXTNDataSet)request.getAttribute("ds");
	int extnmovmListCount = 10;
	
  applySession = true;	// ���� ���� ����

	//TrustForm ó�� ����
  RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	/*
	rxw.add(codeData, "applySession", String.valueOf(applySession));

	if(frdt.equals("")){
		rxw.add(codeData, "defalutDate", Util.getYear() + Util.getMonth());
	} else {
		rxw.add(codeData, "defalutDate", frdt);
	}
		
	rxw.makeDataToList(ds, "curtype1", "name", "code", "��ü", "", codeData, "type1"); // Ȯ������1
	rxw.makeDataToList(ds, "curtype2", "name", "code", "��ü", "", codeData, "type2"); // Ȯ������2 
	rxw.makeDataToList(ds, "curresitype", "name", "code", "��ü", "", codeData, "resitype"); // �ְ����� 
	rxw.makeDataToList(ds, "aplcpath", "name", "code", "��ü", "", codeData, "aplcpath"); // ��û���
	rxw.makeDataToList(ds, "suspresncd", "name", "code", "��ü", "", codeData, "suspresncd"); // ��������
	*/
	rxw.flush(out);
%>


