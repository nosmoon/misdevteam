<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2510_l.jsp
* ��� : �������������ý���-���˹�������-�����ȸ
* �ۼ����� : 2009-04-29
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	:
* ������	: 
* ��������	: 
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_TASLM_BNSITEMINOUTDataSet ds = (SS_L_TASLM_BNSITEMINOUTDataSet)request.getAttribute("ds");

	String jobcd = request.getParameter("jobcd");
	
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");

	rxw.makeHugeStart(resTemp, "listGrid", ds.bnsiteminout.size());
	for(int i=0; i<ds.bnsiteminout.size(); i++){
		SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord bnsiteminoutRec = (SS_L_TASLM_BNSITEMINOUTBNSITEMINOUTRecord)ds.bnsiteminout.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("total");
			rxw.makeRecordToBulkTitle(bnsiteminoutRec);
		}
		rxw.add_ColVal(Double.parseDouble(bnsiteminoutRec.mainware)+Double.parseDouble(bnsiteminoutRec.pyungware)+Double.parseDouble(bnsiteminoutRec.sungware));
		rxw.makeRecordToBulk(bnsiteminoutRec, false);
	}

	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
