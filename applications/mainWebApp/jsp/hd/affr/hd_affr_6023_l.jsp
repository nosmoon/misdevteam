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
	HD_AFFR_6023_LDataSet ds = (HD_AFFR_6023_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST2 BEGIN */

		depth1 = rx.add(dataSet, "posi_cd", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_AFFR_6023_LCURLIST2Record rec = (HD_AFFR_6023_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(depth1, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm);
		}
		
		depth1 = rx.add(dataSet, "dty_cd", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_AFFR_6023_LCURLIST2Record rec = (HD_AFFR_6023_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(depth1, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm);
		}
		
		
//		recordSet = rx.add(dataSet, "CURLIST2", "");

//		for(int i = 0; i < ds.curlist2.size(); i++) {
//			HD_AFFR_6023_LCURLIST2Record rec = (HD_AFFR_6023_LCURLIST2Record)ds.curlist2.get(i);
//			int record = rx.add(recordSet, "record", "");
//			rx.add(record, "cd_type", rec.cd_type);
//			rx.add(record, "cd", rec.cd);
//			rx.add(record, "cdnm", rec.cdnm);
//			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
//		}
//		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_6023_LCURLISTRecord rec = (HD_AFFR_6023_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "certi_clsf", rec.certi_clsf);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "aplc_dt", rec.aplc_dt);
			rx.add(record, "aplc_seq", rec.aplc_seq);
			rx.add(record, "appmt_dt", rec.appmt_dt);
			rx.addCData(record, "appmt_cont", rec.appmt_cont);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.addCData(record, "dept_name", rec.dept_name);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "prt_usag_dty_cd", rec.prt_usag_dty_cd);
			rx.addCData(record, "dty_name", rec.dty_name);
			rx.addCData(record, "posi_name", rec.posi_name);
			rx.addCData(record, "prt_usag_dty_cd_name", rec.prt_usag_dty_cd_name);
			rx.addCData(record, "remk", rec.remk);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
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
	<CURLIST2>
		<record>
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<certi_clsf/>
			<occr_dt/>
			<seq/>
			<aplc_dt/>
			<aplc_seq_/>
			<appmt_dt/>
			<appmt_cont/>
			<dept_cd/>
			<dept_name/>
			<dty_cd/>
			<posi_cd/>
			<prt_usag_dty_cd/>
			<dty_name/>
			<posi_name/>
			<prt_usag_dty_cd_name/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 13 15:56:54 KST 2009 */ %>