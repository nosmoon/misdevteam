<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_2131_l.jsp
* 기능 : 선택된 독자에 해당하는 보너스북 조회
* 작성일자 : 2003-12-08
* 작성자 : 김건호
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    //  dataset 인스턴스 선언부분
    PS_L_BNS_BOOK_CDDataSet ds = (PS_L_BNS_BOOK_CDDataSet)request.getAttribute("ds");

    // 화면당 보여줄 Row수
    int li_per = 10;
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "dataTemp", "");
                 
    //rxw.makeDataToBulk(ds, initTemp, "detailGrid");
    rxw.makeDataToList(ds, "bns_bookcdcur", "bns_booknm", "bns_bookcd", initTemp, "bookCombo");  // 처리지사
    
	rxw.flush(out);    
%>

