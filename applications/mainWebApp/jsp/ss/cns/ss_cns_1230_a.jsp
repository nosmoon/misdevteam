<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_cns_1230_a.jsp
* 기능 : 상담원-불편통계 초기화면
* 작성일자 : 2004-07-21
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-03-03
* 백업파일명 : ss_cns_1230_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int codeData = rxw.add(root, "codeData", "");
	
	rxw.add(codeData, "srchyyyy", Util.getYear()); // 년
	rxw.add(codeData, "srchmm", Util.getMonth()); // 월
	rxw.add(codeData, "srchdd", Util.getDay()); // 일
	
	rxw.flush(out);
%>
