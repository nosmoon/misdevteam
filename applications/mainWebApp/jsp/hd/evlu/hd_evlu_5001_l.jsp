<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_5001_LDataSet ds = (HD_EVLU_5001_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_5001_LCURLISTRecord rec = (HD_EVLU_5001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rnum", rec.rnum);
			rx.add(record, "evlu_yy", rec.evlu_yy);
			rx.add(record, "tms_clsf", rec.tms_clsf);
			rx.add(record, "evlu_obj_frdt", rec.evlu_obj_frdt);
			rx.add(record, "evlu_obj_todt", rec.evlu_obj_todt);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "db_status", rec.db_status);
			//rx.add(record, "rnum", StringUtil.replaceToXml(rec.rnum));
			//rx.add(record, "evlu_yy", StringUtil.replaceToXml(rec.evlu_yy));
			//rx.add(record, "tms_clsf", StringUtil.replaceToXml(rec.tms_clsf));
			//rx.add(record, "evlu_obj_frdt", StringUtil.replaceToXml(rec.evlu_obj_frdt));
			//rx.add(record, "evlu_obj_todt", StringUtil.replaceToXml(rec.evlu_obj_todt));
			//rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "db_status", StringUtil.replaceToXml(rec.db_status));
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
<hd_evlu_5001_l>
	<dataSet>
		<CURLIST>
			<record>
				<rnum/>
				<evlu_yy/>
				<tms_clsf/>
				<evlu_obj_frdt/>
				<evlu_obj_todt/>
				<remk/>
				<db_status/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_5001_l>
*/
%>

<% /* 작성시간 : Wed May 20 20:01:38 KST 2009 */ %>