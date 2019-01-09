<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.com.rec.*
	,	chosun.ciis.hd.com.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_COM_1103_LDataSet ds = (HD_COM_1103_LDataSet)request.getAttribute("ds");
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
			HD_COM_1103_LCURLISTRecord rec = (HD_COM_1103_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "abrv_nm", rec.abrv_nm);
			rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			//rx.add(record, "cnt", StringUtil.replaceToXml(rec.cnt));
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
<hd_com_1103_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<abrv_nm/>
				<cnt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_com_1103_l>
*/
%>

<% /* �ۼ��ð� : Mon Oct 26 19:45:47 KST 2009 */ %>