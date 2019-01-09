<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1180_p.jsp
* 기능       : 독자정보관리(구독추가변경팝업-초기화면)
* 작성일자   : 2003-12-12
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-06
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%  // getting dataset
    SL_L_NWSPSUBSCNTR_INITDataSet ds = (SL_L_NWSPSUBSCNTR_INITDataSet)request.getAttribute("ds");  // request dataset

    final int TAB_SIZE = 5; // 한 row 에 들어갈 탭의 갯수
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	/* 예외 처리 - 지국취급매체 코드가 등록여부*/
	rxw.add(resTemp, "bomedicdReg", String.valueOf(ds.bomedicdcur.size() != 0));
	
	//기타 기본 데이터.
	int defaultData = rxw.add(resTemp, "defaultData", "");
	rxw.add(defaultData, "bocd", Util.getSessionParameterValue(request, "bocd", true));
	rxw.add(defaultData, "today", Util.getDate());
	rxw.add(defaultData, "valmm", Util.addMonth(ds.curryymm + "01", 1).substring(0, 6));
	rxw.add(defaultData, "subsuprc", ((SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord)ds.bomedicdcur.get(0)).subsuprc);
	
	//콤보데이터
	//매체코드. 첫번째
	int medicd = rxw.add(defaultData, "medicdCombo", "");
	SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord bomedicdcurRec = null;
	for(int i=0; i<ds.bomedicdcur.size(); i++){
		bomedicdcurRec = (SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord)ds.bomedicdcur.get(i);
		String code = bomedicdcurRec.medicd;
        String name = bomedicdcurRec.cicdnm;
        int subsuprc = bomedicdcurRec.subsuprc;
        
        int item = rxw.add(medicd, "item", "");
        rxw.add(item, "label", name);
    	rxw.add(item, "value", code);
    	rxw.add(item, "subsuprc", subsuprc);
    	//rxw.add(item, "medinm", name);
    }
	//무료구분. ""
	rxw.makeDataToBulkList(ds, "freeclsfcdcur", "cicdnm", "cicodeval", defaultData, "freeclsfCombo");
	//확장유형. "30"
	rxw.makeDataToBulkList(ds, "rdr_extntypecdcur", "cicdnm", "cicodeval", defaultData, "rdrExtntypecdCombo");
	
	rxw.flush(out);

%>
