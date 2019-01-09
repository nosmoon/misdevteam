<%@ page contentType="text/xml; charset=ksc5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1745_l.jsp
* 기능 : 지국업무지원-Billing자동이체-신청관리-독자별 매체리스트
* 작성일자 : 2003-03-30
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-17
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_MEDIDataSet ds = (SS_L_MEDIDataSet)request.getAttribute("ds");

	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int medicdCombo = rxw.add(resTemp, "medicdCombo", "");
	int item = rxw.add(medicdCombo, "item", "");
    rxw.add(item, "label", "선택");
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
