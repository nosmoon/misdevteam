<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1850_l.jsp
* ��� : Ȯ����Ȳ-���־���Ʈ����-���־���Ʈ���� ��ȸ
* �ۼ����� : 2009-05-18
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_EXTN_APTDataSet ds = (SS_L_EXTN_APTDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

 	// ��ȸ ���.
    //record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.aptlist.size());
	
	for(int i=0; i < ds.aptlist.size() ; i++)
	{
		SS_L_EXTN_APTAPTLISTRecord curcommlistRec = (SS_L_EXTN_APTAPTLISTRecord)ds.aptlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{		
			rxw.add_ColVal("check");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		
		rxw.add_ColVal("");
		//������ �ʵ� �ڵ�����.		
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
           
	rxw.flush(out);
%>
