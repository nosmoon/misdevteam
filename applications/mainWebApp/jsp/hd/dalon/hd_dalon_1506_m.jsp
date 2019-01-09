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
	HD_DALON_1506_MDataSet ds = (HD_DALON_1506_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_proc_stat_010", ds.getXx_proc_stat_010());
		
		/****** XX_APLC_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "XX_APLC_CLSF_LIST", "");

		for(int i = 0; i < ds.xx_aplc_clsf_list.size(); i++) {
			HD_DALON_1506_MXX_APLC_CLSF_LISTRecord rec = (HD_DALON_1506_MXX_APLC_CLSF_LISTRecord)ds.xx_aplc_clsf_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_aplc_clsf_list.size());
		/****** XX_APLC_CLSF_LIST END */

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
<hd_dalon_1506_m>
	<dataSet>
		<XX_APLC_CLSF_LIST>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</XX_APLC_CLSF_LIST>
	</dataSet>
</hd_dalon_1506_m>
*/
%>

<% /* 작성시간 : Tue Jan 31 15:38:14 KST 2012 */ %>