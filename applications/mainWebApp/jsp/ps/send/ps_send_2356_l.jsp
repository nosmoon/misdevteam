<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_1206_l.jsp
* 기능 : 매체 일괄발송 발송처리 조회화면
* 작성일자 : 2004-03-03
* 작성자 : 장수환
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응 구조로 변경.
* 수정자 : 권정윤
* 수정일자 : 20090210
* 백업파일명 : ps_send_2356_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // dataset 인스턴스 선언부분
    PS_L_BO_SEND_LISTDataSet ds = (PS_L_BO_SEND_LISTDataSet)request.getAttribute("ds");  // request dataset
	// 지사별확인 리스트 라인수 설정
    String records_per_page = request.getParameter("records_per_page");

	int no_data_page = Integer.parseInt(records_per_page) - ds.curcommlist.size();
	
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
            
    //조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
   	rxw.makeDataToBulk(ds, "curcommlist", acctTemp, "sendInfoGrid");
    
	rxw.flush(out);

    //data가 없을 경우 처리. 추가 필요.
        
    //page 처리. 추가 필요.
%>
