<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_2411_l.jsp
* ��� : �ְ���������-���긶��-��������
* �ۼ����� : 2007-11-01
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 20090209
* ������ϸ� : ps_send_2411_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // dataset �ν��Ͻ� ����κ�
	PS_L_WEEKSND_CLOSPTCRDataSet ds = (PS_L_WEEKSND_CLOSPTCRDataSet)request.getAttribute("ds");

    // ȭ�鿡 ������ ���μ�

    String pagesize			=	request.getParameter("pagesize");
    String curr_page_no			=	request.getParameter("curr_page_no");
    String totalcnt			=	String.valueOf(ds.getTotalcnt());
    String js_fn_nm			=	request.getParameter("js_fn_nm");
	int no_pagesize			=	Integer.parseInt(pagesize) - ds.closptcrcur.size();

	RwXmlWrapper rxw = new RwXmlWrapper();

    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
    
    // ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
   	rxw.makeDataToBulk(ds, "closptcrcur", acctTemp, "infoGrid");
    
	rxw.flush(out);
	
    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
    
%>

