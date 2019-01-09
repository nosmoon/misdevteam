<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.orga.rec.*
	,	chosun.ciis.hd.orga.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_ORGA_1101_LDataSet ds = (HD_ORGA_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "tempData", "");
	
	try {
		recordSet = rx.add(formData, "main", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_ORGA_1101_LCURLIST1Record rec = (HD_ORGA_1101_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "orga_reorga_dd", rec.orga_reorga_dd);
			rx.add(record, "orga_reorga_dd_nm", rec.orga_reorga_dd_nm);
			rx.addCData(record, "orga_reorga_resn", rec.orga_reorga_resn);//특수문자 가져올수 있도록 함 
		}
		
		recordSet = rx.add(formData, "orga_reorga_dd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_ORGA_1101_LCURLISTRecord rec = (HD_ORGA_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.orga_reorga_dd);
			rx.add(record, "label", rec.orga_reorga_dd_nm);
		}
		
		recordSet = rx.add(formData, "orga_reorga_dd1", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_ORGA_1101_LCURLIST1Record rec = (HD_ORGA_1101_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.orga_reorga_dd);
			rx.add(record, "label", rec.orga_reorga_dd_nm);
		}
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
			<cmpy_cd/>
			<orga_reorga_dd/>
			<orga_reorga_dd_nm/>
			<orga_reorga_resn/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Feb 17 21:40:34 KST 2009 */ %>