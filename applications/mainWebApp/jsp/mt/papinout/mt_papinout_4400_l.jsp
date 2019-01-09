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
	MT_PAPINOUT_4400_LDataSet ds = (MT_PAPINOUT_4400_LDataSet)request.getAttribute("ds");
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
			MT_PAPINOUT_4400_LCURLISTRecord rec = (MT_PAPINOUT_4400_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "cut_err_occr_dt", rec.cut_err_occr_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf + " " + rec.fac_nm);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd + " " + rec.papcmpy_nm);
			rx.add(record, "cut_err_tms", rec.cut_err_tms);
			rx.add(record, "cut_err_point", rec.cut_err_point + " " + rec.cut_err_point_nm);
			rx.add(record, "cut_err_caus_prd", rec.cut_err_caus_prd + " " + rec.cut_err_caus_prd_nm);
			rx.add(record, "cut_err_caus_midl", rec.cut_err_caus_midl + " " + rec.cut_err_caus_midl_nm);
			rx.add(record, "cut_err_caus_plac", rec.cut_err_caus_plac);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "total", "A");
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
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<cut_err_occr_dt/>
			<fac_clsf/>
			<fac_nm/>
			<papcmpy_cd/>
			<papcmpy_nm/>
			<cut_err_tms/>
			<cut_err_point/>
			<cut_err_point_nm/>
			<cut_err_caus_prd/>
			<cut_err_caus_prd_nm/>
			<cut_err_caus_midl/>
			<cut_err_caus_midl_nm/>
			<cut_err_caus_plac/>
			<clos_clsf/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 27 17:55:30 KST 2009 */ %>