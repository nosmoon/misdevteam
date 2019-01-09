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
	MC_COST_3181_LDataSet ds = (MC_COST_3181_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MC_COST_3181_LCURLIST3Record rec = (MC_COST_3181_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "yymm", rec.yymm);
			//rx.add(record, "bbgbcd", rec.bbgbcd);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "bgysnm", rec.bgysnm);
			//rx.add(record, "dstb_dept_cd2", rec.dstb_dept_cd2);
			//rx.add(record, "bg2stbsnm", rec.bg2stbsnm);
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
			rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			rx.add(record, "bbgbcd", StringUtil.replaceToXml(rec.bbgbcd));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "bgysnm", StringUtil.replaceToXml(rec.bgysnm));
			rx.add(record, "dstb_dept_cd2", StringUtil.replaceToXml(rec.dstb_dept_cd2));
			rx.add(record, "bg2stbsnm", StringUtil.replaceToXml(rec.bg2stbsnm));
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
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MC_COST_3181_LCURLIST2Record rec = (MC_COST_3181_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "yymm", rec.yymm);
			//rx.add(record, "gjbiyb", rec.gjbiyb);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "bgysnm", rec.bgysnm);
			//rx.add(record, "dstb_dept_cd2", rec.dstb_dept_cd2);
			//rx.add(record, "bg2stbsnm", rec.bg2stbsnm);
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
			rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			rx.add(record, "gjbiyb", StringUtil.replaceToXml(rec.gjbiyb));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "bgysnm", StringUtil.replaceToXml(rec.bgysnm));
			rx.add(record, "dstb_dept_cd2", StringUtil.replaceToXml(rec.dstb_dept_cd2));
			rx.add(record, "bg2stbsnm", StringUtil.replaceToXml(rec.bg2stbsnm));
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
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MC_COST_3181_LCURLIST1Record rec = (MC_COST_3181_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "yymm", rec.yymm);
			//rx.add(record, "budg_cd", rec.budg_cd);
			//rx.add(record, "bgysnm", rec.bgysnm);
			//rx.add(record, "dstb_dept_cd2", rec.dstb_dept_cd2);
			//rx.add(record, "bg2stbsnm", rec.bg2stbsnm);
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
			rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			rx.add(record, "bgysnm", StringUtil.replaceToXml(rec.bgysnm));
			rx.add(record, "dstb_dept_cd2", StringUtil.replaceToXml(rec.dstb_dept_cd2));
			rx.add(record, "bg2stbsnm", StringUtil.replaceToXml(rec.bg2stbsnm));
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
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<mc_cost_3181_l>
	<dataSet>
		<CURLIST3>
			<record>
				<yymm/>
				<bbgbcd/>
				<budg_cd/>
				<bgysnm/>
				<dstb_dept_cd2/>
				<bg2stbsnm/>
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
		</CURLIST3>
	</dataSet>
</mc_cost_3181_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_cost_3181_l>
	<dataSet>
		<CURLIST2>
			<record>
				<yymm/>
				<gjbiyb/>
				<budg_cd/>
				<bgysnm/>
				<dstb_dept_cd2/>
				<bg2stbsnm/>
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
		</CURLIST2>
	</dataSet>
</mc_cost_3181_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_cost_3181_l>
	<dataSet>
		<CURLIST1>
			<record>
				<yymm/>
				<budg_cd/>
				<bgysnm/>
				<dstb_dept_cd2/>
				<bg2stbsnm/>
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
		</CURLIST1>
	</dataSet>
</mc_cost_3181_l>
*/
%>

<% /* 작성시간 : Thu May 07 17:25:20 KST 2009 */ %>