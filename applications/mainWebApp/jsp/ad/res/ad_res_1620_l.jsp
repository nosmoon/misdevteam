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
	AD_RES_1620_LDataSet ds = (AD_RES_1620_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID; 

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_1620_LCURLISTRecord rec = (AD_RES_1620_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "chrg_aprv" 			, "Y".equals(rec.chrg_aprv) ? "¡Û" : "");
			rx.add(record, "team_chf_aprv" 		, "Y".equals(rec.team_chf_aprv) ? "¡Û" : "");
			rx.add(record, "preng_occr_dt"		, rec.preng_occr_dt); 
			rx.add(record, "preng_occr_seq"		, rec.preng_occr_seq);
			rx.add(record, "medi_nm" 			, rec.medi_nm); 
			rx.add(record, "pubc_side"			, rec.pubc_side);
			rx.add(record, "chro_clsf_nm"		, rec.chro_clsf_nm);
			rx.addCData(record, "dlco_nm"			, rec.dlco_nm);
			rx.addCData(record, "advt_cont"			, rec.advt_cont);
			rx.add(record, "uprc"				, rec.uprc);
			rx.add(record, "advt_fee"			, rec.advt_fee);
			rx.add(record, "slcrg_nm"			, rec.slcrg_nm);
			rx.add(record, "hndl_plac_nm"		, rec.hndl_plac_nm);
			rx.add(record, "fee"			, rec.fee);
			rx.add(record, "indt_clsf_nm"		, rec.indt_clsf_nm);
			rx.add(record, "grp_cmpy_nm"		, rec.grp_cmpy_nm); 
			rx.add(record, "cmpy_cd" 			, rec.cmpy_cd);
			rx.add(record, "medi_cd" 			, rec.medi_cd);
			rx.add(record, "remk" 			, rec.remk);			
			if("1".equals(rec.tax_clsf)){
				rx.add(record, "tax_clsf"			, "±¤°íÁÖ");
			}
			if("2".equals(rec.tax_clsf)){
				rx.add(record, "tax_clsf"			, "´ëÇà»ç");
			}
			if("4".equals(rec.tax_clsf)){
				rx.add(record, "tax_clsf"			, "À§¼öÅ¹");
			}			
			rx.add(record, "tax_email" 			, rec.tax_email);
			rx.add(record, "patr_chrg_info" 			    , rec.patr_chrg_info);	
			if("Y".equals(rec.advt_clsf)){
				rx.add(record, "advt_clsf"			, "ÇùÂù");
			}else{
				rx.add(record, "advt_clsf"			, "ÀÏ¹Ý");
			}								
		}
	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
