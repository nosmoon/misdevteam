<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PAPMAKE_4000_LDataSet ds = (PR_PAPMAKE_4000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet 	= 0;
	int recordSet 	= 0;
    int formData 	= 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		formData = rx.add(dataSet, "resForm2", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_PAPMAKE_4000_LCURLIST3Record rec = (PR_PAPMAKE_4000_LCURLIST3Record)ds.curlist3.get(i);
			//int record = rx.add(formData, "record", "");
			rx.add(formData, "addm_make_servcost", rec.addm_make_servcost);
			rx.add(formData, "sep_prt_servcost", rec.sep_prt_servcost);
			rx.add(formData, "addm_prt_servcost", rec.addm_prt_servcost);
			rx.add(formData, "crps_cost", rec.crps_cost);
			rx.add(formData, "dduc_cost", rec.dduc_cost);
		}
		/****** CURLIST2 END */
		
		/****** CURLIST BEGIN */
		formData = rx.add(dataSet, "resForm", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PAPMAKE_4000_LCURLIST2Record rec = (PR_PAPMAKE_4000_LCURLIST2Record)ds.curlist2.get(i);
			//int record = rx.add(formData, "record", "");
			rx.add(formData, "basi_prt_qty", rec.basi_prt_qty);
			rx.add(formData, "basi_excs_qty", rec.basi_excs_qty);
			rx.add(formData, "base_servcost", rec.base_servcost);
			rx.add(formData, "basi_excs_servcost", rec.basi_excs_servcost);
			rx.add(formData, "basi_ovt_prt_qty", rec.basi_ovt_prt_qty);
			rx.add(formData, "basi_sep_prtn_servcost", rec.basi_sep_prtn_servcost);
			rx.add(formData, "base_make_servcost", rec.base_make_servcost);
			rx.add(formData, "basi_make_pcnt", rec.basi_make_pcnt);
			rx.add(formData, "basi_excs_pcnt", rec.basi_excs_pcnt);
			rx.add(formData, "basi_excs_make_servcost", rec.basi_excs_make_servcost);
			rx.add(formData, "crps_cost", rec.crps_cost);
		}
		/****** CURLIST2 END */

		formData = rx.add(dataSet, "gridData", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PAPMAKE_4000_LCURLIST1Record rec = (PR_PAPMAKE_4000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "days", rec.days);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "sect_type", rec.sect_type);
			rx.add(record, "pap_std", rec.pap_std);
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "slip_qty", rec.slip_qty);
			rx.add(record, "dual_out_clsf", rec.dual_out_clsf);
			rx.add(record, "duty_ovt_prt_yn", rec.duty_ovt_prt_yn);
			rx.add(record, "all_slip_qty", rec.all_slip_qty);
			rx.add(record, "all_slip_qty_1", rec.all_slip_qty_1);
		}
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
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<issu_dt/>
			<days/>
			<medi_cd/>
			<sect_cd/>
			<pap_std/>
			<issu_pcnt/>
			<clr_pcnt/>
			<slip_qty/>
			<qunt_out_yn/>
			<duty_ovt_prt_yn/>
			<all_slip_qty/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 11 10:12:21 KST 2009 */ %>