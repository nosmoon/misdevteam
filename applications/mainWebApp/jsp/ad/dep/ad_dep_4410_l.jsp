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
	AD_DEP_4410_LDataSet ds = (AD_DEP_4410_LDataSet)request.getAttribute("ds");
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
					
	try {  
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_4410_LCURLISTRecord rec = (AD_DEP_4410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");

			rx.add(record, "seq"			, rec.seq);
			rx.add(record, "rcpm_shet_no"	, rec.rcpm_shet_no);
			rx.add(record, "medi_nm"		, rec.medi_nm);
			rx.add(record, "mang_chrg_pers_nm"	, rec.mang_chrg_pers_nm);
			rx.add(record, "dlco_nm"		, rec.dlco_nm);
			rx.add(record, "rcpm_clsf_nm"	, rec.rcpm_clsf_nm);
			rx.add(record, "amt"			, rec.amt);
			rx.add(record, "note_no"			, rec.note_no);
			rx.add(record, "bank_nm"			, rec.bank_nm);
			rx.add(record, "note_clsf_nm"			, rec.note_clsf_nm);
			rx.add(record, "mtry_dt"			, rec.mtry_dt);
			rx.addCData(record, "issu_pers_nm"			, rec.issu_pers_nm);
			
			
			//입금구분(화면하단)
			if( "어음".equals(rec.rcpm_clsf_nm) )
			{
				tot_01 += StringUtil.toLong(rec.amt);
			}
			else if( "계좌입금".equals(rec.rcpm_clsf_nm) )
			{
				tot_02 += StringUtil.toLong(rec.amt);
			}
			else if( "현금".equals(rec.rcpm_clsf_nm) )
			{
				tot_03 += StringUtil.toLong(rec.amt);
			}
			else if( "선수금대체".equals(rec.rcpm_clsf_nm) )
			{
				tot_04 += StringUtil.toLong(rec.amt);
			}
			else if( "대행료대체".equals(rec.rcpm_clsf_nm) )
			{
				tot_05 += StringUtil.toLong(rec.amt);
			}
			else if( "예수금대체".equals(rec.rcpm_clsf_nm) )
			{
				tot_06 += StringUtil.toLong(rec.amt);
			}
			else if( "기타입금대체".equals(rec.rcpm_clsf_nm) )
			{
				tot_07 += StringUtil.toLong(rec.amt);
			}
			else if( "선수금".equals(rec.rcpm_clsf_nm) )
			{
				tot_08 += StringUtil.toLong(rec.amt);
			}
			else if( "예수금".equals(rec.rcpm_clsf_nm) )
			{
				tot_09 += StringUtil.toLong(rec.amt);
			}
			else if( "기타입금".equals(rec.rcpm_clsf_nm) )
			{
				tot_10 += StringUtil.toLong(rec.amt);
			}
			else if( "송금수수료".equals(rec.rcpm_clsf_nm) )
			{
				tot_11 += StringUtil.toLong(rec.amt);
			}	
			else if( "외상매출금".equals(rec.rcpm_clsf_nm) )
			{
				tot_12 += StringUtil.toLong(rec.amt);
			}					
		}
		
		int signData = rx.add(resData, "signData", "");
		
		rx.add(signData, "mchrg_pers", ds.mchrg_pers); 
		rx.add(signData, "part_pers", ds.part_pers); 
		rx.add(signData, "team_pers", ds.team_pers); 
			
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
		
		//System.out.println("계좌입금::"+tot_02);	
		//System.out.println("선수금대체::"+tot_04);	
		//System.out.println("외상매출금::"+tot_12);			
	}
	catch (Exception e) {
		System.out.println(e);
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
