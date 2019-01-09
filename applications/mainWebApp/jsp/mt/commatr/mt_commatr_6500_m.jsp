<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_6500_MDataSet ds = (MT_COMMATR_6500_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	tempData = rx.add(root, "tempData", "");
		
	try {
		/****** CURLIST1 BEGIN */	//
		int yyyy = rx.add( tempData , "yyyy" , "");
		int item2  = rx.add( yyyy , "item" , "");		
		for(int i = 0; i < ds.curlist1.size(); i++) {

			MT_COMMATR_6500_MCURLIST1Record rec = (MT_COMMATR_6500_MCURLIST1Record)ds.curlist1.get(i);
			item2  = rx.add( yyyy , "item" , "");		
			rx.add ( item2, "value", rec.yyyy);
			rx.add ( item2, "label", rec.yyyy);
		} 

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_commatr_6500_m>
	<dataSet>
		<CURLIST1>
			<record>
				<yyyy/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_commatr_6500_m>
*/
%>

<% /* 작성시간 : Tue Sep 24 14:52:32 KST 2013 */ %>