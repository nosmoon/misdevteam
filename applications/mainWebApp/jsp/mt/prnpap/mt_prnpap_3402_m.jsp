<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_3402_MDataSet ds = (MT_PRNPAP_3402_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		recordSet = rx.add(dataSet, "prp_std", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PRNPAP_3402_MCURLIST2Record rec = (MT_PRNPAP_3402_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "label", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}

		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
//		recordSet = rx.add(dataSet, "sect_621", "");

//		for(int i = 0; i < ds.curlist2.size(); i++) {
//			MT_PRNPAP_3402_MCURLIST2Record rec = (MT_PRNPAP_3402_MCURLIST2Record)ds.curlist2.get(i);
//			int record = rx.add(recordSet, "item", "");
//			rx.add(record, "value", rec.cd);
//			rx.add(record, "cdnm", rec.cdnm);
//			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
//			rx.add(record, "cdnm_cd", rec.cdnm_cd);
//			rx.add(record, "label", rec.cdabrvnm_cd);
//		}
//		rx.add(recordSet, "totalcnt", ds.curlist2.size());

		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "sect_cd", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PRNPAP_3402_MCURLIST1Record rec = (MT_PRNPAP_3402_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.addCData(record, "label", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "medi_cd", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_3402_MCURLISTRecord rec = (MT_PRNPAP_3402_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "label", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

		// recordSet = rx.add(dataSet, "sprot_pajiYul", ds.soprt_pajiyul);
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
	<CURLIST3>
		<record>
			<matr_cd/>
			<matr_nm/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<cd/>
			<cdnm/>
			<mang_cd_3/>
			<cd_abrv_nm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<cd/>
			<cdnm/>
			<mang_cd_3/>
			<cd_abrv_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Jun 22 13:39:57 KST 2009 */ %>