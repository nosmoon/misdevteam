<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brmgr_2110_l.jsp
* ��� : ��������-������������-�ʱ�ȭ��
* �ۼ����� : 2013-1-25
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	:  
* ������	: 
* ��������	: 
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_BO_PROXYDataSet ds = (SS_L_BO_PROXYDataSet)request.getAttribute("ds");
    //int spqtyListCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int spqtyListCount = 5000;
    
  	//TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", ""); 
	
	//rxw.add(resTemp, "totalcnt_f", Util.comma(ds.getTotalcnt()));
	//rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	//rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	//rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	//rxw.add(resTemp, "pagesize", spqtyListCount);
	
	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>
