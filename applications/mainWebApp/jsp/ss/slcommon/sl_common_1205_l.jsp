<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_common_1205_l.jsp
* 기능 		 : 확장자검색(확장자명 입력에 의한 검색-엔터키)
* 작성일자 	 : 2003-12-09
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-31
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_EXTNPERSDataSet ds = (SL_L_EXTNPERSDataSet)request.getAttribute("ds");
    SL_L_EXTNPERSCURCOMMLISTRecord rec = null;

   	//size처리는 화면으로. 전체 데이터 내려줌.
	/*if(ds.curcommlist.size() == 1)
		rec = (SL_L_EXTNPERSCURCOMMLISTRecord)ds.curcommlist.get(0);*/
	
	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeDataToBulk(ds, "curcommlist", root, "extnData");
	
	rxw.flush(out);
%>
