<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_reader_1340_p.jsp
* 기능 		 : 독자정보관리(이사인계팝업-초기화면)
* 작성일자 	 : 2003-12-12
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-03
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    SL_L_MOVM_RDR_INIT_01DataSet ds = (SL_L_MOVM_RDR_INIT_01DataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int defaultData = rxw.add(resTemp, "defaultData", "");
	rxw.add(defaultData, "uid", Util.getSessionParameterValue(request, "uid", true));
	rxw.add(defaultData, "bocd", Util.getSessionParameterValue(request, "bocd", true));
	rxw.add(defaultData, "movmdt", Util.getDate());
	rxw.add(defaultData, "dlvhopedt", Util.addDays(Util.getDate(), 1, "yyyyMMdd", "yyyyMMdd" ));
	
	//주거형태
	rxw.makeDataToBulkList(ds, "curmovmresitype", "cicdnm", "cicodeval", resTemp, "movmresitypeCombo");
	//주거구분
	rxw.makeDataToBulkList(ds, "curmovmresiclsf", "cicdnm", "cicodeval", resTemp, "movmresiclsfCombo");
	
	rxw.flush(out);
%>
