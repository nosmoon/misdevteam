<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.insr.rec.*
	,	chosun.ciis.hd.insr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INSR_1711_LDataSet ds = (HD_INSR_1711_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
	HD_INSR_1711_LCURLISTRecord rec = (HD_INSR_1711_LCURLISTRecord)ds.curlist.get(i);
	int record = rx.add(recordSet, "record", "");
	rx.add(record, "cmpy_cd", rec.cmpy_cd);
	rx.add(record, "occr_dt", rec.occr_dt);
	rx.add(record, "seq", rec.seq);
	rx.add(record, "rnum", rec.rnum);
	rx.add(record, "tms", rec.tms);
	rx.add(record, "insr_entr_dt", rec.insr_entr_dt);
	rx.add(record, "insr_mtry_dt", rec.insr_mtry_dt);
	rx.add(record, "insr_cmpy", rec.insr_cmpy);
	rx.add(record, "pymt_insr_fee", rec.pymt_insr_fee);
	rx.add(record, "recp_insr_amt", rec.recp_insr_amt);
	rx.add(record, "recp_minus_pymt", rec.recp_minus_pymt);
	rx.add(record, "recp_insr_fee_stot", rec.recp_insr_fee_stot);
	rx.add(record, "entr_nops", rec.entr_nops);
	rx.add(record, "pymt_per_npos", rec.pymt_per_npos);
	//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
	//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
	//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
	//rx.add(record, "rnum", StringUtil.replaceToXml(rec.rnum));
	//rx.add(record, "tms", StringUtil.replaceToXml(rec.tms));
	//rx.add(record, "insr_entr_dt", StringUtil.replaceToXml(rec.insr_entr_dt));
	//rx.add(record, "insr_mtry_dt", StringUtil.replaceToXml(rec.insr_mtry_dt));
	//rx.add(record, "insr_cmpy", StringUtil.replaceToXml(rec.insr_cmpy));
	//rx.add(record, "pymt_insr_fee", StringUtil.replaceToXml(rec.pymt_insr_fee));
	//rx.add(record, "recp_insr_amt", StringUtil.replaceToXml(rec.recp_insr_amt));
	//rx.add(record, "recp_minus_pymt", StringUtil.replaceToXml(rec.recp_minus_pymt));
	//rx.add(record, "recp_insr_fee_stot", StringUtil.replaceToXml(rec.recp_insr_fee_stot));
	//rx.add(record, "entr_nops", StringUtil.replaceToXml(rec.entr_nops));
	//rx.add(record, "pymt_per_npos", StringUtil.replaceToXml(rec.pymt_per_npos));
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
<hd_insr_1700_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<rnum/>
				<tms/>
				<insr_entr_dt/>
				<insr_mtry_dt/>
				<insr_cmpy/>
				<pymt_insr_fee/>
				<recp_insr_amt/>
				<recp_minus_pymt/>
				<recp_insr_fee_stot/>
				<entr_nops/>
				<pymt_per_npos/>
			</record>
		</CURLIST>
	</dataSet>
</hd_insr_1700_l>
*/
%>

<% /* 작성시간 : Mon May 18 16:54:18 KST 2009 */ %>