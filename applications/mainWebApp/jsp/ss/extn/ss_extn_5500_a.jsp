<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_5500_a.jsp
* 기능 : 확장수당공지
* 작성일자 : 2017-10-31
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_5500_ADataSet ds = (SS_SLS_EXTN_5500_ADataSet)request.getAttribute("ds");
    
    applySession = true;	// 세션 적용 여부
    
    String resPath = request.getParameter("res_path");
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, resPath, "");	
	
	rxw.add(codeData, "yymm", Util.getDate().substring(0,6)); // 기간 시작
		
	rxw.makeDataToList(ds, "curextnaloncd", "cicdnm", "cicodeval", "전체", "", codeData, "extnaloncdCombo"); // 확장수당구분
		
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
		
	rxw.flush(out);	
%>
