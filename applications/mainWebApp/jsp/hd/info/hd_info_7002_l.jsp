<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_7002_LDataSet ds = (HD_INFO_7002_LDataSet)request.getAttribute("ds");
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
			HD_INFO_7002_LCURLISTRecord rec = (HD_INFO_7002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "frlc_no", rec.frlc_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "addr", rec.addr);
			rx.add(record, "chrg_posk_cd", rec.chrg_posk_cd);
			rx.add(record, "thrw_pgm", rec.thrw_pgm);
			rx.add(record, "pay_cycl", rec.pay_cycl);
			rx.add(record, "servcost", rec.servcost);
			rx.add(record, "serv_pay_cond", rec.serv_pay_cond);
			rx.add(record, "fst_cntr_dt", rec.fst_cntr_dt);
			rx.add(record, "last_cntr_dt", rec.last_cntr_dt);
			rx.add(record, "cntr_expr_dt", rec.cntr_expr_dt);
			rx.add(record, "draft_no", rec.draft_no);
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "mang_no", rec.mang_no);
			rx.add(record, "medi_cd2", rec.medi_cd2);
			rx.add(record, "thrw_pgm2", rec.thrw_pgm2);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "frlc_no", StringUtil.replaceToXml(rec.frlc_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "prn", StringUtil.replaceToXml(rec.prn));
			//rx.add(record, "tel_no", StringUtil.replaceToXml(rec.tel_no));
			//rx.add(record, "addr", StringUtil.replaceToXml(rec.addr));
			//rx.add(record, "chrg_posk_cd", StringUtil.replaceToXml(rec.chrg_posk_cd));
			//rx.add(record, "thrw_pgm", StringUtil.replaceToXml(rec.thrw_pgm));
			//rx.add(record, "pay_cycl", StringUtil.replaceToXml(rec.pay_cycl));
			//rx.add(record, "servcost", StringUtil.replaceToXml(rec.servcost));
			//rx.add(record, "serv_pay_cond", StringUtil.replaceToXml(rec.serv_pay_cond));
			//rx.add(record, "fst_cntr_dt", StringUtil.replaceToXml(rec.fst_cntr_dt));
			//rx.add(record, "last_cntr_dt", StringUtil.replaceToXml(rec.last_cntr_dt));
			//rx.add(record, "cntr_expr_dt", StringUtil.replaceToXml(rec.cntr_expr_dt));
			//rx.add(record, "draft_no", StringUtil.replaceToXml(rec.draft_no));
			//rx.add(record, "bank_cd", StringUtil.replaceToXml(rec.bank_cd));
			//rx.add(record, "acct_no", StringUtil.replaceToXml(rec.acct_no));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "mang_no", StringUtil.replaceToXml(rec.mang_no));
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
<hd_info_7002_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<frlc_no/>
				<flnm/>
				<prn/>
				<tel_no/>
				<addr/>
				<chrg_posk_cd/>
				<thrw_pgm/>
				<pay_cycl/>
				<servcost/>
				<serv_pay_cond/>
				<fst_cntr_dt/>
				<last_cntr_dt/>
				<cntr_expr_dt/>
				<draft_no/>
				<bank_cd/>
				<acct_no/>
				<medi_cd/>
				<mang_no/>
			</record>
		</CURLIST>
	</dataSet>
</hd_info_7002_l>
*/
%>

<% /* 작성시간 : Tue Dec 04 16:01:54 KST 2012 */ %>