<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_3300_a.jsp
* 기능 : 확장관리-문자점검독자관리-설문등록초기화면
* 작성일자 : 2015-11-11
* 작성자 : 장선희
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

//	rxw.add(codeData, "frdt", Util.getDate()); // 기간 시작
	rxw.add(codeData, "frdt", Util.addMonth(Util.getDate(),-1));// 기간 시작
	rxw.add(codeData, "todt", Util.getDate()); // 기간 끝

	rxw.flush(out);
%>
