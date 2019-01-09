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
	HD_VACA_2300_LDataSet ds = (HD_VACA_2300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_2300_LCURLISTRecord rec = (HD_VACA_2300_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "checked", rec.checked);
			rx.add(record, "vaca_clsf_nm", rec.vaca_clsf_nm);
			rx.add(record, "vaca_frdt", rec.vaca_frdt);
			rx.add(record, "vaca_todt", rec.vaca_todt);
			rx.add(record, "vaca_dds", rec.vaca_dds);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "vaca_dtls_clsf_nm", rec.vaca_dtls_clsf_nm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "alvc_use_dt", rec.alvc_use_dt);
			rx.add(record, "incmg_nm_korn", rec.incmg_nm_korn);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			//rx.add(record, "checked", StringUtil.replaceToXml(rec.checked));
			//rx.add(record, "vaca_clsf_nm", StringUtil.replaceToXml(rec.vaca_clsf_nm));
			//rx.add(record, "vaca_frdt", StringUtil.replaceToXml(rec.vaca_frdt));
			//rx.add(record, "vaca_todt", StringUtil.replaceToXml(rec.vaca_todt));
			//rx.add(record, "vaca_dds", StringUtil.replaceToXml(rec.vaca_dds));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "vaca_dtls_clsf_nm", StringUtil.replaceToXml(rec.vaca_dtls_clsf_nm));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "alvc_use_dt", StringUtil.replaceToXml(rec.alvc_use_dt));
			//rx.add(record, "incmg_nm_korn", StringUtil.replaceToXml(rec.incmg_nm_korn));
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
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
<hd_vaca_2300_l>
	<dataSet>
		<CURLIST>
			<record>
				<checked/>
				<vaca_clsf_nm/>
				<vaca_frdt/>
				<vaca_todt/>
				<vaca_dds/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<posi_nm/>
				<vaca_dtls_clsf_nm/>
				<remk/>
				<alvc_use_dt/>
				<incmg_nm_korn/>
				<proc_stat_nm/>
				<occr_dt/>
				<seq/>
				<dept_cd/>
				<dty_cd/>
				<posi_cd/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_2300_l>
*/
%>

<% /* 작성시간 : Thu Aug 02 10:55:04 KST 2012 */ %>