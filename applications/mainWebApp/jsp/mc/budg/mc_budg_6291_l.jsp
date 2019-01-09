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
	MC_BUDG_6291_LDataSet ds = (MC_BUDG_6291_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			MC_BUDG_6291_LCURLIST4Record rec = (MC_BUDG_6291_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "chg_cost", rec.chg_cost);
			rx.add(record, "iss_cnt", rec.iss_cnt);
			rx.add(record, "avg_cnt", rec.avg_cnt);
			//rx.add(record, "chg_cost", StringUtil.replaceToXml(rec.chg_cost));
			//rx.add(record, "iss_cnt", StringUtil.replaceToXml(rec.iss_cnt));
			//rx.add(record, "avg_cnt", StringUtil.replaceToXml(rec.avg_cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MC_BUDG_6291_LCURLIST2Record rec = (MC_BUDG_6291_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pcnt", rec.pcnt);
			rx.add(record, "pcnt_fee", rec.pcnt_fee);
			rx.add(record, "d_fee", rec.d_fee);
			rx.add(record, "m_fee", rec.m_fee);
			rx.add(record, "y_fee", rec.y_fee);
			rx.add(record, "pcnt1", rec.pcnt1);
			//rx.add(record, "pcnt", StringUtil.replaceToXml(rec.pcnt));
			//rx.add(record, "pcnt_fee", StringUtil.replaceToXml(rec.pcnt_fee));
			//rx.add(record, "d_fee", StringUtil.replaceToXml(rec.d_fee));
			//rx.add(record, "m_fee", StringUtil.replaceToXml(rec.m_fee));
			//rx.add(record, "y_fee", StringUtil.replaceToXml(rec.y_fee));
			//rx.add(record, "pcnt1", StringUtil.replaceToXml(rec.pcnt1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MC_BUDG_6291_LCURLIST1Record rec = (MC_BUDG_6291_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pcnt", rec.pcnt);
			rx.add(record, "pcnt_fee", rec.pcnt_fee);
			rx.add(record, "d_fee", rec.d_fee);
			rx.add(record, "m_fee", rec.m_fee);
			rx.add(record, "y_fee", rec.y_fee);
			rx.add(record, "pcnt1", rec.pcnt1);
			//rx.add(record, "pcnt", StringUtil.replaceToXml(rec.pcnt));
			//rx.add(record, "pcnt_fee", StringUtil.replaceToXml(rec.pcnt_fee));
			//rx.add(record, "d_fee", StringUtil.replaceToXml(rec.d_fee));
			//rx.add(record, "m_fee", StringUtil.replaceToXml(rec.m_fee));
			//rx.add(record, "y_fee", StringUtil.replaceToXml(rec.y_fee));
			//rx.add(record, "pcnt1", StringUtil.replaceToXml(rec.pcnt1));
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
<mc_budg_6291_l>
	<dataSet>
		<CURLIST4>
			<record>
				<chg_cost/>
				<iss_cnt/>
				<avg_cnt/>
			</record>
		</CURLIST4>
	</dataSet>
</mc_budg_6291_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_6291_l>
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
</mc_budg_6291_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_6291_l>
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
</mc_budg_6291_l>
*/
%>

<% /* 작성시간 : Wed Sep 16 10:36:58 KST 2009 */ %>