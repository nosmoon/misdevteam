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
	PR_PAPMAKE_1005_LDataSet ds = (PR_PAPMAKE_1005_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	recordSet = rx.add(root, "tempData", "");

	try {
		/*
		formData = rx.add(recordSet, "ink", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			PR_PAPMAKE_1005_LCURLIST4Record rec = (PR_PAPMAKE_1005_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "use_qunt_1", "");
			rx.add(record, "use_qunt_2", "");
		}
		*/
		/****** CURLIST4 END */
		/*
		formData = rx.add(recordSet, "paper", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_PAPMAKE_1005_LCURLIST3Record rec = (PR_PAPMAKE_1005_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
		}
		*/
		/****** CURLIST3 END */

		formData = rx.add(recordSet, "prt_clsf", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PAPMAKE_1005_LCURLIST1Record rec = (PR_PAPMAKE_1005_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(formData, "item", "");
			rx.add(record, "value", rec.ecnt);
			rx.add(record, "label", rec.ecnt_nm);
		}
		/****** CURLIST1 END */
		
		formData = rx.add(recordSet, "make_info", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_PAPMAKE_1005_LCURLIST3Record rec = (PR_PAPMAKE_1005_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "ecnt", rec.ecnt);
			rx.add(record, "ledt_cd", rec.ledt_cd);
			rx.add(record, "ledt_nm", rec.ledt_nm);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "last_side", rec.last_side);
			rx.add(record, "rmsg_tm", rec.rmsg_tm);
			rx.add(record, "prt_bgn_tm", rec.prt_bgn_tm);
			rx.add(record, "prt_end_tm", rec.prt_end_tm);
			rx.add(record, "prt_qty", rec.prt_qty);
			rx.add(record, "out_gate", rec.out_gate);
			rx.add(record, "apcut_err", rec.apcut_err);
			rx.add(record, "runcut_err", rec.runcut_err);
			rx.add(record, "remk", rec.remk);
		}
		/****** CURLIST6 END */

		/*
		formData = rx.add(recordSet, "ps_matr", "");
		for(int i = 0; i < ds.curlist7.size(); i++) {
			PR_PAPMAKE_1005_LCURLIST7Record rec = (PR_PAPMAKE_1005_LCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "matr_clsf", rec.matr_clsf);
			rx.add(record, "use_qunt_1", "");
		}
		*/
		/****** CURLIST7 END */


		formData = rx.add(recordSet, "medi_pcnt", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PAPMAKE_1005_LCURLIST2Record rec = (PR_PAPMAKE_1005_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "pcnt", rec.pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "pj_qty", rec.pj_qty);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "seq", rec.seq);
		}
		/****** CURLIST2 END */

		/*
		formData = rx.add(recordSet, "supsu_matr", "");
		for(int i = 0; i < ds.curlist5.size(); i++) {
			PR_PAPMAKE_1005_LCURLIST5Record rec = (PR_PAPMAKE_1005_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "use_qunt_1", "");
			rx.add(record, "use_qunt_2", "");
		}
		*/
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
			<matr_cd/>
			<matr_nm/>
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
			<paper_clsf_cd/>
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
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
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
			<ecnt/>
			<ecnt_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST8>
		<record>
			<issu_dt/>
			<medi_cd/>
			<medi_nm/>
			<ecnt/>
			<ledt_cd/>
			<prt_seq/>
			<fld_no/>
			<sect/>
			<last_edt_page/>
			<off_plat_tm/>
			<off_plat_end_tm/>
			<prt_ex_tm/>
			<prt_end_tm/>
			<prt_qty/>
		</record>
	</CURLIST8>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST7>
		<record>
			<matr_cd/>
			<matr_nm/>
		</record>
	</CURLIST7>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST6>
		<record>
			<matr_cd/>
			<matr_nm/>
		</record>
	</CURLIST6>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST5>
		<record>
			<matr_cd/>
			<matr_nm/>
		</record>
	</CURLIST5>
</dataSet>
*/
%>

<% /* 작성시간 : Sun May 17 15:26:07 KST 2009 */ %>