<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1010_l.jsp
* ��� : �����濵-�����μ���Ȳ-��
* �ۼ����� : 2004-03-15
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : ������ ����� Ŭ������ �� �ش������� ����϶��� �����ִ� �˾��� ����. �ణ ���� ������ ���ش�.
* ������ : ��뼷
* �������� : 20041208
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-12
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
	SS_L_BOSENDPCONDDataSet ds = (SS_L_BOSENDPCONDDataSet)request.getAttribute("ds");
    //int listCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int listCount = 5000;
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", listCount);
	
	//rxw.makeDataToBulk(ds, resTemp, "summary");
	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
	
	//1. dataset�� xml�� ��ȯ.
	rxw.makeHugeStart(resTemp, "summary");
	rxw.add_ColVal("thmmvalqtydiff_f");
	rxw.add_ColVal("aftcnt_totdiff_f");
	rxw.add_ColVal("realtotdiff_f");
	rxw.add_ColVal("totalcnt_f");
	rxw.add_ColVal("bo_yymm_f");
	//������ �ʵ�� �ڵ� ����.
	rxw.makeRecordToBulkTitle(ds);
	//������ �߰�.
	rxw.add_ColVal(Util.comma(ds.getThmmvalqtydiff()));	//format #,###������ -���� ǥ�� �ȵǴ� ������ ���� ���⼭ �����Ͽ� �־���.
	rxw.add_ColVal(Util.comma(ds.getAftcnt_totdiff()));
	rxw.add_ColVal(Util.comma(ds.getRealtotdiff()));
	rxw.add_ColVal(Util.comma(ds.getTotalcnt()));
	rxw.add_ColVal(Util.convertMonthS(ds.getBo_yymm()));
	//������ �ʵ� �ڵ�����.
	rxw.makeRecordToBulk(ds, false);
	rxw.makeHugeEnd();
	
	//2. record�� xml�� ��ȯ.
	rxw.makeHugeStart(resTemp, "listGrid", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size(); i++)
	{
		SS_L_BOSENDPCONDCURCOMMLISTRecord curcommlistRec = (SS_L_BOSENDPCONDCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("bonm_f");
			rxw.add_ColVal("thmmvalqtydiff_f");
			rxw.add_ColVal("aftcnt_totdiff_f");
			rxw.add_ColVal("realtotdiff_f");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal(Util.getCutStr(curcommlistRec.bonm, 3));
		rxw.add_ColVal(Util.comma(curcommlistRec.thmmvalqtydiff));
		rxw.add_ColVal(Util.comma(curcommlistRec.aftcnt_totdiff));
		rxw.add_ColVal(Util.comma(curcommlistRec.realtotdiff));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>

