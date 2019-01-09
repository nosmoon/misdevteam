<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_1104_MDataSet ds = (MT_COMMATR_1104_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	//int dataSet = 0;
	int recordSet = 0;
    int record = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	recordSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST3 BEGIN */
        record = rx.add(recordSet, "fac_clsf", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_COMMATR_1104_MCURLIST3Record rec = (MT_COMMATR_1104_MCURLIST3Record)ds.curlist3.get(i);
			int item = rx.add(record, "item", "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */
		
		/****** CURLIST4 BEGIN */
        record = rx.add(recordSet, "matr_clas", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_COMMATR_1104_MCURLIST4Record rec = (MT_COMMATR_1104_MCURLIST4Record)ds.curlist4.get(i);
			int item = rx.add(record, "item", "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST3 END */
		
		/****** CURLIST2 BEGIN */
        record = rx.add(recordSet, "dstb_rat_cd", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_COMMATR_1104_MCURLIST2Record rec = (MT_COMMATR_1104_MCURLIST2Record)ds.curlist2.get(i);
			int item = rx.add(record, "item", "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
        record = rx.add(recordSet, "unit", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_COMMATR_1104_MCURLIST1Record rec = (MT_COMMATR_1104_MCURLIST1Record)ds.curlist1.get(i);
			int item = rx.add(record, "item", "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(recordSet, "errcode", errcode);
		rx.add(recordSet, "errmsg", errmsg);
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
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
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
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 10 10:09:09 KST 2009 */ %>