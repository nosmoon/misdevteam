<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_5005_LDataSet ds = (MT_PAPORD_5005_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "conf", "");

		//for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPORD_5005_LCURLIST1Record rec = (MT_PAPORD_5005_LCURLIST1Record)ds.curlist1.get(0);
			//int record = rx.add(recordSet, "record", "");
			rx.add(recordSet, "cmpy_cd", rec.cmpy_cd);
			rx.add(recordSet, "fac_clsf", rec.fac_clsf);
			rx.add(recordSet, "max_ewh_wgt", rec.max_ewh_wgt);
			rx.add(recordSet, "std_ewh_roll_cnt_a", rec.std_ewh_roll_a);
			rx.add(recordSet, "std_ewh_roll_cnt_b", rec.std_ewh_roll_b);
			rx.add(recordSet, "std_ewh_roll_cnt_c", rec.std_ewh_roll_c);
			rx.add(recordSet, "std_ewh_wgt_a", rec.std_ewh_wgt_a);
			rx.add(recordSet, "std_ewh_wgt_b", rec.std_ewh_wgt_b);
			rx.add(recordSet, "std_ewh_wgt_c", rec.std_ewh_wgt_c);
			rx.add(recordSet, "amss_wgt_a", rec.amss_wgt_a);
			rx.add(recordSet, "amss_wgt_b", rec.amss_wgt_b);
			rx.add(recordSet, "amss_wgt_c", rec.amss_wgt_c);
			rx.add(recordSet, "roll_cnt_a", rec.roll_cnt_a);
			rx.add(recordSet, "roll_cnt_b", rec.roll_cnt_b);
			rx.add(recordSet, "roll_cnt_c", rec.roll_cnt_c);
		//}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "papcmpy_cd", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPORD_5005_LCURLIST2Record rec2 = (MT_PAPORD_5005_LCURLIST2Record)ds.curlist2.get(0);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "papcmpy_cd", rec2.papcmpy_cd);
			rx.add(record, "papcmpy_ratio", rec2.papcmpy_ratio);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
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
			<cmpy_cd/>
			<fac_clsf/>
			<max_ewh_roll_cnt_a/>
			<max_ewh_roll_cnt_b/>
			<max_ewh_roll_cnt_c/>
			<max_ewh_wgt_a/>
			<max_ewh_wgt_b/>
			<max_ewh_wgt_c/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jun 30 09:32:24 KST 2009 */ %>