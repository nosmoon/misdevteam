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
	HD_EVLU_9999_SDataSet ds = (HD_EVLU_9999_SDataSet)request.getAttribute("ds");
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
			HD_EVLU_9999_SCURLISTRecord rec = (HD_EVLU_9999_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "class_result", rec.class_result);
			rx.add(record, "busn_rslt_scor", rec.busn_rslt_scor);
			rx.add(record, "evlu_part_cd1", rec.evlu_part_cd1);
			rx.add(record, "evlu_part_cd2", rec.evlu_part_cd2);
			//rx.add(record, "class_result", StringUtil.replaceToXml(rec.class_result));
			//rx.add(record, "busn_rslt_scor", StringUtil.replaceToXml(rec.busn_rslt_scor));
			//rx.add(record, "evlu_part_cd1", StringUtil.replaceToXml(rec.evlu_part_cd1));
			//rx.add(record, "evlu_part_cd2", StringUtil.replaceToXml(rec.evlu_part_cd2));
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
<hd_evlu_9999_s>
	<dataSet>
		<CURLIST>
			<record>
				<class_result/>
				<busn_rslt_scor/>
				<evlu_part_cd1/>
				<evlu_part_cd2/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_9999_s>
*/
%>

<% /* 작성시간 : Tue Oct 13 17:37:16 KST 2009 */ %>