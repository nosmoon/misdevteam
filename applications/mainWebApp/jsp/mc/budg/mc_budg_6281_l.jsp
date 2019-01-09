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
	MC_BUDG_6281_LDataSet ds = (MC_BUDG_6281_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6281_LCURLIST3Record rec = (MC_BUDG_6281_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "float_cost", rec.float_cost);
			rx.add(record, "float_cost", StringUtil.replaceToXml(rec.float_cost));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MC_BUDG_6281_LCURLIST2Record rec = (MC_BUDG_6281_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "pcnt", rec.pcnt);
			//rx.add(record, "fee_1", rec.fee_1);
			//rx.add(record, "fee_2", rec.fee_2);
			//rx.add(record, "fee_3", rec.fee_3);
			//rx.add(record, "fee_4", rec.fee_4);
			rx.add(record, "pcnt", StringUtil.replaceToXml(rec.pcnt));
			rx.add(record, "fee_1", StringUtil.replaceToXml(rec.fee_1));
			rx.add(record, "fee_2", StringUtil.replaceToXml(rec.fee_2));
			rx.add(record, "fee_3", StringUtil.replaceToXml(rec.fee_3));
			rx.add(record, "fee_4", StringUtil.replaceToXml(rec.fee_4));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MC_BUDG_6281_LCURLIST1Record rec = (MC_BUDG_6281_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "pcnt", rec.pcnt);
			//rx.add(record, "pcnt_amt", rec.pcnt_amt);
			//rx.add(record, "d_amt", rec.d_amt);
			//rx.add(record, "m_amt", rec.m_amt);
			//rx.add(record, "y_amt", rec.y_amt);
			rx.add(record, "pcnt", StringUtil.replaceToXml(rec.pcnt));
			rx.add(record, "pcnt_amt", StringUtil.replaceToXml(rec.pcnt_amt));
			rx.add(record, "d_amt", StringUtil.replaceToXml(rec.d_amt));
			rx.add(record, "m_amt", StringUtil.replaceToXml(rec.m_amt));
			rx.add(record, "y_amt", StringUtil.replaceToXml(rec.y_amt));
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
<mc_budg_6281_l>
	<dataSet>
		<CURLIST3>
			<record>
				<float_cost/>
			</record>
		</CURLIST3>
	</dataSet>
</mc_budg_6281_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_6281_l>
	<dataSet>
		<CURLIST2>
			<record>
				<pcnt/>
				<fee_1/>
				<fee_2/>
				<fee_3/>
				<fee_4/>
			</record>
		</CURLIST2>
	</dataSet>
</mc_budg_6281_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_6281_l>
	<dataSet>
		<CURLIST1>
			<record>
				<pcnt/>
				<pcnt_amt/>
				<d_amt/>
				<m_amt/>
				<y_amt/>
			</record>
		</CURLIST1>
	</dataSet>
</mc_budg_6281_l>
*/
%>

<% /* 작성시간 : Sat May 23 17:08:27 KST 2009 */ %>