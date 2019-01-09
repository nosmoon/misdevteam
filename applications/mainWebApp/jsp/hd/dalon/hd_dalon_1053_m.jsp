<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.dalon.rec.*
	,	chosun.ciis.hd.dalon.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_DALON_1053_MDataSet ds = (HD_DALON_1053_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** XX_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "XX_CD_LIST", "");

		for(int i = 0; i < ds.xx_cd_list.size(); i++) {
			HD_DALON_1053_MXX_CD_LISTRecord rec = (HD_DALON_1053_MXX_CD_LISTRecord)ds.xx_cd_list.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "label", rec.cd_nm);
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_cd_list.size());
		/****** XX_CD_LIST END */

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
<hd_dalon_1053_m>
	<dataSet>
		<XX_CD_LIST>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</XX_CD_LIST>
	</dataSet>
</hd_dalon_1053_m>
*/
%>

<% /* 작성시간 : Tue Jan 31 13:21:43 KST 2012 */ %>