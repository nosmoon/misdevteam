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
	FC_ACCT_8121_LDataSet ds = (FC_ACCT_8121_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_8121_LCURLIST2Record rec = (FC_ACCT_8121_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "cucustnm", rec.cucustnm);
			rx.add(record, "obj_amt", rec.obj_amt);
			rx.add(record, "crdt_amt", rec.crdt_amt);
			rx.add(record, "sdstotamt", rec.sdstotamt);
			rx.add(record, "jmstotamt", rec.jmstotamt);
			rx.add(record, "cnt", rec.cnt);
			rx.add(record, "inwoncnt", rec.inwoncnt);
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "cucustnm", StringUtil.replaceToXml(rec.cucustnm));
			//rx.add(record, "obj_amt", StringUtil.replaceToXml(rec.obj_amt));
			//rx.add(record, "crdt_amt", StringUtil.replaceToXml(rec.crdt_amt));
			//rx.add(record, "sdstotamt", StringUtil.replaceToXml(rec.sdstotamt));
			//rx.add(record, "jmstotamt", StringUtil.replaceToXml(rec.jmstotamt));
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_8121_LCURLISTRecord rec = (FC_ACCT_8121_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "r_wctotamt", rec.r_wctotamt);
			rx.add(record, "totamt", rec.totamt);
			rx.add(record, "sdstotamt", rec.sdstotamt);
			rx.add(record, "wctotamt", rec.wctotamt);
			rx.add(record, "w_tcnt", rec.w_tcnt);
			rx.add(record, "jmstotamt", rec.jmstotamt);
			rx.add(record, "inwoncnt", rec.inwoncnt);
			//rx.add(record, "r_wctotamt", StringUtil.replaceToXml(rec.r_wctotamt));
			//rx.add(record, "totamt", StringUtil.replaceToXml(rec.totamt));
			//rx.add(record, "sdstotamt", StringUtil.replaceToXml(rec.sdstotamt));
			//rx.add(record, "wctotamt", StringUtil.replaceToXml(rec.wctotamt));
			//rx.add(record, "w_tcnt", StringUtil.replaceToXml(rec.w_tcnt));
			//rx.add(record, "jmstotamt", StringUtil.replaceToXml(rec.jmstotamt));
			//rx.add(record, "inwoncnt", StringUtil.replaceToXml(rec.inwoncnt));
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
<fc_acct_8121_l>
	<dataSet>
		<CURLIST2>
			<record>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<cucustnm/>
				<obj_amt/>
				<crdt_amt/>
				<sdstotamt/>
				<jmstotamt/>
				<cnt/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_8121_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_8121_l>
	<dataSet>
		<CURLIST>
			<record>
				<r_wctotamt/>
				<totamt/>
				<sdstotamt/>
				<wctotamt/>
				<w_tcnt/>
				<jmstotamt/>
				<inwoncnt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_8121_l>
*/
%>

<% /* 작성시간 : Fri Nov 21 10:41:02 KST 2014 */ %>