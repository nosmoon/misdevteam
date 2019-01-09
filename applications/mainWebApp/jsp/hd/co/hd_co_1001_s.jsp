<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.co.rec.*
	,	chosun.ciis.hd.co.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_CO_1001_SDataSet ds = (HD_CO_1001_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	//dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_CO_1001_SCURLISTRecord rec = (HD_CO_1001_SCURLISTRecord)ds.curlist.get(i);
			//int record = rx.add(recordSet, "record", "");
			rx.add(dataSet, "emp_no", rec.emp_no);
			rx.add(dataSet, "nm_korn", rec.nm_korn);
			rx.add(dataSet, "dept_cd", rec.dept_cd);
			rx.add(dataSet, "dept_nm", rec.dept_nm);
			rx.add(dataSet, "dty_cd", rec.dty_cd);
			rx.add(dataSet, "dty_nm", rec.dty_nm);
			rx.add(dataSet, "posi_cd", rec.posi_cd);
			rx.add(dataSet, "posi_nm", rec.posi_nm);
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<emp_no/>
			<nm_korn/>
			<dept_cd/>
			<dept_nm/>
			<dty_cd/>
			<dty_nm/>
			<posi_cd/>
			<posi_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Thu Jul 16 11:11:54 KST 2009 */ %>