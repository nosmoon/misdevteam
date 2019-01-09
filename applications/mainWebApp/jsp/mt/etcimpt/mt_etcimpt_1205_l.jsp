<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.etcimpt.rec.*
	,	chosun.ciis.mt.etcimpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCIMPT_1205_LDataSet ds = (MT_ETCIMPT_1205_LDataSet)request.getAttribute("ds");
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
			MT_ETCIMPT_1205_LCURLISTRecord rec = (MT_ETCIMPT_1205_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			rx.add(record, "leas_clsf_nm", StringUtil.replaceToXml(rec.leas_clsf_nm));
			rx.add(record, "case_nm", StringUtil.replaceToXml(rec.case_nm));
			rx.add(record, "sub_seq", StringUtil.replaceToXml(rec.sub_seq));
			rx.add(record, "cost_case_titl", StringUtil.replaceToXml(rec.cost_case_titl));
			rx.add(record, "real_ship_dt", StringUtil.replaceToXml(rec.real_ship_dt));
			rx.add(record, "ship_port", StringUtil.replaceToXml(rec.ship_port));
			rx.add(record, "ariv_port", StringUtil.replaceToXml(rec.ariv_port));
			rx.add(record, "entr_dt", StringUtil.replaceToXml(rec.entr_dt));
			rx.add(record, "yy", StringUtil.replaceToXml(rec.yy));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "leas_clsf", StringUtil.replaceToXml(rec.leas_clsf));
			//rx.add(record, "mang_no", rec.mang_no);
			//rx.add(record, "leas_clsf_nm", rec.leas_clsf_nm);
			//rx.add(record, "case_nm", rec.case_nm);
			//rx.add(record, "sub_seq", rec.sub_seq);
			//rx.add(record, "cost_case_titl", rec.cost_case_titl);
			//rx.add(record, "real_ship_dt", rec.real_ship_dt);
			//rx.add(record, "ship_port", rec.ship_port);
			//rx.add(record, "ariv_port", rec.ariv_port);
			//rx.add(record, "entr_dt", rec.entr_dt);
			//rx.add(record, "yy", rec.yy);
			//rx.add(record, "seq", rec.seq);
			//rx.add(record, "leas_clsf", rec.leas_clsf);
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
<mt_etcimpt_1205_l>
	<dataSet>
		<CURLIST>
			<record>
				<mang_no/>
				<leas_clsf_nm/>
				<case_nm/>
				<sub_seq/>
				<cost_case_titl/>
				<real_ship_dt/>
				<ship_port/>
				<ariv_port/>
				<entr_dt/>
				<yy/>
				<seq/>
				<leas_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</mt_etcimpt_1205_l>
*/
%>

<% /* 작성시간 : Sat Jul 04 17:35:55 KST 2009 */ %>