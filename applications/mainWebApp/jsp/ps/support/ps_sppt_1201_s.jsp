<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_sppt_1201_s.jsp
* 기능 : 불편처리
* 작성일자 : 2003-12-08
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-18
* 백업파일명 : ps_sppt_1201_s.jsp_org
---------------------------------------------------------------------------------------------------%>

<%
    String lo_empno     = Util.getSessionParameterValue(request, "emp_no", true);       //사원번호
    String lo_kflnm     = Util.getSessionParameterValue(request, "emp_nm",true);         //사원명

    String records_per_page = "20";
    int li_per = Integer.parseInt(records_per_page) ;
    // dataset 인스턴스 선언부분
    PS_L_DSCT_SPPTDataSet ds = (PS_L_DSCT_SPPTDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    
    rxw.add(initTemp, "defaultFrom", Util.addDate(ds.sysdate,-7));
    rxw.add(initTemp, "defaultTo", Util.getDate());        
             
    rxw.makeDataToList(ds, "dsctlist", "cicdnm", "cicodeval", "전체", "", initTemp, "typeCombo");  // 불편유형
    rxw.makeDataToList(ds, "bocdcur", "cicdnm", "cicodeval", "선택", "", initTemp, "branchCombo");  // 소속지사
       
	rxw.flush(out);

%>

