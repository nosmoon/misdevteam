<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_send_2511_l.jsp
* ��� : ��޺񸶰�-�������� ��ȸȭ��
* �ۼ����� : 2008-07-29
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-11
* ������ϸ� : ps_send_2511_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // dataset �ν��Ͻ� ����κ�
	PS_L_WEEKSND_CLOSPTCRDataSet ds = (PS_L_WEEKSND_CLOSPTCRDataSet)request.getAttribute("ds");

    // ȭ�鿡 ������ ���μ�
    String pagesize			=	request.getParameter("pagesize");
    String curr_page_no		=	request.getParameter("curr_page_no");
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

