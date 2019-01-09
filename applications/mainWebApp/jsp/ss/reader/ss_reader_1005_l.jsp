<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1005_l.jsp
* ��� : ������Ȳ-��������-���ڰ˻� ���
* �ۼ����� : 2003-12-26
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-10
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_SRCHDataSet ds = (SS_L_RDR_SRCHDataSet)request.getAttribute("ds");
    int rdrsrchListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", rdrsrchListCount);
	rxw.add(resTemp, "totalcnt_f", Util.comma(ds.getTotalcnt()));
	
	rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	String tempStr = "";
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		SS_L_RDR_SRCHCURCOMMLISTRecord curcommlistRec = (SS_L_RDR_SRCHCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("rdrtel");
			rxw.add_ColVal("tel");
			rxw.add_ColVal("addr");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(Util.getChainStr(curcommlistRec.rdrtel_no1, curcommlistRec.rdrtel_no2, curcommlistRec.rdrtel_no3, "-"));
		rxw.add_ColVal(Util.getChainStr(curcommlistRec.tel_no11, curcommlistRec.tel_no12, curcommlistRec.tel_no13, "-"));
		rxw.add_ColVal(curcommlistRec.dlvaddr + " " + curcommlistRec.dlvdtlsaddr);
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
