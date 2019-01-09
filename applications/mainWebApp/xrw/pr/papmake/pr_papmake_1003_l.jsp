<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PAPMAKE_1003_LDataSet ds = (PR_PAPMAKE_1003_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PAPMAKE_1003_LCURLISTRecord rec = (PR_PAPMAKE_1003_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "ecnt", rec.ecnt);
			rx.add(record, "ledt_cd", rec.ledt_cd);
			rx.add(record, "prt_seq", rec.prt_seq);
			rx.add(record, "fld_no", rec.fld_no);
			rx.add(record, "sect", rec.sect);
			rx.add(record, "last_edt_page", rec.last_edt_page);
			rx.add(record, "off_plat_tm", rec.off_plat_tm);
			rx.add(record, "off_plat_end_tm", rec.off_plat_end_tm);
			rx.add(record, "prt_ex_tm", rec.prt_ex_tm);
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
			<cmpy_cd/>
			<medi_cd/>
			<medi_nm/>
			<ecnt/>
			<sect/>
			<last_edt_page/>
			<off_plat_tm/>
			<off_plat_end_tm/>
			<prt_ex_tm/>
			<prt_end_tm/>
			<prt_qty/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 15 17:45:32 KST 2009 */ %>