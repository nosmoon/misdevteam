<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.eis.rec.*
	,	chosun.ciis.ad.eis.ds.*;
	"
%>

<%
	String unit = StringUtil.nvl(request.getParameter("unit"));
	
	RwXml rx = new RwXml();
	AD_EIS_1420_LDataSet ds = (AD_EIS_1420_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData2", "");
	
	int g_unit_amt = 100000000;

	try {
		for(int i=0; i<ds.curlist.size(); i++){ 
			AD_EIS_1420_LCURLISTRecord rec = (AD_EIS_1420_LCURLISTRecord)ds.curlist.get(i);
			int record  = rx.add( gridData , "record" , "");
			
			long advt_fee		= StringUtil.toLong(rec.advt_fee);
			long pre_advt_fee	= StringUtil.toLong(rec.pre_advt_fee);
			long icdc_amt    	= StringUtil.toLong(rec.icdc_amt);
			
			if("G".equals(unit)) {
				advt_fee		/=	g_unit_amt;
				pre_advt_fee	/=	g_unit_amt;
				icdc_amt		/=	g_unit_amt;
			}
			
		    rx.add ( record, "no",    (i+1));   
			rx.add ( record, "indt_lcls_nm",  	rec.indt_lcls_nm); 
			rx.add ( record, "indt_lcls",  		rec.indt_lcls); 
			rx.add ( record, "advt_fee",   		advt_fee);  
			rx.add ( record, "pre_advt_fee",	pre_advt_fee);  
			rx.add ( record, "icdc_amt",   		icdc_amt);  
			rx.add ( record, "icdc_rate",   	DigitUtil.cutUnderPoint(rec.icdc_rate,0) + " %");  
		}	
	}
	catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>