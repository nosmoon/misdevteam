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
	HD_INFO_7202_LDataSet ds = (HD_INFO_7202_LDataSet)request.getAttribute("ds");
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
			HD_INFO_7202_LCURLISTRecord rec = (HD_INFO_7202_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "frlc_no", rec.frlc_no);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.addCData(record, "budg_nm", rec.budg_nm);
			rx.add(record, "chrg_posk_cd", rec.chrg_posk_cd);
			rx.addCData(record, "chrg_posk_nm", rec.chrg_posk_nm);
			rx.addCData(record, "thrw_pgm_nm", rec.thrw_pgm_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "thrw_pgm", rec.thrw_pgm);
			rx.add(record, "duty_dds", rec.duty_dds);
			rx.add(record, "cntr_dt", rec.cntr_dt);
			rx.add(record, "cntr_expr_dt", rec.cntr_expr_dt);
			rx.add(record, "lvcmpy_dt", rec.lvcmpy_dt);
			rx.add(record, "pay_cycl", rec.pay_cycl);
			rx.addCData(record, "pay_cycl_nm", rec.pay_cycl_nm);
			rx.add(record, "servcost", rec.servcost);
			rx.add(record, "base_amt", rec.base_amt);
			rx.add(record, "tot_amt", rec.base_amt);
			rx.add(record, "incm_clsf_cd", rec.incm_clsf_cd);
			rx.addCData(record, "incm_clsf_nm", rec.incm_clsf_nm);
			rx.add(record, "draft_no", rec.draft_no);
			rx.addCData(record, "draft_dept_cd", rec.draft_dept_cd);
			rx.add(record, "pay_mm", rec.pay_mm);
			rx.add(record, "setl_bank", rec.setl_bank);
			rx.add(record, "acct_no", rec.acct_no);			
			rx.add(record, "remk", rec.remk);

			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "frlc_no", StringUtil.replaceToXml(rec.frlc_no));
			//rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			//rx.add(record, "chrg_posk_cd", StringUtil.replaceToXml(rec.chrg_posk_cd));
			//rx.add(record, "chrg_posk_nm", StringUtil.replaceToXml(rec.chrg_posk_nm));
			//rx.add(record, "thrw_pgm_nm", StringUtil.replaceToXml(rec.thrw_pgm_nm));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "thrw_pgm", StringUtil.replaceToXml(rec.thrw_pgm));
			//rx.add(record, "cntr_dt", StringUtil.replaceToXml(rec.cntr_dt));
			//rx.add(record, "cntr_expr_dt", StringUtil.replaceToXml(rec.cntr_expr_dt));
			//rx.add(record, "lvcmpy_dt", StringUtil.replaceToXml(rec.lvcmpy_dt));
			//rx.add(record, "pay_cycl", StringUtil.replaceToXml(rec.pay_cycl));
			//rx.add(record, "pay_cycl_nm", StringUtil.replaceToXml(rec.pay_cycl_nm));
			//rx.add(record, "servcost", StringUtil.replaceToXml(rec.servcost));
			//rx.add(record, "pay_amt", StringUtil.replaceToXml(rec.pay_amt));
			//rx.add(record, "draft_no", StringUtil.replaceToXml(rec.draft_no));
			
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
<hd_info_7202_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<frlc_no/>
				<mang_no/>
				<flnm/>
				<budg_cd/>
				<budg_nm/>
				<chrg_posk_cd/>
				<chrg_posk_nm/>
				<thrw_pgm_nm/>
				<medi_cd/>
				<thrw_pgm/>
				<cntr_dt/>
				<cntr_expr_dt/>
				<lvcmpy_dt/>
				<pay_cycl/>
				<pay_cycl_nm/>
				<servcost/>
				<pay_amt/>
				<draft_no/>
			</record>
		</CURLIST>
	</dataSet>
</hd_info_7202_l>
*/
%>

<% /* 작성시간 : Mon Apr 01 16:39:53 KST 2013 */ %>