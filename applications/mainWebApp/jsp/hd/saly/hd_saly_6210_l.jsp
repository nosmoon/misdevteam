<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_6210_LDataSet ds = (HD_SALY_6210_LDataSet)request.getAttribute("ds");
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
			HD_SALY_6210_LCURLISTRecord rec = (HD_SALY_6210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "cmpy_blng_cd", rec.cmpy_blng_cd);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "fit_yy", rec.fit_yy);
			rx.add(record, "fit_no", rec.fit_no);
			rx.add(record, "fitness_dus", rec.fitness_dus);
			rx.add(record, "locker_yn", rec.locker_yn);
			rx.add(record, "locker_pay", rec.locker_pay);
			rx.add(record, "fitness_sum", rec.fitness_sum);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "magam_yn", rec.magam_yn);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "nm_korn_chk", rec.nm_korn);			
			rx.add(record, "tel_no_chk", rec.tel_no);
			rx.add(record, "cmpy_blng_chk", rec.cmpy_blng_cd);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			//rx.add(record, "cmpy_blng_cd", StringUtil.replaceToXml(rec.cmpy_blng_cd));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "tel_no", StringUtil.replaceToXml(rec.tel_no));
			//rx.add(record, "fit_yy", StringUtil.replaceToXml(rec.fit_yy));
			//rx.add(record, "fit_no", StringUtil.replaceToXml(rec.fit_no));
			//rx.add(record, "fitness_dus", StringUtil.replaceToXml(rec.fitness_dus));
			//rx.add(record, "locker_yn", StringUtil.replaceToXml(rec.locker_yn));
			//rx.add(record, "locker_pay", StringUtil.replaceToXml(rec.locker_pay));
			//rx.add(record, "fitness_sum", StringUtil.replaceToXml(rec.fitness_sum));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "magam_yn", StringUtil.replaceToXml(rec.magam_yn));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
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
<hd_saly_6210_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<mang_no/>
				<cmpy_blng_cd/>
				<nm_korn/>
				<tel_no/>
				<fit_yy/>
				<fit_no/>
				<fitness_dus/>
				<locker_yn/>
				<locker_pay/>
				<fitness_sum/>
				<remk/>
				<magam_yn/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_6210_l>
*/
%>

<% /* 작성시간 : Thu Sep 17 14:12:39 KST 2015 */ %>