<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명	: ss_brmgr_1881_l.jsp
* 기능 	 	 : 판매-아파트투입률 조사-현황등록
* 작성일자 	 : 2006-01-25
* 작성자 	 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-19
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%

    // dataset 인스턴스 선언부분
    SS_L_COMM_APT_THRWDataSet ds = (SS_L_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;

	rxw.makeDataToList(ds, "addrcdcur", "addrnm", "addrcd", "선택", "", root, "aptlist");
	
	rxw.flush(out);
%>
