<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_3310_l.jsp
* 기능 : 확장관리-문자점검독자관리-설문등록목록
* 작성일자 : 2015-11-11
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	System.out.println("ss_extn_3310_l.jsp");
	SS_L_MO_SVYDataSet ds = (SS_L_MO_SVYDataSet)request.getAttribute("ds");
        
    RwXmlWrapper2 rxw = new RwXmlWrapper2();
    
    int root = RwXmlWrapper2.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "dataTemp");
    
    rxw.makeDataToBulk(ds, "svycur", resTemp, "listGrid");
    
	rxw.flush(out);
%>



