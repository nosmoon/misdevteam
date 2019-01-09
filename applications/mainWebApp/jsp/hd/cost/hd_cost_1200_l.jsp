<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.cost.rec.*
	,	chosun.ciis.hd.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_COST_1200_LDataSet ds = (HD_COST_1200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_COST_1200_LCURLISTRecord rec = (HD_COST_1200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "card_mang_no", rec.card_mang_no);
			rx.add(record, "carc_mang_no1", rec.carc_mang_no1);
			rx.add(record, "carc_mang_no2", rec.carc_mang_no2);
			rx.add(record, "memb_dnmn", rec.memb_dnmn);
			rx.add(record, "card_no", rec.card_no);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "use_pers_emp_no", rec.use_pers_emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "decid_dd", rec.decid_dd);
			rx.add(record, "decid_bank_cd", rec.decid_bank_cd);
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "wste_dt", rec.wste_dt);
			rx.add(record, "use_yn", rec.use_yn);
			rx.add(record, "corp_card_clsf", rec.corp_card_clsf);
			rx.add(record, "hd_card_type", rec.hd_card_type);
			rx.add(record, "hd_card_stat", rec.hd_card_stat);
			rx.add(record, "hd_mang_clsf", rec.hd_mang_clsf);
			rx.add(record, "hd_mang_dty_nm", rec.hd_mang_dty_nm);
			rx.add(record, "hd_oil_type", rec.hd_oil_type);
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
			<cmpy_cd/>
			<card_mang_no/>
			<carc_mang_no1/>
			<carc_mang_no2/>
			<memb_dnmn/>
			<card_no/>
			<dlco_cd/>
			<dlco_nm/>
			<use_pers_emp_no/>
			<nm_korn/>
			<issu_dt/>
			<mtry_dt/>
			<decid_dd/>
			<decid_bank_cd/>
			<bank_nm/>
			<wste_dt/>
			<use_yn/>
			<corp_card_clsf/>
			<hd_card_type/>
			<hd_card_stat/>
			<hd_mang_clsf/>
			<hd_mang_dty_nm/>
			<hd_oil_type/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Apr 18 09:39:23 KST 2009 */ %>