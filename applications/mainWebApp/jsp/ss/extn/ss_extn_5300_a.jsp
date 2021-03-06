<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_5300_a.jsp
* 기능 : 기업후원확장-구독배정내역(제휴)
* 작성일자 : 2017-10-11
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_5300_ADataSet ds = (SS_SLS_EXTN_5300_ADataSet)request.getAttribute("ds");
    
    applySession = true;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, "codeData", "");	
	
	rxw.add(codeData, "fryymm", Util.getDate().substring(0,6)); // 기간 시작
	rxw.add(codeData, "toyymm", Util.getDate().substring(0,6)); // 기간 끝	
	
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");

	rxw.flush(out);	
%>
