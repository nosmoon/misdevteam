<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_8034_IDataSet ds = (FC_FUNC_8034_IDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_FUNC_8034_ICURLIST1Record rec = (FC_FUNC_8034_ICURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "flu_altn_slip_occr_dt", rec.flu_altn_slip_occr_dt);
			rx.add(record, "flu_altn_slip_clsf_cd", rec.flu_altn_slip_clsf_cd);
			rx.add(record, "flu_altn_slip_seq", rec.flu_altn_slip_seq);
			//rx.add(record, "flu_altn_slip_occr_dt", StringUtil.replaceToXml(rec.flu_altn_slip_occr_dt));
			//rx.add(record, "flu_altn_slip_clsf_cd", StringUtil.replaceToXml(rec.flu_altn_slip_clsf_cd));
			//rx.add(record, "flu_altn_slip_seq", StringUtil.replaceToXml(rec.flu_altn_slip_seq));
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
TrustForm�� Instance ����ο� �����ؼ� ���
<fc_func_8034_i>
	<dataSet>
		<CURLIST1>
			<record>
				<flu_altn_slip_occr_dt/>
				<flu_altn_slip_clsf_cd/>
				<flu_altn_slip_seq/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_func_8034_i>
*/
%>

<% /* �ۼ��ð� : Thu May 28 15:15:30 KST 2009 */ %>