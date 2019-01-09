<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.tax.rec.*
	,	chosun.ciis.ad.tax.ds.*;
	"
%>

<%

	String make_dt = StringUtil.nvl(request.getParameter("make_dt"));
	String medi_cd = StringUtil.nvl(request.getParameter("medi_cd"));
	String hndl_clsf = StringUtil.nvl(request.getParameter("hndl_clsf"));
	
	RwXml rx = new RwXml();
	AD_TAX_1130_SDataSet ds = (AD_TAX_1130_SDataSet)request.getAttribute("ds");
	int root 	= RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");

	try {

		int gridData = rx.add(resData, "gridData", "");
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_TAX_1130_SCURLISTRecord rec = (AD_TAX_1130_SCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			rx.add ( record, "checked", "N" );
			rx.add ( record, "fee", rec.fee );
			rx.add ( record, "medi_nm", rec.medi_nm );
			rx.add ( record, "pubc_slip_no", rec.pubc_slip_no ); 
			rx.add ( record, "pubc_dt", rec.pubc_dt );
			rx.addCData ( record, "dlco_nm", rec.dlco_nm );
			rx.add ( record, "advt_fee", rec.advt_fee );
			rx.add ( record, "vat", rec.vat );
			rx.add ( record, "fee_rate", rec.fee_rate );
			rx.add ( record, "purc_stmt_issu_yn", rec.purc_stmt_issu_yn );
		}	
			
		int resForm = rx.add(resData, "resForm", "");
		rx.add( resForm , "slip_clsf_cd" , ds.slip_clsf_cd);	
		rx.add( resForm , "slip_occr_dt" , ds.slip_occr_dt);	
		rx.add( resForm , "slip_seq" , ds.slip_seq);	
		rx.add( resForm , "prof_type_cd" , ds.prof_type_cd);	
		
		
		rx.add( resForm , "make_dt" , StringUtil.nvl(ds.make_dt, make_dt));	
		rx.add( resForm , "suply_amt" , ds.suply_amt);	
		rx.add( resForm , "vat_amt" , ds.vat_amt);	
		rx.add( resForm , "tot_amt" , StringUtil.toNumber(ds.suply_amt) + StringUtil.toNumber(ds.vat_amt));	
		rx.add( resForm , "medi_cd" ,StringUtil.nvl(ds.medi_cd, medi_cd));	
		rx.add( resForm , "del_resn" ,ds.del_resn);	
		
		rx.add( resForm , "ern" , ds.ern);	
		rx.addCData( resForm , "addr" , ds.addr);
		String deal_clsf = "";
		if("3".equals(ds.deal_clsf)){
			deal_clsf	=	"법인";
		}else if("4".equals(ds.deal_clsf)){
			deal_clsf	=	"개인";
		}
		rx.add( resForm , "deal_clsf" , deal_clsf);
		rx.add( resForm , "hndl_clsf" , StringUtil.nvl(ds.hndl_clsf, hndl_clsf));
		rx.add( resForm , "dlco_no" , ds.dlco_no);
		rx.addCData( resForm , "dlco_nm" , ds.dlco_nm);
		rx.add( resForm , "presi_nm" , ds.presi_nm);	
		rx.addCData( resForm , "addr" , ds.addr);	
		rx.add( resForm , "bizcond" , ds.bizcond);	
		rx.add( resForm , "item" , ds.item);	
		rx.add( resForm , "canc_yn" , StringUtil.nvl(ds.canc_yn, "N"));	
		rx.add( resForm , "pay_clsf" ,ds.pay_clsf);
		
		rx.addCData( resForm , "email_id", ds.email_id);
		rx.add( resForm , "elec_tax_comp_cd", ds.elec_tax_comp_cd);
		rx.add( resForm , "semuro_no", ds.semuro_no);		

		rx.add( resForm , "tot_fee" ,ds.tot_fee);	
		//rx.add( resForm , "tot_fee_vat" ,StringUtil.toNumber(ds.tot_fee)/10);	
		rx.add( resForm , "tot_fee_vat" ,ds.tot_fee_vat);	
		//rx.add( resForm , "tot_fee_amt" ,StringUtil.toNumber(ds.tot_fee) + StringUtil.toNumber(ds.tot_fee)/10);	
		rx.add( resForm , "tot_fee_amt" ,StringUtil.toNumber(ds.tot_fee) + StringUtil.toNumber(ds.tot_fee_vat));	
				
		rx.add( resForm , "tot_suply_amt" ,ds.tot_suply_amt);	
		rx.add( resForm , "tot_vat_amt" ,ds.tot_vat_amt);	
		
		rx.add( resForm , "chk_cnt" , ds.chk_cnt);	  
		
		rx.add( resForm , "multiUpdateData" , "");	
		rx.add( resForm , "medi_cd" , "");	
		rx.add( resForm , "pubc_frdt" , ds.pubc_frdt);	
		rx.add( resForm , "pubc_todt" , ds.pubc_todt);	
		rx.add( resForm , "dlco_clsf_cd" , "");	
		rx.add( resForm , "chnl_clsf" , ds.chnl_clsf);			
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>