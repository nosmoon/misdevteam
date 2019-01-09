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
	AD_RES_1310_LDataSet ds = (AD_RES_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_1310_LCURLISTRecord rec = (AD_RES_1310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "chrg_aprv", rec.chrg_aprv);
			rx.add(record, "team_chf_aprv", rec.team_chf_aprv);
			rx.add(record, "dis_agrmnt", rec.dis_agrmnt);
			rx.add(record, "preng_occr_dt", rec.preng_occr_dt);
			rx.add(record, "sect_nm", rec.sect_cd + (StringUtil.toNumber(rec.sect_seq) < 10 ? " " + rec.sect_seq : rec.sect_seq ),"");
			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));
			rx.add(record, "chro_clsf_nm", rec.chro_clsf_nm);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "apr_advt_fee", rec.apr_advt_fee);
			rx.add(record, "hndl_plac_nm", rec.hndl_plac_nm);
			rx.add(record, "slcrg_nm", rec.slcrg_nm.substring(6)); 
			//rx.add(record, "slcrg_nm", rec.slcrg_nm); 
			rx.add(record, "preng_occr_seq", rec.preng_occr_seq);
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "preng_advt_bo", rec.preng_advt_bo);
			rx.add(record, "mang_mortg_surp_amt", rec.mang_mortg_surp_amt);
			rx.add(record, "bonddebt_dlco_clsf", rec.bonddebt_dlco_clsf);
			rx.add(record, "bonddebt_dlco_no", rec.bonddebt_dlco_no);
			rx.add(record, "bonddebt_dlco_nm", rec.bonddebt_dlco_nm);
			rx.add(record, "bonddebt_basi_dt", rec.bonddebt_basi_dt);
			rx.add(record, "dept_cd", rec.slcrg_nm.substring(0,6)); 
						
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
