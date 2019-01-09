<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.prtcnsg.rec.*
	,	chosun.ciis.pr.prtcnsg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTCNSG_1501_LDataSet ds = (PR_PRTCNSG_1501_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTCNSG_1501_LCURLISTRecord rec = (PR_PRTCNSG_1501_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "seq_nm", rec.seq_nm);
			rx.add(record, "prt_fee_35", rec.prt_fee_35);
			rx.add(record, "prt_fee_65", rec.prt_fee_65);
			rx.add(record, "prt_fee_70", rec.prt_fee_70);
			rx.add(record, "prt_fee_75", rec.prt_fee_75);
			rx.add(record, "prt_fee_73", rec.prt_fee_73);
			rx.add(record, "prt_fee_76", rec.prt_fee_76);
			rx.add(record, "prt_fee_77", rec.prt_fee_77);
			rx.add(record, "prt_fee_99", rec.prt_fee_99);
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "seq_nm", StringUtil.replaceToXml(rec.seq_nm));
			//rx.add(record, "prt_fee_35", StringUtil.replaceToXml(rec.prt_fee_35));
			//rx.add(record, "prt_fee_65", StringUtil.replaceToXml(rec.prt_fee_65));
			//rx.add(record, "prt_fee_70", StringUtil.replaceToXml(rec.prt_fee_70));
			//rx.add(record, "prt_fee_75", StringUtil.replaceToXml(rec.prt_fee_75));
			//rx.add(record, "prt_fee_73", StringUtil.replaceToXml(rec.prt_fee_73));
			//rx.add(record, "prt_fee_76", StringUtil.replaceToXml(rec.prt_fee_76));
			//rx.add(record, "prt_fee_99", StringUtil.replaceToXml(rec.prt_fee_99));
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
<pr_prtcnsg_1501_l>
	<dataSet>
		<CURLIST>
			<record>
				<seq/>
				<seq_nm/>
				<prt_fee_35/>
				<prt_fee_65/>
				<prt_fee_70/>
				<prt_fee_75/>
				<prt_fee_73/>
				<prt_fee_76/>
				<prt_fee_99/>
			</record>
		</CURLIST>
	</dataSet>
</pr_prtcnsg_1501_l>
*/
%>

<% /* 작성시간 : Tue Apr 01 09:39:53 KST 2014 */ %>