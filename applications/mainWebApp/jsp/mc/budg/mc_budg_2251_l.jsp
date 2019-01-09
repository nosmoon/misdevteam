<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_2251_LDataSet ds = (MC_BUDG_2251_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_2251_LCURLISTRecord rec = (MC_BUDG_2251_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "checked", rec.checked);
			rx.add(record, "exec_no", rec.exec_no);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "fix_yn", rec.fix_yn);
			rx.add(record, "to_char_incmg_dt_tm", rec.to_char_incmg_dt_tm);
			//rx.add(record, "checked", StringUtil.replaceToXml(rec.checked));
			//rx.add(record, "exec_no", StringUtil.replaceToXml(rec.exec_no));
			//rx.add(record, "clos_yn", StringUtil.replaceToXml(rec.clos_yn));
			//rx.add(record, "fix_yn", StringUtil.replaceToXml(rec.fix_yn));
			//rx.add(record, "to_char_incmg_dt_tm", StringUtil.replaceToXml(rec.to_char_incmg_dt_tm));
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
<mc_budg_2251_l>
	<dataSet>
		<CURLIST>
			<record>
				<checked/>
				<exec_no/>
				<clos_yn/>
				<fix_yn/>
				<to_char_incmg_dt_tm/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_2251_l>
*/
%>

<% /* 작성시간 : Wed May 06 17:50:33 KST 2009 */ %>