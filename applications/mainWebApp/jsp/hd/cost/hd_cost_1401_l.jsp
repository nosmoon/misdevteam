<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.cost.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_COST_1401_LDataSet ds = (HD_COST_1401_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1		= 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
	
		
		
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		depth1 = rx.add(dataSet, "hd_use_type", "");
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_COST_1401_LCURLIST2Record rec = (HD_COST_1401_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(depth1, "item", "");
	//	     System.out.print(rec.cd);
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */
		
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_COST_1401_LCURLISTRecord rec = (HD_COST_1401_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", StringUtil.replaceToXml(rec.cmpy_cd));
			rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			rx.add(record, "deal_dt", StringUtil.replaceToXml(rec.deal_dt));
			rx.add(record, "use_plac", StringUtil.replaceToXml(rec.use_plac));
			rx.add(record, "deal_amt", StringUtil.replaceToXml(rec.deal_amt));
			rx.add(record, "remk_2", StringUtil.replaceToXml(rec.remk_2));
			rx.add(record, "card_no", StringUtil.replaceToXml(rec.card_no));
			rx.add(record, "occr_dt", StringUtil.replaceToXml(rec.occr_dt));
			rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			rx.add(record, "use_type", StringUtil.replaceToXml(rec.use_type));
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "dtls_medi_cd", rec.dtls_medi_cd);
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
<hd_cost_1401_l>
	<dataSet>
		<CURLIST2>
			<record>
				<cd_type/>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_cost_1401_l>
*/
%>


<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<emp_no/>
			<deal_dt/>
			<use_plac/>
			<deal_amt/>
			<remk_2/>
			<card_no/>
			<occr_dt/>
			<seq/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 21 11:55:39 KST 2009 */ %>