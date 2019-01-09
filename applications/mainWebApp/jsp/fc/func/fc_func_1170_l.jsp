<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_1170_LDataSet ds = (FC_FUNC_1170_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
    int resData = 0;
    int gridData = 0;
	int dataSet = 0;
    int NOTEMTRY = 0;
    long note_amtsum_agg = 0;
    String errcode = "";
	String errmsg = "";

	resData = rx.add(root, "resData", "");
    gridData = rx.add(resData,"gridData","");
    dataSet = rx.add(gridData,"dataSet","");

	try {
		/****** NOTEMTRY BEGIN */
		NOTEMTRY = rx.add(dataSet, "NOTEMTRY", "");

		for(int i = 0; i < ds.notemtry.size(); i++) {
			FC_FUNC_1170_LNOTEMTRYRecord rec = (FC_FUNC_1170_LNOTEMTRYRecord)ds.notemtry.get(i);
			int record = rx.add(NOTEMTRY, "record", "");
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "note_amtsum", rec.note_amtsum);
            note_amtsum_agg = note_amtsum_agg + Integer.parseInt(rec.note_amtsum);
			rx.add(record, "note_amtsum_agg", note_amtsum_agg);
		}
		rx.add(gridData, "totalcnt", ds.notemtry.size());
		/****** NOTEMTRY END */
		rx.add(gridData, "note_amtsum", ds.getNote_amtsum());
		rx.add(gridData, "thdd_mtry_extnc", ds.getThdd_mtry_extnc());
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(resData, "errcode", errcode);
		rx.add(resData, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<NOTEMTRY>
		<record>
			<mtry_dt/>
			<note_amtsum/>
		</record>
	</NOTEMTRY>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 05 14:42:56 KST 2009 */ %>
