<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPORD_4003_LDataSet ds = (MT_PAPORD_4003_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */

		MT_PAPORD_4003_LCURLISTRecord rec = (MT_PAPORD_4003_LCURLISTRecord)ds.curlist.get(0);
		rx.add(dataSet, "slip_qty", rec.slip_qty);
		rx.add(dataSet, "pcnt", rec.pcnt);
		rx.add(dataSet, "dual_out_clsf", rec.dual_out_clsf);
		
		if(rec.dual_out_clsf.equals("Y")) {
			rx.add(dataSet, "dual_out_clsf_nm", "양출");
		} else {
			rx.add(dataSet, "dual_out_clsf_nm", "");
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
			<issu_dt/>
			<fac_clsf/>
			<medi_cd/>
			<sect_cd/>
			<slip_qty/>
			<pcnt/>
			<dual_out_clsf/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 10 13:06:09 KST 2009 */ %>