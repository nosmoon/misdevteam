<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_4330_l.jsp
* 기능 : 확장관리-문자점검독자관리-해당독자응답리스트
* 작성일자 : 2015-12-07
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	System.out.println("ss_extn_4330_l.jsp");
	SS_L_MO_SVY_RESPDataSet ds = (SS_L_MO_SVY_RESPDataSet)request.getAttribute("ds");
        
    RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int respTemp = rxw.makeParentNode(root, "dataTemp");
    
    rxw.makeDataToBulk(ds, "resplist", respTemp, "listGrid");
    
	rxw.flush(out);
%>



