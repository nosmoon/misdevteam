<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*
	,   chosun.ciis.co.base.util.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_2420_LDataSet ds = (AD_DEP_2420_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData2 = rx.add(root, "resData2", "");
	int gridData = rx.add(resData2, "gridData", "");

	long tot_dhon_amt   = 0; //부도금액 
	long tot_rcpm_amt   = 0; //정리금액 
	long tot_dhon_reamt = 0; //부도잔액 

	try {   
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_2420_LCURLISTRecord rec = (AD_DEP_2420_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "dhon_occr_dt"	, rec.dhon_occr_dt);	//부도일자
			rx.add(record, "dlco_nm"	 	, rec.dlco_nm);	 		//거래처명
			rx.add(record, "clamt_chrg_emp"	, rec.clamt_chrg_emp);  //관리담당
			rx.add(record, "issu_pers_nm"   , StringUtil.replaceToXml(rec.issu_pers_nm)); //발행자
			rx.add(record, "mtry_dt"		, rec.mtry_dt);         //만기일
			rx.add(record, "note_no"		, rec.note_no);			//어음번호
			rx.add(record, "dhon_amt"		, rec.dhon_amt);		//부도금액 
			rx.add(record, "rcpm_dt"		, rec.rcpm_dt);			//입금일자
			rx.add(record, "rcpay_amt"		, rec.rcpay_amt);		//입금액 
			rx.add(record, "jan_dhon_amt"	, StringUtil.toNumber(rec.dhon_amt)-StringUtil.toNumber(rec.rcpay_amt));//부도잔액 =  부도금액-입금액
			rx.add(record, "rcpm_no"		, rec.rcpm_no);			//입금표번호
			rx.add(record, "comp_dt"		, rec.comp_dt);			//수취일자
			rx.add(record, "bank_cd"		, rec.bank_cd);
			//rx.add(record, "comp_dt"		, rec.comp_dt);														
			rx.add(record, "note_seq"		, rec.note_seq);
			
			tot_dhon_amt   += StringUtil.toLong(rec.dhon_amt);
			tot_rcpm_amt   += StringUtil.toLong(rec.rcpay_amt);
			tot_dhon_reamt = tot_dhon_amt-tot_rcpm_amt ;
			
		}
			
			int resForm = rx.add(resData2, "resForm", "");
			
			rx.add(resForm, "tot_dhon_amt", tot_dhon_amt);
			rx.add(resForm, "tot_rcpm_amt", tot_rcpm_amt);
			rx.add(resForm, "tot_dhon_reamt", tot_dhon_reamt);
	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
