<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1420_s.jsp
* 기능 : 지국장조회 - 지국정보탭 조회
* 작성일자 : 2009-02-06
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BOI_1420_SDataSet ds = (SE_BOI_1420_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resform = rx.add(root, "tab1form", "");

	try {
		if(ds != null){
			rx.add(resform, "bo_cd", ds.bo_cd+ds.bo_seq);
			rx.add(resform, "srt_seq", ds.srt_seq);
			rx.add(resform, "bo_nm", ds.bo_nm);
			rx.add(resform, "area_nm", ds.area_nm);
			rx.add(resform, "chrg_flnm", ds.chrg_flnm);
			rx.add(resform, "orgn_clsfnm", ds.orgn_clsfnm);
			rx.add(resform, "bo_cntr_dt", ds.bo_cntr_dt);
			rx.add(resform, "bo_expy_dt", ds.bo_expy_dt);
			rx.add(resform, "cntr_stat_clsfnm", ds.cntr_stat_clsfnm);
			rx.add(resform, "jont_debtgurt_limt_amt", ds.jont_debtgurt_limt_amt);
			rx.add(resform, "sido_nm", ds.sido_nm);
			rx.add(resform, "tel_no_1", ds.tel_no_1);
			rx.add(resform, "tel_no_2", ds.tel_no_2);
			rx.add(resform, "bo_zip", ds.bo_zip);
			rx.add(resform, "bo_addr", ds.bo_addr);
			rx.add(resform, "bo_dtls_addr", ds.bo_dtls_addr);
			rx.add(resform, "jd_zip", ds.jd_zip);
			rx.add(resform, "jd_addr", ds.jd_addr);
			rx.add(resform, "jd_dtls_addr", ds.jd_dtls_addr);
			rx.add(resform, "bo_jurs_nwsp_zip", ds.bo_jurs_nwsp_zip);
			rx.add(resform, "bo_jurs_nwsp_addr", ds.bo_jurs_nwsp_addr);
			rx.add(resform, "bo_feat_clsf", ds.bo_feat_clsf);
			rx.add(resform, "bo_mang_grad_clas", ds.bo_mang_grad_clas);
			rx.add(resform, "stmt_crte_clsf", ds.stmt_crte_clsf);
			rx.add(resform, "jd_sell_net_clsf", ds.jd_sell_net_clsf);
			rx.add(resform, "qty_sell_net_clsf", ds.qty_sell_net_clsf);
			rx.add(resform, "dlco_no", ds.dlco_no);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<bo_cd/>
		<bo_seq/>
		<srt_seq/>
		<bo_nm/>
		<area_nm/>
		<chrg_flnm/>
		<orgn_clsfnm/>
		<bo_cntr_dt/>
		<bo_expy_dt/>
		<cntr_stat_clsfnm/>
		<jont_debtgurt_limt_amt/>
		<sido_nm/>
		<tel_no_1/>
		<tel_no_2/>
		<bo_zip/>
		<bo_addr/>
		<bo_dtls_addr/>
		<jd_zip/>
		<jd_addr/>
		<jd_dtls_addr/>
		<bo_jurs_nwsp_zip/>
		<bo_jurs_nwsp_addr/>
		<bo_feat_clsf/>
		<bo_mang_grad_clas/>
		<stmt_crte_clsf/>
		<jd_sell_net_clsf/>
		<qty_sell_net_clsf/>
		<dlco_no/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Wed Feb 04 21:26:50 KST 2009 */ %>