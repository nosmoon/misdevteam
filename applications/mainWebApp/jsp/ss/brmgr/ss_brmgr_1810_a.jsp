<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1810_a.jsp
* 기능 :
* 작성일자 :
* 작성자 :
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : 업무환경구분에 따른 추가
* 수정자   :  이혁
* 수정일자 : 2006-07-12
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-10
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%-- dataset 인스턴스 선언부분--%>
<%
	SS_L_READER_BOINFO_INITDataSet ds = (SS_L_READER_BOINFO_INITDataSet)request.getAttribute("ds");

    boolean applySession = true;	// 세션 적용 여부
	String jobcd = Util.getSessionParameterValue(request, "jobcd", false);	// 업무구분코드(판매국장,지원부장,영업부장은 목록 조회 옵션을 보여준다.)

    //업무환경구분 설정 시작
    Vector jobcdSet = new Vector();
    String jobcd_param = "";
	//String jobcd = (String)request.getHeader("JOBCD");
    if( jobcd == null ) {
      jobcd = "^";
//      jobcd = "100^280^710^920^950^T15";
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
    
    //TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "jobcdset", jobcd_param);
	
	//부서(팀)목록 표시.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//파트 목록 표시 - 임시
	//rxw.makeEmpytList(codeData, "partlist_temp", "record", "dept_nm", "dept_cd", "전체", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//지역 목록 표시.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	//지국 목록 표시
	rxw.makeEmpytList(codeData, "codelist", "record", "cdnm", "cd", "전체", "");
	
	rxw.flush(out);
%>
