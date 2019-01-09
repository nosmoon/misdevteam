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
	MC_COST_1001_LDataSet ds = (MC_COST_1001_LDataSet)request.getAttribute("ds");
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
			MC_COST_1001_LCURLISTRecord rec = (MC_COST_1001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sub_cd", rec.sub_cd);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			rx.add(record, "bscdnm", rec.bscdnm);
			rx.add(record, "mang_cd_2", rec.mang_cd_2);
			rx.add(record, "mang_cd_3", rec.mang_cd_3);
			//rx.add(record, "sub_cd", StringUtil.replaceToXml(rec.sub_cd));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_1", StringUtil.replaceToXml(rec.mang_cd_1));
			//rx.add(record, "bscdnm", StringUtil.replaceToXml(rec.bscdnm));
			//rx.add(record, "mang_cd_2", StringUtil.replaceToXml(rec.mang_cd_2));
			//rx.add(record, "mang_cd_3", StringUtil.replaceToXml(rec.mang_cd_3));
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
<mc_cost_1001_l>
	<dataSet>
		<CURLIST>
			<record>
				<sub_cd/>
				<cd/>
				<cdnm/>
				<mang_cd_1/>
				<bscdnm/>
				<mang_cd_2/>
				<mang_cd_3/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_1001_l>
*/
%>

<% /* 작성시간 : Fri Apr 17 15:25:26 KST 2009 */ %>