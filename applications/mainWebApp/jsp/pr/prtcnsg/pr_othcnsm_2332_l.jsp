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
	PR_OTHCNSM_2332_LDataSet ds = (PR_OTHCNSM_2332_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "datagrid1", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_OTHCNSM_2332_LCURLISTRecord rec = (PR_OTHCNSM_2332_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "psplat_clsf", rec.psplat_clsf);
			rx.add(record, "psplat_fee", rec.psplat_fee);
			rx.add(record, "gnaw_fee", rec.gnaw_fee);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "aply_dt", rec.aply_dt);
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
			//rx.add(record, "sect_nm", StringUtil.replaceToXml(rec.sect_nm));
			//rx.add(record, "psplat_clsf", StringUtil.replaceToXml(rec.psplat_clsf));
			//rx.add(record, "psplat_fee", StringUtil.replaceToXml(rec.psplat_fee));
			//rx.add(record, "gnaw_fee", StringUtil.replaceToXml(rec.gnaw_fee));
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "aply_dt", StringUtil.replaceToXml(rec.aply_dt));
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
<pr_othcnsm_2332_l>
	<dataSet>
		<CURLIST>
			<record>
				<medi_cd/>
				<sect_cd/>
				<sect_nm/>
				<psplat_clsf/>
				<psplat_fee/>
				<gnaw_fee/>
				<fac_clsf/>
				<aply_dt/>
			</record>
		</CURLIST>
	</dataSet>
</pr_othcnsm_2332_l>
*/
%>

<% /* 작성시간 : Wed Sep 23 12:12:09 KST 2009 */ %>