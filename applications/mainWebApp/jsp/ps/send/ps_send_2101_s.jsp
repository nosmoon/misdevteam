<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%@ page language="java" import="java.io.*" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_2101_s.jsp
* 기능 : 반송조회
* 작성일자 : 2003-12-08
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-18
* 백업파일명 : ps_send_2101_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page) ;
    // dataset 인스턴스 선언부분
    PS_S_SEND_RETNDataSet ds = (PS_S_SEND_RETNDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    
    rxw.add(initTemp, "defaultDate", Util.getDate());
    rxw.add(initTemp, "defaultFrom", Util.getDate());
//    rxw.add(initTemp, "defaultFrom", Util.addDate(Util.getDate(),-31)); 
    rxw.add(initTemp, "defaultTo", Util.getDate()); 
       
    rxw.makeDataToList(ds, "retnkindcur", "cicdnm", "cicodeval", "선택", "", initTemp, "retnkindCombo"); // 반송종류
    rxw.makeDataToList(ds, "retnkindcur", "cicdnm", "cicodeval", "전체", "", initTemp, "retnkindCombo2"); // 반송종류(하단)
    rxw.makeDataToList(ds, "retnresncur", "cicdnm", "cicodeval", "선택", "", initTemp, "retnresnCombo");  // 반송사유 
    rxw.makeDataToList(ds, "intgbocdcur", "bonm", "bocd", "전체", "", initTemp, "branchCombo");  // 처리지사
       
	rxw.flush(out);
%>

