<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_1920_s.jsp
* 기능 : 중지방어관리-상세
* 작성일자 : 2015-02-27
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_SUSP_DEFDataSet ds = (SS_S_SUSP_DEFDataSet)request.getAttribute("ds");
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	System.out.println("aaaaa"+Util.Timestamp2Str(ds.getCns_cnfmdt(),"yyyy-MM-dd' 'HH:mm:ss"));
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	rxw.add(resTemp, "cns_cnfmdt", Util.Timestamp2Str(ds.getCns_cnfmdt(),"yyyy-MM-dd' 'HH:mm:ss"));
	rxw.add(resTemp, "bo_cnfmdt", Util.Timestamp2Str(ds.getBo_cnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); 	
	
	rxw.flush(out);

%>

