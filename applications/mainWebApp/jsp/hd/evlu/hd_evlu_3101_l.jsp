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
	HD_EVLU_3101_LDataSet ds = (HD_EVLU_3101_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_3101_LCURLISTRecord rec = (HD_EVLU_3101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sel_chk", rec.sel_chk);
			rx.add(record, "evlu_grp_nm", rec.evlu_grp_nm);
			rx.add(record, "evlu_proc_stat_1tms", rec.evlu_proc_stat_1tms);
			rx.add(record, "evlu_proc_stat_1tms_cd", rec.evlu_proc_stat_1tms_cd);
			rx.add(record, "evlu_grp_cd", rec.evlu_grp_cd);
			rx.add(record, "grp_count", rec.grp_count);
			rx.add(record, "grp_1tms_y", rec.grp_1tms_y);
			rx.add(record, "grp_1tms_n", rec.grp_1tms_n);
			//rx.add(record, "sel_chk", StringUtil.replaceToXml(rec.sel_chk));
			//rx.add(record, "evlu_grp_nm", StringUtil.replaceToXml(rec.evlu_grp_nm));
			//rx.add(record, "evlu_proc_stat_1tms", StringUtil.replaceToXml(rec.evlu_proc_stat_1tms));
			//rx.add(record, "evlu_proc_stat_1tms_cd", StringUtil.replaceToXml(rec.evlu_proc_stat_1tms_cd));
			//rx.add(record, "evlu_grp_cd", StringUtil.replaceToXml(rec.evlu_grp_cd));
			//rx.add(record, "grp_count", StringUtil.replaceToXml(rec.grp_count));
			//rx.add(record, "grp_1tms_y", StringUtil.replaceToXml(rec.grp_1tms_y));
			//rx.add(record, "grp_1tms_n", StringUtil.replaceToXml(rec.grp_1tms_n));
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
<hd_evlu_3101_l>
	<dataSet>
		<CURLIST>
			<record>
				<sel_chk/>
				<evlu_grp_nm/>
				<evlu_proc_stat_1tms/>
				<evlu_proc_stat_1tms_cd/>
				<evlu_grp_cd/>
				<grp_count/>
				<grp_1tms_y/>
				<grp_1tms_n/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_3101_l>
*/
%>

<% /* 작성시간 : Thu Sep 08 19:09:19 KST 2016 */ %>