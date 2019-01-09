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
	MT_COMMATR_1601_LDataSet ds = (MT_COMMATR_1601_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		if( ds.curlist.size() > 0 ) {
			MT_COMMATR_1601_LCURLISTRecord rec = (MT_COMMATR_1601_LCURLISTRecord)ds.curlist.get(0);
			rx.add(dataSet, "part_cd", rec.part_cd);
			int record = rx.add(dataSet, "resData", "");
			//
			rx.add(record, "part_cd", rec.part_cd);
			rx.addCData(record, "part_nm", rec.part_nm);
			rx.addCData(record, "part_dtl_nm", rec.part_dtl_nm);
			rx.add(record, "part_clas1", rec.part_clas1);
			rx.add(record, "part_clas2", rec.part_clas2);
			rx.addCData(record, "purc_uprc", rec.purc_uprc);
			rx.addCData(record, "std_modl", rec.std_modl);
			rx.addCData(record, "unit", rec.unit);
			rx.add(record, "prt_seq", rec.prt_seq);
			rx.addCData(record, "usag", rec.usag);
			rx.addCData(record, "purc_info", rec.purc_info);
			rx.addCData(record, "barcode", rec.barcode);
			rx.addCData(record, "maker", rec.maker);
			rx.add(record, "use_yn", rec.use_yn);
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