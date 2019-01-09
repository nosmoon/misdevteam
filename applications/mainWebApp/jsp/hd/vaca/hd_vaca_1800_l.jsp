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
	HD_VACA_1800_LDataSet ds = (HD_VACA_1800_LDataSet)request.getAttribute("ds");
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
			HD_VACA_1800_LCURLISTRecord rec = (HD_VACA_1800_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "send", "");
			rx.add(record, "retu", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.addCData(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.addCData(record, "posi_nm", rec.posi_nm);
			rx.add(record, "vaca_clsf", rec.vaca_clsf);
			rx.addCData(record, "vaca_clsf_nm", rec.vaca_clsf_nm);
			rx.add(record, "vaca_dtls_clsf", rec.vaca_dtls_clsf);
			rx.addCData(record, "vaca_dtls_clsf_nm", rec.vaca_dtls_clsf_nm);
			rx.add(record, "vaca_frdt", rec.vaca_frdt);
			rx.add(record, "vaca_todt", rec.vaca_todt);
			rx.add(record, "vaca_dds", rec.vaca_dds);
			rx.addCData(record, "remk", rec.remk);
			rx.add(record, "alvc_use_dt", rec.alvc_use_dt);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "incmg_nm_korn", rec.incmg_nm_korn);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
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
<hd_vaca_1800_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<posi_nm/>
				<vaca_clsf/>
				<vaca_clsf_nm/>
				<vaca_dtls_clsf/>
				<vaca_dtls_clsf_nm/>
				<vaca_frdt/>
				<vaca_todt/>
				<vaca_dds/>
				<remk/>
				<alvc_use_dt/>
				<proc_stat/>
				<proc_stat_nm/>
				<incmg_nm_korn/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_1800_l>
*/
%>

<% /* 작성시간 : Fri Nov 05 10:40:32 KST 2010 */ %>