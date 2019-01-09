<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2491_LDataSet ds = (FC_ACCT_2491_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2491_LCURLISTRecord rec = (FC_ACCT_2491_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "budg_cd_nm", rec.budg_cd_nm);
			//rx.add(record, "fisc_dt", rec.fisc_dt);
			//rx.add(record, "slip_no", rec.slip_no);
			//rx.add(record, "rmks", rec.rmks);
			//rx.add(record, "dr_amt", rec.dr_amt);
			//rx.add(record, "crdt_amt", rec.crdt_amt);
			//rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd);
			//rx.add(record, "mang_no", rec.mang_no);
			//rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "boks_dlco_nm", rec.boks_dlco_nm);
			//rx.add(record, "medi_cd", rec.medi_cd);
			//rx.add(record, "prop_equip_cd", rec.prop_equip_cd);
			//rx.add(record, "use_dept_cd", rec.use_dept_cd);
			//rx.add(record, "evnt_cd", rec.evnt_cd);
			//rx.add(record, "dlco_clsf_cd_nm", rec.dlco_clsf_cd_nm);
			//rx.add(record, "obj_amt", rec.obj_amt);
			//rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			//rx.add(record, "obj_acct_cd", rec.obj_acct_cd);
			
		    rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
            rx.add(record, "budg_cd_nm", StringUtil.replaceToXml(rec.budg_cd_nm));
            rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
            rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
            rx.add(record, "rmks", StringUtil.replaceToXml(rec.rmks));
            rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
            rx.add(record, "crdt_amt", StringUtil.replaceToXml(rec.crdt_amt));
            rx.add(record, "mang_clsf_cd", StringUtil.replaceToXml(rec.mang_clsf_cd));
            rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
            rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
            rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
            rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
            rx.add(record, "boks_dlco_nm", StringUtil.replaceToXml(rec.boks_dlco_nm));
            rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
            rx.add(record, "dtls_medi_cd", StringUtil.replaceToXml(rec.dtls_medi_cd));
            rx.add(record, "prop_equip_cd", StringUtil.replaceToXml(rec.prop_equip_cd));
            rx.add(record, "use_dept_cd", StringUtil.replaceToXml(rec.use_dept_cd));
            rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
            rx.add(record, "dlco_clsf_cd_nm", StringUtil.replaceToXml(rec.dlco_clsf_cd_nm));
            rx.add(record, "obj_amt", StringUtil.replaceToXml(rec.obj_amt));
            rx.add(record, "clam_dept_cd", StringUtil.replaceToXml(rec.clam_dept_cd));
            rx.add(record, "obj_acct_cd", StringUtil.replaceToXml(rec.obj_acct_cd));		
            rx.addCData(record, "incm_clsf_cd_nm", StringUtil.replaceToXml(rec.incm_clsf_cd_nm));	
			
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
			<budg_cd/>
			<budg_cd_nm/>
			<fisc_dt/>
			<slip_no/>
			<rmks/>
			<dr_amt/>
			<crdt_amt/>
			<mang_clsf_cd/>
			<mang_no/>
			<dlco_clsf_cd/>
			<dlco_cd/>
			<dlco_nm/>
			<boks_dlco_nm/>
			<medi_cd/>
			<prop_equip_cd/>
			<use_dept_cd/>
			<evnt_cd/>
			<dlco_clsf_cd_nm/>
			<obj_amt/>
			<clam_dept_cd/>
			<obj_acct_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Feb 13 14:58:06 KST 2009 */ %>