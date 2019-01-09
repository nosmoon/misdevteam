<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_sppt_1101_s.jsp
* 기능 : 불편등록
* 작성일자 : 2003-12-08
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-18
* 백업파일명 : ps_sppt_1101_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%

    // dataset 인스턴스 선언부분
    PS_L_DSCT_SPPTDataSet ds = (PS_L_DSCT_SPPTDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
             
    rxw.makeDataToList(ds, "dsctlist", "cicdnm", "cicodeval", "선택", "", initTemp, "typeCombo");  // 확인지사
       
	rxw.flush(out);
%>
