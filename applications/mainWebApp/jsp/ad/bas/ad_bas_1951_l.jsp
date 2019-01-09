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
* 파일명 : ad_bas_1810_l.jsp
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
	AD_BAS_1951_LDataSet ds = (AD_BAS_1951_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int curlist1 = rx.add(root, "curlist1", "");

	try {		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1951_LCURLISTRecord rec = (AD_BAS_1951_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist1, "record", "");
			rx.add(record, "basi_dt"		, rec.basi_dt);
			rx.add(record, "avg_amt"		, rec.avg_amt);
		}  
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
