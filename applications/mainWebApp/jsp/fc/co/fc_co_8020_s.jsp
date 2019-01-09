<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.co.rec.*
	,	chosun.ciis.fc.co.ds.*;
    ,   chosun.ciis.co.base.util.*; 	
	"
%>

<%
	RwXml rx = new RwXml();
	FC_CO_8020_SDataSet ds = (FC_CO_8020_SDataSet)request.getAttribute("ds");
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
			FC_CO_8020_SCURLISTRecord rec = (FC_CO_8020_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"             , StringUtil.replaceToXml(rec.cd            )   );
			rx.add(record, "cdnm"           , StringUtil.replaceToXml(rec.cdnm          )   );
			rx.add(record, "cd_abrv_nm"     , StringUtil.replaceToXml(rec.cd_abrv_nm    )   );
			rx.add(record, "cdnm_cd"        , StringUtil.replaceToXml(rec.cdnm_cd       )   );
			rx.add(record, "cdabrvnm_cd"    , StringUtil.replaceToXml(rec.cdabrvnm_cd   )   );
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
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Mar 30 19:24:43 KST 2009 */ %>