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
	PR_PRTEXEC_4002_LDataSet ds = (PR_PRTEXEC_4002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "main2", "");

	try {
		for(int i = 0; i < ds.curlist_2.size(); i++) {
			PR_PRTEXEC_4002_LCURLIST_2Record rec = (PR_PRTEXEC_4002_LCURLIST_2Record)ds.curlist_2.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "pcnt", rec.pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "std", rec.std);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "prt_tm", rec.prt_tm);
			rx.add(record, "dual_out_nm", rec.dual_out_nm);
			rx.add(record, "tm_in_yn", rec.tm_in_yn);
			rx.add(record, "add_prt_seq", rec.add_prt_seq);
			rx.add(record, "remk", rec.remk);
		}
		/****** CURLIST_2 END */


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
	<CURLIST_2>
		<record>
			<issu_dt/>
			<medi_nm/>
			<sect_nm/>
			<pcnt/>
			<clr_pcnt/>
			<prt_dt/>
			<prt_tm/>
			<dual_out_nm/>
			<tm_in_yn/>
			<remk/>
		</record>
	</CURLIST_2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST_1>
		<record>
			<issu_dt/>
			<add_prt_seq/>
			<pcnt/>
			<clr_pcnt/>
			<prt_dt/>
			<prt_tm/>
			<dual_out_nm/>
			<tm_in_yn/>
			<rdata/>
		</record>
	</CURLIST_1>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 28 23:53:34 KST 2009 */ %>