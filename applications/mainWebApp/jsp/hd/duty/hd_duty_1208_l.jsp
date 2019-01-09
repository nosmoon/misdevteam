<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.duty.rec.*
	,	chosun.ciis.hd.duty.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DUTY_1208_LDataSet ds = (HD_DUTY_1208_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int record = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int depth1		= 0;
	recordSet = rx.add(root, "dataSet", "");

	try {
		depth1 = rx.add(recordSet, "proc_stat", "");
		record = rx.add(depth1, "item", "");
		rx.add(record, "value", "");
		//rx.add(record, "value", "");
		rx.add(record, "label", "전체");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DUTY_1208_LCURLISTRecord rec = (HD_DUTY_1208_LCURLISTRecord)ds.curlist.get(i);
			if ("PROC_STAT".equals(rec.getCd_type())){
				record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
	}
	catch (Exception e) {
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
<hd_duty_1208_l>
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
</hd_duty_1208_l>
*/
%>

<% /* 작성시간 : Thu Aug 23 15:02:09 KST 2012 */ %>