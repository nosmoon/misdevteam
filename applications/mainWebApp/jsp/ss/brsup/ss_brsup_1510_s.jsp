<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1510_s.jsp
* ��� : ��������-���غ���-���-��
* �ۼ����� : 2004-02-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-27
* ������ϸ� : ss_brsup_1510_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_INSRACCDDataSet ds = (SS_S_INSRACCDDataSet)request.getAttribute("ds");
	// ��� �ð��� ':' �߰�
	String accdtm = "";
	if(ds.getAccdtm() != null && ds.getAccdtm().length() == 4 ){
		accdtm = ds.getAccdtm().substring(0, 2);
		accdtm = accdtm + ":"+ ds.getAccdtm().substring(2, 4);
	}else{
		accdtm = ds.getAccdtm();
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>