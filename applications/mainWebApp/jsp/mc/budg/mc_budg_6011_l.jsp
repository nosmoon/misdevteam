<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_6011_LDataSet ds = (MC_BUDG_6011_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6011_LCURLISTRecord rec = (MC_BUDG_6011_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "chk_col1", rec.chk_col1);
			rx.add(record, "budg_clas_cd", rec.budg_clas_cd);
			rx.add(record, "ycbrnm", rec.ycbrnm);
			rx.add(record, "chk_col4", rec.chk_col4);
			rx.add(record, "buseocd", rec.buseocd);
			rx.add(record, "buseocdnm", rec.buseocdnm);
			rx.add(record, "budg_req_amt", rec.budg_req_amt);
			rx.add(record, "in_amt", rec.in_amt);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "amt2", rec.amt2);
			rx.add(record, "rate", rec.rate);
			//rx.add(record, "chk_col1", StringUtil.replaceToXml(rec.chk_col1));
			//rx.add(record, "budg_clas_cd", StringUtil.replaceToXml(rec.budg_clas_cd));
			//rx.add(record, "ycbrnm", StringUtil.replaceToXml(rec.ycbrnm));
			//rx.add(record, "chk_col4", StringUtil.replaceToXml(rec.chk_col4));
			//rx.add(record, "buseocd", StringUtil.replaceToXml(rec.buseocd));
			//rx.add(record, "buseocdnm", StringUtil.replaceToXml(rec.buseocdnm));
			//rx.add(record, "budg_req_amt", StringUtil.replaceToXml(rec.budg_req_amt));
			//rx.add(record, "in_amt", StringUtil.replaceToXml(rec.in_amt));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			//rx.add(record, "amt2", StringUtil.replaceToXml(rec.amt2));
			//rx.add(record, "rate", StringUtil.replaceToXml(rec.rate));
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
<mc_budg_6011_l>
	<dataSet>
		<CURLIST>
			<record>
				<chk_col1/>
				<budg_clas_cd/>
				<ycbrnm/>
				<chk_col4/>
				<buseocd/>
				<buseocdnm/>
				<budg_req_amt/>
				<in_amt/>
				<amt/>
				<amt2/>
				<rate/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6011_l>
*/
%>

<% /* 작성시간 : Wed Jul 01 11:53:50 KST 2009 */ %>