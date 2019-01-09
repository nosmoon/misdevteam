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
	AD_DEP_4210_LDataSet ds = (AD_DEP_4210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");
	
	try {  

		for(int i = 0; i<ds.curlist.size(); i++) {
			AD_DEP_4210_LCURLISTRecord rec = (AD_DEP_4210_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "pk", rec.pk);
			rx.add(record, "prt_seq", rec.prt_seq);
			rx.add(record, "input_clsf", rec.input_clsf);
			if( "".equals(rec.prt_seq)){
				rx.add(record, "checked", "");
			}
			else{
				rx.add(record, "checked", "Y");
			}
			rx.add(record, "basi_dt", rec.basi_dt); 
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "unrcp_amt", rec.unrcp_amt);
			rx.add(record, "rcvnote_amt", rec.rcvnote_amt);
			rx.add(record, "precpt_amt", rec.precpt_amt);
			rx.add(record, "unrcp_fee", rec.unrcp_fee);
			rx.add(record, "impt_gurt_amt", rec.impt_gurt_amt);
		}
	}
	catch (Exception e) {
		
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
