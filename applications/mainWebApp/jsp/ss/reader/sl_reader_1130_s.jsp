<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1130_s.jsp
* 기능       : 독자정보관리(독자상세보기)
* 작성일자   : 2003-11-26
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-19 
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    // DataSet 얻어내기
    SL_S_RDR_INFODataSet ds = (SL_S_RDR_INFODataSet)request.getAttribute("ds");

    final int TAB_SIZE = 5; // 한 row 에 들어갈 탭의 갯수
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	String basiyymm = request.getParameter("basiyymm");
    basiyymm = (basiyymm == null || basiyymm.length() < 6)? ds.getCurryymm() : basiyymm;
    //basiyymm을 저장해 놓음.
    rxw.add(resTemp, "basiyymm", basiyymm);
    
	//****** 0. summary (ds 자체 데이터)
	rxw.makeDataToBulk(ds, resTemp, "summary");
    
	//****** 1. 독자상세 정보.
	rxw.makeDataToBulk(ds.readercur.get(0), resTemp, "rdrDetailForm1");
	
	//****** 2. 신문구독정보.
	rxw.makeDataToBulk(ds.subscur.get(0), resTemp, "rdrDetailForm2");
	
	//*. 독자상세 콤보.
	int detailArea = rxw.add(resTemp, "detailArea", "");
	
	//구역. dstccd필드를 label, value에 모두 사용. attribute: cdnm=dstcnm, teamcd=teamcd 로 가지고 있는 형식. 일단 xpath로 접근하는 방법을 사용하기 위해 nodeset으로 return.
	//rxw.makeDataToBulk(ds, "dstcinfocurRec", detailArea, "dlvdstccdHiddenCombo");
	//readercurRec.dlvdstccd 의 값이 default value.
	int dlvdstccdHidden = rxw.add(detailArea, "dlvdstccdHiddenCombo", "");
	int item = rxw.add(dlvdstccdHidden, "item", "");
	rxw.add(item, "label", "");
	rxw.add(item, "value", "");
	rxw.add(item, "cdnm", "");
	SL_S_RDR_INFODSTCINFOCURRecord dstcinfocurRec  = null;
	for(int i=0; i<ds.dstcinfocur.size(); i++){
		dstcinfocurRec = (SL_S_RDR_INFODSTCINFOCURRecord)ds.dstcinfocur.get(i);
		String code = dstcinfocurRec.dstccd;
        String name = dstcinfocurRec.dstccd;
        
        item = rxw.add(dlvdstccdHidden, "item", "");
        rxw.add(item, "label", "<![CDATA[" + name  + "]]>");
    	rxw.add(item, "value", "<![CDATA[" + code  + "]]>");
    	rxw.add(item, "cdnm", "<![CDATA[" + dstcinfocurRec.dstcnm  + "]]>");
    	//rxw.add(item, "teamcd", dstcinfocurRec.teamcd);
    }
	
	//주소코드(배달지코드). label=addrnm, value=addrcd. attribute: cdnm=addrnm. 빈문자항목 때문에 전체 구성.
	//rxw.makeDataToBulk(ds, "addrcdcur", detailArea, "dlvcdCombo");
	int searchDstc = rxw.add(detailArea, "dlvcdCombo", "");
	item = rxw.add(searchDstc, "item", "");
	rxw.add(item, "label", "");
	rxw.add(item, "value", "");
	rxw.add(item, "cdnm", "");
	SL_S_RDR_INFOADDRCDCURRecord addrcdcurRec = null;
    for(int i=0; i<ds.addrcdcur.size(); i++){
    	addrcdcurRec = (SL_S_RDR_INFOADDRCDCURRecord)ds.addrcdcur.get(i);
        String code = addrcdcurRec.addrcd;
        String name = addrcdcurRec.addrnm;
        
        item = rxw.add(searchDstc, "item", "");
        rxw.add(item, "label", "<![CDATA[" + code+":"+name  + "]]>");
    	rxw.add(item, "value", "<![CDATA[" + code  + "]]>");
    	rxw.add(item, "cdnm", "<![CDATA[" + addrcdcurRec.addrnm  + "]]>");
    }
	
	//단체구분 (radio). 
	rxw.makeDataToBulkList(ds, "paty_clsfcdcur", "cicdnm", "cicodeval", detailArea, "patyClsfcdRadio");
	
	//주거형태.
	rxw.makeDataToBulkList(ds, "resitypecdcur", "cicdnm", "cicodeval", "", "", detailArea, "resitypecdCombo");
	
	//주거구분.
	rxw.makeDataToBulkList(ds, "resiclsfcdcur", "cicdnm", "cicodeval", "", "", detailArea, "resiclsfcdCombo");
	
	//배달방법 (radio).
	rxw.makeDataToBulkList(ds, "dlvmthdcdcur", "cicdnm", "cicodeval", detailArea, "dlvmthdcdRadio");
	
	//투입장소
	rxw.makeDataToBulkList(ds, "thrwplaccdcur", "cicdnm", "cicodeval", "", "", detailArea, "thrwPlacCombo");
	
	//지국지사취급매체 
	int medicd = rxw.add(detailArea, "medicdCombo", "");
	item = rxw.add(medicd, "item", "");
	rxw.add(item, "label", "");
	rxw.add(item, "value", "");
	rxw.add(item, "subsuprc", "");
	SL_S_RDR_INFOBOMEDICDCURRecord bomedicdcurRec = null;
	for(int i=0; i<ds.bomedicdcur.size(); i++){
		bomedicdcurRec = (SL_S_RDR_INFOBOMEDICDCURRecord)ds.bomedicdcur.get(i);
		String code = bomedicdcurRec.medicd;
        String name = bomedicdcurRec.cicdnm;
        int subsuprc = bomedicdcurRec.subsuprc;
        
        item = rxw.add(medicd, "item", "");
        rxw.add(item, "label", "<![CDATA[" + name  + "]]>");
    	rxw.add(item, "value", "<![CDATA[" + code  + "]]>");
    	rxw.add(item, "subsuprc", "<![CDATA[" + subsuprc  + "]]>");
    	//rxw.add(item, "medinm", name);
    }
	
	//무료부수.
	rxw.makeDataToBulkList(ds, "freeclsfcdcur", "cicdnm", "cicodeval", "", "", detailArea, "rptvfreeclsfCombo");
	
	//수금방법.
	rxw.makeDataToBulkList(ds, "clamtmthdcdcur", "cicdnm", "cicodeval", detailArea, "clamtmthdcdCombo");
	
	//확장유형.
	rxw.makeDataToBulkList(ds, "rdr_extntypecdcur", "cicdnm", "cicodeval", detailArea, "rdrExtntypecdCombo");

	//중지일자
	rxw.makeDataToBulkList(ds, "suspresncdcur", "cicdnm", "cicodeval", "", "", detailArea, "rptvSuspresncdCombo");
	
	//매체선택버튼 처리 데이터.
	int mediForm = rxw.add(resTemp, "mediForm", "");
	rxw.add(mediForm, "medicd", Util.checkString(request.getParameter("medicd")));
	rxw.makeDataToBulk(ds, "medicur", mediForm, "medicurData");
	
	//****** 3. 입금내역정보.
	//입금내역 재조회를 위해 basiyymm 저장해 놓음.
	rxw.add(resTemp, "medicd", ((SL_S_RDR_INFOMEDICURRecord)ds.medicur.get(0)).getMedicd());
	
	//rcpm 관련 데이터.
	int rcpmData = rxw.add(resTemp, "rcpmData", "");
	
	//마일리지 caption
	rxw.makeDataToBulk(ds.milgcur.size()>0 ? ds.milgcur.get(0) : null, rcpmData, "milgcurData");
	
	//입금내역
	int clamtynms = rxw.add(rcpmData, "clamtynms", "");
	rxw.add(clamtynms, "prevclamtynmsTitle", (Integer.parseInt(ds.getCurryymm().substring(0, 4)) - 1));
	rxw.add(clamtynms, "currclamtynmsTitle", (Integer.parseInt(ds.getCurryymm().substring(0, 4))));
	//전월
	StringBuffer sb = new StringBuffer();
	SL_S_RDR_INFOBRFCURRecord 	brfcurRec   = null;
    SL_S_RDR_INFOBRFCUR2Record 	brfcur2Rec 	= null;
    String[] prev_clamtynms = new String[12]; 	//전년도 수금 약어명 목록
    String[] curr_clamtynms = new String[12]; 	//금년도 수금 약어명 목록
    String prev_start_yymm = (Integer.parseInt(ds.getCurryymm().substring(0, 4)) - 1) + "01";
    String curr_start_yymm = (Integer.parseInt(ds.getCurryymm().substring(0, 4))) + "01";
    Hashtable prev_yymms = new Hashtable();  //전년도 수금요약 커서를 담을 변수
    for(int i=0; i<ds.brfcur.size(); i++){
        brfcurRec 	= (SL_S_RDR_INFOBRFCURRecord)ds.brfcur.get(i);
        prev_yymms.put(brfcurRec.subsmappli, brfcurRec.clamtynm);
    }
    Hashtable curr_yymms = new Hashtable();  //금년도 수금요약 커서를 담을 변수
    for(int i=0; i<ds.brfcur2.size(); i++){
        brfcur2Rec 	= (SL_S_RDR_INFOBRFCUR2Record)ds.brfcur2.get(i);
        curr_yymms.put(brfcur2Rec.subsmappli, brfcur2Rec.clamtynm);
    }
    long i_yymm = 0;
    String s_yymm = "";
    for(int i=0; i<12; i++){
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
	
    SL_S_RDR_INFOCLAMTCURRecord clamtcurRec = null;
    Hashtable clamts = new Hashtable(); // 입금(수금)내역 커서의 레코드를 Hashtable에 담는다.(신문구독수금에 레코드가 존재하는 내역들)

    for(int i=0; i<ds.clamtcur.size(); i++){
        clamtcurRec = (SL_S_RDR_INFOCLAMTCURRecord)ds.clamtcur.get(i);
        clamts.put(clamtcurRec.subsmappli, clamtcurRec);
    }

    SimpleDateFormat mm_format = new SimpleDateFormat("MM");   // 월 포맷(01)
    SimpleDateFormat yymm = new SimpleDateFormat("yyyyMM");	   // 월분 포맷(200301)
    curr_month.add(Calendar.MONTH, -10); // 입금내역의 시작 월분 = (입금내역 끝 월분 - 10)

    int curryymm_idx = 7; //입금내역테이블(rcpm_his_list_id) 내에서 당월의 row 인덱스를 저장할 변수
    StringBuffer sb_yymm = new StringBuffer(); // "200312" 형식의 월
    for(int i=0; i<11; i++){
        sb.delete(0, sb.length()); //월 스트링 버퍼 초기화
        sb_yymm.delete(0, sb_yymm.length()); //월분 스트링 버퍼 초기화

        sb = mm_format.format(curr_month.getTime(), sb, new FieldPosition(Calendar.YEAR));
        sb_yymm = yymm.format(curr_month.getTime(), sb_yymm, new FieldPosition(Calendar.YEAR));

        ////당월의 인덱스를 구한다
        if(ds.curryymm.equals(sb_yymm.toString())) curryymm_idx = i + 1;

        if(clamts.get(sb_yymm.toString()) != null ){
            clamtcurRec = (SL_S_RDR_INFOCLAMTCURRecord)clamts.get(sb_yymm.toString());
            
            rxw.add_ColVal(sb_yymm.toString());
        	rxw.add_ColVal(sb.toString());
        	rxw.add_ColVal(clamtcurRec.recpdt);
        	rxw.add_ColVal(clamtcurRec.clamamt);
        	rxw.add_ColVal(clamtcurRec.clamt);
        	rxw.add_ColVal(clamtcurRec.rcpmclsfnm + (("050".equals(clamtcurRec.rcpmclsfcd))? "S":""));
        	rxw.add_ColVal(clamtcurRec.rcpmclsfcd);
        	rxw.add_RowVal(clamtcurRec.clamtmthdcd);
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
