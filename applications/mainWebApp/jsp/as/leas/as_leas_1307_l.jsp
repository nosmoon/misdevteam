<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.leas.rec.*
	,	chosun.ciis.as.leas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAS_1307_LDataSet ds = (AS_LEAS_1307_LDataSet)request.getAttribute("ds");
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
			AS_LEAS_1307_LCURLISTRecord rec = (AS_LEAS_1307_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "leas_clam_amt", StringUtil.replaceToXml(rec.leas_clam_amt));
			rx.add(record, "mang_clam_amt", StringUtil.replaceToXml(rec.mang_clam_amt));
			rx.add(record, "vat_clam_amt", StringUtil.replaceToXml(rec.vat_clam_amt));
			rx.add(record, "clam_tot_amt", StringUtil.replaceToXml(rec.clam_tot_amt));
			//rx.add(record, "leas_clam_amt", rec.leas_clam_amt);
			//rx.add(record, "mang_clam_amt", rec.mang_clam_amt);
			//rx.add(record, "vat_clam_amt", rec.vat_clam_amt);
			//rx.add(record, "clam_tot_amt", rec.clam_tot_amt);
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
<as_leas_1307_l>
	<dataSet>
		<CURLIST>
			<record>
				<leas_clam_amt/>
				<mang_clam_amt/>
				<vat_clam_amt/>
				<clam_tot_amt/>
			</record>
		</CURLIST>
	</dataSet>
</as_leas_1307_l>
*/
%>

<% /* 작성시간 : Wed Jun 03 17:02:54 KST 2009 */ %>