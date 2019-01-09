<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.insr.rec.*
	,	chosun.ciis.hd.insr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INSR_1600_LDataSet ds = (HD_INSR_1600_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			HD_INSR_1600_LCURLIST5Record rec = (HD_INSR_1600_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tot_alon_sum_a", rec.tot_alon_sum_a);
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			HD_INSR_1600_LCURLIST4Record rec = (HD_INSR_1600_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bns_human_sum_tm", rec.bns_human_sum_tm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_INSR_1600_LCURLIST3Record rec = (HD_INSR_1600_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bns_sum_tm", rec.bns_sum_tm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_INSR_1600_LCURLIST2Record rec = (HD_INSR_1600_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tot_saly_human_sum_a", rec.tot_saly_human_sum_a);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INSR_1600_LCURLIST1Record rec = (HD_INSR_1600_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tot_saly_sum_a", rec.tot_saly_sum_a);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST10 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST10", "");

		for(int i = 0; i < ds.curlist10.size(); i++) {
			HD_INSR_1600_LCURLIST10Record rec = (HD_INSR_1600_LCURLIST10Record)ds.curlist10.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tot_human_sum_tm", rec.tot_human_sum_tm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist10.size());
		/****** CURLIST10 END */

		/****** CURLIST9 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST9", "");

		for(int i = 0; i < ds.curlist9.size(); i++) {
			HD_INSR_1600_LCURLIST9Record rec = (HD_INSR_1600_LCURLIST9Record)ds.curlist9.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tot_sum_tm", rec.tot_sum_tm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist9.size());
		/****** CURLIST9 END */

		/****** CURLIST8 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST8", "");

		for(int i = 0; i < ds.curlist8.size(); i++) {
			HD_INSR_1600_LCURLIST8Record rec = (HD_INSR_1600_LCURLIST8Record)ds.curlist8.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tot_human_sum_b", rec.tot_human_sum_b);
		}
		rx.add(recordSet, "totalcnt", ds.curlist8.size());
		/****** CURLIST8 END */

		/****** CURLIST7 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST7", "");

		for(int i = 0; i < ds.curlist7.size(); i++) {
			HD_INSR_1600_LCURLIST7Record rec = (HD_INSR_1600_LCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tot_sum_b", rec.tot_sum_b);
		}
		rx.add(recordSet, "totalcnt", ds.curlist7.size());
		/****** CURLIST7 END */

		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST6", "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			HD_INSR_1600_LCURLIST6Record rec = (HD_INSR_1600_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "tot_alon_human_sum_a", rec.tot_alon_human_sum_a);
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */

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
<dataSet>
	<CURLIST5>
		<record>
			<tot_alon_sum_a/>
		</record>
	</CURLIST5>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST4>
		<record>
			<bns_human_sum_tm/>
		</record>
	</CURLIST4>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST3>
		<record>
			<bns_sum_tm/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<tot_saly_human_sum_a/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<tot_saly_sum_a/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST10>
		<record>
			<tot_human_sum_tm/>
		</record>
	</CURLIST10>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST9>
		<record>
			<tot_sum_tm/>
		</record>
	</CURLIST9>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST8>
		<record>
			<tot_human_sum_b/>
		</record>
	</CURLIST8>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST7>
		<record>
			<tot_sum_b/>
		</record>
	</CURLIST7>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST6>
		<record>
			<tot_alon_human_sum_a/>
		</record>
	</CURLIST6>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 08 17:51:17 KST 2009 */ %>