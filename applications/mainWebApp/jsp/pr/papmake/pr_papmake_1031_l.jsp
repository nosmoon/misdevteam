<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PAPMAKE_1031_LDataSet ds = (PR_PAPMAKE_1031_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
    int seq1      = 1;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_PAPMAKE_1031_LCURLISTRecord rec = (PR_PAPMAKE_1031_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "duty_dt", rec.duty_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "ref_clsf", rec.ref_clsf);
			rx.add(record, "ref_clsf_nm", rec.ref_clsf_nm);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "ref_matt", rec.ref_matt);
            rx.add(record, "seq1",seq1);
            seq1++;
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
			<cmpy_cd/>
			<duty_dt/>
			<fac_clsf/>
			<ref_clsf/>
			<seq/>
			<ref_matt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 10 15:45:05 KST 2009 */ %>