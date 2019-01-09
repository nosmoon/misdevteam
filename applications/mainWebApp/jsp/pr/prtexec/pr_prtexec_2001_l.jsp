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
	PR_PRTEXEC_2001_LDataSet ds = (PR_PRTEXEC_2001_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	formData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PRTEXEC_2001_LCURLISTRecord rec = (PR_PRTEXEC_2001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "week", rec.week);
			rx.add(record, "tot_pcnt", rec.tot_pcnt);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "sect_pcnt", rec.sect_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
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
			<cmpy_cd/>
			<medi_cd/>
			<medi_nm/>
			<issu_dt/>
			<week/>
			<tot_pcnt/>
			<sect_cd/>
			<sect_nm/>
			<sect_pcnt/>
			<clr_pcnt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Apr 18 16:29:28 KST 2009 */ %>