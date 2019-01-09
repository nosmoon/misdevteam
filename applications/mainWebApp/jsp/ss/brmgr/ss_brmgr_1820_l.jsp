<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명	: ss_brmgr_1820_l.jsp
* 기능 	 	 : 판매지국-통신실 아파트투입 현황조사 및 등록 동번호 불러오기
* 작성일자 	 : 2004-02-27
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-10
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%

    // dataset 인스턴스 선언부분
    SL_L_COMM_APT_DONGNODataSet ds = (SL_L_COMM_APT_DONGNODataSet)request.getAttribute("ds");  // request dataset

  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeDataToBulkList(ds, "dongcur", "dongno", "dongno", "선택", "", resTemp, "dongnoCombo");
	
	rxw.flush(out);
%>
