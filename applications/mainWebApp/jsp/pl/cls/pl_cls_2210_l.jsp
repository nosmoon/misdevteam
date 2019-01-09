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
* 파일명 : pl_cls_2210_l.jsp
* 기능 : 
* 작성일자 : 2009-05-11
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
	PL_CLS_2210_LDataSet ds = (PL_CLS_2210_LDataSet)request.getAttribute("ds");
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
			PL_CLS_2210_LPTCRLISTRecord rec = (PL_CLS_2210_LPTCRLISTRecord)ds.ptcrlist.get(i);
			int record = rx.add(PTCRLIST, "record", "");
			rx.add(record, "basi_yymm", rec.basi_yymm);
			rx.add(record, "basi_dt", rec.basi_dt);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "deli_qty", rec.deli_qty);
			rx.add(record, "deli_amt", rec.deli_amt);
			rx.add(record, "widr_qty", rec.widr_qty);
			rx.add(record, "widr_amt", rec.widr_amt);
			rx.add(record, "retn_qty", rec.retn_qty);
			rx.add(record, "retn_amt", rec.retn_amt);
			rx.add(record, "sale_qty", rec.sale_qty);
			rx.add(record, "sale_amt", rec.sale_amt);
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
			<deli_qty/>
			<deli_amt/>
			<widr_qty/>
			<widr_amt/>
			<retn_qty/>
			<retn_amt/>
			<sale_qty/>
			<sale_amt/>
			<temp_clos_emp_no/>
			<sale_clos_emp_no/>
			<medi_clsf/>
		</record>
	</PTCRLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 11 15:29:29 KST 2009 */ %>