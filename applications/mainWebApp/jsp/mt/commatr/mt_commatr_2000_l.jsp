<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*
    ,   chosun.ciis.co.base.util.StringUtil;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_2000_LDataSet ds = (MT_COMMATR_2000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int griddep1=0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");
        griddep1 = rx.add(recordSet, "main", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_COMMATR_2000_LCURLISTRecord rec = (MT_COMMATR_2000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(griddep1, "record", "");
			rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			rx.add(record, "uprc_meda_dt", StringUtil.replaceToXml(rec.uprc_meda_dt));
			rx.add(record, "dlco_eps_no", rec.dlco_eps_no);
			rx.add(record, "setl_cond", rec.setl_cond);
			rx.add(record, "purc_uprc", rec.purc_uprc);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
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
			<matr_cd/>
			<matr_nm/>
			<uprc_meda_dt/>
			<dlco_eps_no/>
			<setl_cond/>
			<purc_uprc/>
			<remk/>
			<dlco_nm/>
			<dlco_no/>
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 17 11:38:11 KST 2009 */ %>