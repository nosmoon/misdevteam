<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.com.rec.*
	,	chosun.ciis.hd.com.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_COM_1001_LDataSet ds = (HD_COM_1001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData	= 0;
	int recordSet	= 0;
	int dataSet		= 0;
	int depth1		= 0;
	recordSet = rx.add(root, "tempData", "");

	try {
		depth1 = rx.add(recordSet, "offi", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_COM_1001_LCURLISTRecord rec = (HD_COM_1001_LCURLISTRecord)ds.curlist.get(i);
			if ("OFFI".equals(rec.getDept_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.dept_cd);
				rx.add(record, "label", StringUtil.replaceToXml(rec.abrv_nm));
				rx.add(record, "sub", rec.dept_sub);
			}
		}
		
		depth1 = rx.add(recordSet, "dept", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_COM_1001_LCURLISTRecord rec = (HD_COM_1001_LCURLISTRecord)ds.curlist.get(i);
			if ("DEPT".equals(rec.getDept_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.dept_cd);
				rx.add(record, "label", StringUtil.replaceToXml(rec.abrv_nm));
			}
		}
		
		depth1 = rx.add(recordSet, "emp_clsf_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_COM_1001_LCURLISTRecord rec = (HD_COM_1001_LCURLISTRecord)ds.curlist.get(i);
			if ("EMP_CLSF_CD".equals(rec.getDept_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.dept_cd);
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

<% /* 작성시간 : Wed Apr 01 14:15:47 KST 2009 */ %>