<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brsup_2504_p.jsp
* 기능 : 지국지원-판촉현황-판촉물재고현황 통합출고등록 팝업
* 작성일자 : 2009-06-19
* 작성자 : 김용욱
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_I_BNSITEMTOTALOUT_INITDataSet ds = (SS_I_BNSITEMTOTALOUT_INITDataSet)request.getAttribute("ds");
    applySession = true;		// 세션 적용 여부
    
    String cmpycd = Util.getSessionParameterValue(request, "cmpycd", false); // 회사코드
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
    int codeData = rxw.add(root, "codeData", "");
    
    rxw.add(codeData, "send_qty", ds.send_qty); //재고수량(유가수량)
    rxw.add(codeData, "owh_dt", Util.getDate()); // 출고일자 
 	    
    rxw.add(codeData, "applySession", String.valueOf(applySession));
    
    rxw.flush(out);
%> 