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
* 파일명 : pl_cls_1610_l.jsp
* 기능 : 
* 작성일자 : 2015-11-09
* 작성자 : 김성미
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_CLS_1610_LDataSet ds = (PL_CLS_1610_LDataSet)request.getAttribute("ds");
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
			PL_CLS_1610_LPTCRLISTRecord rec = (PL_CLS_1610_LPTCRLISTRecord)ds.ptcrlist.get(i);
			int record = rx.add(PTCRLIST, "record", "");
			rx.add(record, "basi_yymm", rec.basi_yymm);
			rx.add(record, "basi_dt", rec.basi_dt);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "clos_pers_emp_no", rec.clos_pers_emp_no);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
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
			<rcpm_amt/>
			<retn_amt/>
			<meda_amt/>
			<clos_yn/>
			<clos_pers_emp_no/>
		</record>
	</PTCRLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed May 13 20:31:31 KST 2009 */ %>