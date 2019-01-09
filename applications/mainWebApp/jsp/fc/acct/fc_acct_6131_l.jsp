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
	FC_ACCT_6131_LDataSet ds = (FC_ACCT_6131_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_6131_LCURLISTRecord rec = (FC_ACCT_6131_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "vat_decl_yymm", rec.vat_decl_yymm);
			rx.add(record, "purc_sale_clsf_cd", rec.purc_sale_clsf_cd);
			rx.add(record, "purc_sale_clsf_nm", rec.purc_sale_clsf_nm);
			rx.add(record, "decl_amt1", rec.decl_amt1);
			rx.add(record, "decl_amt2", rec.decl_amt2);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "erplace_cd", rec.erplace_cd);
			rx.add(record, "erplace_cd_nm", rec.erplace_cd_nm);
			//rx.add(record, "vat_decl_yymm", StringUtil.replaceToXml(rec.vat_decl_yymm));
			//rx.add(record, "purc_sale_clsf_cd", StringUtil.replaceToXml(rec.purc_sale_clsf_cd));
			//rx.add(record, "purc_sale_clsf_nm", StringUtil.replaceToXml(rec.purc_sale_clsf_nm));
			//rx.add(record, "decl_amt1", StringUtil.replaceToXml(rec.decl_amt1));
			//rx.add(record, "decl_amt2", StringUtil.replaceToXml(rec.decl_amt2));
			//rx.add(record, "clos_yn", StringUtil.replaceToXml(rec.clos_yn));
			//rx.add(record, "incmg_pers_ipadd", StringUtil.replaceToXml(rec.incmg_pers_ipadd));
			//rx.add(record, "incmg_pers", StringUtil.replaceToXml(rec.incmg_pers));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "erplace_cd", StringUtil.replaceToXml(rec.erplace_cd));
			//rx.add(record, "erplace_cd_nm", StringUtil.replaceToXml(rec.erplace_cd_nm));
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
<fc_acct_6131_l>
	<dataSet>
		<CURLIST>
			<record>
				<vat_decl_yymm/>
				<purc_sale_clsf_cd/>
				<purc_sale_clsf_nm/>
				<decl_amt1/>
				<decl_amt2/>
				<clos_yn/>
				<incmg_pers_ipadd/>
				<incmg_pers/>
				<incmg_dt_tm/>
				<erplace_cd/>
				<erplace_cd_nm/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_6131_l>
*/
%>

<% /* 작성시간 : Fri Apr 23 10:44:39 KST 2010 */ %>