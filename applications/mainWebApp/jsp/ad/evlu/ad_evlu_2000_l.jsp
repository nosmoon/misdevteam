<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.evlu.rec.*
	,	chosun.ciis.ad.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_EVLU_2000_LDataSet ds = (AD_EVLU_2000_LDataSet)request.getAttribute("ds");
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
			AD_EVLU_2000_LCURLISTRecord rec = (AD_EVLU_2000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_nm", rec.emp_nm); 
			rx.add(record, "rank_1", rec.rank_1);
			rx.add(record, "scor_1", rec.scor_1);
			rx.add(record, "rank_2", rec.rank_2);
			rx.add(record, "scor_2", rec.scor_2);
			rx.add(record, "rank_3", rec.rank_3);
			rx.add(record, "scor_3", rec.scor_3);
			rx.add(record, "rank_4", rec.rank_4);
			rx.add(record, "scor_4", rec.scor_4);
			rx.add(record, "rank_5", rec.rank_5);
			rx.add(record, "scor_5", rec.scor_5);
			rx.add(record, "rank_6", rec.rank_6);
			rx.add(record, "scor_6", rec.scor_6);
			rx.add(record, "rank_7", rec.rank_7);
			rx.add(record, "scor_7", rec.scor_7);
			rx.add(record, "rank_8", rec.rank_8);
			rx.add(record, "scor_8", rec.scor_8);
			rx.add(record, "rank_9", rec.rank_9);
			rx.add(record, "scor_9", rec.scor_9);
			rx.add(record, "rank_10", rec.rank_10);
			rx.add(record, "scor_10", rec.scor_10);
			rx.add(record, "rank_11", rec.rank_11);
			rx.add(record, "scor_11", rec.scor_11);
			rx.add(record, "rank_12", rec.rank_12);
			rx.add(record, "scor_12", rec.scor_12);
			rx.add(record, "tot_rank", rec.tot_rank);
			rx.add(record, "tot_sum", rec.tot_sum);
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_nm", StringUtil.replaceToXml(rec.emp_nm));
			//rx.add(record, "rank_1", StringUtil.replaceToXml(rec.rank_1));
			//rx.add(record, "scor_1", StringUtil.replaceToXml(rec.scor_1));
			//rx.add(record, "rank_2", StringUtil.replaceToXml(rec.rank_2));
			//rx.add(record, "scor_2", StringUtil.replaceToXml(rec.scor_2));
			//rx.add(record, "rank_3", StringUtil.replaceToXml(rec.rank_3));
			//rx.add(record, "scor_3", StringUtil.replaceToXml(rec.scor_3));
			//rx.add(record, "rank_4", StringUtil.replaceToXml(rec.rank_4));
			//rx.add(record, "scor_4", StringUtil.replaceToXml(rec.scor_4));
			//rx.add(record, "rank_5", StringUtil.replaceToXml(rec.rank_5));
			//rx.add(record, "scor_5", StringUtil.replaceToXml(rec.scor_5));
			//rx.add(record, "rank_6", StringUtil.replaceToXml(rec.rank_6));
			//rx.add(record, "scor_6", StringUtil.replaceToXml(rec.scor_6));
			//rx.add(record, "rank_7", StringUtil.replaceToXml(rec.rank_7));
			//rx.add(record, "scor_7", StringUtil.replaceToXml(rec.scor_7));
			//rx.add(record, "rank_8", StringUtil.replaceToXml(rec.rank_8));
			//rx.add(record, "scor_8", StringUtil.replaceToXml(rec.scor_8));
			//rx.add(record, "rank_9", StringUtil.replaceToXml(rec.rank_9));
			//rx.add(record, "scor_9", StringUtil.replaceToXml(rec.scor_9));
			//rx.add(record, "rank_10", StringUtil.replaceToXml(rec.rank_10));
			//rx.add(record, "scor_10", StringUtil.replaceToXml(rec.scor_10));
			//rx.add(record, "rank_11", StringUtil.replaceToXml(rec.rank_11));
			//rx.add(record, "scor_11", StringUtil.replaceToXml(rec.scor_11));
			//rx.add(record, "rank_12", StringUtil.replaceToXml(rec.rank_12));
			//rx.add(record, "scor_12", StringUtil.replaceToXml(rec.scor_12));
			//rx.add(record, "tot_rank", StringUtil.replaceToXml(rec.tot_rank));
			//rx.add(record, "tot_sum", StringUtil.replaceToXml(rec.tot_sum));
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
<ad_evlu_2000_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_nm/>
				<emp_nm/>
				<rank_1/>
				<scor_1/>
				<rank_2/>
				<scor_2/>
				<rank_3/>
				<scor_3/>
				<rank_4/>
				<scor_4/>
				<rank_5/>
				<scor_5/>
				<rank_6/>
				<scor_6/>
				<rank_7/>
				<scor_7/>
				<rank_8/>
				<scor_8/>
				<rank_9/>
				<scor_9/>
				<rank_10/>
				<scor_10/>
				<rank_11/>
				<scor_11/>
				<rank_12/>
				<scor_12/>
				<tot_rank/>
				<tot_sum/>
			</record>
		</CURLIST>
	</dataSet>
</ad_evlu_2000_l>
*/
%>

<% /* 작성시간 : Mon Mar 22 18:22:02 KST 2010 */ %>