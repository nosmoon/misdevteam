<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.co.rec.*
	,	chosun.ciis.mc.co.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_CO_1011_LDataSet ds = (MC_CO_1011_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MC_CO_1011_LCURLIST1Record rec = (MC_CO_1011_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cmpy_cd", rec.cmpy_cd);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "dept_team_clsf", rec.dept_team_clsf);
			//rx.add(record, "abrv_nm", rec.abrv_nm);
			//rx.add(record, "offi_nm", rec.offi_nm);
			//rx.add(record, "dept_team_nm", rec.dept_team_nm);
			//rx.add(record, "part_nm", rec.part_nm);
			//rx.add(record, "part_dn_nm", rec.part_dn_nm);
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "dept_team_clsf", StringUtil.replaceToXml(rec.dept_team_clsf));
			rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			rx.add(record, "offi_nm", StringUtil.replaceToXml(rec.offi_nm));
			rx.add(record, "dept_team_nm", StringUtil.replaceToXml(rec.dept_team_nm));
			rx.add(record, "part_nm", StringUtil.replaceToXml(rec.part_nm));
			rx.add(record, "part_dn_nm", StringUtil.replaceToXml(rec.part_dn_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<mc_co_1011_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cmpy_cd/>
				<dept_cd/>
				<dept_team_clsf/>
				<abrv_nm/>
				<offi_nm/>
				<dept_team_nm/>
				<part_nm/>
				<part_dn_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</mc_co_1011_l>
*/
%>

<% /* 작성시간 : Sat Apr 04 13:38:27 KST 2009 */ %>