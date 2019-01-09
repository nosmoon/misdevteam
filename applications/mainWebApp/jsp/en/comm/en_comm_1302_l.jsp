<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.en.comm.rec.*
	,	chosun.ciis.en.comm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_COMM_1302_LDataSet ds = (EN_COMM_1302_LDataSet)request.getAttribute("ds");
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
			EN_COMM_1302_LCURLISTRecord rec = (EN_COMM_1302_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_slip", StringUtil.replaceToXml(rec.occr_slip));
			rx.add(record, "occr_slip_clsf", StringUtil.replaceToXml(rec.occr_slip_clsf));
			rx.add(record, "occr_amt", StringUtil.replaceToXml(rec.occr_amt));
			rx.add(record, "extnc_amt", StringUtil.replaceToXml(rec.extnc_amt));
			rx.add(record, "amt1", StringUtil.replaceToXml(rec.amt1));
			rx.add(record, "extnc_slip_clsf", StringUtil.replaceToXml(rec.extnc_slip_clsf));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "occr_dlco_nm", StringUtil.replaceToXml(rec.occr_dlco_nm));
			rx.add(record, "proc_clsf", StringUtil.replaceToXml(rec.proc_clsf));
			rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			rx.add(record, "extnc_dlco_nm", StringUtil.replaceToXml(rec.extnc_dlco_nm));
			//rx.add(record, "occr_slip", rec.occr_slip);
			//rx.add(record, "occr_slip_clsf", rec.occr_slip_clsf);
			//rx.add(record, "occr_amt", rec.occr_amt);
			//rx.add(record, "extnc_amt", rec.extnc_amt);
			//rx.add(record, "amt1", rec.amt1);
			//rx.add(record, "extnc_slip_clsf", rec.extnc_slip_clsf);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "occr_dlco_nm", rec.occr_dlco_nm);
			//rx.add(record, "proc_clsf", rec.proc_clsf);
			//rx.add(record, "medi_cd", rec.medi_cd);
			//rx.add(record, "extnc_dlco_nm", rec.extnc_dlco_nm);
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
<en_comm_1302_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_slip/>
				<occr_slip_clsf/>
				<occr_amt/>
				<extnc_amt/>
				<amt1/>
				<extnc_slip_clsf/>
				<budg_cd/>
				<occr_dlco_nm/>
				<proc_clsf/>
				<medi_cd/>
				<extnc_dlco_nm/>
			</record>
		</CURLIST>
	</dataSet>
</en_comm_1302_l>
*/
%>

<% /* 작성시간 : Mon Jun 01 13:36:42 KST 2009 */ %>