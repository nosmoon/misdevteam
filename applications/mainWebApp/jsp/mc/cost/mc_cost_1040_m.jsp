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
	MC_COST_1040_MDataSet ds = (MC_COST_1040_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_cd", ds.getXx_cd());
		rx.add(dataSet, "xx_dept_cd_010", ds.getXx_dept_cd_010());
		rx.add(dataSet, "xx_dept_cd_020", ds.getXx_dept_cd_020());
		rx.add(dataSet, "xx_cd1_010", ds.getXx_cd1_010());
		rx.add(dataSet, "xx_cd2_010", ds.getXx_cd2_010());
		rx.add(dataSet, "xx_cd1_020", ds.getXx_cd1_020());
		rx.add(dataSet, "xx_cd2_020", ds.getXx_cd2_020());
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MC_COST_1040_MCURLISTRecord rec = (MC_COST_1040_MCURLISTRecord)ds.curlist.get(i);
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
TrustForm�� Instance ����ο� �����ؼ� ���
<mc_cost_1040_m>
	<dataSet>
		<CURLIST>
			<record>
				<work_cym/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_1040_m>
*/
%>

<% /* �ۼ��ð� : Wed Apr 29 21:19:46 KST 2009 */ %>