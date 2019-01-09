<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_1900_a.jsp
* 기능 : 지국지원-빌링-파일업로드-지로EDI
* 작성일자 : 2008-05-14
* 작성자 : 노상현
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-16
* 백업파일명 : ss_brsup_1770_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    //int wrkListCount = 5;		// 한 화면당 리스트 항목 수
    int wrkListCount = 5000;		// 한 화면당 리스트 항목 수
    //int wrkdtlListCount = 10;	// 한 화면당 리스트 항목 수(내역)
    int wrkdtlListCount = 5000;	// 한 화면당 리스트 항목 수(내역)
    applySession = true;		// 세션 적용 여부
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.add(codeData, "applySession", String.valueOf(applySession));
    rxw.add(codeData, "pagesize", wrkListCount);
    rxw.add(codeData, "wrkListCount", wrkListCount);
    rxw.add(codeData, "wrkdtlListCount", wrkdtlListCount);
    
    rxw.add(codeData, "frdt", Util.getDate()); //실행일자 시작
    rxw.add(codeData, "todt", Util.getDate()); //실행일자 종료

    rxw.flush(out);
%>
