<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명	: ss_brmgr_2059_l.jsp
* 기능 	 	 : 판매-아파트투입률 
* 작성일자 	 : 2009-08-14
* 작성자 	 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: 
* 수정자	: 
* 수정일자	: 
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%

    // dataset 인스턴스 선언부분
    SS_L_APTDONGUNITTHRW_INITDataSet ds = (SS_L_APTDONGUNITTHRW_INITDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;

	rxw.makeDataToList(ds, "aptlistcur", "addrnm", "addrcd", "선택", "", root, "aptlist");
	
	rxw.flush(out);
%> 
