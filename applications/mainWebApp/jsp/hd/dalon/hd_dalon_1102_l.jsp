<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.dalon.rec.*
	,	chosun.ciis.hd.dalon.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DALON_1102_LDataSet ds = (HD_DALON_1102_LDataSet)request.getAttribute("ds");
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
			HD_DALON_1102_LCURLISTRecord rec = (HD_DALON_1102_LCURLISTRecord)ds.curlist.get(i);
			if ("APLY_BASI_DT".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
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

<% /* 작성시간 : Fri Mar 20 09:53:03 KST 2009 */ %>