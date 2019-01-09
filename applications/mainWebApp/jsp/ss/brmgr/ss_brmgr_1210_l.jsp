<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1210_l.jsp
* ��� : �����濵-�μ����� ������û(���)-��ȸ
* �ۼ����� : 2004-03-18
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-16
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: ȭ�� ���� ��û �ݿ�.
* ������	: Ȳ����
* ��������	: 2009-07-21
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
	//int listCount = 10;		
	int listCount = 5000;
	SS_L_QTYAPLC_MAIN_NWSPDataSet ds = (SS_L_QTYAPLC_MAIN_NWSPDataSet)request.getAttribute("ds");
	
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
		SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord curcommlistRec = (SS_L_QTYAPLC_MAIN_NWSPCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("chk");
			rxw.add_ColVal("deliveryqty_org");
			rxw.add_ColVal("realrdrrate_org");
			rxw.add_ColVal("deliveryqty_chg");
			rxw.add_ColVal("realrdrrate_chg");
			rxw.add_ColVal("realtot_chg");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal("N");
		rxw.add_ColVal(curcommlistRec.iygwmgbs+curcommlistRec.iygwygbs);
		rxw.add_ColVal(curcommlistRec.iygwmgbs+curcommlistRec.iygwygbs==0 ? 0 : Math.round(1.0f*curcommlistRec.realtot/(curcommlistRec.iygwmgbs+curcommlistRec.iygwygbs)*10000)/100.0f);
		rxw.add_ColVal(curcommlistRec.aft_iygwmgbs+curcommlistRec.aft_iygwygbs);
		rxw.add_ColVal(curcommlistRec.aft_iygwmgbs+curcommlistRec.aft_iygwygbs==0 ? 0 : Math.round(1.0f*curcommlistRec.realtot/(curcommlistRec.aft_iygwmgbs+curcommlistRec.aft_iygwygbs)*10000)/100.0f);
		rxw.add_ColVal(curcommlistRec.realtot);
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
