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
	AD_PUB_2010_LDataSet ds = (AD_PUB_2010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_2010_LCURLISTRecord rec = (AD_PUB_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "indt_clsf_nm1", rec.indt_clsf_nm1);
			rx.add(record, "indt_clsf_nm2", rec.indt_clsf_nm2);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "agn", rec.agn);
			rx.add(record, "hndl_plac_cd", rec.hndl_plac_cd);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "sum_area", rec.sum_area);
			rx.add(record, "cnt", rec.cnt);
			rx.add(record, "min_dt", rec.min_dt);
			rx.add(record, "max_dt", rec.max_dt);

		}
		
		int resForm = rx.add(resData, "resForm", "");
		
		rx.add(resForm, "tot_adv_fee", ds.tot_adv_fee );
		rx.add(resForm, "tot_area", ds.tot_area );
		rx.add(resForm, "tot_cnt", ds.tot_cnt ) ; 
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
