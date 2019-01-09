<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_send_2001_a.jsp
* 기능 : 지로추가발송처리 초기화면
* 작성일자 : 2004/03/15
* 작성자 : 장수환
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 권정윤
* 수정일자 : 2009-02-10
* 백업파일명 : ps_send_2001_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    //  dataset 인스턴스 선언부분
    PS_S_SEND_LUMP_PROCDataSet ds = (PS_S_SEND_LUMP_PROCDataSet)request.getAttribute("ds");  // request dataset

    // 화면당 보여줄 Row수
    int li_per = 20;
    
	String yesterday = Util.addDate(Util.getDate(),-1);
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
       
    rxw.add(initTemp, "recordPerPage", li_per);
    rxw.add(initTemp, "js_fn_nm", "page_move");
    rxw.add(initTemp, "yesterday", yesterday);
       
    rxw.makeDataToList(ds, "bocdcur", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "branchCombo");  // 발송지사
    rxw.flush(out);   
    
%>

