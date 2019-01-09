<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.edu.rec.*
	,	chosun.ciis.hd.edu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EDU_1100_LDataSet ds = (HD_EDU_1100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int formData = 0;
	int depth1		= 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	formData = rx.add(root, "tempData", "");


	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");
		depth1 = rx.add(formData, "dept_cd_1", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EDU_1100_LCURLISTRecord rec = (HD_EDU_1100_LCURLISTRecord)ds.curlist.get(i);
			if ("APRV_YN".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
			}
		}
		depth1 = rx.add(formData, "dept_cd_2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EDU_1100_LCURLISTRecord rec = (HD_EDU_1100_LCURLISTRecord)ds.curlist.get(i);
			if ("COMPLT_YN".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
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

<% /* 작성시간 : Thu Mar 12 17:28:24 KST 2009 */ %>