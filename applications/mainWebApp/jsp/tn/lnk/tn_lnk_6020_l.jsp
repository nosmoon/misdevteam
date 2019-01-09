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
	TN_LNK_6020_LDataSet ds = (TN_LNK_6020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	int totData    = rx.add(root, "totData", "");
	rx.add(totData, "requestcount",  ds.requestcount  );
	rx.add(totData, "requestprice",  ds.requestprice  );
	rx.add(totData, "acptcount",     ds.acptcount     );
	rx.add(totData, "acptprice",     ds.acptprice     );
	rx.add(totData, "paycount",      ds.paycount      );
	rx.add(totData, "payprice",      ds.payprice      );
	rx.add(totData, "errorcount",    ds.errorcount    );
	rx.add(totData, "errorpayprice", ds.errorpayprice );
	rx.add(totData, "taxfee",        ds.taxfee        );
	rx.add(totData, "fee",           ds.fee           );
	rx.add(totData, "delcount",      ds.delcount      );
	rx.add(totData, "delprice",      ds.delprice      );
	rx.add(totData, "cnclcount",     ds.cnclcount     );
	rx.add(totData, "cnclprice",     ds.cnclprice	  );

	int gridDetail = rx.add(root, "gridDetail", "");
		
	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_6020_LCURLISTRecord rec = (TN_LNK_6020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridDetail, "record", "");
			rx.add(record, "pymtmm", rec.pymtmm);
			rx.add(record, "pymtdd", rec.pymtdd);
			rx.addCData(record, "support", rec.support);
			rx.add(record, "memb_cd", rec.memb_cd);
			rx.addCData(record, "memb_nm", rec.memb_nm);
			rx.addCData(record, "pymt_cd", rec.pymt_cd);
			rx.addCData(record, "mobiaprvname", rec.mobiaprvname);
			rx.addCData(record, "mobiaprvcmpy", rec.mobiaprvcmpy);
			rx.add(record, "mobiaprvnumber", rec.mobiaprvnumber);
			rx.add(record, "acptdate", rec.acptdate);
			rx.add(record, "acptno", rec.acptno);
			rx.add(record, "reqprice", rec.reqprice);
			rx.add(record, "acptprice", rec.acptprice);
			rx.add(record, "payprice", rec.payprice);
			rx.add(record, "paydate", rec.paydate);
			rx.add(record, "result_stat", rec.result_stat);
			rx.add(record, "paymentidx", rec.paymentidx);
			rx.add(record, "cnclokdate", rec.cnclokdate);
			rx.add(record, "cncldate", rec.cncldate);
			rx.add(record, "cncl_stat", rec.cncl_stat);
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "promiseidx", rec.promiseidx);
			rx.add(record, "sdsipaymentidx", rec.sdsipaymentidx);
			rx.add(record, "sdsiidx", rec.sdsiidx);
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
<tn_lnk_6020_l>
	<dataSet>
		<CURLIST>
			<record>
				<pymtmm/>
				<pymtdd/>
				<support/>
				<memb_cd/>
				<memb_nm/>
				<pymt_cd/>
				<mobiaprvname/>
				<mobiaprvcmpy/>
				<mobiaprvnumber/>
				<payprice/>
				<result_stat/>
				<paymentcode/>
				<isdelete/>
				<memberidx/>
				<promiseidx/>
				<sdsipaymentidx/>
				<sdsiidx/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_6020_l>
*/
%>

<% /* 작성시간 : Tue Sep 20 11:52:59 KST 2016 */ %>