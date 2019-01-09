<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1601_a.jsp
* 기능     : 모닝+ 현금영수증 초기
* 작성일자 : 2004-04-21
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-23
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //dataset 인스턴스 선언부분
    CO_L_RDRCRTS_GRAD_APLCDataSet ds = (CO_L_RDRCRTS_GRAD_APLCDataSet)request.getAttribute("ds");

    //화면에 보여줄 레코드 수 설정
    int   showRecCnt  =  5;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "showRecCnt", showRecCnt);
    rxw.add(initTemp, "defaultFrom", Util.addDate(Util.getDate(),-180));
    rxw.add(initTemp, "defaultTo", Util.getDate());
    
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "mcCombo"); // 신청매체 
    rxw.makeDataToList(ds, "dtlsprocstatcur", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "moCombo"); // 모플회원
    rxw.makeDataToList(ds, "cashrcptstatcur", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "cashCombo"); // 현금영수증
    //rxw.makeDataToList(ds, "pusbocdcur", "bonm", "bocd", "선택", "", initTemp, "branchCombo"); // 지사
    //rxw.makeDataToList(ds, "dtlsprocstatcur", "cicdnm", "cicodeval", initTemp, "moCombo2"); // 모플회원
    //rxw.makeDataToList(ds, "errresncdcur", "cicdnm", "cicodeval", "선택", "", initTemp, "errCombo"); // 오류사유
    //rxw.makeDataToList(ds, "cashrcptstatcur", "cicdnm", "cicodeval", initTemp, "cashCombo2"); // 현금영수증
        
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "mcCombo2"); // 매체(하단)

	rxw.flush(out);	
%>


