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
	HD_AFFR_3300_LDataSet ds = (HD_AFFR_3300_LDataSet)request.getAttribute("ds");
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
			HD_AFFR_3300_LCURLISTRecord rec = (HD_AFFR_3300_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sply_clsf_cd", rec.sply_clsf_cd);
			rx.add(record, "aply_basi_dt", rec.aply_basi_dt);
			rx.add(record, "hlth_chk_fee", rec.hlth_chk_fee);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "sply_clsf_cd", StringUtil.replaceToXml(rec.sply_clsf_cd));
			//rx.add(record, "aply_basi_dt", StringUtil.replaceToXml(rec.aply_basi_dt));
			//rx.add(record, "hlth_chk_fee", StringUtil.replaceToXml(rec.hlth_chk_fee));
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
<hd_affr_3300_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<occr_dt/>
				<seq/>
				<sply_clsf_cd/>
				<aply_basi_dt/>
				<hlth_chk_fee/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_3300_l>
*/
%>

<% /* 작성시간 : Fri Jul 24 10:28:05 KST 2009 */ %>