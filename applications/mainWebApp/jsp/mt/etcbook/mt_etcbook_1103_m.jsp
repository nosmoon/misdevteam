<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.etcbook.rec.*
	,	chosun.ciis.mt.etcbook.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCBOOK_1103_MDataSet ds = (MT_ETCBOOK_1103_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
    int resSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST1", "");
        resSet = rx.add(root, "tempData", "");
        dataSet = rx.add(resSet, "gip", "");
System.out.println("#############ds.curlist1.size() : " + ds.curlist1.size());
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_ETCBOOK_1103_MCURLIST1Record rec = (MT_ETCBOOK_1103_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(dataSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);	
System.out.println("###########rec.cd : " + rec.cd );
System.out.println("###########rec.cdnm_cd : " + rec.cdnm_cd );
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
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Mar 11 11:23:36 KST 2009 */ %>