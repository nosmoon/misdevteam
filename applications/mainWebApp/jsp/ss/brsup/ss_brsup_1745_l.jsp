<%@ page contentType="text/xml; charset=ksc5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1745_l.jsp
* ��� : ������������-Billing�ڵ���ü-��û����-���ں� ��ü����Ʈ
* �ۼ����� : 2003-03-30
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-17
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_MEDIDataSet ds = (SS_L_MEDIDataSet)request.getAttribute("ds");

	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int medicdCombo = rxw.add(resTemp, "medicdCombo", "");
	int item = rxw.add(medicdCombo, "item", "");
    rxw.add(item, "label", "����");
	rxw.add(item, "value", "");
	rxw.add(item, "dlvqty", "");
	rxw.add(item, "realsubsamt", "");
	for(int i=0; i<ds.rsltcur.size(); i++){
		SS_L_MEDIRSLTCURRecord rsltcurRec = (SS_L_MEDIRSLTCURRecord)ds.rsltcur.get(i);
		
        item = rxw.add(medicdCombo, "item", "");
        rxw.add(item, "label", rsltcurRec.getMedinm());
    	rxw.add(item, "value", rsltcurRec.getMedicd());
    	rxw.add(item, "dlvqty", rsltcurRec.getDlvqty());
    	rxw.add(item, "realsubsamt", rsltcurRec.getRealsubsamt());
    }
	
	rxw.flush(out);
%>
