<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_3530_PDataSet ds = (AD_PUB_3530_PDataSet)request.getAttribute("ds");
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
			AD_PUB_3530_PCURLISTRecord rec = (AD_PUB_3530_PCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "podr_slip_no", rec.podr_slip_no);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "podr_amt", rec.podr_amt);
			rx.add(record, "misu_amt", rec.misu_amt);
			rx.add(record, "mms_misu_mat", rec.mms_misu_mat);
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			rx.add(record, "mchrg_pers", rec.mchrg_pers);
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
<ad_pub_3530_p>
	<dataSet>
		<CURLIST>
			<record>
				<podr_dt/>
				<podr_slip_no/>
				<dlco_no/>
				<podr_amt/>
				<misu_amt/>
				<mms_misu_mat/>
				<slcrg_pers/>
				<mchrg_pers/>
			</record>
		</CURLIST>
	</dataSet>
</ad_pub_3530_p>
*/
%>

<% /* 작성시간 : Fri Nov 18 16:45:03 KST 2016 */ %>