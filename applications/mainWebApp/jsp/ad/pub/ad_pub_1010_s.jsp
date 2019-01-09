<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	java.lang.*	
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_1010_SDataSet ds = (AD_PUB_1010_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	//int resData = rx.add(root, "resData", "");
	int resForm = rx.add(root, "resForm", "");

	try { 

		long pubc_tot_amt = StringUtil.toNumber(ds.pubc_tot_amt);
		long fee		  = StringUtil.toNumber(ds.fee);	
		
		rx.add(resForm, "medi_cd", ds.medi_cd);
		rx.add(resForm, "dlco_no", ds.dlco_no);
		rx.addCData(resForm, "dlco_nm", ds.dlco_nm);
		rx.addCData(resForm, "sect_nm", ds.sect_cd + ds.sect_seq);
		rx.add(resForm, "dn", DigitUtil.cutUnderPoint(ds.dn,1));
		rx.add(resForm, "cm", DigitUtil.cutUnderPoint(ds.cm,1));
		rx.add(resForm, "chro_clsf", StringUtil.nvl(ds.chro_clsf, "2")); 
		rx.add(resForm, "uprc", StringUtil.nvl(ds.uprc, "0"));
		rx.add(resForm, "advt_fee", StringUtil.nvl(ds.advt_fee, "0"));
		rx.add(resForm, "vat", StringUtil.nvl(ds.vat, "0"));  
		rx.add(resForm, "pubc_tot_amt", StringUtil.nvl(ds.pubc_tot_amt,"0"));
		rx.add(resForm, "rtax_yn", StringUtil.nvl(ds.rtax_yn, "N"));
		rx.add(resForm, "tabl_yn", StringUtil.nvl(ds.tabl_yn, "N"));
		rx.add(resForm, "hndl_clsf", StringUtil.nvl(ds.hndl_clsf, "1"));
		rx.add(resForm, "agn", ds.agn); 
		rx.addCData(resForm, "agn_nm", ds.agn_nm);  
		rx.add(resForm, "fee_rate", StringUtil.nvl(ds.fee_rate,"0"));  
		rx.add(resForm, "fee", StringUtil.nvl(ds.fee, "0"));
		rx.add(resForm, "hndl_plac_cd", ds.hndl_plac_cd);
		rx.addCData(resForm, "hndl_plac_nm", ds.hndl_plac_nm);
		rx.add(resForm, "coms_rate", StringUtil.nvl(ds.coms_rate,"0")); 
		rx.add(resForm, "coms", StringUtil.nvl(ds.coms,"0"));
		rx.add(resForm, "advt_clas", StringUtil.nvl(ds.advt_clas, "1"));
		rx.add(resForm, "indt_clsf", ds.indt_clsf);  
		rx.addCData(resForm, "indt_clsf_nm", ds.indt_clsf_nm);
		rx.add(resForm, "mony_kind", StringUtil.nvl(ds.mony_kind, "KRW"));
		rx.add(resForm, "type_clsf", ds.type_clsf);
		rx.addCData(resForm, "type_clsf_nm", ds.type_clsf_nm);
		rx.add(resForm, "exrate", ds.exrate);
		rx.add(resForm, "pubc_clsf", StringUtil.nvl(ds.pubc_clsf, "1")); 
		rx.add(resForm, "appndx_clsf", ds.appndx_clsf);
		rx.add(resForm, "grp_cmpy_cd", ds.grp_cmpy_cd);
		rx.add(resForm, "frex_cntr_amt", ds.frex_cntr_amt);
		rx.add(resForm, "edt_clsf", StringUtil.nvl(ds.edt_clsf, "1"));
		rx.add(resForm, "slcrg_pers", ds.slcrg_pers);   
		rx.addCData(resForm, "slcrg_pers_nm", ds.slcrg_pers_nm);
		rx.add(resForm, "dept_cd", ds.dept_cd);
		rx.addCData(resForm, "dept_nm", ds.dept_nm);
		rx.add(resForm, "mchrg_pers", ds.mchrg_pers);
		rx.addCData(resForm, "mchrg_pers_nm", ds.mchrg_pers_nm); 
		rx.addCData(resForm, "advt_cont", ds.advt_cont);
		rx.addCData(resForm, "remk", ds.remk); 
		rx.add(resForm, "pubc_dt", ds.pubc_dt); 
		rx.add(resForm, "proc_dt", ds.proc_dt); 		
		rx.add(resForm, "proc_seq", ds.proc_seq); 
		rx.add(resForm, "pubc_side", ds.pubc_side); 
		rx.add(resForm, "preng_occr_dt", ""); 
		rx.add(resForm, "preng_occr_seq", ""); 
		
		rx.add(resForm, "print_dt", ds.proc_dt);
		rx.add(resForm, "pre_pubc_slip_no_crte_dt", ds.pre_pubc_slip_no_crte_dt);
		rx.add(resForm, "pre_pubc_slip_no", ds.pre_pubc_slip_no);
		rx.add(resForm, "upd_yn", ds.upd_yn);
		rx.add(resForm, "div_yn", ds.div_yn);
		rx.add(resForm, "clos_stat", ds.clos_stat);
		rx.add(resForm, "clamt_stat", ds.clamt_stat);
		rx.add(resForm, "sale_stmt_issu_yn", ds.sale_stmt_issu_yn);
		rx.add(resForm, "tax_slip_no", ds.tax_slip_no);
		rx.add(resForm, "purc_stmt_issu_yn", ds.purc_stmt_issu_yn);
		rx.add(resForm, "purc_stmt_issu_yn2", ds.purc_stmt_issu_yn2);
		rx.add(resForm, "elec_tax_stmt_yn", ds.elec_tax_stmt_yn);
		rx.add(resForm, "pubc_occr_dt", ds.pubc_occr_dt);
		rx.add(resForm, "pubc_occr_seq", ds.pubc_occr_seq); 
		
		rx.add(resForm, "std_clsf", ds.std_clsf); 
		rx.add(resForm, "pubc_prd", ds.pubc_prd); 
		rx.add(resForm, "pubc_frdt", ds.pubc_frdt); 
		rx.add(resForm, "pubc_todt", ds.pubc_todt); 
		rx.add(resForm, "hp_edt_clsf", ds.hp_edt_clsf); 

		rx.add(resForm, "govern_advt_yn", StringUtil.nvl(ds.govern_advt_yn, "N"));
		rx.add(resForm, "upd_resn", ds.upd_resn);
		rx.add(resForm, "upd_cont", ds.upd_cont);
		
		rx.add(resForm, "sel_rate", "R"); 
		rx.add(resForm, "brdg_advt_yn", StringUtil.nvl(ds.brdg_advt_yn, "N"));  //브릿지광고여부
		rx.add(resForm, "seq_clsf", StringUtil.nvl(ds.seq_clsf, ""));  //순번구분
		
		rx.add(resForm, "nwsp_type_yn", StringUtil.nvl(ds.nwsp_type_yn, "N"));  //협찬광고여부
		rx.add(resForm, "nwsp_side_type", ds.nwsp_side_type);  //지면형태
		
		rx.add(resForm, "dtls_medi_cd", ds.dtls_medi_cd);  //지면형태
		rx.add(resForm, "dtev_medi_cd", ds.dtls_medi_cd);  //지면형태
		rx.add(resForm, "dtob_medi_cd", ds.dtls_medi_cd);  //지면형태
		rx.add(resForm, "pre_issu_yn", StringUtil.nvl(ds.pre_issu_yn, "N"));  //선발행여부	
		rx.add(resForm, "pre_day_issu", StringUtil.nvl(ds.pre_day_issu, "N"));  //선일자발행여부			
		rx.add(resForm, "asist_pers", StringUtil.nvl(ds.ast_pers));  //어시스트 사번		   
		rx.add(resForm, "asist_pers_nm", StringUtil.nvl(ds.ast_pers_nm));  //어시스트명
		rx.add(resForm, "fee_vat", StringUtil.nvl(ds.fee_vat, "0"));
		rx.add(resForm, "coms_vat", StringUtil.nvl(ds.coms_vat, "0"));	
		rx.add(resForm, "fee_ex", StringUtil.toNumber(ds.fee)-StringUtil.toNumber(ds.fee_vat));
		rx.add(resForm, "coms_ex", StringUtil.toNumber(ds.coms)-StringUtil.toNumber(ds.coms_vat));
		rx.add(resForm, "cslcrg_pers", ds.cslcrg_pers);   
		rx.addCData(resForm, "cslcrg_pers_nm", ds.cslcrg_pers_nm);
		rx.add(resForm, "pragn_yn", StringUtil.nvl(ds.pragn_yn, "N"));			
		rx.add(resForm, "multiUpdateData", "");					
		rx.add(resForm, "multiUpdateData2", "");							
		
		if(pubc_tot_amt > 0 && fee > 0){

//			double real_rate = 0.0d;
//			double tot_rate  = 0.0d;
//			double net_rate  = 0.0d;
//			real_rate = ((double)fee/(double)pubc_tot_amt) * 100;
//			rx.add(resForm, "real_rate", DigitUtil.cutUnderPoint(real_rate, 1)); 
//			rx.add(resForm, "real_rate_bool", "Y"); 
			
//	        tot_rate  = ((double)fee/(double)((pubc_tot_amt - fee) * 100 / 85)) * 100;	
//			rx.add(resForm, "tot_rate", DigitUtil.cutUnderPoint(tot_rate, 1)); 
//			rx.add(resForm, "tot_rate_bool", "Y"); 

//        	net_rate = ((double)fee / (double)(pubc_tot_amt - fee)) * 100;	
//			rx.add(resForm, "net_rate", DigitUtil.cutUnderPoint(net_rate, 1)); 
//			rx.add(resForm, "net_rate_bool", "Y"); 

		}
		//뉴비즈 버스승강장 리스트 조회
		int gridData3 = rx.add(root, "gridData3", "");	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_1010_SCURLISTRecord rec = (AD_PUB_1010_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.addCData(record, "bus_seq", rec.bus_seq);
			rx.addCData(record, "bus_plc", rec.bus_plc); 
			rx.addCData(record, "bus_clsf", rec.bus_clsf);
			//System.out.println("bus_plc::"+i+"::"+rec.bus_plc);
		}		
		//행사협찬 리스트 조회
		int gridData4 = rx.add(root, "gridData4", "");	
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_PUB_1010_SCURLIST2Record rec = (AD_PUB_1010_SCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(gridData4, "record", "");
			rx.addCData(record, "seq", rec.seq);
			rx.addCData(record, "evnt_yy", rec.evnt_nm.substring(0,4)); 
			rx.addCData(record, "evnt_cd", rec.evnt_nm); 
			rx.addCData(record, "amt", rec.amt);
			rx.addCData(record, "vat", rec.vat);			
			rx.addCData(record, "tot_amt", rec.tot_amt);
			rx.addCData(record, "fee", rec.fee);
			rx.addCData(record, "fee_vat", rec.fee_vat);
			rx.addCData(record, "tot_fee", rec.tot_fee);
			//System.out.println("bus_plc::"+i+"::"+rec.bus_plc);
		}		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jan 29 11:08:42 KST 2009 */ %>