<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.leas.rec.*
	,	chosun.ciis.as.leas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAS_1502_LDataSet ds = (AS_LEAS_1502_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			AS_LEAS_1502_LCURLIST1Record rec = (AS_LEAS_1502_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "leas_mm", rec.leas_mm);
			rx.add(record, "bldg_nm", rec.bldg_nm);
			rx.addCData(record, "aset_nm", rec.aset_nm);
			rx.addCData(record, "leas_dlco_ern_nm", rec.leas_dlco_ern_nm);
			rx.add(record, "leas_prd", rec.leas_prd);
			rx.add(record, "cntr_no", rec.cntr_no);
			rx.add(record, "cntr_leas_amt", rec.cntr_leas_amt);
			rx.add(record, "cntr_mang_amt", rec.cntr_mang_amt);
			rx.add(record, "cntr_gurt_amt", rec.cntr_gurt_amt);
			rx.add(record, "incr_amt", rec.incr_amt);
			rx.add(record, "gurt_int_amt", rec.gurt_int_amt);
			rx.add(record, "impl_pfls", rec.impl_pfls);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "leas_mm", StringUtil.replaceToXml(rec.leas_mm));
			//rx.add(record, "bldg_nm", StringUtil.replaceToXml(rec.bldg_nm));
			//rx.add(record, "aset_nm", StringUtil.replaceToXml(rec.aset_nm));
			//rx.add(record, "leas_dlco_ern_nm", StringUtil.replaceToXml(rec.leas_dlco_ern_nm));
			//rx.add(record, "leas_prd", StringUtil.replaceToXml(rec.leas_prd));
			//rx.add(record, "cntr_no", StringUtil.replaceToXml(rec.cntr_no));
			//rx.add(record, "cntr_leas_amt", StringUtil.replaceToXml(rec.cntr_leas_amt));
			//rx.add(record, "cntr_mang_amt", StringUtil.replaceToXml(rec.cntr_mang_amt));
			//rx.add(record, "cntr_gurt_amt", StringUtil.replaceToXml(rec.cntr_gurt_amt));
			//rx.add(record, "incr_amt", StringUtil.replaceToXml(rec.incr_amt));
			//rx.add(record, "gurt_int_amt", StringUtil.replaceToXml(rec.gurt_int_amt));
			//rx.add(record, "impl_pfls", StringUtil.replaceToXml(rec.impl_pfls));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<as_leas_1502_l>
	<dataSet>
		<CURLIST1>
			<record>
				<leas_mm/>
				<bldg_nm/>
				<aset_nm/>
				<leas_dlco_ern_nm/>
				<leas_prd/>
				<cntr_no/>
				<cntr_leas_amt/>
				<cntr_mang_amt/>
				<cntr_gurt_amt/>
				<incr_amt/>
				<gurt_int_amt/>
				<impl_pfls/>
				<cmpy_cd/>
			</record>
		</CURLIST1>
	</dataSet>
</as_leas_1502_l>
*/
%>

<% /* 작성시간 : Tue Apr 14 13:47:38 KST 2009 */ %>