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
	AS_LEAS_1202_LDataSet ds = (AS_LEAS_1202_LDataSet)request.getAttribute("ds");
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
			AS_LEAS_1202_LCURLIST1Record rec = (AS_LEAS_1202_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clam_seq", rec.clam_seq);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "bldg_clsf", rec.bldg_clsf);
			rx.add(record, "cntr_yy", rec.cntr_yy);
			rx.add(record, "cntr_seq", rec.cntr_seq);
			rx.add(record, "clam_star", rec.clam_star);
			rx.add(record, "cntr_no", rec.cntr_no);
			rx.add(record, "cntr_star_nm", rec.cntr_star_nm);
			rx.add(record, "hire_dlco_ern", rec.hire_dlco_ern);
			rx.addCData(record, "hire_dlco_nm", rec.hire_dlco_nm);
			rx.add(record, "leas_fr_dt", rec.leas_fr_dt);
			rx.add(record, "leas_to_dt", rec.leas_to_dt);
			rx.add(record, "cntr_leas_amt", rec.cntr_leas_amt);
			rx.add(record, "cntr_mang_amt", rec.cntr_mang_amt);
			rx.add(record, "tax_stmt_no", rec.tax_stmt_no);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "leas_clam_amt", rec.leas_clam_amt);
			rx.add(record, "mang_clam_amt1", rec.mang_clam_amt);
			rx.add(record, "vat_clam_amt", rec.vat_clam_amt);
			rx.add(record, "clam_sum_amt", rec.clam_sum_amt);
			rx.add(record, "clam_yymm", rec.clam_yymm);
			rx.add(record, "clam_dt", rec.clam_dt);
			rx.add(record, "leas_clam_cycl", rec.leas_clam_cycl);
			rx.add(record, "mang_clam_cycl", rec.mang_clam_cycl);
			rx.add(record, "upd_slip_yymm", rec.upd_slip_yymm);
			rx.add(record, "upd_slip_dt", rec.upd_slip_dt);
			rx.add(record, "last_leas_clam_dt", rec.last_leas_clam_dt);
			rx.add(record, "last_mang_clam_dt", rec.last_mang_clam_dt);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.addCData(record, "nm_korn", rec.nm_korn);
			rx.add(record, "bldg_cd", rec.bldg_cd);
			rx.add(record, "cntr_star", rec.cntr_star);
			rx.add(record, "mang_clam_amt2", "0");			
			//rx.add(record, "clam_seq", StringUtil.replaceToXml(rec.clam_seq));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "bldg_clsf", StringUtil.replaceToXml(rec.bldg_clsf));
			//rx.add(record, "cntr_yy", StringUtil.replaceToXml(rec.cntr_yy));
			//rx.add(record, "cntr_seq", StringUtil.replaceToXml(rec.cntr_seq));
			//rx.add(record, "clam_star", StringUtil.replaceToXml(rec.clam_star));
			//rx.add(record, "cntr_no", StringUtil.replaceToXml(rec.cntr_no));
			//rx.add(record, "cntr_star_nm", StringUtil.replaceToXml(rec.cntr_star_nm));
			//rx.add(record, "hire_dlco_ern", StringUtil.replaceToXml(rec.hire_dlco_ern));
			//rx.add(record, "hire_dlco_nm", StringUtil.replaceToXml(rec.hire_dlco_nm));
			//rx.add(record, "leas_fr_dt", StringUtil.replaceToXml(rec.leas_fr_dt));
			//rx.add(record, "leas_to_dt", StringUtil.replaceToXml(rec.leas_to_dt));
			//rx.add(record, "cntr_leas_amt", StringUtil.replaceToXml(rec.cntr_leas_amt));
			//rx.add(record, "cntr_mang_amt", StringUtil.replaceToXml(rec.cntr_mang_amt));
			//rx.add(record, "tax_stmt_no", StringUtil.replaceToXml(rec.tax_stmt_no));
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			//rx.add(record, "leas_clam_amt", StringUtil.replaceToXml(rec.leas_clam_amt));
			//rx.add(record, "mang_clam_amt", StringUtil.replaceToXml(rec.mang_clam_amt));
			//rx.add(record, "vat_clam_amt", StringUtil.replaceToXml(rec.vat_clam_amt));
			//rx.add(record, "clam_sum_amt", StringUtil.replaceToXml(rec.clam_sum_amt));
			//rx.add(record, "clam_yymm", StringUtil.replaceToXml(rec.clam_yymm));
			//rx.add(record, "clam_dt", StringUtil.replaceToXml(rec.clam_dt));
			//rx.add(record, "leas_clam_cycl", StringUtil.replaceToXml(rec.leas_clam_cycl));
			//rx.add(record, "mang_clam_cycl", StringUtil.replaceToXml(rec.mang_clam_cycl));
			//rx.add(record, "upd_slip_yymm", StringUtil.replaceToXml(rec.upd_slip_yymm));
			//rx.add(record, "upd_slip_dt", StringUtil.replaceToXml(rec.upd_slip_dt));
			//rx.add(record, "last_leas_clam_dt", StringUtil.replaceToXml(rec.last_leas_clam_dt));
			//rx.add(record, "last_mang_clam_dt", StringUtil.replaceToXml(rec.last_mang_clam_dt));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "bldg_cd", StringUtil.replaceToXml(rec.bldg_cd));
			//rx.add(record, "cntr_star", StringUtil.replaceToXml(rec.cntr_star));
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
<as_leas_1202_l>
	<dataSet>
		<CURLIST1>
			<record>
				<clam_seq/>
				<cmpy_cd/>
				<bldg_clsf/>
				<cntr_yy/>
				<cntr_seq/>
				<clam_star/>
				<cntr_no/>
				<cntr_star_nm/>
				<hire_dlco_ern/>
				<hire_dlco_nm/>
				<leas_fr_dt/>
				<leas_to_dt/>
				<cntr_leas_amt/>
				<cntr_mang_amt/>
				<tax_stmt_no/>
				<slip_no/>
				<leas_clam_amt/>
				<mang_clam_amt1/>
				<vat_clam_amt/>
				<clam_sum_amt/>
				<clam_yymm/>
				<clam_dt/>
				<leas_clam_cycl/>
				<mang_clam_cycl/>
				<upd_slip_yymm/>
				<upd_slip_dt/>
				<last_leas_clam_dt/>
				<last_mang_clam_dt/>
				<incmg_dt_tm/>
				<nm_korn/>
				<bldg_cd/>
				<cntr_star/>
				<mang_clam_amt2/>				
			</record>
		</CURLIST1>
	</dataSet>
</as_leas_1202_l>
*/
%>

<% /* 작성시간 : Mon May 25 14:44:40 KST 2009 */ %>