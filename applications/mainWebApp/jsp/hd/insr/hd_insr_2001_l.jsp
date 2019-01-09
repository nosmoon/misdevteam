<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.insr.rec.*
	,	chosun.ciis.hd.insr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INSR_2001_LDataSet ds = (HD_INSR_2001_LDataSet)request.getAttribute("ds");
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
			HD_INSR_2001_LCURLISTRecord rec = (HD_INSR_2001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aply_basi_dt", rec.aply_basi_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "insr_clsf", rec.insr_clsf);
			rx.add(record, "insr_rate", rec.insr_rate);
			rx.add(record, "remk", rec.remk);
			//rx.add(record, "aply_basi_dt", StringUtil.replaceToXml(rec.aply_basi_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "insr_clsf", StringUtil.replaceToXml(rec.insr_clsf));
			//rx.add(record, "insr_rate", StringUtil.replaceToXml(rec.insr_rate));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
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
<hd_insr_2001_l>
	<dataSet>
		<CURLIST>
			<record>
				<aply_basi_dt/>
				<seq/>
				<insr_clsf/>
				<insr_rate/>
				<remk/>
			</record>
		</CURLIST>
	</dataSet>
</hd_insr_2001_l>
*/
%>

<% /* 작성시간 : Fri May 22 15:03:08 KST 2009 */ %>