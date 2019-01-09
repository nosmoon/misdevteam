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
	HD_EVLU_5900_LDataSet ds = (HD_EVLU_5900_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_5900_LCURLISTRecord rec = (HD_EVLU_5900_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evlu_yy", rec.evlu_yy);
			rx.add(record, "tms_clsf", rec.tms_clsf);
			rx.add(record, "evlu_pers_emp_no_tms", rec.evlu_pers_emp_no_tms);
			rx.add(record, "evlu_pers_gbn", rec.evlu_pers_gbn);
			//rx.add(record, "evlu_yy", StringUtil.replaceToXml(rec.evlu_yy));
			//rx.add(record, "tms_clsf", StringUtil.replaceToXml(rec.tms_clsf));
			//rx.add(record, "evlu_pers_emp_no_tms", StringUtil.replaceToXml(rec.evlu_pers_emp_no_tms));
			//rx.add(record, "evlu_pers_gbn", StringUtil.replaceToXml(rec.evlu_pers_gbn));
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
<hd_evlu_5900_l>
	<dataSet>
		<CURLIST>
			<record>
				<evlu_yy/>
				<tms_clsf/>
				<evlu_pers_emp_no_tms/>
				<evlu_pers_gbn/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_5900_l>
*/
%>

<% /* 작성시간 : Mon Jun 08 19:55:58 KST 2009 */ %>