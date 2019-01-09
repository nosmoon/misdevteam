<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_5212_LDataSet ds = (HD_INFO_5212_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "Famlchg", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5212_LCURLISTRecord rec = (HD_INFO_5212_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "faml_seq", rec.faml_seq);
			rx.add(record, "faml_rshp_cd", rec.faml_rshp_cd);
			rx.add(record, "faml_rshp_nm", rec.faml_rshp_nm);
			rx.add(record, "faml_flnm", rec.faml_flnm);
			rx.add(record, "faml_prn", rec.faml_prn);
			rx.add(record, "ocpn_cd", rec.ocpn_cd);
			rx.add(record, "ocpn_nm", rec.ocpn_nm);
			rx.add(record, "offi_nm", rec.offi_nm);
			rx.add(record, "posi", rec.posi);
			rx.add(record, "schir_cd", rec.schir_cd);
			rx.add(record, "schir_nm", rec.schir_nm);
			rx.add(record, "nmat_yn", rec.nmat_yn);
			rx.add(record, "nmat_yn_nm", rec.nmat_yn_nm);
			rx.add(record, "dth_dt", rec.dth_dt);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_req", "");
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);

			
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
			<faml_seq/>
			<faml_rshp_cd/>
			<faml_rshp_nm/>
			<faml_flnm/>
			<faml_prn/>
			<ocpn_cd/>
			<ocpn_nm/>
			<offi_nm/>
			<posi/>
			<schir_cd/>
			<schir_nm/>
			<nmat_yn/>
			<dth_dt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 09 11:29:42 KST 2009 */ %>