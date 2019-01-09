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
	FC_ACCT_8081_LDataSet ds = (FC_ACCT_8081_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_8081_LCURLISTRecord rec = (FC_ACCT_8081_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sdgb", rec.sdgb);
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.addCData(record, "cucustnm", rec.cucustnm);
			rx.add(record, "dfgubun", rec.dfgubun);
			rx.add(record, "obj_amt", rec.obj_amt);
			rx.add(record, "crdt_amt", rec.crdt_amt);
			rx.add(record, "seyul", rec.seyul);
			rx.add(record, "acntcym", rec.acntcym);
			rx.add(record, "cnt", rec.cnt);
			rx.add(record, "natn_cd", rec.natn_cd);
			rx.addCData(record, "frnc_addr", rec.frnc_addr);
			//rx.add(record, "sdgb", StringUtil.replaceToXml(rec.sdgb));
			//rx.add(record, "dlco_clsf_cd", StringUtil.replaceToXml(rec.dlco_clsf_cd));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
			//rx.add(record, "cucustnm", StringUtil.replaceToXml(rec.cucustnm));
			//rx.add(record, "dfgubun", StringUtil.replaceToXml(rec.dfgubun));
			//rx.add(record, "obj_amt", StringUtil.replaceToXml(rec.obj_amt));
			//rx.add(record, "crdt_amt", StringUtil.replaceToXml(rec.crdt_amt));
			//rx.add(record, "seyul", StringUtil.replaceToXml(rec.seyul));
			//rx.add(record, "acntcym", StringUtil.replaceToXml(rec.acntcym));
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
			//rx.add(record, "natn_cd", StringUtil.replaceToXml(rec.natn_cd));
			//rx.add(record, "frnc_addr", StringUtil.replaceToXml(rec.frnc_addr));
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
<fc_acct_8081_l>
	<dataSet>
		<CURLIST>
			<record>
				<sdgb/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<acct_cd/>
				<cucustnm/>
				<dfgubun/>
				<obj_amt/>
				<crdt_amt/>
				<seyul/>
				<acntcym/>
				<cnt/>
				<natn_cd/>
				<frnc_addr/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_8081_l>
*/
%>

<% /* 작성시간 : Thu Apr 23 17:54:26 KST 2009 */ %>