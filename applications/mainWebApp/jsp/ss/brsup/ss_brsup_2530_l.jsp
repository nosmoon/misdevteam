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

	SS_S_DETASLM_BNSITEMINOUTDataSet ds = (SS_S_DETASLM_BNSITEMINOUTDataSet)request.getAttribute("ds");
	
	String jobcd = request.getParameter("jobcd");
	
	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "fromDate", Util.getDate()); // �Ⱓ ����
	rxw.add(resTemp, "toDate", Util.getDate()); // �Ⱓ ��
  	
	rxw.makeHugeStart(resTemp, "detailGrid", ds.detailsearch.size());
	
	for(int i=0; i<ds.detailsearch.size(); i++){
		
		SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord detailsearchRec = (SS_S_DETASLM_BNSITEMINOUTDETAILSEARCHRecord)ds.detailsearch.get(i);
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("inMoney");
			rxw.add_ColVal("outMoney");
			rxw.add_ColVal("oldSum");
			
			rxw.makeRecordToBulkTitle(detailsearchRec);
		}
		rxw.add_ColVal(Util.comma(detailsearchRec.uprc * detailsearchRec.qunt));
		rxw.add_ColVal(Util.comma(detailsearchRec.uprc * detailsearchRec.valqunt));
		rxw.add_ColVal(Double.parseDouble(detailsearchRec.mainware)+Double.parseDouble(detailsearchRec.pyungware)+Double.parseDouble(detailsearchRec.sungware));
		rxw.makeRecordToBulk(detailsearchRec, false);
	}

	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
