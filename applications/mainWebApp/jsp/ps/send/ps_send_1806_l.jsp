<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_1706_l.jsp
* 기능 : 보너스북발송 일괄확인 리스트
* 작성일자 : 2004-02-25
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 20090209
* 백업파일명 : ps_send_1806_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // 화면에 보여줄 라인수
    String records_per_page =   "10";

    // dataset 인스턴스 선언부분
    PS_L_SEND_BNSBK_CONDataSet ds = (PS_L_SEND_BNSBK_CONDataSet)request.getAttribute("ds");  // request dataset

	int no_data_page = Integer.parseInt(records_per_page) - ds.curcommlist.size();

	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");

    // 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
   	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "sendInfoGrid");
    
	rxw.flush(out);

    //data가 없을 경우 처리. 추가 필요.
        
    //page 처리. 추가 필요.
%>
