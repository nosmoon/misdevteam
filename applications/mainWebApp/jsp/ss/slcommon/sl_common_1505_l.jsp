<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_common_1505_l.jsp
* 기능 		 : 판촉물검색 팝업 (판촉물명 입력 의한 검색)
* 작성일자 	 : 2003-12-09
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-31
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_BNSITEMDataSet ds = (SL_L_BNSITEMDataSet)request.getAttribute("ds");
    SL_L_BNSITEMCURRecord rec = null;

  	//size처리는 화면으로. 전체 데이터 내려줌.
	/*if(ds.bnsitemcur.size() == 1){
  		rec = (SL_L_BNSITEMCURRecord)ds.bnsitemcur.get(0);*/
  		
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "bnsitemcur", root, "bnsitemData");
		
	rxw.flush(out);
%>
