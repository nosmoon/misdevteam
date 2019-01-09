<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_1102_LDataSet ds = (MT_COMMATR_1102_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */

		if( ds.curlist.size() > 0 ) {
			MT_COMMATR_1102_LCURLISTRecord rec = (MT_COMMATR_1102_LCURLISTRecord)ds.curlist.get(0);
			rx.add(dataSet, "matr_cd", rec.matr_cd);
			int record = rx.add(dataSet, "resData", "");
			//
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "purc_uprc", rec.purc_uprc);
			rx.add(record, "matr_clas", rec.matr_clas);
			rx.add(record, "std_modl", rec.std_modl);
			rx.add(record, "unit", rec.unit);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "abc_clas", rec.abc_clas);
			rx.add(record, "dstb_rat_cd", rec.dstb_rat_cd);
			rx.add(record, "ewh_budg_cd", rec.ewh_budg_cd);
			rx.add(record, "ewh_budg_cd_nm", rec.ewh_budg_cd_nm);
			rx.add(record, "owh_budg_cd", rec.owh_budg_cd);
			rx.add(record, "owh_budg_cd_nm", rec.owh_budg_cd_nm);
			rx.add(record, "eps_no", rec.eps_no);
			rx.add(record, "prt_seq", rec.prt_seq);
			rx.add(record, "usag", rec.usag);
			rx.add(record, "impt_yn", rec.impt_yn);
			rx.add(record, "daily_rept_yn", rec.daily_rept_yn);
			rx.add(record, "stok_mang_yn", rec.stok_mang_yn);
			rx.add(record, "remk_use_yn", rec.remk_use_yn);
			rx.add(record, "wste_yn", rec.wste_yn);
			rx.add(record, "wste_dt", rec.wste_dt);
			rx.add(record, "vip_matr_yn", rec.vip_matr_yn);
			rx.add(record, "brws_obj_yn", rec.brws_obj_yn);
			rx.add(record, "item_req_mt_yn", rec.item_req_mt_yn);
			rx.add(record, "item_req_usag_yn", rec.item_req_usag_yn);
			rx.add(record, "via_dept_yn", rec.via_dept_yn);
			rx.add(record, "item_req_mand_yn", rec.item_req_mand_yn);
			//rx.add(record, "safe_stok", rec.safe_stok);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
<dataSet>
	<CURLIST>
		<record>
			<matr_cd/>
			<matr_nm/>
			<purc_uprc/>
			<std_modl/>
			<unit/>
			<dlco_cd/>
			<abc_clas/>
			<dstb_rat_cd/>
			<ewh_budg_cd/>
			<ewh_budg_cd_nm/>
			<owh_budg_cd/>
			<owh_budg_cd_nm/>
			<eps_no/>
			<prt_seq/>
			<usag/>
			<impt_yn/>
			<daily_rept_yn/>
			<stok_mang_yn/>
			<remk_use_yn/>
			<wste_yn/>
			<wste_dt/>
			<vip_matr_yn/>
			<brws_obj_yn/>
			<item_req_mt_yn/>
			<item_req_usag_yn/>
			<via_dept_yn/>
			<item_req_mand_yn/>
			<safe_stok/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 17 14:45:44 KST 2009 */ %>