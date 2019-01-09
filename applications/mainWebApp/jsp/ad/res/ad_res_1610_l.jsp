<%@	page contentType="text/xml; charset=EUC-KR" %>


<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_1610_LDataSet ds = (AD_RES_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID; 

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_1610_LCURLISTRecord rec = (AD_RES_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "chrg_aprv" 			, "Y".equals(rec.chrg_aprv) ? "○" : "");
			rx.add(record, "team_chf_aprv" 		, "Y".equals(rec.team_chf_aprv) ? "○" : "");
			rx.add(record, "preng_occr_dt"		, rec.preng_occr_dt); 
			rx.add(record, "preng_occr_seq"		, rec.preng_occr_seq);
			rx.add(record, "pubc_side"			, rec.pubc_side);
			rx.add(record, "cm"					, DigitUtil.cutUnderPoint(rec.cm,1)); //소수점 1자리까지 표현
			rx.add(record, "dn"					, DigitUtil.cutUnderPoint(rec.dn,1)); //소수점 1자리까지 표현
			rx.add(record, "chro_clsf_nm"		, rec.chro_clsf_nm);
			rx.addCData(record, "dlco_nm"			, rec.dlco_nm.replaceAll(";amp",""));
			rx.addCData(record, "advt_cont"			, rec.advt_cont);
			rx.add(record, "uprc"				, rec.uprc);
			rx.add(record, "advt_fee"			, rec.advt_fee);
			rx.add(record, "pubc_clsf_nm"		, rec.pubc_clsf_nm);
			rx.add(record, "slcrg_nm"			, rec.slcrg_nm);
			rx.add(record, "hndl_clsf_nm"			, rec.hndl_clsf_nm);
			rx.addCData(record, "hndl_plac_nm"		, rec.hndl_plac_nm.replaceAll(";amp",""));
			rx.add(record, "indt_clsf_nm"		, rec.indt_clsf_nm);
			rx.add(record, "grp_cmpy_nm"		, rec.grp_cmpy_nm); 
			rx.add(record, "cmpy_cd" 			, rec.cmpy_cd);
			rx.add(record, "medi_cd" 			, rec.medi_cd);
						
		}
		
		rx.add(resData, "tot_pn"	, ds.tot_pn);
		rx.add(resData, "tot_dn"	, ds.tot_dn);
		rx.add(resData, "tot_rt"	, ds.tot_rt);
		rx.add(resData, "ysdanga"	, ds.ysdanga);
		rx.add(resData, "pgdanga"	, ds.pgdanga);
		rx.add(resData, "ysgjamt"	, ds.ysgjamt);
		rx.add(resData, "res_rt"	, ds.res_rt);
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
