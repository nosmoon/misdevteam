<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_6032_LDataSet ds = (FC_ACCT_6032_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	//int resData = 0;
	int tempData = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	//resData = rx.add(root, "resData", "");
	tempData = rx.add(root,"tempData","");

	try {
		/****** 표지자료 */
		int gridData1 = rx.add(tempData, "gridData1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_6032_LCURLIST1Record rec = (FC_ACCT_6032_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			//rx.add(record, "nul", rec.nul);
		    rx.add(record,"data_clsf",rec.data_clsf);
		    rx.add(record,"ern",rec.ern);		    
		    rx.add(record,"firmnm",rec.firmnm);
		    rx.add(record,"presi_nm",rec.presi_nm);		    		    
		    rx.add(record,"addr",rec.addr);
		    rx.add(record,"bizcond",rec.bizcond);
		    rx.add(record,"item",rec.item);
		    rx.add(record,"deal_prd",rec.deal_prd);
		    rx.add(record,"make_dt",rec.make_dt);
			rx.add(record, "nul", rec.nul);
		}
		/****** 매출건별 */		
		int gridData2 = rx.add(tempData, "gridData2", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_6032_LCURLIST2Record rec = (FC_ACCT_6032_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(gridData2, "record", "");
			//rx.add(record, "nul", rec.nul);
		    rx.add(record,"data_clsf",StringUtil.replaceToXml(rec.data_clsf));
		    rx.add(record,"suply_pers_reg_no",StringUtil.replaceToXml(rec.suply_pers_reg_no));		    
		    rx.add(record,"seq",StringUtil.replaceToXml(rec.seq));
		    rx.add(record,"rec_suply_reg_no",StringUtil.replaceToXml(rec.rec_suply_reg_no));		    
		    rx.add(record,"firmnm",StringUtil.replaceToXml(rec.firmnm));
		    rx.add(record,"bizcond",StringUtil.replaceToXml(rec.bizcond));
		    rx.add(record,"item",StringUtil.replaceToXml(rec.item));
		    rx.add(record,"nosh",StringUtil.toLong(StringUtil.replaceToXml(rec.nosh)));		    		    
		    rx.add(record,"deal_cnt",StringUtil.replaceToXml(rec.deal_cnt));		    
		    rx.add(record,"suply_amt",StringUtil.toLong(StringUtil.replaceToXml(rec.suply_amt)));
		    rx.add(record,"vat_amt",StringUtil.toLong(StringUtil.replaceToXml(rec.vat_amt)));
		    rx.add(record,"whosal_cd",StringUtil.replaceToXml(rec.whosal_cd));
		    rx.add(record,"retail_cd",StringUtil.replaceToXml(rec.retail_cd));
		    rx.add(record,"vol_no",StringUtil.replaceToXml(rec.vol_no));
		    rx.add(record,"subm_paper",StringUtil.replaceToXml(rec.subm_paper));
			rx.add(record, "nul", StringUtil.replaceToXml(rec.nul));
		}				
		/****** 매출합계 */		
		int gridData3 = rx.add(tempData, "gridData3", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			FC_ACCT_6032_LCURLIST3Record rec = (FC_ACCT_6032_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(gridData3, "record", "");
			//rx.add(record, "nul", rec.nul);
		    rx.add(record,"data_clsf",StringUtil.replaceToXml(rec.data_clsf));
		    rx.add(record,"suply_pers_reg_no",StringUtil.replaceToXml(rec.suply_pers_reg_no));		    
		    rx.add(record,"sale_dlco_cnt1",StringUtil.replaceToXml(rec.sale_dlco_cnt1));
		    rx.add(record,"nosh1",StringUtil.replaceToXml(rec.nosh1));		    
		    rx.add(record,"suply_amt1",StringUtil.replaceToXml(rec.suply_amt1));
		    rx.add(record,"vat_amt1",StringUtil.replaceToXml(rec.vat_amt1));
		    rx.add(record,"sale_dlco_cnt2",StringUtil.replaceToXml(rec.sale_dlco_cnt2));
		    rx.add(record,"nosh2",StringUtil.replaceToXml(rec.nosh2));		    		    
		    rx.add(record,"suply_amt2",StringUtil.replaceToXml(rec.suply_amt2));		    
		    rx.add(record,"vat_amt2",StringUtil.replaceToXml(rec.vat_amt2));
		    rx.add(record,"sale_dlco_cnt3",StringUtil.replaceToXml(rec.sale_dlco_cnt3));
		    rx.add(record,"nosh3",StringUtil.replaceToXml(rec.nosh3));
		    rx.add(record,"suply_amt3",StringUtil.replaceToXml(rec.suply_amt3));
		    rx.add(record,"vat_amt3",StringUtil.replaceToXml(rec.vat_amt3));
			rx.add(record, "nul", StringUtil.replaceToXml(rec.nul));
		}				
		/****** 매입건별 */		
		int gridData4 = rx.add(tempData, "gridData4", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			FC_ACCT_6032_LCURLIST4Record rec = (FC_ACCT_6032_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(gridData4, "record", "");
			//rx.add(record, "nul", rec.nul);
		    rx.add(record,"data_clsf",StringUtil.replaceToXml(rec.data_clsf));
		    rx.add(record,"rec_suply_reg_no",StringUtil.replaceToXml(rec.rec_suply_reg_no));		    
		    rx.add(record,"seq",StringUtil.replaceToXml(rec.seq));
		    rx.add(record,"suply_pers_reg_no",StringUtil.replaceToXml(rec.suply_pers_reg_no));		    
		    rx.add(record,"firmnm",StringUtil.replaceToXml(rec.firmnm));
		    rx.add(record,"bizcond",StringUtil.replaceToXml(rec.bizcond));
		    rx.add(record,"item",StringUtil.replaceToXml(rec.item));
		    rx.add(record,"nosh",StringUtil.replaceToXml(rec.nosh));		    		    
		    rx.add(record,"nul_cnt",StringUtil.replaceToXml(rec.nul_cnt));		    
		    rx.add(record,"suply_amt",StringUtil.replaceToXml(rec.suply_amt));
		    rx.add(record,"vat_amt",StringUtil.replaceToXml(rec.vat_amt));
		    rx.add(record,"whosal_cd",StringUtil.replaceToXml(rec.whosal_cd));
		    rx.add(record,"retail_cd",StringUtil.replaceToXml(rec.retail_cd));
		    rx.add(record,"vol_no",StringUtil.replaceToXml(rec.vol_no));
		    rx.add(record,"subm_paper",StringUtil.replaceToXml(rec.subm_paper));		    
			rx.add(record, "nul", StringUtil.replaceToXml(rec.nul));
		}		
		/****** 매입합계 */		
		int gridData5 = rx.add(tempData, "gridData5", "");
		for(int i = 0; i < ds.curlist5.size(); i++) {
			FC_ACCT_6032_LCURLIST5Record rec = (FC_ACCT_6032_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(gridData5, "record", "");
			//rx.add(record, "nul", rec.nul);
		    rx.add(record,"data_clsf",StringUtil.replaceToXml(rec.data_clsf));
		    rx.add(record,"rec_suply_reg_no",StringUtil.replaceToXml(rec.rec_suply_reg_no));		    
		    rx.add(record,"sale_dlco_cnt1",StringUtil.replaceToXml(rec.sale_dlco_cnt1));
		    rx.add(record,"nosh1",StringUtil.replaceToXml(rec.nosh1));		    
		    rx.add(record,"suply_amt1",StringUtil.replaceToXml(rec.suply_amt1));
		    rx.add(record,"vat_amt1",StringUtil.replaceToXml(rec.vat_amt1));
		    rx.add(record,"sale_dlco_cnt2",StringUtil.replaceToXml(rec.sale_dlco_cnt2));
		    rx.add(record,"nosh2",StringUtil.replaceToXml(rec.nosh2));		    		    
		    rx.add(record,"suply_amt2",StringUtil.replaceToXml(rec.suply_amt2));		    
		    rx.add(record,"vat_amt2",StringUtil.replaceToXml(rec.vat_amt2));
		    rx.add(record,"sale_dlco_cnt3",StringUtil.replaceToXml(rec.sale_dlco_cnt3));
		    rx.add(record,"nosh3",StringUtil.replaceToXml(rec.nosh3));
		    rx.add(record,"suply_amt3",StringUtil.replaceToXml(rec.suply_amt3));
		    rx.add(record,"vat_amt3",StringUtil.replaceToXml(rec.vat_amt3));
			rx.add(record, "nul", StringUtil.replaceToXml(rec.nul));
		}
		/****** 전자매출건별 */		
		int gridData10 = rx.add(tempData, "gridData10", "");
		for(int i = 0; i < ds.curlist10.size(); i++) {
			FC_ACCT_6032_LCURLIST10Record rec = (FC_ACCT_6032_LCURLIST10Record)ds.curlist10.get(i);
			int record = rx.add(gridData10, "record", "");
			//rx.add(record, "nul", rec.nul);
		    rx.add(record,"data_clsf",StringUtil.replaceToXml(rec.data_clsf));
		    rx.add(record,"tax_clsf",StringUtil.replaceToXml(rec.tax_clsf));		    
		    rx.add(record,"ern",StringUtil.replaceToXml(rec.ern));
		    rx.add(record,"ern_nm",StringUtil.replaceToXml(rec.ern_nm));		    
		    rx.add(record,"cnt",StringUtil.replaceToXml(rec.cnt));
		    rx.add(record,"suply_amt",StringUtil.replaceToXml(rec.suply_amt));
		    rx.add(record,"vat_amt",StringUtil.replaceToXml(rec.vat_amt));
		    rx.add(record,"total_amt",StringUtil.replaceToXml(rec.total_amt));
		}		
		/****** 전자매출합계 */		
		int gridData11 = rx.add(tempData, "gridData11", "");
		for(int i = 0; i < ds.curlist11.size(); i++) {
			FC_ACCT_6032_LCURLIST11Record rec = (FC_ACCT_6032_LCURLIST11Record)ds.curlist11.get(i);
			int record = rx.add(gridData11, "record", "");
			//rx.add(record, "nul", rec.nul);
			rx.add(record,"lbl", "합계");			
		    rx.add(record,"data_clsf",StringUtil.replaceToXml(rec.data_clsf));
		    rx.add(record,"rec_suply_reg_no",StringUtil.replaceToXml(rec.rec_suply_reg_no));		    
		    rx.add(record,"sale_dlco_cnt1",StringUtil.replaceToXml(rec.sale_dlco_cnt1));
		    rx.add(record,"nosh1",StringUtil.replaceToXml(rec.nosh1));		    
		    rx.add(record,"suply_amt1",StringUtil.replaceToXml(rec.suply_amt1));
		    rx.add(record,"vat_amt1",StringUtil.replaceToXml(rec.vat_amt1));
		    rx.add(record,"total_amt1",StringUtil.replaceToXml(rec.total_amt1));
			rx.add(record, "nul", StringUtil.replaceToXml(rec.nul));
		}
		/****** 전자매입건별 */		
		int gridData12 = rx.add(tempData, "gridData12", "");
		for(int i = 0; i < ds.curlist12.size(); i++) {
			FC_ACCT_6032_LCURLIST12Record rec = (FC_ACCT_6032_LCURLIST12Record)ds.curlist12.get(i);
			int record = rx.add(gridData12, "record", "");
			//rx.add(record, "nul", rec.nul);
		    rx.add(record,"data_clsf",StringUtil.replaceToXml(rec.data_clsf));
		    rx.add(record,"tax_clsf",StringUtil.replaceToXml(rec.tax_clsf));		    
		    rx.add(record,"ern",StringUtil.replaceToXml(rec.ern));
		    rx.add(record,"ern_nm",StringUtil.replaceToXml(rec.ern_nm));		    
		    rx.add(record,"cnt",StringUtil.replaceToXml(rec.cnt));
		    rx.add(record,"suply_amt",StringUtil.replaceToXml(rec.suply_amt));
		    rx.add(record,"vat_amt",StringUtil.replaceToXml(rec.vat_amt));
		    rx.add(record,"total_amt",StringUtil.replaceToXml(rec.total_amt));
		}				
		/****** 전자매입합계 */		
		int gridData13 = rx.add(tempData, "gridData13", "");
		for(int i = 0; i < ds.curlist13.size(); i++) {
			FC_ACCT_6032_LCURLIST13Record rec = (FC_ACCT_6032_LCURLIST13Record)ds.curlist13.get(i);
			int record = rx.add(gridData5, "record", "");
			//rx.add(record, "nul", rec.nul);
			rx.add(record,"lbl", "합계");
		    rx.add(record,"data_clsf",StringUtil.replaceToXml(rec.data_clsf));
		    rx.add(record,"rec_suply_reg_no",StringUtil.replaceToXml(rec.rec_suply_reg_no));		    
		    rx.add(record,"sale_dlco_cnt1",StringUtil.replaceToXml(rec.sale_dlco_cnt1));
		    rx.add(record,"nosh1",StringUtil.replaceToXml(rec.nosh1));		    
		    rx.add(record,"suply_amt1",StringUtil.replaceToXml(rec.suply_amt1));
		    rx.add(record,"vat_amt1",StringUtil.replaceToXml(rec.vat_amt1));
		    rx.add(record,"total_amt1",StringUtil.replaceToXml(rec.total_amt1)); 
			rx.add(record, "nul", StringUtil.replaceToXml(rec.nul));
		}				

		int list2  = ds.curlist2.size();
		int list3  = ds.curlist3.size();
		int list4  = ds.curlist4.size();
		int list5  = ds.curlist5.size();
		int list11 = ds.curlist11.size();
		int list13 = ds.curlist13.size();				
		//nul 세팅 
		int fc_acct_6032_l = rx.add(tempData,"fc_acct_6032_l","");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			if(ds.curlist1.size() != 0){
				FC_ACCT_6032_LCURLIST1Record rec = (FC_ACCT_6032_LCURLIST1Record)ds.curlist1.get(i);
				int record = rx.add(fc_acct_6032_l, "record", "");
				rx.add(record, "nul", StringUtil.replaceToXml(rec.nul));
			}
		}
		for(int i = 0; i < ds.curlist2.size(); i++) {
			if(ds.curlist2.size() > 0){		
				FC_ACCT_6032_LCURLIST2Record rec = (FC_ACCT_6032_LCURLIST2Record)ds.curlist2.get(i);
				int record = rx.add(fc_acct_6032_l, "record", "");
				rx.add(record, "nul", StringUtil.replaceToXml(rec.nul));
			}
		}
		for(int i = 0; i < ds.curlist3.size(); i++) {
			if(ds.curlist3.size() != 0){
				FC_ACCT_6032_LCURLIST3Record rec = (FC_ACCT_6032_LCURLIST3Record)ds.curlist3.get(i);
				int record = rx.add(fc_acct_6032_l, "record", "");
				rx.add(record, "nul", StringUtil.replaceToXml(rec.nul));
			}	
		}	
		for(int i = 0; i < ds.curlist4.size(); i++) {
			if(ds.curlist4.size() > 0){
				FC_ACCT_6032_LCURLIST4Record rec = (FC_ACCT_6032_LCURLIST4Record)ds.curlist4.get(i);
				int record = rx.add(fc_acct_6032_l, "record", "");
				rx.add(record, "nul", StringUtil.replaceToXml(rec.nul));
			}	
		}
		for(int i = 0; i < ds.curlist5.size(); i++) {
			if(ds.curlist5.size() != 0 ){
				FC_ACCT_6032_LCURLIST5Record rec = (FC_ACCT_6032_LCURLIST5Record)ds.curlist5.get(i);
				int record = rx.add(fc_acct_6032_l, "record", "");
				rx.add(record, "nul", StringUtil.replaceToXml(rec.nul));
			}				
		}	
		for(int i = 0; i < ds.curlist11.size(); i++) {
			if(ds.curlist11.size() != 0 ){
				FC_ACCT_6032_LCURLIST11Record rec = (FC_ACCT_6032_LCURLIST11Record)ds.curlist11.get(i);
				int record = rx.add(fc_acct_6032_l, "record", "");
				rx.add(record, "nul", StringUtil.replaceToXml(rec.nul));
			}				
		}	
		for(int i = 0; i < ds.curlist13.size(); i++) {
			if(ds.curlist13.size() != 0 ){
				FC_ACCT_6032_LCURLIST13Record rec = (FC_ACCT_6032_LCURLIST13Record)ds.curlist13.get(i);
				int record = rx.add(fc_acct_6032_l, "record", "");
				rx.add(record, "nul", StringUtil.replaceToXml(rec.nul));
			}				
		}					
		rx.add(fc_acct_6032_l, "totalcnt", ds.curlist1.size() + list2 + list3 + list4 + list5 + list11 + list13);											
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(tempData, "errcode", errcode);
		rx.add(tempData, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
<% /* 작성시간 : Mon Apr 27 10:39:44 KST 2009 */ %>