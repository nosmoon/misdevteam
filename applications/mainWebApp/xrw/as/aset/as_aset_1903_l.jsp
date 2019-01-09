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
	AS_ASET_1903_LDataSet ds = (AS_ASET_1903_LDataSet)request.getAttribute("ds");
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
			AS_ASET_1903_LCURLISTRecord rec = (AS_ASET_1903_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "job_clsf", rec.job_clsf);
			rx.add(record, "aset_no", rec.aset_no);
			rx.add(record, "aset_nm", rec.aset_nm);
			rx.add(record, "eis_aset_clsf", rec.eis_aset_clsf);
			rx.add(record, "acqr_dt", rec.acqr_dt);
			rx.add(record, "aset_size", rec.aset_size);
			rx.add(record, "aset_usag", rec.aset_usag);
			rx.add(record, "aset_qunt_cnt", rec.aset_qunt_cnt);
			rx.add(record, "basi_mrkt_pric", rec.basi_mrkt_pric);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "occr_seq", rec.occr_seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			//rx.add(record, "job_clsf", StringUtil.replaceToXml(rec.job_clsf));
			//rx.add(record, "aset_no", StringUtil.replaceToXml(rec.aset_no));
			//rx.add(record, "aset_nm", StringUtil.replaceToXml(rec.aset_nm));
			//rx.add(record, "eis_aset_clsf", StringUtil.replaceToXml(rec.eis_aset_clsf));
			//rx.add(record, "acqr_dt", StringUtil.replaceToXml(rec.acqr_dt));
			//rx.add(record, "aset_size", StringUtil.replaceToXml(rec.aset_size));
			//rx.add(record, "aset_usag", StringUtil.replaceToXml(rec.aset_usag));
			//rx.add(record, "aset_qunt_cnt", StringUtil.replaceToXml(rec.aset_qunt_cnt));
			//rx.add(record, "basi_mrkt_pric", StringUtil.replaceToXml(rec.basi_mrkt_pric));
			//rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			//rx.add(record, "occr_seq", StringUtil.replaceToXml(rec.occr_seq));
			//rx.add(record, "sub_seq", StringUtil.replaceToXml(rec.sub_seq));
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
<as_aset_1903_l>
	<dataSet>
		<CURLIST>
			<record>
				<job_clsf/>
				<aset_no/>
				<aset_nm/>
				<eis_aset_clsf/>
				<acqr_dt/>
				<aset_size/>
				<aset_usag/>
				<aset_qunt_cnt/>
				<basi_mrkt_pric/>
				<occr_dt/>
				<occr_seq/>
				<sub_seq/>
			</record>
		</CURLIST>
	</dataSet>
</as_aset_1903_l>
*/
%>

<% /* 작성시간 : Tue Aug 11 16:40:18 KST 2009 */ %>