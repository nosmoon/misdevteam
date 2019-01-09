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
	MC_BUDG_6111_LDataSet ds = (MC_BUDG_6111_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6111_LCURLIST3Record rec = (MC_BUDG_6111_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fr_to_1", rec.fr_to_1);
			rx.add(record, "fr_to_2", rec.fr_to_2);
			//rx.add(record, "fr_to_1", StringUtil.replaceToXml(rec.fr_to_1));
			//rx.add(record, "fr_to_2", StringUtil.replaceToXml(rec.fr_to_2));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MC_BUDG_6111_LCURLIST2Record rec = (MC_BUDG_6111_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "last_yyyymm", rec.last_yyyymm);
			//rx.add(record, "last_yyyymm", StringUtil.replaceToXml(rec.last_yyyymm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MC_BUDG_6111_LCURLIST1Record rec = (MC_BUDG_6111_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd1", rec.cd1);
			rx.add(record, "cd2", rec.cd2);
			//rx.add(record, "cd1", StringUtil.replaceToXml(rec.cd1));
			//rx.add(record, "cd2", StringUtil.replaceToXml(rec.cd2));
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
<mc_budg_6111_l>
	<dataSet>
		<CURLIST3>
			<record>
				<fr_to_1/>
				<fr_to_2/>
			</record>
		</CURLIST3>
	</dataSet>
</mc_budg_6111_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_6111_l>
	<dataSet>
		<CURLIST2>
			<record>
				<last_yyyymm/>
			</record>
		</CURLIST2>
	</dataSet>
</mc_budg_6111_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mc_budg_6111_l>
	<dataSet>
		<CURLIST1>
			<record>
				<cd1/>
				<cd2/>
			</record>
		</CURLIST1>
	</dataSet>
</mc_budg_6111_l>
*/
%>

<% /* 작성시간 : Mon Apr 06 15:18:52 KST 2009 */ %>