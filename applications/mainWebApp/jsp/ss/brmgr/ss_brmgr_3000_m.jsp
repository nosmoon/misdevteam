<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%
	SS_SLS_BRMGR_3000_MDataSet ds = (SS_SLS_BRMGR_3000_MDataSet)request.getAttribute("ds");
    //int spqtyListCount = 20;	// 한 화면당 리스트 항목 수
    //int spqtyListCount = 5000;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
    int formData			= 0;
    int recordSet			= 0;
    
  //TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
			
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");

	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");	

	rxw.add(codeData, "issu_dt", Util.getDate());
	
	rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "선택", "", codeData, "medicdcur");	
	
	rxw.add(codeData, "uid", String.valueOf( session.getAttribute("uid")));
	
	rxw.flush(out);
%>