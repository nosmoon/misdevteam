<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*
    ,   chosun.ciis.co.base.util.StringUtil;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_1201_LDataSet ds = (MT_COMMATR_1201_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_COMMATR_1201_LCURLISTRecord rec = (MT_COMMATR_1201_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_cd",  StringUtil.replaceToXml(rec.matr_cd));
			rx.add(record, "matr_nm",  StringUtil.replaceToXml(rec.matr_nm));
			rx.add(record, "unit", rec.unit);
			rx.add(record, "purc_uprc", rec.purc_uprc);
			rx.add(record, "std_modl", rec.std_modl);
			rx.add(record, "usag", rec.usag);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "ewh_budg_cd", rec.ewh_budg_cd);
			rx.add(record, "owh_budg_cd", rec.owh_budg_cd);
			rx.add(record, "dstb_rat_cd",  StringUtil.replaceToXml(rec.dstb_rat_cd));
			rx.add(record, "eps_no", rec.eps_no);
			rx.add(record, "abc_clas", rec.abc_clas);
			rx.add(record, "prt_seq", rec.prt_seq);
			rx.add(record, "daily_rept_yn", rec.daily_rept_yn);
			rx.add(record, "impt_yn", rec.impt_yn);
			rx.add(record, "wste_yn", rec.wste_yn);
			rx.add(record, "wste_dt", rec.wste_dt);
			rx.add(record, "stok_mang_yn", rec.stok_mang_yn);
			rx.add(record, "via_dept_yn", rec.via_dept_yn);
			rx.add(record, "item_req_mand_yn", rec.item_req_mand_yn);
			rx.add(record, "item_req_mt_yn", rec.item_req_mt_yn);
			rx.add(record, "matr_clas", rec.matr_clas);
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
			<unit/>
			<purc_uprc/>
			<std_modl/>
			<usag/>
			<chg_pers/>
			<ewh_budg_cd/>
			<owh_budg_cd/>
			<dstb_rat_cd/>
			<eps_no/>
			<abc_clas/>
			<prt_seq/>
			<daily_rept_yn/>
			<impt_yn/>
			<wste_yn/>
			<wste_dt/>
			<stok_mang_yn/>
			<via_dept_yn/>
			<item_req_mand_yn/>
			<item_req_mt_yn/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 20 16:38:20 KST 2009 */ %>