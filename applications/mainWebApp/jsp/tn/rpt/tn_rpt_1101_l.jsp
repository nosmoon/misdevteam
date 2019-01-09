<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.rpt.rec.*
	,	chosun.ciis.tn.rpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_RPT_1101_LDataSet ds = (TN_RPT_1101_LDataSet)request.getAttribute("ds");
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
			TN_RPT_1101_LCURLISTRecord rec = (TN_RPT_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "use_yn", rec.use_yn);
			rx.add(record, "bank_nm", rec.bank_nm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "bank_acct_no", rec.bank_acct_no);
			rx.add(record, "bank_gb", rec.bank_gb);
			rx.add(record, "mang_cd_3", rec.mang_cd_3);
			rx.add(record, "mang_cd_4", rec.mang_cd_4);
			rx.add(record, "mang_cd_5", rec.mang_cd_5);
			rx.add(record, "mang_cd_6", rec.mang_cd_6);
			rx.add(record, "mang_cd_7", rec.mang_cd_7);
			rx.add(record, "mang_cd_8", rec.mang_cd_8);
			rx.add(record, "mang_cd_9", rec.mang_cd_9);
			rx.add(record, "mang_cd_10", rec.mang_cd_10);
			rx.add(record, "mang_cd_11", rec.mang_cd_11);
			rx.add(record, "mang_cd_12", rec.mang_cd_12);
			rx.add(record, "tbl_nm", rec.tbl_nm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "upd_yn", rec.upd_yn);
			rx.add(record, "incmg_pers_ip", rec.incmg_pers_ip);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);			
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
<tn_rpt_1101_l>
	<dataSet>
		<CURLIST>
			<record>
				<cd/>
				<use_yn/>
				<cdnm/>
				<cd_abrv_nm/>
				<mang_cd_1/>
				<mang_cd_2/>
				<mang_cd_3/>
				<mang_cd_4/>
				<mang_cd_5/>
				<mang_cd_6/>
				<mang_cd_7/>
				<mang_cd_8/>
				<mang_cd_9/>
				<mang_cd_10/>
				<mang_cd_11/>
				<mang_cd_12/>
				<tbl_nm/>
				<remk/>
				<upd_yn/>
				<incmg_pers_ip/>
				<incmg_pers/>
				<incmg_dt_tm/>
				<chg_pers/>
				<chg_dt_tm/>
			</record>
		</CURLIST>
	</dataSet>
</tn_rpt_1101_l>
*/
%>

<% /* 작성시간 : Thu Aug 18 14:39:42 KST 2016 */ %>