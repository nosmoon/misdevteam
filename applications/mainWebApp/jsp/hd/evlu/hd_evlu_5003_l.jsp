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
	HD_EVLU_5003_LDataSet ds = (HD_EVLU_5003_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_5003_LCURLISTRecord rec = (HD_EVLU_5003_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rnum", rec.rnum);
			rx.add(record, "evlu_yy", rec.evlu_yy);
			rx.add(record, "tms_clsf", rec.tms_clsf);
			rx.add(record, "evlu_step_clsf", rec.evlu_step_clsf);
			rx.add(record, "frdt", rec.frdt);
			rx.add(record, "todt", rec.todt);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "db_status", rec.db_status);
			//rx.add(record, "evlu_yy", StringUtil.replaceToXml(rec.evlu_yy));
			//rx.add(record, "tms_clsf", StringUtil.replaceToXml(rec.tms_clsf));
			//rx.add(record, "evlu_step_clsf", StringUtil.replaceToXml(rec.evlu_step_clsf));
			//rx.add(record, "frdt", StringUtil.replaceToXml(rec.frdt));
			//rx.add(record, "todt", StringUtil.replaceToXml(rec.todt));
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
TrustForm�� Instance ����ο� �����ؼ� ���
<hd_evlu_5003_l>
	<dataSet>
		<CURLIST>
			<record>
				<rnum/>
				<evlu_yy/>
				<tms_clsf/>
				<evlu_step_clsf/>
				<frdt/>
				<todt/>
				<remk/>
				<db_status/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_5003_l>
*/
%>

<% /* �ۼ��ð� : Thu May 21 13:54:29 KST 2009 */ %>