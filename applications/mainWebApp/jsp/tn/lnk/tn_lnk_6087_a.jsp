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
	TN_LNK_6087_ADataSet ds = (TN_LNK_6087_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	int totData    = rx.add(root, "totData", "");
	rx.add(totData, "totcnt",  ds.totcnt);
	rx.add(totData, "totamt",  ds.totamt);
	rx.add(totData, "totfee",  ds.totfee);
	
	int gridDetail = rx.add(root, "gridDetail", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_6087_ACURLISTRecord rec = (TN_LNK_6087_ACURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridDetail, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "data_clsf", rec.data_clsf);
			rx.add(record, "pymt_cd", rec.pymt_cd);
			rx.add(record, "promisecode", rec.promisecode);
			rx.add(record, "memb_cd", rec.memb_cd);
			rx.add(record, "memb_nm", rec.memb_nm);
			rx.add(record, "acptno", rec.acptno);
			rx.add(record, "reqprice", rec.reqprice);
			rx.add(record, "paydate", rec.paydate);
			rx.add(record, "payprice", rec.payprice);
			rx.add(record, "paytype", rec.paytype);
			rx.add(record, "fmsseq", rec.fmsseq);
			rx.add(record, "result", rec.result);
			rx.add(record, "resultcode", rec.resultcode);
			rx.add(record, "resultmsg", rec.resultmsg);
			rx.add(record, "file_data", rec.file_data);
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "promiseidx", rec.promiseidx);
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
<tn_lnk_6087_a>
	<dataSet>
		<CURLIST>
			<record>
				<seq/>
				<data_clsf/>
				<pymt_cd/>
				<promisecode/>
				<memb_cd/>
				<memb_nm/>
				<acptno/>
				<reqprice/>
				<paydate/>
				<payprice/>
				<paytype/>
				<fmsseq/>
				<result/>
				<resultcode/>
				<resultmsg/>
				<file_data/>
				<memberidx/>
				<promiseidx/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_6087_a>
*/
%>

<% /* 작성시간 : Fri Jun 16 11:44:32 KST 2017 */ %>