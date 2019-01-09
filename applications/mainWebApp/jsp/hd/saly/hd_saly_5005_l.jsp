<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_5005_LDataSet ds = (HD_SALY_5005_LDataSet)request.getAttribute("ds");
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
			HD_SALY_5005_LCURLISTRecord rec = (HD_SALY_5005_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "etc_dduc_nm", rec.etc_dduc_nm);
			rx.add(record, "etc_dduc_amt", rec.etc_dduc_amt);
			//rx.add(record, "etc_dduc_nm", StringUtil.replaceToXml(rec.etc_dduc_nm));
			//rx.add(record, "etc_dduc_amt", StringUtil.replaceToXml(rec.etc_dduc_amt));
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
<hd_saly_5005_l>
	<dataSet>
		<CURLIST>
			<record>
				<etc_dduc_nm/>
				<etc_dduc_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_5005_l>
*/
%>

<% /* 작성시간 : Sun Sep 20 15:04:02 KST 2009 */ %>