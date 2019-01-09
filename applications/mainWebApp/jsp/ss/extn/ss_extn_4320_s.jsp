<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_4320_s.jsp
* 기능 : 확장관리-문자점검독자관리-설문등록목록
* 작성일자 : 2015-12-04
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
System.out.println("======ss_extn_4320_s.jsp======");
	SS_S_MO_SVY_RDRDataSet ds = (SS_S_MO_SVY_RDRDataSet)request.getAttribute("ds");
	
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.makeDataToBulk(ds, "resplist", resTemp, "listGrid");
	
	rxw.flush(out);

%>

