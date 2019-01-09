<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.asrd.rec.*
	,	chosun.ciis.as.asrd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_ASRD_1302_LDataSet ds = (AS_ASRD_1302_LDataSet)request.getAttribute("ds");
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
			AS_ASRD_1302_LCURLISTRecord rec = (AS_ASRD_1302_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "aset_no", rec.aset_no);
			rx.add(record, "aset_nm", rec.aset_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "bund_nm", rec.bund_nm);
			rx.add(record, "acqr_dt", rec.acqr_dt);
			rx.add(record, "orgin_acqr_amt", rec.orgin_acqr_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "cur_acqr_amt", rec.cur_acqr_amt);
			rx.add(record, "un_redm_amt", rec.un_redm_amt);
			rx.add(record, "sale_dt", rec.sale_dt);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "aset_stat_nm", rec.aset_stat_nm);
			rx.add(record, "aset_qunt_cnt", rec.aset_qunt_cnt);
			rx.add(record, "aset_usag", rec.aset_usag);
			rx.add(record, "aset_size", rec.aset_size);
			rx.add(record, "aset_loca", rec.aset_loca);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "aset_no", StringUtil.replaceToXml(rec.aset_no));
			//rx.add(record, "aset_nm", StringUtil.replaceToXml(rec.aset_nm));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "bund_nm", StringUtil.replaceToXml(rec.bund_nm));
			//rx.add(record, "acqr_dt", StringUtil.replaceToXml(rec.acqr_dt));
			//rx.add(record, "orgin_acqr_amt", StringUtil.replaceToXml(rec.orgin_acqr_amt));
			//rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
			//rx.add(record, "cur_acqr_amt", StringUtil.replaceToXml(rec.cur_acqr_amt));
			//rx.add(record, "un_redm_amt", StringUtil.replaceToXml(rec.un_redm_amt));
			//rx.add(record, "sale_dt", StringUtil.replaceToXml(rec.sale_dt));
			//rx.add(record, "sale_amt", StringUtil.replaceToXml(rec.sale_amt));
			//rx.add(record, "aset_stat_nm", StringUtil.replaceToXml(rec.aset_stat_nm));
			//rx.add(record, "aset_qunt_cnt", StringUtil.replaceToXml(rec.aset_qunt_cnt));
			//rx.add(record, "aset_usag", StringUtil.replaceToXml(rec.aset_usag));
			//rx.add(record, "aset_size", StringUtil.replaceToXml(rec.aset_size));
			//rx.add(record, "aset_loca", StringUtil.replaceToXml(rec.aset_loca));
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
<as_asrd_1302_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<aset_no/>
				<aset_nm/>
				<dept_nm/>
				<bund_nm/>
				<acqr_dt/>
				<orgin_acqr_amt/>
				<vat_amt/>
				<cur_acqr_amt/>
				<un_redm_amt/>
				<sale_dt/>
				<sale_amt/>
				<aset_stat_nm/>
				<aset_qunt_cnt/>
				<aset_usag/>
				<aset_size/>
				<aset_loca/>
			</record>
		</CURLIST>
	</dataSet>
</as_asrd_1302_l>
*/
%>

<% /* 작성시간 : Sat Aug 15 10:02:19 KST 2009 */ %>