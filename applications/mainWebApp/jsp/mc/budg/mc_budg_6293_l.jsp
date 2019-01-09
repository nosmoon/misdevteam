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
	MC_BUDG_6293_LDataSet ds = (MC_BUDG_6293_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6293_LCURLIST3Record rec = (MC_BUDG_6293_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "aply_rate", rec.aply_rate);
			//rx.add(record, "fix_fee", rec.fix_fee);
			//rx.add(record, "iss_cnt", rec.iss_cnt);
			//rx.add(record, "iss_cnt1", rec.iss_cnt1);
			//rx.add(record, "chg_cost", rec.chg_cost);
			rx.add(record, "aply_rate", StringUtil.replaceToXml(rec.aply_rate));
			rx.add(record, "fix_fee", StringUtil.replaceToXml(rec.fix_fee));
			rx.add(record, "iss_cnt", StringUtil.replaceToXml(rec.iss_cnt));
			rx.add(record, "iss_cnt1", StringUtil.replaceToXml(rec.iss_cnt1));
			rx.add(record, "chg_cost", StringUtil.replaceToXml(rec.chg_cost));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MC_BUDG_6293_LCURLIST2Record rec = (MC_BUDG_6293_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "pcnt", rec.pcnt);
			//rx.add(record, "pcnt_fee", rec.pcnt_fee);
			//rx.add(record, "d_fee", rec.d_fee);
			//rx.add(record, "m_fee", rec.m_fee);
			//rx.add(record, "y_fee", rec.y_fee);
			//rx.add(record, "pcnt1", rec.pcnt1);
			rx.add(record, "pcnt", StringUtil.replaceToXml(rec.pcnt));
			rx.add(record, "pcnt_fee", StringUtil.replaceToXml(rec.pcnt_fee));
			rx.add(record, "d_fee", StringUtil.replaceToXml(rec.d_fee));
			rx.add(record, "m_fee", StringUtil.replaceToXml(rec.m_fee));
			rx.add(record, "y_fee", StringUtil.replaceToXml(rec.y_fee));
			rx.add(record, "pcnt1", StringUtil.replaceToXml(rec.pcnt1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MC_BUDG_6293_LCURLIST1Record rec = (MC_BUDG_6293_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "pcnt", rec.pcnt);
			//rx.add(record, "pcnt_fee", rec.pcnt_fee);
			//rx.add(record, "d_fee", rec.d_fee);
			//rx.add(record, "m_fee", rec.m_fee);
			//rx.add(record, "y_fee", rec.y_fee);
			//rx.add(record, "pcnt1", rec.pcnt1);
			rx.add(record, "pcnt", StringUtil.replaceToXml(rec.pcnt));
			rx.add(record, "pcnt_fee", StringUtil.replaceToXml(rec.pcnt_fee));
			rx.add(record, "d_fee", StringUtil.replaceToXml(rec.d_fee));
			rx.add(record, "m_fee", StringUtil.replaceToXml(rec.m_fee));
			rx.add(record, "y_fee", StringUtil.replaceToXml(rec.y_fee));
			rx.add(record, "pcnt1", StringUtil.replaceToXml(rec.pcnt1));
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
<mc_budg_6293_l>
	<dataSet>
		<CURLIST3>
			<record>
				<aply_rate/>
				<fix_fee/>
				<iss_cnt/>
				<iss_cnt1/>
				<chg_cost/>
			</record>
		</CURLIST3>
	</dataSet>
</mc_budg_6293_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_6293_l>
	<dataSet>
		<CURLIST2>
			<record>
				<pcnt/>
				<pcnt_fee/>
				<d_fee/>
				<m_fee/>
				<y_fee/>
				<pcnt1/>
			</record>
		</CURLIST2>
	</dataSet>
</mc_budg_6293_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_6293_l>
	<dataSet>
		<CURLIST1>
			<record>
				<pcnt/>
				<pcnt_fee/>
				<d_fee/>
				<m_fee/>
				<y_fee/>
				<pcnt1/>
			</record>
		</CURLIST1>
	</dataSet>
</mc_budg_6293_l>
*/
%>

<% /* 작성시간 : Mon May 25 16:19:04 KST 2009 */ %>