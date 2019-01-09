<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
    RwXml rx = new RwXml();
	AD_PUB_1813_LDataSet ds = (AD_PUB_1813_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData 	= rx.add(root, "resData3", "");
	int gridData 	= rx.add(resData, "gridData3", "");

	try {
		long   tot_advt_fee     = 0;
		long   tot_vat          = 0;
		long   tot_misu_amt     = 0;
		long   tot_fee          = 0;
		double tot_pubc         = 0.00d;
				
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_1813_LCURLISTRecord rec = (AD_PUB_1813_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);
			rx.add(record, "pre_pubc_slip_no", rec.pre_pubc_slip_no);
			rx.add(record, "div_yn", rec.div_yn);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "agn_nm", rec.agn_nm);
			rx.add(record, "upd_advt_fee", rec.upd_advt_fee);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "icdc_fee", rec.icdc_fee);
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			rx.add(record, "mchrg_pers", rec.mchrg_pers);	
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
	
	
	
%>
