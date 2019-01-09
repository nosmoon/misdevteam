<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1710_l.jsp
* ��� : ��������-������������-���
* �ۼ����� : 2004-03-19
* �ۼ��� : �迵��
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-14
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_MOVMWORKDataSet ds = (SS_L_RDR_MOVMWORKDataSet)request.getAttribute("ds");
    //int movmListCount = 10;	// �� ȭ��� ����Ʈ �׸� ��
    int movmListCount = 5000;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", movmListCount);
	rxw.add(resTemp, "totalcnt_f", Util.comma(ds.getTotalcnt()));
	
	rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		SS_L_RDR_MOVMWORKCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_MOVMWORKCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{ 
			rxw.add_ColVal("isReadOnly");
			rxw.add_ColVal("idx");
			rxw.add_ColVal("medabasidt_f");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal("20".equals(curcommlistRec.procstat) ? "N" : "Y");
		rxw.add_ColVal("");
		rxw.add_ColVal(Util.convertS(curcommlistRec.medabasidt));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>

