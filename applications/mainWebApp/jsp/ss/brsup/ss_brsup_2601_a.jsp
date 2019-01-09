<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2600_a.jsp
* 기능 : 지국지원-빌링_자동이체-이체신청개선-초기화면
* 작성일자 : 2009-05-20
* 작성자 : 김용욱
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    applySession = true;		// 세션 적용 여부
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int resTemp = rxw.add(root, "resTemp", "");
    
    rxw.add(resTemp, "basidt_f", Util.getDate()); // 기간 시작
	
    rxw.add(resTemp, "applySession", String.valueOf(applySession));

    rxw.flush(out);
%> 