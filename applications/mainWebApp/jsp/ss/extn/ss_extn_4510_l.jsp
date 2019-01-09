<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_4510_l.jsp
* 기능 : 무료지관리-조회
* 작성일자 : 2016.01.29
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	System.out.println("ss_extn_4510_l.jsp");
    SS_L_FREENWSPDataSet ds = (SS_L_FREENWSPDataSet)request.getAttribute("ds");

    RwXmlWrapper rxw = new RwXmlWrapper();

    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    rxw.makeDataToBulk(ds, "freelist", resTemp, "listGrid");

	rxw.flush(out);
%>



