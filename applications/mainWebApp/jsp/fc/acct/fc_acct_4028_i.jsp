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
	FC_ACCT_4028_IDataSet ds = (FC_ACCT_4028_IDataSet)request.getAttribute("ds");
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
			FC_ACCT_4028_ICURLISTRecord rec = (FC_ACCT_4028_ICURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "adjm_slip_occr_dt", rec.adjm_slip_occr_dt);
			rx.add(record, "adjm_slip_clsf_cd", rec.adjm_slip_clsf_cd);
			rx.add(record, "adjm_slip_seq", rec.adjm_slip_seq);
			rx.add(record, "adjm_slip_sub_seq", rec.adjm_slip_sub_seq);
			//rx.add(record, "adjm_slip_occr_dt", StringUtil.replaceToXml(rec.adjm_slip_occr_dt));
			//rx.add(record, "adjm_slip_clsf_cd", StringUtil.replaceToXml(rec.adjm_slip_clsf_cd));
			//rx.add(record, "adjm_slip_seq", StringUtil.replaceToXml(rec.adjm_slip_seq));
			//rx.add(record, "adjm_slip_sub_seq", StringUtil.replaceToXml(rec.adjm_slip_sub_seq));
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
<fc_acct_4028_i>
	<dataSet>
		<CURLIST>
			<record>
				<adjm_slip_occr_dt/>
				<adjm_slip_clsf_cd/>
				<adjm_slip_seq/>
				<adjm_slip_sub_seq/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_4028_i>
*/
%>

<% /* �ۼ��ð� : Wed Jul 01 16:56:08 KST 2009 */ %>