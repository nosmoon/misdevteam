<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_5301_LDataSet ds = (HD_EVLU_5301_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_EVLU_5301_LCURLIST2Record rec = (HD_EVLU_5301_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "checked", rec.checked);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "row_chk", StringUtil.replaceToXml(rec.row_chk));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_5301_LCURLISTRecord rec = (HD_EVLU_5301_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "gbn", rec.gbn);
			//rx.add(record, "checked", rec.checked);
			//rx.add(record, "dept_cd", rec.dept_cd);
			//rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "insd_dept_cd", rec.insd_dept_cd);
			//rx.add(record, "abrv_nm", rec.abrv_nm);
			rx.add(record, "gbn", StringUtil.replaceToXml(rec.gbn));
			rx.add(record, "checked", StringUtil.replaceToXml(rec.checked));
			rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			rx.add(record, "insd_dept_cd", StringUtil.replaceToXml(rec.insd_dept_cd));
			rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
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
<hd_evlu_5301_l>
	<dataSet>
		<CURLIST2>
			<record>
				<checked/>
				<dept_cd/>
				<dept_nm/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_evlu_5301_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_evlu_5301_l>
	<dataSet>
		<CURLIST>
			<record>
				<gbn/>
				<checked/>
				<dept_cd/>
				<dept_nm/>
				<insd_dept_cd/>
				<abrv_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_5301_l>
*/
%>

<% /* 작성시간 : Wed Jun 03 15:03:47 KST 2009 */ %>