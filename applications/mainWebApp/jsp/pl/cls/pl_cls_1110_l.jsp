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
* 파일명 : pl_cls_1110_l.jsp
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
	PL_CLS_1110_LDataSet ds = (PL_CLS_1110_LDataSet)request.getAttribute("ds");
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
			PL_CLS_1110_LPTCRLISTRecord rec = (PL_CLS_1110_LPTCRLISTRecord)ds.ptcrlist.get(i);
			int record = rx.add(PTCRLIST, "record", "");
			rx.add(record, "basi_dt", rec.basi_dt);
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "deli_qty", rec.deli_qty);
			rx.add(record, "deli_amt", rec.deli_amt);
			rx.add(record, "retn_qty", rec.retn_qty);
			rx.add(record, "retn_amt", rec.retn_amt);
			rx.add(record, "sale_qty", rec.sale_qty);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "clos_pers_emp_no", StringUtil.replaceToXml(rec.clos_pers_emp_no));
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
			<basi_dt/>
			<medi_clsf/>
			<deli_qty/>
			<deli_amt/>
			<retn_qty/>
			<retn_amt/>
			<sale_qty/>
			<sale_amt/>
			<clos_yn/>
			<clos_pers_emp_no/>
		</record>
	</PTCRLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon May 11 20:35:50 KST 2009 */ %>