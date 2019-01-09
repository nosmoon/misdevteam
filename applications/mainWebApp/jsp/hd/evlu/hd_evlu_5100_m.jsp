<%@page import="java.text.DecimalFormat"%>
<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.evlu.rec.*
	,	chosun.ciis.hd.evlu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EVLU_5100_MDataSet ds = (HD_EVLU_5100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		DecimalFormat decimalFormat = new DecimalFormat("000");
		String[] xx_cds = ds.getXx_cd().split(",");
		for(int i=0; i<xx_cds.length; i++) {
			String num = decimalFormat.format((i+1)*10);
			rx.add(dataSet, "xx_cd_"+num, xx_cds[i]);
		}
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "dtls_item_cd", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_EVLU_5100_MCURLISTRecord rec = (HD_EVLU_5100_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
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
<hd_evlu_5100_m>
	<dataSet>
		<CURLIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_evlu_5100_m>
*/
%>

<% /* 작성시간 : Thu May 21 17:59:58 KST 2009 */ %>