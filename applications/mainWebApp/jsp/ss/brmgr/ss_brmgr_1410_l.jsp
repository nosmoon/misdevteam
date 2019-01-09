<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1410_l.jsp
* ��� : �����濵-�μ����� ��û����(�μ����)-��ȸ
* �ۼ����� : 2004-03-18
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-18
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_QTYAPLC_VEXCDataSet ds = (SS_L_QTYAPLC_VEXCDataSet)request.getAttribute("ds");
	
	// ��û���ڿ� ���������ڵ带 ���Ѵ�.
	String bocd = "";
	String aplcdt = "";
	if(ds.curcommlist.size() > 0){
		SS_L_QTYAPLC_VEXCCURCOMMLISTRecord curcommlistRec = (SS_L_QTYAPLC_VEXCCURCOMMLISTRecord)ds.curcommlist.get(0);
		bocd = curcommlistRec.bocd;
		aplcdt = curcommlistRec.aplcdt;
	}		
	
	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "saveyn", ds.curcommlist.size()>0 ? "Y" : "N");
	rxw.add(resTemp, "bocd", bocd);
	rxw.add(resTemp, "aplcdt", aplcdt);
	
	rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		SS_L_QTYAPLC_VEXCCURCOMMLISTRecord curcommlistRec = (SS_L_QTYAPLC_VEXCCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{ 
			rxw.add_ColVal("checkselect");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal("".equals(curcommlistRec.aplcno) ? "N" : "Y");
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>
 
