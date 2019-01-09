<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.en.comm.rec.*
	,	chosun.ciis.en.comm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_COMM_1402_LDataSet ds = (EN_COMM_1402_LDataSet)request.getAttribute("ds");
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
			EN_COMM_1402_LCURLISTRecord rec = (EN_COMM_1402_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rcpm_shet_kind", StringUtil.replaceToXml(rec.rcpm_shet_kind));
			rx.add(record, "rcpm_shet_no", StringUtil.replaceToXml(rec.rcpm_shet_no));
			rx.add(record, "rcpm_clsf", StringUtil.replaceToXml(rec.rcpm_clsf));
			rx.add(record, "widr_resn", StringUtil.replaceToXml(rec.widr_resn));
			rx.add(record, "rcpm_shet_stat", StringUtil.replaceToXml(rec.rcpm_shet_stat));
			rx.add(record, "rcpm_shet_dlv_dt", StringUtil.replaceToXml(rec.rcpm_shet_dlv_dt));
			rx.add(record, "widr_dt", StringUtil.replaceToXml(rec.widr_dt));
			//rx.add(record, "rcpm_shet_kind", rec.rcpm_shet_kind);
			//rx.add(record, "rcpm_shet_no", rec.rcpm_shet_no);
			//rx.add(record, "rcpm_clsf", rec.rcpm_clsf);
			//rx.add(record, "widr_resn", rec.widr_resn);
			//rx.add(record, "rcpm_shet_stat", rec.rcpm_shet_stat);
			//rx.add(record, "rcpm_shet_dlv_dt", rec.rcpm_shet_dlv_dt);
			//rx.add(record, "widr_dt", rec.widr_dt);
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
<en_comm_1402_l>
	<dataSet>
		<CURLIST>
			<record>
				<rcpm_shet_kind/>
				<rcpm_shet_no/>
				<rcpm_clsf/>
				<widr_resn/>
				<rcpm_shet_stat/>
				<rcpm_shet_dlv_dt/>
				<widr_dt/>
			</record>
		</CURLIST>
	</dataSet>
</en_comm_1402_l>
*/
%>

<% /* 작성시간 : Mon Jun 01 17:43:37 KST 2009 */ %>