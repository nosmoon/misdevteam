<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2100_a.jsp
* 기능 : 확장현황-본사확장-초기화면
* 작성일자 : 2009-05-20
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_EXTN_HDQT_INITDataSet ds = (SS_L_EXTN_HDQT_INITDataSet)request.getAttribute("ds");
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "fromDate", Util.getDate()); // 기간 시작
	rxw.add(codeData, "toDate", Util.getDate()); // 기간 끝
	//rxw.add(codeData, "enterDate", Util.getDate()); // 입력일자
	
	//rxw.makeDataToList(ds, "curmedicd", "cicdnm", "cicodeval", "전체", "", codeData, "mcCombo");          // 매체
	rxw.makeDataToList(ds, "curaplcpathcd", "cicdnm", "cicodeval", "전체", "", codeData, "rmsCombo");       // 경로
	rxw.makeDataToList(ds, "curextntypecd", "cicdnm", "cicodeval", "전체", "", codeData, "typeCombo");      // 확장유형	
	rxw.makeDataToList(ds, "cursubscnfmstatcd", "cicdnm", "cicodeval", "전체", "", codeData, "errorCombo"); // 오류
	
	// 유형2
	rxw.makeDataToList(ds, "cureducd", "cicdnm", "cicodeval", "전체", "", codeData, "eduCombo"); // 에듀
	rxw.makeDataToList(ds, "curjehucd", "cicdnm", "cicodeval", "전체", "", codeData, "jehuCombo"); // 제휴
	rxw.makeDataToList(ds, "curmprcd", "cicdnm", "cicodeval", "전체", "", codeData, "mprCombo"); // MPR
	rxw.makeDataToList(ds, "curonlinecd", "cicdnm", "cicodeval", "전체", "", codeData, "onlineCombo"); // 온라인
	
	//팀 목록 표시 
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//파트 목록 표시
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//지역 목록 표시.
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	// 매체 콤보 처리(중복 선택을 위해 그리드로 표현)
	rxw.makeHugeStart(codeData, "mcGrid", ds.curmedicd.size());
	
	for(int i=0; i < ds.curmedicd.size() ; i++)
	{
		SS_L_EXTN_HDQT_INITCURMEDICDRecord rec = (SS_L_EXTN_HDQT_INITCURMEDICDRecord)ds.curmedicd.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(rec);
		}

		//데이터 추가.
		
		//나머지 필드 자동생성.		
		rxw.add_ColVal("");
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
		
	rxw.flush(out);	
%>
