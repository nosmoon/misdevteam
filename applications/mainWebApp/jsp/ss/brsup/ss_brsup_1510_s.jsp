<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1510_s.jsp
* 기능 : 지국지원-상해보험-사고-상세
* 작성일자 : 2004-02-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-03-27
* 백업파일명 : ss_brsup_1510_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	SS_S_INSRACCDDataSet ds = (SS_S_INSRACCDDataSet)request.getAttribute("ds");
	// 사고 시간에 ':' 추가
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