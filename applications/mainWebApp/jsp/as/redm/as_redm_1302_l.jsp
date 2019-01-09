<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.as.redm.rec.*
	,	chosun.ciis.as.redm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_REDM_1302_LDataSet ds = (AS_REDM_1302_LDataSet)request.getAttribute("ds");
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
			AS_REDM_1302_LCURLISTRecord rec = (AS_REDM_1302_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "redm_mthd_cd", rec.redm_mthd_cd);
			rx.add(record, "cont_yys", rec.cont_yys);
			rx.add(record, "redm_rate", rec.redm_rate);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "incmg_pers_nm", rec.incmg_pers_nm);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "aply_dt", StringUtil.replaceToXml(rec.aply_dt));
			//rx.add(record, "redm_mthd_cd", StringUtil.replaceToXml(rec.redm_mthd_cd));
			//rx.add(record, "cont_yys", StringUtil.replaceToXml(rec.cont_yys));
			//rx.add(record, "redm_rate", StringUtil.replaceToXml(rec.redm_rate));
			//rx.add(record, "incmg_dt_tm", StringUtil.replaceToXml(rec.incmg_dt_tm));
			//rx.add(record, "incmg_pers_nm", StringUtil.replaceToXml(rec.incmg_pers_nm));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
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
<as_redm_1302_l>
	<dataSet>
		<CURLIST>
			<record>
				<aply_dt/>
				<redm_mthd_cd/>
				<cont_yys/>
				<redm_rate/>
				<incmg_dt_tm/>
				<incmg_pers_nm/>
				<cmpy_cd/>
			</record>
		</CURLIST>
	</dataSet>
</as_redm_1302_l>
*/
%>

<% /* 작성시간 : Thu May 07 10:00:06 KST 2009 */ %>