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
	HD_SALY_6200_MDataSet ds = (HD_SALY_6200_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int record = 0;
	int depth1		= 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	
	recordSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		depth1 = rx.add(recordSet, "co_cmpy_cd", "");  //보험사 콤보

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_6200_MCURLISTRecord rec = (HD_SALY_6200_MCURLISTRecord)ds.curlist.get(i);
			if ("CO_CMPY_CD".equals(rec.getCd_type())){
				record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}									
		}
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
<hd_saly_6200_m>
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
</hd_saly_6200_m>
*/
%>

<% /* 작성시간 : Fri Sep 11 17:40:04 KST 2015 */ %>