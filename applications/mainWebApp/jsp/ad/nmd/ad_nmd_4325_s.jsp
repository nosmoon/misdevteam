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
	AD_NMD_4325_SDataSet ds = (AD_NMD_4325_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add( root , "tempData" , "");		 
	
	try {  
		rx.add(tempData, "medi_cd", ds.medi_cd);
		rx.add(tempData, "hndl_clsf", ds.hndl_clsf);
		rx.add(tempData, "dlco_no", ds.dlco_no);
		rx.add(tempData, "dlco_nm", ds.dlco_nm);
		rx.add(tempData, "mtry_dt", ds.mtry_dt);
		rx.add(tempData, "precpt_amt_bal", ds.precpt_amt_bal);
		rx.add(tempData, "occr_amt", ds.occr_amt);
		rx.add(tempData, "proc_clsf", ds.proc_clsf);
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
