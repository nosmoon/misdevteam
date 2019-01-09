<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.bas.rec.*
	,	chosun.ciis.ad.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_BAS_1210_LDataSet ds = (AD_BAS_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", ""); 
	
	int gridData = rx.add(resData, "gridData", "");

	for(int i = 0; i < ds.curlist.size(); i++) {
	  
		AD_BAS_1210_LCURLISTRecord rec = (AD_BAS_1210_LCURLISTRecord)ds.curlist.get(i);
		int record = rx.add(gridData, "record", "");
	
			double	colt_amt	=	Math.round(StringUtil.toLong(rec.colt_amt)/1000000);
			String s_colt_amt   =   DigitUtil.cutUnderPoint(colt_amt/100, 1);
			
			System.out.println(rec.colt_amt + " => " + colt_amt  + " => " + s_colt_amt);
			
		    rx.add(record,"cntr_dt"			, rec.cntr_dt);
			rx.add(record,"dlco_nm"			, rec.dlco_nm);
			rx.add(record,"cntr_type"		, rec.cntr_type);
			rx.add(record,"slcrg_pers"		, rec.slcrg_pers);
			rx.add(record,"slcrg_opn"		, rec.slcrg_opn);
			rx.add(record,"mchrg_pers"		, rec.mchrg_pers);
			rx.add(record,"mchrg_opn"		, rec.mchrg_opn);
			rx.add(record,"presi_nm"		, rec.presi_nm); 
			rx.add(record,"colt_amt" 		, s_colt_amt);
			rx.add(record,"mm_avg_pubc_amt" , rec.mm_avg_pubc_amt);
			rx.add(record,"colt_ratio"		, "".equals(StringUtil.nvl(rec.colt_ratio)) ? "" : StringUtil.toDouble(rec.colt_ratio) + "%");
			rx.add(record,"avg_due_dd"		, rec.avg_due_dd);
			rx.add(record,"taem_chf_opn"	, rec.taem_chf_opn);
			rx.add(record,"main_dlco_nm"	, rec.main_dlco_nm);
			rx.add(record,"chg_dt"			, rec.chg_dt);
			rx.add(record,"dlco_no" 		, rec.dlco_no);
			rx.add(record,"cntr_seq"		, rec.cntr_seq);
 
	}
	out.println(rx.xmlFlush());
	out.println(rx.xmlEndFlush());
%>
