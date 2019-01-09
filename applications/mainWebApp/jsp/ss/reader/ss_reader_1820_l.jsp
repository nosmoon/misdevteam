<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1820_l.jsp
* 기능 : 상담원 리스트 
* 작성일자 : 2013-5-10
* 작성자 :
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_TM_AGENTLISTDataSet ds = (SS_L_TM_AGENTLISTDataSet)request.getAttribute("ds");

    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
    int root = RwXmlWrapper.rootNodeID;
    //rxw.makeDataToList(ds, "curbolist", "bonm", "bocd", "전체", "", root, "branchlist");
    rxw.makeDataToList(ds, "curagentlist", "agentnm", "agentid", "전체", "", root, "agentlist", "record", "cdnm", "cd");
    
    
	rxw.flush(out);
%>
