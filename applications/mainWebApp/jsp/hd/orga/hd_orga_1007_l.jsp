<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.orga.rec.*
	,	chosun.ciis.hd.orga.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_ORGA_1007_LDataSet ds = (HD_ORGA_1007_LDataSet)request.getAttribute("ds");
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
			HD_ORGA_1007_LCURLIST4Record rec = (HD_ORGA_1007_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_ORGA_1007_LCURLIST3Record rec = (HD_ORGA_1007_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_ORGA_1007_LCURLIST2Record rec = (HD_ORGA_1007_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_ORGA_1007_LCURLIST1Record rec = (HD_ORGA_1007_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist1.size());
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
<dataSet>
	<CURLIST4>
		<record>
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
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
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
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
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
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
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 23 10:40:58 KST 2009 */ %>