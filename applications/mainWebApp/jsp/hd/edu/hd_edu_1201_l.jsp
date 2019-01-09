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
	HD_EDU_1201_LDataSet ds = (HD_EDU_1201_LDataSet)request.getAttribute("ds");
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
			HD_EDU_1201_LCURLISTRecord rec = (HD_EDU_1201_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "report", rec.report);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "stdy_yy", rec.stdy_yy);
			rx.add(record, "ictry_excep_clsf", rec.ictry_excep_clsf);
			rx.add(record, "stdy_clsf", rec.stdy_clsf);
			rx.add(record, "invit_instt", rec.invit_instt);
			rx.add(record, "stdy_frdt", rec.stdy_frdt);
			rx.add(record, "stdy_todt", rec.stdy_todt);
			rx.add(record, "stdy_natn_cd", rec.stdy_natn_cd);
			rx.add(record, "stdy_instt", rec.stdy_instt);
			rx.add(record, "aviat_cost", rec.aviat_cost);
			rx.add(record, "stay_cost", rec.stay_cost);
			rx.add(record, "scl_exps", rec.scl_exps);
			rx.add(record, "etc_cost", rec.etc_cost);
			rx.add(record, "stdy_cost_stot", rec.stdy_cost_stot);
			rx.add(record, "ictry_excep_clsf_nm", rec.ictry_excep_clsf_nm);
			rx.add(record, "stdy_clsf_nm", rec.stdy_clsf_nm);
			rx.add(record, "stdy_natn_cd_nm", rec.stdy_natn_cd_nm);
			rx.add(record, "pk_rep", rec.pk_rep);
			rx.add(record, "rep_cont", StringUtil.replaceToXml(rec.rep_cont));
			//rx.add(record, "report", StringUtil.replaceToXml(rec.report));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "stdy_yy", StringUtil.replaceToXml(rec.stdy_yy));
			//rx.add(record, "ictry_excep_clsf", StringUtil.replaceToXml(rec.ictry_excep_clsf));
			//rx.add(record, "stdy_clsf", StringUtil.replaceToXml(rec.stdy_clsf));
			//rx.add(record, "invit_instt", StringUtil.replaceToXml(rec.invit_instt));
			//rx.add(record, "stdy_frdt", StringUtil.replaceToXml(rec.stdy_frdt));
			//rx.add(record, "stdy_todt", StringUtil.replaceToXml(rec.stdy_todt));
			//rx.add(record, "stdy_natn_cd", StringUtil.replaceToXml(rec.stdy_natn_cd));
			//rx.add(record, "stdy_instt", StringUtil.replaceToXml(rec.stdy_instt));
			//rx.add(record, "aviat_cost", StringUtil.replaceToXml(rec.aviat_cost));
			//rx.add(record, "stay_cost", StringUtil.replaceToXml(rec.stay_cost));
			//rx.add(record, "scl_exps", StringUtil.replaceToXml(rec.scl_exps));
			//rx.add(record, "etc_cost", StringUtil.replaceToXml(rec.etc_cost));
			//rx.add(record, "stdy_cost_stot", StringUtil.replaceToXml(rec.stdy_cost_stot));
			//rx.add(record, "ictry_excep_clsf_nm", StringUtil.replaceToXml(rec.ictry_excep_clsf_nm));
			//rx.add(record, "stdy_clsf_nm", StringUtil.replaceToXml(rec.stdy_clsf_nm));
			//rx.add(record, "stdy_natn_cd_nm", StringUtil.replaceToXml(rec.stdy_natn_cd_nm));
			//rx.add(record, "pk_rep", StringUtil.replaceToXml(rec.pk_rep));
			//rx.add(record, "rep_cont", StringUtil.replaceToXml(rec.rep_cont));
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
<hd_edu_1201_l>
	<dataSet>
		<CURLIST>
			<record>
				<report/>
				<cmpy_cd/>
				<emp_no/>
				<occr_dt/>
				<seq/>
				<flnm/>
				<dept_cd/>
				<dept_nm/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<stdy_yy/>
				<ictry_excep_clsf/>
				<stdy_clsf/>
				<invit_instt/>
				<stdy_frdt/>
				<stdy_todt/>
				<stdy_natn_cd/>
				<stdy_instt/>
				<aviat_cost/>
				<stay_cost/>
				<scl_exps/>
				<etc_cost/>
				<stdy_cost_stot/>
				<ictry_excep_clsf_nm/>
				<stdy_clsf_nm/>
				<stdy_natn_cd_nm/>
				<pk_rep/>
				<rep_cont/>
			</record>
		</CURLIST>
	</dataSet>
</hd_edu_1201_l>
*/
%>

<% /* 작성시간 : Mon Aug 24 18:04:16 KST 2009 */ %>