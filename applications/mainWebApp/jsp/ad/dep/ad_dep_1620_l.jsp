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
	AD_DEP_1620_LDataSet ds = (AD_DEP_1620_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData2 = rx.add(root, "resData2", "");
	int gridData = rx.add(resData2, "gridData", "");

	try {  
				
		long tot_misu_amt       = 0;
		long tot_sunsu_amt      = 0;
		
		for(int i = 0; i<ds.curlist.size(); i++) {
			AD_DEP_1620_LCURLISTRecord rec = (AD_DEP_1620_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.addCData(record, "dlco_nm", rec.dlco_nm.replaceAll("amp;",""));
			rx.add(record, "misu_amt", rec.misu_amt);
			rx.add(record, "precpt_amt_bal", rec.precpt_amt_bal);
			
			tot_misu_amt       += StringUtil.toLong(rec.misu_amt);
			tot_sunsu_amt      += StringUtil.toLong(rec.precpt_amt_bal);
		}	
		
		int resForm = rx.add(resData2, "resForm", "");
		
		rx.add(resForm, "tot_misu_amt", tot_misu_amt);
		rx.add(resForm, "tot_sunsu_amt", tot_sunsu_amt);
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
