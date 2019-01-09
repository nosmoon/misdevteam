<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_6020_MDataSet ds = (FC_ACCT_6020_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	rx.add(dataSet, "xx_ss_cmpycd", ds.xx_ss_cmpycd);

	try {
		/****** CURMEDI_CDLIST BEGIN */
		recordSet = rx.add(dataSet, "CURMEDI_CDLIST", "");

		for(int i = 0; i < ds.curmedi_cdlist.size(); i++) {
			FC_ACCT_6020_MCURMEDI_CDLISTRecord rec = (FC_ACCT_6020_MCURMEDI_CDLISTRecord)ds.curmedi_cdlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.curmedi_cdlist.size());
		/****** CURMEDI_CDLIST END */

		/****** CURSLIP_CLSF_CDLIST BEGIN */
		recordSet = rx.add(dataSet, "CURSLIP_CLSF_CDLIST", "");

		for(int i = 0; i < ds.curslip_clsf_cdlist.size(); i++) {
			FC_ACCT_6020_MCURSLIP_CLSF_CDLISTRecord rec = (FC_ACCT_6020_MCURSLIP_CLSF_CDLISTRecord)ds.curslip_clsf_cdlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
		}
		rx.add(recordSet, "totalcnt", ds.curslip_clsf_cdlist.size());
		/****** CURSLIP_CLSF_CDLIST END */

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
	<CURMEDI_CDLIST>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CURMEDI_CDLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURSLIP_CLSF_CDLIST>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CURSLIP_CLSF_CDLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 06 09:44:30 KST 2009 */ %>