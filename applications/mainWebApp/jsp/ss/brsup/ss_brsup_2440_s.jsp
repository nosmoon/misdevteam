<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ss_brsup_2440_s.jsp
* ���     : �ְ���������-���긶��-��������-ȣ���� �� ��ȸ
* �ۼ����� : 2007-08-29
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-03
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    applySession			=	true;    	//���� ���� ����

    // dataset �ν��Ͻ� ����κ�
	SS_L_WEEKSND_CLOSPTCR_SERNODataSet ds = (SS_L_WEEKSND_CLOSPTCR_SERNODataSet)request.getAttribute("ds");

    String js_fn_nm			=	request.getParameter("js_fn_nm");
	int no_pagesize			=	10 - ds.closptcrcur.size();
	
	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "closptcrcur", root, "detailGrid");
	/*rxw.makeHugeStart(root, "detailGrid", ds.closptcrcur.size());
	for(int i=0; i < ds.closptcrcur.size(); i++)
	{
		SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord closptcrcurRec = (SS_L_WEEKSND_CLOSPTCR_SERNOCLOSPTCRCURRecord)ds.closptcrcur.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(closptcrcurRec);
		}
		
		//������ �߰�.
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(closptcrcurRec, false);
	}
	rxw.makeHugeEnd();*/
	
	rxw.flush(out);
%>
