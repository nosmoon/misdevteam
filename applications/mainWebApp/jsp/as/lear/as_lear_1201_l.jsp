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
	AS_LEAR_1201_LDataSet ds = (AS_LEAR_1201_LDataSet)request.getAttribute("ds");
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
			AS_LEAR_1201_LCURLIST1Record rec = (AS_LEAR_1201_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "cntr_no", rec.cntr_no);
			rx.add(record, "ser_no", rec.ser_no);
			rx.add(record, "leas_area_size", rec.leas_area_size);
			rx.add(record, "bldg_cd", rec.bldg_cd);
			rx.add(record, "cntr_yy", rec.cntr_yy);
			rx.add(record, "cntr_seq", rec.cntr_seq);
			rx.add(record, "clam_yymm", rec.clam_yymm);
			rx.add(record, "leas_clam_amt", rec.leas_clam_amt);
			rx.add(record, "mang_clam_amt", rec.mang_clam_amt);
			rx.add(record, "vat_clam_amt", rec.vat_clam_amt);
			rx.add(record, "clam_tot_amt", rec.clam_tot_amt);
			rx.add(record, "rcpm_tot_amt", rec.rcpm_tot_amt);
			rx.add(record, "misu_amt", rec.misu_amt);
			rx.add(record, "bldg_nm", rec.bldg_nm);
			rx.add(record, "hire_dlco_ern", rec.hire_dlco_ern);
			rx.add(record, "hire_dlco_ern_nm", rec.hire_dlco_ern_nm);
			rx.add(record, "leas_fr_dt", rec.leas_fr_dt);
			rx.add(record, "leas_to_dt", rec.leas_to_dt);
			rx.add(record, "cntr_gurt_amt", rec.cntr_gurt_amt);
			rx.add(record, "cntr_leas_amt", rec.cntr_leas_amt);
			rx.add(record, "cntr_mang_amt", rec.cntr_mang_amt);
			rx.add(record, "cntr_star_nm", rec.cntr_star_nm);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "cntr_no", StringUtil.replaceToXml(rec.cntr_no));
			//rx.add(record, "ser_no", StringUtil.replaceToXml(rec.ser_no));
			//rx.add(record, "leas_area_size", StringUtil.replaceToXml(rec.leas_area_size));
			//rx.add(record, "bldg_cd", StringUtil.replaceToXml(rec.bldg_cd));
			//rx.add(record, "cntr_yy", StringUtil.replaceToXml(rec.cntr_yy));
			//rx.add(record, "cntr_seq", StringUtil.replaceToXml(rec.cntr_seq));
			//rx.add(record, "clam_yymm", StringUtil.replaceToXml(rec.clam_yymm));
			//rx.add(record, "leas_clam_amt", StringUtil.replaceToXml(rec.leas_clam_amt));
			//rx.add(record, "mang_clam_amt", StringUtil.replaceToXml(rec.mang_clam_amt));
			//rx.add(record, "vat_clam_amt", StringUtil.replaceToXml(rec.vat_clam_amt));
			//rx.add(record, "clam_tot_amt", StringUtil.replaceToXml(rec.clam_tot_amt));
			//rx.add(record, "rcpm_tot_amt", StringUtil.replaceToXml(rec.rcpm_tot_amt));
			//rx.add(record, "misu_amt", StringUtil.replaceToXml(rec.misu_amt));
			//rx.add(record, "bldg_nm", StringUtil.replaceToXml(rec.bldg_nm));
			//rx.add(record, "hire_dlco_ern", StringUtil.replaceToXml(rec.hire_dlco_ern));
			//rx.add(record, "hire_dlco_ern_nm", StringUtil.replaceToXml(rec.hire_dlco_ern_nm));
			//rx.add(record, "leas_fr_dt", StringUtil.replaceToXml(rec.leas_fr_dt));
			//rx.add(record, "leas_to_dt", StringUtil.replaceToXml(rec.leas_to_dt));
			//rx.add(record, "cntr_gurt_amt", StringUtil.replaceToXml(rec.cntr_gurt_amt));
			//rx.add(record, "cntr_leas_amt", StringUtil.replaceToXml(rec.cntr_leas_amt));
			//rx.add(record, "cntr_mang_amt", StringUtil.replaceToXml(rec.cntr_mang_amt));
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
<as_lear_1201_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<cntr_no/>
				<ser_no/>
				<leas_area_size/>
				<bldg_cd/>
				<cntr_yy/>
				<cntr_seq/>
				<clam_yymm/>
				<leas_clam_amt/>
				<mang_clam_amt/>
				<vat_clam_amt/>
				<clam_tot_amt/>
				<rcpm_tot_amt/>
				<misu_amt/>
				<bldg_nm/>
				<hire_dlco_ern/>
				<hire_dlco_ern_nm/>
				<leas_fr_dt/>
				<leas_to_dt/>
				<cntr_gurt_amt/>
				<cntr_leas_amt/>
				<cntr_mang_amt/>
				<cntr_star_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</as_lear_1201_l>
*/
%>

<% /* 작성시간 : Wed Apr 22 14:33:48 KST 2009 */ %>