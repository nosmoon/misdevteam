<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2260_MDataSet ds = (FC_ACCT_2260_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	
	rx.add(dataSet, "xx_emp_no", ds.xx_emp_no);

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2260_MCURLISTRecord rec = (FC_ACCT_2260_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
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
<fc_acct_2260_m>
	<dataSet>
		<CURLIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_2260_m>
*/
%>

<% /* 작성시간 : Thu May 21 14:38:08 KST 2009 */ %>