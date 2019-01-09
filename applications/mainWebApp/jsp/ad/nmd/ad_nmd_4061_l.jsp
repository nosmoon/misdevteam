<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.nmd.rec.*
	,	chosun.ciis.ad.nmd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_NMD_4061_LDataSet ds = (AD_NMD_4061_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root,"resData","");
	int gridData = rx.add(resData, "gridData", ""); 
			
	try { 
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_NMD_4061_LCURLISTRecord rec = (AD_NMD_4061_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "make_dt", rec.make_dt);			
			rx.add(record, "stplt_time", rec.stplt_time);
			rx.add(record, "dd", rec.dd);
			rx.add(record, "cnt", rec.cnt);
			rx.add(record, "sale_amt", rec.sale_amt);			
			rx.add(record, "sub_amt", rec.sub_amt);
			rx.add(record, "lftvr_amt", rec.lftvr_amt);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

