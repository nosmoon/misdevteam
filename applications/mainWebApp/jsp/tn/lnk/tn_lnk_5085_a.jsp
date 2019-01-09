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
	TN_LNK_5085_ADataSet ds = (TN_LNK_5085_ADataSet)request.getAttribute("ds");
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
			TN_LNK_5085_ACURLISTRecord rec = (TN_LNK_5085_ACURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridDetail, "record", "");
			rx.add(record, "pymtmm", rec.pymtmm);
			rx.add(record, "pymtdd", rec.pymtdd);
			rx.addCData(record, "support", rec.support);
			rx.add(record, "memb_cd", rec.memb_cd);
			rx.addCData(record, "memb_nm", rec.memb_nm);
			rx.addCData(record, "pymt_cd", rec.pymt_cd);
			rx.addCData(record, "cardowner", rec.cardowner);
			rx.addCData(record, "cardcmpy", rec.cardcmpy);
			rx.add(record, "cardno", rec.cardno);
			rx.add(record, "payprice", rec.reqprice);
			rx.add(record, "result_stat", rec.result_stat);
			rx.add(record, "paymentidx", rec.paymentidx);
			rx.add(record, "isdelete", rec.isdelete);
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "promiseidx", rec.promiseidx);
			rx.add(record, "sdsipaymentidx", rec.sdsipaymentidx);
			rx.add(record, "sdsiidx", rec.sdsiidx);

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
<tn_lnk_5085_a>
	<dataSet>
		<CURLIST>
			<record>
				<seq/>
				<data_clsf/>
				<pymt_cd/>
				<memb_nm/>
				<sdsipaymentidx/>
				<cardcmpy/>
				<cardno/>
				<yyyy/>
				<mm/>
				<cardownerid/>
				<reqprice/>
				<telno/>
				<email/>
				<acptdate/>
				<acptprice/>
				<fees/>
				<acptno/>
				<pymtmm/>
				<cnclokdate/>
				<result/>
				<resultcode/>
				<resultmsg/>
				<sdsiidx/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_5085_a>
*/
%>

<% /* 작성시간 : Tue Dec 20 16:51:12 KST 2016 */ %>