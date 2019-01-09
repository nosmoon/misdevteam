<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.srch.rec.*
	,	chosun.ciis.hd.srch.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SRCH_1500_LDataSet ds = (HD_SRCH_1500_LDataSet)request.getAttribute("ds");
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
			HD_SRCH_1500_LCURLISTRecord rec = (HD_SRCH_1500_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "up_dept_cd", rec.up_dept_cd);
			rx.add(record, "up_dept_nm", rec.up_dept_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "last_upgrd_dt", rec.last_upgrd_dt);
			rx.add(record, "wowlrdlftn2", rec.wowlrdlftn2);
			rx.add(record, "duty_yydd", rec.duty_yydd);
			rx.add(record, "qlrmsrlrks2", rec.qlrmsrlrks2);
			rx.add(record, "rmsthrdlftn2", rec.rmsthrdlftn2);
			rx.add(record, "dkstlrdlfwk", rec.dkstlrdlfwk);
			rx.add(record, "dkstlr", rec.dkstlr);
			//rx.add(record, "up_dept_cd", StringUtil.replaceToXml(rec.up_dept_cd));
			//rx.add(record, "up_dept_nm", StringUtil.replaceToXml(rec.up_dept_nm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "in_cmpy_dt", StringUtil.replaceToXml(rec.in_cmpy_dt));
			//rx.add(record, "last_upgrd_dt", StringUtil.replaceToXml(rec.last_upgrd_dt));
			//rx.add(record, "wowlrdlftn2", StringUtil.replaceToXml(rec.wowlrdlftn2));
			//rx.add(record, "duty_yydd", StringUtil.replaceToXml(rec.duty_yydd));
			//rx.add(record, "qlrmsrlrks2", StringUtil.replaceToXml(rec.qlrmsrlrks2));
			//rx.add(record, "rmsthrdlftn2", StringUtil.replaceToXml(rec.rmsthrdlftn2));
			//rx.add(record, "dkstlrdlfwk", StringUtil.replaceToXml(rec.dkstlrdlfwk));
			//rx.add(record, "dkstlr", StringUtil.replaceToXml(rec.dkstlr));
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
<hd_srch_1500_l>
	<dataSet>
		<CURLIST>
			<record>
				<up_dept_cd/>
				<up_dept_nm/>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<dty_cd/>
				<dty_nm/>
				<posi_cd/>
				<posi_nm/>
				<in_cmpy_dt/>
				<last_upgrd_dt/>
				<wowlrdlftn2/>
				<duty_yydd/>
				<qlrmsrlrks2/>
				<rmsthrdlftn2/>
				<dkstlrdlfwk/>
				<dkstlr/>
			</record>
		</CURLIST>
	</dataSet>
</hd_srch_1500_l>
*/
%>

<% /* 작성시간 : Sat Aug 15 15:40:49 KST 2009 */ %>