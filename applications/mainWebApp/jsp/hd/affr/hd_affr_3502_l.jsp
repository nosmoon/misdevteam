<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_3502_LDataSet ds = (HD_AFFR_3502_LDataSet)request.getAttribute("ds");
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
			HD_AFFR_3502_LCURLISTRecord rec = (HD_AFFR_3502_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sch_yyyy", rec.sch_yyyy);
			rx.add(record, "affr_gb", rec.affr_gb);
			rx.add(record, "affr_type_nm", rec.affr_type_nm);
			rx.add(record, "affr_amt", rec.affr_amt);
			//rx.add(record, "sch_yyyy", StringUtil.replaceToXml(rec.sch_yyyy));
			//rx.add(record, "affr_gb", StringUtil.replaceToXml(rec.affr_gb));
			//rx.add(record, "affr_type_nm", StringUtil.replaceToXml(rec.affr_type_nm));
			//rx.add(record, "affr_amt", StringUtil.replaceToXml(rec.affr_amt));
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
<hd_affr_3502_l>
	<dataSet>
		<CURLIST>
			<record>
				<sch_yyyy/>
				<affr_gb/>
				<affr_type_nm/>
				<affr_amt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_3502_l>
*/
%>

<% /* �ۼ��ð� : Mon Nov 02 20:06:03 KST 2009 */ %>