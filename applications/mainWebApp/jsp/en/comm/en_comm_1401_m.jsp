<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.en.comm.rec.*
	,	chosun.ciis.en.comm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	EN_COMM_1401_MDataSet ds = (EN_COMM_1401_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			EN_COMM_1401_MCURLIST3Record rec = (EN_COMM_1401_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			EN_COMM_1401_MCURLIST2Record rec = (EN_COMM_1401_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			EN_COMM_1401_MCURLIST1Record rec = (EN_COMM_1401_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
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
<en_comm_1401_m>
	<dataSet>
		<CURLIST3>
			<record>
				<cd/>
				<cd_nm/>
				<cd_abrv_nm/>
			</record>
		</CURLIST3>
	</dataSet>
</en_comm_1401_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<en_comm_1401_m>
	<dataSet>
		<CURLIST2>
			<record>
				<cd/>
				<cd_nm/>
				<cd_abrv_nm/>
			</record>
		</CURLIST2>
	</dataSet>
</en_comm_1401_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<en_comm_1401_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd/>
				<cd_nm/>
				<cd_abrv_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</en_comm_1401_m>
*/
%>

<% /* 작성시간 : Mon Jun 01 15:44:31 KST 2009 */ %>