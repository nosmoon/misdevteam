<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_1003_MDataSet ds = (HD_SALY_1003_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		
		rx.add(dataSet, "week_hody_base_alon", ds.getWeek_hody_base_alon());  	
		rx.add(dataSet, "week_hody_cmpn_alon", ds.getWeek_hody_cmpn_alon());    
		rx.add(dataSet, "lgl_hody_alon", ds.getLgl_hody_alon());          
		rx.add(dataSet, "nissu_dd_alon", ds.getNissu_dd_alon());          
		rx.add(dataSet, "erl_prsnt_alon", ds.getErl_prsnt_alon());         
		rx.add(dataSet, "vgl_fee", ds.getVgl_fee());                
		rx.add(dataSet, "etc_duty_alon", ds.getEtc_duty_alon());          
		rx.add(dataSet, "prvmm_mstk_alon", ds.getPrvmm_mstk_alon());        
	//	rx.add(dataSet, "lang_study_splamt", ds.getLang_study_splamt());      
	//	rx.add(dataSet, "rslt_alon_saly", ds.getRslt_alon_saly());         
	//	rx.add(dataSet, "scl_exps_alon_saly", ds.getScl_exps_alon_saly());     
		rx.add(dataSet, "etc_alon_saly", ds.getEtc_alon_saly());         
		rx.add(dataSet, "bns_saly", ds.getBns_saly());               
	//	rx.add(dataSet, "rslt_alon_exst_pay", ds.getRslt_alon_exst_pay());     
	//	rx.add(dataSet, "scl_exps_alon_exst_pay", ds.getScl_exps_alon_exst_pay()); 
	//	rx.add(dataSet, "etc_alon_exst_pay", ds.getEtc_alon_exst_pay());
	//	rx.add(dataSet, "bns_exst_pay", ds.getBns_exst_pay());           
	//	rx.add(dataSet, "sply_chk_fee", ds.getSply_chk_fee());           
	//	rx.add(dataSet, "anvy_pay_fee", ds.getAnvy_pay_fee());           
		rx.add(dataSet, "hody_duty_alon", ds.getHody_duty_alon());         
	//	rx.add(dataSet, "rdr_extn_alon", ds.getRdr_extn_alon());          
	//	rx.add(dataSet, "vaca_fee", ds.getVaca_fee());               
	//	rx.add(dataSet, "park_vilt_sply_fee", ds.getPark_vilt_sply_fee());     
	//	rx.add(dataSet, "clamt_alon", ds.getClamt_alon());             
	//	rx.add(dataSet, "prz_fee", ds.getPrz_fee());     
		rx.add(dataSet, "congr_fee", ds.getCongr_fee() );   
		rx.add(dataSet, "welfare_fee", ds.getWelfare_fee() );  
		rx.add(dataSet, "adpay_amt", ds.getAdpay_amt() );               
		rx.add(dataSet, "xx_col_caption_010", ds.getXx_col_caption_010());  
		
				
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_saly_1003_m>
	<dataSet>
		<CURLIST>
			<record>
				<xx_col_hidden_010/>
				<xx_col_hidden_020/>
				<xx_col_caption_010/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_1003_m>
*/
%>

<% /* 작성시간 : Mon Apr 18 14:38:31 KST 2011 */ %>