<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.co.rec.*
	,	chosun.ciis.fc.co.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_CO_1011_LDataSet ds = (FC_CO_1011_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_CO_1011_LCURLISTRecord rec = (FC_CO_1011_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "deps_isav_clsf_cd", rec.deps_isav_clsf_cd);
			rx.add(record, "deps_isav_no", rec.deps_isav_no);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "tot_pymt_amt", rec.tot_pymt_amt);
			rx.add(record, "deps_isav_clsf_cd1", rec.deps_isav_clsf_cd1);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "deps_isav_clsf_cd", StringUtil.replaceToXml(rec.deps_isav_clsf_cd));
			//rx.add(record, "deps_isav_no", StringUtil.replaceToXml(rec.deps_isav_no));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "tot_pymt_amt", StringUtil.replaceToXml(rec.tot_pymt_amt));
			//rx.add(record, "deps_isav_clsf_cd1", StringUtil.replaceToXml(rec.deps_isav_clsf_cd1));
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
<fc_co_1011_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<deps_isav_clsf_cd/>
				<deps_isav_no/>
				<comp_dt/>
				<mtry_dt/>
				<tot_pymt_amt/>
				<deps_isav_clsf_cd1/>
			</record>
		</CURLIST>
	</dataSet>
</fc_co_1011_l>
*/
%>

<% /* 작성시간 : Sat Apr 11 16:23:16 KST 2009 */ %>