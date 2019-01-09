<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.etccar.rec.*
	,	chosun.ciis.mt.etccar.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCCAR_5400_LDataSet ds = (MT_ETCCAR_5400_LDataSet)request.getAttribute("ds");
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
			MT_ETCCAR_5400_LCURLISTRecord rec = (MT_ETCCAR_5400_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "buy_lent_clsf", rec.buy_lent_clsf);
			rx.add(record, "control", rec.control);
			rx.add(record, "car_no", rec.car_no);
			rx.add(record, "car_modl", rec.car_modl);
			rx.add(record, "mnft_cmpy", rec.mnft_cmpy);
			rx.add(record, "engn_dsplt", rec.engn_dsplt);
			rx.add(record, "engnclsf", rec.engnclsf);
			rx.add(record, "gearbx", rec.gearbx);
			rx.add(record, "rid_nops", rec.rid_nops);
			rx.add(record, "oil_kind", rec.oil_kind);
			rx.add(record, "own_clsf", rec.own_clsf);
			rx.add(record, "use_usag", rec.use_usag);
			rx.add(record, "cmpy_mang_nm", rec.cmpy_mang_nm);
			rx.add(record, "use_pers", rec.use_pers);
			rx.add(record, "buy_dt", rec.buy_dt);
			rx.add(record, "buy_amt", rec.buy_amt);
			rx.add(record, "carp_car_clsf", rec.carp_car_clsf);
			rx.add(record, "carp_car_dt", rec.carp_car_dt);
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
			<buy_lent_clsf/>
			<control/>
			<car_no/>
			<car_modl/>
			<mnft_cmpy/>
			<engn_dsplt/>
			<engnclsf/>
			<gearbx/>
			<rid_nops/>
			<oil_kind/>
			<own_clsf/>
			<use_usag/>
			<cmpy_mang_nm/>
			<use_pers/>
			<buy_dt/>
			<buy_amt/>
			<carp_car_clsf/>
			<carp_car_dt/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 24 10:19:13 KST 2009 */ %>