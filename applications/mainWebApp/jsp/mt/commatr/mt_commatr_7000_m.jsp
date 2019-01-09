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
	MT_COMMATR_7000_MDataSet ds = (MT_COMMATR_7000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int dataSet = 0;
	int recordSet = 0;
	dataSet = rx.add(root, "tempData", "");
	tempData = rx.add(root, "tempData", "");
	
	try {
		
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "fact_cd", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_COMMATR_7000_MCURLIST1Record rec = (MT_COMMATR_7000_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "label", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		
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
<mt_commatr_6000_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_commatr_6000_m>
*/
%>

<% /* 작성시간 : Thu Jun 21 15:40:49 KST 2012 */ %>