<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_1610_l.jsp
* ��� : �����濵-�������μ���Ȳ-���
* �ۼ����� : 2004-03-12
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-14
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_QTY_SPDataSet ds = (SS_L_QTY_SPDataSet)request.getAttribute("ds");
    //int spqtyListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int spqtyListCount = 5000;
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", ""); 
	
	rxw.add(resTemp, "totalcnt_f", Util.comma(ds.getTotalcnt()));
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", spqtyListCount);
	
	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>
