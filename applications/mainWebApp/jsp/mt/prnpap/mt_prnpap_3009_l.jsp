<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PRNPAP_3009_LDataSet ds = (MT_PRNPAP_3009_LDataSet)request.getAttribute("ds");
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
			MT_PRNPAP_3009_LCURLISTRecord rec = (MT_PRNPAP_3009_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "pap_cmpy", rec.pap_cmpy);
			rx.add(record, "paper_clsf_cd", rec.paper_clsf_cd);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "roll_wgt", rec.roll_wgt);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "pap_cmpy", StringUtil.replaceToXml(rec.pap_cmpy));
			//rx.add(record, "paper_clsf_cd", StringUtil.replaceToXml(rec.paper_clsf_cd));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "roll_wgt", StringUtil.replaceToXml(rec.roll_wgt));
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
<mt_prnpap_3009_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<fac_clsf/>
				<pap_cmpy/>
				<paper_clsf_cd/>
				<matr_cd/>
				<roll_wgt/>
			</record>
		</CURLIST>
	</dataSet>
</mt_prnpap_3009_l>
*/
%>

<% /* 작성시간 : Wed Jul 22 00:41:43 KST 2009 */ %>