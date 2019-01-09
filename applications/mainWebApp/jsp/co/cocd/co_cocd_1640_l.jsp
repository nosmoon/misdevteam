<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.cocd.rec.*
	,	chosun.ciis.co.cocd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_COCD_1640_LDataSet ds = (CO_COCD_1640_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** COMMCDCUR1 BEGIN */
		recordSet = rx.add(dataSet, "COMMCDCUR1", "");

		rx.add(recordSet, "totalcnt", ds.commcdcur1.size());
		/****** COMMCDCUR1 END */

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
<co_cocd_1640_l>
	<dataSet>
		<COMMCDCUR1>
			<record>
				<pgm_id/>
				<pgm_nm/>
				<pgm_onm/>
				<pgm_typ/>
				<brd_run/>
				<tot_cnt/>
				<pgm_clf1/>
				<pgm_clf2/>
				<jenr_clf/>
				<target/>
				<delib_grd/>
				<info_grd/>
				<frgn_clf/>
				<game_clf/>
				<main_role/>
				<supp_role/>
				<director/>
				<mc_nm/>
				<award_info/>
				<prd_cntry1/>
				<prd_cntry2/>
				<prd_co_cd/>
				<prd_co_nm/>
				<prd_ym/>
				<flash_yn/>
				<emerg_yn/>
				<news_yn/>
				<pilot_yn/>
				<pgm_info/>
				<pgm_icon/>
				<regr/>
				<reg_dt/>
				<modr/>
				<mod_dt/>
				<del_yn/>
				<delr/>
				<del_dt/>
				<dvs_yn/>
				<news_group/>
				<online_service_yn/>
			</record>
		</COMMCDCUR1>
	</dataSet>
</co_cocd_1640_l>
*/
%>

<% /* 작성시간 : Tue Jan 17 11:16:06 KST 2012 */ %>