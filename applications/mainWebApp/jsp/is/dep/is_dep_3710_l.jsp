<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_DEP_3710_LDataSet ds = (IS_DEP_3710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	try {
		int gridData = rx.add(root, "gridData", ""); 

		for(int i = 0; i<ds.curlist.size(); i++) {
			IS_DEP_3710_LCURLISTRecord rec = (IS_DEP_3710_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
					
			rx.add(record, "checked", "");                  
			rx.add(record, "rept_no", rec.rept_no);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "eps_clsf", rec.eps_clsf);
			rx.add(record, "enty_clsf", rec.enty_clsf);
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			rx.add(record, "mchrg_pers", rec.mchrg_pers);
			rx.add(record, "sue_chrg_pers", rec.sue_chrg_pers);
			rx.add(record, "sue_chrg_pers_nm", rec.sue_chrg_pers_nm);
			rx.add(record, "dlay_rcpm_plan_dt", rec.dlay_rcpm_plan_dt);
			rx.add(record, "fpymt_dt", rec.fpymt_dt);
			rx.add(record, "sale_proc_frdt", rec.sale_proc_frdt);
			rx.add(record, "sale_proc_todt", rec.sale_proc_todt);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "unrcp_amt", rec.unrcp_amt);
			rx.add(record, "dhon_frdt", rec.dhon_frdt);
			rx.add(record, "dhon_todt", rec.dhon_todt);
			rx.add(record, "dhon_amt", rec.dhon_amt);
			rx.add(record, "dhon_bal", rec.dhon_bal);
			rx.add(record, "dhon_tot_amt", StringUtil.toNumber(rec.unrcp_amt) + StringUtil.toNumber(rec.dhon_bal));
			rx.add(record, "aft_rcpm_amt", rec.aft_rcpm_amt);
			rx.add(record, "aft_rcpm_dt", rec.aft_rcpm_dt);
			rx.add(record, "aft_bal", rec.aft_bal);
			rx.add(record, "chk_01", "1".equals(rec.chk_01) ? "¡Ü" : "");
			rx.add(record, "chk_02", "1".equals(rec.chk_02) ? "¡Ü" : "");
			rx.add(record, "chk_03", "1".equals(rec.chk_03) ? "¡Ü" : "");
			rx.add(record, "chk_04", "1".equals(rec.chk_04) ? "¡Ü" : "");  
			rx.add(record, "chk_05", "1".equals(rec.chk_05) ? "¡Ü" : ""); 
			rx.add(record, "chk_06", "1".equals(rec.chk_06) ? "¡Ü" : "");
			rx.add(record, "chk_07", "1".equals(rec.chk_07) ? "¡Ü" : "");
			rx.add(record, "chk_08", "1".equals(rec.chk_08) ? "¡Ü" : "");
			rx.add(record, "chk_09", "1".equals(rec.chk_09) ? "¡Ü" : ""); 
			rx.add(record, "clct_dt", rec.clct_dt);
			rx.add(record, "clct_amt", rec.clct_amt);
			rx.add(record, "loss_amt_inclu_yn", rec.loss_amt_inclu_yn);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "remk_1", rec.remk_1);
			rx.add(record, "remk_2", rec.remk_2);
			rx.add(record, "bddb_amt", rec.bddb_amt);
			rx.add(record, "bddb_proc_dt", rec.bddb_proc_dt);
			rx.add(record, "tax_amt_dduc_yn", rec.tax_amt_dduc_yn);
			rx.add(record, "tax_amt_dduc_amt", rec.tax_amt_dduc_amt);
			rx.add(record, "tax_amt_dduc_proc_dt", rec.tax_amt_dduc_proc_dt);   					
		}
	}
	catch (Exception e) {
		
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>