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
	HD_EVLU_2850_LDataSet ds = (HD_EVLU_2850_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	
	int spcl_plus_point = rx.add(dataSet, "spcl_plus_point", ds.spcl_plus_point);
	int spcl_minus_point = rx.add(dataSet, "spcl_minus_point", ds.spcl_minus_point);
	int sum = rx.add(dataSet, "sum", ds.sum);

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_2850_LCURLISTRecord rec = (HD_EVLU_2850_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "evlu_dp_nm", rec.evlu_dp_nm);
			rx.add(record, "evlu_dp_scor", rec.evlu_dp_scor);
			//rx.add(record, "evlu_dp_nm", StringUtil.replaceToXml(rec.evlu_dp_nm));
			//rx.add(record, "evlu_dp_scor", StringUtil.replaceToXml(rec.evlu_dp_scor));
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
<hd_evlu_2850_l>
	<dataSet>
		<CURLIST>
			<record>
				<evlu_dp_nm/>
				<evlu_dp_scor/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_2850_l>
*/
%>

<% /* 작성시간 : Wed Jul 20 15:05:32 KST 2016 */ %>