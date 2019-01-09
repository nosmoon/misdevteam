<%@	page contentType="text/xml; charset=EUC-KR" %>


<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_1710_LDataSet ds = (AD_RES_1710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID; 

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_1710_LCURLISTRecord rec = (AD_RES_1710_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "ytot_cnt", rec.ytot_cnt);
			rx.add(record, "ytot_dn", StringUtil.toDouble(rec.ytot_dn));
			rx.add(record, "ytot_clr_dn", StringUtil.toDouble(rec.ytot_clr_dn));
			rx.add(record, "ytot_advt_fee", rec.ytot_advt_fee);
			rx.add(record, "gtot_cnt", rec.gtot_cnt);
			rx.add(record, "gtot_dn", StringUtil.toDouble(rec.gtot_dn));
			rx.add(record, "gtot_clr_dn", StringUtil.toDouble(rec.gtot_clr_dn));
			rx.add(record, "gtot_advt_fee", rec.gtot_advt_fee);		
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
