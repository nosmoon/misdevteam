<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
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
	AD_PUB_1025_SDataSet ds = (AD_PUB_1025_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
//	int resData = rx.add(root, "resData", "");
	int resForm = rx.add(root, "resForm", "");

	try { 

		long pubc_tot_amt = StringUtil.toNumber(ds.pubc_tot_amt);
		long fee		  = StringUtil.toNumber(ds.fee);	
		
		rx.add(resForm, "medi_cd", ds.medi_cd);
		rx.add(resForm, "dlco_no", ds.dlco_no);
		rx.addCData(resForm, "dlco_nm", ds.dlco_nm);
		rx.addCData(resForm, "sect_nm", ds.sect_cd + ds.sect_seq);
		rx.add(resForm, "cm", DigitUtil.cutUnderPoint(ds.cm,1));
		rx.add(resForm, "dn", DigitUtil.cutUnderPoint(ds.dn,1));
		rx.addCData(resForm, "chro_clsf_nm", ds.chro_clsf_nm); 
		rx.add(resForm, "chro_clsf", ds.chro_clsf); 
		rx.add(resForm, "uprc", ds.uprc);
		rx.add(resForm, "advt_fee", ds.advt_fee);
		rx.add(resForm, "vat", ds.vat);
		rx.add(resForm, "pubc_tot_amt", ds.pubc_tot_amt);
		rx.add(resForm, "rtax_yn", StringUtil.nvl(ds.rtax_yn, "N"));
		rx.add(resForm, "tabl_yn", StringUtil.nvl(ds.tabl_yn, "N"));
		rx.add(resForm, "hndl_clsf", ds.hndl_clsf);
		rx.add(resForm, "agn", ds.agn); 
		rx.addCData(resForm, "agn_nm", ds.agn_nm);  
		rx.add(resForm, "fee_rate", ds.fee_rate);  
		rx.add(resForm, "fee", ds.fee);
		rx.add(resForm, "hndl_plac_cd", ds.hndl_plac_cd);
		rx.addCData(resForm, "hndl_plac_nm", ds.hndl_plac_nm);
		rx.add(resForm, "coms_rate", ds.coms_rate); 
		rx.add(resForm, "coms", ds.coms);
		rx.add(resForm, "advt_clas", ds.advt_clas);
		rx.add(resForm, "indt_clsf", ds.indt_clsf);  
		rx.addCData(resForm, "indt_clsf_nm", ds.indt_clsf_nm);
		rx.add(resForm, "mony_kind", StringUtil.nvl(ds.mony_kind, "KRW"));
		rx.add(resForm, "type_clsf", ds.type_clsf);
		rx.addCData(resForm, "type_clsf_nm", ds.type_clsf_nm);
		rx.add(resForm, "exrate", ds.exrate);
		rx.add(resForm, "pubc_clsf", ds.pubc_clsf); 
		rx.add(resForm, "appndx_clsf", "");
		rx.add(resForm, "grp_cmpy_cd", ds.grp_cmpy_cd);
		rx.add(resForm, "frex_cntr_amt", ds.frex_cntr_amt);
		rx.add(resForm, "edt_clsf", ds.edt_clsf);
		rx.add(resForm, "slcrg_pers", ds.slcrg_pers);
		rx.addCData(resForm, "slcrg_pers_nm", ds.slcrg_pers_nm);
		rx.add(resForm, "dept_cd", ds.dept_cd);
		rx.addCData(resForm, "dept_nm", ds.dept_nm);
		rx.add(resForm, "mchrg_pers", ds.mchrg_pers);
		rx.addCData(resForm, "mchrg_pers_nm", ds.mchrg_pers_nm); 
		rx.addCData(resForm, "advt_cont", ds.advt_cont);
		rx.addCData(resForm, "remk", ds.remk); 
		rx.add(resForm, "pubc_dt", ds.preng_occr_dt); 
		rx.add(resForm, "proc_dt", ds.preng_occr_dt); 
		rx.add(resForm, "proc_seq", ""); 
		rx.add(resForm, "pubc_side", ds.pubc_side); 
		rx.add(resForm, "preng_occr_dt", ds.preng_occr_dt); 
		rx.add(resForm, "preng_occr_seq", ds.preng_occr_seq); 
		
		rx.add(resForm, "govern_advt_yn", "N");
		rx.add(resForm, "upd_resn", "");
		rx.add(resForm, "upd_cont", "");
		rx.add(resForm, "dtev_medi_cd", "");
		rx.add(resForm, "dtob_medi_cd", "");
				
		rx.add(resForm, "sel_rate", "R"); 
		rx.add(resForm, "brdg_advt_yn", "N");  //브릿지광고여부
		rx.add(resForm, "seq_clsf", "");  //순번구분
		rx.add(resForm, "nwsp_type_yn", ds.nwsp_type_yn);  //여부
		rx.add(resForm, "nwsp_side_type", ds.nwsp_side_type);  //지면형태
		rx.add(resForm, "pre_issu_yn", ds.pre_issu_yn);  //선발행여부
		rx.add(resForm, "pre_day_issu", "");  //선일자발행여부		
		rx.add(resForm, "asist_pers", ds.ast_pers);  //어시스트
		rx.add(resForm, "asist_pers_nm", ds.ast_pers_nm);  //어시스트
		rx.add(resForm, "pubc_frdt", ds.pubc_frdt);  //게재시작일자
		rx.add(resForm, "pubc_todt", ds.pubc_todt);  //게재마감일
		rx.add(resForm, "fee_vat", ds.fee_vat);
		rx.add(resForm, "coms_vat", ds.coms_vat);
		rx.add(resForm, "fee_ex", "");
		rx.add(resForm, "coms_ex", "");
		rx.add(resForm, "pragn_yn", StringUtil.nvl(ds.pragn_yn, "N"));
		rx.add(resForm, "dtls_medi_cd", ds.dtls_medi_cd);
		rx.add(resForm, "multiUpdateData", "");
						
		if(pubc_tot_amt > 0 && fee > 0){
/*		
			double real_rate = 0.0d;
			double tot_rate  = 0.0d;
			double net_rate  = 0.0d;
			real_rate = ((double)fee/(double)pubc_tot_amt) * 100;
			rx.add(resForm, "real_rate", DigitUtil.cutUnderPoint(real_rate, 1)); 
			rx.add(resForm, "real_rate_bool", "Y"); 
			
	        tot_rate  = ((double)fee/(double)((pubc_tot_amt - fee) * 100 / 85)) * 100;	
			rx.add(resForm, "tot_rate", DigitUtil.cutUnderPoint(tot_rate, 1)); 
			rx.add(resForm, "tot_rate_bool", "Y"); 

        	net_rate = ((double)fee / (double)(pubc_tot_amt - fee)) * 100;	
			rx.add(resForm, "net_rate", DigitUtil.cutUnderPoint(net_rate, 1)); 
			rx.add(resForm, "net_rate_bool", "Y"); 
*/			
		}
		//뉴비즈 버스승강장 리스트 조회
		int gridData3 = rx.add(root, "gridData3", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_1025_SCURLISTRecord rec = (AD_PUB_1025_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.addCData(record, "bus_seq", rec.bus_seq);
			rx.addCData(record, "bus_plc", rec.bus_plc); 
			rx.addCData(record, "bus_clsf", rec.bus_clsf);
		}
		//행사협찬 리스트 조회
		int gridData4 = rx.add(root, "gridData4", "");	
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_PUB_1025_SCURLIST2Record rec = (AD_PUB_1025_SCURLIST2Record)ds.curlist2.get(i);
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