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
	MT_CLOSE_1000_LDataSet ds = (MT_CLOSE_1000_LDataSet)request.getAttribute("ds");
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
			MT_CLOSE_1000_LCURLISTRecord rec = (MT_CLOSE_1000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aply_from_dt", rec.aply_from_dt);
			rx.add(record, "aply_to_dt", rec.aply_to_dt);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "matr_cd_nm", rec.matr_cd_nm);
			rx.add(record, "shet_qunt", rec.shet_qunt);
			rx.add(record, "matr_cd1", rec.matr_cd1);
			rx.add(record, "matr_cd2", rec.matr_cd2);
			rx.add(record, "matr_cd3", rec.matr_cd3);
			rx.add(record, "matr_cd4", rec.matr_cd4);
			rx.add(record, "matr_cd5", rec.matr_cd5);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "chemi_cd1", rec.chemi_cd1);
			rx.add(record, "chemi_cd2", rec.chemi_cd2);
			rx.add(record, "chemi_cd3", rec.chemi_cd3);
			rx.add(record, "chemi_cd4", rec.chemi_cd4);
			rx.add(record, "chemi_cd5", rec.chemi_cd5);
			//rx.add(record, "aply_from_dt", StringUtil.replaceToXml(rec.aply_from_dt));
			//rx.add(record, "aply_to_dt", StringUtil.replaceToXml(rec.aply_to_dt));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "matr_cd_nm", StringUtil.replaceToXml(rec.matr_cd_nm));
			//rx.add(record, "shet_qunt", StringUtil.replaceToXml(rec.shet_qunt));
			//rx.add(record, "matr_cd1", StringUtil.replaceToXml(rec.matr_cd1));
			//rx.add(record, "matr_cd2", StringUtil.replaceToXml(rec.matr_cd2));
			//rx.add(record, "matr_cd3", StringUtil.replaceToXml(rec.matr_cd3));
			//rx.add(record, "matr_cd4", StringUtil.replaceToXml(rec.matr_cd4));
			//rx.add(record, "matr_cd5", StringUtil.replaceToXml(rec.matr_cd5));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "chemi_cd1", StringUtil.replaceToXml(rec.chemi_cd1));
			//rx.add(record, "chemi_cd2", StringUtil.replaceToXml(rec.chemi_cd2));
			//rx.add(record, "chemi_cd3", StringUtil.replaceToXml(rec.chemi_cd3));
			//rx.add(record, "chemi_cd4", StringUtil.replaceToXml(rec.chemi_cd4));
			//rx.add(record, "chemi_cd5", StringUtil.replaceToXml(rec.chemi_cd5));
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
<mt_close_1000_l>
	<dataSet>
		<CURLIST>
			<record>
				<aply_from_dt/>
				<aply_to_dt/>
				<fac_clsf_nm/>
				<matr_cd_nm/>
				<shet_qunt/>
				<matr_cd1/>
				<matr_cd2/>
				<matr_cd3/>
				<matr_cd4/>
				<matr_cd5/>
				<seq/>
				<fac_clsf/>
				<matr_cd/>
				<chemi_cd1/>
				<chemi_cd2/>
				<chemi_cd3/>
				<chemi_cd4/>
				<chemi_cd5/>
			</record>
		</CURLIST>
	</dataSet>
</mt_close_1000_l>
*/
%>

<% /* 작성시간 : Thu Jul 09 18:03:09 KST 2009 */ %>