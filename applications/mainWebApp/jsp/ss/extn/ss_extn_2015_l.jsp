<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2015_l.jsp
* 기능 : 확장현황-중지현황-조회(중지건별)
* 작성일자 : 2009-05-14
* 작성자 : 권정윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 : 
* 수정일자 :
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_EXTN_SUSP_PERDataSet ds = (SS_L_EXTN_SUSP_PERDataSet)request.getAttribute("ds");
    int extnListCount = 5;	// 한 화면당 리스트 항목 수
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
  	rxw.makeDataToBulk(ds, "susplist", resTemp, "suspGrid");
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>


