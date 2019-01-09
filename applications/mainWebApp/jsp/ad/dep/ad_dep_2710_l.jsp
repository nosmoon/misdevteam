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
	AD_DEP_2710_LDataSet ds = (AD_DEP_2710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {  
		
		String gubun        = "";
		int tot_rcpm_amt    = 0;
		double avg_rcpm_amt = 0.0d;

		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_2710_LCURLISTRecord rec = (AD_DEP_2710_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
 			tot_rcpm_amt += StringUtil.toNumber(rec.rcpm_amt);
			
			if(i >0 && !gubun.equals(rec.gubun)){
				tot_rcpm_amt = StringUtil.toNumber(rec.rcpm_amt);
			}
			
			if(0 != StringUtil.toNumber(rec.pubc_amt)){
				avg_rcpm_amt = (StringUtil.toDouble(rec.rcpm_amt) / StringUtil.toDouble(rec.pubc_amt)) * 100;
			}
			
			rx.add(record, "gubun", rec.gubun);
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "pubc_amt", rec.pubc_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "tot_rcpm_amt", tot_rcpm_amt);
			rx.add(record, "avg_rcpm_amt", DigitUtil.cutUnderPoint(avg_rcpm_amt,1));
			rx.add(record, "lack_amt", rec.lack_amt);			
			
			gubun = rec.gubun;
		}
		
		int resForm = rx.add(resData, "resForm", "");
		
		rx.add(resForm, "rcpm_frdt", ds.rcpm_frdt);
		rx.add(resForm, "rcpm_todt", ds.rcpm_todt);
		
		
	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
