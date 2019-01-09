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
	
	String ad_self = StringUtil.nvl(request.getParameter("ad_self"));
	
	RwXml rx = new RwXml();
	AD_EIS_1320_LDataSet ds = (AD_EIS_1320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData2 = rx.add(root, "resData2", "");
	int gridData = rx.add(resData2, "gridData", "");
	
	try {    
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_EIS_1320_LCURLISTRecord rec = (AD_EIS_1320_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");

			long    advt_fee	  	= 	StringUtil.toLong(rec.advt_fee);
			long	tot_pcnt		=	StringUtil.toLong(rec.tot_pcnt);
			long	bef_advt_fee	=	StringUtil.toLong(rec.bef_advt_fee);
			long	bef_advt_pcnt	=	StringUtil.toLong(rec.bef_tot_pcnt);
			
			if("Y".equals(ad_self)){
				advt_fee		+=	StringUtil.toLong(rec.self_advt_tot);
				bef_advt_fee	+=	StringUtil.toLong(rec.bef_self_advt_tot);
			}
			
			long 	inc_advt_fee  	= 	0;
			long 	inc_advt_pcnt 	= 	0;
			double 	inc_advt_avg  	= 	0.00d;
			double 	inc_advt_avg2 	= 	0.00d;
			  
			inc_advt_fee  = advt_fee	-	bef_advt_fee;
			inc_advt_pcnt = tot_pcnt	-	bef_advt_pcnt;
			inc_advt_avg  = ((double)advt_fee/(double)bef_advt_fee)*100-100;
			inc_advt_avg2 = ((double)tot_pcnt/(double)bef_advt_pcnt)*100-100;
			
			rx.add(record, "pubc_yy", rec.pubc_yy);
			rx.add(record, "advt_fee", advt_fee);
			rx.add(record, "tot_pcnt", rec.tot_pcnt);
			rx.add(record, "bef_advt_fee", bef_advt_fee);
			rx.add(record, "bef_tot_pcnt", rec.bef_tot_pcnt);
			rx.add(record, "inc_advt_fee", inc_advt_fee);
			rx.add(record, "inc_advt_avg", DigitUtil.cutUnderPoint(inc_advt_avg,0)+"%");
			rx.add(record, "inc_advt_pcnt", inc_advt_pcnt);
			rx.add(record, "inc_advt_avg2", DigitUtil.cutUnderPoint(inc_advt_avg2,0)+"%");
			
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
