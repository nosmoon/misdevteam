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
	HD_EVLU_6200_LDataSet ds = (HD_EVLU_6200_LDataSet)request.getAttribute("ds");
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
			HD_EVLU_6200_LCURLISTRecord rec = (HD_EVLU_6200_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rnum", rec.rnum);
			rx.add(record, "evlu_grp_cd", rec.evlu_grp_cd);
			rx.add(record, "evlu_grp_nm", rec.evlu_grp_nm);
			rx.add(record, "up_insd_dept_nm", rec.up_insd_dept_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "abrv_nm", rec.abrv_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "evlu_scor_1tms", rec.evlu_scor_1tms);
			rx.add(record, "evlu_scor_2tms", rec.evlu_scor_2tms);
			rx.add(record, "avg_scor", rec.avg_scor);
			rx.add(record, "dept_avg", rec.dept_avg);
			rx.add(record, "grp_avg", rec.grp_avg);
			rx.add(record, "rvis_scor", rec.rvis_scor);
			rx.add(record, "rank", rec.rank);
			rx.add(record, "percentage", rec.percentage);
			rx.add(record, "last_grad", rec.last_grad);
			rx.add(record, "up_nm_korn1", rec.up_nm_korn1);
			rx.add(record, "up_nm_korn2", rec.up_nm_korn2);
			rx.add(record, "rvis_end_yn", rec.rvis_end_yn);
			//rx.add(record, "rnum", StringUtil.replaceToXml(rec.rnum));
			//rx.add(record, "evlu_grp_cd", StringUtil.replaceToXml(rec.evlu_grp_cd));
			//rx.add(record, "evlu_grp_nm", StringUtil.replaceToXml(rec.evlu_grp_nm));
			//rx.add(record, "up_insd_dept_nm", StringUtil.replaceToXml(rec.up_insd_dept_nm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "evlu_scor_1tms", StringUtil.replaceToXml(rec.evlu_scor_1tms));
			//rx.add(record, "evlu_scor_2tms", StringUtil.replaceToXml(rec.evlu_scor_2tms));
			//rx.add(record, "avg_scor", StringUtil.replaceToXml(rec.avg_scor));
			//rx.add(record, "dept_avg", StringUtil.replaceToXml(rec.dept_avg));
			//rx.add(record, "grp_avg", StringUtil.replaceToXml(rec.grp_avg));
			//rx.add(record, "rvis_scor", StringUtil.replaceToXml(rec.rvis_scor));
			//rx.add(record, "rank", StringUtil.replaceToXml(rec.rank));
			//rx.add(record, "percentage", StringUtil.replaceToXml(rec.percentage));
			//rx.add(record, "last_grad", StringUtil.replaceToXml(rec.last_grad));
			//rx.add(record, "up_nm_korn1", StringUtil.replaceToXml(rec.up_nm_korn1));
			//rx.add(record, "up_nm_korn2", StringUtil.replaceToXml(rec.up_nm_korn2));
			//rx.add(record, "rvis_end_yn", StringUtil.replaceToXml(rec.rvis_end_yn));
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
<hd_evlu_6200_l>
	<dataSet>
		<CURLIST>
			<record>
				<rnum/>
				<evlu_grp_cd/>
				<evlu_grp_nm/>
				<up_insd_dept_nm/>
				<dept_cd/>
				<abrv_nm/>
				<emp_no/>
				<nm_korn/>
				<evlu_scor_1tms/>
				<evlu_scor_2tms/>
				<avg_scor/>
				<dept_avg/>
				<grp_avg/>
				<rvis_scor/>
				<rank/>
				<percentage/>
				<last_grad/>
				<up_nm_korn1/>
				<up_nm_korn2/>
				<rvis_end_yn/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_6200_l>
*/
%>

<% /* 작성시간 : Mon Oct 12 17:58:26 KST 2015 */ %>