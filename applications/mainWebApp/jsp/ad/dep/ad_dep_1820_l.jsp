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
	AD_DEP_1820_LDataSet ds = (AD_DEP_1820_LDataSet)request.getAttribute("ds"); 
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	try {  
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_1820_LCURLISTRecord rec = (AD_DEP_1820_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");

			rx.add(record, "pubc_yymm", rec.pubc_yymm);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "prvmm_unrcp_amt", rec.prvmm_unrcp_amt);
			rx.add(record, "pubc_amt", rec.pubc_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "unrcp_amt", rec.unrcp_amt);
			rx.add(record, "giil", DigitUtil.cutUnderPoint(rec.giil,1));
			rx.add(record, "note_tot_amt", rec.note_tot_amt);
			rx.add(record, "cash_deps_tot_amt", rec.cash_deps_tot_amt);
			rx.add(record, "avg_dds", rec.avg_dds);
			
		}
		
		
		int record = rx.add(gridData, "record", "");
		
		rx.add(record, "pubc_yymm", "합계");
		rx.add(record, "medi_nm", "");
		rx.add(record, "prvmm_unrcp_amt", ds.tot_prvmm_unrcp_amt);
		rx.add(record, "pubc_amt", ds.tot_pubc_amt);
		rx.add(record, "rcpm_amt", ds.tot_rcpm_amt);
		rx.add(record, "unrcp_amt", ds.tot_unrcp_amt);
		rx.add(record, "giil", StringUtil.toDouble(ds.avg_giil));

		//입금기간 
		int resForm = rx.add(resData, "resForm", "");
		
		rx.add(resForm, "frdt", ds.basi_dt);
		rx.add(resForm, "todt", ds.busn_dt);
	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
