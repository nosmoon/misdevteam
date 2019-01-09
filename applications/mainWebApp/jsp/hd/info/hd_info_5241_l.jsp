<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_5241_LDataSet ds = (HD_INFO_5241_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "Sch", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5241_LCURLISTRecord rec = (HD_INFO_5241_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "row_num", rec.row_num);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "schir_seq", rec.schir_seq);
			rx.add(record, "scl_clsf", rec.scl_clsf);
			rx.add(record, "scl_cd", rec.scl_cd);
			rx.add(record, "scl_nm", rec.scl_nm);
			rx.add(record, "scl_clsf_nm", rec.scl_clsf_nm);
			rx.add(record, "enty_dt", rec.enty_dt);
			rx.add(record, "grdu_dt", rec.grdu_dt);
			rx.add(record, "grdu_clsf", rec.grdu_clsf);
			rx.add(record, "grdu_clsf_nm", rec.grdu_clsf_nm);
			rx.add(record, "majr_clsf_nm_1", rec.majr_clsf_nm_1);
			rx.add(record, "majr_clsf_1", rec.majr_clsf_1);
			rx.add(record, "majr_cd_1", rec.majr_cd_1);
			rx.add(record, "majr_nm_1", rec.majr_nm_1);
			rx.add(record, "majr_clsf_2", rec.majr_clsf_2);
			rx.add(record, "majr_clsf_nm_2", rec.majr_clsf_nm_2);
			rx.add(record, "majr_cd_2", rec.majr_cd_2);
			rx.add(record, "majr_nm_2", rec.majr_nm_2);
			rx.add(record, "majr_clsf_3", rec.majr_clsf_3);
			rx.add(record, "majr_clsf_nm_3", rec.majr_clsf_nm_3);
			rx.add(record, "majr_cd_3", rec.majr_cd_3);
			rx.add(record, "majr_nm_3", rec.majr_nm_3);
			rx.add(record, "sclgg_kind_cd", rec.sclgg_kind_cd);
			rx.add(record, "sclgg_kind_nm", rec.sclgg_kind_nm);
			rx.add(record, "plcw_cd", rec.plcw_cd);
			rx.add(record, "plcw_nm", rec.plcw_nm);
			rx.add(record, "natn_cd", rec.natn_cd);
			rx.add(record, "natn_nm", rec.natn_nm);
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
<dataSet>
	<CURLIST>
		<record>
			<row_num/>
			<cmpy_cd/>
			<emp_no/>
			<schir_seq/>
			<scl_clsf/>
			<scl_cd/>
			<scl_nm/>
			<scl_clsf_nm/>
			<enty_dt/>
			<grdu_dt/>
			<grdu_clsf/>
			<grdu_clsf_nm/>
			<degr_cd/>
			<degr_nm/>
			<majr_clsf_nm_1/>
			<majr_clsf_1/>
			<majr_cd_1/>
			<majr_nm_1/>
			<majr_clsf_2/>
			<majr_clsf_nm_2/>
			<majr_cd_2/>
			<majr_nm_2/>
			<majr_clsf_3/>
			<majr_clsf_nm_3/>
			<majr_cd_3/>
			<majr_nm_3/>
			<sclgg_kind_cd/>
			<sclgg_kind_nm/>
			<plcw_cd/>
			<plcw_nm/>
			<natn_cd/>
			<natn_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 13 16:29:39 KST 2009 */ %>