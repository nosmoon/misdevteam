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
	HD_AFFR_9031_LDataSet ds = (HD_AFFR_9031_LDataSet)request.getAttribute("ds");
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
			HD_AFFR_9031_LCURLISTRecord rec = (HD_AFFR_9031_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "basi_yy", rec.basi_yy);
			rx.add(record, "basi_no", rec.basi_no);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "otn_mgng_cd", rec.otn_mgng_cd);
			rx.add(record, "outside_flnm", rec.outside_flnm);
			rx.add(record, "outside_clsf_cd", rec.outside_clsf_cd);
			rx.add(record, "outside_clsf_nm", rec.outside_clsf_nm);
			rx.add(record, "journal_cd", rec.journal_cd);
			rx.add(record, "journal_nm", rec.journal_nm);
			rx.add(record, "outside_tel_no", rec.outside_tel_no);
			rx.add(record, "zipcode", rec.zipcode);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "prvmm_qty", rec.prvmm_qty);
			rx.add(record, "qty", rec.qty);
			rx.add(record, "icdc_qty", rec.icdc_qty);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "clos_nm", rec.clos_nm);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "basi_yy", StringUtil.replaceToXml(rec.basi_yy));
			//rx.add(record, "basi_no", StringUtil.replaceToXml(rec.basi_no));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "otn_mgng_cd", StringUtil.replaceToXml(rec.otn_mgng_cd));
			//rx.add(record, "outside_flnm", StringUtil.replaceToXml(rec.outside_flnm));
			//rx.add(record, "outside_clsf_cd", StringUtil.replaceToXml(rec.outside_clsf_cd));
			//rx.add(record, "outside_clsf_nm", StringUtil.replaceToXml(rec.outside_clsf_nm));
			//rx.add(record, "journal_cd", StringUtil.replaceToXml(rec.journal_cd));
			//rx.add(record, "journal_nm", StringUtil.replaceToXml(rec.journal_nm));
			//rx.add(record, "outside_tel_no", StringUtil.replaceToXml(rec.outside_tel_no));
			//rx.add(record, "zipcode", StringUtil.replaceToXml(rec.zipcode));
			//rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			//rx.add(record, "prvmm_qty", StringUtil.replaceToXml(rec.prvmm_qty));
			//rx.add(record, "qty", StringUtil.replaceToXml(rec.qty));
			//rx.add(record, "icdc_qty", StringUtil.replaceToXml(rec.icdc_qty));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "clos_yn", StringUtil.replaceToXml(rec.clos_yn));
			//rx.add(record, "clos_nm", StringUtil.replaceToXml(rec.clos_nm));
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
<hd_affr_9031_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<basi_yy/>
				<basi_no/>
				<seq/>
				<otn_mgng_cd/>
				<outside_flnm/>
				<outside_clsf_cd/>
				<outside_clsf_nm/>
				<journal_cd/>
				<journal_nm/>
				<outside_tel_no/>
				<zipcode/>
				<addr/>
				<prvmm_qty/>
				<qty/>
				<icdc_qty/>
				<remk/>
				<clos_yn/>
				<clos_nm/>
				<incmg_pers/>
				<incmg_dt_tm/>
				<chg_pers/>
				<chg_dt_tm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_9031_l>
*/
%>

<% /* 작성시간 : Fri Aug 12 19:02:04 KST 2016 */ %>