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
* ���ϸ� : ad_bas_1618_l.jsp
* ��� : 
* �ۼ����� : 2009-05-19
* �ۼ��� : ���±�
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AD_BAS_1618_LDataSet ds = (AD_BAS_1618_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int curlist2 = rx.add(root, "curlist2", "");

	try {		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1618_LCURLISTRecord rec = (AD_BAS_1618_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist2, "record", "");
			rx.add(record, "sun"		, rec.sun);
			rx.add(record, "mon"		, rec.mon);
			rx.add(record, "tue"		, rec.tue);
			rx.add(record, "wed"		, rec.wed);
			rx.add(record, "thr"		, rec.thr);
			rx.add(record, "fri"		, rec.fri);
			rx.add(record, "sat"		, rec.sat);
		}  
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
