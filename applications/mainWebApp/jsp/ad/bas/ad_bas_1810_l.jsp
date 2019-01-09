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
	AD_BAS_1810_LDataSet ds = (AD_BAS_1810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int curlist1 = rx.add(root, "curlist1", "");

	try {		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1810_LCURLISTRecord rec = (AD_BAS_1810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist1, "record", "");
			rx.add(record, "make_dt", rec.make_dt);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "make_pers_nm", rec.make_pers_nm);
			rx.add(record, "diary_titl", rec.diary_titl);
			rx.add(record, "dlco_no", rec.dlco_no);
		}  
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
