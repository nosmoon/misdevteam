<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2600_a.jsp
* 기능 : 확장현황-기타확장-연간구독권
* 작성일자 : 2013-1-28
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	String date1 = Util.addMonth(Util.getDate(), -1 );
	
	rxw.add(codeData, "fr_dt", date1);
	rxw.add(codeData, "to_dt", Util.getDate());
	
	rxw.flush(out);	
%>
