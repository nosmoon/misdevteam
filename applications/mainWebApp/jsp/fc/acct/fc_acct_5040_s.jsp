<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_5040_SDataSet ds = (FC_ACCT_5040_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			FC_ACCT_5040_SCURLIST4Record rec = (FC_ACCT_5040_SCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			FC_ACCT_5040_SCURLIST3Record rec = (FC_ACCT_5040_SCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_5040_SCURLIST2Record rec = (FC_ACCT_5040_SCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_5040_SCURLIST1Record rec = (FC_ACCT_5040_SCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST7 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST7", "");

		for(int i = 0; i < ds.curlist7.size(); i++) {
			FC_ACCT_5040_SCURLIST7Record rec = (FC_ACCT_5040_SCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist7.size());
		/****** CURLIST7 END */

		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST6", "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			FC_ACCT_5040_SCURLIST6Record rec = (FC_ACCT_5040_SCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			FC_ACCT_5040_SCURLIST5Record rec = (FC_ACCT_5040_SCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

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
<fc_acct_5040_s>
	<dataSet>
		<CURLIST4>
			<record>
				<cnt/>
			</record>
		</CURLIST4>
	</dataSet>
</fc_acct_5040_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_5040_s>
	<dataSet>
		<CURLIST3>
			<record>
				<cnt/>
			</record>
		</CURLIST3>
	</dataSet>
</fc_acct_5040_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_5040_s>
	<dataSet>
		<CURLIST2>
			<record>
				<cnt/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_5040_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_5040_s>
	<dataSet>
		<CURLIST1>
			<record>
				<cnt/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_5040_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_5040_s>
	<dataSet>
		<CURLIST7>
			<record>
				<cnt/>
			</record>
		</CURLIST7>
	</dataSet>
</fc_acct_5040_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_5040_s>
	<dataSet>
		<CURLIST6>
			<record>
				<cnt/>
			</record>
		</CURLIST6>
	</dataSet>
</fc_acct_5040_s>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_5040_s>
	<dataSet>
		<CURLIST5>
			<record>
				<cnt/>
			</record>
		</CURLIST5>
	</dataSet>
</fc_acct_5040_s>
*/
%>

<% /* 작성시간 : Tue Jul 28 19:51:49 KST 2009 */ %>