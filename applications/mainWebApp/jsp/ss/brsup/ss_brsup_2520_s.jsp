<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_2520_s.jsp
* ��� : �������������ý���-���˹�������-��ȭ��
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

	SS_S_TASLM_BNSITEMINOUTDataSet ds = (SS_S_TASLM_BNSITEMINOUTDataSet)request.getAttribute("ds");

	String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // ȸ���ڵ�

	String jobcd = request.getParameter("jobcd");
	
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "fromDate", Util.getDate()); // �Ⱓ ����
	rxw.add(resTemp, "toDate", Util.getDate()); // �Ⱓ ��
	
	rxw.makeHugeStart(resTemp, "detailGrid", ds.detailinout.size());
	for(int i=0; i<ds.detailinout.size(); i++){
		SS_S_TASLM_BNSITEMINOUTDETAILINOUTRecord detailinoutRec = (SS_S_TASLM_BNSITEMINOUTDETAILINOUTRecord)ds.detailinout.get(i);
		//title �߰�.

		if(i == 0)
		{
			rxw.add_ColVal("inMoney");
			rxw.add_ColVal("outMoney");
			rxw.add_ColVal("oldSum");
						
			rxw.makeRecordToBulkTitle(detailinoutRec);
		}
		//rxw.add_ColVal(Util.comma(detailinoutRec.uprc * detailinoutRec.qunt));
		rxw.add_ColVal(Util.comma(detailinoutRec.uprc * detailinoutRec.qunt));
		rxw.add_ColVal(Util.comma(detailinoutRec.uprc * detailinoutRec.valqunt));
		rxw.add_ColVal(Double.parseDouble(detailinoutRec.mainware)+Double.parseDouble(detailinoutRec.pyungware)+Double.parseDouble(detailinoutRec.sungware));
//		rxw.add_ColVal(Integer.parseInt(detailinoutRec.mainware)+Integer.parseInt(detailinoutRec.pyungware)+Integer.parseInt(detailinoutRec.sungware));

		rxw.makeRecordToBulk(detailinoutRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
