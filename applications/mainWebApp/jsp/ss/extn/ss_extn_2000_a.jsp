<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2000_a.jsp
* 기능 : 확장현황-중지현황-초기화면
* 작성일자 : 2009-05-14
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: 
* 수정자	: 
* 수정일자	: 
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_EXTN_SUSP_INITDataSet ds = (SS_L_EXTN_SUSP_INITDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	
	rxw.add(codeData, "defaultFrom", Util.getDate()); // 기간 from 
	rxw.add(codeData, "defaultTo", Util.getDate()); // 기간 to
		
	//rxw.makeDataToList(ds, "cursuspcd", "cicdnm", "cicodeval", codeData, "suspCombo"); // 오류
	
	//부서(팀)목록 표시.
	//int comboTeam = rxw.add(codeData, "teamlist" , "");
	//writeDeptOpt(session, rxw, comboTeam, true, ds, "curdeptcd", "boksnm", "deptcd");
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");
	
	//파트 목록 표시 - 임시
	//int comboPart = rxw.add(codeData, "partlist_temp" , "");
	//rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "전체", "");
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	
	//지역 목록 표시.
    //int comboArea = rxw.add(codeData, "arealist_temp" , "");
	//writeAreaOpt(session, rxw, comboArea, true);
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	
	// 중지구분 콤보 처리(중복 선택을 위해 그리드로 표현)
	//rxw.makeDataToBulk(ds, "cursuspcd", codeData, "listGrid");
	rxw.makeHugeStart(codeData, "listGrid", ds.cursuspcd.size());
	
	for(int i=0; i < ds.cursuspcd.size() ; i++)
	{
		SS_L_EXTN_SUSP_INITCURSUSPCDRecord curcommlistRec = (SS_L_EXTN_SUSP_INITCURSUSPCDRecord)ds.cursuspcd.get(i);
		
		//title 추가.
		if(i == 0)
		{		
			//나머지 필드는 자동 생성.
			rxw.add_ColVal("check");
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		
		//나머지 필드 자동생성.		
		rxw.add_ColVal("N");
		rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>

