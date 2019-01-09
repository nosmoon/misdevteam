<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_6301_LDataSet ds = (MC_BUDG_6301_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6301_LCURLIST3Record rec = (MC_BUDG_6301_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "su_cost_1", rec.su_cost_1);
			//rx.add(record, "su_cost_2", rec.su_cost_2);
			//rx.add(record, "su_cost_3", rec.su_cost_3);
			//rx.add(record, "su_cost_4", rec.su_cost_4);
			//rx.add(record, "j_cost_1", rec.j_cost_1);
			//rx.add(record, "j_cost_2", rec.j_cost_2);
			//rx.add(record, "j_cost_3", rec.j_cost_3);
			rx.add(record, "su_cost_1", StringUtil.replaceToXml(rec.su_cost_1));
			rx.add(record, "su_cost_2", StringUtil.replaceToXml(rec.su_cost_2));
			rx.add(record, "su_cost_3", StringUtil.replaceToXml(rec.su_cost_3));
			rx.add(record, "su_cost_4", StringUtil.replaceToXml(rec.su_cost_4));
			rx.add(record, "j_cost_1", StringUtil.replaceToXml(rec.j_cost_1));
			rx.add(record, "j_cost_2", StringUtil.replaceToXml(rec.j_cost_2));
			rx.add(record, "j_cost_3", StringUtil.replaceToXml(rec.j_cost_3));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MC_BUDG_6301_LCURLIST2Record rec = (MC_BUDG_6301_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "clos_mm", rec.clos_mm);
			rx.add(record, "clos_mm", StringUtil.replaceToXml(rec.clos_mm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MC_BUDG_6301_LCURLIST1Record rec = (MC_BUDG_6301_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "yymm", rec.yymm);
			//rx.add(record, "mt1", rec.mt1);
			//rx.add(record, "mt2", rec.mt2);
			//rx.add(record, "mt3", rec.mt3);
			//rx.add(record, "mt4", rec.mt4);
			//rx.add(record, "mt5", rec.mt5);
			//rx.add(record, "mt6", rec.mt6);
			//rx.add(record, "mt7", rec.mt7);
			//rx.add(record, "mt8", rec.mt8);
			//rx.add(record, "mt9", rec.mt9);
			//rx.add(record, "mt10", rec.mt10);
			//rx.add(record, "mt11", rec.mt11);
			//rx.add(record, "mt12", rec.mt12);
			rx.add(record, "yymm", StringUtil.replaceToXml(rec.yymm));
			rx.add(record, "mt1", StringUtil.replaceToXml(rec.mt1));
			rx.add(record, "mt2", StringUtil.replaceToXml(rec.mt2));
			rx.add(record, "mt3", StringUtil.replaceToXml(rec.mt3));
			rx.add(record, "mt4", StringUtil.replaceToXml(rec.mt4));
			rx.add(record, "mt5", StringUtil.replaceToXml(rec.mt5));
			rx.add(record, "mt6", StringUtil.replaceToXml(rec.mt6));
			rx.add(record, "mt7", StringUtil.replaceToXml(rec.mt7));
			rx.add(record, "mt8", StringUtil.replaceToXml(rec.mt8));
			rx.add(record, "mt9", StringUtil.replaceToXml(rec.mt9));
			rx.add(record, "mt10", StringUtil.replaceToXml(rec.mt10));
			rx.add(record, "mt11", StringUtil.replaceToXml(rec.mt11));
			rx.add(record, "mt12", StringUtil.replaceToXml(rec.mt12));
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
<mc_budg_6301_l>
	<dataSet>
		<CURLIST3>
			<record>
				<su_cost_1/>
				<su_cost_2/>
				<su_cost_3/>
				<su_cost_4/>
				<j_cost_1/>
				<j_cost_2/>
				<j_cost_3/>
			</record>
		</CURLIST3>
	</dataSet>
</mc_budg_6301_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_6301_l>
	<dataSet>
		<CURLIST2>
			<record>
				<clos_mm/>
			</record>
		</CURLIST2>
	</dataSet>
</mc_budg_6301_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_6301_l>
	<dataSet>
		<CURLIST1>
			<record>
				<yymm/>
				<mt1/>
				<mt2/>
				<mt3/>
				<mt4/>
				<mt5/>
				<mt6/>
				<mt7/>
				<mt8/>
				<mt9/>
				<mt10/>
				<mt11/>
				<mt12/>
			</record>
		</CURLIST1>
	</dataSet>
</mc_budg_6301_l>
*/
%>

<% /* 작성시간 : Fri May 22 13:40:29 KST 2009 */ %>