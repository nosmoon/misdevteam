<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_7000_LDataSet ds = (HD_AFFR_7000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		depth1 = rx.add(dataSet, "certi_clsf_cd", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_7000_LCURLISTRecord rec = (HD_AFFR_7000_LCURLISTRecord)ds.curlist.get(i);
			if ("CERTI_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
		
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
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
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Tue Mar 17 17:14:35 KST 2009 */ %>