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
	FC_ACCT_6152_LDataSet ds = (FC_ACCT_6152_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_6152_LCURLIST2Record rec = (FC_ACCT_6152_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "dlco_cd", rec.dlco_cd);
			//rx.add(record, "suply_amt", rec.suply_amt);
			//rx.add(record, "vat_amt", rec.vat_amt);
			//rx.add(record, "prof_type_cd", rec.prof_type_cd);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "acct_cd", rec.acct_cd);
			//rx.add(record, "from_fisc_dt", rec.from_fisc_dt);
			//rx.add(record, "to_fisc_dt", rec.to_fisc_dt);
			rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			rx.add(record, "suply_amt", StringUtil.replaceToXml(rec.suply_amt));
			rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			rx.add(record, "prof_type_cd", StringUtil.replaceToXml(rec.prof_type_cd));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
			rx.add(record, "from_fisc_dt", StringUtil.replaceToXml(rec.from_fisc_dt));
			rx.add(record, "to_fisc_dt", StringUtil.replaceToXml(rec.to_fisc_dt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_6152_LCURLIST1Record rec = (FC_ACCT_6152_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "crdt_amt", rec.crdt_amt);
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "obj_acct_cd", rec.obj_acct_cd);
			rx.add(record, "from_fisc_dt", rec.from_fisc_dt);
			rx.add(record, "to_fisc_dt", rec.to_fisc_dt);
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "crdt_amt", StringUtil.replaceToXml(rec.crdt_amt));
			//rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			//rx.add(record, "obj_acct_cd", StringUtil.replaceToXml(rec.obj_acct_cd));
			//rx.add(record, "from_fisc_dt", StringUtil.replaceToXml(rec.from_fisc_dt));
			//rx.add(record, "to_fisc_dt", StringUtil.replaceToXml(rec.to_fisc_dt));
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
<fc_acct_6152_l>
	<dataSet>
		<CURLIST2>
			<record>
				<dlco_cd/>
				<suply_amt/>
				<vat_amt/>
				<prof_type_cd/>
				<slip_clsf_cd/>
				<acct_cd/>
				<from_fisc_dt/>
				<to_fisc_dt/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_6152_l>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<fc_acct_6152_l>
	<dataSet>
		<CURLIST1>
			<record>
				<dlco_cd/>
				<crdt_amt/>
				<slip_clsf_cd/>
				<obj_acct_cd/>
				<from_fisc_dt/>
				<to_fisc_dt/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_6152_l>
*/
%>

<% /* �ۼ��ð� : Tue Sep 15 15:49:28 KST 2009 */ %>