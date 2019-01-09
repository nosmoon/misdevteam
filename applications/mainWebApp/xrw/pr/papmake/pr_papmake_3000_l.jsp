<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PAPMAKE_3000_LDataSet ds = (PR_PAPMAKE_3000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PAPMAKE_3000_LCURLISTRecord rec = (PR_PAPMAKE_3000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "basi_prt_qty", rec.basi_prt_qty);
			rx.add(record, "base_servcost", rec.base_servcost);
			rx.add(record, "basi_excs_qty", rec.basi_excs_qty);
			rx.add(record, "basi_excs_servcost", rec.basi_excs_servcost);
			rx.add(record, "basi_make_pcnt", rec.basi_make_pcnt);
			rx.add(record, "base_make_servcost", rec.base_make_servcost);
			rx.add(record, "basi_excs_pcnt", rec.basi_excs_pcnt);
			rx.add(record, "basi_excs_make_servcost", rec.basi_excs_make_servcost);
			rx.add(record, "basi_ovt_prt_qty", rec.basi_ovt_prt_qty);
			rx.add(record, "basi_sep_prtn_servcost", rec.basi_sep_prtn_servcost);
			rx.add(record, "crps_cost", rec.crps_cost);
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
			<occr_dt/>
			<cmpy_cd/>
			<seq/>
			<aply_dt/>
			<fac_clsf/>
			<basi_prt_qty/>
			<base_servcost/>
			<basi_excs_qty/>
			<basi_excs_servcost/>
			<basi_make_pcnt/>
			<base_make_servcost/>
			<basi_excs_pcnt/>
			<basi_excs_make_servcost/>
			<basi_ovt_prt_qty/>
			<basi_sep_prtn_servcost/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 14 17:04:43 KST 2009 */ %>