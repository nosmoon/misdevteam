<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML 객체 생성 
	
	AD_BAS_1010_SDataSet ds = (AD_BAS_1010_SDataSet)request.getAttribute("ds");
	
	int root 	  = RwXml.rootNodeID;
	int formData  = rx.add( root , "formData" , "");
	
	rx.add(formData, "dlco_no", ds.dlco_no);
	rx.addCData(formData, "dlco_nm", ds.dlco_nm);
	rx.addCData(formData, "dlco_abrv_nm", ds.dlco_abrv_nm);
	rx.add(formData, "ern", ds.ern);
	rx.addCData(formData, "zip_1", ds.zip_1);
	rx.addCData(formData, "zip_2", ds.zip_2);  
	rx.addCData(formData, "addr", ds.addr);
	rx.addCData(formData, "dtls_addr", ds.dtls_addr);
	rx.add(formData, "presi_nm", ds.presi_nm);
	rx.add(formData, "presi_prn", ds.presi_prn);
	rx.add(formData, "presi_zip_1", ds.presi_zip_1);
	rx.add(formData, "presi_zip_2", ds.presi_zip_2);
	rx.add(formData, "presi_addr", ds.presi_addr);
	rx.add(formData, "presi_dtls_addr", ds.presi_dtls_addr);
	rx.add(formData, "bizcond", ds.bizcond); 
	rx.add(formData, "item", ds.item);
	rx.add(formData, "grp_cmpy_cd", ds.grp_cmpy_cd);
	rx.add(formData, "eps_clsf_cd", ds.eps_clsf_cd);
	rx.add(formData, "cntr_yn", ds.cntr_yn);
	rx.add(formData, "mang_clsf", ds.mang_clsf);
	rx.add(formData, "oth_cmpy_dlco_yn", ds.oth_cmpy_dlco_yn);
	rx.add(formData, "govern_advt_yn", ds.govern_advt_yn);
	rx.add(formData, "cntr_type", ds.cntr_type);
	rx.add(formData, "slcrg_pers", ds.slcrg_pers);
	rx.add(formData, "mchrg_pers", ds.mchrg_pers);
	rx.add(formData, "slcrg_pers_nm", ds.slcrg_pers_nm);
	rx.add(formData, "mchrg_pers_nm", ds.mchrg_pers_nm);
	rx.add(formData, "indt_cd", ds.indt_cd);
	rx.add(formData, "type_cd", ds.type_cd);
	rx.add(formData, "fndt_dt", ds.fndt_dt);
	rx.add(formData, "dhon_dt", ds.dhon_dt);
	rx.add(formData, "chg_dt_tm", ds.chg_dt_tm);
	rx.add(formData, "chg_pers", ds.chg_pers); 
	rx.add(formData, "capt_amt", ds.capt_amt);
	rx.add(formData, "gnr_advcs_yn", ds.gnr_advcs_yn);
	rx.add(formData, "arow_advcs_yn", ds.arow_advcs_yn);
	rx.add(formData, "agn_yn", ds.agn_yn);
	rx.add(formData, "nmd_agn_yn", ds.nmd_agn_yn);	
	rx.add(formData, "advt_bo_yn", ds.advt_bo_yn);
	rx.add(formData, "bo_bof_yn", ds.bo_bof_yn);
	rx.add(formData, "del_yn", ds.del_yn);
	rx.add(formData, "elec_tax_comp_cd", ds.elec_tax_comp_cd);
	rx.add(formData, "email_id", ds.email_id);
	rx.add(formData, "chk_cnt", ds.chk_cnt);
	rx.add(formData, "flag", "");
	rx.add(formData, "preng_yn", ds.preng_yn);	 
	rx.add(formData, "multiUpdateData", "");
	rx.add(formData, "multiUpdateData2", "");	
	
	int gridData = rx.add(formData, "gridData", "");
	
	for(int i = 0; i < ds.curlist.size(); i++) {
		AD_BAS_1010_SCURLISTRecord rec = (AD_BAS_1010_SCURLISTRecord)ds.curlist.get(i);
		int record = rx.add(gridData, "record", "");
		rx.add(record, "seq", rec.seq);
		rx.add(record, "job_clsf", rec.job_clsf);
		rx.add(record, "advcs_feat", rec.advcs_feat);
		rx.add(record, "chrg_pers", rec.chrg_pers);
		rx.add(record, "tel_no", rec.tel_no);
	}	

	int gridData2 = rx.add(formData, "gridData2", "");
	
	for(int i = 0; i < ds.curlist2.size(); i++) {
		AD_BAS_1010_SCURLIST2Record rec2 = (AD_BAS_1010_SCURLIST2Record)ds.curlist2.get(i);
		int record = rx.add(gridData2, "record", "");
		rx.add(record, "seq", rec2.seq);
		rx.add(record, "insrt_dt", rec2.insrt_dt);
		rx.add(record, "dlco_info", rec2.dlco_info);
		rx.add(record, "chrg_pers", rec2.chrg_pers);
	}	
		
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>