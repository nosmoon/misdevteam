<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.com.rec.*
	,	chosun.ciis.hd.com.ds.*
	,   chosun.ciis.co.base.util.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_COM_1003_LDataSet ds = (HD_COM_1003_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData	= 0;
	int recordSet	= 0;
	int dataSet		= 0;
	int depth1		= 0;
	recordSet = rx.add(root, "tempData", "");

	try {
		depth1 = rx.add(recordSet, "dept", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_COM_1003_LCURLISTRecord rec = (HD_COM_1003_LCURLISTRecord)ds.curlist.get(i);
			if ("DEPT".equals(rec.getDept_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.dept);
				rx.add(record, "label", StringUtil.replaceToXml(rec.abrv_nm));
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
			<lvl/>
			<dept_type/>
			<abrv_nm/>
			<dept_cd/>
			<abrv_cd/>
			<dept_sub/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 12 20:12:41 KST 2009 */ %>