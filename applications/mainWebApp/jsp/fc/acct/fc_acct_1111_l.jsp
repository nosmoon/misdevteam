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
	FC_ACCT_1111_LDataSet ds = (FC_ACCT_1111_LDataSet)request.getAttribute("ds");
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
			FC_ACCT_1111_LCURLISTRecord rec = (FC_ACCT_1111_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "busn_dt", rec.busn_dt);
			rx.add(record, "wkdy_nm", rec.wkdy_nm);
			rx.add(record, "busn_dd_clsf_cd_nm", rec.busn_dd_clsf_cd_nm);
			rx.add(record, "busn_dd_clsf_cd", rec.busn_dd_clsf_cd);
			rx.add(record, "wkdy_cd", rec.wkdy_cd);
			//rx.add(record, "busn_dt", StringUtil.replaceToXml(rec.busn_dt));
			//rx.add(record, "wkdy_nm", StringUtil.replaceToXml(rec.wkdy_nm));
			//rx.add(record, "busn_dd_clsf_cd_nm", StringUtil.replaceToXml(rec.busn_dd_clsf_cd_nm));
			//rx.add(record, "busn_dd_clsf_cd", StringUtil.replaceToXml(rec.busn_dd_clsf_cd));
			//rx.add(record, "wkdy_cd", StringUtil.replaceToXml(rec.wkdy_cd));
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
<fc_acct_1111_l>
	<dataSet>
		<CURLIST>
			<record>
				<busn_dt/>
				<wkdy_nm/>
				<busn_dd_clsf_cd_nm/>
				<busn_dd_clsf_cd/>
				<wkdy_cd/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_1111_l>
*/
%>

<% /* 작성시간 : Mon Apr 06 15:24:05 KST 2009 */ %>