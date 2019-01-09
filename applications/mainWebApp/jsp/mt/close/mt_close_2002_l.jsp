<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.close.rec.*
	,	chosun.ciis.mt.close.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_CLOSE_2002_LDataSet ds = (MT_CLOSE_2002_LDataSet)request.getAttribute("ds");
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
			MT_CLOSE_2002_LCURLISTRecord rec = (MT_CLOSE_2002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "rqunt", rec.rqunt);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "bi_avg", rec.bi_avg);
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "rqunt", StringUtil.replaceToXml(rec.rqunt));
			//rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			//rx.add(record, "bi_avg", StringUtil.replaceToXml(rec.bi_avg));
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
<mt_close_2002_l>
	<dataSet>
		<CURLIST>
			<record>
				<fac_clsf/>
				<matr_cd/>
				<medi_cd/>
				<sect_cd/>
				<cdnm/>
				<rqunt/>
				<qunt/>
				<amt/>
				<bi_avg/>
			</record>
		</CURLIST>
	</dataSet>
</mt_close_2002_l>
*/
%>

<% /* 작성시간 : Tue Jul 21 11:36:29 KST 2009 */ %>