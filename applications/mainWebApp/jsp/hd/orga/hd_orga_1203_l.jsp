<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.orga.rec.*
	,	chosun.ciis.hd.orga.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_ORGA_1203_LDataSet ds = (HD_ORGA_1203_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "tempData", "");

	try {
		recordSet = rx.add(formData, "dept_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_ORGA_1203_LCURLISTRecord rec = (HD_ORGA_1203_LCURLISTRecord)ds.curlist.get(i);
			if (Integer.parseInt(rec.lvl) > 1){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "label", StringUtil.replaceToXml(rec.dept_nm));
				rx.add(record, "value", rec.dept_cd);
			}
		}
		
		recordSet = rx.add(formData, "supr_dept", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_ORGA_1203_LCURLISTRecord rec = (HD_ORGA_1203_LCURLISTRecord)ds.curlist.get(i);
			if (Integer.parseInt(rec.lvl) == 1){
				rx.add(recordSet, "supr_dept_cd", rec.dept_cd);
				rx.add(recordSet, "supr_dept_nm", StringUtil.replaceToXml(rec.dept_nm));
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
			<dept_nm/>
			<dept_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 18 19:19:57 KST 2009 */ %>