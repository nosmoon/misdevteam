<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_LNK_2000_MDataSet ds = (TN_LNK_2000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int comboSet = 0;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	comboSet = rx.add(root, "comboSet", "");
	dataSet  = rx.add(comboSet, "dataSet", "");

	try {
		/****** ERRORLIST BEGIN */
		recordSet = rx.add(dataSet, "errorlist", "");

		for(int i = 0; i < ds.errorlist.size(); i++) {
			TN_LNK_2000_MERRORLISTRecord rec = (TN_LNK_2000_MERRORLISTRecord)ds.errorlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.errorlist.size());
		/****** ERRORLIST END */

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
<tn_lnk_2000_m>
	<dataSet>
		<ERRORLIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</ERRORLIST>
	</dataSet>
</tn_lnk_2000_m>
*/
%>

<% /* 작성시간 : Thu Oct 13 15:12:43 KST 2016 */ %>