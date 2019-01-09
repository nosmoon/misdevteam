<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : ss_brsup_2400_s.jsp
* 기능     : 주간조선관리-정산마감-초기화면
* 작성일자 : 2007-04-12
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-03-03
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    applySession  = true;    //세션 적용 여부
    
  	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int defaultData = rxw.add(root, "defaultData", "");
	
	rxw.add(defaultData, "applySession", String.valueOf(applySession));
	rxw.add(defaultData, "fryymm", Util.getCutStr(Util.addMonth(Util.getDate(),-1),6));
	rxw.add(defaultData, "toyymm", Util.getYyyyMm());
	rxw.add(defaultData, "closyymm", Util.getYyyyMm());
	
	rxw.flush(out);
%>
