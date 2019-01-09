<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*
				,chosun.ciis.ad.bas.ds.*
				,chosun.ciis.co.base.util.*
				,somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_1616_SDataSet ds = (AD_BAS_1616_SDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int bonddebt   	= rx.add(root, "bonddebt", "");

	try {  
		rx.add(bonddebt, "dlco_clsf"                 ,ds.dlco_clsf                  );             
		rx.add(bonddebt, "dlco_no"                   ,ds.dlco_no                    );
		rx.add(bonddebt, "dlco_nm"                   ,ds.dlco_nm                    );
		rx.add(bonddebt, "slcrg_pers"             	 ,ds.slcrg_pers		            );
		rx.add(bonddebt, "slcrg_pers_nm"             ,ds.slcrg_pers_nm              );
		rx.add(bonddebt, "mchrg_pers"                ,ds.mchrg_pers              	);
		rx.add(bonddebt, "mchrg_pers_nm"             ,ds.mchrg_pers_nm              );
		rx.add(bonddebt, "basi_dt"                   ,ds.basi_dt                    );
		rx.add(bonddebt, "unrcp_tot_amt"             ,ds.unrcp_tot_amt              );
		rx.add(bonddebt, "un_repay_dhon_bal"         ,ds.un_repay_dhon_bal          );
		rx.add(bonddebt, "mang_expt_ufth_bond_amt"   ,ds.mang_expt_ufth_bond_amt    );
		rx.add(bonddebt, "busn_expt_ufth_bond_amt"   ,ds.busn_expt_ufth_bond_amt    );  
		rx.add(bonddebt, "mortg_amt"                 ,ds.mortg_amt                  );
		rx.add(bonddebt, "un_pay_fee"                ,ds.un_pay_fee                 );  
		rx.add(bonddebt, "precpt_acml_amt"           ,ds.precpt_acml_amt            );  
		rx.add(bonddebt, "etc_mortg_amt"             ,ds.etc_mortg_amt              );
		rx.add(bonddebt, "mang_dr_stot"              ,ds.mang_dr_stot               );
		rx.add(bonddebt, "busn_dr_stot"              ,ds.busn_dr_stot               );
		rx.add(bonddebt, "dng_stot"                  ,ds.dng_stot                   );                 
		rx.add(bonddebt, "mang_mortg_surp_amt",         	ds.mang_mortg_surp_amt);                         
		rx.add(bonddebt, "busn_mortg_surp_amt",         	ds.busn_mortg_surp_amt); 
		rx.add(bonddebt, "sum_kiil",                    	ds.sum_kiil);
		rx.add(bonddebt, "avg_point",                   	ds.avg_point);
		rx.add(bonddebt, "evlu_frdt",                   	ds.evlu_frdt); 
		rx.add(bonddebt, "evlu_todt",                   	ds.evlu_todt);		
		 
		int curlist3   	= rx.add(bonddebt, "curlist3", "");
		
		long recenote_tot_amt 		= 0;
		long busn_recenote_tot_amt 	= 0;
		long mang_recenote_tot_amt 	= 0;
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1616_SCURLISTRecord rec = (AD_BAS_1616_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist3, "record", "");
			rx.add(record, "mang_chce_yn", rec.mang_chce_yn);
			rx.add(record, "busn_chce_yn", rec.busn_chce_yn);
			rx.add(record, "dhon_chce_yn", rec.dhon_chce_yn);
			rx.add(record, "issu_pers", rec.issu_pers);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "note_stat", rec.note_stat);
			rx.add(record, "note_no", rec.note_no);
			rx.add(record, "note_clsf_nm", rec.note_clsf_nm);
			
			recenote_tot_amt 		+= StringUtil.toLong(rec.amt);
			if("Y".equals(rec.mang_chce_yn)){
				mang_recenote_tot_amt	+= StringUtil.toLong(rec.amt);
			}	
			if("Y".equals(rec.busn_chce_yn)){
				busn_recenote_tot_amt	+= StringUtil.toLong(rec.amt);
			}	
		}	
		
		//if(recenote_tot_amt == 0) recenote_tot_amt = 1;
		String busn_percent = "0";
		String mang_percent = "0";
		if(recenote_tot_amt > 0){
			busn_percent	= DigitUtil.cutUnderPoint((double)busn_recenote_tot_amt*100/(double)recenote_tot_amt, 0);
			mang_percent	= DigitUtil.cutUnderPoint((double)mang_recenote_tot_amt*100/(double)recenote_tot_amt, 0);
		}
		rx.add(bonddebt, "recenote_tot_amt"          ,recenote_tot_amt);
		rx.add(bonddebt, "busn_recenote_tot_amt"     ,DigitUtil.nf_format(busn_recenote_tot_amt)+"("+busn_percent+"%)");
		rx.add(bonddebt, "mang_recenote_tot_amt"     ,DigitUtil.nf_format(mang_recenote_tot_amt)+"("+mang_percent+"%)");
				
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
