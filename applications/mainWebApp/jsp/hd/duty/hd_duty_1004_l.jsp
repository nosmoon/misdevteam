<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.duty.rec.*
	,	chosun.ciis.hd.duty.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DUTY_1004_LDataSet ds = (HD_DUTY_1004_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1		= 0;
	int record		= 0;
	recordSet = rx.add(root, "tempData", "");

	try {
		depth1 = rx.add(recordSet, "hody_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DUTY_1004_LCURLISTRecord rec = (HD_DUTY_1004_LCURLISTRecord)ds.curlist.get(i);
			if ("HODY_CLSF".equals(rec.getCd_type())){
				record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		depth1 = rx.add(recordSet, "finish_dd_clsf", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DUTY_1004_LCURLISTRecord rec = (HD_DUTY_1004_LCURLISTRecord)ds.curlist.get(i);
			if ("FINISH_DD_CLSF".equals(rec.getCd_type())){
				record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
	}
	catch (Exception e) {
	}
	finally {
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

<% /* 작성시간 : Fri Mar 20 09:59:02 KST 2009 */ %>