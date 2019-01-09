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
	HD_COM_1101_LDataSet ds = (HD_COM_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int formData = 0;
	int recordSet = 0;

	try {
		
		dataSet = rx.add(root, "tempData", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_COM_1101_LCURLISTRecord rec = (HD_COM_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_team_clsf", rec.dept_team_clsf);
			rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			rx.add(record, "offi_nm", StringUtil.replaceToXml(rec.offi_nm));
			rx.add(record, "dept_team_nm", StringUtil.replaceToXml(rec.dept_team_nm));
			rx.add(record, "part_nm", StringUtil.replaceToXml(rec.part_nm));
			//rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "part_dn_nm", StringUtil.replaceToXml(rec.part_dn_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
			<dept_cd/>
			<dept_team_clsf/>
			<abrv_nm/>
			<offi_nm/>
			<dept_team_nm/>
			<part_nm/>
			<posi_nm/>
			<part_dn_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 04 13:19:37 KST 2009 */ %>