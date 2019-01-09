<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_3550_LDataSet ds = (AD_PUB_3550_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		long   tot_sale_amt     = 0;
		long   only_amt     = 0;
		/****** CURLIST BEGIN */

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_3550_LCURLISTRecord rec = (AD_PUB_3550_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "exct_mm", rec.exct_mm);
			rx.add(record, "exct_amt", rec.exct_amt);
			rx.add(record, "fee", rec.fee);
			rx.add(record, "fee_dfn", rec.fee_dfn);
			rx.add(record, "easy_amt", rec.easy_amt);
			rx.add(record, "mms_amt", rec.mms_amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "mms_fee", rec.mms_fee);
			rx.add(record, "sale_fee", rec.sale_fee);
			rx.add(record, "card_fee", rec.card_fee);
			rx.add(record, "insur_fee", rec.insur_fee);
			rx.add(record, "tot_fee", rec.tot_fee);
			rx.add(record, "mod_fee", rec.mod_fee);
			rx.add(record, "total", rec.total);
			
			only_amt += StringUtil.toLong(rec.total);
			tot_sale_amt += (StringUtil.toLong(rec.tot_amt));
		}
//		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */
		int resForm = rx.add(resData, "resForm", "");
		
		rx.add(resForm, "tot_sale_amt", tot_sale_amt ); 
		rx.add(resForm, "only_amt", only_amt ); 
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
<ad_pub_3550_l>
	<dataSet>
		<CURLIST>
			<record>
				<exct_mm/>
				<exct_amt/>
				<fee/>
				<fee_dfn/>
				<easy_amt/>
				<mms_amt/>
				<tot_amt/>
				<mms_fee/>
				<sale_fee/>
				<card_fee/>
				<insur_fee/>
				<tot_fee/>
				<mod_fee/>
				<total/>
			</record>
		</CURLIST>
	</dataSet>
</ad_pub_3550_l>
*/
%>

<% /* 작성시간 : Tue Jan 24 16:42:50 KST 2017 */ %>