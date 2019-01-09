<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.edu.rec.*
	,	chosun.ciis.hd.edu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EDU_1610_LDataSet ds = (HD_EDU_1610_LDataSet)request.getAttribute("ds");
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
			HD_EDU_1610_LCURLISTRecord rec = (HD_EDU_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "posi_nm", rec.posi_nm);
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "edu_clsf_nm", StringUtil.replaceToXml(rec.edu_clsf_nm));
			//rx.add(record, "edu_nm", StringUtil.replaceToXml(rec.edu_nm));
			//rx.add(record, "edu_frdt", StringUtil.replaceToXml(rec.edu_frdt));
			//rx.add(record, "edu_todt", StringUtil.replaceToXml(rec.edu_todt));
			//rx.add(record, "edu_instt", StringUtil.replaceToXml(rec.edu_instt));
			//rx.add(record, "edu_dds", StringUtil.replaceToXml(rec.edu_dds));
			//rx.add(record, "edu_tm", StringUtil.replaceToXml(rec.edu_tm));
			//rx.add(record, "edu_cost", StringUtil.replaceToXml(rec.edu_cost));
			//rx.add(record, "complt", StringUtil.replaceToXml(rec.complt));
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
<hd_edu_1601_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<posi_nm/>
				<edu_clsf_nm/>
				<edu_nm/>
				<edu_frdt/>
				<edu_todt/>
				<edu_instt/>
				<edu_dds/>
				<edu_tm/>
				<edu_cost/>
				<complt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_edu_1601_l>
*/
%>

<% /* 작성시간 : Tue Sep 15 10:55:04 KST 2009 */ %>