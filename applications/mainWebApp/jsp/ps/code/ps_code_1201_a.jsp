<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_code_1101_a.jsp
* 기능 : 매체단가 초기화면
* 작성일자 : 2004-02-20
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-12
* 백업파일명 : ps_code_1201_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // 페이지당 보여줄 라인수
    String records_per_page = "15";
    int li_per = Integer.parseInt(records_per_page) ;
    //	dataset 인스턴스 선언부분
    PS_S_MEDI_UPRCDataSet ds = (PS_S_MEDI_UPRCDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    rxw.add(initTemp, "today", Util.getDate());
             
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", initTemp, "mcCombo"); // 매체
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", initTemp, "mcCombo2"); // 매체(하단)
    
    rxw.makeDataToList(ds, "bocd", "bonm", "bocd", initTemp, "branchCombo"); // 지국지사명
    rxw.makeDataToList(ds, "bocd", "bonm", "bocd", initTemp, "branchCombo2"); // 지국지사명(하단)
    rxw.makeDataToList(ds, "acpntype", "cicdnm", "cicodeval", initTemp, "acpntypeCombo"); // 접수형태
    rxw.makeDataToList(ds, "acpnclsf", "cicdnm", "cicodeval", initTemp, "acpnclsfCombo"); // 접수구분
       
	rxw.flush(out);
    
%>
