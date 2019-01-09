<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.tax.rec.*
	,	chosun.ciis.ad.tax.ds.*;
	"
%>

<%
	
	RwXml rx = new RwXml();
	AD_TAX_2010_LDataSet ds = (AD_TAX_2010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
	
		long total_amt = 0;
		for(int i=0; i<ds.curlist.size(); i++){  
			AD_TAX_2010_LCURLISTRecord rec = (AD_TAX_2010_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData, "record" , "");
			
			rx.add ( record, "rcpm_slip_no", rec.rcpm_slip_no );
			rx.add ( record, "medi_nm", rec.medi_nm );  
			rx.add ( record, "dlco_nm", rec.dlco_no+ " " +rec.dlco_nm );
			rx.add ( record, "agn_fee_pay_yn", rec.agn_fee_pay_yn );
			rx.add ( record, "amt", rec.amt );
			total_amt += StringUtil.toLong(rec.amt);
		}	
		
		rx.add ( resData, "total_amt", total_amt );
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>