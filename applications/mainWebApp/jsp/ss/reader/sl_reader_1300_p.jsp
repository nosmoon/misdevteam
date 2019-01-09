<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_reader_1300_p.jsp
* 기능 		 : 독자정보관리(불편접수팝업-초기화면)
* 작성일자 	 : 2004-01-20
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-06
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    CO_L_TAOCC_CDVDataSet ds = (CO_L_TAOCC_CDVDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int defaultData = rxw.add(resTemp, "defaultData", "");
	rxw.add(defaultData, "uid", Util.getSessionParameterValue(request, "uid", true));
	rxw.add(defaultData, "bocd", Util.getSessionParameterValue(request, "bocd", true));
	rxw.add(defaultData, "today", Util.getDate3());
	
	rxw.makeDataToBulkList(ds, "curcommlist", "cicdnm", "cicodeval", resTemp, "dscttypecdCombo");
	
	rxw.flush(out);
%>
