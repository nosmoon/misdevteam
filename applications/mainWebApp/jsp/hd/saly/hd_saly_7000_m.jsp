<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_7000_MDataSet ds = (HD_SALY_7000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
System.out.println("dddd");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		depth1 = rx.add(dataSet, "aply_basi_mm", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_7000_MCURLISTRecord rec = (HD_SALY_7000_MCURLISTRecord)ds.curlist.get(i);
			//int record = rx.add(recordSet, "record", "");
			

			if ("APLY_BASI_MM".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
				//rx.add(record, "cd_type", StringUtil.replaceToXml(rec.cd_type));
				//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
				//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			}
			//rx.add(record, "cd_type", StringUtil.replaceToXml(rec.cd_type));
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
<hd_saly_7000_m>
	<dataSet>
		<CURLIST>
			<record>
				<cd_type/>
				<cd/>
				<cdnm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_saly_7000_m>
*/
%>

<% /* 작성시간 : Mon Jul 06 13:49:50 KST 2015 */ %>