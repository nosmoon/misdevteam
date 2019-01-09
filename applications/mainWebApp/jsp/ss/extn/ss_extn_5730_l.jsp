<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_5730_l.jsp
* 기능 : 정기구독권-구독권 사용 조회
* 작성일자 : 2018-01-10
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 : 
* 수정일자 :
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_5730_LDataSet ds = (SS_SLS_EXTN_5730_LDataSet)request.getAttribute("ds");
   
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.makeParentNode(root, "resTemp");

    // 조회 결과.
  	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
   
	rxw.add(resTemp, "qty_100y", Util.comma(ds.getQty_100y())); // 조선닷컴
    rxw.add(resTemp, "qty_100n", Util.comma(ds.getQty_100n())); // 총부수
    rxw.add(resTemp, "qty_00", Util.comma(ds.getQty_00())); // 총건수
    rxw.add(resTemp, "totqty", Util.comma(ds.getTotqty())); // 총건수
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>


