<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.srch.rec.*
	,	chosun.ciis.hd.srch.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SRCH_1100_LDataSet ds = (HD_SRCH_1100_LDataSet)request.getAttribute("ds");
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
			HD_SRCH_1100_LCURLISTRecord rec = (HD_SRCH_1100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "emp_clsf", rec.emp_clsf);
			rx.add(record, "open_invit_clsf_nm", rec.open_invit_clsf_nm);
			rx.add(record, "open_invit_desty", rec.open_invit_desty);
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "tot_saly", rec.tot_saly);
			rx.add(record, "prz_pnsh_nm", rec.prz_pnsh_nm);
			rx.add(record, "prz_pnsh_nm_etc", rec.prz_pnsh_nm_etc);
			rx.add(record, "chrg_job", rec.chrg_job);
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
			<emp_no/>
			<prn/>
			<emp_clsf/>
			<open_invit_clsf_nm/>
			<open_invit_desty/>
			<cd_nm/>
			<dept_nm/>
			<nm_korn/>
			<dty_nm/>
			<posi_nm/>
			<cmpy_cd/>
			<in_cmpy_dt/>
			<tot_saly/>
			<prz_pnsh_nm/>
			<prz_pnsh_nm_etc/>
			<chrg_job/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 02 19:45:28 KST 2009 */ %>