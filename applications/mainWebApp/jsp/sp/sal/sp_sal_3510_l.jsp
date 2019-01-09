<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_3510_LDataSet ds = (SP_SAL_3510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resForm   = rx.add(root, "resForm", "");
	
	
	try {
		/****** CURLIST BEGIN */
		int gridData1 = rx.add(resForm, "gridData1", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			SP_SAL_3510_LCURLISTRecord rec = (SP_SAL_3510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "suc_cnt", rec.suc_cnt);
			rx.add(record, "fal_cnt", rec.fal_cnt);
			rx.add(record, "tot_cnt", rec.tot_cnt);
			rx.add(record, "sale_amt", rec.sale_amt);
		}
		/****** CURLIST END */
		
		rx.add(resForm, "tot_cnt2", ds.tot_cnt);                                                       
		rx.add(resForm, "suc_cnt2", ds.suc_cnt);
		rx.add(resForm, "dlco_cnt2", ds.dlco_cnt);
		rx.add(resForm, "dmang_cnt2", ds.dmang_cnt);
		rx.add(resForm, "is_cnt2", ds.is_cnt);
		rx.add(resForm, "sale_amt2", ds.sale_amt);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
