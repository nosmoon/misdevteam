<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.lear.rec.*
	,	chosun.ciis.as.lear.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_LEAR_1301_LDataSet ds = (AS_LEAR_1301_LDataSet)request.getAttribute("ds");
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
			AS_LEAR_1301_LCURLISTRecord rec = (AS_LEAR_1301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bldg_nm", rec.bldg_nm);
			rx.add(record, "ser_no", rec.ser_no);
			rx.add(record, "leas_size", rec.leas_size);
			rx.add(record, "hire_dlco_nm", rec.hire_dlco_nm);
			rx.add(record, "day_fr", rec.day_fr);
			rx.add(record, "day_to2", rec.day_to2);
			rx.add(record, "cntr_gurt_amt", rec.cntr_gurt_amt);
			rx.add(record, "cntr_leas_amt", rec.cntr_leas_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "gurt_int_amt", rec.gurt_int_amt);
			rx.add(record, "mon_clam_amt", rec.mon_clam_amt);
			rx.add(record, "out_date", rec.out_date);
			rx.add(record, "tax_cnt", rec.tax_cnt);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "bldg_cd", rec.bldg_cd);
			rx.add(record, "cntr_yy", rec.cntr_yy);
			rx.add(record, "cntr_seq", rec.cntr_seq);
			rx.add(record, "hire_dlco_ern", rec.hire_dlco_ern);
			rx.add(record, "leas_clam_cycl", rec.leas_clam_cycl);
			rx.add(record, "mang_clam_cycl", rec.mang_clam_cycl);
			//rx.add(record, "bldg_nm", StringUtil.replaceToXml(rec.bldg_nm));
			//rx.add(record, "ser_no", StringUtil.replaceToXml(rec.ser_no));
			//rx.add(record, "leas_size", StringUtil.replaceToXml(rec.leas_size));
			//rx.add(record, "hire_dlco_nm", StringUtil.replaceToXml(rec.hire_dlco_nm));
			//rx.add(record, "day_fr", StringUtil.replaceToXml(rec.day_fr));
			//rx.add(record, "day_to2", StringUtil.replaceToXml(rec.day_to2));
			//rx.add(record, "cntr_gurt_amt", StringUtil.replaceToXml(rec.cntr_gurt_amt));
			//rx.add(record, "cntr_leas_amt", StringUtil.replaceToXml(rec.cntr_leas_amt));
			//rx.add(record, "tot_amt", StringUtil.replaceToXml(rec.tot_amt));
			//rx.add(record, "gurt_int_amt", StringUtil.replaceToXml(rec.gurt_int_amt));
			//rx.add(record, "mon_clam_amt", StringUtil.replaceToXml(rec.mon_clam_amt));
			//rx.add(record, "out_date", StringUtil.replaceToXml(rec.out_date));
			//rx.add(record, "tax_cnt", StringUtil.replaceToXml(rec.tax_cnt));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "bldg_cd", StringUtil.replaceToXml(rec.bldg_cd));
			//rx.add(record, "cntr_yy", StringUtil.replaceToXml(rec.cntr_yy));
			//rx.add(record, "cntr_seq", StringUtil.replaceToXml(rec.cntr_seq));
			//rx.add(record, "hire_dlco_ern", StringUtil.replaceToXml(rec.hire_dlco_ern));
			//rx.add(record, "leas_clam_cycl", StringUtil.replaceToXml(rec.leas_clam_cycl));
			//rx.add(record, "mang_clam_cycl", StringUtil.replaceToXml(rec.mang_clam_cycl));
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
<as_lear_1301_l>
	<dataSet>
		<CURLIST>
			<record>
				<bldg_nm/>
				<ser_no/>
				<leas_size/>
				<hire_dlco_nm/>
				<day_fr/>
				<day_to2/>
				<cntr_gurt_amt/>
				<cntr_leas_amt/>
				<tot_amt/>
				<gurt_int_amt/>
				<mon_clam_amt/>
				<out_date/>
				<tax_cnt/>
				<cmpy_cd/>
				<bldg_cd/>
				<cntr_yy/>
				<cntr_seq/>
				<hire_dlco_ern/>
				<leas_clam_cycl/>
				<mang_clam_cycl/>
			</record>
		</CURLIST>
	</dataSet>
</as_lear_1301_l>
*/
%>

<% /* 작성시간 : Thu Apr 23 17:44:15 KST 2009 */ %>