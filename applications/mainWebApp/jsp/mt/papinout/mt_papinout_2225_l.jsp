<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_2225_LDataSet ds = (MT_PAPINOUT_2225_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "seq_to", ds.seq_to);
		recordSet = rx.add(dataSet, "seq_fr", ds.seq_fr);
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
			<title/>
			<roll/>
			<wgt/>
			<purc_uprc/>
			<amt/>
			<tot_jgroll/>
			<tot_jgwgt/>
			<tot_jgamt/>
			<inout_dt/>
			<iw_roll/>
			<s_wiibgoroll/>
			<s_wccgroll/>
			<iw_wt/>
			<s_wiibgowt/>
			<s_wccgwt/>
			<cut_err_tms/>
			<matr_cd/>
			<roll_wgt/>
			<grp/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jul 22 20:22:47 KST 2009 */ %>