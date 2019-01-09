<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ad_bas_1611_l.jsp
* 기능 : 
* 작성일자 : 2009-05-19
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
	AD_BAS_1611_LDataSet ds = (AD_BAS_1611_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int curlist2 = rx.add(root, "curlist2", "");

	try {		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1611_LCURLISTRecord rec = (AD_BAS_1611_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist2, "record", "");
			rx.add(record, "dlco_no", rec.dlco_no);  
			rx.add(record, "dlco_clsf", rec.dlco_clsf);
			rx.add(record, "dlco_nm", rec.dlco_nm);  
			rx.add(record, "amt_avg", rec.amt_avg);
			rx.add(record, "amt_1", rec.amt_1);
			rx.add(record, "amt_2", rec.amt_2);
			rx.add(record, "amt_3", rec.amt_3);
			rx.add(record, "amt_4", rec.amt_4);
			rx.add(record, "amt_5", rec.amt_5);
			rx.add(record, "amt_6", rec.amt_6);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
