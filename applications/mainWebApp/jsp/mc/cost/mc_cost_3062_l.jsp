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
	MC_COST_3062_LDataSet ds = (MC_COST_3062_LDataSet)request.getAttribute("ds");
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
			MC_COST_3062_LCURLISTRecord rec = (MC_COST_3062_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "chk", rec.chk);
			//rx.add(record, "brnm1", rec.brnm1);
			//rx.add(record, "brcd", rec.brcd);
			//rx.add(record, "clas_nm", rec.clas_nm);
			//rx.add(record, "dstb_dept_cd2", rec.dstb_dept_cd2);
			//rx.add(record, "dstb_dept_nm2", rec.dstb_dept_nm2);
			//rx.add(record, "bgsumamt", rec.bgsumamt);
			//rx.add(record, "bg11amt", rec.bg11amt);
			//rx.add(record, "bg13amt", rec.bg13amt);
			//rx.add(record, "bg19amt", rec.bg19amt);
			//rx.add(record, "bg21amt", rec.bg21amt);
			//rx.add(record, "bg22amt", rec.bg22amt);
			//rx.add(record, "bg23amt", rec.bg23amt);
			//rx.add(record, "bg24amt", rec.bg24amt);
			//rx.add(record, "bg27amt", rec.bg27amt);
			//rx.add(record, "bg31amt", rec.bg31amt);
			//rx.add(record, "bg41amt", rec.bg41amt);
			//rx.add(record, "bg42amt", rec.bg42amt);
			//rx.add(record, "bg49amt", rec.bg49amt);
			//rx.add(record, "bg61amt", rec.bg61amt);
			//rx.add(record, "bg71amt", rec.bg71amt);
			//rx.add(record, "bg81amt", rec.bg81amt);
			//rx.add(record, "bg98amt", rec.bg98amt);
			rx.add(record, "chk", StringUtil.replaceToXml(rec.chk));
			rx.add(record, "brnm1", StringUtil.replaceToXml(rec.brnm1));
			rx.add(record, "brcd", StringUtil.replaceToXml(rec.brcd));
			rx.add(record, "clas_nm", StringUtil.replaceToXml(rec.clas_nm));
			rx.add(record, "dstb_dept_cd2", StringUtil.replaceToXml(rec.dstb_dept_cd2));
			rx.add(record, "dstb_dept_nm2", StringUtil.replaceToXml(rec.dstb_dept_nm2));
			rx.add(record, "bgsumamt", StringUtil.replaceToXml(rec.bgsumamt));
			rx.add(record, "bg11amt", StringUtil.replaceToXml(rec.bg11amt));
			rx.add(record, "bg13amt", StringUtil.replaceToXml(rec.bg13amt));
			rx.add(record, "bg19amt", StringUtil.replaceToXml(rec.bg19amt));
			rx.add(record, "bg21amt", StringUtil.replaceToXml(rec.bg21amt));
			rx.add(record, "bg22amt", StringUtil.replaceToXml(rec.bg22amt));
			rx.add(record, "bg23amt", StringUtil.replaceToXml(rec.bg23amt));
			rx.add(record, "bg24amt", StringUtil.replaceToXml(rec.bg24amt));
			rx.add(record, "bg27amt", StringUtil.replaceToXml(rec.bg27amt));
			rx.add(record, "bg31amt", StringUtil.replaceToXml(rec.bg31amt));
			rx.add(record, "bg41amt", StringUtil.replaceToXml(rec.bg41amt));
			rx.add(record, "bg42amt", StringUtil.replaceToXml(rec.bg42amt));
			rx.add(record, "bg49amt", StringUtil.replaceToXml(rec.bg49amt));
			rx.add(record, "bg61amt", StringUtil.replaceToXml(rec.bg61amt));
			rx.add(record, "bg71amt", StringUtil.replaceToXml(rec.bg71amt));
			rx.add(record, "bg81amt", StringUtil.replaceToXml(rec.bg81amt));
			rx.add(record, "bg98amt", StringUtil.replaceToXml(rec.bg98amt));
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
<mc_cost_3062_l>
	<dataSet>
		<CURLIST>
			<record>
				<chk/>
				<brnm1/>
				<brcd/>
				<clas_nm/>
				<dstb_dept_cd2/>
				<dstb_dept_nm2/>
				<bgsumamt/>
				<bg11amt/>
				<bg13amt/>
				<bg19amt/>
				<bg21amt/>
				<bg22amt/>
				<bg23amt/>
				<bg24amt/>
				<bg27amt/>
				<bg31amt/>
				<bg41amt/>
				<bg42amt/>
				<bg49amt/>
				<bg61amt/>
				<bg71amt/>
				<bg81amt/>
				<bg98amt/>
			</record>
		</CURLIST>
	</dataSet>
</mc_cost_3062_l>
*/
%>

<% /* 작성시간 : Thu May 07 13:40:33 KST 2009 */ %>