<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_8101_LDataSet ds = (MT_COMMATR_8101_LDataSet)request.getAttribute("ds");
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
			MT_COMMATR_8101_LCURLISTRecord rec = (MT_COMMATR_8101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "factcdnm", rec.factcdnm);
			rx.add(record, "pj_kind", rec.pj_kind);
			rx.add(record, "pj_kind_nm", rec.pj_kind_nm);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "tot_amt", rec.tot_amt);
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "factcdnm", StringUtil.replaceToXml(rec.factcdnm));
			//rx.add(record, "pj_kind", StringUtil.replaceToXml(rec.pj_kind));
			//rx.add(record, "pj_kind_nm", StringUtil.replaceToXml(rec.pj_kind_nm));
			//rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
			//rx.add(record, "uprc", StringUtil.replaceToXml(rec.uprc));
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
<mt_commatr_8101_l>
	<dataSet>
		<CURLIST>
			<record>
				<fac_clsf/>
				<factcdnm/>
				<pj_kind/>
				<pj_kind_nm/>
				<qunt/>
				<uprc/>
			</record>
		</CURLIST>
	</dataSet>
</mt_commatr_8101_l>
*/
%>

<% /* 작성시간 : Tue May 14 17:30:53 KST 2013 */ %>