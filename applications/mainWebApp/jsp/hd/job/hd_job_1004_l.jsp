<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.job.rec.*
	,	chosun.ciis.hd.job.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_JOB_1004_LDataSet ds = (HD_JOB_1004_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
		int record = rx.add(recordSet, "item", "");
		
			//record = rx.add(recordSet, "item", "");
			rx.add(record, "cd_type", "");
			rx.add(record, "cd", "");
			rx.add(record, "cdnm", "전체");
			rx.add(record, "cd_abrv_nm", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_JOB_1004_LCURLISTRecord rec = (HD_JOB_1004_LCURLISTRecord)ds.curlist.get(i);
			record = rx.add(recordSet, "item", "");
			rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cd_type", StringUtil.replaceToXml(rec.cd_type));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
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
<hd_job_1004_l>
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
</hd_job_1004_l>
*/
%>

<% /* 작성시간 : Tue Aug 25 19:13:02 KST 2009 */ %>