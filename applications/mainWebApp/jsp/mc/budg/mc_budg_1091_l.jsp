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
	MC_BUDG_1091_LDataSet ds = (MC_BUDG_1091_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_1091_LCURLISTRecord rec = (MC_BUDG_1091_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_cdnm", rec.budg_cdnm);
			rx.add(record, "prt_clsf_cd", rec.prt_clsf_cd);
			rx.add(record, "prt_clsf_cdnm", rec.prt_clsf_cdnm);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			//rx.add(record, "prt_clsf_cd", StringUtil.replaceToXml(rec.prt_clsf_cd));
			//rx.add(record, "prt_clsf_cdnm", StringUtil.replaceToXml(rec.prt_clsf_cdnm));
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
<mc_budg_1091_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_cd/>
				<budg_cdnm/>
				<prt_clsf_cd/>
				<prt_clsf_cdnm/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_1091_l>
*/
%>

<% /* 작성시간 : Wed Apr 08 09:51:41 KST 2009 */ %>