<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_commun_2600_a.jsp
* 기능 		 : 판매지국-통신실 아파트투입 현황조사및 현황목록 리스트
* 작성일자 	 : 2004-02-28
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 : ss_brmgr_1830_l.jsp
* 수정자 	 : 판매지-아파트투입 현황조사및 현황목록 리스트
* 수정일자 	 : 2006-03-10
* 작성자 	 : 이혁
* 백업파일명   :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-10
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%
	int page_rec = 5000;				// 한화면에 조회되는 레코드수 5 -> 5000

    //	dataset 인스턴스 선언부분
    SS_L_COMM_APT_THRWDataSet ds = (SS_L_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int naviInfo = rxw.add(resTemp, "naviInfo", request.getParameter("curr_page_no")==null || "".equals(request.getParameter("curr_page_no")) ? "1" : request.getParameter("curr_page_no"));
	rxw.add(naviInfo, "curr_page_no", "");
	rxw.add(naviInfo, "total_records", ds.getTotalcnt());
	rxw.add(naviInfo, "records_per_page", page_rec);
	
	rxw.makeHugeStart(resTemp, "thrwResearchGrid", ds.thrwlistcur.size());
	SS_L_COMM_APT_THRWTHRWLISTCURRecord rsltcurRec = null;
    for(int i=0, j=0; i<ds.thrwlistcur.size(); i++){
    	rsltcurRec = (SS_L_COMM_APT_THRWTHRWLISTCURRecord)ds.thrwlistcur.get(i);
        
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("invsgdthm");
			//순번은 trustform datagrid 기본 기능 사용.
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal(rsltcurRec.invsgdt + rsltcurRec.invsghhmm.substring(0,4));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	rxw.makeHugeEnd();
	
	//배달상태
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "선택", "", resTemp, "selDlvstatcd1Combo");
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "선택", "", resTemp, "selDlvstatcd2Combo");
	rxw.makeDataToBulkList(ds, "dlvstatcur", "cicdnm", "cicodeval", "선택", "", resTemp, "selDlvstatcd3Combo");
	
	rxw.flush(out);
%>
