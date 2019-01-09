<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_4300_LDataSet ds = (HD_SALY_4300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		
		depth1 = rx.add(dataSet, "seiz_clsf", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_4300_LCURLISTRecord rec = (HD_SALY_4300_LCURLISTRecord)ds.curlist.get(i);
			if ("SEIZ_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(dataSet, "repay_clsf", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_4300_LCURLISTRecord rec = (HD_SALY_4300_LCURLISTRecord)ds.curlist.get(i);
			if ("REPAY_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(dataSet, "gubun_clsf", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_4300_LCURLISTRecord rec = (HD_SALY_4300_LCURLISTRecord)ds.curlist.get(i);
			if ("gubun_clsf".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
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

<% /* 작성시간 : Wed May 20 10:56:47 KST 2009 */ %>