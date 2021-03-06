<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_5800_a.jsp
* 기능 : 글쓰기노트 - 초기화면
* 작성일자 : 2018-02-09
* 작성자 : 민기홍
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 : 
* 수정일자 :
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_SLS_EXTN_5800_ADataSet ds = (SS_SLS_EXTN_5800_ADataSet)request.getAttribute("ds");
	
	applySession = true;	// 세션 적용 여부
	
	String resPath = request.getParameter("res_path"); //TrustForm 처리 시작
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;	
	int codeData = rxw.add(root, resPath, "");	
	
	rxw.add(codeData, "fromDate", Util.getDate()); // 기간 시작
	rxw.add(codeData, "toDate", Util.getDate()); // 기간 끝	
	
	rxw.makeDataToBulk(ds, "teamlist", codeData, "teamlist");	
	rxw.makeDataToBulk(ds, "partlist", codeData, "partlist_temp");
	rxw.makeDataToBulk(ds, "arealist", codeData, "arealist_temp");
	rxw.makeDataToBulk(ds, "errlist", codeData, "errlist");
	
	rxw.flush(out);
%>