<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1905_l.jsp
* ��� : ������Ȳ-��۵��ڰ��� ����Ʈ
* �ۼ����� : 2015-06-18
* �ۼ��� : �弱��
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_POSTDLVRDRDataSet ds = (SS_L_POSTDLVRDRDataSet)request.getAttribute("ds");

    
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
		
	
	// ��ȸ ���
	rxw.makeHugeStart(acctTemp, "listGrid", ds.postrdrlist.size());
	
	for(int i=0; i < ds.postrdrlist.size(); i++)
	{
		SS_L_POSTDLVRDRPOSTRDRLISTRecord postrdrlistRec = (SS_L_POSTDLVRDRPOSTRDRLISTRecord)ds.postrdrlist.get(i);
	
		if(i==0)
		{
			rxw.makeRecordToBulkTitle(postrdrlistRec);
		}
		
		rxw.makeRecordToBulk(postrdrlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
		
	rxw.flush(out);
%>
