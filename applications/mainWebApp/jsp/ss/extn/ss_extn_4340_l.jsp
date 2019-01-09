<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_4340_l.jsp
* 기능 : 설문명 리스트
* 작성일자 : 2016-02-29
* 작성자 :
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_MO_SVYLISTDataSet ds = (SS_L_MO_SVYLISTDataSet)request.getAttribute("ds");

    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm 서버처리 객체.
    int root = RwXmlWrapper.rootNodeID;

    //rxw.makeDataToList(ds, "curbolist", "bonm", "bocd", "전체", "", root, "branchlist");
    rxw.makeDataToList(ds, "mosvylist", "svynm", "svyid", "전체", "", root, "svylist", "record", "svynm", "svyid");

	rxw.flush(out);
%>
