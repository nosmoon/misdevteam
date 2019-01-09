<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.bas.rec.*
	,	chosun.ciis.tn.bas.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_BAS_2101_LDataSet ds = (TN_BAS_2101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST_3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST_3", "");

		for(int i = 0; i < ds.curlist_3.size(); i++) {
			TN_BAS_2101_LCURLIST_3Record rec = (TN_BAS_2101_LCURLIST_3Record)ds.curlist_3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "relationidx", rec.relationidx);
			rx.add(record, "relationtype", rec.relationtype);
			rx.add(record, "relationtype_nm", rec.relationtype_nm);
			rx.add(record, "relation1", rec.relation1);
			rx.add(record, "relation2", rec.relation2);
			rx.add(record, "displayorder", rec.displayorder);
			//rx.add(record, "relationidx", StringUtil.replaceToXml(rec.relationidx));
			//rx.add(record, "relationtype", StringUtil.replaceToXml(rec.relationtype));
			//rx.add(record, "relationtype_nm", StringUtil.replaceToXml(rec.relationtype_nm));
			//rx.add(record, "relation1", StringUtil.replaceToXml(rec.relation1));
			//rx.add(record, "relation2", StringUtil.replaceToXml(rec.relation2));
			//rx.add(record, "displayorder", StringUtil.replaceToXml(rec.displayorder));
		}
		rx.add(recordSet, "totalcnt", ds.curlist_3.size());
		/****** CURLIST_3 END */

		/****** CURLIST_2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST_2", "");

		for(int i = 0; i < ds.curlist_2.size(); i++) {
			TN_BAS_2101_LCURLIST_2Record rec = (TN_BAS_2101_LCURLIST_2Record)ds.curlist_2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "relationidx", rec.relationidx);
			rx.add(record, "relationtype", rec.relationtype);
			rx.add(record, "relationtype_nm", rec.relationtype_nm);
			rx.add(record, "relation1", rec.relation1);
			rx.add(record, "relation2", rec.relation2);
			rx.add(record, "displayorder", rec.displayorder);
			//rx.add(record, "relationidx", StringUtil.replaceToXml(rec.relationidx));
			//rx.add(record, "relationtype", StringUtil.replaceToXml(rec.relationtype));
			//rx.add(record, "relationtype_nm", StringUtil.replaceToXml(rec.relationtype_nm));
			//rx.add(record, "relation1", StringUtil.replaceToXml(rec.relation1));
			//rx.add(record, "relation2", StringUtil.replaceToXml(rec.relation2));
			//rx.add(record, "displayorder", StringUtil.replaceToXml(rec.displayorder));
		}
		rx.add(recordSet, "totalcnt", ds.curlist_2.size());
		/****** CURLIST_2 END */

		/****** CURLIST_1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST_1", "");

		for(int i = 0; i < ds.curlist_1.size(); i++) {
			TN_BAS_2101_LCURLIST_1Record rec = (TN_BAS_2101_LCURLIST_1Record)ds.curlist_1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "relationidx", rec.relationidx);
			rx.add(record, "relationtype", rec.relationtype);
			rx.add(record, "relationtype_nm", rec.relationtype_nm);
			rx.add(record, "relation1", rec.relation1);
			rx.add(record, "relation2", rec.relation2);
			rx.add(record, "displayorder", rec.displayorder);
			//rx.add(record, "relationidx", StringUtil.replaceToXml(rec.relationidx));
			//rx.add(record, "relationtype", StringUtil.replaceToXml(rec.relationtype));
			//rx.add(record, "relationtype_nm", StringUtil.replaceToXml(rec.relationtype_nm));
			//rx.add(record, "relation1", StringUtil.replaceToXml(rec.relation1));
			//rx.add(record, "relation2", StringUtil.replaceToXml(rec.relation2));
			//rx.add(record, "displayorder", StringUtil.replaceToXml(rec.displayorder));
		}
		rx.add(recordSet, "totalcnt", ds.curlist_1.size());
		/****** CURLIST_1 END */

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
<tn_bas_2101_l>
	<dataSet>
		<CURLIST_3>
			<record>
				<relationidx/>
				<relationtype/>
				<relationtype_nm/>
				<relation1/>
				<relation2/>
				<displayorder/>
			</record>
		</CURLIST_3>
	</dataSet>
</tn_bas_2101_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_bas_2101_l>
	<dataSet>
		<CURLIST_2>
			<record>
				<relationidx/>
				<relationtype/>
				<relationtype_nm/>
				<relation1/>
				<relation2/>
				<displayorder/>
			</record>
		</CURLIST_2>
	</dataSet>
</tn_bas_2101_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_bas_2101_l>
	<dataSet>
		<CURLIST_1>
			<record>
				<relationidx/>
				<relationtype/>
				<relationtype_nm/>
				<relation1/>
				<relation2/>
				<displayorder/>
			</record>
		</CURLIST_1>
	</dataSet>
</tn_bas_2101_l>
*/
%>

<% /* 작성시간 : Thu Jul 14 14:03:37 KST 2016 */ %>