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
	FC_ACCT_6151_LDataSet ds = (FC_ACCT_6151_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_6151_LCURLIST1Record rec = (FC_ACCT_6151_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "jpgbcdnm", rec.jpgbcdnm);
			//rx.add(record, "dsacctcd", rec.dsacctcd);
			//rx.add(record, "dsamt", rec.dsamt);
			//rx.add(record, "dbamt", rec.dbamt);
			//rx.add(record, "ggamt", rec.ggamt);
			//rx.add(record, "vat", rec.vat);
			//rx.add(record, "diff_amt", rec.diff_amt);
			//rx.add(record, "dr_amt", rec.dr_amt);
			//rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			//rx.add(record, "acct_cd", rec.acct_cd);
			//rx.add(record, "from_fisc_dt", rec.from_fisc_dt);
			//rx.add(record, "to_fisc_dt", rec.to_fisc_dt);
			rx.add(record, "jpgbcdnm", StringUtil.replaceToXml(rec.jpgbcdnm));
			rx.add(record, "dsacctcd", StringUtil.replaceToXml(rec.dsacctcd));
			rx.add(record, "dsamt", StringUtil.replaceToXml(rec.dsamt));
			rx.add(record, "dbamt", StringUtil.replaceToXml(rec.dbamt));
			rx.add(record, "ggamt", StringUtil.replaceToXml(rec.ggamt));
			rx.add(record, "vat", StringUtil.replaceToXml(rec.vat));
			rx.add(record, "diff_amt", StringUtil.replaceToXml(rec.diff_amt));
			rx.add(record, "dr_amt", StringUtil.replaceToXml(rec.dr_amt));
			rx.add(record, "slip_clsf_cd", StringUtil.replaceToXml(rec.slip_clsf_cd));
			rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
			rx.add(record, "from_fisc_dt", StringUtil.replaceToXml(rec.from_fisc_dt));
			rx.add(record, "to_fisc_dt", StringUtil.replaceToXml(rec.to_fisc_dt));
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
<fc_acct_6151_l>
	<dataSet>
		<CURLIST1>
			<record>
				<jpgbcdnm/>
				<dsacctcd/>
				<dsamt/>
				<dbamt/>
				<ggamt/>
				<vat/>
				<diff_amt/>
				<dr_amt/>
				<slip_clsf_cd/>
				<acct_cd/>
				<from_fisc_dt/>
				<to_fisc_dt/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_6151_l>
*/
%>

<% /* 작성시간 : Tue Sep 15 15:49:28 KST 2009 */ %>