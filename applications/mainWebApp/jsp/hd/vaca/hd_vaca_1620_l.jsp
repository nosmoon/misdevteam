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
	HD_VACA_1620_LDataSet ds = (HD_VACA_1620_LDataSet)request.getAttribute("ds");
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
			HD_VACA_1620_LCURLISTRecord rec = (HD_VACA_1620_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "obj_dept_cd", rec.obj_dept_cd);
			rx.add(record, "obj_dept_nm", rec.obj_dept_nm);
			rx.add(record, "obj_emp_no", rec.obj_emp_no);
			rx.add(record, "obj_nm_korn", rec.obj_nm_korn);
			rx.add(record, "prv_aprv_emp_no", rec.prv_aprv_emp_no);
			rx.add(record, "prv_aprv_nm_korn", rec.prv_aprv_nm_korn);
			rx.add(record, "aft_aprv_emp_no", rec.aft_aprv_emp_no);
			rx.add(record, "aft_aprv_nm_korn", rec.aft_aprv_nm_korn);
			rx.add(record, "fr_dt", rec.fr_dt);
			rx.add(record, "to_dt", rec.to_dt);
			rx.add(record, "use_yn", rec.use_yn);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "obj_dept_cd", StringUtil.replaceToXml(rec.obj_dept_cd));
			//rx.add(record, "obj_dept_nm", StringUtil.replaceToXml(rec.obj_dept_nm));
			//rx.add(record, "obj_emp_no", StringUtil.replaceToXml(rec.obj_emp_no));
			//rx.add(record, "obj_nm_korn", StringUtil.replaceToXml(rec.obj_nm_korn));
			//rx.add(record, "prv_aprv_emp_no", StringUtil.replaceToXml(rec.prv_aprv_emp_no));
			//rx.add(record, "prv_aprv_nm_korn", StringUtil.replaceToXml(rec.prv_aprv_nm_korn));
			//rx.add(record, "aft_aprv_emp_no", StringUtil.replaceToXml(rec.aft_aprv_emp_no));
			//rx.add(record, "aft_aprv_nm_korn", StringUtil.replaceToXml(rec.aft_aprv_nm_korn));
			//rx.add(record, "fr_dt", StringUtil.replaceToXml(rec.fr_dt));
			//rx.add(record, "to_dt", StringUtil.replaceToXml(rec.to_dt));
			//rx.add(record, "use_yn", StringUtil.replaceToXml(rec.use_yn));
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
<hd_vaca_1620_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<seq/>
				<obj_dept_cd/>
				<obj_dept_nm/>
				<obj_emp_no/>
				<obj_nm_korn/>
				<prv_aprv_emp_no/>
				<prv_aprv_nm_korn/>
				<aft_aprv_emp_no/>
				<aft_aprv_nm_korn/>
				<fr_dt/>
				<to_dt/>
				<use_yn/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_1620_l>
*/
%>

<% /* 작성시간 : Wed Aug 22 17:05:36 KST 2018 */ %>