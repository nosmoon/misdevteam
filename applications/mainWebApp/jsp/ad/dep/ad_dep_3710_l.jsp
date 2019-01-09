<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%

	
	RwXml rx = new RwXml();
	AD_DEP_3710_LDataSet ds = (AD_DEP_3710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	try {  
			
		int gridData = rx.add(root, "gridData", ""); 

		for(int i = 0; i<ds.curlist.size(); i++) {
			AD_DEP_3710_LCURLISTRecord rec = (AD_DEP_3710_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
					
			int aft_bal = StringUtil.toNumber(rec.aft_bal);
			
			rx.add(record, "checked", "");
			rx.add(record, "medi_nm", rec.medi_nm); 
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "pubc_frdt", rec.pubc_frdt);
			rx.add(record, "pubc_todt", rec.pubc_todt);
			rx.add(record, "pubc_amt", rec.pubc_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt); 
			rx.add(record, "unrcp_amt", rec.unrcp_amt);

			rx.add(record, "dhon_frdt", rec.dhon_frdt);
			rx.add(record, "dhon_todt", rec.dhon_todt);
			rx.add(record, "dhon_amt", rec.dhon_amt);
			rx.add(record, "dhon_bal", rec.dhon_bal);
			rx.add(record, "dhon_tot_amt", StringUtil.toNumber(rec.unrcp_amt) + StringUtil.toNumber(rec.dhon_bal));
			rx.add(record, "aft_rcpm_amt", rec.aft_rcpm_amt);
			rx.add(record, "aft_bal", aft_bal); 

			rx.add(record, "slcrg_pers", rec.slcrg_pers); 
			rx.add(record, "mchrg_pers", rec.mchrg_pers);
			rx.add(record, "sue_chrg_pers_nm", rec.sue_chrg_pers_nm);
			rx.add(record, "dlay_rcpm_plan_dt", rec.dlay_rcpm_plan_dt);
			rx.add(record, "chk_01", "1".equals(rec.chk_01) ? "¡Ü" : "");
			rx.add(record, "chk_02", "1".equals(rec.chk_02) ? "¡Ü" : "");
			rx.add(record, "chk_03", "1".equals(rec.chk_03) ? "¡Ü" : "");
			rx.add(record, "chk_04", "1".equals(rec.chk_04) ? "¡Ü" : "");  
			rx.add(record, "chk_05", "1".equals(rec.chk_05) ? "¡Ü" : ""); 
			rx.add(record, "chk_06", "1".equals(rec.chk_06) ? "¡Ü" : "");
			rx.add(record, "chk_07", "1".equals(rec.chk_07) ? "¡Ü" : "");
			rx.add(record, "chk_08", "1".equals(rec.chk_08) ? "¡Ü" : "");
			rx.add(record, "chk_09", "1".equals(rec.chk_09) ? "¡Ü" : ""); 
			rx.add(record, "fpymt_dt", aft_bal > 0 ? "" : rec.fpymt_dt);
			
/* hidden data */			
			rx.add(record, "rept_no", rec.rept_no);
			rx.add(record, "sue_chrg_pers", rec.sue_chrg_pers);
		}
	}
	catch (Exception e) {
		
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
