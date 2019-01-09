<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_1603_LDataSet ds = (HD_VACA_1603_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1603_LCURLISTRecord rec = (HD_VACA_1603_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "vaca_clsf", rec.vaca_clsf);
			rx.add(record, "vaca_dtls_clsf", rec.vaca_dtls_clsf);
			rx.add(record, "vaca_frdt", rec.vaca_frdt);
			rx.add(record, "vaca_todt", rec.vaca_todt);
			rx.add(record, "vaca_dds", rec.vaca_dds);
			rx.add(record, "duty_dt", rec.alvc_use_dt);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<emp_no/>
			<occr_dt/>
			<seq/>
			<dept_cd/>
			<vaca_clsf/>
			<vaca_dtls_clsf/>
			<vaca_frdt/>
			<vaca_todt/>
			<vaca_dds/>
			<alvc_use_dt/>
			<remk/>
			<proc_stat/>
			<proc_stat_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Wed Apr 29 18:31:26 KST 2009 */ %>