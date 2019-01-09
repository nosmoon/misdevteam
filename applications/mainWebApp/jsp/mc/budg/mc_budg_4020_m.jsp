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
	MC_BUDG_4020_MDataSet ds = (MC_BUDG_4020_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MC_BUDG_4020_MCURLIST3Record rec = (MC_BUDG_4020_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MC_BUDG_4020_MCURLIST2Record rec = (MC_BUDG_4020_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "hsty_no", rec.hsty_no);
			//rx.add(record, "hsty_no", StringUtil.replaceToXml(rec.hsty_no));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MC_BUDG_4020_MCURLIST1Record rec = (MC_BUDG_4020_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "work_dt", rec.work_dt);
			//rx.add(record, "work_dt", StringUtil.replaceToXml(rec.work_dt));
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
<mc_budg_4020_m>
	<dataSet>
		<CURLIST3>
			<record>
				<dept_cd/>
				<dept_nm/>
			</record>
		</CURLIST3>
	</dataSet>
</mc_budg_4020_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_4020_m>
	<dataSet>
		<CURLIST2>
			<record>
				<hsty_no/>
			</record>
		</CURLIST2>
	</dataSet>
</mc_budg_4020_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_4020_m>
	<dataSet>
		<CURLIST1>
			<record>
				<work_dt/>
			</record>
		</CURLIST1>
	</dataSet>
</mc_budg_4020_m>
*/
%>

<% /* 작성시간 : Thu May 21 19:56:53 KST 2009 */ %>