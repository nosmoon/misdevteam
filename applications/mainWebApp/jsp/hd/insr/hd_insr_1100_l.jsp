<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.insr.rec.*
	,	chosun.ciis.hd.insr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INSR_1100_LDataSet ds = (HD_INSR_1100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) { 
			HD_INSR_1100_LCURLISTRecord rec = (HD_INSR_1100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_cd_nm", rec.dept_cd_nm);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "dty_cd_nm", rec.dty_cd_nm);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "posi_cd_nm", rec.posi_cd_nm);
			rx.add(record, "last_slf_burd_amt", rec.last_slf_burd_amt);
			rx.add(record, "slf_burd_amt", rec.slf_burd_amt);
			rx.add(record, "np_amt", rec.np_amt);
			rx.add(record, "slf_minus_np", rec.slf_minus_np);
			//rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_cd_nm", StringUtil.replaceToXml(rec.dept_cd_nm));
			//rx.add(record, "dty_cd", StringUtil.replaceToXml(rec.dty_cd));
			//rx.add(record, "dty_cd_nm", StringUtil.replaceToXml(rec.dty_cd_nm));
			//rx.add(record, "posi_cd", StringUtil.replaceToXml(rec.posi_cd));
			//rx.add(record, "posi_cd_nm", StringUtil.replaceToXml(rec.posi_cd_nm));
			//rx.add(record, "last_slf_burd_amt", StringUtil.replaceToXml(rec.last_slf_burd_amt));
			//rx.add(record, "slf_burd_amt", StringUtil.replaceToXml(rec.slf_burd_amt));
			//rx.add(record, "np_amt", StringUtil.replaceToXml(rec.np_amt));
			//rx.add(record, "slf_minus_np", StringUtil.replaceToXml(rec.slf_minus_np));
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
<hd_insr_1100_l>
	<dataSet>
		<CURLIST>
			<record>
				<cmpy_cd/>
				<emp_no/>
				<nm_korn/>
				<dept_cd/>
				<dept_cd_nm/>
				<dty_cd/>
				<dty_cd_nm/>
				<posi_cd/>
				<posi_cd_nm/>
				<last_slf_burd_amt/>
				<slf_burd_amt/>
				<np_amt/>
				<slf_minus_np/>
			</record>
		</CURLIST>
	</dataSet>
</hd_insr_1100_l>
*/
%>

<% /* 작성시간 : Tue May 12 15:09:50 KST 2009 */ %>