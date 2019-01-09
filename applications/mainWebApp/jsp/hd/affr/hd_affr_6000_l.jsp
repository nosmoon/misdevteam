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
	HD_AFFR_6000_LDataSet ds = (HD_AFFR_6000_LDataSet)request.getAttribute("ds");
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
			HD_AFFR_6000_LCURLISTRecord rec = (HD_AFFR_6000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.addCData(record, "certi_clsf", rec.certi_clsf);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "prn_cnt", rec.prn_cnt);
			rx.addCData(record, "certi_clsf_name", rec.certi_clsf_name);
			rx.addCData(record, "issu_clsf_name", rec.issu_clsf_name);
			rx.add(record, "dty_name", rec.dty_name);
			rx.add(record, "posi_name", rec.posi_name);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "now_dt", rec.now_dt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "aplc_dt", rec.aplc_dt);
			rx.add(record, "aplc_seq", rec.aplc_seq);
			rx.addCData(record, "issu_num_shet", rec.issu_num_shet);
			rx.add(record, "usag", rec.usag);
			rx.addCData(record, "remk", rec.remk);
			rx.addCData(record, "cntc_plac", rec.cntc_plac);
			rx.addCData(record, "email", rec.email);
			rx.addCData(record, "engl_flnm", rec.engl_flnm);
			rx.addCData(record, "issu_clsf", rec.issu_clsf);
			rx.addCData(record, "dirc_incmg_posi", rec.dirc_incmg_posi);
			rx.addCData(record, "chce_posi_clsf", rec.chce_posi_clsf);
			rx.addCData(record, "busi_trip_purp", rec.busi_trip_purp);
			rx.addCData(record, "busi_trip_area", rec.busi_trip_area);
			rx.add(record, "busi_trip_frdt", rec.busi_trip_frdt);
			rx.add(record, "busi_trip_todt", rec.busi_trip_todt);
			rx.add(record, "engl_bidt", rec.engl_bidt);
			rx.addCData(record, "engl_dept_posi", rec.engl_dept_posi);
			rx.addCData(record, "engl_in_cmpy_dt", rec.engl_in_cmpy_dt);
			rx.addCData(record, "engl_now_dt", rec.engl_now_dt);
			rx.addCData(record, "engl_busi_trip_purp", rec.engl_busi_trip_purp);
			rx.addCData(record, "engl_busi_trip_area", rec.engl_busi_trip_area);
			rx.add(record, "engl_busi_trip_frdt", rec.engl_busi_trip_frdt);
			rx.add(record, "engl_busi_trip_todt", rec.engl_busi_trip_todt);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.addCData(record, "issu_no", rec.issu_no);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "certi_clsf", StringUtil.replaceToXml(rec.certi_clsf));
			//rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			//rx.add(record, "prn_cnt", StringUtil.replaceToXml(rec.prn_cnt));
			//rx.add(record, "certi_clsf_name", StringUtil.replaceToXml(rec.certi_clsf_name));
			//rx.add(record, "issu_clsf_name", StringUtil.replaceToXml(rec.issu_clsf_name));
			//rx.add(record, "dty_name", StringUtil.replaceToXml(rec.dty_name));
			//rx.add(record, "posi_name", StringUtil.replaceToXml(rec.posi_name));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "now_dt", StringUtil.replaceToXml(rec.now_dt));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "aplc_dt", StringUtil.replaceToXml(rec.aplc_dt));
			//rx.add(record, "aplc_seq", StringUtil.replaceToXml(rec.aplc_seq));
			//rx.add(record, "issu_num_shet", StringUtil.replaceToXml(rec.issu_num_shet));
			//rx.add(record, "usag", StringUtil.replaceToXml(rec.usag));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "cntc_plac", StringUtil.replaceToXml(rec.cntc_plac));
			//rx.add(record, "email", StringUtil.replaceToXml(rec.email));
			//rx.add(record, "engl_flnm", StringUtil.replaceToXml(rec.engl_flnm));
			//rx.add(record, "issu_clsf", StringUtil.replaceToXml(rec.issu_clsf));
			//rx.add(record, "dirc_incmg_posi", StringUtil.replaceToXml(rec.dirc_incmg_posi));
			//rx.add(record, "chce_posi_clsf", StringUtil.replaceToXml(rec.chce_posi_clsf));
			//rx.add(record, "busi_trip_purp", StringUtil.replaceToXml(rec.busi_trip_purp));
			//rx.add(record, "busi_trip_area", StringUtil.replaceToXml(rec.busi_trip_area));
			//rx.add(record, "busi_trip_frdt", StringUtil.replaceToXml(rec.busi_trip_frdt));
			//rx.add(record, "busi_trip_todt", StringUtil.replaceToXml(rec.busi_trip_todt));
			//rx.add(record, "engl_bidt", StringUtil.replaceToXml(rec.engl_bidt));
			//rx.add(record, "engl_dept_posi", StringUtil.replaceToXml(rec.engl_dept_posi));
			//rx.add(record, "engl_in_cmpy_dt", StringUtil.replaceToXml(rec.engl_in_cmpy_dt));
			//rx.add(record, "engl_now_dt", StringUtil.replaceToXml(rec.engl_now_dt));
			//rx.add(record, "engl_busi_trip_purp", StringUtil.replaceToXml(rec.engl_busi_trip_purp));
			//rx.add(record, "engl_busi_trip_area", StringUtil.replaceToXml(rec.engl_busi_trip_area));
			//rx.add(record, "engl_busi_trip_frdt", StringUtil.replaceToXml(rec.engl_busi_trip_frdt));
			//rx.add(record, "engl_busi_trip_todt", StringUtil.replaceToXml(rec.engl_busi_trip_todt));
			//rx.add(record, "issu_dt", StringUtil.replaceToXml(rec.issu_dt));
			//rx.add(record, "issu_no", StringUtil.replaceToXml(rec.issu_no));
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
<hd_affr_6000_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<nm_korn/>
				<dept_cd/>
				<dept_nm/>
				<certi_clsf/>
				<prn/>
				<prn_cnt/>
				<certi_clsf_name/>
				<issu_clsf_name/>
				<dty_name/>
				<posi_name/>
				<dty_cd/>
				<posi_cd/>
				<in_cmpy_dt/>
				<now_dt/>
				<occr_dt/>
				<seq/>
				<aplc_dt/>
				<aplc_seq/>
				<issu_num_shet/>
				<usag/>
				<remk/>
				<cntc_plac/>
				<email/>
				<engl_flnm/>
				<issu_clsf/>
				<dirc_incmg_posi/>
				<chce_posi_clsf/>
				<busi_trip_purp/>
				<busi_trip_area/>
				<busi_trip_frdt/>
				<busi_trip_todt/>
				<engl_bidt/>
				<engl_dept_posi/>
				<engl_in_cmpy_dt/>
				<engl_now_dt/>
				<engl_busi_trip_purp/>
				<engl_busi_trip_area/>
				<engl_busi_trip_frdt/>
				<engl_busi_trip_todt/>
				<issu_dt/>
				<issu_no/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_6000_l>
*/
%>

<% /* 작성시간 : Mon Dec 07 13:35:28 KST 2009 */ %>