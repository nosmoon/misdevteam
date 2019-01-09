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
	PR_PRTEXEC_2009_LDataSet ds = (PR_PRTEXEC_2009_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	recordSet = rx.add(root, "tempData", "");
	formData = rx.add(recordSet, "gridData", "");
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_2009_LCURLISTRecord rec = (PR_PRTEXEC_2009_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.addCData(record, "sect_nm", rec.sect_nm);
			rx.add(record, "pcnt", rec.pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "std", rec.std);
			rx.add(record, "new_flag", rec.new_flag);
			rx.add(record, "pcnt_2", rec.pcnt_2);
			rx.add(record, "clr_pcnt_2", rec.clr_pcnt_2);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "prt_tm", rec.prt_tm);
			rx.add(record, "add_prt_seq", rec.add_prt_seq);
			rx.add(record, "dual_out_clsf", rec.dual_out_clsf);
			rx.add(record, "tm_in_yn", rec.tm_in_yn);
			rx.add(record, "remk", rec.remk);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
			<medi_cd/>
			<sect_cd/>
			<pcnt/>
			<clr_pcnt/>
			<prt_dt/>
			<prt_tm/>
			<add_prt_seq/>
			<dual_out_clsf/>
			<tm_in_yn/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 20 13:49:40 KST 2009 */ %>