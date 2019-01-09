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
	HD_EDU_1010_LDataSet ds = (HD_EDU_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	System.out.println("232323232323");
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			System.out.println("1313313131313131");
			HD_EDU_1010_LCURLISTRecord rec = (HD_EDU_1010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "chrg_job", rec.chrg_job);
			rx.add(record, "edu_frdt", rec.edu_frdt);
			rx.add(record, "edu_todt", rec.edu_todt);
			rx.addCData(record, "edu_nm", rec.edu_nm);
			rx.addCData(record, "edu_instt", rec.edu_instt);
			rx.add(record, "edu_dds", rec.edu_dds);
			rx.add(record, "edu_tm", rec.edu_tm);
			rx.add(record, "edu_cost", rec.edu_cost);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "emp_no", rec.emp_no);
			System.out.println("1313313131313131");
			//rx.add(record, "proc_stat_nm", StringUtil.replaceToXml(rec.proc_stat_nm));
			//rx.add(record, "busi_trip_frdt", StringUtil.replaceToXml(rec.busi_trip_frdt));
			//rx.add(record, "busi_trip_todt", StringUtil.replaceToXml(rec.busi_trip_todt));
			//rx.add(record, "busi_trip_clsf_nm", StringUtil.replaceToXml(rec.busi_trip_clsf_nm));
			//rx.add(record, "busi_trip_purp", StringUtil.replaceToXml(rec.busi_trip_purp));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "dtls_medi_cd", StringUtil.replaceToXml(rec.dtls_medi_cd));
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
<hd_trip_1010_l>
	<dataSet>
		<CURLIST>
			<record>
				<proc_stat_nm/>
				<busi_trip_frdt/>
				<busi_trip_todt/>
				<busi_trip_clsf_nm/>
				<busi_trip_purp/>
				<medi_cd/>
				<dtls_medi_cd/>
				<occr_dt/>
				<seq/>
			</record>
		</CURLIST>
	</dataSet>
</hd_trip_1010_l>
*/
%>

<% /* 작성시간 : Thu Sep 03 10:49:31 KST 2015 */ %>