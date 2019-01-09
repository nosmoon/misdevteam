<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_4301_LDataSet ds = (HD_AFFR_4301_LDataSet)request.getAttribute("ds");
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
			HD_AFFR_4301_LCURLISTRecord rec = (HD_AFFR_4301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "category_clsf", rec.category_clsf);
			rx.add(record, "grp_indt_clsf", rec.grp_indt_clsf);
			rx.add(record, "indt_cd", rec.indt_cd);
			rx.add(record, "indt_nm", rec.indt_nm);
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "category_clsf", StringUtil.replaceToXml(rec.category_clsf));
			//rx.add(record, "grp_indt_clsf", StringUtil.replaceToXml(rec.grp_indt_clsf));
			//rx.add(record, "indt_cd", StringUtil.replaceToXml(rec.indt_cd));
			//rx.add(record, "indt_nm", StringUtil.replaceToXml(rec.indt_nm));
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
<hd_affr_4301_l>
	<dataSet>
		<CURLIST>
			<record>
				<occr_dt/>
				<seq/>
				<category_clsf/>
				<grp_indt_clsf/>
				<indt_cd/>
				<indt_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_4301_l>
*/
%>

<% /* 작성시간 : Fri May 29 17:28:45 KST 2009 */ %>