<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ss_brsup_2420_l.jsp
* ���     : �ְ���������-���긶��-��������
* �ۼ����� : 2007-04-16
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
	SS_L_WEEKSND_CLOSPTCRDataSet ds = (SS_L_WEEKSND_CLOSPTCRDataSet)request.getAttribute("ds");

	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "records_per_page", request.getParameter("pagesize"));
	rxw.add(resTemp, "totalcnt_f", Util.comma(ds.getTotalcnt()));
	
	rxw.makeDataToBulk(ds, "closptcrcur", resTemp, "listGrid");
	
	rxw.flush(out);
%>
