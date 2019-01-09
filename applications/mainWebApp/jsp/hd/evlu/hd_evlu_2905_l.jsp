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
	HD_EVLU_2905_LDataSet ds = (HD_EVLU_2905_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	int dept_nm	= rx.add(dataSet, "dept_nm", ds.dept_nm);
	int emp_no	= rx.add(dataSet, "emp_no", ds.emp_no);
	int nm_korn	= rx.add(dataSet, "nm_korn", ds.nm_korn);
	int evlu_cd	= rx.add(dataSet, "evlu_cd", ds.evlu_cd);
	int self_evlu_proc_stat	= rx.add(dataSet, "self_evlu_proc_stat", ds.self_evlu_proc_stat);
	int rfl_ratio_10		= rx.add(dataSet, "rfl_ratio_10", ds.rfl_ratio_10);
	int rfl_ratio_20		= rx.add(dataSet, "rfl_ratio_20", ds.rfl_ratio_20);
	int slf_achv_desc1	= rx.addCData(dataSet, "slf_achv_desc1", ds.slf_achv_desc1 );
	int slf_achv_desc2	= rx.addCData(dataSet, "slf_achv_desc2", ds.slf_achv_desc2);
	
	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_EVLU_2905_LCURLIST2Record rec = (HD_EVLU_2905_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "act_indx_def", rec.act_indx_def);
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "act_indx_def", StringUtil.replaceToXml(rec.act_indx_def));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_EVLU_2905_LCURLIST1Record rec = (HD_EVLU_2905_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "act_indx_def", rec.act_indx_def);
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "act_indx_def", StringUtil.replaceToXml(rec.act_indx_def));
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
<hd_evlu_2905_l>
	<dataSet>
		<CURLIST2>
			<record>
				<cdnm/>
				<act_indx_def/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_evlu_2905_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_evlu_2905_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cdnm/>
				<act_indx_def/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_evlu_2905_l>
*/
%>

<% /* 작성시간 : Mon Sep 05 10:51:12 KST 2016 */ %>