<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.co.rec.*
	,	chosun.ciis.fc.co.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_CO_1041_LDataSet ds = (FC_CO_1041_LDataSet)request.getAttribute("ds");
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
			FC_CO_1041_LCURLISTRecord rec = (FC_CO_1041_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seci_clsf_cd", rec.seci_clsf_cd);
			rx.add(record, "seci_no", rec.seci_no);
			rx.add(record, "comp_dt", rec.comp_dt);
			rx.add(record, "mtry_dt", rec.mtry_dt);
			rx.add(record, "face_val_amt", rec.face_val_amt);
			rx.add(record, "seci_clsf_cd1", rec.seci_clsf_cd1);
			//rx.add(record, "seci_clsf_cd", StringUtil.replaceToXml(rec.seci_clsf_cd));
			//rx.add(record, "seci_no", StringUtil.replaceToXml(rec.seci_no));
			//rx.add(record, "comp_dt", StringUtil.replaceToXml(rec.comp_dt));
			//rx.add(record, "mtry_dt", StringUtil.replaceToXml(rec.mtry_dt));
			//rx.add(record, "face_val_amt", StringUtil.replaceToXml(rec.face_val_amt));
			//rx.add(record, "seci_clsf_cd1", StringUtil.replaceToXml(rec.seci_clsf_cd1));
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
<fc_co_1041_l>
	<dataSet>
		<CURLIST>
			<record>
				<seci_clsf_cd/>
				<seci_no/>
				<comp_dt/>
				<mtry_dt/>
				<face_val_amt/>
				<seci_clsf_cd1/>
			</record>
		</CURLIST>
	</dataSet>
</fc_co_1041_l>
*/
%>

<% /* 작성시간 : Sat Apr 11 18:11:36 KST 2009 */ %>