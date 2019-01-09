<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_common_1116_l.jsp
* 기능 : 공통 지국코드,지국명 목록 가져오기
* 작성일자 : 2005-04-14
* 작성자 :
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자 : 황성진
* 수정일자 : 2009-01-23
* 백업파일명 : ss_common_1116_l.jsp_org
* 수정사유 : TrustForm 대응.
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_BOLISTDataSet ds = (SS_L_BOLISTDataSet)request.getAttribute("ds");
    String applySessionStr = (String)request.getParameter("applySession");

    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
    int root = RwXmlWrapper.rootNodeID;
    //rxw.makeDataToList(ds, "curbolist", "bonm", "bocd", "전체", "", root, "branchlist");
    rxw.makeDataToList(ds, "curbolist", "bonm", "bocd", "전체", "", root, "codelist", "record", "cdnm", "cd");
    
	rxw.flush(out);
%>
