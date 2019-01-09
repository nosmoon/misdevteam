<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_reader_1220_l.jsp
* 기능 		 : 독자정보관리(입금내역목록)
* 작성일자 	 : 2003-12-22
* 작성자 	 : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-27
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    SL_L_RDRCLAMTHSTYDataSet ds = (SL_L_RDRCLAMTHSTYDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");

	String rdr_no = request.getParameter("rdr_no");
    String medicd = request.getParameter("medicd");
    String basiyymm  = request.getParameter("basiyymm");
    basiyymm = (basiyymm == null || basiyymm.length() < 6)? ds.getCurryymm() : basiyymm;
    //request data. 입금내역 재검색을 위해.
    rxw.add(resTemp, "basiyymm", basiyymm);
    rxw.add(resTemp, "medicd", medicd);
    
    //ds 자체 데이터. 입금내역 재검색을 위해.
    rxw.makeDataToBulk(ds, resTemp, "summary");
    
	int rcpmData = rxw.add(resTemp, "rcpmData", "");
	
	//입금내역
	int clamtynms = rxw.add(rcpmData, "clamtynms", "");
	rxw.add(clamtynms, "prevclamtynmsTitle", (Integer.parseInt(ds.getCurryymm().substring(0, 4)) - 1));
	rxw.add(clamtynms, "currclamtynmsTitle", (Integer.parseInt(ds.getCurryymm().substring(0, 4))));
	//전월
	StringBuffer sb = new StringBuffer();
	SL_L_RDRCLAMTHSTYBRFCURRecord 	brfcurRec   = null;
    SL_L_RDRCLAMTHSTYBRFCUR2Record 	brfcur2Rec 	= null;

    String[] prev_clamtynms = new String[12]; 	//전년도 수금 약어명 목록
    String[] curr_clamtynms = new String[12]; 	//금년도 수금 약어명 목록
    String prev_start_yymm = (Integer.parseInt(ds.getCurryymm().substring(0, 4)) - 1) + "01";
    String curr_start_yymm = (Integer.parseInt(ds.getCurryymm().substring(0, 4))) + "01";

    Hashtable prev_yymms = new Hashtable();  	//전년도 수금요약 커서를 담을 변수
    for(int i=0; i<ds.brfcur.size(); i++){
        brfcurRec 	= (SL_L_RDRCLAMTHSTYBRFCURRecord)ds.brfcur.get(i);
        prev_yymms.put(brfcurRec.subsmappli, brfcurRec.clamtynm);
    }
    Hashtable curr_yymms = new Hashtable();  	//금년도 수금요약 커서를 담을 변수
    for(int i=0; i<ds.brfcur2.size(); i++){
        brfcur2Rec 	= (SL_L_RDRCLAMTHSTYBRFCUR2Record)ds.brfcur2.get(i);
        curr_yymms.put(brfcur2Rec.subsmappli, brfcur2Rec.clamtynm);
    }
    long i_yymm = 0;
    String s_yymm = "";
  	for(int i=0; i<12; i++){ // 12개월 루프를 돌면서 해당 월분에 대한 수금방법(구분)을 셋팅
        i_yymm = Integer.parseInt(prev_start_yymm) + i;
    	if(prev_yymms.get(i_yymm  + "") == null){
        	prev_clamtynms[i] = "-";
        }else{
            prev_clamtynms[i] = (String)prev_yymms.get(i_yymm + "");
        }
    }
  	for(int i=0; i<12; i++){
		i_yymm = Integer.parseInt(curr_start_yymm) + i;
    	if(curr_yymms.get(i_yymm  + "") == null){
        	curr_clamtynms[i] = "-";
        }else{
            curr_clamtynms[i] = (String)curr_yymms.get(i_yymm + "");
        }
  	}
  	sb.delete(0, sb.length());
    for(int i=0; i<12; i++){
    	sb.append(prev_clamtynms[i]);
    }
    rxw.add(clamtynms, "prevclamtynms", sb.toString());
    //당월
    sb.delete(0, sb.length());
    for(int i=0; i<12; i++){
    	sb.append(curr_clamtynms[i]);
    }
    rxw.add(clamtynms, "currclamtynms", sb.toString());
    //미수.
    rxw.add(rcpmData, "rcpmunrecp", ds.getUn_clamt_mm() + "/" + ds.getUn_clamt());
    
    //입금내역목록
    // 입금내역 [yyyy,MM,dd]~[yyyy,MM,dd] 구하기
    int year = Integer.parseInt(basiyymm.substring(0,4));
    int month = Integer.parseInt(basiyymm.substring(4,6))-1;
    Calendar curr_month = new GregorianCalendar(year,month,1); //당월
    SimpleDateFormat yyyymm_format = new SimpleDateFormat("yyyy/MM"); // 년월 포맷
    sb.delete(0, sb.length()); // initializing StringBuffer
    curr_month.add(Calendar.MONTH, -7); // 입금내역의 시작 월분 = (당월 - 7)
    sb = yyyymm_format.format(curr_month.getTime(), sb, new FieldPosition(Calendar.YEAR));
    sb.append("~");
    curr_month.add(Calendar.MONTH, 10);  // 입금내역의 끝 월분 = (시작월 + 10)
    sb = yyyymm_format.format(curr_month.getTime(), sb, new FieldPosition(Calendar.YEAR));
    rxw.add(rcpmData, "rcpmyymm", sb.toString());
    
    //입금목록
    rxw.makeHugeStart(resTemp, "rcpmListGrid");
    rxw.add_ColVal("key");
	rxw.add_ColVal("subsmappli");
	rxw.add_ColVal("procdt");
	rxw.add_ColVal("clamamt");
	rxw.add_ColVal("clamt");
	rxw.add_ColVal("rcpmclsfnm");
	rxw.add_ColVal("rcpmclsfcd");
	rxw.add_RowVal("clamtmthdcd");
	
	SL_L_RDRCLAMTHSTYRSLTCURRecord rsltcurRec = null;
    Hashtable clamts = new Hashtable(); // 입금(수금)내역 커서의 레코드를 Hashtable에 담는다.

    for(int i=0; i<ds.rsltcur.size(); i++){
        rsltcurRec = (SL_L_RDRCLAMTHSTYRSLTCURRecord)ds.rsltcur.get(i);
        clamts.put(rsltcurRec.subsmappli, rsltcurRec);
    }

    SimpleDateFormat mm_format = new SimpleDateFormat("MM");   // 월 포맷(01)
    SimpleDateFormat yymm = new SimpleDateFormat("yyyyMM");	   // 월분 포맷(200301)
    curr_month.add(Calendar.MONTH, -10); // 입금내역의 시작 월분 = (입금내역 끝 월분 - 10)

	int curryymm_idx = 0; //입금내역테이블(rcpm_his_list_id) 내에서 당월의 row 인덱스를 저장할 변수
    StringBuffer sb_yymm = new StringBuffer(); // "200312" 형식의 월
    for(int i=0; i<11; i++){
        sb.delete(0, sb.length()); //월 스트링 버퍼 초기화
        sb_yymm.delete(0, sb_yymm.length()); //월분 스트링 버퍼 초기화

        sb = mm_format.format(curr_month.getTime(), sb, new FieldPosition(Calendar.YEAR));
        sb_yymm = yymm.format(curr_month.getTime(), sb_yymm, new FieldPosition(Calendar.YEAR));

        ////당월의 인덱스를 구한다
        if(ds.curryymm.equals(sb_yymm.toString())) curryymm_idx = i + 1;

        if(clamts.get(sb_yymm.toString()) != null ){
            rsltcurRec = (SL_L_RDRCLAMTHSTYRSLTCURRecord)clamts.get(sb_yymm.toString());
            
            rxw.add_ColVal(sb_yymm.toString());
        	rxw.add_ColVal(sb.toString());
        	rxw.add_ColVal(rsltcurRec.recpdt);
        	rxw.add_ColVal(rsltcurRec.clamamt);
        	rxw.add_ColVal(rsltcurRec.clamt);
        	rxw.add_ColVal(rsltcurRec.rcpmclsfnm + (("050".equals(rsltcurRec.rcpmclsfcd))? "S":""));
        	rxw.add_ColVal(rsltcurRec.rcpmclsfcd);
        	rxw.add_RowVal(rsltcurRec.clamtmthdcd);
        }
        else
        {
        	rxw.add_ColVal(sb_yymm.toString());
        	rxw.add_ColVal(sb.toString());
        	rxw.add_ColVal("");
        	rxw.add_ColVal("");
        	rxw.add_ColVal("");
        	rxw.add_ColVal("");
        	rxw.add_ColVal("");
        	rxw.add_RowVal("");
        }
        curr_month.add(Calendar.MONTH, 1); //목록에 현재 찍히는 월분값을 1개월 증가
    }
    
    rxw.makeHugeEnd();
    
	//System.out.println(rxw.getXml());
	rxw.flush(out);
	
%>
