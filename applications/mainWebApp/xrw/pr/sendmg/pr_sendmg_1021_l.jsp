<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.sendmg.rec.*
	,	chosun.ciis.pr.sendmg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_SENDMG_1021_LDataSet ds = (PR_SENDMG_1021_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	int rowCount = 0;
	int colCount = 0;

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(root, "gridData3", "");

		formData = rx.add(recordSet, "a_list", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_SENDMG_1021_LCURLIST1Record rec = (PR_SENDMG_1021_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "prt_plac_clsf", rec.prt_plac_clsf);
			rx.add(record, "ecnt", rec.ecnt);
			rx.add(record, "prt_bgn_tm", rec.prt_bgn_tm);
			rx.add(record, "prt_end_tm", rec.prt_end_tm);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "real_prt_qty", rec.real_prt_qty);
			rx.add(record, "card_qty", rec.card_qty);
			rx.add(record, "dqty", rec.dqty);
			rx.add(record, "off_plat_tm", rec.off_plat_tm);
		}
		/****** CURLIST2 END */
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
			<medi_nm/>
			<prt_plac_clsf/>
			<ecnt/>
			<off_plat_tm/>
			<prt_ex_tm/>
			<prt_end_tm/>
			<card_qty/>
			<dqty/>
			<cmpy_cd/>
			<medi_cd/>
			<issu_dt/>
			<excp_qty/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 29 16:42:00 KST 2009 */ %>