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
	AD_DEP_3510_LDataSet ds = (AD_DEP_3510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	try {  
		int gridData = rx.add(root, "gridData1", "");

		for(int i = 0; i<ds.curlist.size(); i++) {
			AD_DEP_3510_LCURLISTRecord rec = (AD_DEP_3510_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
															
			rx.add(record, "checked", "");
			rx.add(record, "pubc_dt", rec.pubc_dt); 
//			rx.add(record, "medi_nm", rec.medi_nm); 
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "pubc_tot_amt", rec.pubc_tot_amt);
			rx.add(record, "advt_size", rec.advt_size);
			rx.addCData(record, "advt_cont", rec.advt_cont);
			rx.add(record, "indt_clsf_nm", rec.indt_clsf_nm);
			rx.add(record, "ms_amt", rec.ms_amt);
			rx.add(record, "rcpm_tot_amt", rec.setoff_tot_pubc_amt);
			rx.add(record, "dlco_no", rec.dlco_no);
		}
	}
	catch (Exception e) {
		
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
