<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1350_l.jsp
* ��� : �����濵-�μ����� ��û(�μ����)-��ȸ
* �ۼ����� : 2004-03-18
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-17
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%--
	������ ������ �μ�������û�� �ҳ�(130),�ְ�(110),������(610),����(111) �׸� ���ؼ��� ó���Ѵ�.
	�߰����� ��ü�� ���� ó���� ����  �ּ�ó���� input �Ķ���͸� �����Ѵ�.
	������ ������ �μ�������û ������ ��������� �������ο� ������� ó���Ѵ�.
	�������� ��û�� �������ڸ� prvissudt �׸����� �޾Ƽ� ������ ������ ��������(issudt)�� �Բ� �����Ѵ�.
--%>
<%
	SS_L_QTYAPLCDataSet ds = (SS_L_QTYAPLCDataSet)request.getAttribute("ds");
	//int listCount = 10;		
	int listCount = 5000;
	
	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "totalcnt_f", Util.comma(ds.getTotalcnt()));
	
	//rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
	rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		SS_L_QTYAPLCCURCOMMLISTRecord curcommlistRec = (SS_L_QTYAPLCCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("prvissudt");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(curcommlistRec.issudt);
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>

