<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2296_l.jsp
* 기능 : 확장현황-대납독자일괄수금처리-목록조회
* 작성일자 : 2011-10-06
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 : 
* 수정일자 :
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_RDR_EXTN_DANAPDataSet ds = (SS_L_RDR_EXTN_DANAPDataSet)request.getAttribute("ds");
   
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
  	rxw.makeDataToBulk(ds, "curlist", resTemp, "listGrid");
	rxw.flush(out);
	
%>


