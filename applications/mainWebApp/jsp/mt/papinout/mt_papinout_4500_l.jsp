<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_4500_LDataSet ds = (MT_PAPINOUT_4500_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_4500_LCURLISTRecord rec = (MT_PAPINOUT_4500_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rowCnt", (i+1));
			rx.add(record, "cut_err_occr_dt", rec.cut_err_occr_dt);
			rx.add(record, "fac_nm", rec.fac_clsf + " " + rec.fac_nm);
			rx.add(record, "papcmpy_nm", rec.papcmpy_cd + " " + rec.papcmpy_nm);
			rx.add(record, "cut_err_tms", rec.cut_err_tms);
			rx.add(record, "prt_wgt", rec.prt_wgt);
			rx.add(record, "cut_err_wgt", rec.cut_err_wgt);
			rx.add(record, "cut_pap", rec.cut_pap);
			rx.add(record, "cut_pap_wgt", rec.cut_pap_wgt);
			rx.add(record, "remk", rec.remk);
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<cut_err_occr_dt/>
			<fac_clsf/>
			<fac_nm/>
			<papcmpy_cd/>
			<papcmpy_nm/>
			<cut_err_tms/>
			<prt_wgt/>
			<cut_err_wgt/>
			<cut_pap/>
			<cut_pap_wgt/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Wed Apr 29 16:15:56 KST 2009 */ %>