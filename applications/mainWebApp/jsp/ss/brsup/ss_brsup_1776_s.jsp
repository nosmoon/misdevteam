<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1776_s.jsp
* ��� : ������������-Billing�ڵ���ü-û������-��ü���к� û�����
* �ۼ����� : 2004-04-17
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ����
* ������	: ����
* ��������	: 2009-03-09
* ������ϸ�: ss_brsup_1776_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_SHFT_CLAM_SSUMDataSet ds = (SS_S_SHFT_CLAM_SSUMDataSet)request.getAttribute("ds");
	//int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
	int moveListCount = 5000;
	RwXmlWrapper rxw = new RwXmlWrapper();

	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
		
		//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.rsltcur.size());
	
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_S_SHFT_CLAM_SSUMRSLTCURRecord rsltcurRec = (SS_S_SHFT_CLAM_SSUMRSLTCURRecord)ds.rsltcur.get(i);
	
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("send_shftclam");
			rxw.add_ColVal("receive_shftclam");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rsltcurRec);
 			
		}
		
		//if( session.getAttribute("uid").equals("c192044")){
		if( session.getAttribute("uid").equals("i0212")){
			rxw.add_ColVal(rsltcurRec.basidt+","+rsltcurRec.shftclsfcd);
			rxw.add_ColVal(rsltcurRec.basidt+","+rsltcurRec.shftclsfcd);
		}else{
			rxw.add_ColVal("-");
			rxw.add_ColVal("-");
		}
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>