<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_9501_LDataSet ds = (HD_AFFR_9501_LDataSet)request.getAttribute("ds");
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
			HD_AFFR_9501_LCURLISTRecord rec = (HD_AFFR_9501_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "memb_clsf", rec.memb_clsf);
			rx.add(record, "memb_clsf_nm", rec.memb_clsf_nm);
			rx.add(record, "emp_birthday", rec.emp_birthday);
			rx.add(record, "dth_yn", rec.dth_yn);
			rx.add(record, "spos_name", rec.spos_name);
			rx.add(record, "spos_birthday", rec.spos_birthday);
			rx.add(record, "spos_yn", rec.spos_yn);
			rx.add(record, "zipcode", rec.zipcode);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "phon_no", rec.phon_no);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "deps_per", rec.deps_per);
			rx.add(record, "lvcmpy_dty", rec.lvcmpy_dty);
			rx.add(record, "lvcmpy_dty_nm", rec.lvcmpy_dty_nm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "lve_yn", rec.lve_yn);
			rx.add(record, "lve_yn_nm", rec.lve_yn_nm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "memb_clsf", StringUtil.replaceToXml(rec.memb_clsf));
			//rx.add(record, "memb_clsf_nm", StringUtil.replaceToXml(rec.memb_clsf_nm));
			//rx.add(record, "emp_birthday", StringUtil.replaceToXml(rec.emp_birthday));
			//rx.add(record, "dth_yn", StringUtil.replaceToXml(rec.dth_yn));
			//rx.add(record, "spos_name", StringUtil.replaceToXml(rec.spos_name));
			//rx.add(record, "spos_birthday", StringUtil.replaceToXml(rec.spos_birthday));
			//rx.add(record, "spos_yn", StringUtil.replaceToXml(rec.spos_yn));
			//rx.add(record, "zipcode", StringUtil.replaceToXml(rec.zipcode));
			//rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			//rx.add(record, "phon_no", StringUtil.replaceToXml(rec.phon_no));
			//rx.add(record, "tel_no", StringUtil.replaceToXml(rec.tel_no));
			//rx.add(record, "bank_cd", StringUtil.replaceToXml(rec.bank_cd));
			//rx.add(record, "bank_nm", StringUtil.replaceToXml(rec.bank_nm));
			//rx.add(record, "acct_no", StringUtil.replaceToXml(rec.acct_no));
			//rx.add(record, "deps_per", StringUtil.replaceToXml(rec.deps_per));
			//rx.add(record, "lvcmpy_dty", StringUtil.replaceToXml(rec.lvcmpy_dty));
			//rx.add(record, "lvcmpy_dty_nm", StringUtil.replaceToXml(rec.lvcmpy_dty_nm));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "incmg_pers_ipadd", StringUtil.replaceToXml(rec.incmg_pers_ipadd));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "chg_pers", StringUtil.replaceToXml(rec.chg_pers));
			//rx.add(record, "chg_dt_tm", StringUtil.replaceToXml(rec.chg_dt_tm));
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
<hd_affr_9501_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<mang_no/>
				<emp_no/>
				<flnm/>
				<memb_clsf/>
				<memb_clsf_nm/>
				<emp_birthday/>
				<dth_yn/>
				<spos_name/>
				<spos_birthday/>
				<spos_yn/>
				<zipcode/>
				<addr/>
				<phon_no/>
				<tel_no/>
				<bank_cd/>
				<bank_nm/>
				<acct_no/>
				<deps_per/>
				<lvcmpy_dty/>
				<lvcmpy_dty_nm/>
				<remk/>
				<incmg_pers_ipadd/>
				<incmg_pers/>
				<incmg_dt_tm/>
				<chg_pers/>
				<chg_dt_tm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_9501_l>
*/
%>

<% /* 작성시간 : Fri Sep 01 11:30:46 KST 2017 */ %>