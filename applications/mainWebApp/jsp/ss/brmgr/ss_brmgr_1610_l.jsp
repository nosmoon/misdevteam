<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_brmgr_1610_l.jsp
* 기능 : 지국경영-스포츠부수현황-목록
* 작성일자 : 2004-03-12
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-02-14
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_QTY_SPDataSet ds = (SS_L_QTY_SPDataSet)request.getAttribute("ds");
    //int spqtyListCount = 20;	// 한 화면당 리스트 항목 수
    int spqtyListCount = 5000;
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", ""); 
	
	rxw.add(resTemp, "totalcnt_f", Util.comma(ds.getTotalcnt()));
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", spqtyListCount);
	
	rxw.makeDataToBulk(ds, "curcommlist", resTemp, "listGrid");
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>
