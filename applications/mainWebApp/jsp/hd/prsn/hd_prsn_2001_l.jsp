<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.prsn.rec.*
	,	chosun.ciis.hd.prsn.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_PRSN_2001_LDataSet ds = (HD_PRSN_2001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_annc_clsf", ds.getXx_annc_clsf());
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "annc_clsf", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_PRSN_2001_LCURLISTRecord rec = (HD_PRSN_2001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "pgm_id", rec.pgm_id);
			rx.add(record, "pgm_nm", rec.pgm_nm);
			rx.add(record, "pgm_url", rec.pgm_url);
			rx.add(record, "job_clsf", rec.job_clsf);
			rx.add(record, "annc_link_clsf", rec.annc_link_clsf);
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
			<pgm_id/>
			<pgm_nm/>
			<pgm_url/>
			<job_clsf/>
			<annc_link_clsf/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Sun Apr 12 14:31:48 KST 2009 */ %>