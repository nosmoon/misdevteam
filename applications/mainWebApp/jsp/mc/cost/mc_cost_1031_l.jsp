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
	MC_COST_1031_LDataSet ds = (MC_COST_1031_LDataSet)request.getAttribute("ds");
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
			MC_COST_1031_LCURLISTRecord rec = (MC_COST_1031_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "dept_cdnm", rec.dept_cdnm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "budg_cdnm", rec.budg_cdnm);
			rx.add(record, "excp_dstb_cd", rec.excp_dstb_cd);
			rx.add(record, "excp_dstb_cdnm", rec.excp_dstb_cdnm);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "dept_cdnm", StringUtil.replaceToXml(rec.dept_cdnm));
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			//rx.add(record, "excp_dstb_cd", StringUtil.replaceToXml(rec.excp_dstb_cd));
			//rx.add(record, "excp_dstb_cdnm", StringUtil.replaceToXml(rec.excp_dstb_cdnm));
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
<mc_cost_1031_l>
	<dataSet>
		<CURLIST>
			<record>
				<budg_cd/>
				<dept_cdnm/>
				<dept_cd/>
				<budg_cdnm/>
				<excp_dstb_cd/>
				<excp_dstb_cdnm/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_1031_l>
*/
%>

<% /* 작성시간 : Wed Apr 29 09:51:09 KST 2009 */ %>