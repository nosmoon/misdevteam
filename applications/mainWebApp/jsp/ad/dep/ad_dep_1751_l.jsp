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
	AD_DEP_1751_LDataSet ds = (AD_DEP_1751_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "tempGridData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	long tot_01	= 0;
	long tot_02	= 0;	
	long tot_03	= 0;	
	long tot_04	= 0;	
	long tot_05	= 0;	
	long tot_06	= 0;	
	long tot_07	= 0;	
	long tot_08	= 0;	
	long tot_09	= 0;	
	long tot_10	= 0;	
	long tot_11	= 0;	
	long tot_12	= 0;
	
	double rto_01	= 0.00d;
	double rto_02	= 0.00d;
	double rto_03	= 0.00d;
	double rto_04	= 0.00d;
	double rto_05	= 0.00d;
	double rto_06	= 0.00d;
	double rto_07	= 0.00d;
	double rto_08	= 0.00d;
	double rto_09	= 0.00d;
	double rto_10	= 0.00d;
	double rto_11	= 0.00d;
	double rto_12	= 0.00d;

	//상계총액, 표지+CD 어음총액 추가
	long tot_13 = 0;
	long tot_01_1 = 0;	
	double rto_01_1 = 0.00d;
	
	String strRcpmSlipNo = "";
				
	try {  
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_1751_LCURLISTRecord rec = (AD_DEP_1751_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
					
			rx.add(record, "occr_dt"		, rec.occr_dt);
			rx.add(record, "slip_clsf"		, rec.slip_clsf);
			rx.add(record, "seq"			, rec.seq);
			rx.add(record, "subseq"			, rec.subseq);

			rx.add(record, "medi_cd"		, rec.medi_cd);
			rx.add(record, "medi_nm"		, rec.medi_nm);
			
			rx.add(record, "rcpm_slip_no"	, rec.rcpm_slip_no);
			
			rx.add(record, "rcpm_plac_clsf"	, rec.rcpm_plac_clsf);
			rx.add(record, "rcpm_plac_clsf_nm"	, rec.rcpm_plac_clsf_nm);
			rx.add(record, "dlco_no"		, rec.dlco_no);
			rx.addCData(record, "dlco_nm"		, rec.dlco_nm);
			rx.add(record, "total_amt"		, rec.total_amt);
			
			rx.add(record, "rcpm_clsf"		, rec.rcpm_clsf);
			rx.add(record, "rcpm_clsf_nm"	, rec.rcpm_clsf_nm);
			rx.add(record, "amt"			, rec.amt);
			
			rx.add(record, "advt_amt"			, rec.advt_amt);
			
			rx.add(record, "mchrg_pers"		, rec.mchrg_pers);
			rx.add(record, "mchrg_pers_nm"	, rec.mchrg_pers_nm);
			
			rx.add(record, "rcpm_acct"		, rec.rcpm_acct);
			rx.addCData(record, "rcpm_acct_nm"	, rec.rcpm_acct_nm);
			rx.add(record, "sale_aprv_no"	, rec.sale_aprv_no);
			
						
			if( !strRcpmSlipNo.equals(rec.rcpm_slip_no) )
			{
				tot_12 += StringUtil.toLong(rec.total_amt);
				strRcpmSlipNo = rec.rcpm_slip_no.toString();
				
				tot_13 += StringUtil.toLong(rec.advt_amt);
			}
			
			if( "01".equals(rec.rcpm_clsf) )
			{
				tot_01 += StringUtil.toLong(rec.amt);
				
				if( "1010".equals(rec.note_clsf_cd) || "1015".equals(rec.note_clsf_cd) )
				{
					tot_01_1 += StringUtil.toLong(rec.amt);
				}
			}
			else if( "02".equals(rec.rcpm_clsf) )
			{
				tot_02 += StringUtil.toLong(rec.amt);
			}
			else if( "03".equals(rec.rcpm_clsf) )
			{
				tot_03 += StringUtil.toLong(rec.amt);
			}
			else if( "04".equals(rec.rcpm_clsf) )
			{
				tot_04 += StringUtil.toLong(rec.amt);
			}
			else if( "05".equals(rec.rcpm_clsf) )
			{
				tot_05 += StringUtil.toLong(rec.amt);
			}
			else if( "06".equals(rec.rcpm_clsf) )
			{
				tot_06 += StringUtil.toLong(rec.amt);
			}
			else if( "07".equals(rec.rcpm_clsf) )
			{
				tot_07 += StringUtil.toLong(rec.amt);
			}
			else if( "08".equals(rec.rcpm_clsf) )
			{
				tot_08 += StringUtil.toLong(rec.amt);
			}
			else if( "09".equals(rec.rcpm_clsf) )
			{
				tot_09 += StringUtil.toLong(rec.amt);
			}
			else if( "10".equals(rec.rcpm_clsf) )
			{
				tot_10 += StringUtil.toLong(rec.amt);
			}
			else if( "11".equals(rec.rcpm_clsf) )
			{
				tot_11 += StringUtil.toLong(rec.amt);
			}
		}
		
		int totData = rx.add(resData, "totData", "");
		
		rx.add(totData, "tot_01", tot_01); 
		rx.add(totData, "tot_02", tot_02); 
		rx.add(totData, "tot_03", tot_03); 
		rx.add(totData, "tot_04", tot_04); 
		rx.add(totData, "tot_05", tot_05); 
		rx.add(totData, "tot_06", tot_06); 
		rx.add(totData, "tot_07", tot_07); 
		rx.add(totData, "tot_08", tot_08); 
		rx.add(totData, "tot_09", tot_09); 
		rx.add(totData, "tot_10", tot_10); 
		rx.add(totData, "tot_11", tot_11); 
		rx.add(totData, "tot_12", tot_12); 
		
		rx.add(totData, "tot_13", tot_13); 
		rx.add(totData, "tot_01_1", tot_01_1); 
		
		if( tot_12 != 0 )
		{
			rto_01 = (double)tot_01 / tot_12 * 100;
			rto_02 = (double)tot_02 / tot_12 * 100;
			rto_03 = (double)tot_03 / tot_12 * 100;
			rto_04 = (double)tot_04 / tot_12 * 100;
			rto_05 = (double)tot_05 / tot_12 * 100;
			rto_06 = (double)tot_06 / tot_12 * 100;
			rto_07 = (double)tot_07 / tot_12 * 100;
			rto_08 = (double)tot_08 / tot_12 * 100;
			rto_09 = (double)tot_09 / tot_12 * 100;
			rto_10 = (double)tot_10 / tot_12 * 100;
			rto_11 = (double)tot_11 / tot_12 * 100;
			rto_12 = (double)tot_12 / tot_12 * 100;
			
			System.out.println(tot_01);
			System.out.println(tot_12);
			System.out.println((double)tot_01 / tot_12);
			System.out.println(rto_01);

		}
		
		if( tot_01 != 0 )
		{
			rto_01_1 = (double)tot_01_1 / tot_01 * 100;
		}

		rx.add(totData, "rto_01", rto_01); 
		rx.add(totData, "rto_02", rto_02); 
		rx.add(totData, "rto_03", rto_03); 
		rx.add(totData, "rto_04", rto_04); 
		rx.add(totData, "rto_05", rto_05); 
		rx.add(totData, "rto_06", rto_06); 
		rx.add(totData, "rto_07", rto_07); 
		rx.add(totData, "rto_08", rto_08); 
		rx.add(totData, "rto_09", rto_09); 
		rx.add(totData, "rto_10", rto_10); 
		rx.add(totData, "rto_11", rto_11); 
		rx.add(totData, "rto_12", rto_12); 
		
		rx.add(totData, "rto_01_1", rto_01_1); 
/*		
		rx.add(totData, "rto_01", DigitUtil.cutUnderPoint(rto_01,2) ); 
		rx.add(totData, "rto_02", DigitUtil.cutUnderPoint(rto_02,2) ); 
		rx.add(totData, "rto_03", DigitUtil.cutUnderPoint(rto_03,2) ); 
		rx.add(totData, "rto_04", DigitUtil.cutUnderPoint(rto_04,2) ); 
		rx.add(totData, "rto_05", DigitUtil.cutUnderPoint(rto_05,2) ); 
		rx.add(totData, "rto_06", DigitUtil.cutUnderPoint(rto_06,2) ); 
		rx.add(totData, "rto_07", DigitUtil.cutUnderPoint(rto_07,2) ); 
		rx.add(totData, "rto_08", DigitUtil.cutUnderPoint(rto_08,2) ); 
		rx.add(totData, "rto_09", DigitUtil.cutUnderPoint(rto_09,2) ); 
		rx.add(totData, "rto_10", DigitUtil.cutUnderPoint(rto_10,2) ); 
		rx.add(totData, "rto_11", DigitUtil.cutUnderPoint(rto_11,2) ); 
		rx.add(totData, "rto_12", DigitUtil.cutUnderPoint(rto_12,2) ); 
*/		
	}
	catch (Exception e) {
		System.out.println(e);
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
