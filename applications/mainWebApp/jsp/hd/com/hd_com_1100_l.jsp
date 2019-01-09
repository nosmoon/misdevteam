<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.com.rec.*
	,	chosun.ciis.hd.com.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_COM_1100_LDataSet ds = (HD_COM_1100_LDataSet)request.getAttribute("ds");
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
			HD_COM_1100_LCURLISTRecord rec = (HD_COM_1100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_team_clsf", rec.dept_team_clsf);
			rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			rx.add(record, "offi_nm", rec.offi_nm);
			rx.add(record, "dept_team_nm", StringUtil.replaceToXml(rec.dept_team_nm));
			rx.add(record, "part_nm", StringUtil.replaceToXml(rec.part_nm));
			rx.add(record, "part_dn_nm", StringUtil.replaceToXml(rec.part_dn_nm));
			rx.add(record, "use_end_dt", StringUtil.replaceToXml(rec.use_end_dt));
			rx.add(record, "now_use_yn", StringUtil.replaceToXml(rec.now_use_yn));
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_team_clsf", StringUtil.replaceToXml(rec.dept_team_clsf));
			//rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			//rx.add(record, "offi_nm", StringUtil.replaceToXml(rec.offi_nm));
			//rx.add(record, "dept_team_nm", StringUtil.replaceToXml(rec.dept_team_nm));
			//rx.add(record, "part_nm", StringUtil.replaceToXml(rec.part_nm));
			//rx.add(record, "part_dn_nm", StringUtil.replaceToXml(rec.part_dn_nm));
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
<hd_com_1100_l>
	<dataSet>
		<CURLIST>
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
		</CURLIST>
	</dataSet>
</hd_com_1100_l>
*/
%>

<% /* 작성시간 : Fri Aug 28 14:20:15 KST 2009 */ %>