<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*
	,       chosun.ciis.co.base.util.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_1603_LDataSet ds = (HD_EVLU_1603_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_1603_LCURLISTRecord rec = (HD_EVLU_1603_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sel_chk", rec.sel_chk);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<sel_chk/>
			<dept_cd/>
			<emp_no/>
			<dept_nm/>
			<nm_korn/>
			<dty_nm/>
			<posi_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Mon May 18 16:03:25 KST 2009 */ %>