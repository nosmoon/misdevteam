<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_3401_LDataSet ds = (HD_LVCMPY_3401_LDataSet)request.getAttribute("ds");
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
			HD_LVCMPY_3401_LCURLISTRecord rec = (HD_LVCMPY_3401_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "estm_work_dt", rec.estm_work_dt);
			//rx.add(record, "estm_work_dt", StringUtil.replaceToXml(rec.estm_work_dt));
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
<hd_lvcmpy_3401_l>
	<dataSet>
		<CURLIST>
			<record>
				<estm_work_dt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_lvcmpy_3401_l>
*/
%>

<% /* 작성시간 : Tue Jul 12 11:43:52 KST 2011 */ %>