<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4600_a.jsp
* ��� : ����Ŀ�Ȯ��-��Ϲ���ȸ
* �ۼ����� : 2016-02-15
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_4600_ADataSet ds = (SS_SLS_EXTN_4600_ADataSet)request.getAttribute("ds");
    
    applySession = true;	// ���� ���� ����
    
    String resPath = request.getParameter("res_path");
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, resPath, "");	
	
	rxw.add(codeData, "fromDate", Util.getDate()); // �Ⱓ ����
	rxw.add(codeData, "toDate", Util.getDate()); // �Ⱓ ��	
	
	rxw.makeDataToList(ds, "curaplcpathcd", "cicdnm", "cicodeval", "��ü", "", codeData, "rmsCombo"); // ���
	rxw.makeDataToList(ds, "curextntypecd", "cicdnm", "cicodeval", "��ü", "", codeData, "typeCombo"); // ����
	rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "��ü", "", codeData, "mcCombo"); // ��ü
	rxw.makeDataToList(ds, "cursubscnfmstatcd", "cicdnm", "cicodeval", "��ü", "", codeData, "errorCombo"); // ����
	rxw.makeDataToList(ds, "curdncomp", "cicdnm", "cicodeval", "��ü", "", codeData, "dncompCombo"); // �볳���
	rxw.makeDataToList(ds, "curextn_gb", "cicdnm", "cicodeval", codeData, "extngbCombo"); // Ȯ�屸��
		
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.makeHugeStart(codeData, "listGrid_extn_gb", ds.curextn_gb.size());
	
	for(int i=0; i < ds.curextn_gb.size() ; i++)
	{
		SS_SLS_EXTN_4600_ACUREXTN_GBRecord curcommlistRec = (SS_SLS_EXTN_4600_ACUREXTN_GBRecord)ds.curextn_gb.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			//������ �ʵ�� �ڵ� ����.
			rxw.add_ColVal("check");			
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		rxw.add_ColVal("N");
		rxw.makeRecordToBulk(curcommlistRec, false);		
	}
	
	rxw.makeHugeEnd();

	rxw.flush(out);	
%>
