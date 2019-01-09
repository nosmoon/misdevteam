<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.aset.rec.*
	,	chosun.ciis.as.aset.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASET_1901_LDataSet ds = (AS_ASET_1901_LDataSet)request.getAttribute("ds");
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
			AS_ASET_1901_LCURLISTRecord rec = (AS_ASET_1901_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "chg_dt", rec.chg_dt);
			rx.add(record, "aset_tot_cnt", rec.aset_tot_cnt);
			rx.add(record, "eis_fix", rec.eis_fix);
			rx.add(record, "eis_pers", rec.eis_pers);
			rx.add(record, "eis_fix_dt_tm", rec.eis_fix_dt_tm);
			//rx.add(record, "chg_dt", StringUtil.replaceToXml(rec.chg_dt));
			//rx.add(record, "aset_tot_cnt", StringUtil.replaceToXml(rec.aset_tot_cnt));
			//rx.add(record, "eis_fix", StringUtil.replaceToXml(rec.eis_fix));
			//rx.add(record, "eis_pers", StringUtil.replaceToXml(rec.eis_pers));
			//rx.add(record, "eis_fix_dt_tm", StringUtil.replaceToXml(rec.eis_fix_dt_tm));
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
<as_aset_1901_l>
	<dataSet>
		<CURLIST>
			<record>
				<chg_dt/>
				<aset_tot_cnt/>
				<eis_fix/>
				<eis_pers/>
				<eis_fix_dt_tm/>
			</record>
		</CURLIST>
	</dataSet>
</as_aset_1901_l>
*/
%>

<% /* 작성시간 : Mon Aug 10 20:45:46 KST 2009 */ %>