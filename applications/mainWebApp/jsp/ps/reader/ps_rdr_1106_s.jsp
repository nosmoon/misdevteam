<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1106_s.jsp
* ���     : Ȯ�嵶�ڰ��� Ȯ�嵶�� �� Link
* �ۼ����� : 2004-02-26
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������
* �������� : 2009-02-18
* ������ϸ� : ps_rdr_1106_s.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    //���ó�¥
    String toDate      = Util.getDate2();

    //dataset �ν��Ͻ� ����κ�
	PS_S_RDR_EXTNDataSet ds = (PS_S_RDR_EXTNDataSet)request.getAttribute("ds");

    //Ȯ�嵶������ dataset
    PS_S_RDR_EXTNRDREXTNINFOCURRecord rdrextninfocurRec = null;
    boolean  rdrChk = false;            //Ȯ�嵶�� ����Ÿ ����üũ

    if (ds.rdrextninfocur.size() > 0) {
        rdrextninfocurRec = (PS_S_RDR_EXTNRDREXTNINFOCURRecord)ds.rdrextninfocur.get(0);
        rdrChk  =  true;
    }
    
	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// ��ȸ ���.
	rxw.makeDataToBulk(ds, "rdrextninfocur", acctTemp, "detailGrid");
		
	rxw.flush(out);
	
	// data�� ���� ��� ó��. �߰� �ʿ�.
%>

