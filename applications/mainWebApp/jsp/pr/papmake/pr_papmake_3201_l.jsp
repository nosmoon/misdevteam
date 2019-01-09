<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PAPMAKE_3201_LDataSet ds = (PR_PAPMAKE_3201_LDataSet)request.getAttribute("ds");
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
			PR_PAPMAKE_3201_LCURLISTRecord rec = (PR_PAPMAKE_3201_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "film_make_fee", rec.film_make_fee);
			rx.add(record, "pack_fee", rec.pack_fee);
			rx.add(record, "psplat_fee_2p", rec.psplat_fee_2p);
			rx.add(record, "psplat_fee_4p", rec.psplat_fee_4p);
			rx.add(record, "gnaw_fee_2p", rec.gnaw_fee_2p);
			rx.add(record, "gnaw_fee_4p", rec.gnaw_fee_4p);
			rx.add(record, "paper_uprc", rec.paper_uprc);
			rx.add(record, "paper_portage", rec.paper_portage);
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "film_make_fee", StringUtil.replaceToXml(rec.film_make_fee));
			//rx.add(record, "pack_fee", StringUtil.replaceToXml(rec.pack_fee));
			//rx.add(record, "psplat_fee_2p", StringUtil.replaceToXml(rec.psplat_fee_2p));
			//rx.add(record, "psplat_fee_4p", StringUtil.replaceToXml(rec.psplat_fee_4p));
			//rx.add(record, "gnaw_fee_2p", StringUtil.replaceToXml(rec.gnaw_fee_2p));
			//rx.add(record, "gnaw_fee_4p", StringUtil.replaceToXml(rec.gnaw_fee_4p));
			//rx.add(record, "paper_uprc", StringUtil.replaceToXml(rec.paper_uprc));
			//rx.add(record, "paper_portage", StringUtil.replaceToXml(rec.paper_portage));
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
<pr_papmake_3201_l>
	<dataSet>
		<CURLIST>
			<record>
				<fac_clsf_nm/>
				<film_make_fee/>
				<pack_fee/>
				<psplat_fee_2p/>
				<psplat_fee_4p/>
				<gnaw_fee_2p/>
				<gnaw_fee_4p/>
				<paper_uprc/>
				<paper_portage/>
			</record>
		</CURLIST>
	</dataSet>
</pr_papmake_3201_l>
*/
%>

<% /* 작성시간 : Fri May 20 10:23:58 KST 2016 */ %>