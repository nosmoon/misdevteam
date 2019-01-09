<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_2610_LDataSet ds = (AD_DEP_2610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {  
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_2610_LCURLISTRecord rec = (AD_DEP_2610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "medi_cd", rec.medi_cd);  
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "medi_hndl_clsf", rec.medi_nm + rec.hndl_clsf_nm);
			rx.add(record, "hndl_clsf", rec.hndl_clsf);
			rx.add(record, "hndl_clsf_nm", rec.hndl_clsf_nm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "tot_fee", rec.tot_fee);
			rx.add(record, "dh", rec.dh);
			rx.add(record, "gjms_advt_fee", rec.gjms_advt_fee);
			rx.add(record, "gjms_vat", rec.gjms_vat);
			rx.add(record, "gjms_tot_fee", rec.gjms_tot_fee);
			rx.add(record, "mchrg_pers", rec.mchrg_pers);
			rx.add(record, "prdt_save_amt", Math.round(StringUtil.toNumber(rec.advt_fee) * 0.01));
			rx.add(record, "save_amt", rec.save_amt);

		}
		
	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
