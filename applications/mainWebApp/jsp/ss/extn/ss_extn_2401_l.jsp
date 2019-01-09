<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2401_l.jsp
* 기능 : 확장현황-기타확장관리-대학생캠페인확장 조회
* 작성일자 : 2012-02-20
* 작성자 : 이혁
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 : 
* 수정일자 :
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SL_L_CAMPEXTN_UNIDataSet ds = (SL_L_CAMPEXTN_UNIDataSet)request.getAttribute("ds");
   
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
  	rxw.makeDataToBulk(ds, "curextnlist", resTemp, "listGrid");
  	
  	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "totalqty", ds.getTotalqty());
	
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>


