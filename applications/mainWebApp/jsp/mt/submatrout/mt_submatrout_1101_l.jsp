<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrout.rec.*
	,	chosun.ciis.mt.submatrout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATROUT_1101_LDataSet ds = (MT_SUBMATROUT_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		recordSet = rx.add(dataSet, "medi_cd", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_SUBMATROUT_1101_LCURLIST1Record rec2 = (MT_SUBMATROUT_1101_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec2.cd);
			rx.add(record, "label", rec2.cdnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());

		recordSet = rx.add(dataSet, "fac_clsf", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATROUT_1101_LCURLISTRecord rec  = (MT_SUBMATROUT_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
			rx.add(record, "dept", rec.dept_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());

		recordSet = rx.add(dataSet, "login_uprc_yn" , ds.uprc_yn);
		recordSet = rx.add(dataSet, "login_fac_clsf", ds.fac_clsf);
		recordSet = rx.add(dataSet, "login_dept_cd" , ds.dept_cd);
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
	<CURLIST1>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 27 20:32:35 KST 2009 */ %>