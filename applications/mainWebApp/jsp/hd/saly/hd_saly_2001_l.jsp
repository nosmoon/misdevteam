<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_2001_LDataSet ds = (HD_SALY_2001_LDataSet)request.getAttribute("ds");
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
			HD_SALY_2001_LCURLISTRecord rec = (HD_SALY_2001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
		
			rx.add(record, "dspch_enpr_main_clsf"   , rec.dspch_enpr_main_clsf);
			rx.add(record, "presi_flnm"               , rec.presi_flnm);
			rx.add(record, "eps_no"                 , rec.eps_no);
			//rx.add(record, "zip"				, rec.zip);
			rx.add(record, "zip_1", rec.zip_1);
			rx.add(record, "zip_2", rec.zip_2);
			rx.add(record, "addr"				, rec.addr);
			rx.add(record, "dtls_addr"			, rec.dtls_addr);
			rx.add(record, "servcost_calc_rate"          , rec.servcost_calc_rate);
			rx.add(record, "mang_liab_pers_flnm"         , rec.mang_liab_pers_flnm);
			rx.add(record, "mang_liab_pers_prn"         , rec.mang_liab_pers_prn);
			rx.add(record, "cmpy_cd"					, rec.cmpy_cd);
			rx.add(record, "aply_basi_dt"          , rec.aply_basi_dt);
			rx.add(record, "seq", rec.seq);

			rx.add(record, "new_apst_dt", "");
			rx.add(record, "connect_ip", "");
			rx.add(record, "connect_userid", "");


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
			<cmpy_cd/>
			<emp_no/>
			<nm_korn/>
			<dept_cd/>
			<dept_nm/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
			<emp_dtls_clsf/>
			<emp_dtls_clsf_nm/>
			<emp_clsf_cd/>
			<emp_clsf_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 23 15:09:51 KST 2009 */ %>