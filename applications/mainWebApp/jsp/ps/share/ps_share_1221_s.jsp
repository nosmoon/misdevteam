<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_share_1221_s.jsp
* ��� : �������� �Խ��� �������� �󼼺���
* �ۼ����� : 2004-02-24
* �ۼ��� : ����ǥ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-04
* ������ϸ� : ps_share_1221_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
    PS_S_INFOEXGDataSet ds_detail = (PS_S_INFOEXGDataSet)request.getAttribute("ds_detail");  // request dataset
    PS_S_SEPBKDataSet ds = (PS_S_SEPBKDataSet)request.getAttribute("ds");    // request dataset

    String curr_page_no = (String)request.getAttribute("curr_page_no");
    if(curr_page_no == null) {curr_page_no = "1";}
    String records_per_page = (String)request.getAttribute("records_per_page");
    if(records_per_page == null) {records_per_page = "10";}

    String rmsgexttcd = Util.checkString((String)request.getAttribute("rmsgexttcd"));
    String search_word = Util.checkString((String)request.getAttribute("search_word"));
    String search_word_kind = Util.checkString((String)request.getAttribute("search_word_kind"));

	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    rxw.makeDataToList(ds, "rmsgexttcdcur", "cicdnm", "cicodeval", acctTemp, "rmsCombo"); // ���Ź���
    // ��ȸ ���.
   	rxw.makeDataToBulk(ds_detail, acctTemp, "infoGrid");
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
