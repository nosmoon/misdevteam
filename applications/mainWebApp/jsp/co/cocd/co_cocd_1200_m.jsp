<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.cocd.rec.*
	,	chosun.ciis.co.cocd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : co_cocd_1000_m.jsp
* 기능 : 공통코드팝업-초기화면
* 작성일자 : 2009-02-09
* 작성자 : 김태길
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	CO_COCD_1200_MDataSet ds = (CO_COCD_1200_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		int job_clsf = rx.add(tempData, "job_clsf", "");	
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			CO_COCD_1200_MCOMMCDCUR1Record rec = (CO_COCD_1200_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			int record = rx.add(job_clsf, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd + " " + rec.cdnm);
		}
		int cd_clsf = rx.add(tempData, "cd_clsf", "");	
		for(int i = 0; i < ds.commcdcur2.size(); i++) {
			CO_COCD_1200_MCOMMCDCUR2Record rec = (CO_COCD_1200_MCOMMCDCUR2Record)ds.commcdcur2.get(i);
			int record = rx.add(cd_clsf, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd + " " + rec.cdnm);
			rx.add(record, "pcode", rec.pcode);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
