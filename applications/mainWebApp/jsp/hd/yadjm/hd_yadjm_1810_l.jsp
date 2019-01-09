<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.yadjm.rec.*
	,	chosun.ciis.hd.yadjm.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_YADJM_1810_LDataSet ds = (HD_YADJM_1810_LDataSet)request.getAttribute("ds");
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
			HD_YADJM_1810_LCURLISTRecord rec = (HD_YADJM_1810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "faml_rshp_cd", StringUtil.replaceToXml(rec.faml_rshp_cd));
			rx.add(record, "faml_rshp_nm", StringUtil.replaceToXml(rec.faml_rshp_nm));
			rx.add(record, "faml_prn", StringUtil.replaceToXml(rec.faml_prn));
			rx.add(record, "faml_flnm", StringUtil.replaceToXml(rec.faml_flnm));
			rx.add(record, "host_obj_cd", StringUtil.replaceToXml(rec.host_obj_cd));
			//rx.add(record, "faml_rshp_cd", rec.faml_rshp_cd);
			//rx.add(record, "faml_rshp_nm", rec.faml_rshp_nm);
			//rx.add(record, "faml_prn", rec.faml_prn);
			//rx.add(record, "faml_flnm", rec.faml_flnm);
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
<hd_yadjm_1810_l>
	<dataSet>
		<CURLIST>
			<record>
				<faml_rshp_cd/>
				<faml_rshp_nm/>
				<faml_prn/>
				<faml_flnm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_1810_l>
*/
%>

<% /* 작성시간 : Thu Aug 20 10:21:04 KST 2009 */ %>