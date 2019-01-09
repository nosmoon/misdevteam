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
	FC_ACCT_6001_LDataSet ds = (FC_ACCT_6001_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_6001_LCURLISTRecord rec = (FC_ACCT_6001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "erplace_cd", rec.erplace_cd);
			rx.add(record, "ernm", rec.ernm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "erplace_addr", rec.erplace_addr);
			rx.add(record, "erplace_bizcond", rec.erplace_bizcond);
			rx.add(record, "erplace_item", rec.erplace_item);
			rx.add(record, "taxoff", rec.taxoff);
			rx.add(record, "corp_reg_no", rec.corp_reg_no);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "use_yn", rec.use_yn);
			rx.add(record, "ernm_tax", rec.ernm_tax);
			rx.add(record, "erplace_cd_tax", rec.erplace_cd_tax);
			//rx.add(record, "erplace_cd", StringUtil.replaceToXml(rec.erplace_cd));
			//rx.add(record, "ernm", StringUtil.replaceToXml(rec.ernm));
			//rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			//rx.add(record, "presi_nm", StringUtil.replaceToXml(rec.presi_nm));
			//rx.add(record, "erplace_addr", StringUtil.replaceToXml(rec.erplace_addr));
			//rx.add(record, "erplace_bizcond", StringUtil.replaceToXml(rec.erplace_bizcond));
			//rx.add(record, "erplace_item", StringUtil.replaceToXml(rec.erplace_item));
			//rx.add(record, "taxoff", StringUtil.replaceToXml(rec.taxoff));
			//rx.add(record, "corp_reg_no", StringUtil.replaceToXml(rec.corp_reg_no));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "use_yn", StringUtil.replaceToXml(rec.use_yn));
			//rx.add(record, "ernm_tax", StringUtil.replaceToXml(rec.ernm_tax));
			//rx.add(record, "erplace_cd_tax", StringUtil.replaceToXml(rec.erplace_cd_tax));
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
<fc_acct_6001_l>
	<dataSet>
		<CURLIST>
			<record>
				<erplace_cd/>
				<ernm/>
				<ern/>
				<presi_nm/>
				<erplace_addr/>
				<erplace_bizcond/>
				<erplace_item/>
				<taxoff/>
				<corp_reg_no/>
				<fac_clsf/>
				<use_yn/>
				<ernm_tax/>
				<erplace_cd_tax/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_6001_l>
*/
%>

<% /* 작성시간 : Wed Jan 27 15:50:57 KST 2010 */ %>