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
	FC_FUNC_1401_LDataSet ds = (FC_FUNC_1401_LDataSet)request.getAttribute("ds");
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
			FC_FUNC_1401_LCURLISTRecord rec = (FC_FUNC_1401_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "eenosb", rec.eenosb);
			rx.add(record, "note_clsf_cd_nm", rec.note_clsf_cd_nm);
			rx.add(record, "stcdnm", rec.stcdnm);
			rx.add(record, "stat_dt", rec.stat_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "note_amt", rec.note_amt);
			rx.add(record, "eejpno", rec.eejpno);
			rx.add(record, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record, "bank_cd_nm", rec.bank_cd_nm);
			rx.add(record, "pay_plac_cd_nm", rec.pay_plac_cd_nm);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "eecompnm", rec.eecompnm);
			rx.add(record, "eseecompcd", rec.eseecompcd);
			rx.add(record, "eseecompnm", rec.eseecompnm);
			rx.add(record, "eeghcdnm", rec.eeghcdnm);
			rx.add(record, "esjphno", rec.esjphno);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
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
<dataSet>
	<CURLIST>
		<record>
			<eenosb/>
			<note_clsf_cd_nm/>
			<stcdnm/>
			<stat_dt/>
			<mtry_dt/>
			<note_amt/>
			<eejpno/>
			<issu_pers_nm/>
			<bank_cd_nm/>
			<pay_plac_cd_nm/>
			<dlco_cd/>
			<eecompnm/>
			<eseecompcd/>
			<eseecompnm/>
			<eeghcdnm/>
			<esjphno/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 09 14:16:02 KST 2009 */ %>