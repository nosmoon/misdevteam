<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_1401_LDataSet ds = (HD_EVLU_1401_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_1401_LCURLISTRecord rec = (HD_EVLU_1401_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evlu_grp_nm", rec.evlu_grp_nm);
			rx.add(record, "ratio_10", rec.ratio_10);
			rx.add(record, "ratio_20", rec.ratio_20);
			rx.add(record, "ratio_30", rec.ratio_30);
			rx.add(record, "ratio_40", rec.ratio_40);
			rx.add(record, "ratio_50", rec.ratio_50);
			rx.add(record, "ratio_60", rec.ratio_60);
			rx.add(record, "ratio_tot", Integer.parseInt(rec.ratio_10)+Integer.parseInt(rec.ratio_20)+Integer.parseInt(rec.ratio_30)+Integer.parseInt(rec.ratio_40)+Integer.parseInt(rec.ratio_50)+Integer.parseInt(rec.ratio_60));
			rx.add(record, "asst_clsf", rec.asst_clsf);
			rx.add(record, "asst_point", rec.asst_point);
			rx.add(record, "spcl_plus_point", rec.spcl_plus_point);
			rx.add(record, "spcl_minus_point", rec.spcl_minus_point);
			rx.add(record, "db_status", rec.db_status);
			rx.add(record, "evlu_grp_cd", rec.evlu_grp_cd);
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
<dataSet>
	<CURLIST>
		<record>
			<evlu_grp_nm/>
			<ratio_10/>
			<ratio_20/>
			<ratio_30/>
			<ratio_40/>
			<ratio_50/>
			<ratio_tot/>
			<asst_clsf/>
			<spcl_plus_point/>
			<spcl_minus_point/>
			<db_status/>
			<evlu_grp_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 15 21:54:57 KST 2009 */ %>