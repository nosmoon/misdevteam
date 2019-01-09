<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.edu.rec.*
	,	chosun.ciis.hd.edu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EDU_1101_LDataSet ds = (HD_EDU_1101_LDataSet)request.getAttribute("ds");
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
			HD_EDU_1101_LCURLISTRecord rec = (HD_EDU_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "chrg_job", rec.chrg_job);
			rx.add(record, "edu_nm", rec.edu_nm);
			rx.add(record, "edu_instt", rec.edu_instt);
			rx.add(record, "edu_frdt", rec.edu_frdt);
			rx.add(record, "edu_todt", rec.edu_todt);
			rx.add(record, "edu_dds", rec.edu_dds);
			rx.add(record, "edu_tm", rec.edu_tm);
			rx.add(record, "edu_cost", rec.edu_cost);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "aprv_yn", rec.aprv_yn);
			rx.add(record, "complt_yn", rec.complt_yn);
			rx.add(record, "misno", rec.misno);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "rfnd_yn", rec.rfnd_yn);
			rx.add(record, "rfnd_cost", rec.rfnd_cost);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "chrg_job", StringUtil.replaceToXml(rec.chrg_job));
			//rx.add(record, "edu_nm", StringUtil.replaceToXml(rec.edu_nm));
			//rx.add(record, "edu_instt", StringUtil.replaceToXml(rec.edu_instt));
			//rx.add(record, "edu_frdt", StringUtil.replaceToXml(rec.edu_frdt));
			//rx.add(record, "edu_todt", StringUtil.replaceToXml(rec.edu_todt));
			//rx.add(record, "edu_dds", StringUtil.replaceToXml(rec.edu_dds));
			//rx.add(record, "edu_tm", StringUtil.replaceToXml(rec.edu_tm));
			//rx.add(record, "edu_cost", StringUtil.replaceToXml(rec.edu_cost));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "aprv_yn", StringUtil.replaceToXml(rec.aprv_yn));
			//rx.add(record, "complt_yn", StringUtil.replaceToXml(rec.complt_yn));
			//rx.add(record, "misno", StringUtil.replaceToXml(rec.misno));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "rfnd_yn", StringUtil.replaceToXml(rec.rfnd_yn));
			//rx.add(record, "rfnd_cost", StringUtil.replaceToXml(rec.rfnd_cost));
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
<hd_edu_1101_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<flnm/>
				<dept_cd/>
				<dept_nm/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<chrg_job/>
				<edu_nm/>
				<edu_instt/>
				<edu_frdt/>
				<edu_todt/>
				<edu_dds/>
				<edu_tm/>
				<edu_cost/>
				<remk/>
				<aprv_yn/>
				<complt_yn/>
				<misno/>
				<occr_dt/>
				<seq/>
				<rfnd_yn/>
				<rfnd_cost/>
			</record>
		</CURLIST>
	</dataSet>
</hd_edu_1101_l>
*/
%>

<% /* 작성시간 : Thu Nov 07 16:34:38 KST 2013 */ %>