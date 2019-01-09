<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.etcimpt.rec.*
	,	chosun.ciis.mt.etcimpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCIMPT_1230_LDataSet ds = (MT_ETCIMPT_1230_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_ETCIMPT_1230_LCURLISTRecord rec = (MT_ETCIMPT_1230_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "prenum", rec.prenum);
			rx.add(record, "slip_seq", rec.slip_seq);
			rx.add(record, "slip_sub_seq", rec.slip_sub_seq);
			rx.add(record, "slip_arow_no", rec.slip_arow_no);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "dr_amt", rec.dr_amt);
			rx.add(record, "crdt_amt", rec.crdt_amt);
			rx.add(record, "rmks1", rec.rmks1);
			rx.add(record, "rmks2", rec.rmks2);
			rx.add(record, "boks_dlco_nm", rec.boks_dlco_nm);
			rx.add(record, "use_dept_cd", rec.use_dept_cd);
			rx.add(record, "prop_equip_cd", rec.prop_equip_cd);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.add(record, "budg_yymm", rec.budg_yymm);
			rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			rx.add(record, "clam_dept_nm", rec.clam_dept_nm);
			rx.add(record, "chrg_emp_no", rec.chrg_emp_no);
			rx.add(record, "chrg_emp_nm", rec.chrg_emp_nm);
			rx.add(record, "incmg_dt", rec.incmg_dt);
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "fisc_seq", rec.fisc_seq);
            rx.add(record, "vat_amt","");
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
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<prenum/>
			<slip_seq/>
			<slip_sub_seq/>
			<slip_arow_no/>
			<budg_cd/>
			<budg_nm/>
			<dr_amt/>
			<crdt_amt/>
			<rmks1/>
			<rmks2/>
			<boks_dlco_nm/>
			<use_dept_cd/>
			<prop_equip_cd/>
			<medi_cd/>
			<medi_nm/>
			<dtls_medi_cd/>
			<budg_yymm/>
			<clam_dept_cd/>
			<clam_dept_nm/>
			<chrg_emp_no/>
			<chrg_emp_nm/>
			<incmg_dt/>
			<fisc_dt/>
			<fisc_seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 28 10:01:31 KST 2009 */ %>