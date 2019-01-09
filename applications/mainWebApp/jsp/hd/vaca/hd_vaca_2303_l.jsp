<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_2303_LDataSet ds = (HD_VACA_2303_LDataSet)request.getAttribute("ds");
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
			HD_VACA_2303_LCURLISTRecord rec = (HD_VACA_2303_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "vaca_frdt", rec.vaca_frdt);
			rx.add(record, "vaca_todt", rec.vaca_todt);
			rx.add(record, "vaca_dds", rec.vaca_dds);
			rx.add(record, "vaca_clsf_nm", rec.vaca_clsf_nm);
			rx.add(record, "vaca_dtls_clsf_nm", rec.vaca_dtls_clsf_nm);
			//rx.add(record, "vaca_frdt", StringUtil.replaceToXml(rec.vaca_frdt));
			//rx.add(record, "vaca_todt", StringUtil.replaceToXml(rec.vaca_todt));
			//rx.add(record, "vaca_dds", StringUtil.replaceToXml(rec.vaca_dds));
			//rx.add(record, "vaca_clsf_nm", StringUtil.replaceToXml(rec.vaca_clsf_nm));
			//rx.add(record, "vaca_dtls_clsf_nm", StringUtil.replaceToXml(rec.vaca_dtls_clsf_nm));
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
<hd_vaca_2303_l>
	<dataSet>
		<CURLIST>
			<record>
				<vaca_frdt/>
				<vaca_todt/>
				<vaca_dds/>
				<vaca_clsf_nm/>
				<vaca_dtls_clsf_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_2303_l>
*/
%>

<% /* 작성시간 : Mon Feb 02 16:55:09 KST 2015 */ %>