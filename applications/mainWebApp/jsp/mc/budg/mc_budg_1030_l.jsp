<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_1030_LDataSet ds = (MC_BUDG_1030_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_1030_LCURLISTRecord rec = (MC_BUDG_1030_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_cdnm", rec.budg_cdnm);
			rx.add(record, "t1_hmcd", rec.t1_hmcd);
			rx.add(record, "itm_15", rec.itm_15);
			rx.add(record, "itm_16", rec.itm_16);
			rx.add(record, "itm_17", rec.itm_17);
			rx.add(record, "itm_25", rec.itm_25);
			rx.add(record, "itm_35", rec.itm_35);
			rx.add(record, "itm_91", rec.itm_91);
			rx.add(record, "itm_92", rec.itm_92);
			rx.add(record, "itm_93", rec.itm_93);
			rx.add(record, "itm_94", rec.itm_94);
			rx.add(record, "itm_95", rec.itm_95);
			rx.add(record, "itm_96", rec.itm_96);
			rx.add(record, "flag", rec.flag);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			//rx.add(record, "t1_hmcd", StringUtil.replaceToXml(rec.t1_hmcd));
			//rx.add(record, "itm_15", StringUtil.replaceToXml(rec.itm_15));
			//rx.add(record, "itm_16", StringUtil.replaceToXml(rec.itm_16));
			//rx.add(record, "itm_17", StringUtil.replaceToXml(rec.itm_17));
			//rx.add(record, "itm_25", StringUtil.replaceToXml(rec.itm_25));
			//rx.add(record, "itm_35", StringUtil.replaceToXml(rec.itm_35));
			//rx.add(record, "itm_91", StringUtil.replaceToXml(rec.itm_91));
			//rx.add(record, "itm_92", StringUtil.replaceToXml(rec.itm_92));
			//rx.add(record, "itm_93", StringUtil.replaceToXml(rec.itm_93));
			//rx.add(record, "itm_94", StringUtil.replaceToXml(rec.itm_94));
			//rx.add(record, "itm_95", StringUtil.replaceToXml(rec.itm_95));
			//rx.add(record, "itm_96", StringUtil.replaceToXml(rec.itm_96));
			//rx.add(record, "flag", StringUtil.replaceToXml(rec.flag));
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
<mc_budg_1030_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_cd/>
				<budg_cdnm/>
				<t1_hmcd/>
				<itm_15/>
				<itm_16/>
				<itm_17/>
				<itm_25/>
				<itm_35/>
				<itm_91/>
				<itm_92/>
				<itm_93/>
				<itm_94/>
				<itm_95/>
				<itm_96/>
				<flag/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_1030_l>
*/
%>

<% /* 작성시간 : Sat Apr 11 12:04:53 KST 2009 */ %>