<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* 파일명     : sl_reader_1380_s.jsp
* 기능       : 독자정보관리(판촉물내역팝업-상세조회)
* 작성일자   : 2004-06-03
* 작성자     : 김영윤
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-07
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%
	// request
	String rdr_no = Util.checkString(request.getParameter("rdr_no"));
	String payno = Util.checkString(request.getParameter("payno"));

    // getting dataset
    SL_S_BNS_ITEMPAYDataSet ds = (SL_S_BNS_ITEMPAYDataSet)request.getAttribute("ds");  // request dataset
    
  	//TrustForm 처리.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	int detailDataEx = rxw.add(resTemp, "detailDataEx", "");
	rxw.add(detailDataEx, "accflag", "U");
	rxw.add(detailDataEx, "rdr_no", rdr_no);
	rxw.add(detailDataEx, "payno", payno);
	rxw.add(detailDataEx, "bonm", Util.getSessionParameterValue(request, "bonm", true));
	
	rxw.flush(out);
%>
