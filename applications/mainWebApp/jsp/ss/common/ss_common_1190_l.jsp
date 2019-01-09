<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_common_1100_l.jsp
* 기능 : 공통 지역코드,코드명 목록 가져오기
* 작성일자 : 2003-11-20
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자 : 황성진
* 수정일자 : 2009-01-23
* 백업파일명 : ss_common_1100_l.jsp_org
* 수정사유 : TrustForm 대응.
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_JIYEOGCDDataSet ds = (SS_L_JIYEOGCDDataSet)request.getAttribute("ds");
    String applySessionStr = (String)request.getParameter("applySession");
    
    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
    int root = RwXmlWrapper.rootNodeID;
    int itemDepth  = 0;

    if("true".equals(applySessionStr)){

		// session의 지역코드, 지역명 목록으로 <option>을 구성한다.
		int comboArea  = rxw.add(root, "arealist_temp" , "");
    
		String areanm = (String)session.getAttribute("areanm");
		ArrayList areanmList = getTokens(areanm, "^");		// 구분자 "^"

		if(areanmList.size() == 0){	// 지역코드,지역명 갯수가 없음.
			// 지역코드,지역명이 존재하지 않음. 에러처리
		}else if(areanmList.size() == 1){	// 지역코드,지역명 갯수가 하나.
	
			String areacdnm = (String)areanmList.get(0);
			ArrayList areacdnmList = getTokens(areacdnm, "|");	// 구분자 "|"
			if(areacdnmList.size() == 2){
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
					for(int j=0; j<ds.curcommlist.size(); j++){
						SS_L_JIYEOGCDCURCOMMLISTRecord record = (SS_L_JIYEOGCDCURCOMMLISTRecord)ds.curcommlist.get(j);
	
						if(areacdnmList.get(0).equals(record.areacd)){
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
    	rxw.makeDataToList(ds, "curcommlist", "areanm", "areacd", "전체", "", root, "arealist_temp", "record", "area_nm", "area_cd");
    }
	//System.out.println(rx.getXml());    
	rxw.flush(out);
%>
