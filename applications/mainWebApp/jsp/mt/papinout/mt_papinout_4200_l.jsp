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
	MT_PAPINOUT_4200_LDataSet ds = (MT_PAPINOUT_4200_LDataSet)request.getAttribute("ds");
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
			MT_PAPINOUT_4200_LCURLISTRecord rec = (MT_PAPINOUT_4200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "make_un_norm_occr_dt", rec.make_un_norm_occr_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_nm", rec.fac_clsf + " " + rec.fac_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_cd + " " + rec.medi_nm);
			rx.add(record, "now_trad_cd", rec.now_trad_cd);
			rx.add(record, "now_trad_nm", rec.now_trad_cd + " " + rec.now_trad_nm);
			rx.add(record, "pj_rate", rec.pj_rate);
			rx.add(record, "rela_dept", rec.rela_dept);
			rx.add(record, "rela_dept_nm", rec.rela_dept + " " + rec.rela_dept_nm);
			rx.add(record, "caus_prd", rec.caus_prd);
			rx.add(record, "caus_prd_nm", rec.caus_prd + " " + rec.caus_prd_nm);
			rx.add(record, "caus_midl", rec.caus_midl);
			rx.add(record, "caus_midl_nm", rec.caus_midl+ " " + rec.caus_midl_nm);
			rx.add(record, "caus_dtls", rec.caus_dtls);
			rx.add(record, "clos_clsf", rec.clos_clsf);
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
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<make_un_norm_occr_dt/>
			<fac_clsf/>
			<fac_nm/>
			<medi_cd/>
			<medi_nm/>
			<now_trad_cd/>
			<now_trad_nm/>
			<pj_rate/>
			<rela_dept/>
			<rela_dept_nm/>
			<caus_prd/>
			<caus_prd_nm/>
			<caus_midl/>
			<caus_midl_nm/>
			<caus_dtls/>
			<clos_clsf/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 21 11:26:34 KST 2009 */ %>