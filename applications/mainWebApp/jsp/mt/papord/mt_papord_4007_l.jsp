<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_4007_LDataSet ds = (MT_PAPORD_4007_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_4007_LCURLISTRecord rec = (MT_PAPORD_4007_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "d_mon", rec.d_mon);
			rx.add(record, "d_mon_cnt", rec.d_mon_cnt);
			rx.add(record, "d_tue", rec.d_tue);
			rx.add(record, "d_tue_cnt", rec.d_tue_cnt);
			rx.add(record, "d_wed", rec.d_wed);
			rx.add(record, "d_wed_cnt", rec.d_wed_cnt);
			rx.add(record, "d_thr", rec.d_thr);
			rx.add(record, "d_thr_cnt", rec.d_thr_cnt);
			rx.add(record, "d_fri", rec.d_fri);
			rx.add(record, "d_fri_cnt", rec.d_fri_cnt);
			rx.add(record, "d_sat", rec.d_sat);
			rx.add(record, "d_sat_cnt", rec.d_sat_cnt);
			rx.add(record, "d_sun", rec.d_sun);
			rx.add(record, "d_sun_cnt", rec.d_sun_cnt);
//			rx.add(record, "d_mon2", rec.d_mon2);
//			rx.add(record, "d_mon2_cnt", rec.d_mon2_cnt);
			rx.add(record, "issu_dt_fr", rec.issu_dt_fr);
			rx.add(record, "issu_dt_to", rec.issu_dt_to);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_yy", rec.occr_yy);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "frdt", rec.frdt);
			rx.add(record, "todt", rec.todt);
			rx.add(record, "fix_clsf", rec.fix_clsf);
			rx.add(record, "fix_clsf_nm", rec.fix_clsf_nm);
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "chg_tm", rec.chg_tm);
			//rx.add(record, "d_mon", StringUtil.replaceToXml(rec.d_mon));
			//rx.add(record, "d_mon_cnt", StringUtil.replaceToXml(rec.d_mon_cnt));
			//rx.add(record, "d_tue", StringUtil.replaceToXml(rec.d_tue));
			//rx.add(record, "d_tue_cnt", StringUtil.replaceToXml(rec.d_tue_cnt));
			//rx.add(record, "d_wed", StringUtil.replaceToXml(rec.d_wed));
			//rx.add(record, "d_wed_cnt", StringUtil.replaceToXml(rec.d_wed_cnt));
			//rx.add(record, "d_thr", StringUtil.replaceToXml(rec.d_thr));
			//rx.add(record, "d_thr_cnt", StringUtil.replaceToXml(rec.d_thr_cnt));
			//rx.add(record, "d_fri", StringUtil.replaceToXml(rec.d_fri));
			//rx.add(record, "d_fri_cnt", StringUtil.replaceToXml(rec.d_fri_cnt));
			//rx.add(record, "d_sat", StringUtil.replaceToXml(rec.d_sat));
			//rx.add(record, "d_sat_cnt", StringUtil.replaceToXml(rec.d_sat_cnt));
			//rx.add(record, "d_sun", StringUtil.replaceToXml(rec.d_sun));
			//rx.add(record, "d_sun_cnt", StringUtil.replaceToXml(rec.d_sun_cnt));
			//rx.add(record, "d_mon2", StringUtil.replaceToXml(rec.d_mon2));
			//rx.add(record, "d_mon2_cnt", StringUtil.replaceToXml(rec.d_mon2_cnt));
			//rx.add(record, "issu_dt_fr", StringUtil.replaceToXml(rec.issu_dt_fr));
			//rx.add(record, "issu_dt_to", StringUtil.replaceToXml(rec.issu_dt_to));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "occr_yy", StringUtil.replaceToXml(rec.occr_yy));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "frdt", StringUtil.replaceToXml(rec.frdt));
			//rx.add(record, "todt", StringUtil.replaceToXml(rec.todt));
			//rx.add(record, "fix_clsf", StringUtil.replaceToXml(rec.fix_clsf));
			//rx.add(record, "fix_clsf_nm", StringUtil.replaceToXml(rec.fix_clsf_nm));
			//rx.add(record, "chg_dt", StringUtil.replaceToXml(rec.chg_dt));
			//rx.add(record, "chg_tm", StringUtil.replaceToXml(rec.chg_tm));
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
<mt_papord_4007_l>
	<dataSet>
		<CURLIST>
			<record>
				<d_mon/>
				<d_mon_cnt/>
				<d_tue/>
				<d_tue_cnt/>
				<d_wed/>
				<d_wed_cnt/>
				<d_thr/>
				<d_thr_cnt/>
				<d_fri/>
				<d_fri_cnt/>
				<d_sat/>
				<d_sat_cnt/>
				<d_sun/>
				<d_sun_cnt/>
				<d_mon2/>
				<d_mon2_cnt/>
				<issu_dt_fr/>
				<issu_dt_to/>
				<cmpy_cd/>
				<occr_yy/>
				<seq/>
				<frdt/>
				<todt/>
				<fix_clsf/>
				<fix_clsf_nm/>
				<chg_dt/>
				<chg_tm/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papord_4007_l>
*/
%>

<% /* 작성시간 : Wed Jul 01 19:30:56 KST 2009 */ %>