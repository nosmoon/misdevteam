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
	PR_PRTEXEC_1300_LDataSet ds = (PR_PRTEXEC_1300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_1300_LCURLISTRecord rec = (PR_PRTEXEC_1300_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_cd_nm", rec.medi_cd_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_cd_nm", rec.sect_cd_nm);
			rx.add(record, "ecnt", rec.ecnt);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "off_plat_tm", rec.off_plat_tm);
			rx.add(record, "clr_off_plat_tm", rec.clr_off_plat_tm);
			rx.add(record, "trsm_end_tm", rec.trsm_end_tm);
			rx.add(record, "prt_bgn_tm", rec.prt_bgn_tm);
			rx.add(record, "prt_end_tm", rec.prt_end_tm);
			rx.add(record, "prt_qty", rec.prt_qty);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<occr_dt/>
			<seq/>
			<fac_clsf/>
			<aply_dt/>
			<medi_cd/>
			<medi_cd_nm/>
			<sect_cd/>
			<sect_cd_nm/>
			<ecnt/>
			<issu_pcnt/>
			<clr_pcnt/>
			<off_plat_tm/>
			<clr_off_plat_tm/>
			<trsm_end_tm/>
			<prt_bgn_tm/>
			<prt_end_tm/>
			<prt_qty/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 21 18:42:23 KST 2009 */ %>