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
	HD_AFFR_2414_MDataSet ds = (HD_AFFR_2414_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int combo = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "initData", "");
	combo = rx.add(dataSet, "comboSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(combo, "hospz_med_exam_pers_flnm", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_2414_MCURLISTRecord rec = (HD_AFFR_2414_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.faml_flnm);
			rx.add(record, "label", rec.faml_flnm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "faml_seq", StringUtil.replaceToXml(rec.faml_seq));
			//rx.add(record, "faml_rshp_cd", StringUtil.replaceToXml(rec.faml_rshp_cd));
			//rx.add(record, "faml_rshp_nm", StringUtil.replaceToXml(rec.faml_rshp_nm));
			//rx.add(record, "faml_flnm", StringUtil.replaceToXml(rec.faml_flnm));
			//rx.add(record, "faml_prn", StringUtil.replaceToXml(rec.faml_prn));
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
<hd_affr_2413_m>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<faml_seq/>
				<faml_rshp_cd/>
				<faml_rshp_nm/>
				<faml_flnm/>
				<faml_prn/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_2413_m>
*/
%>

<% /* 작성시간 : Tue Oct 16 14:07:35 KST 2012 */ %>