<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brinfo_1050_a.jsp
* 기능 :
* 작성일자 :
* 작성자 :
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 황성진
* 수정일자 : 20090122
* 백업파일명 : ss_brinfo_1050_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	//SS_L_READER_BOINFO_INITDataSet ds = (SS_L_READER_BOINFO_INITDataSet)request.getAttribute("ds");

	SS_L_BOACCT_INITDataSet ds = (SS_L_BOACCT_INITDataSet)request.getAttribute("ds");
    //int listCount = 20;	// 한 화면당 리스트 항목 수
    int listCount = 5000;
    
    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.

    boolean applySession = true;	// 세션 적용 여부
	String jobcd = Util.getSessionParameterValue(request, "jobcd", false);	// 업무구분코드(판매국장,지원부장,영업부장은 목록 조회 옵션을 보여준다.)

    //업무환경구분 설정 시작
    Vector jobcdSet = new Vector();
    String jobcd_param = "";
	//String jobcd = (String)request.getHeader("JOBCD");
    if( jobcd == null ) {
      jobcd = "^";
    //jobcd = "100^280^710^920^950^T15";
    }

	StringTokenizer st = new StringTokenizer(jobcd, "^");
	while(st.hasMoreTokens()){
		jobcdSet.add(st.nextToken());
	}

    for(int i=0; i<jobcdSet.size(); i++){
      jobcd_param = (String)jobcdSet.elementAt(i);
      if( jobcd_param.equals("100") || jobcd_param.equals("302") || jobcd_param.equals("570") ) {
        //전산담당(100), 정보관리(302), 판촉담당(570)
        break;
      } else {
        jobcd_param = "";
      }
    }
    //업무환경구분 설정 끝

    int root = RwXmlWrapper.rootNodeID;
    int comboSet  = 0;
    int comboTeam = 0;
    int comboPart = 0;
    int comboArea = 0;
    int comboBranch = 0;
    
    //applySession
    rxw.add(root, "applySession", String.valueOf(applySession));
    rxw.add(root, "pagesize", listCount);
    rxw.add(root, "jobcdset", jobcd_param);
    
    //부서-지국 데이터 init.
    comboSet = rxw.add(root, "codeData" , "");
    if(applySession)
    {
        //부서(팀)목록 표시
	    /*comboTeam  = rxw.add(comboSet, "teamlist" , "");
		writeDeptOpt(session, rxw, comboTeam, true);*/
		//rxw.makeDataToList(ds, "teamlist", "dept_nm", "dept_cd", comboSet, "teamlist", "record", "dept_nm", "dept_cd");
		rxw.makeDataToBulk(ds, "teamlist", comboSet, "teamlist");
		
		//파트 목록 표시
		/*comboPart = rxw.add(comboSet, "partlist_temp" , "");
		rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "전체", "");*/
		rxw.makeDataToBulk(ds, "partlist", comboSet, "partlist_temp");
	
	    //지역 목록 표시
	    /*comboArea = rxw.add(comboSet, "arealist_temp" , "");
		writeAreaOpt(session, rxw, comboArea, true);*/
		rxw.makeDataToBulk(ds, "arealist", comboSet, "arealist_temp");
		
		//지국 목록 표시
		comboBranch = rxw.add(comboSet, "codelist" , "");
		rxw.addSelectItem(comboBranch, "record", "cdnm", "cd", "전체", "");
    }
    else
    {
    	//dataset을 통해 직접 설정. 추후 추가.
    }
    
    rxw.flush(out);

%>