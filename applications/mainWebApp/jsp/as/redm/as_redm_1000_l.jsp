<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.redm.rec.*
	,	chosun.ciis.as.redm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_REDM_1000_LDataSet ds = (AS_REDM_1000_LDataSet)request.getAttribute("ds");
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
			AS_REDM_1000_LCURLISTRecord rec = (AS_REDM_1000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aset_no", rec.aset_no);
			rx.addCData(record, "aset_nm", rec.aset_nm);
			rx.add(record, "aset_stat", rec.aset_stat);
			rx.addCData(record, "aset_stat_nm", rec.aset_stat_nm);
			rx.add(record, "acqr_dt", rec.acqr_dt);
			rx.add(record, "sale_dt", rec.sale_dt);
			rx.add(record, "redm_mthd_cd", rec.redm_mthd_cd);
			rx.addCData(record, "redm_mthd_nm", rec.redm_mthd_nm);
			rx.add(record, "svc_yys_cnt", rec.svc_yys_cnt);
			rx.add(record, "redm_rate", rec.redm_rate);
			rx.add(record, "cur_acqr_amt", rec.cur_acqr_amt);
			rx.add(record, "pre_redm_agg_amt", rec.pre_redm_agg_amt);
			rx.add(record, "tot_redm_amt", rec.tot_redm_amt);
			rx.add(record, "um_redm_amt", rec.um_redm_amt);
			rx.add(record, "cur_redm_agg_amt", rec.cur_redm_agg_amt);
			rx.add(record, "thmm_redm_amt", rec.thmm_redm_amt);
			rx.add(record, "redm_stat_cd", rec.redm_stat_cd);
			rx.addCData(record, "redm_stat_nm", rec.redm_stat_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "redm_dt", rec.redm_dt);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "redm_yymm", rec.redm_yymm);
			//rx.add(record, "aset_no", StringUtil.replaceToXml(rec.aset_no));
			//rx.add(record, "aset_nm", StringUtil.replaceToXml(rec.aset_nm));
			//rx.add(record, "aset_stat", StringUtil.replaceToXml(rec.aset_stat));
			//rx.add(record, "aset_stat_nm", StringUtil.replaceToXml(rec.aset_stat_nm));
			//rx.add(record, "acqr_dt", StringUtil.replaceToXml(rec.acqr_dt));
			//rx.add(record, "sale_dt", StringUtil.replaceToXml(rec.sale_dt));
			//rx.add(record, "redm_mthd_cd", StringUtil.replaceToXml(rec.redm_mthd_cd));
			//rx.add(record, "redm_mthd_nm", StringUtil.replaceToXml(rec.redm_mthd_nm));
			//rx.add(record, "svc_yys_cnt", StringUtil.replaceToXml(rec.svc_yys_cnt));
			//rx.add(record, "redm_rate", StringUtil.replaceToXml(rec.redm_rate));
			//rx.add(record, "cur_acqr_amt", StringUtil.replaceToXml(rec.cur_acqr_amt));
			//rx.add(record, "pre_redm_agg_amt", StringUtil.replaceToXml(rec.pre_redm_agg_amt));
			//rx.add(record, "tot_redm_amt", StringUtil.replaceToXml(rec.tot_redm_amt));
			//rx.add(record, "um_redm_amt", StringUtil.replaceToXml(rec.um_redm_amt));
			//rx.add(record, "cur_redm_agg_amt", StringUtil.replaceToXml(rec.cur_redm_agg_amt));
			//rx.add(record, "thmm_redm_amt", StringUtil.replaceToXml(rec.thmm_redm_amt));
			//rx.add(record, "redm_stat_cd", StringUtil.replaceToXml(rec.redm_stat_cd));
			//rx.add(record, "redm_stat_nm", StringUtil.replaceToXml(rec.redm_stat_nm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			//rx.add(record, "redm_dt", StringUtil.replaceToXml(rec.redm_dt));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "redm_yymm", StringUtil.replaceToXml(rec.redm_yymm));
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
<as_redm_1000_l>
	<dataSet>
		<CURLIST>
			<record>
				<aset_no/>
				<aset_nm/>
				<aset_stat/>
				<aset_stat_nm/>
				<acqr_dt/>
				<sale_dt/>
				<redm_mthd_cd/>
				<redm_mthd_nm/>
				<svc_yys_cnt/>
				<redm_rate/>
				<cur_acqr_amt/>
				<pre_redm_agg_amt/>
				<tot_redm_amt/>
				<um_redm_amt/>
				<cur_redm_agg_amt/>
				<thmm_redm_amt/>
				<redm_stat_cd/>
				<redm_stat_nm/>
				<dept_cd/>
				<dept_nm/>
				<budg_cd/>
				<budg_nm/>
				<redm_dt/>
				<cmpy_cd/>
				<redm_yymm/>
			</record>
		</CURLIST>
	</dataSet>
</as_redm_1000_l>
*/
%>

<% /* 작성시간 : Fri May 08 16:32:49 KST 2009 */ %>