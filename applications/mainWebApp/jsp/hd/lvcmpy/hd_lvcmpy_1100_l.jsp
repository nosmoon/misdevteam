<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_1100_LDataSet ds = (HD_LVCMPY_1100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		rx.add(dataSet, "xx_lvcmpy_clsf_010", ds.getXx_lvcmpy_clsf_010());
		rx.add(dataSet, "xx_lvcmpy_clsf_020", ds.getXx_lvcmpy_clsf_020());
		rx.add(dataSet, "xx_lvcmpy_clsf_030", ds.getXx_lvcmpy_clsf_030());
		rx.add(dataSet, "xx_lvcmpy_clsf_040", ds.getXx_lvcmpy_clsf_040());
		rx.add(dataSet, "xx_lvcmpy_clsf_050", ds.getXx_lvcmpy_clsf_050());
		rx.add(dataSet, "xx_lvcmpy_clsf_060", ds.getXx_lvcmpy_clsf_060());
		rx.add(dataSet, "xx_lvcmpy_clsf_070", ds.getXx_lvcmpy_clsf_070());
		rx.add(dataSet, "xx_lvcmpy_clsf_080", ds.getXx_lvcmpy_clsf_080());

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_LVCMPY_1100_LCURLISTRecord rec = (HD_LVCMPY_1100_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
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
<hd_lvcmpy_1100_l>
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
</hd_lvcmpy_1100_l>
*/
%>

<% /* 작성시간 : Tue Nov 15 14:38:32 KST 2016 */ %>