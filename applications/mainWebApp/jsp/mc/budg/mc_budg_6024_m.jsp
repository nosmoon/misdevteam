<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_6024_MDataSet ds = (MC_BUDG_6024_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_srch_job_clsf_cd", ds.getXx_srch_job_clsf_cd());
		rx.add(dataSet, "xx_exec_no", ds.getXx_exec_no());
		
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MC_BUDG_6024_MCURLIST2Record rec = (MC_BUDG_6024_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MC_BUDG_6024_MCURLIST1Record rec = (MC_BUDG_6024_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd_nm", rec.cd_nm);
			//rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
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
<mc_budg_6024_m>
	<dataSet>
		<CURLIST2>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CURLIST2>
	</dataSet>
</mc_budg_6024_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_6024_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CURLIST1>
	</dataSet>
</mc_budg_6024_m>
*/
%>

<% /* 작성시간 : Thu May 14 15:36:53 KST 2009 */ %>