<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.bas.rec.*
	,	chosun.ciis.tn.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_BAS_3001_LDataSet ds = (TN_BAS_3001_LDataSet)request.getAttribute("ds");
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
			TN_BAS_3001_LCURLISTRecord rec = (TN_BAS_3001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fundidx", rec.fundidx);
			rx.add(record, "topfundidx", rec.topfundidx);
			rx.add(record, "parentfundidx", rec.parentfundidx);
			rx.add(record, "depth", rec.depth);
			rx.add(record, "fund", rec.fund);
			rx.add(record, "fundcode", rec.fundcode);
			rx.add(record, "displayorder", rec.displayorder);
			rx.add(record, "memo", rec.memo);
			rx.add(record, "supportidx", rec.supportidx);
			rx.add(record, "supportidx_nm", rec.supportidx_nm);
			rx.add(record, "personreceiptcode", rec.personreceiptcode);
			rx.add(record, "personreceiptcode_nm", rec.personreceiptcode_nm);
			rx.add(record, "companyreceiptcode", rec.companyreceiptcode);
			rx.add(record, "companyreceiptcode_nm", rec.companyreceiptcode_nm);
			rx.add(record, "useinsert", rec.useinsert);
			rx.add(record, "useinsert_nm", rec.useinsert_nm);
			//rx.add(record, "fundidx", StringUtil.replaceToXml(rec.fundidx));
			//rx.add(record, "topfundidx", StringUtil.replaceToXml(rec.topfundidx));
			//rx.add(record, "parentfundidx", StringUtil.replaceToXml(rec.parentfundidx));
			//rx.add(record, "depth", StringUtil.replaceToXml(rec.depth));
			//rx.add(record, "fund", StringUtil.replaceToXml(rec.fund));
			//rx.add(record, "fundcode", StringUtil.replaceToXml(rec.fundcode));
			//rx.add(record, "displayorder", StringUtil.replaceToXml(rec.displayorder));
			//rx.add(record, "memo", StringUtil.replaceToXml(rec.memo));
			//rx.add(record, "supportidx", StringUtil.replaceToXml(rec.supportidx));
			//rx.add(record, "supportidx_nm", StringUtil.replaceToXml(rec.supportidx_nm));
			//rx.add(record, "personreceiptcode", StringUtil.replaceToXml(rec.personreceiptcode));
			//rx.add(record, "personreceiptcode_nm", StringUtil.replaceToXml(rec.personreceiptcode_nm));
			//rx.add(record, "companyreceiptcode", StringUtil.replaceToXml(rec.companyreceiptcode));
			//rx.add(record, "companyreceiptcode_nm", StringUtil.replaceToXml(rec.companyreceiptcode_nm));
			//rx.add(record, "useinsert", StringUtil.replaceToXml(rec.useinsert));
			//rx.add(record, "useinsert_nm", StringUtil.replaceToXml(rec.useinsert_nm));
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
<tn_bas_3001_l>
	<dataSet>
		<CURLIST>
			<record>
				<fundidx/>
				<topfundidx/>
				<parentfundidx/>
				<depth/>
				<fund/>
				<fundcode/>
				<displayorder/>
				<memo/>
				<supportidx/>
				<supportidx_nm/>
				<personreceiptcode/>
				<personreceiptcode_nm/>
				<companyreceiptcode/>
				<companyreceiptcode_nm/>
				<useinsert/>
				<useinsert_nm/>
			</record>
		</CURLIST>
	</dataSet>
</tn_bas_3001_l>
*/
%>

<% /* 작성시간 : Mon Jul 25 16:55:22 KST 2016 */ %>