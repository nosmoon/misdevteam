<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명      : ss_reader_1710_a.jsp
* 기능           : 독자현황-비독자관리-초기화면
* 작성일자 : 2009-08-07
* 작성자      : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역      : 
* 수정자           : 
* 수정일자      : 
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //dataset 인스턴스 선언부분
	SS_L_RDR_MNGMEMB_INITDataSet ds = (SS_L_RDR_MNGMEMB_INITDataSet)request.getAttribute("ds");

    //화면에 보여줄 레코드 수 설정
    //int   listCount  =  20;
    
    //TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "applySession", String.valueOf(applySession));
	rxw.add(codeData, "defaultDate", Util.getDate());
		
	//지국 목록 표시
	rxw.makeDataToList(ds, "custtype", "cicdnm", "cicodeval", "전체", "", codeData, "custCombo"); // 고객유형 콤보
	
	rxw.flush(out);
%>

