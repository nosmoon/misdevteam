<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.cost.rec.*
	,	chosun.ciis.mc.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_COST_3165_LDataSet ds = (MC_COST_3165_LDataSet)request.getAttribute("ds");
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
			MC_COST_3165_LCURLISTRecord rec = (MC_COST_3165_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "gubun1", rec.gubun1);
			//rx.add(record, "sort_key1", rec.sort_key1);
			//rx.add(record, "gubun2", rec.gubun2);
			//rx.add(record, "gubun3", rec.gubun3);
			//rx.add(record, "ajsumamt_m01", rec.ajsumamt_m01);
			//rx.add(record, "aj11amt_m01", rec.aj11amt_m01);
			//rx.add(record, "aj13amt_m01", rec.aj13amt_m01);
			//rx.add(record, "aj19amt_m01", rec.aj19amt_m01);
			//rx.add(record, "ajsub1sum_m01", rec.ajsub1sum_m01);
			//rx.add(record, "aj21amt_m01", rec.aj21amt_m01);
			//rx.add(record, "aj22amt_m01", rec.aj22amt_m01);
			//rx.add(record, "aj23amt_m01", rec.aj23amt_m01);
			//rx.add(record, "aj24amt_m01", rec.aj24amt_m01);
			//rx.add(record, "aj27amt_m01", rec.aj27amt_m01);
			//rx.add(record, "aj31amt_m01", rec.aj31amt_m01);
			//rx.add(record, "aj41amt_m01", rec.aj41amt_m01);
			//rx.add(record, "aj42amt_m01", rec.aj42amt_m01);
			//rx.add(record, "aj49amt_m01", rec.aj49amt_m01);
			//rx.add(record, "ajsub2sum_m01", rec.ajsub2sum_m01);
			//rx.add(record, "aj61amt_m01", rec.aj61amt_m01);
			//rx.add(record, "aj71amt_m01", rec.aj71amt_m01);
			//rx.add(record, "aj81amt_m01", rec.aj81amt_m01);
			//rx.add(record, "ajexamt_m01", rec.ajexamt_m01);
			rx.add(record, "gubun1", StringUtil.replaceToXml(rec.gubun1));
			rx.add(record, "sort_key1", StringUtil.replaceToXml(rec.sort_key1));
			rx.add(record, "gubun2", StringUtil.replaceToXml(rec.gubun2));
			rx.add(record, "gubun3", StringUtil.replaceToXml(rec.gubun3));
			rx.add(record, "ajsumamt_m01", StringUtil.replaceToXml(rec.ajsumamt_m01));
			rx.add(record, "aj11amt_m01", StringUtil.replaceToXml(rec.aj11amt_m01));
			rx.add(record, "aj13amt_m01", StringUtil.replaceToXml(rec.aj13amt_m01));
			rx.add(record, "aj19amt_m01", StringUtil.replaceToXml(rec.aj19amt_m01));
			rx.add(record, "ajsub1sum_m01", StringUtil.replaceToXml(rec.ajsub1sum_m01));
			rx.add(record, "aj21amt_m01", StringUtil.replaceToXml(rec.aj21amt_m01));
			rx.add(record, "aj22amt_m01", StringUtil.replaceToXml(rec.aj22amt_m01));
			rx.add(record, "aj23amt_m01", StringUtil.replaceToXml(rec.aj23amt_m01));
			rx.add(record, "aj24amt_m01", StringUtil.replaceToXml(rec.aj24amt_m01));
			rx.add(record, "aj27amt_m01", StringUtil.replaceToXml(rec.aj27amt_m01));
			rx.add(record, "aj31amt_m01", StringUtil.replaceToXml(rec.aj31amt_m01));
			rx.add(record, "aj41amt_m01", StringUtil.replaceToXml(rec.aj41amt_m01));
			rx.add(record, "aj42amt_m01", StringUtil.replaceToXml(rec.aj42amt_m01));
			rx.add(record, "aj49amt_m01", StringUtil.replaceToXml(rec.aj49amt_m01));
			rx.add(record, "ajsub2sum_m01", StringUtil.replaceToXml(rec.ajsub2sum_m01));
			rx.add(record, "aj61amt_m01", StringUtil.replaceToXml(rec.aj61amt_m01));
			rx.add(record, "aj71amt_m01", StringUtil.replaceToXml(rec.aj71amt_m01));
			rx.add(record, "aj81amt_m01", StringUtil.replaceToXml(rec.aj81amt_m01));
			rx.add(record, "ajexamt_m01", StringUtil.replaceToXml(rec.ajexamt_m01));
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
<mc_cost_3165_l>
	<dataSet>
		<CURLIST>
			<record>
				<gubun1/>
				<sort_key1/>
				<gubun2/>
				<gubun3/>
				<ajsumamt_m01/>
				<aj11amt_m01/>
				<aj13amt_m01/>
				<aj19amt_m01/>
				<ajsub1sum_m01/>
				<aj21amt_m01/>
				<aj22amt_m01/>
				<aj23amt_m01/>
				<aj24amt_m01/>
				<aj27amt_m01/>
				<aj31amt_m01/>
				<aj41amt_m01/>
				<aj42amt_m01/>
				<aj49amt_m01/>
				<ajsub2sum_m01/>
				<aj61amt_m01/>
				<aj71amt_m01/>
				<aj81amt_m01/>
				<ajexamt_m01/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_3165_l>
*/
%>

<% /* 작성시간 : Thu Sep 24 16:45:22 KST 2009 */ %>