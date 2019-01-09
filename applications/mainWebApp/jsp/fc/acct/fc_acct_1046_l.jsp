<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_1046_LDataSet ds = (FC_ACCT_1046_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_1046_LCURLISTRecord rec = (FC_ACCT_1046_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "insd_acct_cd", rec.insd_acct_cd);
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.addCData(record, "acct_subj_nm", rec.acct_subj_nm);
			rx.addCData(record, "acct_abrv_nm", rec.acct_abrv_nm);
			rx.add(record, "slip_incmg_exne", rec.slip_incmg_exne);
			rx.add(record, "drcr_occr_clsf", rec.drcr_occr_clsf);
			rx.add(record, "drcr_bal_clsf", rec.drcr_bal_clsf);
			rx.add(record, "tbs_exne", rec.tbs_exne);
			rx.add(record, "balsht_exne", rec.balsht_exne);
			rx.add(record, "pfls_stat_exne", rec.pfls_stat_exne);
			rx.add(record, "setoff_yn", rec.setoff_yn);
			rx.add(record, "supr_acct_cd", rec.supr_acct_cd);
			rx.add(record, "vip_aset_debt_exne", rec.vip_aset_debt_exne);
			rx.add(record, "acct_levl", rec.acct_levl);
			rx.add(record, "use_yn", rec.use_yn);
			rx.add(record, "use_dt", rec.use_dt);
			rx.add(record, "wste_dt", rec.wste_dt);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.addCData(record, "acct_nm_styl", rec.acct_nm_styl);
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
<dataSet>
	<CURLIST>
		<record>
			<insd_acct_cd/>
			<acct_cd/>
			<acct_subj_nm/>
			<acct_abrv_nm/>
			<slip_incmg_exne/>
			<drcr_occr_clsf/>
			<drcr_bal_clsf/>
			<tbs_exne/>
			<balsht_exne/>
			<pfls_stat_exne/>
			<setoff_yn/>
			<supr_acct_cd/>
			<vip_aset_debt_exne/>
			<acct_levl/>
			<use_yn/>
			<use_dt/>
			<wste_dt/>
			<incmg_dt_tm/>
			<incmg_pers/>
			<incmg_pers_ipadd/>
			<acct_nm_styl/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 01 17:37:53 KST 2009 */ %>