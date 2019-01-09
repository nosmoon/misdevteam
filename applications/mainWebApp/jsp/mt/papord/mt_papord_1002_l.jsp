<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_1002_LDataSet ds = (MT_PAPORD_1002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		recordSet = rx.add(dataSet,"mt_papord_1002_l","");
		//중량
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPORD_1002_LCURLIST2Record rec = (MT_PAPORD_1002_LCURLIST2Record)ds.curlist2.get(i);
			rx.add(recordSet, "roll_wgt", rec.roll_wgt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		
		//Data 유무 확인
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_1002_LCURLISTRecord rec = (MT_PAPORD_1002_LCURLISTRecord)ds.curlist.get(i);
			rx.add(recordSet, "cnt", rec.cnt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());

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
	<CURLIST2>
		<record>
			<cmpy_cd/>
			<fac_clsf/>
			<matr_cd/>
			<roll_wgt/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cnt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 06 16:45:43 KST 2009 */ %>