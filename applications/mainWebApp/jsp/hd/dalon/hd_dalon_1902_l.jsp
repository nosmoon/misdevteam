<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.dalon.rec.*
	,	chosun.ciis.hd.dalon.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DALON_1902_LDataSet ds = (HD_DALON_1902_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	String value = "";
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_DALON_1902_LCURLISTRecord rec = (HD_DALON_1902_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);

			rx.add(record, "duty_dt", rec.duty_dt);
			
			rx.add(record, "prvdd_prsnt_tm", rec.prvdd_prsnt_tm);
			rx.add(record, "prvdd_finish_tm", rec.prvdd_finish_tm);
			rx.add(record, "thdd_prsnt_tm", rec.thdd_prsnt_tm);
			rx.add(record, "thdd_finish_tm", rec.thdd_finish_tm);
			rx.add(record, "thdd_duty_tm", rec.thdd_duty_tm);
			rx.add(record, "pay_dt", rec.pay_dt);

			rx.add(record, "proc_stat", "");




			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dty_cd", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_nm);


			rx.add(record, "connect_ip", "");
			rx.add(record, "connect_userid", "");
			
			if (rec.vgl_duty_dt == null){
			}else{
				value = (String)rec.vgl_duty_dt;
				value = value.substring(0,4)+value.substring(5,7)+value.substring(8,10);
				System.out.println("value = "+value);
			}
			rx.add(record, "vgl_duty_dt", value);
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
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<apst_dt/>
			<seq/>
			<dtamt_cd/>
			<dtamt_cd_nm/>
			<prov_cost/>
			<etc/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 09 15:05:17 KST 2009 */ %>