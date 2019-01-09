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

<%
	RwXml rx = new RwXml();
	TN_LNK_6010_LDataSet ds = (TN_LNK_6010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData  = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	gridData = rx.add(root, "gridHeader", "");

	try {

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_6010_LCURLISTRecord rec = (TN_LNK_6010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "sdsiidx", rec.sdsiidx);
			rx.add(record, "deptidx", rec.deptidx);
			rx.add(record, "paymethodcode", rec.paymethodcode);
			rx.add(record, "pymtmm", rec.pymtyymm);
			rx.add(record, "pymtdd", rec.pymtdd);
			rx.add(record, "fmsseq_str", rec.fmsseq);			
			rx.add(record, "requestdate", rec.requestdate);
			rx.add(record, "acptdate", rec.acptdate);
			rx.add(record, "paydate", rec.paydate);
			rx.add(record, "requestcount", rec.requestcount);
			rx.add(record, "requestprice", rec.requestprice);
			rx.add(record, "acptcount", rec.acptcount);
			rx.add(record, "acptprice", rec.acptprice);
			rx.add(record, "paycount", rec.paycount);
			rx.add(record, "payprice", rec.payprice);
			rx.add(record, "errorcount", rec.errorcount);
			rx.add(record, "errorpayprice", rec.errorpayprice);
			rx.add(record, "taxfee", rec.taxfee);
			rx.add(record, "fee", rec.fee);
			rx.add(record, "delcount", rec.delcount);
			rx.add(record, "delprice", rec.delprice);
			rx.add(record, "cnclcount", rec.cnclcount);
			rx.add(record, "cnclprice", rec.cnclprice);
			rx.addCData(record, "stat1", rec.status1);
			rx.addCData(record, "stat2", rec.status2);
			rx.addCData(record, "stat3", rec.status3);
			rx.addCData(record, "stat4", rec.status4);
			rx.add(record, "status", rec.status);
			rx.add(record, "fmsseq", rec.fmsseq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());

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
<tn_lnk_6010_l>
	<dataSet>
		<CURLIST>
			<record>
				<sdsiidx/>
				<deptidx/>
				<paymethodcode/>
				<pymtyymm/>
				<pymtdd/>
				<requestdate/>
				<acptdate/>
				<paydate/>
				<requestcount/>
				<requestprice/>
				<acptcount/>
				<acptprice/>
				<paycount/>
				<payprice/>
				<errorcount/>
				<errorpayprice/>
				<taxfee/>
				<fee/>
				<status1/>
				<status2/>
				<status3/>
				<status4/>
				<status/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_6010_l>
*/
%>

<% /* 작성시간 : Tue Sep 20 13:57:20 KST 2016 */ %>