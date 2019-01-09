<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_2150_a.jsp
* ��� : Ȯ����Ȳ-����/����-�ʱ�ȭ��
* �ۼ����� : 2009-05-25
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EXTN_EDU_INITDataSet ds = (SS_L_EXTN_EDU_INITDataSet)request.getAttribute("ds");
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "fromDate", Util.getDate()); // �Ⱓ ����
	rxw.add(codeData, "toDate", Util.getDate()); // �Ⱓ ��
	//rxw.add(codeData, "enterDate", Util.getDate()); // �Է�����
	
	//rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "��ü", "", codeData, "mcCombo");          // ��ü
	rxw.makeDataToList(ds, "curaplcpathcd", "cicdnm", "cicodeval", "��ü", "", codeData, "rmsCombo");       // ���
	rxw.makeDataToList(ds, "curextntypecd", "cicdnm", "cicodeval", "��ü", "", codeData, "typeCombo");      // ����	
	rxw.makeDataToList(ds, "cursubscnfmstatcd", "cicdnm", "cicodeval", "��ü", "", codeData, "errorCombo"); // ����
	rxw.makeDataToList(ds, "cureducd", "cicdnm", "cicodeval", codeData, "eduCombo"); // ����
	rxw.makeDataToList(ds, "curjehucd", "cicdnm", "cicodeval", codeData, "jehuCombo"); // ����
	
	//�� ��� ǥ�� 
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//��Ʈ ��� ǥ��
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//���� ��� ǥ��.
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	// ��ü �޺� ó��(�ߺ� ������ ���� �׸���� ǥ��)
	rxw.makeHugeStart(codeData, "mcGrid", ds.curmedicd.size());
	
	for(int i=0; i < ds.curmedicd.size() ; i++)
	{
		SS_L_EXTN_EDU_INITCURMEDICDRecord rec = (SS_L_EXTN_EDU_INITCURMEDICDRecord)ds.curmedicd.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(rec);
		}

		//������ �߰�.
		
		//������ �ʵ� �ڵ�����.		
		rxw.add_ColVal("");
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
		
	rxw.flush(out);	
%>
