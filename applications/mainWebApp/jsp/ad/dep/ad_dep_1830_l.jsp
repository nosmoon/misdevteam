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
	AD_DEP_1830_LDataSet ds = (AD_DEP_1830_LDataSet)request.getAttribute("ds"); 
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	try {  
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_1830_LCURLISTRecord rec = (AD_DEP_1830_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");

			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "pubc_slip_no",rec.pubc_slip_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "pubc_tot_amt", rec.pubc_tot_amt);
			rx.add(record, "setoff_tot_pubc_amt", rec.setoff_tot_pubc_amt);
			rx.add(record, "fee_rate", rec.fee_rate);
			rx.add(record, "fee", rec.fee);
			rx.add(record, "igcymd", rec.igcymd);
		}

	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
