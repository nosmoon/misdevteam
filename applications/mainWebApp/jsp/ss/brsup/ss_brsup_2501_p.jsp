<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2501_p.jsp
* 기능 : 통합정보지원시스템-판촉물재고현황-상세조회화면-입고추가 팝업
* 작성일자 : 2009-05-06
* 작성자 : 김용욱
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_POPINBNSITEMINOUT_INITDataSet ds = (SS_L_POPINBNSITEMINOUT_INITDataSet)request.getAttribute("ds");    
	
    applySession = true;		// 세션 적용 여부
    
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // 회사코드
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.add(codeData, "inoutdt", Util.getDate()); // 날자
 	    
    rxw.add(codeData, "applySession", String.valueOf(applySession));

    rxw.makeDataToList(ds, "popinlist", "cicdnm", "cicodeval", codeData, "inwareCombo");//입고창고
    rxw.flush(out);
%> 