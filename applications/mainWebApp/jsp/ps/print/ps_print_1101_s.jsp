<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_print_1101_s.jsp
* 기능 : 출력리스트 초기화면
* 작성일자 : 2006-02-01
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-19
* 백업파일명 : ps_print_1101_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //  dataset 인스턴스 선언부분
    PS_S_PRINT_INITDataSet ds = (PS_S_PRINT_INITDataSet)request.getAttribute("ds");  // request dataset
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.makeDataToList(ds, "medicdlist", "cicdnm", "cicodeval", initTemp, "mcCombo");  // 매체  
    rxw.makeDataToList(ds, "medicdlist", "cicdnm", "cicodeval", initTemp, "mcCombo2");  // 매체 
    rxw.makeDataToList(ds, "medicdlist", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "mcCombo3");  // 매체
    rxw.makeDataToList(ds, "medicdlist", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "mcCombo4");  // 매체 
    rxw.makeDataToList(ds, "medicdlist", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "mcCombo5");  // 매체
    rxw.makeDataToList(ds, "rdr_extntyecdcur", "cicdnm", "cicodeval", "선택", "ALL", initTemp, "extnType");  // 확장유형    
    rxw.makeDataToList(ds, "bocdcurlist", "bonm", "bocd", "전체", "ALL", initTemp, "branchCombo");  // 지사
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "전체", "ALL", initTemp, "branchCombo2");  // 지사
                    
	rxw.flush(out);
%>
