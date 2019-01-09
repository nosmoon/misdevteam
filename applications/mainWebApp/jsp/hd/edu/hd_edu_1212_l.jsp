<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.edu.rec.*
	,	chosun.ciis.hd.edu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EDU_1212_LDataSet ds = (HD_EDU_1212_LDataSet)request.getAttribute("ds");
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
			HD_EDU_1212_LCURLISTRecord rec = (HD_EDU_1212_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//System.out.println("11111111111111111111");
			rx.add(record, "cont", rec.cont);
			//System.out.println(rec.cont);
			//System.out.println("222222222222222222222");
			//rx.add(record, "cont", StringUtil.replaceToXml(rec.cont));
			//System.out.println("333333333333333333333");
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
<hd_edu_1212_l>
	<dataSet>
		<CURLIST>
			<record>
				<cont/>
			</record>
		</CURLIST>
	</dataSet>
</hd_edu_1212_l>
*/
%>

<% /* �ۼ��ð� : Wed Aug 26 11:16:25 KST 2009 */ %>