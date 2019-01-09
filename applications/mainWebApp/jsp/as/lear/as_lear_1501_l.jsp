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
	AS_LEAR_1501_LDataSet ds = (AS_LEAR_1501_LDataSet)request.getAttribute("ds");
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
			AS_LEAR_1501_LCURLIST1Record rec = (AS_LEAR_1501_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bldg_nm", rec.bldg_nm);
			rx.add(record, "hire_dlco_nm", rec.hire_dlco_nm);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "leas_fr_dt", rec.leas_fr_dt);
			rx.add(record, "leas_to_dt", rec.leas_to_dt);
			rx.add(record, "leas_area_size", rec.leas_area_size);
			rx.add(record, "cntr_leas_amt", rec.cntr_leas_amt);
			rx.add(record, "cntr_mang_amt", rec.cntr_mang_amt);
			rx.add(record, "cntr_gurt_amt", rec.cntr_gurt_amt);
			rx.add(record, "leas_amt_tot", rec.leas_amt_tot);
			rx.add(record, "mon_clam_amt", rec.mon_clam_amt);
			rx.add(record, "year_clam_amt1", rec.year_clam_amt1);
			rx.add(record, "year_clam_amt2", rec.year_clam_amt2);
			rx.add(record, "cntr_star_nm", rec.cntr_star_nm);
			//rx.add(record, "bldg_nm", StringUtil.replaceToXml(rec.bldg_nm));
			//rx.add(record, "hire_dlco_nm", StringUtil.replaceToXml(rec.hire_dlco_nm));
			//rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			//rx.add(record, "leas_fr_dt", StringUtil.replaceToXml(rec.leas_fr_dt));
			//rx.add(record, "leas_to_dt", StringUtil.replaceToXml(rec.leas_to_dt));
			//rx.add(record, "leas_area_size", StringUtil.replaceToXml(rec.leas_area_size));
			//rx.add(record, "cntr_leas_amt", StringUtil.replaceToXml(rec.cntr_leas_amt));
			//rx.add(record, "cntr_mang_amt", StringUtil.replaceToXml(rec.cntr_mang_amt));
			//rx.add(record, "cntr_gurt_amt", StringUtil.replaceToXml(rec.cntr_gurt_amt));
			//rx.add(record, "leas_amt_tot", StringUtil.replaceToXml(rec.leas_amt_tot));
			//rx.add(record, "mon_clam_amt", StringUtil.replaceToXml(rec.mon_clam_amt));
			//rx.add(record, "year_clam_amt1", StringUtil.replaceToXml(rec.year_clam_amt1));
			//rx.add(record, "year_clam_amt2", StringUtil.replaceToXml(rec.year_clam_amt2));
			//rx.add(record, "cntr_star_nm", StringUtil.replaceToXml(rec.cntr_star_nm));
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
<as_lear_1501_l>
	<dataSet>
		<CURLIST1>
			<record>
				<bldg_nm/>
				<hire_dlco_nm/>
				<addr/>
				<leas_fr_dt/>
				<leas_to_dt/>
				<leas_area_size/>
				<cntr_leas_amt/>
				<cntr_mang_amt/>
				<cntr_gurt_amt/>
				<leas_amt_tot/>
				<mon_clam_amt/>
				<year_clam_amt1/>
				<year_clam_amt2/>
				<cntr_star_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</as_lear_1501_l>
*/
%>

<% /* 작성시간 : Wed Mar 30 21:01:21 KST 2011 */ %>