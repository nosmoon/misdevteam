<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrcla.rec.*
	,	chosun.ciis.mt.submatrcla.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRCLA_1150_LDataSet ds = (MT_SUBMATRCLA_1150_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int record = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		recordSet = rx.add(dataSet, "CURLIST3", "");
		record = rx.add(recordSet, "gubun", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_SUBMATRCLA_1150_LCURLIST3Record rec = (MT_SUBMATRCLA_1150_LCURLIST3Record)ds.curlist3.get(i);
			int item = rx.add(record, "item", "");
			rx.add(item, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(item, "label", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");
		record = rx.add(recordSet, "temp", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_SUBMATRCLA_1150_LCURLIST2Record rec = (MT_SUBMATRCLA_1150_LCURLIST2Record)ds.curlist2.get(i);
			int item = rx.add(record, "item", "");
			rx.add(item, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(item, "label", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
        record = rx.add(recordSet, "unit", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATRCLA_1150_LCURLISTRecord rec = (MT_SUBMATRCLA_1150_LCURLISTRecord)ds.curlist.get(i);
			int item = rx.add(record, "item", "");
			//rx.add(record, "dept_type", rec.dept_type);
			rx.add(item, "label", rec.abrv_nm);
			//rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(item, "value", rec.dept_sub);
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
<dataSet>
	<CURLIST2>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<dept_type/>
			<abrv_nm/>
			<dept_cd/>
			<dept_sub/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 13 20:38:24 KST 2009 */ %>