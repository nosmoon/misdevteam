<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_send_2421_s.jsp
* ���     : �ְ���������-���긶��-��������-ȣ���� �� ��ȸ
* �ۼ����� : 2007-11-01
* �ۼ���   : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 20090209
* ������ϸ� : ps_send_2421_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // dataset �ν��Ͻ� ����κ�
	PS_L_WEEKSND_CLOSPTCR_SERNODataSet ds = (PS_L_WEEKSND_CLOSPTCR_SERNODataSet)request.getAttribute("ds");
	
    String js_fn_nm			=	request.getParameter("js_fn_nm");
	int no_pagesize			=	10 - ds.closptcrcur.size();
	
	RwXmlWrapper rxw = new RwXmlWrapper();

    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
    
    // rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
    // ��ȸ ���.
    
   	rxw.makeDataToBulk(ds, "closptcrcur", acctTemp, "detailGrid");
   	
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
    
%>
