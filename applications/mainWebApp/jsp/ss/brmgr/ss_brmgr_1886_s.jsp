<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_brmgr_1885_p.jpg
* 기능 	 	 : 판매국-지국경영-투입율조사-아파트투입현황-투입율조사내역 상세보기 팝업
* 작성일자 	 : 2006-01.26
* 작성자 	 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-23
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	// dataset 인스턴스 선언부분
    SL_S_COMM_APT_THRWDataSet ds = (SL_S_COMM_APT_THRWDataSet)request.getAttribute("ds");  // request dataset

	String acc_flg = request.getParameter("accflag");
	String hmflag = request.getParameter("hmflag");
    String mvindt = ds.getMvindt();
    String qsearch_code = request.getParameter("bocd") + "-" + request.getParameter("addrcd") + "-" + Util.Uni2Ksc(Util.Uni2Ksc(request.getParameter("dongno")));

	int col = Integer.parseInt(ds.getFlorcnt());
	int row = Integer.parseInt(ds.getFlor_houscnt());
	int li_col = row;
	int li_widthVaule = (li_col*35)+35; // (컬럼겟수*컬럼사이즈)+층을 나타내는 열사이즈

	//건물형태 구성을 위해 비어있는 호수를 가져온다
	String KubunVaue = "";
	for(int kk=0 ; kk < ds.apttypecur.size() ; kk++) {
		SL_S_COMM_APT_THRWAPTTYPECURRecord rec = (SL_S_COMM_APT_THRWAPTTYPECURRecord)ds.apttypecur.get(kk);
		KubunVaue = KubunVaue+"*"+rec.getTotalrowcol();
	}

    //입주일자 설정
    if( !mvindt.equals("") ) {
      mvindt = mvindt.substring(0,4) + "/" + mvindt.substring(4,6) + "/" + mvindt.substring(6);
    } else {
      mvindt = "";
    }
    
    //TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//master data.
	rxw.makeDataToBulk(ds, resTemp, "master");
	
	//등록구분콤보.
	rxw.makeDataToList(ds, "regtypecur1", "cicdnm", "cicodeval", "선택", "", resTemp, "regtype1Combo");
	rxw.makeDataToList(ds, "regtypecur2", "cicdnm", "cicodeval", "선택", "", resTemp, "regtype2Combo");
	
	//투입매체별 현황.
	rxw.makeHugeStart(resTemp, "statGrid", ds.medicur.size());
	for(int i=0; i < ds.medicur.size(); i++)
	{
		SL_S_COMM_APT_THRWMEDICURRecord rsltcurRec = (SL_S_COMM_APT_THRWMEDICURRecord)ds.medicur.get(i);
        
		//title 추가.
		if(i == 0)
		{ 
			rxw.add_ColVal("dlvstatcd_t");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
		
		//데이터 추가.
		rxw.add_ColVal((rsltcurRec.medicd).equals("110") || (rsltcurRec.medicd).equals("506") || (rsltcurRec.medicd).equals("504") ? rsltcurRec.dlvstatcd : "");
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	rxw.makeHugeEnd();
	//투입매체별 현황-배달상태콤보
	rxw.makeDataToList(ds, "dlvstatcur", "cicdnm", "cicodeval", "선택", "", resTemp, "dlvstatcdCombo");
	
	//호별 투입매체 현황
	//데이터처리.
	Hashtable ht = new Hashtable();
	for(int i=0; i<ds.houscur.size(); i++)
	{
    	SL_S_COMM_APT_THRWHOUSCURRecord rsltcurRec = (SL_S_COMM_APT_THRWHOUSCURRecord)ds.houscur.get(i);
    	
    	String val = (String)ht.get(rsltcurRec.flor+rsltcurRec.hous);
    	if(val == null || val.equals(""))
    		val = rsltcurRec.medicdnm;
    	else
    		val += "," + rsltcurRec.medicdnm;
    	
    	ht.put(rsltcurRec.flor+rsltcurRec.hous, val);
	}
	//호수 존재여부를 attribute로 설정하기 위해 xml형태로 구성한다.
	/*rxw.makeHugeStart(resTemp, "listGrid");
	for(int i=0; i<=row; i++)
	{
		if(i==0)
			rxw.add_ColVal("층");
		else if(i==row)
			rxw.add_RowVal(i+"호");
		else
			rxw.add_ColVal(i+"호");
	}*/
	int listGrid = rxw.add(resTemp, "listGrid", "");
	for(int i=1; i<=col; i++)
	{
		int record = rxw.add(listGrid, "record", "");
		for(int j=0; j<=row; j++)
		{
			if(j==0)
				rxw.add(record, "flore", (col-i+1) + "층");
			else
			{
				DecimalFormat dFormat = new DecimalFormat("0000");
				String ii = dFormat.format(col-i+1);
				String jj = dFormat.format(j);
				String hh = ii+","+jj;
				int checkInt = KubunVaue.lastIndexOf(hh);
				String val = (String)ht.get(Util.lpad(col-i+1)+Util.lpad(j));
				
				rxw.add(record, "h_" + Util.lpad(j), val==null? "" : val, "exist=" + (checkInt>0 ? "\"false\"" : "\"true\""));
			}
		}
	}
	//System.out.println(rxw.getXml());
	rxw.flush(out);

%>

