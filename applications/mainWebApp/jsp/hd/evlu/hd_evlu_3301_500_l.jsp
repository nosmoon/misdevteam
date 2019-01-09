<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_3301_500_LDataSet ds = (HD_EVLU_3301_500_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_3301_500_LCURLISTRecord rec = (HD_EVLU_3301_500_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sel_chk", rec.sel_chk);
			rx.add(record, "evlu_grp_nm", rec.evlu_grp_nm);
			rx.add(record, "evlu_proc_stat_2tms", rec.evlu_proc_stat_2tms);
			rx.add(record, "evlu_proc_stat_1tms", rec.evlu_proc_stat_1tms);
			rx.add(record, "evlu_grp_cd", rec.evlu_grp_cd);
			//rx.add(record, "sel_chk", StringUtil.replaceToXml(rec.sel_chk));
			//rx.add(record, "evlu_grp_nm", StringUtil.replaceToXml(rec.evlu_grp_nm));
			//rx.add(record, "evlu_proc_stat_2tms", StringUtil.replaceToXml(rec.evlu_proc_stat_2tms));
			//rx.add(record, "evlu_proc_stat_1tms", StringUtil.replaceToXml(rec.evlu_proc_stat_1tms));
			//rx.add(record, "evlu_grp_cd", StringUtil.replaceToXml(rec.evlu_grp_cd));
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
<hd_evlu_3301_500_l>
	<dataSet>
		<CURLIST>
			<record>
				<sel_chk/>
				<evlu_grp_nm/>
				<evlu_proc_stat_2tms/>
				<evlu_proc_stat_1tms/>
				<evlu_grp_cd/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_3301_500_l>
*/
%>

<% /* 작성시간 : Wed Jun 20 16:55:56 KST 2018 */ %>