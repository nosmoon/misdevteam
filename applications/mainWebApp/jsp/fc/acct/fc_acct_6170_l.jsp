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
	FC_ACCT_6170_LDataSet ds = (FC_ACCT_6170_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_6170_LCURLISTRecord rec = (FC_ACCT_6170_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.addCData(record, "col1", rec.col1); // 구분
			rx.addCData(record, "col2", rec.col2); // ERN
			rx.addCData(record, "col3", rec.col3); // 거래처명
			rx.addCData(record, "col4", rec.col4); // 건수
			rx.addCData(record, "col5", rec.col5); // 공급가액
			rx.addCData(record, "col6", rec.col6); // 부가세
			rx.addCData(record, "col7", rec.col7); // 전자건수
			rx.addCData(record, "col8", rec.col8); // 전자공급가액
			rx.addCData(record, "col9", rec.col9); // 전자부가세
			rx.addCData(record, "col10", rec.col10); // 건수차이
			rx.addCData(record, "col11", rec.col11); // 공급가액차이
			rx.addCData(record, "col12", rec.col12); // 부가세차이
			//rx.add(record, "col1", StringUtil.replaceToXml(rec.col1));
			//rx.add(record, "col2", StringUtil.replaceToXml(rec.col2));
			//rx.add(record, "col3", StringUtil.replaceToXml(rec.col3));
			//rx.add(record, "col4", StringUtil.replaceToXml(rec.col4));
			//rx.add(record, "col5", StringUtil.replaceToXml(rec.col5));
			//rx.add(record, "col6", StringUtil.replaceToXml(rec.col6));
			//rx.add(record, "col7", StringUtil.replaceToXml(rec.col7));
			//rx.add(record, "col8", StringUtil.replaceToXml(rec.col8));
			//rx.add(record, "col9", StringUtil.replaceToXml(rec.col9));
			//rx.add(record, "col10", StringUtil.replaceToXml(rec.col10));
			//rx.add(record, "col11", StringUtil.replaceToXml(rec.col11));
			//rx.add(record, "col12", StringUtil.replaceToXml(rec.col12));
		}
		
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */
		
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_6170_LCURLIST2Record rec = (FC_ACCT_6170_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.addCData(record, "col1", rec.col1); // 구분
			rx.addCData(record, "col2", rec.col2); // ERN
			rx.addCData(record, "col3", rec.col3); // 거래처명
			rx.addCData(record, "col4", rec.col4); // 건수
			rx.addCData(record, "col5", rec.col5); // 공급가액
			rx.addCData(record, "col6", rec.col6); // 부가세
			rx.addCData(record, "col7", rec.col7); // 전자건수
			rx.addCData(record, "col8", rec.col8); // 전자공급가액
			rx.addCData(record, "col9", rec.col9); // 전자부가세
			rx.addCData(record, "col10", rec.col10); // 건수차이
			rx.addCData(record, "col11", rec.col11); // 공급가액차이
			rx.addCData(record, "col12", rec.col12); // 부가세차이
			//rx.add(record, "col1", StringUtil.replaceToXml(rec.col1));
			//rx.add(record, "col2", StringUtil.replaceToXml(rec.col2));
			//rx.add(record, "col3", StringUtil.replaceToXml(rec.col3));
			//rx.add(record, "col4", StringUtil.replaceToXml(rec.col4));
			//rx.add(record, "col5", StringUtil.replaceToXml(rec.col5));
			//rx.add(record, "col6", StringUtil.replaceToXml(rec.col6));
			//rx.add(record, "col7", StringUtil.replaceToXml(rec.col7));
			//rx.add(record, "col8", StringUtil.replaceToXml(rec.col8));
			//rx.add(record, "col9", StringUtil.replaceToXml(rec.col9));
			//rx.add(record, "col10", StringUtil.replaceToXml(rec.col10));
			//rx.add(record, "col11", StringUtil.replaceToXml(rec.col11));
			//rx.add(record, "col12", StringUtil.replaceToXml(rec.col12));
		}
		
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST END */

		recordSet = rx.add(dataSet, "TOTLIST", "");

		for(int i = 0; i < ds.totlist.size(); i++) {
			FC_ACCT_6170_LTOTLISTRecord rec = (FC_ACCT_6170_LTOTLISTRecord)ds.totlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.addCData(record, "tax_clsf", rec.tax_clsf); // 구분
			rx.addCData(record, "clsf", rec.clsf); // ERN
			rx.addCData(record, "erp", rec.erp); // 거래처명
			rx.addCData(record, "ksc", rec.ksc); // 건수
			rx.addCData(record, "erp_ksc", rec.erp_ksc); // 공급가액
		}
		rx.add(recordSet, "totalcnt2", ds.totlist.size());
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
<fc_acct_6170_m>
	<dataSet>
		<CURLIST>
			<record>
				<col1/>
				<col2/>
				<col3/>
				<col4/>
				<col5/>
				<col6/>
				<col7/>
				<col8/>
				<col9/>
				<col10/>
				<col11/>
				<col12/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_6170_m>
*/
%>

<% /* 작성시간 : Wed Mar 28 11:51:12 KST 2012 */ %>