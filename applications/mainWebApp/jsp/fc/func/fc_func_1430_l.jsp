<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_1430_LDataSet ds = (FC_FUNC_1430_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1430_LCURLISTRecord rec = (FC_FUNC_1430_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "busn_dt", rec.busn_dt);
			rx.add(record, "busn_dd_clsf_cd", rec.busn_dd_clsf_cd);
			rx.add(record, "amt1", rec.amt1);
			rx.add(record, "amt2", rec.amt2);
			rx.add(record, "amt3", rec.amt3);
			rx.add(record, "amt4", rec.amt4);
			rx.add(record, "amt5", rec.amt5);
			rx.add(record, "amt6", rec.amt6);
			rx.add(record, "sumamt", rec.sumamt);
			//rx.add(record, "busn_dt", StringUtil.replaceToXml(rec.busn_dt));
			//rx.add(record, "busn_dd_clsf_cd", StringUtil.replaceToXml(rec.busn_dd_clsf_cd));
			//rx.add(record, "amt1", StringUtil.replaceToXml(rec.amt1));
			//rx.add(record, "amt2", StringUtil.replaceToXml(rec.amt2));
			//rx.add(record, "amt3", StringUtil.replaceToXml(rec.amt3));
			//rx.add(record, "amt4", StringUtil.replaceToXml(rec.amt4));
			//rx.add(record, "amt5", StringUtil.replaceToXml(rec.amt5));
			//rx.add(record, "sumamt", StringUtil.replaceToXml(rec.sumamt));
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
<fc_func_1430_l>
	<dataSet>
		<CURLIST>
			<record>
				<busn_dt/>
				<busn_dd_clsf_cd/>
				<amt1/>
				<amt2/>
				<amt3/>
				<amt4/>
				<amt5/>
				<sumamt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_func_1430_l>
*/
%>

<% /* 작성시간 : Fri May 01 14:35:42 KST 2009 */ %>