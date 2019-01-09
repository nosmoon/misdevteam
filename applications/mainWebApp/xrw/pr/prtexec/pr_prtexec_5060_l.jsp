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
	PR_PRTEXEC_5060_LDataSet ds = (PR_PRTEXEC_5060_LDataSet)request.getAttribute("ds");
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
			PR_PRTEXEC_5060_LCURLISTRecord rec = (PR_PRTEXEC_5060_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "bw_pcnt", rec.bw_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "add_prt_seq", rec.add_prt_seq);
			rx.add(record, "dual_out_clsf", rec.dual_out_clsf);
			rx.add(record, "dual_out_nm", rec.dual_out_nm);
			rx.add(record, "duty_ovt_prt_yn", rec.duty_ovt_prt_yn);
			rx.add(record, "send_clos_point_clsf", rec.send_clos_point_clsf);
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
<dataSet>
	<CURLIST>
		<record>
			<issu_dt/>
			<prt_dt/>
			<fac_clsf/>
			<medi_cd/>
			<sect_cd/>
			<pap_std/>
			<issu_pcnt/>
			<clr_pcnt/>
			<bw_pcnt/>
			<slip_qty/>
			<add_prt_seq/>
			<dual_out_clsf/>
			<duty_ovt_prt_yn/>
			<send_clos_point_clsf/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed May 13 11:45:06 KST 2009 */ %>