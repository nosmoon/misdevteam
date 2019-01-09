<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_5300_LDataSet ds = (HD_INFO_5300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_5300_LCURLISTRecord rec = (HD_INFO_5300_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");		
			rx.add(record, "proc_stat_yes", "");
			rx.add(record, "proc_stat_no", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "proc_clsf", rec.proc_clsf);
			rx.add(record, "proc_clsf_nm", rec.proc_clsf_nm);
			rx.add(record, "contents_view", rec.contents_view);
			rx.add(record, "proc_stat_nm", rec.proc_stat_nm);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sub_seq", rec.sub_seq);
			rx.add(record, "occr_dt", rec.occr_dt);	
			rx.add(record, "proc_stat", rec.proc_stat);
			
			
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
			<dept_nm/>
			<emp_no/>
			<nm_korn/>
			<dty_nm/>
			<posi_nm/>
			<proc_clsf/>
			<proc_clsf_nm/>
			<occr_dt/>
			<contents_view/>
			<proc_stat_nm/>
			<remark/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 14 11:48:31 KST 2009 */ %>