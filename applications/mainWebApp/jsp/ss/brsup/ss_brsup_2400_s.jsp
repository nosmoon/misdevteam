<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ss_brsup_2400_s.jsp
* ���     : �ְ���������-���긶��-�ʱ�ȭ��
* �ۼ����� : 2007-04-12
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-03
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    applySession  = true;    //���� ���� ����
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int defaultData = rxw.add(root, "defaultData", "");
	
	rxw.add(defaultData, "applySession", String.valueOf(applySession));
	rxw.add(defaultData, "fryymm", Util.getCutStr(Util.addMonth(Util.getDate(),-1),6));
	rxw.add(defaultData, "toyymm", Util.getYyyyMm());
	rxw.add(defaultData, "closyymm", Util.getYyyyMm());
	
	rxw.flush(out);
%>
