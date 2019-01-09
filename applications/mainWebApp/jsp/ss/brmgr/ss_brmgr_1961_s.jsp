<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pb_rdr_1861_s.jsp
* 기능 : 독자 상세 가져오기
* 작성일자 : 2007-03-29
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 2009-04-09
* 백업파일명 : ss_brmgr_1961_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    String cmpycd      = Util.getSessionParameterValue(request, "cmpycd", true);          //지국지사코드

    // dataset 인스턴스 선언부분
    SS_S_BO_READERINFODataSet ds = (SS_S_BO_READERINFODataSet)request.getAttribute("ds");         //request dataset
    
 	// 구독자정보 dataset
    SS_S_BO_READERINFOREADINFOCURRecord rec = null;
    boolean  rdrChk = false;            //구독자 데이타 유무체크
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(resTemp, "detailGrid", ds.readinfocur.size());
	
	//if (ds.readinfocur.size() > 0) {
	for(int i=0; i < ds.readinfocur.size() ; i++) {
        rec = (SS_S_BO_READERINFOREADINFOCURRecord)ds.readinfocur.get(i);
       
      	//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}

		//데이터 추가.
		
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
	
	//rxw.makeDataToBulk(ds, resTemp, "detailGrid");
	
	rxw.flush(out);
%>

