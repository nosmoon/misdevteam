<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_reader_1210_s.jsp
* 기능 		 : 독자정보관리(구독상세보기)
* 작성일자 	 : 2003-12-12
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-07
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    SL_S_NWSPSUBSCNTRDataSet ds = (SL_S_NWSPSUBSCNTRDataSet)request.getAttribute("ds");  // request dataset

    //application exception 처리
    if(ds.nwspsubscntrcur.size() < 1){
        request.setAttribute("appException", new AppException("sl_reader_1210_s.jsp(1)","잘못된 구독계약정보 입니다. 독자번호와 매체명을 확인하신 후 관리자에게 문의하세요."));
        pageContext.forward("/jsp/ss/slcomm_jsp/app_error.jsp");
    }

    SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord  nwspsubscntrcurRec = (SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get(0);
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//상세정보.
	rxw.makeDataToBulk(nwspsubscntrcurRec, resTemp, "detailInfo");
	//추가상세정보
	int detailInfoEx = rxw.add(resTemp, "detailInfoEx", "");
	rxw.add(detailInfoEx, "accflag", "");
	rxw.add(detailInfoEx, "bocd", "");
	rxw.add(detailInfoEx, "new_medicd", nwspsubscntrcurRec.medicd);
	rxw.add(detailInfoEx, "rdr_extntypecd_2", nwspsubscntrcurRec.rdr_extntypecd);
	rxw.add(detailInfoEx, "bodutynm", "");
	rxw.add(detailInfoEx, "extnflnm", nwspsubscntrcurRec.extnnm);
	
	//콤보데이터
	//매체코드.
	int medicd = rxw.add(resTemp, "medicdCombo", "");
	SL_S_NWSPSUBSCNTRBOMEDICDCURRecord bomedicdcurRec = null;
	for(int i=0; i<ds.bomedicdcur.size(); i++){
		bomedicdcurRec = (SL_S_NWSPSUBSCNTRBOMEDICDCURRecord)ds.bomedicdcur.get(i);
		String code = bomedicdcurRec.medicd;
        String name = bomedicdcurRec.cicdnm;
        int subsuprc = bomedicdcurRec.subsuprc;
        
        int item = rxw.add(medicd, "item", "");
        rxw.add(item, "label", name);
    	rxw.add(item, "value", code);
    	rxw.add(item, "subsuprc", subsuprc);
    	//rxw.add(item, "medinm", name);
    }
	//무료구분.
	rxw.makeDataToBulkList(ds, "freeclsfcdcur", "cicdnm", "cicodeval", resTemp, "freeclsfCombo");
	//확장유형. "30"
	rxw.makeDataToBulkList(ds, "rdr_extntypecdcur", "cicdnm", "cicodeval", resTemp, "rdrExtntypecdCombo");
	
	rxw.flush(out);
%>

