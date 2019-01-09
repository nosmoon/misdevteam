<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.etcbook.rec.*
	,	chosun.ciis.mt.etcbook.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCBOOK_1300_LDataSet ds = (MT_ETCBOOK_1300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
    int resSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	resSet = rx.add(root, "tempData", "");
	
	try {
		/****** CURLIST BEGIN */
        dataSet = rx.add(resSet, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_ETCBOOK_1300_LCURLISTRecord rec = (MT_ETCBOOK_1300_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_cd+ " " +rec.dept_nm);  
			rx.add(record, "subs_frdt", rec.subs_frdt);
			rx.add(record, "sbend_dt", rec.sbend_dt);
			rx.add(record, "book_nm", rec.book_nm); 
			rx.add(record, "book_cd", rec.book_cd);
			rx.add(record, "qty", rec.qty);
			rx.add(record, "uprc_won", rec.uprc_won);
			rx.add(record, "curc_clsf", rec.curc_clsf);
			rx.add(record, "uprc_frex", rec.uprc_frex);
			rx.add(record, "dlvs_plac", rec.dlvs_plac);
			rx.add(record, "dlvs_dt", rec.dlvs_dt);
			rx.add(record, "remk", rec.remk);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<dept_cd/>
			<subs_frdt/>
			<sbend_dt/>
			<book_cd/>
			<qty/>
			<uprc_won/>
			<curc_clsf/>
			<uprc_frex/>
			<dlvs_plac/>
			<dlvs_dt/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 10 11:25:55 KST 2009 */ %>