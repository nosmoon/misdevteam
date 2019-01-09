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
	MC_COST_3022_LDataSet ds = (MC_COST_3022_LDataSet)request.getAttribute("ds");
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
			MC_COST_3022_LCURLISTRecord rec = (MC_COST_3022_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "clam_dept_nm", rec.clam_dept_nm);
			rx.add(record, "budg_nm", rec.budg_nm);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "use_dept_nm", rec.use_dept_nm);
			rx.add(record, "rmks1", rec.rmks1);
			rx.add(record, "rmks2", rec.rmks2);
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			//rx.add(record, "clam_dept_nm", StringUtil.replaceToXml(rec.clam_dept_nm));
			//rx.add(record, "budg_nm", StringUtil.replaceToXml(rec.budg_nm));
			//rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			//rx.add(record, "use_dept_nm", StringUtil.replaceToXml(rec.use_dept_nm));
			//rx.add(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
			//rx.add(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
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
<mc_cost_3022_l>
	<dataSet>
		<CURLIST>
			<record>
				<slip_no/>
				<clam_dept_nm/>
				<budg_nm/>
				<medi_nm/>
				<use_dept_nm/>
				<rmks1/>
				<rmks2/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_3022_l>
*/
%>

<% /* 작성시간 : Wed May 06 20:24:07 KST 2009 */ %>