<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2411_LDataSet ds = (FC_ACCT_2411_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	String fisc_dt = "";
	dataSet = rx.add(root, "dataSet", "");
	
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2411_LCURLISTRecord rec = (FC_ACCT_2411_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
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
			//rx.add(record, "evnt_cd", rec.evnt_cd);
			//rx.add(record, "clam_dept_cd", rec.clam_dept_cd);
			//rx.add(record, "insd_acct_cd", rec.insd_acct_cd);
			//rx.add(record, "obj_acct_cd", rec.obj_acct_cd);
			//rx.add(record, "obj_amt", rec.obj_amt);
			if(request.getParameter("dt_clsf").equals("1")) {
				fisc_dt = rec.fisc_dt.substring(0,4) + "-" + rec.fisc_dt.substring(4,6) + "-" + rec.fisc_dt.substring(6,8);
				rx.add(record, "fisc_dt", StringUtil.replaceToXml(fisc_dt) );
			} else {
				rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt) );
			}
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
			rx.add(record, "evnt_cd", StringUtil.replaceToXml(rec.evnt_cd));
			rx.add(record, "clam_dept_cd", StringUtil.replaceToXml(rec.clam_dept_cd));
			rx.add(record, "insd_acct_cd", StringUtil.replaceToXml(rec.insd_acct_cd));
			rx.add(record, "obj_acct_cd", StringUtil.replaceToXml(rec.obj_acct_cd));
			rx.add(record, "obj_amt", StringUtil.replaceToXml(rec.obj_amt));
			rx.add(record, "chnl_clsf_cd", StringUtil.replaceToXml(rec.chnl_clsf_cd));			
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

		/****** CURAMT BEGIN */
		recordSet = rx.add(dataSet, "CURAMT", "");

		for(int i = 0; i < ds.curamt.size(); i++) {
			FC_ACCT_2411_LCURAMTRecord rec = (FC_ACCT_2411_LCURAMTRecord)ds.curamt.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "fajcbamt", rec.fajcbamt);
			//rx.add(record, "fajdbamt", rec.fajdbamt);
			//rx.add(record, "fdajcbamt", rec.fdajcbamt);
			//rx.add(record, "fdajdbamt", rec.fdajdbamt);
			//rx.add(record, "fcbjan", rec.fcbjan);
			//rx.add(record, "fdbjan", rec.fdbjan);
			//rx.add(record, "bal_clsf", rec.bal_clsf);
			rx.add(record, "fajcbamt", StringUtil.replaceToXml(rec.fajcbamt));
			rx.add(record, "fajdbamt", StringUtil.replaceToXml(rec.fajdbamt));
			rx.add(record, "fdajcbamt", StringUtil.replaceToXml(rec.fdajcbamt));
			rx.add(record, "fdajdbamt", StringUtil.replaceToXml(rec.fdajdbamt));
			rx.add(record, "fcbjan", StringUtil.replaceToXml(rec.fcbjan));
			rx.add(record, "fdbjan", StringUtil.replaceToXml(rec.fdbjan));
			rx.add(record, "bal_clsf", StringUtil.replaceToXml(rec.bal_clsf));
		}
		rx.add(recordSet, "totalcnt", ds.curamt.size());
		/****** CURAMT END */

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
<fc_acct_2411_l>
	<dataSet>
		<CURLIST>
			<record>
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
				<evnt_cd/>
				<clam_dept_cd/>
				<insd_acct_cd/>
				<obj_acct_cd/>
				<obj_amt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2411_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2411_l>
	<dataSet>
		<CURAMT>
			<record>
				<fajcbamt/>
				<fajdbamt/>
				<fdajcbamt/>
				<fdajdbamt/>
				<fcbjan/>
				<fdbjan/>
				<bal_clsf/>
			</record>
		</CURAMT>
	</dataSet>
</fc_acct_2411_l>
*/
%>

<% /* 작성시간 : Fri Apr 10 12:09:07 KST 2009 */ %>