<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_commun_2630_s.jsp
* 기능 	 	 : 판매지국-통신실 아파트투입 현황조사 및 등록 아파트구조보기
* 작성일자 	 : 2004-03-02
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-14
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%

    // dataset 인스턴스 선언부분
    SL_S_COMM_APT_QSEARCHDataSet ds = (SL_S_COMM_APT_QSEARCHDataSet)request.getAttribute("ds");  // request dataset

	int col = Integer.parseInt(ds.getFlorcnt());
	int row = Integer.parseInt(ds.getFlor_houscnt());
	int li_col = row;
	int li_widthVaule = (li_col*35)+35; // (컬럼겟수*컬럼사이즈)+층을 나타내는 열사이즈
    int nSessionCheck = 0;
    int page_rec = 5;
    String strQsearch = request.getParameter("qsearch");
    String strReadonly = "";

    if( strQsearch.length() <= 5 ) {
      strQsearch = strQsearch + "000000";
    }

    if( col == 0 && row == 0 ) {
      col = 5;
      row = 5;
      strReadonly = "readonly";
    } else {
      strReadonly = "";
    }

    String applySessionStr = (String)request.getParameter("applySession"); // session 적용여부

    String addrcd = strQsearch.substring(5,8);
    String dongno = strQsearch.substring(8);

//    String addrcd = request.getParameter("qsearch").substring(5,8);
//    String dongno = request.getParameter("qsearch").substring(8);


	//건물형태 구성을 위해 비어있는 호수를 가져온다
	String KubunVaue = "";
	for(int kk=0 ; kk < ds.apttypecur.size() ; kk++) {
		SL_S_COMM_APT_QSEARCHAPTTYPECURRecord rec = (SL_S_COMM_APT_QSEARCHAPTTYPECURRecord)ds.apttypecur.get(kk);
		KubunVaue = KubunVaue+"*"+rec.getTotalrowcol();
	}
	
	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//호별 투입매체 현황 form 정보
	int housThrwForm = rxw.add(resTemp, "housThrwForm", "");
	rxw.add(housThrwForm, "bocd", request.getParameter("bocd"));
	rxw.add(housThrwForm, "gridReadOnly", strReadonly);
	
	//호별 투입매체 현황 grid 정보
	int housThrwGrid = rxw.add(resTemp, "housThrwGrid", "");
	for(int i=1; i<=col; i++)
	{
		int record = rxw.add(housThrwGrid, "record", "", "floor=\""+(col-i+1)+"\"");
		for(int j=0; j<=row; j++)
		{
			if(j==0)
				rxw.add(record, "floor", (col-i+1) + "층");
			else
			{
				DecimalFormat dFormat = new DecimalFormat("0000");
				String ii = dFormat.format(col-i+1);
				String jj = dFormat.format(j);
				String hh = ii+","+jj;
				int checkInt = KubunVaue.lastIndexOf(hh);
				//String val = (String)ht.get(Util.lpad(col-i+1)+Util.lpad(j));	//조사결과값은 설정하지 않는다.
				
				rxw.add(record, "h_" + Util.lpad(j), "", new StringBuffer().append("hid=\"h_").append(Util.lpad(col-i+1)).append(Util.lpad(j)).append("\" exist=").append(checkInt>0 ? "\"false\"" : "\"true\"").toString());
			}
		}
	}
	
	//아파트정보 부분.
	int thrwHeadForm = rxw.add(resTemp, "thrwHeadForm", "");
	rxw.add(thrwHeadForm, "bocd", ds.getBocd());
	rxw.add(thrwHeadForm, "pyong", ds.getPyong());		//평형
	rxw.add(thrwHeadForm, "hoscnt", ds.getHoscnt());	//세대수
	rxw.add(thrwHeadForm, "mvindt", ds.getMvindt());	//입주일자
	int thrwHeadFormEx = rxw.add(resTemp, "thrwHeadFormEx", "");	//session에 따라 조정되는 값이므로 별도.
	rxw.add(thrwHeadFormEx, "addrcd", addrcd);
	rxw.add(thrwHeadFormEx, "dongno", dongno);
	rxw.makeDataToBulkList(ds, "addrcdcur", "addrnm", "addrcd", "선택", "", resTemp, "addrcdCombo");
	rxw.makeDataToBulkList(ds, "dongcur", "dongno", "dongno", "선택", "", resTemp, "dongnoCombo");
	
	//팀-지국 부분.
	int boSearchForm = rxw.add(resTemp, "boSearchForm", "");
	rxw.add(boSearchForm, "common_deptcd", ds.getDeptcd());
	rxw.add(boSearchForm, "common_areacd", ds.getAreacd());
	rxw.add(boSearchForm, "deptcd", ds.getDeptcd());
	rxw.add(boSearchForm, "areacd", ds.getAreacd());
	rxw.add(boSearchForm, "bolist", ds.getBocd());
	rxw.add(boSearchForm, "qsearch", ds.getBocd() + addrcd + dongno);
	//지역. arealist_temp 가 아닌 arealist로 바로 전달.
	if("true".equals(applySessionStr)){

		// session의 지역코드, 지역명 목록으로 <option>을 구성한다.
		int comboArea  = rxw.add(resTemp, "arealist" , "");
    
		String areanm = (String)session.getAttribute("areanm");
		ArrayList areanmList = getTokens(areanm, "^");		// 구분자 "^"

		if(areanmList.size() == 0){	// 지역코드,지역명 갯수가 없음.
			// 지역코드,지역명이 존재하지 않음. 에러처리
		}else if(areanmList.size() == 1){	// 지역코드,지역명 갯수가 하나.
	
			String areacdnm = (String)areanmList.get(0);
			ArrayList areacdnmList = getTokens(areacdnm, "|");	// 구분자 "|"
			if(areacdnmList.size() == 2){
				nSessionCheck = 1;
				//rxw.addSelectItem(comboArea, (String)areacdnmList.get(1), (String)areacdnmList.get(0));
				rxw.addSelectItem(comboArea, "record", "area_nm", "area_cd", (String)areacdnmList.get(1), (String)areacdnmList.get(0));
			}else{
				// 지역코드, 지역명 상이 맞지 않음. 에러처리.
			}
		}else{	// 지역코드,지역명 갯수가 여러개.
	
			//rxw.addSelectItem(comboArea, "전체", "");
			rxw.addSelectItem(comboArea, "record", "area_nm", "area_cd", "전체", "");
			for(int i=0; i<areanmList.size(); i++){
				String areacdnm = (String)areanmList.get(i);
				ArrayList areacdnmList = getTokens(areacdnm, "|");	// 구분자 "|"
	
				if(areacdnmList.size() == 2){
	
					// SS_L_JIYEOGCDDataSet 객체의 curcommlist에 포함된 SS_L_JIYEOGCDCURCOMMLISTRecord 객체의 areacd를 비교하여 세션의 지역코드 목록에 존재하는 항목만 출력한다.
					for(int j=0; j<ds.arealist.size(); j++){
						SL_S_COMM_APT_QSEARCHAREALISTRecord record = (SL_S_COMM_APT_QSEARCHAREALISTRecord)ds.arealist.get(j);
	
						if(areacdnmList.get(0).equals(record.areacd)){
							nSessionCheck = 1;
							//rxw.addSelectItem(comboArea, (String)areacdnmList.get(1), (String)areacdnmList.get(0));
							rxw.addSelectItem(comboArea, "record", "area_nm", "area_cd", (String)areacdnmList.get(1), (String)areacdnmList.get(0));
						}
					}
	
				}else{
					// 지역코드, 지역명 상이 맞지 않음. 에러처리
				}
			}
		}

	}
    else
    {
    	rxw.makeDataToList(ds, "arealist", "areanm", "areacd", "전체", "", resTemp, "arealist", "record", "area_nm", "area_cd");
    }
	
	//지국.
	rxw.makeDataToBulkList(ds, "bolist", "bonm", "bocd", "전체", "", resTemp, "codelist", "record", "cdnm", "cd", false);
	
	//조회 form.
	int rdrsrchListForm = rxw.add(resTemp, "rdrsrchListForm", "");
	rxw.add(rdrsrchListForm, "bocd", ds.getBocd());
	
	//조사리스트.
	rxw.makeDataToBulkList(ds, "addrcdcur", "addrnm", "addrcd", "전체", "", resTemp, "thrwAddrcdCombo");
	
	//화면 조정 옵션.
	rxw.add(resTemp, "nSessionCheck", nSessionCheck);
	
	rxw.flush(out);
%>
