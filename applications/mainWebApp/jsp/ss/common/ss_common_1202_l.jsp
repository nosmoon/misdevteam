<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_common_1201_l.jsp
* 기능 : 
* 작성일자 : 
* 작성자 :
---------------------------------------------------------------------------------------------------%>

<%
	 // getting dataset
    CO_L_NEW_ADDRDataSet ds = (CO_L_NEW_ADDRDataSet)request.getAttribute("ds");  // request dataset

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		CO_L_NEW_ADDRCURCOMMLISTRecord curcommlistRec = (CO_L_NEW_ADDRCURCOMMLISTRecord)ds.curcommlist.get(i);
	
		if(i == 0)
		{	
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		rxw.makeRecordToBulk(curcommlistRec, false);

	}
	
	rxw.makeHugeEnd();

	rxw.flush(out);
%>
