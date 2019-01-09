<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%	System.out.println("jsp go");
	RwXml rx = new RwXml();
	TN_LNK_1210_LDataSet ds = (TN_LNK_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_1210_LCURLISTRecord rec = (TN_LNK_1210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "select", "");
			rx.add(record, "rcpt_rpt_idx", rec.rcpt_rpt_idx);
			rx.add(record, "dep_nm", rec.dep_nm);
			rx.add(record, "create_date", rec.create_date);
			rx.add(record, "cret_stnd", rec.cret_stnd);
			rx.add(record, "cnt", rec.cnt);
			rx.add(record, "payprice", rec.payprice);
			rx.add(record, "rpt_dt", rec.rpt_dt);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_lnk_1210_l>
	<dataSet>
		<CURLIST>
			<record>
				<rcpt_rpt_idx/>
				<dep_nm/>
				<create_date/>
				<cret_stnd/>
				<cnt/>
				<payprice/>
				<rpt_dt/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_1210_l>
*/
%>

<% /* 작성시간 : Mon Jul 04 16:03:34 KST 2016 */ %>