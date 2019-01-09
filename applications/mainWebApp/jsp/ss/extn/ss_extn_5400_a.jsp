<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_5400_a.jsp
* ��� : ����Ŀ�Ȯ��-������������(�����ȸ)
* �ۼ����� : 2017-10-11
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_5400_ADataSet ds = (SS_SLS_EXTN_5400_ADataSet)request.getAttribute("ds");
    
    applySession = true;	// ���� ���� ����
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, "codeData", "");	
	
	rxw.add(codeData, "fryymm", Util.getDate().substring(0,6)); // �Ⱓ ����
	rxw.add(codeData, "toyymm", Util.getDate().substring(0,6)); // �Ⱓ ��	
	
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	rxw.makeHugeStart(codeData, "listGrid_extn_gb", ds.curextn_gb.size());
	
	for(int i=0; i < ds.curextn_gb.size() ; i++)
	{
		SS_SLS_EXTN_5400_ACUREXTN_GBRecord curcommlistRec = (SS_SLS_EXTN_5400_ACUREXTN_GBRecord)ds.curextn_gb.get(i);
		
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
