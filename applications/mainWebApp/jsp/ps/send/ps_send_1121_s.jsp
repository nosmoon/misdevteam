<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_1121_s.jsp
* 기능 : 매체 일괄발송 매체호수
* 작성일자 : 2005-11-28
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 20090209
* 백업파일명 : ps_send_1121_s.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //  dataset 인스턴스 선언부분
    PS_S_SEND_LUMP_CNFMDataSet ds = (PS_S_SEND_LUMP_CNFMDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
           
    rxw.makeDataToList(ds, "medisercur", "mediser_view", "mediser_no", initTemp, "mcNoCombo");  // 매체호수
    rxw.flush(out);
%>
