<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_1171_LDataSet ds = (FC_FUNC_1171_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_FUNC_1171_LCURLIST2Record rec = (FC_FUNC_1171_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "thdd_mtry_extnc", rec.thdd_mtry_extnc);
			rx.add(record, "thdd_mtry_extnc", StringUtil.replaceToXml(rec.thdd_mtry_extnc));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_FUNC_1171_LCURLIST1Record rec = (FC_FUNC_1171_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "mtry_dt", rec.mtry_dt);
			//rx.add(record, "note_amtsum", rec.note_amtsum);
			rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			rx.add(record, "note_amtsum", StringUtil.replaceToXml(rec.note_amtsum));
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
<fc_func_1171_l>
	<dataSet>
		<CURLIST2>
			<record>
				<thdd_mtry_extnc/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_func_1171_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_func_1171_l>
	<dataSet>
		<CURLIST1>
			<record>
				<mtry_dt/>
				<note_amtsum/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_func_1171_l>
*/
%>

<% /* 작성시간 : Tue Jul 14 15:07:18 KST 2009 */ %>