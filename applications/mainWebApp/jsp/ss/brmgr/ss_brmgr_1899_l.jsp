<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_commun_2670_l.jsp
* 기능 		 : 판매지국-통신실 아파트투입 현황조사 결과보기 리스트
* 작성일자 	 : 2004-03-08
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-19
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>

<%
    //int listCount = 20;
	int listCount = 5000;
    //	dataset 인스턴스 선언부분
    SS_L_COMM_APT_RESULTDataSet ds = (SS_L_COMM_APT_RESULTDataSet)request.getAttribute("ds");  // request dataset

    //int tot_hos_cnt = Integer.parseInt(ds.hoscnt+"");
    int tot_hos_cnt = 0;
    int tot_cho_cnt = Integer.parseInt(ds.cho_cnt+"");
    int tot_jung_cnt = Integer.parseInt(ds.jung_cnt+"");
    int tot_dong_cnt = Integer.parseInt(ds.dong_cnt+"");
    
    String curr_page_no, total_records;
    if("".equals(Util.checkString(request.getParameter("pageno")))){
    	curr_page_no = "1";
    } else {
    	curr_page_no = request.getParameter("pageno");
    }
    total_records = String.valueOf(ds.getTotalcnt());
    
 	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "pageno", curr_page_no);
	rxw.add(resTemp, "totalcnt", total_records);
	rxw.add(resTemp, "js_fn_nm", "page_move");
	rxw.add(resTemp, "pagesize", listCount);
	rxw.add(resTemp, "page_set_gubun", 0);
	
	//등록구분1
	rxw.makeDataToList(ds, "regtypecur1", "cicdnm", "cicodeval", "전체", "", resTemp, "regtype1list");
	
	//등록구분2
	rxw.makeDataToList(ds, "regtypecur2", "cicdnm", "cicodeval", "전체", "", resTemp, "regtype2list");

	//data grid.
	//1) grid start.
	rxw.makeHugeStart(resTemp, "listGrid");
	//2) title setting
	rxw.add_ColVal("invsgdt");
	rxw.add_ColVal("invsgno");
	rxw.add_ColVal("bocd");
	rxw.add_ColVal("addrcd");
	rxw.add_ColVal("areanm");
	rxw.add_ColVal("bonm");
	rxw.add_ColVal("addrnm");
	rxw.add_ColVal("regtype1");
	rxw.add_ColVal("regtype2");
	rxw.add_ColVal("invsgpers");
	rxw.add_ColVal("dongno");
	rxw.add_ColVal("pyong");
	rxw.add_ColVal("hoscnt");
	rxw.add_ColVal("cho_cnt");
	rxw.add_ColVal("cho_rate");
	rxw.add_ColVal("jung_cnt");
	rxw.add_ColVal("jung_rate");
	rxw.add_ColVal("dong_cnt");
	rxw.add_ColVal("dong_rate");
	rxw.add_RowVal("regtype");
	//3) data setting	
    int dong_cnt = 0;
    int hos_cnt = 0;
    int cho_cnt = 0;
    int jung_cnt = 0;

    for(int i=0; i<ds.curcount.size(); i++){
        SS_L_COMM_APT_RESULTCURCOUNTRecord cntRec = (SS_L_COMM_APT_RESULTCURCOUNTRecord)ds.curcount.get(i);
        SS_L_COMM_APT_RESULTCURRESULTRecord resultRec = (SS_L_COMM_APT_RESULTCURRESULTRecord)ds.curresult.get(i);

        //hos_cnt = Integer.parseInt(resultRec.hoscnt+"");
        cho_cnt = Integer.parseInt(resultRec.cho_cnt+"");
        jung_cnt = Integer.parseInt(resultRec.jung_cnt+"");
        hos_cnt = 0;

        //dong_cnt = Integer.parseInt(resultRec.dong_cnt+"");
        for(int j=0; j<cntRec.count; j++){
            SS_L_COMM_APT_RESULTCURTHRWRTLISTRecord rsltcurRec = (SS_L_COMM_APT_RESULTCURTHRWRTLISTRecord)ds.curthrwrtlist.get(dong_cnt);
            dong_cnt++;

            hos_cnt = hos_cnt + Integer.parseInt(rsltcurRec.hoscnt+"");

            //if(j==0){ 	//필요없는 로직으로 보이는데 혹시 몰라서 주석 처리.
            rxw.add_ColVal(resultRec.invsgdt);
			rxw.add_ColVal(resultRec.invsgno);
			rxw.add_ColVal(resultRec.bocd);
			rxw.add_ColVal(resultRec.addrcd);
			rxw.add_ColVal(rsltcurRec.areanm);
			rxw.add_ColVal(rsltcurRec.bonm);
			rxw.add_ColVal(resultRec.addrnm);
			rxw.add_ColVal(rsltcurRec.regtype1);
			rxw.add_ColVal(rsltcurRec.regtype2);
			rxw.add_ColVal(rsltcurRec.invsgpers);
			rxw.add_ColVal(rsltcurRec.dongno);
			rxw.add_ColVal(rsltcurRec.pyong);
			rxw.add_ColVal(rsltcurRec.hoscnt);
			rxw.add_ColVal(rsltcurRec.cho_cnt);
			rxw.add_ColVal(rsltcurRec.cho_rate);
			rxw.add_ColVal(rsltcurRec.jung_cnt);
			rxw.add_ColVal(rsltcurRec.jung_rate);
			rxw.add_ColVal(rsltcurRec.dong_cnt);
			rxw.add_ColVal(rsltcurRec.dong_rate);
			rxw.add_RowVal(new StringBuffer().append(rsltcurRec.regtype1).append("/").append(rsltcurRec.regtype2));
            /*} else {
            rxw.add_ColVal(rsltcurRec.dongno);
			rxw.add_ColVal(rsltcurRec.pyong);
			rxw.add_ColVal(rsltcurRec.hoscnt);
			rxw.add_ColVal(rsltcurRec.cho_cnt);
			rxw.add_ColVal(rsltcurRec.cho_rate);
			rxw.add_ColVal(rsltcurRec.jung_cnt);
			rxw.add_ColVal(rsltcurRec.jung_rate);
			rxw.add_ColVal(rsltcurRec.dong_cnt);
			rxw.add_RowVal(rsltcurRec.dong_rate);
            }*/
        }
        tot_hos_cnt = tot_hos_cnt + hos_cnt;
    }
    rxw.makeHugeEnd();
    //System.out.println(rxw.getXml());
    rxw.flush(out);
%>
