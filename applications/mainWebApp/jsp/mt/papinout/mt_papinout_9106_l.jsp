<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_9106_LDataSet ds = (MT_PAPINOUT_9106_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PAPINOUT_9106_LCURLIST1Record rec = (MT_PAPINOUT_9106_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "gubun", rec.gubun);
			rx.add(record, "wiibgodat", (rec.wiibgodat.length() < 1 ) ? rec.wiibgodat : rec.wiibgodat.substring(0,4) + "-" + rec.wiibgodat.substring(4,6)+ "-" + rec.wiibgodat.substring(6,8) );
			rx.add(record, "wifactcd", rec.wifactcd);
			rx.add(record, "wifactnm", rec.wifactnm);
			rx.add(record, "wijjcd", rec.wijjcd);
			rx.add(record, "jcjjcdnm", rec.jcjjcdnm);
			rx.add(record, "jcjjcd", rec.jcjjcd);
			rx.add(record, "wiibgoroll", rec.wiibgoroll);
			rx.add(record, "wiibgowt", rec.wiibgowt);
			rx.add(record, "wiibgowt_b", rec.wiibgowt_b);
			rx.add(record, "wiibiyul", rec.wiibiyul);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
	<CURLIST1>
		<record>
			<gubun/>
			<wiibgodat/>
			<wifactcd/>
			<wifactnm/>
			<wijjcd/>
			<jcjjcdnm/>
			<jcjjcd/>
			<wiibgoroll/>
			<wiibgowt/>
			<wiibgowt_b/>
			<wiibiyul/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 22 18:01:19 KST 2009 */ %>