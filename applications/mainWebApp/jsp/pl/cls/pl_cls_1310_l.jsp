<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.cls.rec.*
	,	chosun.ciis.pl.cls.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_cls_1310_l.jsp
* 기능 : 
* 작성일자 : 2009-05-15
* 작성자 : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_CLS_1310_LDataSet ds = (PL_CLS_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "gridData", "");

	try {
		/****** PTCRLIST BEGIN */
		int PTCRLIST = rx.add(dataSet, "PTCRLIST", "");
		for(int i = 0; i < ds.ptcrlist.size(); i++) {
			PL_CLS_1310_LPTCRLISTRecord rec = (PL_CLS_1310_LPTCRLISTRecord)ds.ptcrlist.get(i);
			int record = rx.add(PTCRLIST, "record", "");
			rx.add(record, "basi_yymm", rec.basi_yymm);
			rx.add(record, "basi_dt", rec.basi_dt);
			rx.add(record, "cyov_bal", rec.cyov_bal);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "retn_amt", rec.retn_amt);
			rx.add(record, "meda_amt", rec.meda_amt);
			rx.add(record, "mmbal_amt", rec.mmbal_amt);
			rx.add(record, "totbal_amt", rec.totbal_amt);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "temp_clos_emp_no", StringUtil.replaceToXml(rec.temp_clos_emp_no));
			rx.add(record, "sale_clos_emp_no", StringUtil.replaceToXml(rec.sale_clos_emp_no));
			rx.add(record, "medi_clsf", rec.medi_clsf);
		}
		/****** PTCRLIST END */

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
	<PTCRLIST>
		<record>
			<basi_yymm/>
			<basi_dt/>
			<cyov_bal/>
			<sale_amt/>
			<rcpm_amt/>
			<retn_amt/>
			<meda_amt/>
			<mmbal_amt/>
			<totbal_amt/>
			<clos_yn/>
			<temp_clos_emp_no/>
			<sale_clos_emp_no/>
			<medi_clsf/>
		</record>
	</PTCRLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 15 11:22:31 KST 2009 */ %>