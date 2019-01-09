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
	AD_DEP_3310_LDataSet ds = (AD_DEP_3310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	try {  
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_3310_LCURLISTRecord rec = (AD_DEP_3310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");

			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "b_misu_amt", rec.b_misu_amt);
			rx.add(record, "pubc_amt", rec.pubc_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "misu_amt", rec.misu_amt);
			rx.add(record, "misu_rat1", "0".equals(rec.misu_rat1) ? "0.0" : DigitUtil.cutUnderPoint(rec.misu_rat1,2));
			rx.add(record, "misu_rat2", "0".equals(rec.misu_rat2) ? "0.0" : DigitUtil.cutUnderPoint(rec.misu_rat2,2));
			rx.add(record, "misu_rat3", "0".equals(rec.misu_rat3) ? "0.0" : DigitUtil.cutUnderPoint(rec.misu_rat3,2));
			rx.add(record, "kiil_avg1", "0".equals(rec.kiil_avg1) ? "0.0" : DigitUtil.cutUnderPoint(rec.kiil_avg1,2));
			rx.add(record, "kiil_avg2", "0".equals(rec.kiil_avg2) ? "0.0" : DigitUtil.cutUnderPoint(rec.kiil_avg2,2));
			rx.add(record, "kiil_avg3", "0".equals(rec.kiil_avg3) ? "0.0" : DigitUtil.cutUnderPoint(rec.kiil_avg3,2));
			rx.add(record, "dhon_amt", rec.dhon_amt);
			
		}
		
	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
