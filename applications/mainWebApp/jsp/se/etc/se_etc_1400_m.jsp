<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.etc.rec.*
	,	chosun.ciis.se.etc.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SE_ETC_1400_MDataSet ds = (SE_ETC_1400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	rx.add(root, "yymm", ds.yymm);

	dataSet = rx.add(root, "comboSet", "");

	try {
		/****** TEAMLIST BEGIN */
		recordSet = rx.add(dataSet, "teamlist", "");

		for(int i = 0; i < ds.teamlist.size(); i++) {
			SE_ETC_1400_MTEAMLISTRecord rec = (SE_ETC_1400_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
		}
		/****** TEAMLIST END */

		/****** PARTLIST BEGIN */
		recordSet = rx.add(dataSet, "partlist_temp", "");

		for(int i = 0; i < ds.partlist.size(); i++) {
			SE_ETC_1400_MPARTLISTRecord rec = (SE_ETC_1400_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
		}
		/****** PARTLIST END */

		/****** AREALIST BEGIN */
		recordSet = rx.add(dataSet, "arealist_temp", "");

		for(int i = 0; i < ds.arealist.size(); i++) {
			SE_ETC_1400_MAREALISTRecord rec = (SE_ETC_1400_MAREALISTRecord)ds.arealist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "supr_dept_cd", rec.supr_dept_cd);
		}
		/****** AREALIST END */

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
	<TEAMLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
		</record>
	</TEAMLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<AREALIST>
		<record>
			<area_cd/>
			<area_nm/>
			<dept_cd/>
			<supr_dept_cd/>
		</record>
	</AREALIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<PARTLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
			<supr_dept_cd/>
		</record>
	</PARTLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Aug 21 10:44:09 KST 2009 */ %>