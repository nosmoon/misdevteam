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
	MC_COST_1010_MDataSet ds = (MC_COST_1010_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** XX_COST_DEPT_CLSF_LIST BEGIN */
		recordSet = rx.add(dataSet, "XX_COST_DEPT_CLSF_LIST", "");

		for(int i = 0; i < ds.xx_cost_dept_clsf_list.size(); i++) {
			MC_COST_1010_MXX_COST_DEPT_CLSF_LISTRecord rec = (MC_COST_1010_MXX_COST_DEPT_CLSF_LISTRecord)ds.xx_cost_dept_clsf_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.xx_cost_dept_clsf_list.size());
		/****** XX_COST_DEPT_CLSF_LIST END */
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MC_COST_1010_MCURLISTRecord rec = (MC_COST_1010_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "work_cym", rec.work_cym);
			//rx.add(record, "work_cym", StringUtil.replaceToXml(rec.work_cym));
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
<mc_cost_1010_m>
	<dataSet>
		<CURLIST>
			<record>
				<work_cym/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_1010_m>
*/
%>

<% /* 작성시간 : Fri Apr 24 15:19:23 KST 2009 */ %>