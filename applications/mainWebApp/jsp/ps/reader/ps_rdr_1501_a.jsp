<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명   : ps_rdr_1501_a.jsp
* 기능     : 지사배정처리 초기
* 작성일자 : 2004-03-02
* 작성자   : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응.
* 수정자   : 황성진
* 수정일자 : 2009-02-04
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    //dataset 인스턴스 선언부분
	PS_L_EXTN_ASIN_SEARCHDataSet ds = (PS_L_EXTN_ASIN_SEARCHDataSet)request.getAttribute("ds");
	//배정지사
	PS_L_EXTN_ASIN_SEARCHASINBOCDCURRecord asinbocdcurRec = null;
    //화면에 보여줄 레코드 수 설정
    int   showRecCnt  =  5;
    String defaultFrom = Util.addMonth(Util.getDate(),-1);
    String defaultTo = Util.getDate();
    
    RwXmlWrapper rxw = new RwXmlWrapper();
    int root = RwXmlWrapper.rootNodeID;
    int initTemp = rxw.add(root, "initTemp", "");
    
    rxw.add(initTemp, "showRecCnt", showRecCnt);
    rxw.add(initTemp, "defaultFrom", defaultFrom);
    rxw.add(initTemp, "defaultTo", defaultTo);
    
    rxw.makeDataToList(ds, "medicdcur", "cicdnm", "cicodeval", "전체", "ALL", initTemp, "mcCombo");
    rxw.makeDataToList(ds, "asinbocdcur", "bonm", "bocd", "전체", "ALL", initTemp, "branchCombo");

	rxw.flush(out);
%>