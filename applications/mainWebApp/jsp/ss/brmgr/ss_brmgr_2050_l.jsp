<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�        : ss_brmgr_2050_l.jsp
* ���             : ����Ʈ ���Է� ����Ʈ
* �ۼ�����   : 2009-08-13
* �ۼ���        : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������   :
* ������     :
* ��������   :
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_APTDONGUNITTHRWDataSet ds = (SS_L_APTDONGUNITTHRWDataSet)request.getAttribute("ds");  // request dataset

  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeDataToBulk(ds, "dongcur", resTemp, "listGrid");
	
	rxw.flush(out);
%> 
