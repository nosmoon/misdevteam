<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.dalon.rec.*
	,	chosun.ciis.hd.dalon.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DALON_1201_LDataSet ds = (HD_DALON_1201_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DALON_1201_LCURLISTRecord rec = (HD_DALON_1201_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "aply_basi_dt", rec.aply_basi_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dd_subj_sel_fee_clsf", rec.dd_subj_sel_fee_clsf);
			rx.add(record, "dd_subj_sel_fee_clsf_nm", rec.dd_subj_sel_fee_clsf_nm);
			rx.add(record, "pay_amt", rec.pay_amt);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "new_apst_dt", "");

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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<apst_dt/>
			<seq/>
			<dtamt_cd/>
			<dtamt_cd_nm/>
			<prov_cost/>
			<etc/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Thu Apr 09 15:05:17 KST 2009 */ %>