<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.leas.rec.*
	,	chosun.ciis.as.leas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAS_1902_SDataSet ds = (AS_LEAS_1902_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			AS_LEAS_1902_SCURLIST2Record rec = (AS_LEAS_1902_SCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clam_tot_amt", StringUtil.replaceToXml(rec.clam_tot_amt));
			rx.add(record, "rcpm_tot_amt", StringUtil.replaceToXml(rec.rcpm_tot_amt));
			//rx.add(record, "clam_tot_amt", rec.clam_tot_amt);
			//rx.add(record, "rcpm_tot_amt", rec.rcpm_tot_amt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			AS_LEAS_1902_SCURLIST1Record rec = (AS_LEAS_1902_SCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "leas_tot_amt", StringUtil.replaceToXml(rec.leas_tot_amt));
			rx.add(record, "leas_out_amt", StringUtil.replaceToXml(rec.leas_out_amt));
			rx.add(record, "gurt_tot_amt", StringUtil.replaceToXml(rec.gurt_tot_amt));
			rx.add(record, "gurt_out_amt", StringUtil.replaceToXml(rec.gurt_out_amt));
			rx.add(record, "precpt_tot_amt", StringUtil.replaceToXml(rec.precpt_tot_amt));
			rx.add(record, "precpt_out_amt", StringUtil.replaceToXml(rec.precpt_out_amt));
			rx.add(record, "bldg_cd", StringUtil.replaceToXml(rec.bldg_cd));
			rx.add(record, "cntr_yy", StringUtil.replaceToXml(rec.cntr_yy));
			rx.add(record, "cntr_seq", StringUtil.replaceToXml(rec.cntr_seq));
			//rx.add(record, "leas_tot_amt", rec.leas_tot_amt);
			//rx.add(record, "leas_out_amt", rec.leas_out_amt);
			//rx.add(record, "gurt_tot_amt", rec.gurt_tot_amt);
			//rx.add(record, "gurt_out_amt", rec.gurt_out_amt);
			//rx.add(record, "precpt_tot_amt", rec.precpt_tot_amt);
			//rx.add(record, "precpt_out_amt", rec.precpt_out_amt);
			//rx.add(record, "bldg_cd", rec.bldg_cd);
			//rx.add(record, "cntr_yy", rec.cntr_yy);
			//rx.add(record, "cntr_seq", rec.cntr_seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<as_leas_1902_s>
	<dataSet>
		<CURLIST2>
			<record>
				<clam_tot_amt/>
				<rcpm_tot_amt/>
			</record>
		</CURLIST2>
	</dataSet>
</as_leas_1902_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<as_leas_1902_s>
	<dataSet>
		<CURLIST1>
			<record>
				<leas_tot_amt/>
				<leas_out_amt/>
				<gurt_tot_amt/>
				<gurt_out_amt/>
				<precpt_tot_amt/>
				<precpt_out_amt/>
				<bldg_cd/>
				<cntr_yy/>
				<cntr_seq/>
			</record>
		</CURLIST1>
	</dataSet>
</as_leas_1902_s>
*/
%>

<% /* 작성시간 : Fri May 29 17:05:50 KST 2009 */ %>