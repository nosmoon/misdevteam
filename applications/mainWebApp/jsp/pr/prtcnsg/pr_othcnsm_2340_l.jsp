<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.prtcnsg.rec.*
	,	chosun.ciis.pr.prtcnsg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_OTHCNSM_2340_LDataSet ds = (PR_OTHCNSM_2340_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_OTHCNSM_2340_LCURLISTRecord rec = (PR_OTHCNSM_2340_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "ink_matr", rec.ink_matr);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "ink_uprc", rec.ink_uprc);
			//rx.add(record, "aply_dt", StringUtil.replaceToXml(rec.aply_dt));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
			//rx.add(record, "sect_nm", StringUtil.replaceToXml(rec.sect_nm));
			//rx.add(record, "ink_matr", StringUtil.replaceToXml(rec.ink_matr));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "ink_uprc", StringUtil.replaceToXml(rec.ink_uprc));
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
<pr_othcnsm_2340_l>
	<dataSet>
		<CURLIST>
			<record>
				<aply_dt/>
				<fac_clsf/>
				<fac_clsf_nm/>
				<medi_cd/>
				<sect_cd/>
				<sect_nm/>
				<ink_matr/>
				<matr_nm/>
				<ink_uprc/>
			</record>
		</CURLIST>
	</dataSet>
</pr_othcnsm_2340_l>
*/
%>

<% /* 작성시간 : Tue Sep 22 16:52:01 KST 2009 */ %>