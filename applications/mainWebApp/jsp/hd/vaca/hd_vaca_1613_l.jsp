<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_1613_LDataSet ds = (HD_VACA_1613_LDataSet)request.getAttribute("ds");
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
			HD_VACA_1613_LCURLISTRecord rec = (HD_VACA_1613_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "delchk", rec.delchk);
			rx.add(record, "vaca_clsf", rec.vaca_clsf);
			rx.add(record, "vaca_clsf_nm", rec.vaca_clsf_nm);
			rx.add(record, "vaca_dtls_clsf", rec.vaca_dtls_clsf);
			rx.add(record, "vaca_dtls_clsf_nm", rec.vaca_dtls_clsf_nm);
			rx.add(record, "alvc_use_dt", rec.alvc_use_dt);
			rx.add(record, "vaca_frdt", rec.vaca_frdt);
			rx.add(record, "vaca_todt", rec.vaca_todt);
			rx.add(record, "vaca_dds", rec.vaca_dds);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "proc_stat", StringUtil.replaceToXml(rec.proc_stat));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			//rx.add(record, "delchk", StringUtil.replaceToXml(rec.delchk));
			//rx.add(record, "vaca_clsf", StringUtil.replaceToXml(rec.vaca_clsf));
			//rx.add(record, "vaca_clsf_nm", StringUtil.replaceToXml(rec.vaca_clsf_nm));
			//rx.add(record, "vaca_dtls_clsf", StringUtil.replaceToXml(rec.vaca_dtls_clsf));
			//rx.add(record, "vaca_dtls_clsf_nm", StringUtil.replaceToXml(rec.vaca_dtls_clsf_nm));
			//rx.add(record, "alvc_use_dt", StringUtil.replaceToXml(rec.alvc_use_dt));
			//rx.add(record, "vaca_frdt", StringUtil.replaceToXml(rec.vaca_frdt));
			//rx.add(record, "vaca_todt", StringUtil.replaceToXml(rec.vaca_todt));
			//rx.add(record, "vaca_dds", StringUtil.replaceToXml(rec.vaca_dds));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
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
<hd_vaca_1613_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<proc_stat/>
				<proc_stat_nm/>
				<delchk/>
				<vaca_clsf/>
				<vaca_clsf_nm/>
				<vaca_dtls_clsf/>
				<vaca_dtls_clsf_nm/>
				<alvc_use_dt/>
				<vaca_frdt/>
				<vaca_todt/>
				<vaca_dds/>
				<remk/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_1613_l>
*/
%>

<% /* 작성시간 : Mon Nov 01 16:51:38 KST 2010 */ %>