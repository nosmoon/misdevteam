<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_4620_l.jsp
* ��� : ������� ��ȸ
* �ۼ����� : 2016-02-17
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :
* ������ : 
* �������� :
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_4620_LDataSet ds = (SS_SLS_EXTN_4620_LDataSet)request.getAttribute("ds");
   
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // ��ȸ ���.
  	//rxw.makeDataToBulk(ds, "curmodlist", resTemp, "listGrid");
    
    //record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
    rxw.makeHugeStart(resTemp, "listGrid", ds.curmodlist.size());

	for(int i=0; i < ds.curmodlist.size() ; i++)
	{
		SS_SLS_EXTN_4620_LCURMODLISTRecord rec = (SS_SLS_EXTN_4620_LCURMODLISTRecord)ds.curmodlist.get(i);
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("check");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}

		rxw.add_ColVal("");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>


