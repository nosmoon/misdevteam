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
<%---------------------------------------------------------------------------------------------------
* 파일명 : ad_bas_3710_l.jsp
* 기능 : 조중동광고데이터베이스 목록조회
* 작성일자 : 2011.03.28
* 작성자 : KBS
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	AD_BAS_3710_LDataSet ds = (AD_BAS_3710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
//	int resForm = rx.add(resData, "resForm", "");
	try
	{//System.out.print("jsp 도착");
		//조선
		int gd_cs = rx.add(resData, "gd_cs", "");
		for(int i=0; i<ds.curlist1.size(); i++)
		{
			AD_BAS_3710_LCURLIST1Record rec = (AD_BAS_3710_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gd_cs, "record", "");
			
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "pubc_dt_key", rec.pubc_dt);
			rx.add(record, "pubc_seq", rec.pubc_seq);
			rx.add(record, "pubc_dt", rec.pubc_dt);

			rx.add(record, "sect", rec.sect);
			rx.add(record, "sect_nm_cd", rec.sect_nm_cd);
			rx.addCData(record, "advt_cont", rec.advt_cont);
			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));
			rx.add(record, "pubc_asse_cd", rec.pubc_asse_cd);
			rx.add(record, "indt_clsf", rec.indt_clsf); 
			rx.add(record, "remk", rec.remk);
			rx.add(record, "slcrg_nm", rec.slcrg_nm);
			rx.add(record, "agn_bo_no", rec.agn_bo_no);
		}
		
		//중앙
		int gd_ja = rx.add(resData, "gd_ja", "");
		for(int i=0; i<ds.curlist2.size(); i++)
		{
			AD_BAS_3710_LCURLIST2Record rec = (AD_BAS_3710_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(gd_ja, "record", "");
			
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "pubc_dt_key", rec.pubc_dt);
			rx.add(record, "pubc_seq", rec.pubc_seq);
			rx.add(record, "pubc_dt", rec.pubc_dt);

			rx.add(record, "sect", rec.sect);
			rx.add(record, "sect_nm_cd", rec.sect_nm_cd);
			rx.addCData(record, "advt_cont", rec.advt_cont);
			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));
			rx.add(record, "pubc_asse_cd", rec.pubc_asse_cd);
			rx.add(record, "indt_clsf", rec.indt_clsf);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "slcrg_nm", rec.slcrg_nm);	
			rx.add(record, "agn_bo_no", rec.agn_bo_no);
		}
		
		//동아
		int gd_da = rx.add(resData, "gd_da", "");
		for(int i=0; i<ds.curlist3.size(); i++)
		{
			AD_BAS_3710_LCURLIST3Record rec = (AD_BAS_3710_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(gd_da, "record", "");
			
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "pubc_dt_key", rec.pubc_dt);
			rx.add(record, "pubc_seq", rec.pubc_seq);
			rx.add(record, "pubc_dt", rec.pubc_dt);

			rx.add(record, "sect", rec.sect);
			rx.add(record, "sect_nm_cd", rec.sect_nm_cd);
			rx.addCData(record, "advt_cont", rec.advt_cont);
			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));
			rx.add(record, "pubc_asse_cd", rec.pubc_asse_cd);
			rx.add(record, "indt_clsf", rec.indt_clsf);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "slcrg_nm", rec.slcrg_nm);
			rx.add(record, "agn_bo_no", rec.agn_bo_no);
		}
		
		//매경
		int gd_me = rx.add(resData, "gd_me", "");
		for(int i=0; i<ds.curlist4.size(); i++)
		{
			AD_BAS_3710_LCURLIST4Record rec = (AD_BAS_3710_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(gd_me, "record", "");
			
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "pubc_dt_key", rec.pubc_dt);
			rx.add(record, "pubc_seq", rec.pubc_seq);
			rx.add(record, "pubc_dt", rec.pubc_dt);

			rx.add(record, "sect", rec.sect);
			rx.add(record, "sect_nm_cd", rec.sect_nm_cd);
			rx.addCData(record, "advt_cont", rec.advt_cont);
			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));
			rx.add(record, "pubc_asse_cd", rec.pubc_asse_cd); 
			rx.add(record, "indt_clsf", rec.indt_clsf);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "slcrg_nm", rec.slcrg_nm);	
			rx.add(record, "agn_bo_no", rec.agn_bo_no);
		}
		
		//한경
		int gd_he = rx.add(resData, "gd_he", "");
		for(int i=0; i<ds.curlist5.size(); i++)
		{
			AD_BAS_3710_LCURLIST5Record rec = (AD_BAS_3710_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(gd_he, "record", "");
			
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "pubc_dt_key", rec.pubc_dt);
			rx.add(record, "pubc_seq", rec.pubc_seq);
			rx.add(record, "pubc_dt", rec.pubc_dt);

			rx.add(record, "sect", rec.sect);
			rx.add(record, "sect_nm_cd", rec.sect_nm_cd);
			rx.addCData(record, "advt_cont", rec.advt_cont);
			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));
			rx.add(record, "pubc_asse_cd", rec.pubc_asse_cd); 
			rx.add(record, "indt_clsf", rec.indt_clsf);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "slcrg_nm", rec.slcrg_nm);
			rx.add(record, "agn_bo_no", rec.agn_bo_no);
		}
		
		//조선합계
		int gd_cs_tot = rx.add(resData, "gd_cs_tot", "");
		for(int i=0; i<ds.curlist1_tot.size(); i++)
		{
			AD_BAS_3710_LCURLIST1_TOTRecord rec = (AD_BAS_3710_LCURLIST1_TOTRecord)ds.curlist1_tot.get(i);
			int record = rx.add(gd_cs_tot, "record", "");
			
			long tot_date 			= StringUtil.toLong(rec.tot_date);
			long tot_side 			= StringUtil.toLong(rec.tot_side);
			double tot_dn 			= StringUtil.toDouble(rec.tot_dn);
			long tot_advt_fee 		= StringUtil.toLong(rec.tot_advt_fee);
			long avg_daily_fee 		= StringUtil.toLong(rec.avg_daily_fee);
			long avg_side_fee 		= StringUtil.toLong(rec.avg_side_fee);
			long avg_uprc 			= StringUtil.toLong(rec.avg_uprc);
			double avg_advt_share	= StringUtil.toDouble(rec.avg_advt_share);
			
			rx.add(record, "lbl", rec.lbl);
			
			rx.add(record, "tot_date", rec.tot_date);
			rx.add(record, "tot_side", rec.tot_side);
			rx.add(record, "tot_dn", rec.tot_dn);
			rx.add(record, "tot_advt_fee", rec.tot_advt_fee);
			
			rx.add(record, "avg_daily_fee", rec.avg_daily_fee);
			rx.add(record, "avg_side_fee", rec.avg_side_fee);
			rx.add(record, "avg_uprc", rec.avg_uprc); 
			rx.add(record, "avg_advt_share", rec.avg_advt_share);
//			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
//			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));

			if(i == ds.curlist1_tot.size()-1)
			{
				AD_BAS_3710_LCURLIST1_TOTRecord pre_rec = (AD_BAS_3710_LCURLIST1_TOTRecord)ds.curlist1_tot.get(i-1);
				
				long pre_tot_date 			= StringUtil.toLong(pre_rec.tot_date);
				long pre_tot_side 			= StringUtil.toLong(pre_rec.tot_side);
				double pre_tot_dn 			= StringUtil.toDouble(pre_rec.tot_dn);
				long pre_tot_advt_fee 		= StringUtil.toLong(pre_rec.tot_advt_fee);
				long pre_avg_daily_fee 		= StringUtil.toLong(pre_rec.avg_daily_fee);
				long pre_avg_side_fee 		= StringUtil.toLong(pre_rec.avg_side_fee);
				long pre_avg_uprc 			= StringUtil.toLong(pre_rec.avg_uprc);
				double pre_avg_advt_share	= StringUtil.toDouble(pre_rec.avg_advt_share);
							
				record = rx.add(gd_cs_tot, "record", "");
				
				rx.add(record, "lbl", "증감수치");
				rx.add(record, "tot_date", 			pre_tot_date-tot_date);
				rx.add(record, "tot_side", 			pre_tot_side-tot_side);
				rx.add(record, "tot_dn",   			pre_tot_dn-tot_dn);
				rx.add(record, "tot_advt_fee", 		pre_tot_advt_fee-tot_advt_fee);
				rx.add(record, "avg_daily_fee", 	pre_avg_daily_fee-avg_daily_fee);
				rx.add(record, "avg_side_fee", 		pre_avg_side_fee-avg_side_fee);
				rx.add(record, "avg_uprc", 			pre_avg_uprc-avg_uprc);
				rx.add(record, "avg_advt_share",	DigitUtil.cutUnderPoint(pre_avg_advt_share-avg_advt_share, 1));
				
				double r_tot_date 				= tot_date == 0 ? 100 : ((double)(pre_tot_date-tot_date)/(double)tot_date) * 100;
				double r_tot_side 				= tot_side == 0 ? 100 : ((double)(pre_tot_side-tot_side)/(double)tot_side) * 100;
				double r_tot_dn 	    		= tot_dn == 0 ? 100 : ((double)(pre_tot_dn-tot_dn)/(double)tot_dn) * 100;
				double r_tot_advt_fee   		= tot_advt_fee == 0 ? 100 : ((double)(pre_tot_advt_fee-tot_advt_fee)/(double)tot_advt_fee) * 100;
				double r_avg_daily_fee  	 	= avg_daily_fee == 0 ? 100 : ((double)(pre_avg_daily_fee-avg_daily_fee)/(double)avg_daily_fee) * 100;
				double r_avg_side_fee   		= avg_side_fee == 0 ? 100 : ((double)(pre_avg_side_fee-avg_side_fee)/(double)avg_side_fee) * 100;
				double r_avg_uprc  				= avg_uprc == 0 ? 100 : ((double)(pre_avg_uprc-avg_uprc)/(double)avg_uprc) * 100;
				double r_avg_advt_share		   	= avg_advt_share == 0 ? 100 : ((double)(pre_avg_advt_share-avg_advt_share)/(double)avg_advt_share) * 100;

				record = rx.add(gd_cs_tot, "record", "");
				
				rx.add(record, "lbl", "증감비율(%)");
				rx.add(record, "tot_date", DigitUtil.cutUnderPoint(r_tot_date,0));
				rx.add(record, "tot_side", DigitUtil.cutUnderPoint(r_tot_side,0));
				rx.add(record, "tot_dn", DigitUtil.cutUnderPoint(r_tot_dn,0));
				rx.add(record, "tot_advt_fee", DigitUtil.cutUnderPoint(r_tot_advt_fee,0));
				rx.add(record, "avg_daily_fee", DigitUtil.cutUnderPoint(r_avg_daily_fee,0));
				rx.add(record, "avg_side_fee", DigitUtil.cutUnderPoint(r_avg_side_fee,0));
				rx.add(record, "avg_uprc", DigitUtil.cutUnderPoint(r_avg_uprc,0));
				rx.add(record, "avg_advt_share", DigitUtil.cutUnderPoint(r_avg_advt_share,0));					
			}
		}
		
		//중앙합계
		int gd_ja_tot = rx.add(resData, "gd_ja_tot", "");
		for(int i=0; i<ds.curlist2_tot.size(); i++)
		{
			AD_BAS_3710_LCURLIST2_TOTRecord rec = (AD_BAS_3710_LCURLIST2_TOTRecord)ds.curlist2_tot.get(i);
			int record = rx.add(gd_ja_tot, "record", "");
			
			long tot_date 			= StringUtil.toLong(rec.tot_date);
			long tot_side 			= StringUtil.toLong(rec.tot_side);
			double tot_dn 			= StringUtil.toDouble(rec.tot_dn);
			long tot_advt_fee 		= StringUtil.toLong(rec.tot_advt_fee);
			long avg_daily_fee 		= StringUtil.toLong(rec.avg_daily_fee);
			long avg_side_fee 		= StringUtil.toLong(rec.avg_side_fee);
			long avg_uprc 			= StringUtil.toLong(rec.avg_uprc);
			double avg_advt_share	= StringUtil.toDouble(rec.avg_advt_share);
			
			rx.add(record, "lbl", rec.lbl);
			
			rx.add(record, "tot_date", rec.tot_date);
			rx.add(record, "tot_side", rec.tot_side);
			rx.add(record, "tot_dn", rec.tot_dn);
			rx.add(record, "tot_advt_fee", rec.tot_advt_fee);
			
			rx.add(record, "avg_daily_fee", rec.avg_daily_fee);
			rx.add(record, "avg_side_fee", rec.avg_side_fee);
			rx.add(record, "avg_uprc", rec.avg_uprc); 
			rx.add(record, "avg_advt_share", rec.avg_advt_share);
//			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
//			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));

			if(i == ds.curlist2_tot.size()-1)
			{
				AD_BAS_3710_LCURLIST2_TOTRecord pre_rec = (AD_BAS_3710_LCURLIST2_TOTRecord)ds.curlist2_tot.get(i-1);
				
				long pre_tot_date 			= StringUtil.toLong(pre_rec.tot_date);
				long pre_tot_side 			= StringUtil.toLong(pre_rec.tot_side);
				double pre_tot_dn 			= StringUtil.toDouble(pre_rec.tot_dn);
				long pre_tot_advt_fee 		= StringUtil.toLong(pre_rec.tot_advt_fee);
				long pre_avg_daily_fee 		= StringUtil.toLong(pre_rec.avg_daily_fee);
				long pre_avg_side_fee 		= StringUtil.toLong(pre_rec.avg_side_fee);
				long pre_avg_uprc 			= StringUtil.toLong(pre_rec.avg_uprc);
				double pre_avg_advt_share	= StringUtil.toDouble(pre_rec.avg_advt_share);
							
				record = rx.add(gd_ja_tot, "record", "");
				
				rx.add(record, "lbl", "증감수치");
				rx.add(record, "tot_date", 			pre_tot_date-tot_date);
				rx.add(record, "tot_side", 			pre_tot_side-tot_side);
				rx.add(record, "tot_dn",   			pre_tot_dn-tot_dn);
				rx.add(record, "tot_advt_fee", 		pre_tot_advt_fee-tot_advt_fee);
				rx.add(record, "avg_daily_fee", 	pre_avg_daily_fee-avg_daily_fee);
				rx.add(record, "avg_side_fee", 		pre_avg_side_fee-avg_side_fee);
				rx.add(record, "avg_uprc", 			pre_avg_uprc-avg_uprc);
				rx.add(record, "avg_advt_share",	DigitUtil.cutUnderPoint(pre_avg_advt_share-avg_advt_share, 1));
				
				double r_tot_date 				= tot_date == 0 ? 100 : ((double)(pre_tot_date-tot_date)/(double)tot_date) * 100;
				double r_tot_side 				= tot_side == 0 ? 100 : ((double)(pre_tot_side-tot_side)/(double)tot_side) * 100;
				double r_tot_dn 	    		= tot_dn == 0 ? 100 : ((double)(pre_tot_dn-tot_dn)/(double)tot_dn) * 100;
				double r_tot_advt_fee   		= tot_advt_fee == 0 ? 100 : ((double)(pre_tot_advt_fee-tot_advt_fee)/(double)tot_advt_fee) * 100;
				double r_avg_daily_fee  	 	= avg_daily_fee == 0 ? 100 : ((double)(pre_avg_daily_fee-avg_daily_fee)/(double)avg_daily_fee) * 100;
				double r_avg_side_fee   		= avg_side_fee == 0 ? 100 : ((double)(pre_avg_side_fee-avg_side_fee)/(double)avg_side_fee) * 100;
				double r_avg_uprc  				= avg_uprc == 0 ? 100 : ((double)(pre_avg_uprc-avg_uprc)/(double)avg_uprc) * 100;
				double r_avg_advt_share		   	= avg_advt_share == 0 ? 100 : ((double)(pre_avg_advt_share-avg_advt_share)/(double)avg_advt_share) * 100;

				record = rx.add(gd_ja_tot, "record", "");
				
				rx.add(record, "lbl", "증감비율(%)");
				rx.add(record, "tot_date", DigitUtil.cutUnderPoint(r_tot_date,0));
				rx.add(record, "tot_side", DigitUtil.cutUnderPoint(r_tot_side,0));
				rx.add(record, "tot_dn", DigitUtil.cutUnderPoint(r_tot_dn,0));
				rx.add(record, "tot_advt_fee", DigitUtil.cutUnderPoint(r_tot_advt_fee,0));
				rx.add(record, "avg_daily_fee", DigitUtil.cutUnderPoint(r_avg_daily_fee,0));
				rx.add(record, "avg_side_fee", DigitUtil.cutUnderPoint(r_avg_side_fee,0));
				rx.add(record, "avg_uprc", DigitUtil.cutUnderPoint(r_avg_uprc,0));
				rx.add(record, "avg_advt_share", DigitUtil.cutUnderPoint(r_avg_advt_share,0));					
			}
		}
		
		//동아합계
		int gd_da_tot = rx.add(resData, "gd_da_tot", "");
		for(int i=0; i<ds.curlist3_tot.size(); i++)
		{
			AD_BAS_3710_LCURLIST3_TOTRecord rec = (AD_BAS_3710_LCURLIST3_TOTRecord)ds.curlist3_tot.get(i);
			int record = rx.add(gd_da_tot, "record", "");
			
			long tot_date 			= StringUtil.toLong(rec.tot_date);
			long tot_side 			= StringUtil.toLong(rec.tot_side);
			double tot_dn 			= StringUtil.toDouble(rec.tot_dn);
			long tot_advt_fee 		= StringUtil.toLong(rec.tot_advt_fee);
			long avg_daily_fee 		= StringUtil.toLong(rec.avg_daily_fee);
			long avg_side_fee 		= StringUtil.toLong(rec.avg_side_fee);
			long avg_uprc 			= StringUtil.toLong(rec.avg_uprc);
			double avg_advt_share	= StringUtil.toDouble(rec.avg_advt_share);
			
			rx.add(record, "lbl", rec.lbl);
			
			rx.add(record, "tot_date", rec.tot_date);
			rx.add(record, "tot_side", rec.tot_side);
			rx.add(record, "tot_dn", rec.tot_dn);
			rx.add(record, "tot_advt_fee", rec.tot_advt_fee);
			
			rx.add(record, "avg_daily_fee", rec.avg_daily_fee);
			rx.add(record, "avg_side_fee", rec.avg_side_fee);
			rx.add(record, "avg_uprc", rec.avg_uprc); 
			rx.add(record, "avg_advt_share", rec.avg_advt_share);
//			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
//			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));

			if(i == ds.curlist3_tot.size()-1)
			{
				AD_BAS_3710_LCURLIST3_TOTRecord pre_rec = (AD_BAS_3710_LCURLIST3_TOTRecord)ds.curlist3_tot.get(i-1);
				
				long pre_tot_date 			= StringUtil.toLong(pre_rec.tot_date);
				long pre_tot_side 			= StringUtil.toLong(pre_rec.tot_side);
				double pre_tot_dn 			= StringUtil.toDouble(pre_rec.tot_dn);
				long pre_tot_advt_fee 		= StringUtil.toLong(pre_rec.tot_advt_fee);
				long pre_avg_daily_fee 		= StringUtil.toLong(pre_rec.avg_daily_fee);
				long pre_avg_side_fee 		= StringUtil.toLong(pre_rec.avg_side_fee);
				long pre_avg_uprc 			= StringUtil.toLong(pre_rec.avg_uprc);
				double pre_avg_advt_share	= StringUtil.toDouble(pre_rec.avg_advt_share);
							
				record = rx.add(gd_da_tot, "record", "");
				
				rx.add(record, "lbl", "증감수치");
				rx.add(record, "tot_date", 			pre_tot_date-tot_date);
				rx.add(record, "tot_side", 			pre_tot_side-tot_side);
				rx.add(record, "tot_dn",   			pre_tot_dn-tot_dn);
				rx.add(record, "tot_advt_fee", 		pre_tot_advt_fee-tot_advt_fee);
				rx.add(record, "avg_daily_fee", 	pre_avg_daily_fee-avg_daily_fee);
				rx.add(record, "avg_side_fee", 		pre_avg_side_fee-avg_side_fee);
				rx.add(record, "avg_uprc", 			pre_avg_uprc-avg_uprc);
				rx.add(record, "avg_advt_share",	DigitUtil.cutUnderPoint(pre_avg_advt_share-avg_advt_share, 1));
				
				double r_tot_date 				= tot_date == 0 ? 100 : ((double)(pre_tot_date-tot_date)/(double)tot_date) * 100;
				double r_tot_side 				= tot_side == 0 ? 100 : ((double)(pre_tot_side-tot_side)/(double)tot_side) * 100;
				double r_tot_dn 	    		= tot_dn == 0 ? 100 : ((double)(pre_tot_dn-tot_dn)/(double)tot_dn) * 100;
				double r_tot_advt_fee   		= tot_advt_fee == 0 ? 100 : ((double)(pre_tot_advt_fee-tot_advt_fee)/(double)tot_advt_fee) * 100;
				double r_avg_daily_fee  	 	= avg_daily_fee == 0 ? 100 : ((double)(pre_avg_daily_fee-avg_daily_fee)/(double)avg_daily_fee) * 100;
				double r_avg_side_fee   		= avg_side_fee == 0 ? 100 : ((double)(pre_avg_side_fee-avg_side_fee)/(double)avg_side_fee) * 100;
				double r_avg_uprc  				= avg_uprc == 0 ? 100 : ((double)(pre_avg_uprc-avg_uprc)/(double)avg_uprc) * 100;
				double r_avg_advt_share		   	= avg_advt_share == 0 ? 100 : ((double)(pre_avg_advt_share-avg_advt_share)/(double)avg_advt_share) * 100;

				record = rx.add(gd_da_tot, "record", "");
				
				rx.add(record, "lbl", "증감비율(%)");
				rx.add(record, "tot_date", DigitUtil.cutUnderPoint(r_tot_date,0));
				rx.add(record, "tot_side", DigitUtil.cutUnderPoint(r_tot_side,0));
				rx.add(record, "tot_dn", DigitUtil.cutUnderPoint(r_tot_dn,0));
				rx.add(record, "tot_advt_fee", DigitUtil.cutUnderPoint(r_tot_advt_fee,0));
				rx.add(record, "avg_daily_fee", DigitUtil.cutUnderPoint(r_avg_daily_fee,0));
				rx.add(record, "avg_side_fee", DigitUtil.cutUnderPoint(r_avg_side_fee,0));
				rx.add(record, "avg_uprc", DigitUtil.cutUnderPoint(r_avg_uprc,0));
				rx.add(record, "avg_advt_share", DigitUtil.cutUnderPoint(r_avg_advt_share,0));					
			}
		}
		
		//매경합계
		int gd_me_tot = rx.add(resData, "gd_me_tot", "");
		for(int i=0; i<ds.curlist4_tot.size(); i++)
		{
			AD_BAS_3710_LCURLIST4_TOTRecord rec = (AD_BAS_3710_LCURLIST4_TOTRecord)ds.curlist4_tot.get(i);
			int record = rx.add(gd_me_tot, "record", "");
			
			long tot_date 			= StringUtil.toLong(rec.tot_date);
			long tot_side 			= StringUtil.toLong(rec.tot_side);
			double tot_dn 			= StringUtil.toDouble(rec.tot_dn);
			long tot_advt_fee 		= StringUtil.toLong(rec.tot_advt_fee);
			long avg_daily_fee 		= StringUtil.toLong(rec.avg_daily_fee);
			long avg_side_fee 		= StringUtil.toLong(rec.avg_side_fee);
			long avg_uprc 			= StringUtil.toLong(rec.avg_uprc);
			double avg_advt_share	= StringUtil.toDouble(rec.avg_advt_share);
			
			rx.add(record, "lbl", rec.lbl);
			
			rx.add(record, "tot_date", rec.tot_date);
			rx.add(record, "tot_side", rec.tot_side);
			rx.add(record, "tot_dn", rec.tot_dn);
			rx.add(record, "tot_advt_fee", rec.tot_advt_fee);
			
			rx.add(record, "avg_daily_fee", rec.avg_daily_fee);
			rx.add(record, "avg_side_fee", rec.avg_side_fee);
			rx.add(record, "avg_uprc", rec.avg_uprc); 
			rx.add(record, "avg_advt_share", rec.avg_advt_share);
//			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
//			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));

			if(i == ds.curlist4_tot.size()-1)
			{
				AD_BAS_3710_LCURLIST4_TOTRecord pre_rec = (AD_BAS_3710_LCURLIST4_TOTRecord)ds.curlist4_tot.get(i-1);
				
				long pre_tot_date 			= StringUtil.toLong(pre_rec.tot_date);
				long pre_tot_side 			= StringUtil.toLong(pre_rec.tot_side);
				double pre_tot_dn 			= StringUtil.toDouble(pre_rec.tot_dn);
				long pre_tot_advt_fee 		= StringUtil.toLong(pre_rec.tot_advt_fee);
				long pre_avg_daily_fee 		= StringUtil.toLong(pre_rec.avg_daily_fee);
				long pre_avg_side_fee 		= StringUtil.toLong(pre_rec.avg_side_fee);
				long pre_avg_uprc 			= StringUtil.toLong(pre_rec.avg_uprc);
				double pre_avg_advt_share	= StringUtil.toDouble(pre_rec.avg_advt_share);
							
				record = rx.add(gd_me_tot, "record", "");
				
				rx.add(record, "lbl", "증감수치");
				rx.add(record, "tot_date", 			pre_tot_date-tot_date);
				rx.add(record, "tot_side", 			pre_tot_side-tot_side);
				rx.add(record, "tot_dn",   			pre_tot_dn-tot_dn);
				rx.add(record, "tot_advt_fee", 		pre_tot_advt_fee-tot_advt_fee);
				rx.add(record, "avg_daily_fee", 	pre_avg_daily_fee-avg_daily_fee);
				rx.add(record, "avg_side_fee", 		pre_avg_side_fee-avg_side_fee);
				rx.add(record, "avg_uprc", 			pre_avg_uprc-avg_uprc);
				rx.add(record, "avg_advt_share",	DigitUtil.cutUnderPoint(pre_avg_advt_share-avg_advt_share, 1));
				
				double r_tot_date 				= tot_date == 0 ? 100 : ((double)(pre_tot_date-tot_date)/(double)tot_date) * 100;
				double r_tot_side 				= tot_side == 0 ? 100 : ((double)(pre_tot_side-tot_side)/(double)tot_side) * 100;
				double r_tot_dn 	    		= tot_dn == 0 ? 100 : ((double)(pre_tot_dn-tot_dn)/(double)tot_dn) * 100;
				double r_tot_advt_fee   		= tot_advt_fee == 0 ? 100 : ((double)(pre_tot_advt_fee-tot_advt_fee)/(double)tot_advt_fee) * 100;
				double r_avg_daily_fee  	 	= avg_daily_fee == 0 ? 100 : ((double)(pre_avg_daily_fee-avg_daily_fee)/(double)avg_daily_fee) * 100;
				double r_avg_side_fee   		= avg_side_fee == 0 ? 100 : ((double)(pre_avg_side_fee-avg_side_fee)/(double)avg_side_fee) * 100;
				double r_avg_uprc  				= avg_uprc == 0 ? 100 : ((double)(pre_avg_uprc-avg_uprc)/(double)avg_uprc) * 100;
				double r_avg_advt_share		   	= avg_advt_share == 0 ? 100 : ((double)(pre_avg_advt_share-avg_advt_share)/(double)avg_advt_share) * 100;

				record = rx.add(gd_me_tot, "record", "");
				
				rx.add(record, "lbl", "증감비율(%)");
				rx.add(record, "tot_date", DigitUtil.cutUnderPoint(r_tot_date,0));
				rx.add(record, "tot_side", DigitUtil.cutUnderPoint(r_tot_side,0));
				rx.add(record, "tot_dn", DigitUtil.cutUnderPoint(r_tot_dn,0));
				rx.add(record, "tot_advt_fee", DigitUtil.cutUnderPoint(r_tot_advt_fee,0));
				rx.add(record, "avg_daily_fee", DigitUtil.cutUnderPoint(r_avg_daily_fee,0));
				rx.add(record, "avg_side_fee", DigitUtil.cutUnderPoint(r_avg_side_fee,0));
				rx.add(record, "avg_uprc", DigitUtil.cutUnderPoint(r_avg_uprc,0));
				rx.add(record, "avg_advt_share", DigitUtil.cutUnderPoint(r_avg_advt_share,0));					
			}
		}		
		
		//한경합계
		int gd_he_tot = rx.add(resData, "gd_he_tot", "");
		for(int i=0; i<ds.curlist5_tot.size(); i++)
		{
			AD_BAS_3710_LCURLIST5_TOTRecord rec = (AD_BAS_3710_LCURLIST5_TOTRecord)ds.curlist5_tot.get(i);
			int record = rx.add(gd_he_tot, "record", "");
			
			long tot_date 			= StringUtil.toLong(rec.tot_date);
			long tot_side 			= StringUtil.toLong(rec.tot_side);
			double tot_dn 			= StringUtil.toDouble(rec.tot_dn);
			long tot_advt_fee 		= StringUtil.toLong(rec.tot_advt_fee);
			long avg_daily_fee 		= StringUtil.toLong(rec.avg_daily_fee);
			long avg_side_fee 		= StringUtil.toLong(rec.avg_side_fee);
			long avg_uprc 			= StringUtil.toLong(rec.avg_uprc);
			double avg_advt_share	= StringUtil.toDouble(rec.avg_advt_share);
			
			rx.add(record, "lbl", rec.lbl);
			
			rx.add(record, "tot_date", rec.tot_date);
			rx.add(record, "tot_side", rec.tot_side);
			rx.add(record, "tot_dn", rec.tot_dn);
			rx.add(record, "tot_advt_fee", rec.tot_advt_fee);
			
			rx.add(record, "avg_daily_fee", rec.avg_daily_fee);
			rx.add(record, "avg_side_fee", rec.avg_side_fee);
			rx.add(record, "avg_uprc", rec.avg_uprc); 
			rx.add(record, "avg_advt_share", rec.avg_advt_share);
//			rx.add(record, "dn", DigitUtil.cutUnderPoint(rec.dn,1));
//			rx.add(record, "cm", DigitUtil.cutUnderPoint(rec.cm,1));

			if(i == ds.curlist5_tot.size()-1)
			{
				AD_BAS_3710_LCURLIST5_TOTRecord pre_rec = (AD_BAS_3710_LCURLIST5_TOTRecord)ds.curlist5_tot.get(i-1);
				
				long pre_tot_date 			= StringUtil.toLong(pre_rec.tot_date);
				long pre_tot_side 			= StringUtil.toLong(pre_rec.tot_side);
				double pre_tot_dn 			= StringUtil.toDouble(pre_rec.tot_dn);
				long pre_tot_advt_fee 		= StringUtil.toLong(pre_rec.tot_advt_fee);
				long pre_avg_daily_fee 		= StringUtil.toLong(pre_rec.avg_daily_fee);
				long pre_avg_side_fee 		= StringUtil.toLong(pre_rec.avg_side_fee);
				long pre_avg_uprc 			= StringUtil.toLong(pre_rec.avg_uprc);
				double pre_avg_advt_share	= StringUtil.toDouble(pre_rec.avg_advt_share);
							
				record = rx.add(gd_he_tot, "record", "");
				
				rx.add(record, "lbl", "증감수치");
				rx.add(record, "tot_date", 			pre_tot_date-tot_date);
				rx.add(record, "tot_side", 			pre_tot_side-tot_side);
				rx.add(record, "tot_dn",   			pre_tot_dn-tot_dn);
				rx.add(record, "tot_advt_fee", 		pre_tot_advt_fee-tot_advt_fee);
				rx.add(record, "avg_daily_fee", 	pre_avg_daily_fee-avg_daily_fee);
				rx.add(record, "avg_side_fee", 		pre_avg_side_fee-avg_side_fee);
				rx.add(record, "avg_uprc", 			pre_avg_uprc-avg_uprc);
				rx.add(record, "avg_advt_share",	DigitUtil.cutUnderPoint(pre_avg_advt_share-avg_advt_share, 1));
				
				double r_tot_date 				= tot_date == 0 ? 100 : ((double)(pre_tot_date-tot_date)/(double)tot_date) * 100;
				double r_tot_side 				= tot_side == 0 ? 100 : ((double)(pre_tot_side-tot_side)/(double)tot_side) * 100;
				double r_tot_dn 	    		= tot_dn == 0 ? 100 : ((double)(pre_tot_dn-tot_dn)/(double)tot_dn) * 100;
				double r_tot_advt_fee   		= tot_advt_fee == 0 ? 100 : ((double)(pre_tot_advt_fee-tot_advt_fee)/(double)tot_advt_fee) * 100;
				double r_avg_daily_fee  	 	= avg_daily_fee == 0 ? 100 : ((double)(pre_avg_daily_fee-avg_daily_fee)/(double)avg_daily_fee) * 100;
				double r_avg_side_fee   		= avg_side_fee == 0 ? 100 : ((double)(pre_avg_side_fee-avg_side_fee)/(double)avg_side_fee) * 100;
				double r_avg_uprc  				= avg_uprc == 0 ? 100 : ((double)(pre_avg_uprc-avg_uprc)/(double)avg_uprc) * 100;
				double r_avg_advt_share		   	= avg_advt_share == 0 ? 100 : ((double)(pre_avg_advt_share-avg_advt_share)/(double)avg_advt_share) * 100;

				record = rx.add(gd_he_tot, "record", "");
				
				rx.add(record, "lbl", "증감비율(%)");
				rx.add(record, "tot_date", DigitUtil.cutUnderPoint(r_tot_date,0));
				rx.add(record, "tot_side", DigitUtil.cutUnderPoint(r_tot_side,0));
				rx.add(record, "tot_dn", DigitUtil.cutUnderPoint(r_tot_dn,0));
				rx.add(record, "tot_advt_fee", DigitUtil.cutUnderPoint(r_tot_advt_fee,0));
				rx.add(record, "avg_daily_fee", DigitUtil.cutUnderPoint(r_avg_daily_fee,0));
				rx.add(record, "avg_side_fee", DigitUtil.cutUnderPoint(r_avg_side_fee,0));
				rx.add(record, "avg_uprc", DigitUtil.cutUnderPoint(r_avg_uprc,0));
				rx.add(record, "avg_advt_share", DigitUtil.cutUnderPoint(r_avg_advt_share,0));					
			}
		}			
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
