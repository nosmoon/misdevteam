<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.as.base.rec.*
	,	chosun.ciis.as.base.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AS_BASE_1002_LDataSet ds = (AS_BASE_1002_LDataSet)request.getAttribute("ds");
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
			AS_BASE_1002_LCURLISTRecord rec = (AS_BASE_1002_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "item_cd", rec.item_cd);
			rx.add(record, "item_nm", rec.item_nm);
			rx.add(record, "aset_cnt", rec.aset_cnt);
			rx.add(record, "unit_cd", rec.unit_cd);
			rx.add(record, "unit_nm", rec.unit_nm);
			rx.add(record, "redm_clsf", rec.redm_clsf);
			rx.add(record, "redm_clsf_nm", rec.redm_clsf_nm);
			rx.add(record, "redm_mthd_cd", rec.redm_mthd_cd);
			rx.add(record, "redm_mthd_cd_nm", rec.redm_mthd_cd_nm);
			rx.add(record, "svc_yys_cnt", rec.svc_yys_cnt);
			rx.add(record, "accd_cd", rec.accd_cd);
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_cd_nm", rec.budg_cd_nm);
			rx.add(record, "use_yn", rec.use_yn);
			rx.add(record, "incmg_pers_ipadd", rec.incmg_pers_ipadd);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
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
			<cmpy_cd/>
			<item_cd/>
			<item_nm/>
			<aset_cnt/>
			<unit_cd/>
			<unit_nm/>
			<redm_clsf/>
			<redm_clsf_nm/>
			<redm_mthd_cd/>
			<redm_mthd_cd_nm/>
			<svc_yys_cnt/>
			<accd_cd/>
			<budg_cd/>
			<budg_cd_nm/>
			<use_yn/>
			<incmg_pers_ipadd/>
			<incmg_pers/>
			<nm_korn/>
			<incmg_dt_tm/>
			<chg_pers/>
			<chg_dt_tm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Feb 19 20:00:59 KST 2009 */ %>