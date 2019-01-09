<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.prtexec.rec.*
	,	chosun.ciis.pr.prtexec.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTEXEC_1105_LDataSet ds = (PR_PRTEXEC_1105_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "tempData", "");

	try {
		recordSet = rx.add(formData, "medi_cd", "");
		String medi_cd = "";
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_1105_LCURLISTRecord rec = (PR_PRTEXEC_1105_LCURLISTRecord)ds.curlist.get(i);
			if (medi_cd.equals("")){
				medi_cd = rec.medi_cd;
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "value", rec.medi_cd);
				rx.add(record, "label", rec.medi_nm);
			} else {
				if (!medi_cd.equals(rec.medi_cd)){
					int record = rx.add(recordSet, "item", "");
					rx.add(record, "value", rec.medi_cd);
					rx.add(record, "label", rec.medi_nm);
				}
			}
		}
		
		recordSet = rx.add(formData, "sect_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_1105_LCURLISTRecord rec = (PR_PRTEXEC_1105_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.sect_cd);
			rx.add(record, "label", rec.sect_nm);
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
			<medi_cd/>
			<sect_cd/>
			<medi_nm/>
			<sect_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Jun 25 20:32:00 KST 2009 */ %>