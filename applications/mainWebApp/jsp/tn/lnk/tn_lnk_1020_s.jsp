<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%	System.out.println("jsp go");
	RwXml rx = new RwXml();
	TN_LNK_1020_SDataSet ds = (TN_LNK_1020_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm = rx.add(root, "formData", "");

	try {
			rx.add(resForm,"onl_memb_idx",ds.onl_memb_idx);
            rx.add(resForm,"onl_memb_cd",ds.onl_memb_cd);
            rx.add(resForm,"onl_prms_idx",ds.onl_prms_idx);
            rx.add(resForm,"onl_prms_cd",ds.onl_prms_cd);
            rx.add(resForm,"onl_pmnt_idx",ds.onl_pmnt_idx);
            rx.add(resForm,"onl_pmnt_cd",ds.onl_pmnt_cd);
            rx.addCData(resForm,"name",ds.name);
            rx.add(resForm,"anymus",ds.anymus);
            rx.addCData(resForm,"tel_no",ds.tel_no);
            rx.addCData(resForm,"regno",ds.regno);
            rx.add(resForm,"memb_g_cd",ds.memb_g_cd);
            rx.add(resForm,"brtd_type",ds.brtd_type);
            rx.add(resForm,"brt_dt",ds.brt_dt);
            rx.add(resForm,"dept",ds.dept);
            rx.addCData(resForm,"title",ds.title);
            rx.addCData(resForm,"phone",ds.phone);
            rx.add(resForm,"post_clsf",ds.post_clsf);
            rx.add(resForm,"use_addr",ds.use_addr);
            rx.add(resForm,"addr_type",ds.addr_type);
            rx.add(resForm,"zip",ds.zip);
            rx.addCData(resForm,"addr",ds.addr);
            rx.addCData(resForm,"dtl_addr",ds.dtl_addr);
            rx.addCData(resForm,"email",ds.email);
            rx.addCData(resForm,"email2",ds.email2);
            rx.addCData(resForm,"paswd",ds.paswd);
            rx.addCData(resForm,"memb_memo",ds.memb_memo);
            rx.add(resForm,"rltn_info",ds.rltn_info);
            rx.add(resForm,"dept_idx",ds.dept_idx);
            rx.add(resForm,"prms_dt",ds.prms_dt);
            rx.add(resForm,"fnd_type",ds.fnd_type);
            rx.add(resForm,"fnd_idx",ds.fnd_idx);
            rx.add(resForm,"spprt_type",ds.spprt_type);
            rx.add(resForm,"spprt_idx",ds.spprt_idx);
            rx.add(resForm,"use_orgnl",ds.use_orgnl);
            rx.addCData(resForm,"cntor_memo",ds.cntor_memo);
            rx.addCData(resForm,"prms_memo",ds.prms_memo);
            rx.add(resForm,"prms_amt",ds.prms_amt);
            rx.add(resForm,"pmnth_cd",ds.pmnth_cd);
            rx.add(resForm,"pmnth_type",ds.pmnth_type);
            rx.add(resForm,"prtn_type",ds.prtn_type);
            rx.add(resForm,"mon_pay_day",ds.mon_pay_day);
            rx.add(resForm,"mon_pay_amt",ds.mon_pay_amt);
            rx.add(resForm,"prtn_cnt",ds.prtn_cnt);
            rx.add(resForm,"pay_frdt",ds.pay_frdt);
            rx.add(resForm,"pay_todt",ds.pay_todt);
            rx.add(resForm,"cms_bnk_cd",ds.cms_bnk_cd);
            rx.add(resForm,"cms_bnk_acnt",ds.cms_bnk_acnt);
            rx.addCData(resForm,"cms_bnk_owner",ds.cms_bnk_owner);
            rx.add(resForm,"cms_regno",ds.cms_regno);
            rx.add(resForm,"card_cmpy",ds.card_cmpy);
            rx.add(resForm,"card_num",ds.card_num);
            rx.add(resForm,"card_yymm",ds.card_yymm);
            rx.addCData(resForm,"mobl_aprv_nm",ds.mobl_aprv_nm);
            rx.add(resForm,"mobl_aprv_cmpy",ds.mobl_aprv_cmpy);
            rx.add(resForm,"mobl_aprv_num",ds.mobl_aprv_num);
            rx.add(resForm,"mobl_aprv_prn",ds.mobl_aprv_prn);
            rx.add(resForm,"trns_dt",ds.trns_dt);
            rx.add(resForm,"pay_dt",ds.pay_dt);
            rx.add(resForm,"pay_amt",ds.pay_amt);
            rx.add(resForm,"fee",ds.fee);
            rx.add(resForm,"payth_cd",ds.payth_cd);
            rx.add(resForm,"payth_type",ds.payth_type);
            rx.add(resForm,"memb_cd",ds.memb_cd);
            rx.add(resForm,"prms_cd",ds.prms_cd);
            rx.add(resForm,"pmnt_cd",ds.pmnt_cd);
            rx.add(resForm,"memb_idx",ds.memb_idx);
            rx.add(resForm,"prms_idx",ds.prms_idx);
            rx.add(resForm,"pmnt_idx",ds.pmnt_idx);	
            rx.add(resForm,"purp_memo",ds.purp_memo);
            rx.add(resForm,"pre_memb_cd",ds.pre_memb_cd);
            rx.add(resForm,"pre_prms_cd",ds.pre_prms_cd);
            rx.add(resForm,"pre_pmnt_cd",ds.pre_pmnt_cd);
            rx.add(resForm,"pre_memb_idx",ds.pre_memb_idx);
            rx.add(resForm,"pre_prms_idx",ds.pre_prms_idx);
            rx.add(resForm,"pre_pmnt_idx",ds.pre_pmnt_idx);	
//            rx.add(resForm,"update_clsf",ds.update_clsf);
            rx.add(resForm,"update_clsf","");
            rx.add(resForm,"up_memb_cd","");
            rx.add(resForm,"prms_acct_cd","");	
            rx.add(resForm,"pmnt_acct_cd","");
            
			int up_memb_clsf = rx.add( resForm , "up_memb_clsf" , "");	
			int item  = rx.add( up_memb_clsf , "item" , "");
			rx.add ( item, "value", "" ); 
			rx.add ( item, "label", ""); 
			for(int i=0; i<ds.curlist.size(); i++){
				TN_LNK_1020_SCURLISTRecord rec = (TN_LNK_1020_SCURLISTRecord)ds.curlist.get(i);
				item  = rx.add( up_memb_clsf , "item" , "");
				rx.add ( item, "value", rec.idx+rec.cd ); 
				rx.add ( item, "label", rec.cdnm); 			
			}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Thu Jul 07 16:11:11 KST 2016 */ %>