<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_3090_LDataSet ds = (FC_FUNC_3090_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_3090_LCURLISTRecord rec = (FC_FUNC_3090_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "deps_isav_clsf_cd", rec.deps_isav_clsf_cd);
			rx.add(record, "deps_isav_no", rec.deps_isav_no);
			rx.add(record, "deps_isav_nm", rec.deps_isav_nm);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "tot_pymt_amt", rec.tot_pymt_amt);
			rx.add(record, "dlco_cd_nm", rec.dlco_cd_nm);
			rx.add(record, "clsf_nm", rec.clsf_nm);
			rx.add(record, "prd_from", rec.prd_from);
			rx.add(record, "prd_end", rec.prd_end);
			rx.add(record, "int_rate", rec.int_rate);
			rx.add(record, "int_amt", rec.int_amt);
			rx.add(record, "clsf", rec.clsf);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "seq", rec.seq);
			//rx.add(record, "deps_isav_clsf_cd", StringUtil.replaceToXml(rec.deps_isav_clsf_cd));
			//rx.add(record, "deps_isav_no", StringUtil.replaceToXml(rec.deps_isav_no));
			//rx.add(record, "deps_isav_nm", StringUtil.replaceToXml(rec.deps_isav_nm));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "tot_pymt_amt", StringUtil.replaceToXml(rec.tot_pymt_amt));
			//rx.add(record, "dlco_cd_nm", StringUtil.replaceToXml(rec.dlco_cd_nm));
			//rx.add(record, "clsf_nm", StringUtil.replaceToXml(rec.clsf_nm));
			//rx.add(record, "prd_from", StringUtil.replaceToXml(rec.prd_from));
			//rx.add(record, "prd_end", StringUtil.replaceToXml(rec.prd_end));
			//rx.add(record, "int_rate", StringUtil.replaceToXml(rec.int_rate));
			//rx.add(record, "int_amt", StringUtil.replaceToXml(rec.int_amt));
			//rx.add(record, "clsf", StringUtil.replaceToXml(rec.clsf));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
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
<fc_func_3090_l>
	<dataSet>
		<CURLIST>
			<record>
				<deps_isav_clsf_cd/>
				<deps_isav_no/>
				<deps_isav_nm/>
				<comp_dt/>
				<mtry_dt/>
				<tot_pymt_amt/>
				<dlco_cd_nm/>
				<clsf_nm/>
				<prd_from/>
				<prd_end/>
				<int_rate/>
				<int_amt/>
				<clsf/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<yymm/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_3090_l>
*/
%>

<% /* 작성시간 : Tue Jul 14 11:49:43 KST 2009 */ %>