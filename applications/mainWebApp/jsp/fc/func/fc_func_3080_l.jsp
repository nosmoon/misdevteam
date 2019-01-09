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
	FC_FUNC_3080_LDataSet ds = (FC_FUNC_3080_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_FUNC_3080_LCURLIST1Record rec = (FC_FUNC_3080_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "busn_dt", rec.busn_dt);
			rx.add(record, "week_day", rec.week_day);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "col1", rec.col1);
			rx.add(record, "col2", rec.col2);
			rx.add(record, "col3", rec.col3);
			rx.add(record, "col4", rec.col4);
			rx.add(record, "col5", rec.col5);
			rx.add(record, "col6", rec.col6);
			rx.add(record, "col7", rec.col7);
			rx.add(record, "col8", rec.col8);
			rx.add(record, "col9", rec.col9);
			rx.add(record, "col10", rec.col10);
			rx.add(record, "col11", rec.col11);
			rx.add(record, "col12", rec.col12);
			rx.add(record, "col13", rec.col13);
			rx.add(record, "col14", rec.col14);
			rx.add(record, "col15", rec.col15);
			rx.add(record, "col16", rec.col16);
			rx.add(record, "col17", rec.col17);
			rx.add(record, "col18", rec.col18);
			rx.add(record, "col19", rec.col19);
			rx.add(record, "col20", rec.col20);
			rx.add(record, "col21", rec.col21);
			rx.add(record, "col22", rec.col22);
			rx.add(record, "col23", rec.col23);
			rx.add(record, "col24", rec.col24);
			rx.add(record, "col25", rec.col25);
			rx.add(record, "col26", rec.col26);
			rx.add(record, "col27", rec.col27);
			rx.add(record, "busn_dd_clsf_cd", rec.busn_dd_clsf_cd);
			//rx.add(record, "busn_dt", StringUtil.replaceToXml(rec.busn_dt));
			//rx.add(record, "week_day", StringUtil.replaceToXml(rec.week_day));
			//rx.add(record, "tot_amt", StringUtil.replaceToXml(rec.tot_amt));
			//rx.add(record, "col1", StringUtil.replaceToXml(rec.col1));
			//rx.add(record, "col2", StringUtil.replaceToXml(rec.col2));
			//rx.add(record, "col3", StringUtil.replaceToXml(rec.col3));
			//rx.add(record, "col4", StringUtil.replaceToXml(rec.col4));
			//rx.add(record, "col5", StringUtil.replaceToXml(rec.col5));
			//rx.add(record, "col6", StringUtil.replaceToXml(rec.col6));
			//rx.add(record, "col7", StringUtil.replaceToXml(rec.col7));
			//rx.add(record, "col8", StringUtil.replaceToXml(rec.col8));
			//rx.add(record, "col9", StringUtil.replaceToXml(rec.col9));
			//rx.add(record, "col10", StringUtil.replaceToXml(rec.col10));
			//rx.add(record, "col11", StringUtil.replaceToXml(rec.col11));
			//rx.add(record, "col12", StringUtil.replaceToXml(rec.col12));
			//rx.add(record, "col13", StringUtil.replaceToXml(rec.col13));
			//rx.add(record, "col14", StringUtil.replaceToXml(rec.col14));
			//rx.add(record, "col15", StringUtil.replaceToXml(rec.col15));
			//rx.add(record, "col16", StringUtil.replaceToXml(rec.col16));
			//rx.add(record, "col17", StringUtil.replaceToXml(rec.col17));
			//rx.add(record, "col18", StringUtil.replaceToXml(rec.col18));
			//rx.add(record, "col19", StringUtil.replaceToXml(rec.col19));
			//rx.add(record, "col20", StringUtil.replaceToXml(rec.col20));
			//rx.add(record, "col21", StringUtil.replaceToXml(rec.col21));
			//rx.add(record, "col22", StringUtil.replaceToXml(rec.col22));
			//rx.add(record, "col23", StringUtil.replaceToXml(rec.col23));
			//rx.add(record, "col24", StringUtil.replaceToXml(rec.col24));
			//rx.add(record, "col25", StringUtil.replaceToXml(rec.col25));
			//rx.add(record, "col26", StringUtil.replaceToXml(rec.col26));
			//rx.add(record, "col27", StringUtil.replaceToXml(rec.col27));
			//rx.add(record, "busn_dd_clsf_cd", StringUtil.replaceToXml(rec.busn_dd_clsf_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<fc_func_3080_l>
	<dataSet>
		<CURLIST1>
			<record>
				<busn_dt/>
				<week_day/>
				<tot_amt/>
				<col1/>
				<col2/>
				<col3/>
				<col4/>
				<col5/>
				<col6/>
				<col7/>
				<col8/>
				<col9/>
				<col10/>
				<col11/>
				<col12/>
				<col13/>
				<col14/>
				<col15/>
				<col16/>
				<col17/>
				<col18/>
				<col19/>
				<col20/>
				<col21/>
				<col22/>
				<col23/>
				<col24/>
				<col25/>
				<col26/>
				<col27/>
				<busn_dd_clsf_cd/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_func_3080_l>
*/
%>

<% /* 작성시간 : Thu Aug 27 19:35:45 KST 2009 */ %>