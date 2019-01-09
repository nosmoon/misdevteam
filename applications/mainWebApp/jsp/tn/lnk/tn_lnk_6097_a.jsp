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
	TN_LNK_6097_ADataSet ds = (TN_LNK_6097_ADataSet)request.getAttribute("ds");
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
			TN_LNK_6097_ACURLISTRecord rec = (TN_LNK_6097_ACURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "data_clsf", rec.data_clsf);
			rx.add(record, "pymtmm", rec.pymtmm);
			rx.add(record, "pymtdd", rec.pymtdd);
			rx.add(record, "support", rec.support);
			rx.add(record, "memb_cd", rec.memb_cd);
			rx.add(record, "memb_nm", rec.memb_nm);
			rx.add(record, "pymt_cd", rec.pymt_cd);
			rx.add(record, "mobiaprvname", rec.mobiaprvname);
			rx.add(record, "mobiaprvcmpy", rec.mobiaprvcmpy);
			rx.add(record, "mobiaprvnumber", rec.mobiaprvnumber);
			rx.add(record, "payprice", rec.payprice);
			rx.add(record, "result_stat", rec.result_stat);
			rx.add(record, "paymentidx", rec.paymentidx);
			rx.add(record, "cnclokdate", rec.cnclokdate);
			rx.add(record, "cncldate", rec.cncldate);
			rx.add(record, "cncl_stat", rec.cncl_stat);
			rx.add(record, "acptdate", rec.acptdate);
			rx.add(record, "acptno", rec.acptno);
			rx.add(record, "acptprice", rec.acptprice);
			rx.add(record, "acptlimit", rec.acptlimit);
			rx.add(record, "reqprice", rec.reqprice);
			rx.add(record, "paydate", rec.paydate);
			rx.add(record, "result", rec.result);
			rx.add(record, "resultcode", rec.resultcode);
			rx.add(record, "resultmsg", rec.resultmsg);
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "promiseidx", rec.promiseidx);
			rx.add(record, "sdsipaymentidx", rec.sdsipaymentidx);
			rx.add(record, "sdsiidx", rec.sdsiidx);
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "data_clsf", StringUtil.replaceToXml(rec.data_clsf));
			//rx.add(record, "pymtmm", StringUtil.replaceToXml(rec.pymtmm));
			//rx.add(record, "pymtdd", StringUtil.replaceToXml(rec.pymtdd));
			//rx.add(record, "support", StringUtil.replaceToXml(rec.support));
			//rx.add(record, "memb_cd", StringUtil.replaceToXml(rec.memb_cd));
			//rx.add(record, "memb_nm", StringUtil.replaceToXml(rec.memb_nm));
			//rx.add(record, "pymt_cd", StringUtil.replaceToXml(rec.pymt_cd));
			//rx.add(record, "mobiaprvname", StringUtil.replaceToXml(rec.mobiaprvname));
			//rx.add(record, "mobiaprvcmpy", StringUtil.replaceToXml(rec.mobiaprvcmpy));
			//rx.add(record, "mobiaprvnumber", StringUtil.replaceToXml(rec.mobiaprvnumber));
			//rx.add(record, "payprice", StringUtil.replaceToXml(rec.payprice));
			//rx.add(record, "result_stat", StringUtil.replaceToXml(rec.result_stat));
			//rx.add(record, "paymentidx", StringUtil.replaceToXml(rec.paymentidx));
			//rx.add(record, "cnclokdate", StringUtil.replaceToXml(rec.cnclokdate));
			//rx.add(record, "cncldate", StringUtil.replaceToXml(rec.cncldate));
			//rx.add(record, "cncl_stat", StringUtil.replaceToXml(rec.cncl_stat));
			//rx.add(record, "acptdate", StringUtil.replaceToXml(rec.acptdate));
			//rx.add(record, "acptno", StringUtil.replaceToXml(rec.acptno));
			//rx.add(record, "acptprice", StringUtil.replaceToXml(rec.acptprice));
			//rx.add(record, "acptlimit", StringUtil.replaceToXml(rec.acptlimit));
			//rx.add(record, "reqprice", StringUtil.replaceToXml(rec.reqprice));
			//rx.add(record, "paydate", StringUtil.replaceToXml(rec.paydate));
			//rx.add(record, "result", StringUtil.replaceToXml(rec.result));
			//rx.add(record, "resultcode", StringUtil.replaceToXml(rec.resultcode));
			//rx.add(record, "resultmsg", StringUtil.replaceToXml(rec.resultmsg));
			//rx.add(record, "memberidx", StringUtil.replaceToXml(rec.memberidx));
			//rx.add(record, "promiseidx", StringUtil.replaceToXml(rec.promiseidx));
			//rx.add(record, "sdsipaymentidx", StringUtil.replaceToXml(rec.sdsipaymentidx));
			//rx.add(record, "sdsiidx", StringUtil.replaceToXml(rec.sdsiidx));
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
<tn_lnk_6097_a>
	<dataSet>
		<CURLIST>
			<record>
				<seq/>
				<data_clsf/>
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
				<paymentidx/>
				<cnclokdate/>
				<cncldate/>
				<cncl_stat/>
				<acptdate/>
				<acptno/>
				<acptprice/>
				<acptlimit/>
				<reqprice/>
				<paydate/>
				<result/>
				<resultcode/>
				<resultmsg/>
				<memberidx/>
				<promiseidx/>
				<sdsipaymentidx/>
				<sdsiidx/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_6097_a>
*/
%>

<% /* 작성시간 : Fri Dec 23 10:39:52 KST 2016 */ %>