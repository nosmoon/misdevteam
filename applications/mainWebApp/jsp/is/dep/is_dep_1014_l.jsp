<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_DEP_1014_LDataSet ds = (IS_DEP_1014_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	try {
		/****** CURLIST BEGIN */
		int tempData = rx.add( root , "tempData" , "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_DEP_1014_LCURLISTRecord rec = (IS_DEP_1014_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(tempData, "record", "");
			
			
			rx.add(record, "swit_dlco_nm", rec.occr_dlco_nm);
			rx.add(record, "amt", StringUtil.toLong(rec.occr_amt)-StringUtil.toLong(rec.extnc_amt));

			/*
			rx.add(record, "occr_dlco_cd", rec.occr_dlco_cd);
			rx.add(record, "extnc_amt", rec.extnc_amt);
			rx.add(record, "occr_slip", rec.occr_slip);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "subseq", rec.subseq);
			*/
		}
		/****** CURLIST END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
