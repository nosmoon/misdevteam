<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_4026_MDataSet ds = (FC_FUNC_4026_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_stat_cd", ds.getXx_stat_cd());
		
		/****** XX_STAT_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "XX_STAT_CD_LIST", "");

		for(int i = 0; i < ds.xx_stat_cd_list.size(); i++) {
			FC_FUNC_4026_MXX_STAT_CD_LISTRecord rec = (FC_FUNC_4026_MXX_STAT_CD_LISTRecord)ds.xx_stat_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_stat_cd_list.size());
		/****** XX_STAT_CD_LIST END */

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
<fc_func_4026_m>
	<dataSet>
		<XX_STAT_CD_LIST>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</XX_STAT_CD_LIST>
	</dataSet>
</fc_func_4026_m>
*/
%>

<% /* 작성시간 : Fri Jan 06 13:27:13 KST 2012 */ %>