<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.prtexec.rec.*
	,	chosun.ciis.pr.prtexec.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTEXEC_2000_LDataSet ds = (PR_PRTEXEC_2000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "tempData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_2000_LCURLISTRecord rec = (PR_PRTEXEC_2000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
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
			rx.add(record, "d_mon2", rec.d_mon2);
			rx.add(record, "d_mon2_cnt", rec.d_mon2_cnt);
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
			rx.add(record, "select", "");
		}
//		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
	}
	finally {
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
			<cmpy_cd/>
			<occr_yy/>
			<seq/>
			<frdt/>
			<todt/>
			<fix_clsf/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Apr 18 14:23:08 KST 2009 */ %>