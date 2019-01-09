<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_2209_LDataSet ds = (MT_PAPINOUT_2209_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "gridData", "");

		if ( ds.curlist.size() > 0 ) {
			MT_PAPINOUT_2209_LCURLISTRecord rec = (MT_PAPINOUT_2209_LCURLISTRecord)ds.curlist.get(0);
			rx.add(dataSet, "pcsim62cnt", rec.pcsim62cnt);
			rx.add(dataSet, "mssim62cnt", rec.mssim62cnt);
			rx.add(dataSet, "pcsim31cnt", rec.pcsim31cnt);
			rx.add(dataSet, "mssim31cnt", rec.mssim31cnt);
		}
		//for(int i = 0; i < ds.curlist.size(); i++) {
		//	MT_PAPINOUT_2209_LCURLISTRecord rec = (MT_PAPINOUT_2209_LCURLISTRecord)ds.curlist.get(i);
		//	int record = rx.add(recordSet, "record", "");
		//	rx.add(record, "cnsm_dt", rec.cnsm_dt);
		//	rx.add(record, "fac_clsf", rec.fac_clsf);
		//	rx.add(record, "pcsim62cnt", rec.pcsim62cnt);
		//	rx.add(record, "mssim62cnt", rec.mssim62cnt);
		//	rx.add(record, "pcsim31cnt", rec.pcsim31cnt);
		//	rx.add(record, "mssim31cnt", rec.mssim31cnt);
		//}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
			<cnsm_dt/>
			<fac_clsf/>
			<pcsim62cnt/>
			<mssim62cnt/>
			<pcsim31cnt/>
			<mssim31cnt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 28 20:23:27 KST 2009 */ %>