<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.etcimpt.rec.*
	,	chosun.ciis.mt.etcimpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_ETCIMPT_1000_MDataSet ds = (MT_ETCIMPT_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
 
	try {
        //수입방법
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "impt_clsf", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_ETCIMPT_1000_MCURLIST4Record rec = (MT_ETCIMPT_1000_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
		//	rx.add(record, "cdnm", rec.cdnm);
		//	rx.add(record, "mang_cd_3", rec.mang_cd_3);
			rx.add(record, "label", rec.cd + " " + rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

        //통화구분
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "offer_pric_curc_clsf", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_ETCIMPT_1000_MCURLIST3Record rec = (MT_ETCIMPT_1000_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "label", rec.cd + " " + rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

        //리스여부
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "leas_clsf", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_ETCIMPT_1000_MCURLIST2Record rec = (MT_ETCIMPT_1000_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "label", rec.cd + " " + rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

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
	<CURLIST4>
		<record>
			<cd/>
			<cdnm/>
			<mang_cd_3/>
			<cd_abrv_nm/>
		</record>
	</CURLIST4>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST3>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
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
			<cd_abrv_nm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<% /* 작성시간 : Thu May 14 16:14:53 KST 2009 */ %>