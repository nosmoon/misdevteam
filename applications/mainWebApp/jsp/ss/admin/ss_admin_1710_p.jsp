<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1710_p.jsp
* 기능 : 
* 작성일자 : 2017-10-17
* 작성자 : 민기홍
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_NEWJUSO_APPR_HISDataSet ds = (SS_L_NEWJUSO_APPR_HISDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "resTemp");
	
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curhislist.size());
	
	for(int i=0; i < ds.curhislist.size() ; i++)
	{
		SS_L_NEWJUSO_APPR_HISCURHISLISTRecord rec = (SS_L_NEWJUSO_APPR_HISCURHISLISTRecord)ds.curhislist.get(i);
		System.out.println(rec.getChgpers());
		
		if(i == 0)
		{
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(rec);
		}
	
		rxw.add_ColVal("");
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
	
%>