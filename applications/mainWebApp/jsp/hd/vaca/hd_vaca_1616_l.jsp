<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_1616_LDataSet ds = (HD_VACA_1616_LDataSet)request.getAttribute("ds");
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
			HD_VACA_1616_LCURLISTRecord rec = (HD_VACA_1616_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "rptv_posi_cd", rec.rptv_posi_cd);
			rx.add(record, "rptv_posi_nm", rec.rptv_posi_nm);
			rx.add(record, "year_add_vaca", rec.year_add_vaca);
			rx.add(record, "use_vaca_dds", rec.use_vaca_dds);
			rx.add(record, "rmn_vaca_dds", rec.rmn_vaca_dds);
			rx.add(record, "alvc_vaca_cnt", rec.alvc_vaca_cnt);
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "rptv_posi_cd", StringUtil.replaceToXml(rec.rptv_posi_cd));
			//rx.add(record, "rptv_posi_nm", StringUtil.replaceToXml(rec.rptv_posi_nm));
			//rx.add(record, "year_add_vaca", StringUtil.replaceToXml(rec.year_add_vaca));
			//rx.add(record, "use_vaca_dds", StringUtil.replaceToXml(rec.use_vaca_dds));
			//rx.add(record, "rmn_vaca_dds", StringUtil.replaceToXml(rec.rmn_vaca_dds));
			//rx.add(record, "alvc_vaca_cnt", StringUtil.replaceToXml(rec.alvc_vaca_cnt));
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
<hd_vaca_1616_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<nm_korn/>
				<dept_cd/>
				<dept_nm/>
				<rptv_posi_cd/>
				<rptv_posi_nm/>
				<year_add_vaca/>
				<use_vaca_dds/>
				<rmn_vaca_dds/>
				<alvc_vaca_cnt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_1616_l>
*/
%>

<% /* 작성시간 : Tue Nov 02 14:34:11 KST 2010 */ %>