<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_2201_a.jsp
* 기능 : 발송집계 초기 화면
* 작성일자 : 2005-10-01
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-18
* 백업파일명 : ps_send_2201_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    String records_per_page = "5";
    //  dataset 인스턴스 선언부분
    PS_S_SEND_LUMP_PROCDataSet ds = (PS_S_SEND_LUMP_PROCDataSet)request.getAttribute("ds");  // request dataset

    // 화면당 보여줄 Row수
    int li_per = 10;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    //rxw.add(initTemp, "recordPerPage", records_per_page);
    //rxw.add(initTemp, "js_fn_nm", "page_move");
            
    rxw.makeDataToList(ds, "bocdcur", "cicdnm", "cicodeval", "전체", "", initTemp, "branchCombo");  // 처리지사
    rxw.makeDataToList(ds, "cmpycdcur", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "cmpyCombo"); // 선택
    
	rxw.flush(out);
    
%>

