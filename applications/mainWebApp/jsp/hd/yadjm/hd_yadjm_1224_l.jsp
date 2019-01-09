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
	HD_YADJM_1224_LDataSet ds = (HD_YADJM_1224_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1		= 0;
	int record		= 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	recordSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		depth1 = rx.add(recordSet, "faml_rshp_cd", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_YADJM_1224_LCURLISTRecord rec = (HD_YADJM_1224_LCURLISTRecord)ds.curlist.get(i);
			if ("FAML_RSHP_CD".equals(rec.getCd_type())){
				record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
			
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
<hd_yadjm_1224_l>
	<dataSet>
		<CURLIST>
			<record>
				<cd_type/>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_yadjm_1224_l>
*/
%>

<% /* 작성시간 : Sun Aug 23 13:22:48 KST 2009 */ %>