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
	HD_AFFR_5010_LDataSet ds = (HD_AFFR_5010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		rx.add(dataSet, "xx_cd_010", ds.getXx_cd_010());
		rx.add(dataSet, "xx_cd_020", ds.getXx_cd_020());
		rx.add(dataSet, "xx_cd_030", ds.getXx_cd_030());
		/****** CURLIST2 BEGIN */
		depth1 = rx.add(dataSet, "certi_clsf_cd", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_AFFR_5010_LCURLIST2Record rec = (HD_AFFR_5010_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(depth1, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm);
		}
		//rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */
		
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_5010_LCURLISTRecord rec = (HD_AFFR_5010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "certi_clsf", rec.certi_clsf);
			rx.add(record, "certi_clsf_name", rec.certi_clsf_name);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "aplc_dt", rec.aplc_dt);
			rx.add(record, "aplc_seq", rec.aplc_seq);
			rx.add(record, "issu_num_shet", rec.issu_num_shet);
			rx.add(record, "usag", rec.usag);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "cntc_plac", rec.cntc_plac);
			rx.add(record, "email", rec.email);
			rx.add(record, "engl_flnm", rec.engl_flnm);
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
			<certi_clsf_name/>
			<occr_dt/>
			<seq/>
			<aplc_dt/>
			<aplc_seq/>
			<issu_num_shet/>
			<usag/>
			<remk/>
			<cntc_plac/>
			<email/>
			<engl_flnm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sun Jun 21 14:01:24 KST 2009 */ %>