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
	PR_PAPMAKE_1051_LDataSet ds = (PR_PAPMAKE_1051_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	recordSet = rx.add(root, "tempData", "");

	try {
		formData = rx.add(recordSet, "supsu_matr", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_PAPMAKE_1051_LCURLIST3Record rec = (PR_PAPMAKE_1051_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "use_qunt_1", rec.use_qunt_1);
			rx.add(record, "use_qunt_2", rec.use_qunt_2);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
		}
		/****** CURLIST3 END */

		formData = rx.add(recordSet, "ink_matr", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PAPMAKE_1051_LCURLIST2Record rec = (PR_PAPMAKE_1051_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "use_qunt_1", rec.use_qunt_1);
			rx.add(record, "use_qunt_2", rec.use_qunt_2);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
		}
		/****** CURLIST2 END */

		formData = rx.add(recordSet, "paper_matr", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PAPMAKE_1051_LCURLIST1Record rec = (PR_PAPMAKE_1051_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "use_qunt_1", rec.use_qunt_1);
			rx.add(record, "use_qunt_2", rec.use_qunt_2);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
		}
		/****** CURLIST1 END */

		formData = rx.add(recordSet, "ps_matr", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			PR_PAPMAKE_1051_LCURLIST4Record rec = (PR_PAPMAKE_1051_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "use_qunt_1", rec.use_qunt_1);
			rx.add(record, "use_qunt_2", rec.use_qunt_2);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "matr_clsf", rec.matr_clsf);
		}
		/****** CURLIST5 END */

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
	<CURLIST4>
		<record>
			<medi_cd/>
			<medi_nm/>
			<sect_cd/>
			<sect_nm/>
			<pcnt/>
			<clr_pcnt/>
			<pj_qty/>
			<remk/>
		</record>
	</CURLIST4>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST3>
		<record>
			<matr_cd/>
			<matr_nm/>
			<dlco_cd/>
			<dlco_nm/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<matr_cd/>
			<matr_nm/>
			<dlco_cd/>
			<dlco_nm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<matr_cd/>
			<matr_nm/>
			<paper_clsf_cd/>
			<dlco_cd/>
			<dlco_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST5>
		<record>
			<medi_cd/>
			<medi_nm/>
			<sect_cd/>
			<sect_nm/>
			<matr_cd/>
			<matr_nm/>
			<clsf/>
		</record>
	</CURLIST5>
</dataSet>
*/
%>

<% /* 작성시간 : Tue May 19 00:23:45 KST 2009 */ %>