<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.cost.rec.*
	,	chosun.ciis.mc.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_COST_3020_MDataSet ds = (MC_COST_3020_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_budg_cd", ds.getXx_budg_cd());
		rx.add(dataSet, "xx_job_clsf_00", ds.getXx_job_clsf_00());
		rx.add(dataSet, "xx_cd_clsf_010", ds.getXx_cd_clsf_010());
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MC_COST_3020_MCURLISTRecord rec = (MC_COST_3020_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "yymm", rec.yymm);
			//rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
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
<mc_cost_3020_m>
	<dataSet>
		<CURLIST>
			<record>
				<yymm/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_3020_m>
*/
%>

<% /* 작성시간 : Wed May 06 20:24:07 KST 2009 */ %>