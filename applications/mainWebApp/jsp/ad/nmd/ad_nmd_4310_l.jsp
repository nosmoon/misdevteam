<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.nmd.rec.*
	,	chosun.ciis.ad.nmd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_NMD_4310_LDataSet ds = (AD_NMD_4310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	try {  
	
		int gridData = rx.add( root , "gridData" , "");
		for(int i = 0; i<ds.curlist.size(); i++) {
			AD_NMD_4310_LCURLISTRecord rec = (AD_NMD_4310_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
			rx.add(record, "drbk_clsf", rec.payo_clsf); 
			rx.add(record, "proc_dt", rec.slip_occr_dt); 
			rx.add(record, "payo_slip_no", rec.payo_slip_no); 
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "hndl_clsf", rec.hndl_clsf);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "drbk_amt", rec.drbk_amt);
		}	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
