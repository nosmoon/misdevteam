<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�        : ss_reader_1720_l.jsp
* ���             : ������Ȳ-���ڰ��� ����ȸ
* �ۼ�����   : 2009-08-07
* �ۼ���        : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
	    // getting dataset
    SS_S_RDR_MNGMEMBDataSet ds = (SS_S_RDR_MNGMEMBDataSet)request.getAttribute("ds");  // request dataset

  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, "rdrmngmemb", resTemp, "detailGrid");
	
	rxw.flush(out);
%>
