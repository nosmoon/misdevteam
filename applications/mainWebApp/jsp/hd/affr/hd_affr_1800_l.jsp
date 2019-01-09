<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_1800_LDataSet ds = (HD_AFFR_1800_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			
			HD_AFFR_1800_LCURLISTRecord rec = (HD_AFFR_1800_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			if(rec.sply_susp_yn.equals("10")){
				rec.sply_susp_yn = "true";							
			}
			if(rec.sply_susp_yn.equals("20")){
				rec.sply_susp_yn = "false";							
			}
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "child_flnm", rec.child_flnm);
			rx.add(record, "child_seqo", rec.child_seqo);
			rx.add(record, "child_bidt", rec.child_bidt);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "sply_strt_yymm", rec.sply_strt_yymm);
			rx.add(record, "sply_amt", rec.sply_amt);
			rx.add(record, "sply_susp_yn", rec.sply_susp_yn);
			rx.add(record, "last_sply_yymm", rec.last_sply_yymm);
			rx.add(record, "acml_sply_tms", rec.acml_sply_tms);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
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
			<cmpy_cd/>
			<emp_no/>
			<occr_dt/>
			<seq/>
			<flnm/>
			<child_flnm/>
			<child_seqo/>
			<child_bidt/>
			<prn/>
			<sply_strt_yymm/>
			<sply_amt/>
			<sply_susp_yn/>
			<sply_tms/>
			<last_sply_yymm/>
			<acml_sply_tms/>
			<dept_cd/>
			<dty_cd/>
			<posi_cd/>
			<dept_nm/>
			<dty_nm/>
			<posi_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 20 09:44:30 KST 2009 */ %>