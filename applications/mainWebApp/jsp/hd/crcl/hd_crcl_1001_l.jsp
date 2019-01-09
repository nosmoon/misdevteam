<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.crcl.rec.*
	,	chosun.ciis.hd.crcl.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_CRCL_1001_LDataSet ds = (HD_CRCL_1001_LDataSet)request.getAttribute("ds");
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
			HD_CRCL_1001_LCURLISTRecord rec = (HD_CRCL_1001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "paty_crc_cd", rec.paty_crc_cd);
			rx.add(record, "bgn_dty_cd", rec.bgn_dty_cd);
			rx.add(record, "end_dty_cd", rec.end_dty_cd);
			rx.add(record, "fix_fix_rate_clsf", rec.fix_fix_rate_clsf);
			rx.add(record, "rgla_dduc_dus", rec.rgla_dduc_dus);
//			rx.add(record, "rgla_dduc_ratio", rec.rgla_dduc_ratio);
			rx.add(record, "rgla_dduc_ratio", DigitUtil.cutUnderPoint(rec.rgla_dduc_ratio,1));
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
			<seq/>
			<cmpy_cd/>
			<paty_crc_cd/>
			<bgn_dty_cd/>
			<end_dty_cd/>
			<fix_fix_rate_clsf/>
			<rgla_dduc_dus/>
			<rgla_dduc_ratio/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Feb 17 09:59:30 KST 2009 */ %>