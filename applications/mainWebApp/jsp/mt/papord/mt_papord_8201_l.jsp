<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_8201_LDataSet ds = (MT_PAPORD_8201_LDataSet)request.getAttribute("ds");
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
			MT_PAPORD_8201_LCURLISTRecord rec = (MT_PAPORD_8201_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "jejisa", rec.jejisa);
			rx.add(record, "paper_cmpy", rec.paper_cmpy);
			rx.add(record, "wgt", rec.wgt);
			rx.add(record, "ewh_wgt", rec.ewh_wgt);
			rx.add(record, "wgt_tot", rec.wgt_tot);
			rx.add(record, "rate", rec.rate);
			rx.add(record, "std_rate", rec.std_rate);
			rx.add(record, "diff_rate", rec.diff_rate);
			rx.add(record, "ad_wgt", rec.ad_wgt);
			//rx.add(record, "jejisa", StringUtil.replaceToXml(rec.jejisa));
			//rx.add(record, "paper_cmpy", StringUtil.replaceToXml(rec.paper_cmpy));
			//rx.add(record, "wgt", StringUtil.replaceToXml(rec.wgt));
			//rx.add(record, "ewh_wgt", StringUtil.replaceToXml(rec.ewh_wgt));
			//rx.add(record, "wgt_tot", StringUtil.replaceToXml(rec.wgt_tot));
			//rx.add(record, "rate", StringUtil.replaceToXml(rec.rate));
			//rx.add(record, "std_rate", StringUtil.replaceToXml(rec.std_rate));
			//rx.add(record, "diff_rate", StringUtil.replaceToXml(rec.diff_rate));
			//rx.add(record, "ad_wgt", StringUtil.replaceToXml(rec.ad_wgt));
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
<mt_papord_8201_l>
	<dataSet>
		<CURLIST>
			<record>
				<jejisa/>
				<paper_cmpy/>
				<wgt/>
				<ewh_wgt/>
				<wgt_tot/>
				<rate/>
				<std_rate/>
				<diff_rate/>
				<ad_wgt/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papord_8201_l>
*/
%>

<% /* 작성시간 : Tue Nov 01 17:21:52 KST 2016 */ %>