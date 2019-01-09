<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2610_a.jsp
* 기능 : 확장현황-기타확장-연간구독권
* 작성일자 : 2013-1-28
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 : 
* 수정일자 :
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_YEARLY_SUBSDataSet ds = (SS_L_YEARLY_SUBSDataSet)request.getAttribute("ds");
   
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
  	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
    
  	rxw.add(resTemp, "selcnt", ds.getSelcnt());
	rxw.add(resTemp, "usecnt", ds.getUsecnt());
  	
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>


