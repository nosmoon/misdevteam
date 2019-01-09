<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_1121_LDataSet ds = (FC_ACCT_1121_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_1121_LCURLISTRecord rec = (FC_ACCT_1121_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "impt_expn_clsf_cd_nm", rec.impt_expn_clsf_cd_nm);
			rx.add(record, "fund_cd", rec.fund_cd);
			rx.add(record, "fund_cdnm", rec.fund_cdnm);
			rx.add(record, "pay_cycl_cd_nm", rec.pay_cycl_cd_nm);
			rx.add(record, "pay_wkdy_nm", rec.pay_wkdy_nm);
			rx.add(record, "pay_dd_nm", rec.pay_dd_nm);
			rx.add(record, "repe_yn_nm", rec.repe_yn_nm);
			rx.add(record, "repe_cycl", rec.repe_cycl);
			rx.add(record, "repe_end_yymm", rec.repe_end_yymm);
			rx.add(record, "repe_dd", rec.repe_dd);
			rx.add(record, "use_yn_nm", rec.use_yn_nm);
			rx.add(record, "impt_expn_clsf_cd", rec.impt_expn_clsf_cd);
			rx.add(record, "pay_cycl_cd", rec.pay_cycl_cd);
			rx.add(record, "pay_wkdy", rec.pay_wkdy);
			rx.add(record, "pay_dd", rec.pay_dd);
			rx.add(record, "pay_dd2", rec.pay_dd2);
			rx.add(record, "repe_yn", rec.repe_yn);
			rx.add(record, "use_yn", rec.use_yn);
			rx.add(record, "use_yn_han", rec.use_yn_han);
			rx.add(record, "hd_bsdd_afbf_flag", rec.hd_bsdd_afbf_flag);
			//rx.add(record, "impt_expn_clsf_cd_nm", StringUtil.replaceToXml(rec.impt_expn_clsf_cd_nm));
			//rx.add(record, "fund_cd", StringUtil.replaceToXml(rec.fund_cd));
			//rx.add(record, "fund_cdnm", StringUtil.replaceToXml(rec.fund_cdnm));
			//rx.add(record, "pay_cycl_cd_nm", StringUtil.replaceToXml(rec.pay_cycl_cd_nm));
			//rx.add(record, "pay_wkdy_nm", StringUtil.replaceToXml(rec.pay_wkdy_nm));
			//rx.add(record, "pay_dd_nm", StringUtil.replaceToXml(rec.pay_dd_nm));
			//rx.add(record, "repe_yn_nm", StringUtil.replaceToXml(rec.repe_yn_nm));
			//rx.add(record, "repe_cycl", StringUtil.replaceToXml(rec.repe_cycl));
			//rx.add(record, "repe_end_yymm", StringUtil.replaceToXml(rec.repe_end_yymm));
			//rx.add(record, "repe_dd", StringUtil.replaceToXml(rec.repe_dd));
			//rx.add(record, "use_yn_nm", StringUtil.replaceToXml(rec.use_yn_nm));
			//rx.add(record, "impt_expn_clsf_cd", StringUtil.replaceToXml(rec.impt_expn_clsf_cd));
			//rx.add(record, "pay_cycl_cd", StringUtil.replaceToXml(rec.pay_cycl_cd));
			//rx.add(record, "pay_wkdy", StringUtil.replaceToXml(rec.pay_wkdy));
			//rx.add(record, "pay_dd", StringUtil.replaceToXml(rec.pay_dd));
			//rx.add(record, "pay_dd2", StringUtil.replaceToXml(rec.pay_dd2));
			//rx.add(record, "repe_yn", StringUtil.replaceToXml(rec.repe_yn));
			//rx.add(record, "use_yn", StringUtil.replaceToXml(rec.use_yn));
			//rx.add(record, "use_yn_han", StringUtil.replaceToXml(rec.use_yn_han));
			//rx.add(record, "hd_bsdd_afbf_flag", StringUtil.replaceToXml(rec.hd_bsdd_afbf_flag));
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
<fc_acct_1121_l>
	<dataSet>
		<CURLIST>
			<record>
				<impt_expn_clsf_cd_nm/>
				<fund_cd/>
				<fund_cdnm/>
				<pay_cycl_cd_nm/>
				<pay_wkdy_nm/>
				<pay_dd_nm/>
				<repe_yn_nm/>
				<repe_cycl/>
				<repe_end_yymm/>
				<repe_dd/>
				<use_yn_nm/>
				<impt_expn_clsf_cd/>
				<pay_cycl_cd/>
				<pay_wkdy/>
				<pay_dd/>
				<pay_dd2/>
				<repe_yn/>
				<use_yn/>
				<use_yn_han/>
				<hd_bsdd_afbf_flag/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_1121_l>
*/
%>

<% /* 작성시간 : Wed May 06 17:59:19 KST 2009 */ %>