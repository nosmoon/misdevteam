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
	TN_LNK_6096_ADataSet ds  = (TN_LNK_6096_ADataSet)request.getAttribute("ds");
	TN_LNK_6097_ADataSet ds2 = (TN_LNK_6097_ADataSet)request.getAttribute("ds2");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	if(ds2 != null) {
		int totData    = rx.add(root, "totData", "");
		rx.add(totData, "requestcount",  ds2.reqcnt);
		rx.add(totData, "requestprice",  ds2.reqamt);
		rx.add(totData, "acptcount",     ds2.acptcnt);
		rx.add(totData, "acptprice",     ds2.acptamt);
		rx.add(totData, "paycount",      "0");
		rx.add(totData, "payprice",      "0");
		rx.add(totData, "errorcount",    "0");
		rx.add(totData, "errorpayprice", "0");
		rx.add(totData, "taxfee",        "0");
		rx.add(totData, "fee",           "0");
		rx.add(totData, "delcount",      "0");
		rx.add(totData, "delprice",      "0");
		rx.add(totData, "cnclcount",     "0");
		rx.add(totData, "cnclprice",     "0");
	
		int gridDetail = rx.add(root, "gridDetail", "");
	
		try {
			for(int i = 0; i < ds2.curlist.size(); i++) {
				TN_LNK_6097_ACURLISTRecord rec = (TN_LNK_6097_ACURLISTRecord)ds2.curlist.get(i);
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
				rx.add(record, "result_stat", rec.resultmsg);
				rx.add(record, "paymentidx", rec.paymentidx);
				rx.add(record, "cnclokdate", rec.cnclokdate);
				rx.add(record, "cncldate", rec.cncldate);
				rx.add(record, "cncl_stat", rec.cncl_stat);
				rx.add(record, "memberidx", rec.memberidx);
				rx.add(record, "promiseidx", rec.promiseidx);
				rx.add(record, "sdsipaymentidx", rec.sdsipaymentidx);
				rx.add(record, "sdsiidx", rec.sdsiidx);
			}
			rx.add(recordSet, "totalcnt", ds2.curlist.size());
	
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
	} else {
			rx.add(dataSet, "errcode", errcode);
			rx.add(dataSet, "errmsg", errmsg);
			out.println(rx.xmlFlush());
			out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Dec 22 14:11:26 KST 2016 */ %>