<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_7110_LDataSet ds = (HD_INFO_7110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_7110_LCURLISTRecord rec = (HD_INFO_7110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "frlc_no", rec.frlc_no);
			rx.addCData(record, "flnm", rec.flnm);
			rx.add(record, "chrg_posk_cd", rec.chrg_posk_cd);
			rx.addCData(record, "chrg_posk_cd_nm", rec.chrg_posk_cd_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "thrw_pgm", rec.thrw_pgm);
			rx.addCData(record, "thrw_pgm_nm", rec.thrw_pgm_nm);
			rx.add(record, "medi_cd2", rec.medi_cd2);
			rx.add(record, "thrw_pgm2", rec.thrw_pgm2);
			rx.addCData(record, "thrw_pgm2_nm", rec.thrw_pgm2_nm);
			rx.add(record, "cntr_dt", rec.cntr_dt);
			rx.add(record, "cntr_expr_dt", rec.cntr_expr_dt);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			
			String	work_yn = "";
				if("10".equals(rec.work_yn)) 		work_yn = "재직";
				else if("20".equals(rec.work_yn)) 	work_yn = "퇴직";		
				
			rx.add(record, "work_yn", work_yn);  	
			rx.add(record, "servcost", rec.servcost);
			rx.add(record, "pay_cycl", rec.pay_cycl);
			rx.addCData(record, "etc_pay_cond", rec.etc_pay_cond);
			rx.add(record, "prn", rec.prn);
			rx.addCData(record, "tel_no", rec.tel_no);
			rx.addCData(record, "addr", rec.addr);
			rx.add(record, "draft_no", rec.draft_no);
			rx.add(record, "draft_dept_cd", rec.draft_dept_cd);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "setl_bank", rec.setl_bank);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
			
			rx.add(record, "incm_clsf_cd", rec.incm_clsf_cd);
			rx.add(record, "incm_clsf_nm", rec.incm_clsf_nm);
			rx.add(record, "chrg_posk_nm", rec.chrg_posk_nm);
			rx.add(record, "all_insr_dduc_yn", rec.all_insr_dduc_yn);
			rx.add(record, "remk", rec.remk);
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
<hd_info_7002_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<frlc_no/>
				<flnm/>
				<prn/>
				<tel_no/>
				<addr/>
				<chrg_posk_cd/>
				<thrw_pgm/>
				<pay_cycl/>
				<servcost/>
				<serv_pay_cond/>
				<fst_cntr_dt/>
				<last_cntr_dt/>
				<cntr_expr_dt/>
				<draft_no/>
				<bank_cd/>
				<acct_no/>
				<medi_cd/>
				<mang_no/>
			</record>
		</CURLIST>
	</dataSet>
</hd_info_7002_l>
*/
%>

<% /* 작성시간 : Tue Dec 04 16:01:54 KST 2012 */ %>