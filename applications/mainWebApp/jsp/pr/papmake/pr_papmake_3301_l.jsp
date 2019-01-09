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
	PR_PAPMAKE_3301_LDataSet ds = (PR_PAPMAKE_3301_LDataSet)request.getAttribute("ds");
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
			PR_PAPMAKE_3301_LCURLISTRecord rec = (PR_PAPMAKE_3301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "psplat_2p", rec.psplat_2p);
			rx.add(record, "psplat_4p", rec.psplat_4p);
			rx.add(record, "prt_fee", rec.prt_fee);
			rx.add(record, "paper_wgt", rec.paper_wgt);
			rx.add(record, "paper_amt", rec.paper_amt);
			rx.add(record, "psplat_use_amt", rec.psplat_use_amt);
			rx.add(record, "gnaw_fee", rec.gnaw_fee);
			rx.add(record, "film_make_fee", rec.film_make_fee);
			rx.add(record, "pack_fee", rec.pack_fee);
			rx.add(record, "paper_portage", rec.paper_portage);
			rx.add(record, "total", rec.total);
			rx.add(record, "remk", rec.remk);
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "psplat_2p", StringUtil.replaceToXml(rec.psplat_2p));
			//rx.add(record, "psplat_4p", StringUtil.replaceToXml(rec.psplat_4p));
			//rx.add(record, "prt_fee", StringUtil.replaceToXml(rec.prt_fee));
			//rx.add(record, "paper_wgt", StringUtil.replaceToXml(rec.paper_wgt));
			//rx.add(record, "paper_amt", StringUtil.replaceToXml(rec.paper_amt));
			//rx.add(record, "psplat_use_amt", StringUtil.replaceToXml(rec.psplat_use_amt));
			//rx.add(record, "gnaw_fee", StringUtil.replaceToXml(rec.gnaw_fee));
			//rx.add(record, "film_make_fee", StringUtil.replaceToXml(rec.film_make_fee));
			//rx.add(record, "pack_fee", StringUtil.replaceToXml(rec.pack_fee));
			//rx.add(record, "paper_portage", StringUtil.replaceToXml(rec.paper_portage));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
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
<pr_papmake_3301_l>
	<dataSet>
		<CURLIST>
			<record>
				<fac_clsf_nm/>
				<fac_clsf/>
				<psplat_2p/>
				<psplat_4p/>
				<prt_fee/>
				<paper_wgt/>
				<paper_amt/>
				<psplat_use_amt/>
				<gnaw_fee/>
				<film_make_fee/>
				<pack_fee/>
				<paper_portage/>
				<remk/>
			</record>
		</CURLIST>
	</dataSet>
</pr_papmake_3301_l>
*/
%>

<% /* 작성시간 : Mon May 23 16:49:12 KST 2016 */ %>