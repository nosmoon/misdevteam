<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1126_l.jsp
* 기능     : 확장독자관리 확장독자검색
* 작성일자 : 2004-02-25
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-18
* 백업파일명 : ps_rdr_1126_l.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    //dataset 인스턴스 선언부분
	PS_L_RDR_EXTN_SEARCHDataSet ds = (PS_L_RDR_EXTN_SEARCHDataSet)request.getAttribute("ds");

    //화면에 보여줄 레코드 수 설정
    int   showRecCnt  =  5;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", showRecCnt);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    rxw.add(initTemp, "defaultFrom", Util.addMonth(Util.getDate(),-1));
    rxw.add(initTemp, "defaultTo", Util.getDate());
    
    rxw.makeDataToList(ds, "aplcpathcdcur", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "routeCombo"); // 경로
    rxw.makeDataToList(ds, "rdr_extntyecdcur", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "typeCombo"); // 유형
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "mcCombo"); // 신청매체
        
	rxw.flush(out);
%>

