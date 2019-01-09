<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_1140_LDataSet ds = (MT_PAPINOUT_1140_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "resData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData3", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_1140_LCURLISTRecord rec = (MT_PAPINOUT_1140_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "papcmpy_cd", rec.papcmpy_cd);
			rx.add(record, "papcmpy_clsf", rec.papcmpy_clsf);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "ewh_roll", rec.ewh_roll);
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
<mt_papinout_1130_l>
	<dataSet>
		<CURLIST>
			<record>
				<roll_wgt10/>
				<roll_wgt20/>
				<roll_wgt22/>
				<roll_wgt25/>
				<roll_wgttot/>
			</record>
		</CURLIST>
	</dataSet>
</mt_papinout_1130_l>
*/
%>

<% /* 작성시간 : Tue Jul 31 09:28:05 KST 2012 */ %>