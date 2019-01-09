<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1830_l.jsp
* 기능 : 캠페인 리스트 
* 작성일자 : 2013-5-29
* 작성자 :
---------------------------------------------------------------------------------------------------%>

<%
	SS_L_TM_CAMPLISTDataSet ds = (SS_L_TM_CAMPLISTDataSet)request.getAttribute("ds");

    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
    int root = RwXmlWrapper.rootNodeID;
   
    //rxw.makeDataToList(ds, "curbolist", "bonm", "bocd", "전체", "", root, "branchlist");
    rxw.makeDataToList(ds, "curcamplist", "campnm", "campid", "전체", "", root, "camplist", "record", "cdnm", "cd");
    
	rxw.flush(out);
%>
