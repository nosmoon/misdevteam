<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1761_l.jsp
* 기능 : 지국업무지원-Billing자동이체-납부자관리-납부자목록
* 작성일자 : 2004-04-08
* 작성자 : 김상열
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-05
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_SHFT_PYMTDataSet ds = (SS_L_SHFT_PYMTDataSet)request.getAttribute("ds");

	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeHugeStart(root, "pymtGrid", ds.rsltcur.size());
	String tempStr = "";
	for(int i=0; i < ds.rsltcur.size(); i++)
	{
		SS_L_SHFT_PYMTRSLTCURRecord rsltcurRec = (SS_L_SHFT_PYMTRSLTCURRecord)ds.rsltcur.get(i);
		if(rsltcurRec.shftclsf.equals("110")) tempStr = rsltcurRec.acctno;
		if(rsltcurRec.shftclsf.equals("120") || rsltcurRec.shftclsf.equals("130")) tempStr = rsltcurRec.cardno;
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("acct_card");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(tempStr);
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
