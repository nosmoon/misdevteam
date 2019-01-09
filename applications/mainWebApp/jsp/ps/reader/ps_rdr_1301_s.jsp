<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_rdr_1301_s.jsp
* 기능 : 중재처리 초기화면
* 작성일자 : 2004-02-20
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-13
* 백업파일명 : ps_rdr_1301_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // 페이지당 보여줄 라인수
    String records_per_page = "5";
    int li_per = Integer.parseInt(records_per_page) ;
    //	dataset 인스턴스 선언부분
    PS_S_RDR_ARBTDataSet ds = (PS_S_RDR_ARBTDataSet)request.getAttribute("ds");  // request dataset

	RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", records_per_page);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    rxw.add(initTemp, "defaultFrom", Util.addDate(ds.sysdate,-7));
    rxw.add(initTemp, "defaultTo", ds.sysdate);
    
    rxw.makeDataToList(ds, "bocd", "bonm", "bocd", "전체", "", initTemp, "branchCombo"); // 지사코드
	rxw.makeDataToList(ds, "aprvproccd", "cicdnm", "cicodeval", "전체", "", initTemp, "aprvCombo"); // 처리구분
        
	rxw.flush(out);
%>

