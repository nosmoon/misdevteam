<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.dalon.rec.*
	,	chosun.ciis.hd.dalon.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DALON_1050_LDataSet ds = (HD_DALON_1050_LDataSet)request.getAttribute("ds");
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
			HD_DALON_1050_LCURLISTRecord rec = (HD_DALON_1050_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "prvdd_prsnt_tm_prv", rec.prvdd_prsnt_tm_prv);
			rx.add(record, "finish_dd_clsf", rec.finish_dd_clsf);
			rx.add(record, "prvdd_finish_tm_aft", rec.prvdd_finish_tm_aft);
			rx.add(record, "prvdd_finish_tm_prv", rec.prvdd_finish_tm_prv);
			rx.add(record, "thdd_prsnt_tm_aft", rec.thdd_prsnt_tm_aft);
			rx.add(record, "thdd_prsnt_tm_prv", rec.thdd_prsnt_tm_prv);
			rx.add(record, "pay_amt", rec.pay_amt);
			rx.add(record, "prsnt_hody_clsf", rec.prsnt_hody_clsf);
			rx.add(record, "finish_hody_clsf", rec.finish_hody_clsf);
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "prvdd_prsnt_tm_prv", StringUtil.replaceToXml(rec.prvdd_prsnt_tm_prv));
			//rx.add(record, "finish_dd_clsf", StringUtil.replaceToXml(rec.finish_dd_clsf));
			//rx.add(record, "prvdd_finish_tm_aft", StringUtil.replaceToXml(rec.prvdd_finish_tm_aft));
			//rx.add(record, "prvdd_finish_tm_prv", StringUtil.replaceToXml(rec.prvdd_finish_tm_prv));
			//rx.add(record, "thdd_prsnt_tm_aft", StringUtil.replaceToXml(rec.thdd_prsnt_tm_aft));
			//rx.add(record, "thdd_prsnt_tm_prv", StringUtil.replaceToXml(rec.thdd_prsnt_tm_prv));
			//rx.add(record, "pay_amt", StringUtil.replaceToXml(rec.pay_amt));
			//rx.add(record, "prvdd_hody_clsf", StringUtil.replaceToXml(rec.prvdd_hody_clsf));
			//rx.add(record, "thdd_hody_clsf", StringUtil.replaceToXml(rec.thdd_hody_clsf));
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
<hd_dalon_1050_l>
	<dataSet>
		<CURLIST>
			<record>
				<seq/>
				<prvdd_prsnt_tm_prv/>
				<finish_dd_clsf/>
				<prvdd_finish_tm_aft/>
				<prvdd_finish_tm_prv/>
				<thdd_prsnt_tm_aft/>
				<thdd_prsnt_tm_prv/>
				<pay_amt/>
				<prvdd_hody_clsf/>
				<thdd_hody_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</hd_dalon_1050_l>
*/
%>

<% /* 작성시간 : Tue Dec 11 17:22:53 KST 2018 */ %>